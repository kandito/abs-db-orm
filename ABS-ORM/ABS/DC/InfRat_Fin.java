package ABS.DC;
// abslang.abs:472:24: 
public final class InfRat_Fin extends InfRat {
    public final abs.backend.java.lib.types.ABSRational arg0;
    public abs.backend.java.lib.types.ABSRational getArg0() { return arg0; }
    public InfRat_Fin(final abs.backend.java.lib.types.ABSRational arg0) {
        this.arg0 = arg0;
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] { this.arg0 }; }
    public java.lang.String getConstructorName() { return "Fin";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof InfRat_Fin)) return abs.backend.java.lib.types.ABSBool.FALSE;
        InfRat_Fin other = (InfRat_Fin) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return abs.backend.java.lib.types.ABSBool.FALSE;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        return true;
    }
}
