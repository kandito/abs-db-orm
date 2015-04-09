package ABS.Meta;
// abslang.abs:651:1: 
public interface Class_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:652:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getName();
    // abslang.abs:652:5: 
    public  abs.backend.java.lib.types.ABSString getName();
    // abslang.abs:653:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Method_i> async_getMethod(abs.backend.java.lib.types.ABSString mName);
    // abslang.abs:653:5: 
    public  ABS.Meta.Method_i getMethod(abs.backend.java.lib.types.ABSString mName);
    // abslang.abs:654:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_addMethod(abs.backend.java.lib.types.ABSString mName, ABS.Meta.Method_i m);
    // abslang.abs:654:5: 
    public  abs.backend.java.lib.types.ABSUnit addMethod(abs.backend.java.lib.types.ABSString mName, ABS.Meta.Method_i m);
    // abslang.abs:655:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_removeMethod(abs.backend.java.lib.types.ABSString mName);
    // abslang.abs:655:5: 
    public  abs.backend.java.lib.types.ABSUnit removeMethod(abs.backend.java.lib.types.ABSString mName);
}
