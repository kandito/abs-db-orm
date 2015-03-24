package ABS.FLI;
// abslang.abs:459:1: 
public abstract class FLIAnnotation extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isForeign() { return this instanceof FLIAnnotation_Foreign; }
    public final FLIAnnotation_Foreign toForeign() { return (FLIAnnotation_Foreign) this; }
}
