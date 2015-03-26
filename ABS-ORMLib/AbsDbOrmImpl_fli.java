package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import Test.AbsDbOrmImpl_c; 
import Test.AccountImpl_c; 

import java.util.List; 
import java.util.Iterator; 

public class AbsDbOrmImpl_fli extends AbsDbOrmImpl_c {	
	@Override
	public ABS.StdLib.List<Account_i> fli_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString condition) {
		this.select(className.getString(), condition.getString());
		return null;
	}
	
	@Override
	public ABS.StdLib.List<Account_i> fli_findAll(abs.backend.java.lib.types.ABSString className) {
		this.fli_findAllByAttributes(className, abs.backend.java.lib.types.ABSString.fromString(""));
		return null;
	}
	
	@Override
	public Account_i fli_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString condition) {
		try {
			Class c = Class.forName(className.getString());
			Object object = c.newInstance();
			
			AbsJavaReflection reflection = AbsJavaReflection.createReflection(object);
			ResultSet rs = this.select(object, condition.getString());
            if(rs.next()) {
                this.createObjectFromResult(rs, reflection);
            }

            if(object == null) {
                return null;
            } else {
                return (Account_i) object;
            }
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Account_i fli_find(abs.backend.java.lib.types.ABSString className) {
		return this.fli_findByAttributes(className, abs.backend.java.lib.types.ABSString.fromString(""));
	}
	
	@Override
	public abs.backend.java.lib.types.ABSUnit fli_save(Account_i account) {
		AbsJavaReflection reflection = AbsJavaReflection.createReflection(account);
		String className = reflection.getInterfaceName();
		Map<String, String> attributes = new HashMap<String, String>();
		
		for(Method m : reflection.getGetterMethod()) {
			String methodName = m.getName();
			String fieldName = this.createFieldName(methodName);
			
			String return_type = m.getReturnType().toString();
			
			String value = null;
			if(return_type.equals(AbsJavaReflection.ABSStringClassName) && (reflection.invokeMethod(m)) != null) {
				value = ((abs.backend.java.lib.types.ABSString)(reflection.invokeMethod(m))).getString();
			} else if(return_type.equals(AbsJavaReflection.ABSIntegerClassName) && (reflection.invokeMethod(m)) != null) {
				int int_value = ((abs.backend.java.lib.types.ABSInteger)(reflection.invokeMethod(m))).toInt();
				StringBuilder string = new StringBuilder();
				string.append("");
				string.append(int_value);
				value = string.toString();
			} else if(return_type.equals(AbsJavaReflection.ABSRationalClassName) && (reflection.invokeMethod(m)) != null) {
				int int_value = ((abs.backend.java.lib.types.ABSRational)(reflection.invokeMethod(m))).toInt();
				StringBuilder string = new StringBuilder();
				string.append("");
				string.append(int_value);
				value = string.toString();
			}
			
			if(value != null) {
				attributes.put(fieldName, value);
			}
		}
		
		AbsSqlCommandBuilder command = AbsSqlCommandBuilder.getCommandBuilder();
		String query = command.insert(className, attributes);
		//print insert query
		//System.out.println(query);
		AbsJdbcTransaction transaction = AbsJdbcTransaction.createTransaction();
		transaction.createUpdateStatement(query);
		return null;
	}
	
	@Override
	public abs.backend.java.lib.types.ABSUnit fli_delete(Account_i account) {
		return null;
	}
	
	@Override
	public Account_i fli_update(Account_i account) {
		return null;
	}
	
	@Override
	public abs.backend.java.lib.types.ABSString fli_log(abs.backend.java.lib.types.ABSString text) {
		System.out.println(text.getString());
		return abs.backend.java.lib.types.ABSString.fromString("Java String");
	}
	
	@Override
	public abs.backend.java.lib.types.ABSString fli_object_log(Account_i account) {
		AbsJavaReflection reflection = AbsJavaReflection.createReflection(account);
		for(Method m : reflection.getGetterMethod()) {
			System.out.println(m.getName());
		}
		
		for(Method m : reflection.getSetterMethod()) {
			System.out.println(m.getName());
		}
		return abs.backend.java.lib.types.ABSString.fromString("Java Object");
	}
	
	private ResultSet select(Object object, String condition) {
		AbsJavaReflection reflection = AbsJavaReflection.createReflection(object);
		String tableName = reflection.getInterfaceName();
		
		AbsSqlCommandBuilder command = AbsSqlCommandBuilder.getCommandBuilder();
		Map<String, String> conditionMap = null;
		if(!condition.equals("")) {
			conditionMap = this.createMapCondition(condition);
		}
		String query = command.select(tableName, conditionMap);
		//print select query
		//System.out.println(query);
		return AbsJdbcTransaction.createTransaction().createQueryStatement(query);
	}
	
	private String createFieldName(String methodName) {
		String methodNameWithoutPrefix = methodName.substring(3, methodName.length());
		return new StringBuilder().append(methodNameWithoutPrefix.substring(0,1).toLowerCase())
							.append(methodNameWithoutPrefix.substring(1,methodNameWithoutPrefix.length()))
							.toString();
	}
	
	private void createObjectFromResult(ResultSet result, AbsJavaReflection reflection) {
		try {
			if(result != null) {
				for(Method m : reflection.getSetterMethod()) {
					String methodName = m.getName();
					String fieldName = this.createFieldName(methodName);
					
					String return_type = m.getReturnType().toString();
					String value = result.getString(fieldName);
					String parameterType = reflection.getParameterType(m);
					if(parameterType.equals(AbsJavaReflection.ABSStringClassName)) {
						reflection.invokeMethod(m, (Object) abs.backend.java.lib.types.ABSString.fromString(value));
					} else if(parameterType.equals(AbsJavaReflection.ABSIntegerClassName)) {
						reflection.invokeMethod(m, (Object) abs.backend.java.lib.types.ABSInteger.fromString(value));
					} else if(parameterType.equals(AbsJavaReflection.ABSRationalClassName)) {
						reflection.invokeMethod(m, (Object) abs.backend.java.lib.types.ABSRational.fromString(value));
					}
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	private Map<String, String> createMapCondition(String condition) {
		Map<String, String> map = new HashMap<String, String>();
		
		for(String c : condition.split(",")) {
			String[] keyValue = c.split("=");
			map.put(keyValue[0], keyValue[1]);
		}
		return map;
	}
}

class AbsJdbcTransaction {
	private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String dbname = "abs_test";
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String username = "root";
    private static final String password = "";
	private Connection conn = null;
	
	private AbsJdbcTransaction() {}
	
	public static AbsJdbcTransaction createTransaction() {
		return new AbsJdbcTransaction();
	}
	
	public void createUpdateStatement(String query) {
		try {
            Class.forName(driver).newInstance();
            Connection conn = this.getConnection();
			Statement stat = conn.createStatement();
            stat.executeUpdate(query);
		} catch (Exception ex) {
            // handle the error
			ex.printStackTrace();
        }
	}
	
	public ResultSet createQueryStatement(String query) {
		try {
            Class.forName(AbsJdbcTransaction.driver).newInstance();
            Connection conn = this.getConnection();
			Statement stat = conn.createStatement();
            return stat.executeQuery(query);
		} catch (Exception ex) {
            // handle the error
			ex.printStackTrace();
        }
		return null;
	}
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
				AbsJdbcTransaction.url + AbsJdbcTransaction.dbname, 
				AbsJdbcTransaction.username, 
				AbsJdbcTransaction.password);
		} catch (Exception ex) {
			// handle the error
			ex.printStackTrace();
		}
		return null;
	}
}
	
class AbsJavaReflection {
    public static final String ABSStringClassName = "class abs.backend.java.lib.types.ABSString";
    public static final String ABSIntegerClassName = "class abs.backend.java.lib.types.ABSInteger";
    public static final String ABSRationalClassName = "class abs.backend.java.lib.types.ABSRational";
    public static final String ABSUnitClassName = "class abs.backend.java.lib.types.ABSUnit";

	private Object object;
	
	private AbsJavaReflection(Object object) {
		this.object = object;
	}
	
	public static AbsJavaReflection createReflection(Object object) {
		return new AbsJavaReflection(object);
	}
	
	public String getClassName() {
		Class<?> c = this.object.getClass();
		String className = c.getName();
		String[] name = className.split("\\.");
		return name[name.length - 1];
	}
	
	public String getInterfaceName() {
		Class<?> c = this.object.getClass();
		Class<?>[] interfaces = c.getInterfaces();
		String className = interfaces[1].getName();
		String[] name = className.split("\\.");
		return name[name.length - 1];
	}

	public List<Method> getGetterMethod() {
		List<Method> methodList = new ArrayList<Method>();
		try {
			Class<?> c = this.object.getClass();
			Method[] method = c.getMethods();
			
			for(Method m : method) {
				String method_name = ((Method) m).getName();
				String return_type = ((Method) m).getReturnType().toString();
	
				if(method_name.length() >= 3 && method_name.substring(0,3).equals("get")) {
					if(return_type.equals(AbsJavaReflection.ABSStringClassName)
					|| return_type.equals(AbsJavaReflection.ABSIntegerClassName)
					|| return_type.equals(AbsJavaReflection.ABSRationalClassName)) {
						methodList.add(m);
					}
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return methodList;
	}
	
	public List<Method> getSetterMethod() {
		List<Method> methodList = new ArrayList<Method>();
		try {
			Class<?> c = this.object.getClass();
			Method[] method = c.getMethods();
			
			for(Method m : method) {
				String method_name = ((Method) m).getName();
				String return_type = ((Method) m).getReturnType().toString();
	
				if(method_name.length() >= 3 && method_name.substring(0,3).equals("set")) {
					if(return_type.equals(AbsJavaReflection.ABSUnitClassName)) {
						methodList.add(m);
					}
				}
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return methodList;
	}
	
	public List<Method> getMethod() {
		List<Method> methodList = new ArrayList<Method>();
		try {
			Class<?> c = this.object.getClass();
			Method[] method = c.getMethods();
			
			for(Method m : method) {
				methodList.add(m);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return methodList;
	}
	
	public Object invokeMethod(Method method) {
		try {
			return ((Method) method).invoke(this.object);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public Object invokeMethod(Method method, Object param) {
		try {
			return ((Method) method).invoke(this.object, param);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
	
	public String getParameterType(Method method) {
		Class<?>[] parameterType  = method.getParameterTypes();
		return parameterType[0].toString();
	}
}

class AbsSqlCommandBuilder {
	private StringBuilder command;
	
	public AbsSqlCommandBuilder() {
		this.command = new StringBuilder();
	}
	
	public static AbsSqlCommandBuilder getCommandBuilder() {
		return new AbsSqlCommandBuilder();
	}
	
	public String insert(String table, Map<String, String> attributes) {
		StringBuilder valueString = new StringBuilder();
	
		this.command.append("INSERT INTO ");
		this.command.append(table);
		this.command.append("(");
		
		Iterator iterator = attributes.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			this.command.append(pair.getKey());
			
			//add valueString
			valueString.append("\"");
			valueString.append(pair.getValue());
			valueString.append("\"");
			
			if(iterator.hasNext()) {
				this.command.append(", ");
				valueString.append(", ");
			}
		}
		this.command.append(") ");
		this.command.append("VALUES(");
		this.command.append(valueString.toString());
		this.command.append(")");
		
		return this.command.toString();
	}
	
	public String select(String table, Map<String, String> condition) {
		this.command.append("SELECT * FROM ");
		this.command.append(table);
		if(condition != null) {
			this.command.append(" WHERE ");
			Iterator iterator = condition.entrySet().iterator();
			while(iterator.hasNext()) {
				Map.Entry pair = (Map.Entry) iterator.next();
				this.command.append(pair.getKey());
				this.command.append("=");
				this.command.append("\"");
				this.command.append(pair.getValue());
				this.command.append("\"");
				
				if(iterator.hasNext()) {
					this.command.append(" AND ");
				}
			}
		}
		return this.command.toString();
	}	
	
	public String delete(String table, String condition) {
		return this.command.toString();
	}
	
	public String update(String table, HashMap<String, String> attributes, String condition) {
		return this.command.toString();
	}
}