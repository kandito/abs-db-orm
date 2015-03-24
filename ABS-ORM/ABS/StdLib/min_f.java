package ABS.StdLib;
// abslang.abs:19:1: 
public final class min_f implements abs.backend.java.lib.types.ABSFunction {
    private min_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue>A apply(A a, A b) {
        return (a.lt(b).toBoolean() ? a : b);
    }
}
