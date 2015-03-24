package Test;
// absorm.abs:4:1: 
public interface AbsDbOrm_i extends abs.backend.java.lib.types.ABSInterface {
    // absorm.abs:5:2: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<Test.Account_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // absorm.abs:5:2: 
    public  ABS.StdLib.List<Test.Account_i> findAll(abs.backend.java.lib.types.ABSString className);
    // absorm.abs:6:2: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<Test.Account_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // absorm.abs:6:2: 
    public  ABS.StdLib.List<Test.Account_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // absorm.abs:7:2: 
    public  abs.backend.java.lib.runtime.ABSFut<Test.Account_i> async_find(abs.backend.java.lib.types.ABSString className);
    // absorm.abs:7:2: 
    public  Test.Account_i find(abs.backend.java.lib.types.ABSString className);
    // absorm.abs:8:2: 
    public  abs.backend.java.lib.runtime.ABSFut<Test.Account_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // absorm.abs:8:2: 
    public  Test.Account_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // absorm.abs:9:2: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(Test.Account_i account);
    // absorm.abs:9:2: 
    public  abs.backend.java.lib.types.ABSUnit save(Test.Account_i account);
    // absorm.abs:10:2: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(Test.Account_i account);
    // absorm.abs:10:2: 
    public  abs.backend.java.lib.types.ABSUnit delete(Test.Account_i account);
    // absorm.abs:11:2: 
    public  abs.backend.java.lib.runtime.ABSFut<Test.Account_i> async_update(Test.Account_i account);
    // absorm.abs:11:2: 
    public  Test.Account_i update(Test.Account_i account);
    // absorm.abs:12:2: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // absorm.abs:12:2: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
    // absorm.abs:13:2: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_object_log(Test.Account_i account);
    // absorm.abs:13:2: 
    public  abs.backend.java.lib.types.ABSString object_log(Test.Account_i account);
}
