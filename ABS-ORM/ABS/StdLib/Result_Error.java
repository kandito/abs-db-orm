package ABS.StdLib;
// abslang.abs:12:31: 
public final class Result_Error<A extends abs.backend.java.lib.types.ABSValue> extends Result<A> {
    public final abs.backend.java.lib.types.ABSString arg0;
    public abs.backend.java.lib.types.ABSString getArg0() { return arg0; }
    public Result_Error(final abs.backend.java.lib.types.ABSString arg0) {
        this.arg0 = arg0;
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Error";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Result_Error)) return abs.backend.java.lib.types.ABSBool.FALSE;
        Result_Error other = (Result_Error) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return abs.backend.java.lib.types.ABSBool.FALSE;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
