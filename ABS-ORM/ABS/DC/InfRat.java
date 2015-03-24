package ABS.DC;
// abslang.abs:472:1: 
public abstract class InfRat extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isInfRat() { return this instanceof InfRat_InfRat; }
    public final InfRat_InfRat toInfRat() { return (InfRat_InfRat) this; }
    public final boolean isFin() { return this instanceof InfRat_Fin; }
    public final InfRat_Fin toFin() { return (InfRat_Fin) this; }
}
