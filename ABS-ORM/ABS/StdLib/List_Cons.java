package ABS.StdLib;
// abslang.abs:144:22: 
public final class List_Cons<A extends abs.backend.java.lib.types.ABSValue> extends List<A> {
    public final A arg0;
    public A getArg0() { return arg0; }
    public final ABS.StdLib.List<A> arg1;
    public ABS.StdLib.List<A> getArg1() { return arg1; }
    public List_Cons(final A arg0, final ABS.StdLib.List<A> arg1) {
        this.arg0 = arg0;
        this.arg1 = arg1;
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] { this.arg0, this.arg1 }; }
    public java.lang.String getConstructorName() { return "Cons";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof List_Cons)) return abs.backend.java.lib.types.ABSBool.FALSE;
        List_Cons other = (List_Cons) o;
        if (!this.arg0.eq(other.arg0).toBoolean()) return abs.backend.java.lib.types.ABSBool.FALSE;
        if (!this.arg1.eq(other.arg1).toBoolean()) return abs.backend.java.lib.types.ABSBool.FALSE;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        if (!c.subpattern[0].match(this.arg0, b)) return false;
        if (!c.subpattern[1].match(this.arg1, b)) return false;
        return true;
    }
}
