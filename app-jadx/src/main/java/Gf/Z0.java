package Gf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class Z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z0 f7544a = new Z0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f7545b = Lf.M.a(new Lf.E("ThreadLocalEventLoop"));

    private Z0() {
    }

    public final AbstractC1620l0 a() {
        return (AbstractC1620l0) f7545b.get();
    }

    public final AbstractC1620l0 b() {
        ThreadLocal threadLocal = f7545b;
        AbstractC1620l0 abstractC1620l0 = (AbstractC1620l0) threadLocal.get();
        if (abstractC1620l0 != null) {
            return abstractC1620l0;
        }
        AbstractC1620l0 abstractC1620l0A = AbstractC1626o0.a();
        threadLocal.set(abstractC1620l0A);
        return abstractC1620l0A;
    }

    public final void c() {
        f7545b.set(null);
    }

    public final void d(AbstractC1620l0 abstractC1620l0) {
        f7545b.set(abstractC1620l0);
    }
}
