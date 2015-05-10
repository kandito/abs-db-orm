package ABS.Meta;
// abslang.abs:679:1: 
public interface Reconfiguration_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:680:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getName();
    // abslang.abs:680:5: 
    public  abs.backend.java.lib.types.ABSString getName();
    // abslang.abs:681:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getCurrentProduct();
    // abslang.abs:681:5: 
    public  ABS.Meta.Product_i getCurrentProduct();
    // abslang.abs:682:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setCurrentProduct(ABS.Meta.Product_i p);
    // abslang.abs:682:5: 
    public  abs.backend.java.lib.types.ABSUnit setCurrentProduct(ABS.Meta.Product_i p);
    // abslang.abs:683:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getTargetProduct();
    // abslang.abs:683:5: 
    public  ABS.Meta.Product_i getTargetProduct();
    // abslang.abs:684:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setTargetProduct(ABS.Meta.Product_i p);
    // abslang.abs:684:5: 
    public  abs.backend.java.lib.types.ABSUnit setTargetProduct(ABS.Meta.Product_i p);
    // abslang.abs:685:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<ABS.Meta.Delta_i>> async_getDeltas();
    // abslang.abs:685:5: 
    public  ABS.StdLib.List<ABS.Meta.Delta_i> getDeltas();
    // abslang.abs:686:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setDeltas(ABS.StdLib.List<ABS.Meta.Delta_i> deltas);
    // abslang.abs:686:5: 
    public  abs.backend.java.lib.types.ABSUnit setDeltas(ABS.StdLib.List<ABS.Meta.Delta_i> deltas);
    // abslang.abs:687:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.StateUpdate_i> async_getStateUpdate();
    // abslang.abs:687:5: 
    public  ABS.Meta.StateUpdate_i getStateUpdate();
    // abslang.abs:688:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setStateUpdate(ABS.Meta.StateUpdate_i u);
    // abslang.abs:688:5: 
    public  abs.backend.java.lib.types.ABSUnit setStateUpdate(ABS.Meta.StateUpdate_i u);
}
