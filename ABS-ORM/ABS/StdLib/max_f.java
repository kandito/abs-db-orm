package ABS.StdLib;
// abslang.abs:18:1: 
public final class max_f implements abs.backend.java.lib.types.ABSFunction {
    private max_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue>A apply(A a, A b) {
        return (a.gt(b).toBoolean() ? a : b);
    }
}
