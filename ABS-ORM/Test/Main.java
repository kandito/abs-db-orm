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
            Test.AccountDb_i absdborm = Test.AccountDbImpl_c.__ABS_createNewObject(this);
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
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",131);
            Test.Account_i akun2 = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("Test.AccountImpl_c"), abs.backend.java.lib.types.ABSString.fromString("id=4"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("akun2",akun2);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",132);
            abs.backend.java.lib.types.ABSString nama2 = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(akun2).getFirstName();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("nama2",nama2);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",133);
            if (abs.backend.java.lib.expr.BinOp.eq(akun2,null).toBoolean()) {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",133);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",134);
                    abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).log(abs.backend.java.lib.types.ABSString.fromString("Null"));
                }
            }
            else {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",135);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",136);
                    abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).log(nama2);
                }
            }
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",142);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(absdborm).delete(akun2);
        }
        return abs.backend.java.lib.types.ABSUnit.UNIT;
    }
}
