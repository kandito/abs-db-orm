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
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",107);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().newStackFrame(this,"main block");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",109);
            Test.AccountDb_i absdborm = Test.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("absdborm",absdborm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",110);
            Test.Account_i account = Test.AccountImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("account",account);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",111);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(account).setFirstName(abs.backend.java.lib.types.ABSString.fromString("Kandito"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",112);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).save(account);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",114);
            Test.Account_i account2 = Test.AccountImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("account2",account2);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",115);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(account2).setFirstName(abs.backend.java.lib.types.ABSString.fromString("Agung"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",116);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(account2).setLastName(abs.backend.java.lib.types.ABSString.fromString("Wicaksono"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",117);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).save(account2);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",121);
            Test.Account_i akun1 = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).find(abs.backend.java.lib.types.ABSString.fromString("Test.AccountImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("akun1",akun1);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",122);
            abs.backend.java.lib.types.ABSString nama1 = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(akun1).getFirstName();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("nama1",nama1);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",123);
            if (abs.backend.java.lib.expr.BinOp.eq(akun1,null).toBoolean()) {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",123);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",124);
                    abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).log(abs.backend.java.lib.types.ABSString.fromString("Null"));
                }
            }
            else {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",125);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",126);
                    abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).log(nama1);
                }
            }
        }
        return abs.backend.java.lib.types.ABSUnit.UNIT;
    }
}
