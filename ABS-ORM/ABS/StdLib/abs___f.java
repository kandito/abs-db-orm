package ABS.StdLib;
// abslang.abs:21:1: 
public final class abs___f implements abs.backend.java.lib.types.ABSFunction {
    private abs___f() { }
    public static abs.backend.java.lib.types.ABSRational apply(abs.backend.java.lib.types.ABSRational x) {
        return (x.gt(abs.backend.java.lib.types.ABSInteger.fromString("0")).toBoolean() ? x : x.negate());
    }
}
