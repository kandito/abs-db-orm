package ABS.StdLib;
// abslang.abs:12:1: 
public abstract class Result<A extends abs.backend.java.lib.types.ABSValue> extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isValue() { return this instanceof Result_Value; }
    public final Result_Value<A> toValue() { return (Result_Value) this; }
    public final boolean isError() { return this instanceof Result_Error; }
    public final Result_Error<A> toError() { return (Result_Error) this; }
}
