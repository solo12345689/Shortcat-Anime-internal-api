package Z;

import Ud.AbstractC2279u;
import Y.AbstractC2454w;
import Y.C2392b;
import Y.H1;
import Y.InterfaceC2398d;
import ie.InterfaceC5082a;
import java.util.List;
import k0.AbstractC5412b;
import k0.AbstractC5414d;
import k0.C5413c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements f {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ f f23089a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ H1 f23090b;

        a(f fVar, H1 h12) {
            this.f23089a = fVar;
            this.f23090b = h12;
        }

        @Override // Z.f
        public List c(Integer num) {
            List listC = this.f23089a.c(null);
            int iA0 = this.f23090b.a0();
            if (iA0 < 0) {
                return listC;
            }
            H1 h12 = this.f23090b;
            return AbstractC2279u.I0(AbstractC5412b.b(h12, num, iA0, Integer.valueOf(h12.C0(iA0))), listC);
        }
    }

    public static final Throwable f(Throwable th2, final f fVar, final H1 h12, final C2392b c2392b) {
        return fVar == null ? th2 : AbstractC5414d.b(th2, new InterfaceC5082a() { // from class: Z.g
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return h.g(c2392b, h12, fVar);
            }
        });
    }

    public static final List g(C2392b c2392b, H1 h12, f fVar) {
        if (c2392b != null) {
            h12.P0(c2392b);
        }
        List listC = AbstractC5412b.c(h12, null, 0, null, 7, null);
        C5413c c5413c = (C5413c) AbstractC2279u.A0(listC);
        Integer numC = c5413c != null ? c5413c.c() : null;
        List listC2 = fVar.c(numC);
        if (numC != null && !listC2.isEmpty()) {
            listC2 = AbstractC2279u.I0(AbstractC2279u.e(C5413c.b((C5413c) AbstractC2279u.m0(listC2), null, numC, 1, null)), AbstractC2279u.g0(listC2, 1));
        }
        return AbstractC2279u.I0(listC, listC2);
    }

    private static final int h(H1 h12) {
        int iZ = h12.Z();
        int iA0 = h12.a0();
        while (iA0 >= 0 && !h12.p0(iA0)) {
            iA0 = h12.C0(iA0);
        }
        int iH0 = iA0 + 1;
        int iA02 = 0;
        while (iH0 < iZ) {
            if (h12.k0(iZ, iH0)) {
                if (h12.p0(iH0)) {
                    iA02 = 0;
                }
                iH0++;
            } else {
                iA02 += h12.p0(iH0) ? 1 : h12.A0(iH0);
                iH0 += h12.h0(iH0);
            }
        }
        return iA02;
    }

    public static final int i(H1 h12, C2392b c2392b, InterfaceC2398d interfaceC2398d) {
        int iC = h12.C(c2392b);
        if (!(h12.Z() < iC)) {
            AbstractC2454w.t("Check failed");
        }
        j(h12, interfaceC2398d, iC);
        int iH = h(h12);
        while (h12.Z() < iC) {
            if (h12.j0(iC)) {
                if (h12.o0()) {
                    interfaceC2398d.h(h12.y0(h12.Z()));
                    iH = 0;
                }
                h12.d1();
            } else {
                iH += h12.T0();
            }
        }
        if (!(h12.Z() == iC)) {
            AbstractC2454w.t("Check failed");
        }
        return iH;
    }

    public static final void j(H1 h12, InterfaceC2398d interfaceC2398d, int i10) {
        while (!h12.l0(i10)) {
            h12.U0();
            if (h12.p0(h12.a0())) {
                interfaceC2398d.k();
            }
            h12.R();
        }
    }

    public static final f k(f fVar, H1 h12) {
        return new a(fVar, h12);
    }
}
