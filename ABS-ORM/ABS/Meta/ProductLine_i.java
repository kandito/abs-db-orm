package ABS.Meta;
// abslang.abs:662:1: 
public interface ProductLine_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:663:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Product_i> async_getCurrentProduct();
    // abslang.abs:663:5: 
    public  ABS.Meta.Product_i getCurrentProduct();
    // abslang.abs:664:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getProduct(abs.backend.java.lib.types.ABSString s);
    // abslang.abs:664:5: 
    public  abs.backend.java.lib.types.ABSString getProduct(abs.backend.java.lib.types.ABSString s);
    // abslang.abs:665:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_reconfigure(ABS.Meta.Product_i p);
    // abslang.abs:665:5: 
    public  abs.backend.java.lib.types.ABSUnit reconfigure(ABS.Meta.Product_i p);
    // abslang.abs:666:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_addProduct(ABS.Meta.Product_i p);
    // abslang.abs:666:5: 
    public  abs.backend.java.lib.types.ABSUnit addProduct(ABS.Meta.Product_i p);
    // abslang.abs:667:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_removeProduct(ABS.Meta.Product_i p);
    // abslang.abs:667:5: 
    public  abs.backend.java.lib.types.ABSUnit removeProduct(ABS.Meta.Product_i p);
    // abslang.abs:668:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_addReconfiguration(ABS.Meta.Reconfiguration_i r);
    // abslang.abs:668:5: 
    public  abs.backend.java.lib.types.ABSUnit addReconfiguration(ABS.Meta.Reconfiguration_i r);
    // abslang.abs:669:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_removeReconfiguration(ABS.Meta.Reconfiguration_i r);
    // abslang.abs:669:5: 
    public  abs.backend.java.lib.types.ABSUnit removeReconfiguration(ABS.Meta.Reconfiguration_i r);
}
