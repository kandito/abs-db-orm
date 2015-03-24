package ABS.DC;
// abslang.abs:485:1: 
public interface DeploymentComponent_i extends abs.backend.java.lib.types.ABSInterface {
    // abslang.abs:486:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.DC.InfRat> async_available(ABS.DC.Resourcetype rtype);
    // abslang.abs:486:5: 
    public  ABS.DC.InfRat available(ABS.DC.Resourcetype rtype);
    // abslang.abs:487:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSRational> async_load(ABS.DC.Resourcetype rtype, abs.backend.java.lib.types.ABSInteger periods);
    // abslang.abs:487:5: 
    public  abs.backend.java.lib.types.ABSRational load(ABS.DC.Resourcetype rtype, abs.backend.java.lib.types.ABSInteger periods);
    // abslang.abs:488:5: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.DC.InfRat> async_total(ABS.DC.Resourcetype rtype);
    // abslang.abs:488:5: 
    public  ABS.DC.InfRat total(ABS.DC.Resourcetype rtype);
    // abslang.abs:489:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abslang.abs:489:5: 
    public  abs.backend.java.lib.types.ABSUnit transfer(ABS.DC.DeploymentComponent_i target, abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abslang.abs:490:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_decrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abslang.abs:490:5: 
    public  abs.backend.java.lib.types.ABSUnit decrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abslang.abs:491:5: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_incrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
    // abslang.abs:491:5: 
    public  abs.backend.java.lib.types.ABSUnit incrementResources(abs.backend.java.lib.types.ABSRational amount, ABS.DC.Resourcetype rtype);
}
