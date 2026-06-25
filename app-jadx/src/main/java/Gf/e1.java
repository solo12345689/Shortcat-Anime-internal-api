package Gf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class e1 extends K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f7570c = new e1();

    private e1() {
    }

    @Override // Gf.K
    public void D1(Zd.i iVar, Runnable runnable) {
        i1 i1Var = (i1) iVar.l(i1.f7581c);
        if (i1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        i1Var.f7582b = true;
    }

    @Override // Gf.K
    public boolean S1(Zd.i iVar) {
        return false;
    }

    @Override // Gf.K
    public K Z1(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Gf.K
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
