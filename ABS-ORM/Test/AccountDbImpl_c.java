package Test;
// absorm.abs:16:1: 
public class AccountDbImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, Test.AccountDb_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public AccountDbImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "AccountDbImpl"; }
    public static final <T extends AccountDbImpl_c> T createNewCOG() { return (T)AccountDbImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends AccountDbImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(AccountDbImpl_c.class) : __ABS_runtime.createCOG(AccountDbImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            AccountDbImpl_c __ABS_result = (AccountDbImpl_c) __ABS_runtime.getForeignObject
            ("Test.AccountDbImpl");
            if (__ABS_result == null) __ABS_result = new AccountDbImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends AccountDbImpl_c> T createNewObject() { return (T)AccountDbImpl_c.__ABS_createNewObject(null); }
    public static final <T extends AccountDbImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        AccountDbImpl_c __ABS_result = (AccountDbImpl_c) abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().getForeignObject
        ("Test.AccountDbImpl");
        if (__ABS_result == null) __ABS_result = new AccountDbImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // absorm.abs:18:2: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<Test.Account_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSString arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSString _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "findAllByAttributes";
                }
                public Object execute() {
                    return target.findAllByAttributes(arg0
                    ,arg1
                    );
                }
            }.init(className, query))
        ;
    }
    // absorm.abs:18:2: 
    public final ABS.StdLib.List<Test.Account_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        return this.fli_findAllByAttributes(className, query);
    }
    // absorm.abs:18:2: 
    public  ABS.StdLib.List<Test.Account_i> fli_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "findAllByAttributes");
            __ABS_currentTask.setLocalVariable("className",className);
            __ABS_currentTask.setLocalVariable("query",query);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",18);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",19);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.List_Nil();
        }
    }
    // absorm.abs:21:2: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<Test.Account_i>> async_findAll(abs.backend.java.lib.types.ABSString className) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
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
                    return "findAll";
                }
                public Object execute() {
                    return target.findAll(arg0
                    );
                }
            }.init(className))
        ;
    }
    // absorm.abs:21:2: 
    public final ABS.StdLib.List<Test.Account_i> findAll(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        return this.fli_findAll(className);
    }
    // absorm.abs:21:2: 
    public  ABS.StdLib.List<Test.Account_i> fli_findAll(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "findAll");
            __ABS_currentTask.setLocalVariable("className",className);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",21);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",22);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return new ABS.StdLib.List_Nil();
        }
    }
    // absorm.abs:24:2: 
    public final abs.backend.java.lib.runtime.ABSFut<Test.Account_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSString arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSString _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "findByAttributes";
                }
                public Object execute() {
                    return target.findByAttributes(arg0
                    ,arg1
                    );
                }
            }.init(className, query))
        ;
    }
    // absorm.abs:24:2: 
    public final Test.Account_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        return this.fli_findByAttributes(className, query);
    }
    // absorm.abs:24:2: 
    public  Test.Account_i fli_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "findByAttributes");
            __ABS_currentTask.setLocalVariable("className",className);
            __ABS_currentTask.setLocalVariable("query",query);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",24);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",25);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return Test.AccountImpl_c.__ABS_createNewObject(this);
        }
    }
    // absorm.abs:27:2: 
    public final abs.backend.java.lib.runtime.ABSFut<Test.Account_i> async_find(abs.backend.java.lib.types.ABSString className) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
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
                    return "find";
                }
                public Object execute() {
                    return target.find(arg0
                    );
                }
            }.init(className))
        ;
    }
    // absorm.abs:27:2: 
    public final Test.Account_i find(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        return this.fli_find(className);
    }
    // absorm.abs:27:2: 
    public  Test.Account_i fli_find(abs.backend.java.lib.types.ABSString className) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "find");
            __ABS_currentTask.setLocalVariable("className",className);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",27);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",28);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return Test.AccountImpl_c.__ABS_createNewObject(this);
        }
    }
    // absorm.abs:30:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(Test.Account_i account) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                Test.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(Test.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "save";
                }
                public Object execute() {
                    return target.save(arg0
                    );
                }
            }.init(account))
        ;
    }
    // absorm.abs:30:2: 
    public final abs.backend.java.lib.types.ABSUnit save(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        return this.fli_save(account);
    }
    // absorm.abs:30:2: 
    public  abs.backend.java.lib.types.ABSUnit fli_save(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "save");
            __ABS_currentTask.setLocalVariable("account",account);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",30);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",32);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // absorm.abs:33:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(Test.Account_i account) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                Test.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(Test.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "delete";
                }
                public Object execute() {
                    return target.delete(arg0
                    );
                }
            }.init(account))
        ;
    }
    // absorm.abs:33:2: 
    public final abs.backend.java.lib.types.ABSUnit delete(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        return this.fli_delete(account);
    }
    // absorm.abs:33:2: 
    public  abs.backend.java.lib.types.ABSUnit fli_delete(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("account",account);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",33);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",35);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // absorm.abs:36:2: 
    public final abs.backend.java.lib.runtime.ABSFut<Test.Account_i> async_update(Test.Account_i account) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                Test.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(Test.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "update";
                }
                public Object execute() {
                    return target.update(arg0
                    );
                }
            }.init(account))
        ;
    }
    // absorm.abs:36:2: 
    public final Test.Account_i update(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        return this.fli_update(account);
    }
    // absorm.abs:36:2: 
    public  Test.Account_i fli_update(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("account",account);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",36);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",37);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return Test.AccountImpl_c.__ABS_createNewObject(this);
        }
    }
    // absorm.abs:39:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
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
                    return "log";
                }
                public Object execute() {
                    return target.log(arg0
                    );
                }
            }.init(log))
        ;
    }
    // absorm.abs:39:2: 
    public final abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log) {
        __ABS_checkSameCOG(); 
        return this.fli_log(log);
    }
    // absorm.abs:39:2: 
    public  abs.backend.java.lib.types.ABSString fli_log(abs.backend.java.lib.types.ABSString log) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "log");
            __ABS_currentTask.setLocalVariable("log",log);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",39);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",40);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSString.fromString("return log");
        }
    }
    // absorm.abs:42:2: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_object_log(Test.Account_i account) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<Test.AccountDbImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                Test.Account_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(Test.Account_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "object_log";
                }
                public Object execute() {
                    return target.object_log(arg0
                    );
                }
            }.init(account))
        ;
    }
    // absorm.abs:42:2: 
    public final abs.backend.java.lib.types.ABSString object_log(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        return this.fli_object_log(account);
    }
    // absorm.abs:42:2: 
    public  abs.backend.java.lib.types.ABSString fli_object_log(Test.Account_i account) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "object_log");
            __ABS_currentTask.setLocalVariable("account",account);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",42);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("absorm.abs",43);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSString.fromString("return log");
        }
    }
}
