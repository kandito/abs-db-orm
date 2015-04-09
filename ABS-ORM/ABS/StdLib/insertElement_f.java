package ABS.StdLib;
// abslang.abs:107:1: 
public final class insertElement_f implements abs.backend.java.lib.types.ABSFunction {
    private insertElement_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue>ABS.StdLib.Set<A> apply(ABS.StdLib.Set<A> xs, A e) {
        return (new abs.backend.java.lib.expr.Case() {
            public ABS.StdLib.Set<A> of(final A e, final ABS.StdLib.Set<A> xs, final ABS.StdLib.Set<A> __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_EmptySet.class).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return new ABS.StdLib.Set_Insert(e, new ABS.StdLib.Set_EmptySet()); }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding1 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new abs.backend.java.lib.expr.PatternValue(e),new abs.backend.java.lib.expr.AnyPattern()).match(__ABS_value);
                if (__ABS_binding1 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute() { return xs; }
                }.execute();
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding2 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Set_Insert.class,new abs.backend.java.lib.expr.PatternVariable("x"),new abs.backend.java.lib.expr.PatternVariable("ss")).match(__ABS_value);
                if (__ABS_binding2 != null) return new Object() {
                    public ABS.StdLib.Set<A> execute(final A x, final ABS.StdLib.Set<A> ss) { return e.lt(x).toBoolean() ? new ABS.StdLib.Set_Insert(e, xs) : new ABS.StdLib.Set_Insert(x, ABS.StdLib.insertElement_f.apply(ss, e)); }
                }.execute((A) __ABS_binding2.getBinding(0),(ABS.StdLib.Set<A>) __ABS_binding2.getBinding(1));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:108:3:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(e, xs, xs));
    }
}
