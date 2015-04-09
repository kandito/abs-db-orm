package ABS.StdLib;
// abslang.abs:375:1: 
public final class deadline_f implements abs.backend.java.lib.types.ABSFunction {
    private deadline_f() { }
    public static ABS.StdLib.Duration apply() {
        return (new abs.backend.java.lib.expr.Case() {
            public ABS.StdLib.Duration of(final abs.backend.java.lib.types.ABSBool __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Bool_True.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Duration execute() { return new ABS.StdLib.Duration_InfDuration(); }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Bool_False.class).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Duration execute() { return new ABS.StdLib.Duration_Duration(abs.backend.java.lib.runtime.ABSBuiltInFunctions.lowlevelDeadline()); }
                }.execute();
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:376:3:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(abs.backend.java.lib.runtime.ABSBuiltInFunctions.lowlevelDeadline().lt(abs.backend.java.lib.types.ABSInteger.fromString("0"))));
    }
}
