package Test;
// absorm.abs:61:1: 
public final class AccountImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, Test.Account_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "firstName", "lastName", "balance", "id" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    // absorm.abs:63:5: 
    private abs.backend.java.lib.types.ABSString firstName;
    // absorm.abs:64:5: 
    private abs.backend.java.lib.types.ABSString lastName;
    // absorm.abs:65:2: 
    private abs.backend.java.lib.types.ABSRational balance;
    // absorm.abs:66:5: 
    private abs.backend.java.lib.types.ABSInteger id;
    public AccountImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.firstName = abs.backend.java.lib.types.ABSString.fromString("");this.lastName = abs.backend.java.lib.types.ABSString.fromString("");this.balance = abs.backend.java.lib.types.ABSInteger.fromString("0");this.id = abs.backend.java.lib.types.ABSInteger.fromString("0");getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("firstName".equals(__ABS_fieldName)) return firstName;
        if ("lastName".equals(__ABS_fieldName)) return lastName;
        if ("balance".equals(__ABS_fieldName)) return balance;
        if ("id".equals(__ABS_fieldName)) return id;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "AccountImpl"; }
    public static final <T extends AccountImpl_c> T createNewCOG() { return (T)AccountImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends AccountImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(AccountImpl_c.class) : __ABS_runtime.createCOG(AccountImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            AccountImpl_c __ABS_result = new AccountImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends AccountImpl_c> T createNewObject() { return (T)AccountImpl_c.__ABS_createNewObject(null); }
    public static final <T extends AccountImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        AccountImpl_c __ABS_result = new AccountImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // absorm.abs:68:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setFirstName(abs.backend.java.lib.types.ABSString firstName) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setFirstName";
                }
                public Object execute() {
                    return target.setFirstName(arg0
                    );
                }
            }.init(firstName))
        ;
    }
    // absorm.abs:68:5: 
    public final abs.backend.java.lib.types.ABSUnit setFirstName(abs.backend.java.lib.types.ABSString firstName) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setFirstName");
            __ABS_currentTask.setLocalVariable("firstName",firstName);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",69);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",70);
            AccountImpl_c.this.firstName = firstName;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",71);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // absorm.abs:73:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getFirstName() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getFirstName";
                }
                public Object execute() {
                    return target.getFirstName();
                }
            }.init())
        ;
    }
    // absorm.abs:73:5: 
    public final abs.backend.java.lib.types.ABSString getFirstName() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getFirstName");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",74);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",75);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.firstName;
        }
    }
    // absorm.abs:78:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setLastName(abs.backend.java.lib.types.ABSString lastName) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setLastName";
                }
                public Object execute() {
                    return target.setLastName(arg0
                    );
                }
            }.init(lastName))
        ;
    }
    // absorm.abs:78:5: 
    public final abs.backend.java.lib.types.ABSUnit setLastName(abs.backend.java.lib.types.ABSString lastName) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setLastName");
            __ABS_currentTask.setLocalVariable("lastName",lastName);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",79);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",80);
            AccountImpl_c.this.lastName = lastName;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",81);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // absorm.abs:83:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getLastName() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getLastName";
                }
                public Object execute() {
                    return target.getLastName();
                }
            }.init())
        ;
    }
    // absorm.abs:83:5: 
    public final abs.backend.java.lib.types.ABSString getLastName() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getLastName");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",84);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",85);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.lastName;
        }
    }
    // absorm.abs:88:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setbalance(abs.backend.java.lib.types.ABSRational balance) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSRational arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSRational _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setbalance";
                }
                public Object execute() {
                    return target.setbalance(arg0
                    );
                }
            }.init(balance))
        ;
    }
    // absorm.abs:88:2: 
    public final abs.backend.java.lib.types.ABSUnit setbalance(abs.backend.java.lib.types.ABSRational balance) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setbalance");
            __ABS_currentTask.setLocalVariable("balance",balance);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",89);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",90);
            AccountImpl_c.this.balance = balance;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",91);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // absorm.abs:93:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSRational> async_getbalance() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getbalance";
                }
                public Object execute() {
                    return target.getbalance();
                }
            }.init())
        ;
    }
    // absorm.abs:93:5: 
    public final abs.backend.java.lib.types.ABSRational getbalance() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getbalance");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",94);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",95);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.balance;
        }
    }
    // absorm.abs:98:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setId(abs.backend.java.lib.types.ABSInteger id) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setId";
                }
                public Object execute() {
                    return target.setId(arg0
                    .truncate());
                }
            }.init(id))
        ;
    }
    // absorm.abs:98:5: 
    public final abs.backend.java.lib.types.ABSUnit setId(abs.backend.java.lib.types.ABSInteger id) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setId");
            __ABS_currentTask.setLocalVariable("id",id);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",99);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",100);
            AccountImpl_c.this.id = id;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",101);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // absorm.abs:103:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getId() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "getId";
                }
                public Object execute() {
                    return target.getId();
                }
            }.init())
        ;
    }
    // absorm.abs:103:5: 
    public final abs.backend.java.lib.types.ABSInteger getId() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getId");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",104);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",105);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.id;
        }
    }
}
