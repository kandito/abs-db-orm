package ABS.StdLib;
// abslang.abs:12:37: 
public final class s_f implements abs.backend.java.lib.types.ABSFunction {
    private s_f() { }
    public static <A extends abs.backend.java.lib.types.ABSValue>abs.backend.java.lib.types.ABSString apply(ABS.StdLib.Result<A> data) {
        return (new abs.backend.java.lib.expr.Case() {
            public abs.backend.java.lib.types.ABSString of(final ABS.StdLib.Result<A> data, final ABS.StdLib.Result<A> __ABS_value) {
                final abs.backend.java.lib.expr.PatternBinding __ABS_binding0 = new abs.backend.java.lib.expr.PatternConstructor(ABS.StdLib.Result_Error.class,new abs.backend.java.lib.expr.PatternVariable("res")).match(__ABS_value);
                if (__ABS_binding0 != null) return new Object() {
                    public abs.backend.java.lib.types.ABSString execute(final abs.backend.java.lib.types.ABSString res) { return res; }
                }.execute((abs.backend.java.lib.types.ABSString) __ABS_binding0.getBinding(0));
                throw new abs.backend.java.lib.expr.UnmatchedCaseException("abslang.abs:12:37:  value " + __ABS_value + " did not match any pattern.");
            }
        }.of(data, data));
    }
}
