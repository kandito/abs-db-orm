package ABS.DC;
// abslang.abs:472:28: 
public final class finvalue_f implements abs.backend.java.lib.types.ABSFunction {
    private finvalue_f() { }
    public static abs.backend.java.lib.types.ABSRational apply(ABS.DC.InfRat data) {
        return (new abs.backend.java.lib.expr.Case() {
            public abs.backend.java.lib.types.ABSRational of(final ABS.DC.InfRat data, final ABS.DC.InfRat __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.DC.InfRat_Fin.class,new abs.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public abs.backend.java.lib.types.ABSRational execute(final abs.backend.java.lib.types.ABSRational res) { return res; }
                }.execute((abs.backend.java.lib.types.ABSRational) __ABS_binding0.getBinding(0));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:472:28:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
