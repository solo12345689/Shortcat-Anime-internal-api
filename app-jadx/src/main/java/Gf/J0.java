package Gf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lf.E f7513a = new Lf.E("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lf.E f7514b = new Lf.E("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lf.E f7515c = new Lf.E("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lf.E f7516d = new Lf.E("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lf.E f7517e = new Lf.E("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C1618k0 f7518f = new C1618k0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1618k0 f7519g = new C1618k0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC1643x0 ? new C1645y0((InterfaceC1643x0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC1643x0 interfaceC1643x0;
        C1645y0 c1645y0 = obj instanceof C1645y0 ? (C1645y0) obj : null;
        return (c1645y0 == null || (interfaceC1643x0 = c1645y0.f7615a) == null) ? obj : interfaceC1643x0;
    }
}
