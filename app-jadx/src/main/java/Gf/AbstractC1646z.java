package Gf;

/* JADX INFO: renamed from: Gf.z */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1646z {
    public static final InterfaceC1642x a(C0 c02) {
        return new C1644y(c02);
    }

    public static /* synthetic */ InterfaceC1642x b(C0 c02, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c02 = null;
        }
        return a(c02);
    }

    public static final boolean c(InterfaceC1642x interfaceC1642x, Object obj) {
        Throwable thE = Td.u.e(obj);
        return thE == null ? interfaceC1642x.O(obj) : interfaceC1642x.h(thE);
    }
}
