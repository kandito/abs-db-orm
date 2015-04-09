package Test;
public class Main extends abs.backend.java.lib.runtime.ABSObject {
    public static void main(java.lang.String[] args) throws Exception {
        abs.backend.java.lib.runtime.StartUp.startup(args,Main.class);
    }
    public java.lang.String getClassName() { return "Main"; }
    public java.util.List<java.lang.String> getFieldNames() { return java.util.Collections.EMPTY_LIST; }
    public Main(abs.backend.java.lib.runtime.COG cog) { super(cog); }
    public abs.backend.java.lib.types.ABSUnit run() {
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",109);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().newStackFrame(this,"main block");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",111);
            Test.AbsDbOrm_i absdborm = Test.AbsDbOrmImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("absdborm",absdborm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",112);
            Test.Account_i account = Test.AccountImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("account",account);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",113);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(account).setFirstName(abs.backend.java.lib.types.ABSString.fromString("Kandito"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",116);
            Test.Account_i account2 = Test.AccountImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("account2",account2);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",117);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(account2).setFirstName(abs.backend.java.lib.types.ABSString.fromString("Agung"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",118);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(account2).setLastName(abs.backend.java.lib.types.ABSString.fromString("Wicaksono"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",143);
            ABS.StdLib.List<Test.Account_i> list = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).findAll(abs.backend.java.lib.types.ABSString.fromString("Test.AccountImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("list",list);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",144);
            abs.backend.java.lib.types.ABSInteger index = abs.backend.java.lib.types.ABSInteger.fromString("0");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index",index);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",145);
            while (index.lt(ABS.StdLib.length_f.apply(list)).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",145);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",146);
                Test.Account_i a = ABS.StdLib.nth_f.apply(list, index);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("a",a);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",147);
                abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).getFirstName();
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",148);
                abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).log(name);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",149);
                index = index.add(abs.backend.java.lib.types.ABSInteger.fromString("1"));
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index", index);}
        }
        return abs.backend.java.lib.types.ABSUnit.UNIT;
    }
}
