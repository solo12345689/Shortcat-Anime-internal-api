package Gf;

import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class f1 extends Lf.A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal f7574e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public f1(Zd.i iVar, Zd.e eVar) {
        g1 g1Var = g1.f7578a;
        super(iVar.l(g1Var) == null ? iVar.w(g1Var) : iVar, eVar);
        this.f7574e = new ThreadLocal();
        if (eVar.getContext().l(Zd.f.f23273S) instanceof K) {
            return;
        }
        Object objI = Lf.L.i(iVar, null);
        Lf.L.f(iVar, objI);
        X0(iVar, objI);
    }

    private final void W0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f7574e.get();
            if (pair != null) {
                Lf.L.f((Zd.i) pair.getFirst(), pair.getSecond());
            }
            this.f7574e.remove();
        }
    }

    @Override // Lf.A, Gf.AbstractC1597a
    protected void Q0(Object obj) {
        W0();
        Object objA = E.a(obj, this.f11545d);
        Zd.e eVar = this.f11545d;
        Zd.i context = eVar.getContext();
        Object objI = Lf.L.i(context, null);
        f1 f1VarM = objI != Lf.L.f11553a ? I.m(eVar, context, objI) : null;
        try {
            this.f11545d.resumeWith(objA);
            Td.L l10 = Td.L.f17438a;
            if (f1VarM == null || f1VarM.V0()) {
                Lf.L.f(context, objI);
            }
        } catch (Throwable th2) {
            if (f1VarM == null || f1VarM.V0()) {
                Lf.L.f(context, objI);
            }
            throw th2;
        }
    }

    @Override // Lf.A
    public void U0() {
        W0();
    }

    public final boolean V0() {
        boolean z10 = this.threadLocalIsSet && this.f7574e.get() == null;
        this.f7574e.remove();
        return !z10;
    }

    public final void X0(Zd.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f7574e.set(Td.z.a(iVar, obj));
    }
}
