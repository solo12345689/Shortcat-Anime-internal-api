package Y;

import a0.C2507c;
import ie.InterfaceC5082a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0.r f22227a = new g0.r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g0.r f22228b = new g0.r();

    public static final C2507c b() {
        g0.r rVar = f22228b;
        C2507c c2507c = (C2507c) rVar.a();
        if (c2507c != null) {
            return c2507c;
        }
        C2507c c2507c2 = new C2507c(new V[0], 0);
        rVar.b(c2507c2);
        return c2507c2;
    }

    public static final h2 c(T1 t12, InterfaceC5082a interfaceC5082a) {
        return new T(interfaceC5082a, t12);
    }

    public static final h2 d(InterfaceC5082a interfaceC5082a) {
        return new T(interfaceC5082a, null);
    }
}
