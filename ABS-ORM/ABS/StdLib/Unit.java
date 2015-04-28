package ABS.StdLib;
// abslang.abs:6:1: 
public abstract class Unit extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isUnit() { return this instanceof Unit_Unit; }
    public final Unit_Unit toUnit() { return (Unit_Unit) this; }
}
