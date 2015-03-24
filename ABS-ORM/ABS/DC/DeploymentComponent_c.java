package ABS.DC;
// abslang.abs:494:1: 
public final class DeploymentComponent_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, ABS.DC.DeploymentComponent_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "description", "initconfig", "creationTime", "cpuhistory", "cpuhistorytotal", "bwhistory", "bwhistorytotal", "cpuconsumed", "bwconsumed", "initialized", "cpu", "cpunext", "bw", "bwnext" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    private abs.backend.java.lib.types.ABSString description;
    private ABS.StdLib.Map<ABS.DC.Resourcetype,abs.backend.java.lib.types.ABSRational> initconfig;
    // abslang.abs:498:5: 
    private ABS.StdLib.Time creationTime;
    // abslang.abs:501:5: 
    private ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> cpuhistory;
    // abslang.abs:502:5: 
    private ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> cpuhistorytotal;
    // abslang.abs:503:5: 
    private ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> bwhistory;
    // abslang.abs:504:5: 
    private ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> bwhistorytotal;
    // abslang.abs:506:5: 
    private abs.backend.java.lib.types.ABSRational cpuconsumed;
    // abslang.abs:507:5: 
    private abs.backend.java.lib.types.ABSRational bwconsumed;
    // abslang.abs:509:5: 
    private abs.backend.java.lib.types.ABSBool initialized;
    // abslang.abs:511:5: 
    private ABS.DC.InfRat cpu;
    // abslang.abs:513:5: 
    private ABS.DC.InfRat cpunext;
    // abslang.abs:514:5: 
    private ABS.DC.InfRat bw;
    // abslang.abs:516:5: 
    private ABS.DC.InfRat bwnext;
    public DeploymentComponent_c(abs.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,abs.backend.java.lib.types.ABSRational> initconfig) {
        this.description = description;
        this.initconfig = initconfig;
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.creationTime = ABS.StdLib.now_f.apply();this.cpuhistory = new ABS.StdLib.List_Nil();this.cpuhistorytotal = new ABS.StdLib.List_Nil();this.bwhistory = new ABS.StdLib.List_Nil();this.bwhistorytotal = new ABS.StdLib.List_Nil();this.cpuconsumed = abs.backend.java.lib.types.ABSInteger.fromString("0");this.bwconsumed = abs.backend.java.lib.types.ABSInteger.fromString("0");this.initialized = abs.backend.java.lib.types.ABSBool.FALSE;this.cpu = new abs.backend.java.lib.expr.Case() {
            public ABS.DC.InfRat of(final ABS.StdLib.Maybe<abs.backend.java.lib.types.ABSRational> __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.DC.InfRat execute() { return new ABS.DC.InfRat_InfRat(); }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new abs.backend.java.lib.expr.PatternVariable("v")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.DC.InfRat execute(final abs.backend.java.lib.types.ABSRational v) { return new ABS.DC.InfRat_Fin(v); }
                }.execute((abs.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:511:18:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(ABS.StdLib.lookup_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_CPU()));this.cpunext = DeploymentComponent_c.this.cpu;this.bw = new abs.backend.java.lib.expr.Case() {
            public ABS.DC.InfRat of(final ABS.StdLib.Maybe<abs.backend.java.lib.types.ABSRational> __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Nothing.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.DC.InfRat execute() { return new ABS.DC.InfRat_InfRat(); }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Maybe_Just.class,new abs.backend.java.lib.expr.PatternVariable("v")).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.DC.InfRat execute(final abs.backend.java.lib.types.ABSRational v) { return new ABS.DC.InfRat_Fin(v); }
                }.execute((abs.backend.java.lib.types.ABSRational) __ABS_binding1.getBinding(0));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:514:17:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(ABS.StdLib.lookup_f.apply(DeploymentComponent_c.this.initconfig, new ABS.DC.Resourcetype_Bandwidth()));this.bwnext = DeploymentComponent_c.this.bw; {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",517);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().newStackFrame(this,"init block");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",518);
            DeploymentComponent_c.this.initialized = abs.backend.java.lib.types.ABSBool.TRUE;
        }
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("description".equals(__ABS_fieldName)) return description;
        if ("initconfig".equals(__ABS_fieldName)) return initconfig;
        if ("creationTime".equals(__ABS_fieldName)) return creationTime;
        if ("cpuhistory".equals(__ABS_fieldName)) return cpuhistory;
        if ("cpuhistorytotal".equals(__ABS_fieldName)) return cpuhistorytotal;
        if ("bwhistory".equals(__ABS_fieldName)) return bwhistory;
        if ("bwhistorytotal".equals(__ABS_fieldName)) return bwhistorytotal;
        if ("cpuconsumed".equals(__ABS_fieldName)) return cpuconsumed;
        if ("bwconsumed".equals(__ABS_fieldName)) return bwconsumed;
        if ("initialized".equals(__ABS_fieldName)) return initialized;
        if ("cpu".equals(__ABS_fieldName)) return cpu;
        if ("cpunext".equals(__ABS_fieldName)) return cpunext;
        if ("bw".equals(__ABS_fieldName)) return bw;
        if ("bwnext".equals(__ABS_fieldName)) return bwnext;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "DeploymentComponent"; }
    public static final <T extends DeploymentComponent_c> T createNewCOG(abs.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,abs.backend.java.lib.types.ABSRational> initconfig) { return (T)DeploymentComponent_c.__ABS_createNewCOG(null, null, description, initconfig); }
    public static final <T extends DeploymentComponent_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy, abs.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,abs.backend.java.lib.types.ABSRational> initconfig) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(DeploymentComponent_c.class) : __ABS_runtime.createCOG(DeploymentComponent_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            DeploymentComponent_c __ABS_result = new DeploymentComponent_c(description, initconfig);
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends DeploymentComponent_c> T createNewObject(abs.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,abs.backend.java.lib.types.ABSRational> initconfig) { return (T)DeploymentComponent_c.__ABS_createNewObject(null, description, initconfig); }
    public static final <T extends DeploymentComponent_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.lib.types.ABSString description, ABS.StdLib.Map<ABS.DC.Resourcetype,abs.backend.java.lib.types.ABSRational> initconfig) {
        DeploymentComponent_c __ABS_result = new DeploymentComponent_c(description, initconfig);
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // abslang.abs:520:5: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.DC.InfRat> async_available(ABS.DC.Resourcetype rtype) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.Resourcetype arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.Resourcetype _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "available";
                }
                public Object execute() {
                    return target.available(arg0
                    );
                }
            }.init(rtype))
        ;
    }
    // abslang.abs:520:5: 
    public final ABS.DC.InfRat available(ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "available");
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",520);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",521);
            ABS.DC.InfRat result = new ABS.DC.InfRat_InfRat();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("result",result);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",522);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",526);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return result;
        }
    }
    // abslang.abs:528:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSRational> async_load(ABS.DC.Resourcetype rtype, abs.backend.java.lib.types.ABSInteger periods) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.Resourcetype arg0;
                abs.backend.java.lib.types.ABSInteger arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.Resourcetype _arg0,abs.backend.java.lib.types.ABSInteger _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "load";
                }
                public Object execute() {
                    return target.load(arg0
                    ,arg1
                    .truncate());
                }
            }.init(rtype, periods))
        ;
    }
    // abslang.abs:528:5: 
    public final abs.backend.java.lib.types.ABSRational load(ABS.DC.Resourcetype rtype, abs.backend.java.lib.types.ABSInteger periods) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "load");
            __ABS_currentTask.setLocalVariable("rtype",rtype);
            __ABS_currentTask.setLocalVariable("periods",periods);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",528);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",529);
            abs.backend.java.lib.types.ABSRational result = abs.backend.java.lib.types.ABSInteger.fromString("0");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("result",result);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",530);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",542);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return result;
        }
    }
    // abslang.abs:544:5: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.DC.InfRat> async_total(ABS.DC.Resourcetype rtype) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.Resourcetype arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.Resourcetype _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "total";
                }
                public Object execute() {
                    return target.total(arg0
                    );
                }
            }.init(rtype))
        ;
    }
    // abslang.abs:544:5: 
    public final ABS.DC.InfRat total(ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "total");
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",544);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",545);
            ABS.DC.InfRat result = new ABS.DC.InfRat_InfRat();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("result",result);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",546);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",550);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return result;
        }
    }
    // abslang.abs:556:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.DC.DeploymentComponent_i arg0;
                abs.backend.java.lib.types.ABSRational arg1;
                ABS.DC.Resourcetype arg2;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1,arg2});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.DC.DeploymentComponent_i _arg0,abs.backend.java.lib.types.ABSRational _arg1,ABS.DC.Resourcetype _arg2) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    arg2 = _arg2;
                    return this;
                }
                public java.lang.String methodName() {
                    return "transfer";
                }
                public Object execute() {
                    return target.transfer(arg0
                    ,arg1
                    ,arg2
                    );
                }
            }.init(target, amount, rtype))
        ;
    }
    // abslang.abs:556:5: 
    public final abs.backend.java.lib.types.ABSUnit transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "transfer");
            __ABS_currentTask.setLocalVariable("target",target);
            __ABS_currentTask.setLocalVariable("amount",amount);
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",556);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",557);
            decrementResources(amount, rtype);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",558);
            abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_i>(
                this,
                abs.backend.java.lib.runtime.ABSRuntime.checkForNull(target),
                new ABS.StdLib.Duration_InfDuration(),
                new ABS.StdLib.Duration_InfDuration(),
                abs.backend.java.lib.types.ABSBool.FALSE) {
                    abs.backend.java.lib.types.ABSRational arg0;
                    ABS.DC.Resourcetype arg1;
                    public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                        return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                            arg0,arg1});
                    }
                    public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSRational _arg0,ABS.DC.Resourcetype _arg1) {
                        arg0 = _arg0;
                        arg1 = _arg1;
                        return this;
                    }
                    public java.lang.String methodName() {
                        return "incrementResources";
                    }
                    public Object execute() {
                        return target.incrementResources(arg0
                        ,arg1
                        );
                    }
                }.init(amount, rtype))
            ;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",559);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abslang.abs:561:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_decrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSRational arg0;
                ABS.DC.Resourcetype arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSRational _arg0,ABS.DC.Resourcetype _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "decrementResources";
                }
                public Object execute() {
                    return target.decrementResources(arg0
                    ,arg1
                    );
                }
            }.init(amount, rtype))
        ;
    }
    // abslang.abs:561:5: 
    public final abs.backend.java.lib.types.ABSUnit decrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "decrementResources");
            __ABS_currentTask.setLocalVariable("amount",amount);
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",561);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",562);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",574);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // abslang.abs:575:5: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_incrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<ABS.DC.DeploymentComponent_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSRational arg0;
                ABS.DC.Resourcetype arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSRational _arg0,ABS.DC.Resourcetype _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "incrementResources";
                }
                public Object execute() {
                    return target.incrementResources(arg0
                    ,arg1
                    );
                }
            }.init(amount, rtype))
        ;
    }
    // abslang.abs:575:5: 
    public final abs.backend.java.lib.types.ABSUnit incrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "incrementResources");
            __ABS_currentTask.setLocalVariable("amount",amount);
            __ABS_currentTask.setLocalVariable("rtype",rtype);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",575);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",576);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("abs\\lang\\abslang.abs",586);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
}
