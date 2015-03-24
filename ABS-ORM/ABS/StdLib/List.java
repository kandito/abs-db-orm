package ABS.StdLib;
// abslang.abs:144:1: 
public abstract class List<A extends abs.backend.java.lib.types.ABSValue> extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isNil() { return this instanceof List_Nil; }
    public final List_Nil<A> toNil() { return (List_Nil) this; }
    public final boolean isCons() { return this instanceof List_Cons; }
    public final List_Cons<A> toCons() { return (List_Cons) this; }
}
