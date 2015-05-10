package ABS.Meta;
// abslang.abs:672:1: 
public interface Product_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:673:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getName();
    // abslang.abs:673:5: 
    public  abs.backend.java.lib.types.ABSString getName();
    // abslang.abs:674:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Set<abs.backend.java.lib.types.ABSString>> async_getFeatures();
    // abslang.abs:674:5: 
    public  ABS.StdLib.Set<abs.backend.java.lib.types.ABSString> getFeatures();
    // abslang.abs:675:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.Set<ABS.Meta.Product_i>> async_getConfigurableProducts();
    // abslang.abs:675:5: 
    public  ABS.StdLib.Set<ABS.Meta.Product_i> getConfigurableProducts();
    // abslang.abs:676:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.Meta.Reconfiguration_i> async_getReconfiguration(ABS.Meta.Product_i p);
    // abslang.abs:676:5: 
    public  ABS.Meta.Reconfiguration_i getReconfiguration(ABS.Meta.Product_i p);
}
