package ABS.StdLib;
// abslang.abs:351:1: 
public final class timeLessThan_f implements abs.backend.java.lib.types.ABSFunction {
    private timeLessThan_f() { }
    public static abs.backend.java.lib.types.ABSBool apply(ABS.StdLib.Time t1, ABS.StdLib.Time t2) {
        return (ABS.StdLib.timeValue_f.apply(t1).lt(ABS.StdLib.timeValue_f.apply(t2)));
    }
}
