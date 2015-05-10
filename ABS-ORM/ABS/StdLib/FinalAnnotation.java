package ABS.StdLib;
// abslang.abs:413:1: 
public abstract class FinalAnnotation extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isFinal() { return this instanceof FinalAnnotation_Final; }
    public final FinalAnnotation_Final toFinal() { return (FinalAnnotation_Final) this; }
}
