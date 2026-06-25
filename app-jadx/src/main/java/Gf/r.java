package Gf;

import Lf.C1902i;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class r {
    public static final void a(InterfaceC1623n interfaceC1623n, InterfaceC1612h0 interfaceC1612h0) {
        c(interfaceC1623n, new C1614i0(interfaceC1612h0));
    }

    public static final C1627p b(Zd.e eVar) {
        if (!(eVar instanceof C1902i)) {
            return new C1627p(eVar, 1);
        }
        C1627p c1627pK = ((C1902i) eVar).k();
        if (c1627pK != null) {
            if (!c1627pK.O()) {
                c1627pK = null;
            }
            if (c1627pK != null) {
                return c1627pK;
            }
        }
        return new C1627p(eVar, 2);
    }

    public static final void c(InterfaceC1623n interfaceC1623n, InterfaceC1621m interfaceC1621m) {
        if (!(interfaceC1623n instanceof C1627p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C1627p) interfaceC1623n).F(interfaceC1621m);
    }
}
