package ABS.DC;
// abslang.abs:470:1: 
public abstract class Resourcetype extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isCPU() { return this instanceof Resourcetype_CPU; }
    public final Resourcetype_CPU toCPU() { return (Resourcetype_CPU) this; }
    public final boolean isBandwidth() { return this instanceof Resourcetype_Bandwidth; }
    public final Resourcetype_Bandwidth toBandwidth() { return (Resourcetype_Bandwidth) this; }
}
