package ABS.DC;
// abslang.abs:481:1: 
public final class averageDivsN_f implements abs.backend.java.lib.types.ABSFunction {
    private averageDivsN_f() { }
    public static abs.backend.java.lib.types.ABSRational apply(ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> consumeds, ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> totals, abs.backend.java.lib.types.ABSInteger length) {
        return (new abs.backend.java.lib.expr.Let() { public abs.backend.java.lib.types.ABSRational in(final ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> consumeds, final ABS.StdLib.List<abs.backend.java.lib.types.ABSInteger> totals, final abs.backend.java.lib.types.ABSInteger mins) { return ABS.DC.sumDivsN_f.apply(consumeds, totals, mins).divide(mins); }}.in(consumeds, totals, ABS.StdLib.min_f.apply(length, ABS.StdLib.min_f.apply(ABS.StdLib.length_f.apply(consumeds), ABS.StdLib.length_f.apply(totals)))));
    }
}
