package ABS.StdLib;
// abslang.abs:343:1: 
public abstract class Time extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isTime() { return this instanceof Time_Time; }
    public final Time_Time toTime() { return (Time_Time) this; }
}
