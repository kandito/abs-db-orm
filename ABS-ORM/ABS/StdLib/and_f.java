package ABS.StdLib;
// abslang.abs:15:1: 
public final class and_f implements abs.backend.java.lib.types.ABSFunction {
    private and_f() { }
    public static abs.backend.java.lib.types.ABSBool apply(abs.backend.java.lib.types.ABSBool a, abs.backend.java.lib.types.ABSBool b) {
        return (a.and(b));
    }
}
