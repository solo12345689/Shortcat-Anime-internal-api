package Q;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import r0.AbstractC6227i;
import r0.C6224f;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C6226h f14220a = new C6226h(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(C6226h c6226h, long j10) {
        float fI = c6226h.i();
        float fJ = c6226h.j();
        float fM = C6224f.m(j10);
        if (fI > fM || fM > fJ) {
            return false;
        }
        float fL = c6226h.l();
        float fE = c6226h.e();
        float fN = C6224f.n(j10);
        return fL <= fN && fN <= fE;
    }

    public static final C6226h b(InterfaceC1690p interfaceC1690p) {
        C6226h c6226hC = AbstractC1691q.c(interfaceC1690p);
        return AbstractC6227i.a(interfaceC1690p.U(c6226hC.m()), interfaceC1690p.U(c6226hC.f()));
    }
}
