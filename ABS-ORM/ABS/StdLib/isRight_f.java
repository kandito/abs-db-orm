package ABS.StdLib;
// abslang.abs:44:1: 
public final class isRight_f implements abs.backend.java.lib.types.ABSFunction {
    private isRight_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue,B extends abs.backend.java.lib.types.ABSValue>abs.backend.java.lib.types.ABSBool apply(ABS.StdLib.Either<A,B> val) {
        return (ABS.StdLib.isLeft_f.apply(val).negate());
    }
}
