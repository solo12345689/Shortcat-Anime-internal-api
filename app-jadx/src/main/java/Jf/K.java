package Jf;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Lf.E f9555a = new Lf.E("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lf.E f9556b = new Lf.E("PENDING");

    public static final u a(Object obj) {
        if (obj == null) {
            obj = Kf.p.f11122a;
        }
        return new J(obj);
    }

    public static final InterfaceC1742e d(I i10, Zd.i iVar, int i11, If.a aVar) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || aVar != If.a.f9115b) ? A.e(i10, iVar, i11, aVar) : i10;
    }
}
