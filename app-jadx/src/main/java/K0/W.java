package K0;

import K0.J;
import K0.p0;
import K0.y0;
import a0.C2507c;
import i1.C5009b;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a */
    private final J f10588a;

    /* JADX INFO: renamed from: b */
    private final C1803p f10589b;

    /* JADX INFO: renamed from: c */
    private boolean f10590c;

    /* JADX INFO: renamed from: d */
    private boolean f10591d;

    /* JADX INFO: renamed from: e */
    private final m0 f10592e;

    /* JADX INFO: renamed from: f */
    private final C2507c f10593f;

    /* JADX INFO: renamed from: g */
    private long f10594g;

    /* JADX INFO: renamed from: h */
    private final C2507c f10595h;

    /* JADX INFO: renamed from: i */
    private C5009b f10596i;

    /* JADX INFO: renamed from: j */
    private final Q f10597j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final J f10598a;

        /* JADX INFO: renamed from: b */
        private final boolean f10599b;

        /* JADX INFO: renamed from: c */
        private final boolean f10600c;

        public a(J j10, boolean z10, boolean z11) {
            this.f10598a = j10;
            this.f10599b = z10;
            this.f10600c = z11;
        }

        public final J a() {
            return this.f10598a;
        }

        public final boolean b() {
            return this.f10600c;
        }

        public final boolean c() {
            return this.f10599b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10601a;

        static {
            int[] iArr = new int[J.e.values().length];
            try {
                iArr[J.e.f10477b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[J.e.f10476a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[J.e.f10479d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[J.e.f10478c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[J.e.f10480e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10601a = iArr;
        }
    }

    public W(J j10) {
        this.f10588a = j10;
        p0.a aVar = p0.f10797N;
        C1803p c1803p = new C1803p(aVar.a());
        this.f10589b = c1803p;
        this.f10592e = new m0();
        this.f10593f = new C2507c(new p0.b[16], 0);
        this.f10594g = 1L;
        C2507c c2507c = new C2507c(new a[16], 0);
        this.f10595h = c2507c;
        this.f10597j = aVar.a() ? new Q(j10, c1803p, c2507c.h()) : null;
    }

    private final void A(J j10, boolean z10) {
        if (y(j10, z10)) {
            B(j10, z10, false);
        }
    }

    public final boolean B(J j10, boolean z10, boolean z11) {
        C5009b c5009b;
        boolean zG;
        J jA0;
        if (j10.z()) {
            return false;
        }
        if (!j10.p() && !j10.X0() && !n(j10) && !AbstractC5504s.c(j10.Y0(), Boolean.TRUE) && !m(j10) && !j10.K()) {
            return false;
        }
        if (j10 == this.f10588a) {
            c5009b = this.f10596i;
            AbstractC5504s.e(c5009b);
        } else {
            c5009b = null;
        }
        if (z10) {
            zG = j10.h0() ? g(j10, c5009b) : false;
            if (z11 && ((zG || j10.g0()) && AbstractC5504s.c(j10.Y0(), Boolean.TRUE))) {
                j10.c1();
            }
        } else {
            boolean zH = j10.m0() ? h(j10, c5009b) : false;
            if (z11 && j10.e0() && (j10 == this.f10588a || ((jA0 = j10.A0()) != null && jA0.p() && j10.X0()))) {
                if (j10 == this.f10588a) {
                    j10.u1(0, 0);
                } else {
                    j10.A1();
                }
                this.f10592e.d(j10);
                N.b(j10).getRectManager().i(j10);
                Q q10 = this.f10597j;
                if (q10 != null) {
                    q10.a();
                }
            }
            zG = zH;
        }
        i();
        return zG;
    }

    private final void C(J j10) {
        C2507c c2507cI0 = j10.I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j11 = (J) objArr[i10];
            if (u(j11)) {
                if (P.a(j11)) {
                    D(j11, true);
                } else {
                    C(j11);
                }
            }
        }
    }

    private final void D(J j10, boolean z10) {
        C5009b c5009b;
        if (j10.z()) {
            return;
        }
        if (j10 == this.f10588a) {
            c5009b = this.f10596i;
            AbstractC5504s.e(c5009b);
        } else {
            c5009b = null;
        }
        if (z10) {
            g(j10, c5009b);
        } else {
            h(j10, c5009b);
        }
    }

    public static /* synthetic */ boolean J(W w10, J j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return w10.I(j10, z10);
    }

    private final void d() {
        C2507c c2507c = this.f10593f;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((p0.b) objArr[i10]).l();
        }
        this.f10593f.i();
    }

    public static /* synthetic */ void f(W w10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        w10.e(z10);
    }

    private final boolean g(J j10, C5009b c5009b) {
        if (j10.j0() == null) {
            return false;
        }
        boolean zA1 = c5009b != null ? j10.a1(c5009b) : J.b1(j10, null, 1, null);
        J jA0 = j10.A0();
        if (zA1 && jA0 != null) {
            if (jA0.j0() == null) {
                J.I1(jA0, false, false, false, 3, null);
                return zA1;
            }
            if (j10.p0() == J.g.f10484a) {
                J.E1(jA0, false, false, false, 3, null);
                return zA1;
            }
            if (j10.p0() == J.g.f10485b) {
                J.C1(jA0, false, 1, null);
            }
        }
        return zA1;
    }

    private final boolean h(J j10, C5009b c5009b) {
        boolean zW1 = c5009b != null ? j10.w1(c5009b) : J.x1(j10, null, 1, null);
        J jA0 = j10.A0();
        if (zW1 && jA0 != null) {
            if (j10.o0() == J.g.f10484a) {
                J.I1(jA0, false, false, false, 3, null);
                return zW1;
            }
            if (j10.o0() == J.g.f10485b) {
                J.G1(jA0, false, 1, null);
            }
        }
        return zW1;
    }

    private final void i() {
        if (this.f10595h.p() != 0) {
            C2507c c2507c = this.f10595h;
            Object[] objArr = c2507c.f23496a;
            int iP = c2507c.p();
            for (int i10 = 0; i10 < iP; i10++) {
                a aVar = (a) objArr[i10];
                if (aVar.a().b()) {
                    if (aVar.c()) {
                        J.E1(aVar.a(), aVar.b(), false, false, 2, null);
                    } else {
                        J.I1(aVar.a(), aVar.b(), false, false, 2, null);
                    }
                }
            }
            this.f10595h.i();
        }
    }

    private final void j(J j10) {
        C2507c c2507cI0 = j10.I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j11 = (J) objArr[i10];
            if (AbstractC5504s.c(j11.Y0(), Boolean.TRUE) && !j11.z()) {
                if (this.f10589b.f(j11, true)) {
                    j11.c1();
                }
                j(j11);
            }
        }
    }

    private final void l(J j10, boolean z10) {
        C2507c c2507cI0 = j10.I0();
        Object[] objArr = c2507cI0.f23496a;
        int iP = c2507cI0.p();
        for (int i10 = 0; i10 < iP; i10++) {
            J j11 = (J) objArr[i10];
            if ((!z10 && u(j11)) || (z10 && r(j11))) {
                if (P.a(j11) && !z10) {
                    if (j11.h0() && this.f10589b.f(j11, true)) {
                        B(j11, true, false);
                    } else {
                        k(j11, true);
                    }
                }
                A(j11, z10);
                if (!y(j11, z10)) {
                    l(j11, z10);
                }
            }
        }
        A(j10, z10);
    }

    private final boolean m(J j10) {
        InterfaceC1778b interfaceC1778bO;
        AbstractC1776a abstractC1776aZ;
        if (j10.h0()) {
            return (j10.p0() == J.g.f10486c && ((interfaceC1778bO = j10.d0().o()) == null || (abstractC1776aZ = interfaceC1778bO.z()) == null || !abstractC1776aZ.k())) ? false : true;
        }
        return false;
    }

    private final boolean n(J j10) {
        return j10.m0() && t(j10);
    }

    private final boolean r(J j10) {
        InterfaceC1778b interfaceC1778bO;
        AbstractC1776a abstractC1776aZ;
        return j10.p0() == J.g.f10484a || !((interfaceC1778bO = j10.d0().o()) == null || (abstractC1776aZ = interfaceC1778bO.z()) == null || !abstractC1776aZ.k());
    }

    private final boolean t(J j10) {
        do {
            if (j10.o0() == J.g.f10486c && !j10.d0().b().z().k()) {
                J jA0 = j10.A0();
                if ((jA0 != null ? jA0.f0() : null) != J.e.f10476a) {
                    return false;
                }
            }
            j10 = j10.A0();
            if (j10 == null) {
                return false;
            }
        } while (!j10.p());
        return true;
    }

    private final boolean u(J j10) {
        return j10.o0() == J.g.f10484a || j10.d0().b().z().k();
    }

    private final boolean y(J j10, boolean z10) {
        return z10 ? j10.h0() : j10.m0();
    }

    public final boolean E(J j10, boolean z10) {
        int i10 = b.f10601a[j10.f0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4 && i10 != 5) {
                        throw new Td.r();
                    }
                }
            }
            if ((j10.h0() || j10.g0()) && !z10) {
                Q q10 = this.f10597j;
                if (q10 != null) {
                    q10.a();
                }
                return false;
            }
            j10.e1();
            j10.d1();
            if (j10.z()) {
                return false;
            }
            J jA0 = j10.A0();
            if (AbstractC5504s.c(j10.Y0(), Boolean.TRUE) && ((jA0 == null || !jA0.h0()) && (jA0 == null || !jA0.g0()))) {
                this.f10589b.d(j10, B.f10392b);
            } else if (j10.p() && ((jA0 == null || !jA0.e0()) && (jA0 == null || !jA0.m0()))) {
                this.f10589b.d(j10, B.f10394d);
            }
            return !this.f10591d;
        }
        Q q11 = this.f10597j;
        if (q11 != null) {
            q11.a();
        }
        return false;
    }

    public final boolean F(J j10, boolean z10) {
        J jA0;
        J jA02;
        if (!(j10.j0() != null)) {
            H0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f10601a[j10.f0().ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new Td.r();
                }
                if (j10.h0() && !z10) {
                    return false;
                }
                j10.f1();
                j10.g1();
                if (j10.z()) {
                    return false;
                }
                if ((AbstractC5504s.c(j10.Y0(), Boolean.TRUE) || m(j10)) && ((jA0 = j10.A0()) == null || !jA0.h0())) {
                    this.f10589b.d(j10, B.f10391a);
                } else if ((j10.p() || n(j10)) && ((jA02 = j10.A0()) == null || !jA02.m0())) {
                    this.f10589b.d(j10, B.f10393c);
                }
                return !this.f10591d;
            }
            this.f10595h.c(new a(j10, true, z10));
            Q q10 = this.f10597j;
            if (q10 != null) {
                q10.a();
            }
        }
        return false;
    }

    public final void G(J j10) {
        this.f10592e.d(j10);
    }

    public final boolean H(J j10, boolean z10) {
        int i10 = b.f10601a[j10.f0().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            Q q10 = this.f10597j;
            if (q10 != null) {
                q10.a();
            }
            return false;
        }
        if (i10 != 5) {
            throw new Td.r();
        }
        J jA0 = j10.A0();
        boolean z11 = jA0 == null || jA0.p();
        if (!z10 && (j10.m0() || (j10.e0() && j10.p() == z11 && j10.p() == j10.X0()))) {
            Q q11 = this.f10597j;
            if (q11 != null) {
                q11.a();
            }
            return false;
        }
        j10.d1();
        if (!j10.z() && j10.X0() && z11) {
            if ((jA0 == null || !jA0.e0()) && (jA0 == null || !jA0.m0())) {
                this.f10589b.d(j10, B.f10394d);
            }
            if (!this.f10591d) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(J j10, boolean z10) {
        int i10 = b.f10601a[j10.f0().ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 5) {
                    throw new Td.r();
                }
                if (j10.m0() && !z10) {
                    return false;
                }
                j10.g1();
                if (j10.z()) {
                    return false;
                }
                if (!j10.p() && !n(j10)) {
                    return false;
                }
                J jA0 = j10.A0();
                if (jA0 == null || !jA0.m0()) {
                    this.f10589b.d(j10, B.f10393c);
                }
                return !this.f10591d;
            }
            this.f10595h.c(new a(j10, false, z10));
            Q q10 = this.f10597j;
            if (q10 != null) {
                q10.a();
            }
        }
        return false;
    }

    public final void L(long j10) {
        C5009b c5009b = this.f10596i;
        if (c5009b == null ? false : C5009b.f(c5009b.r(), j10)) {
            return;
        }
        if (this.f10590c) {
            H0.a.a("updateRootConstraints called while measuring");
        }
        this.f10596i = C5009b.a(j10);
        if (this.f10588a.j0() != null) {
            this.f10588a.f1();
        }
        this.f10588a.g1();
        C1803p c1803p = this.f10589b;
        J j11 = this.f10588a;
        c1803p.d(j11, j11.j0() != null ? B.f10391a : B.f10393c);
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f10592e.e(this.f10588a);
        }
        if (this.f10592e.c()) {
            this.f10592e.a();
        }
    }

    public final void k(J j10, boolean z10) {
        if (!this.f10590c) {
            H0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (y(j10, z10)) {
            H0.a.a("node not yet measured");
        }
        l(j10, z10);
    }

    public final boolean o() {
        return this.f10590c;
    }

    public final boolean p() {
        return this.f10589b.i();
    }

    public final boolean q() {
        return this.f10592e.c();
    }

    public final long s() {
        if (!this.f10590c) {
            H0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f10594g;
    }

    public final boolean v(InterfaceC5082a interfaceC5082a) {
        boolean z10;
        J jD;
        boolean z11;
        boolean z12;
        if (!this.f10588a.b()) {
            H0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f10588a.p()) {
            H0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f10590c) {
            H0.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z13 = false;
        if (this.f10596i != null) {
            this.f10590c = true;
            this.f10591d = true;
            try {
                if (this.f10589b.i()) {
                    C1803p c1803p = this.f10589b;
                    z10 = false;
                    while (true) {
                        if (!c1803p.f10793a.c()) {
                            jD = c1803p.f10793a.d();
                            z12 = jD.j0() != null;
                            z11 = false;
                        } else if (!c1803p.f10794b.c()) {
                            jD = c1803p.f10794b.d();
                            z12 = jD.j0() != null;
                            z11 = true;
                        } else {
                            if (c1803p.f10795c.c()) {
                                break;
                            }
                            jD = c1803p.f10795c.d();
                            z11 = true;
                            z12 = false;
                        }
                        boolean zB = B(jD, z12, z11);
                        if (!z11) {
                            if (jD.g0()) {
                                this.f10589b.d(jD, B.f10392b);
                            }
                            if (jD.e0()) {
                                this.f10589b.d(jD, B.f10394d);
                            }
                        }
                        if (jD == this.f10588a && zB) {
                            z10 = true;
                        }
                    }
                    if (interfaceC5082a != null) {
                        interfaceC5082a.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f10590c = false;
                this.f10591d = false;
                Q q10 = this.f10597j;
                if (q10 != null) {
                    q10.a();
                }
                z13 = z10;
            } finally {
            }
        }
        d();
        return z13;
    }

    public final void w(J j10, long j11) {
        if (j10.z()) {
            return;
        }
        if (AbstractC5504s.c(j10, this.f10588a)) {
            H0.a.a("measureAndLayout called on root");
        }
        if (!this.f10588a.b()) {
            H0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f10588a.p()) {
            H0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f10590c) {
            H0.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f10596i != null) {
            this.f10590c = true;
            this.f10591d = false;
            try {
                this.f10589b.j(j10);
                if (g(j10, C5009b.a(j11)) || j10.g0()) {
                    if (AbstractC5504s.c(j10.Y0(), Boolean.TRUE)) {
                        j10.c1();
                    }
                }
                j(j10);
                h(j10, C5009b.a(j11));
                if (j10.e0() && j10.p()) {
                    j10.A1();
                    this.f10592e.d(j10);
                }
                i();
                this.f10590c = false;
                this.f10591d = false;
                Q q10 = this.f10597j;
                if (q10 != null) {
                    q10.a();
                }
            } finally {
            }
        }
        d();
    }

    public final void x() {
        if (this.f10589b.i()) {
            if (!this.f10588a.b()) {
                H0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f10588a.p()) {
                H0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f10590c) {
                H0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f10596i != null) {
                this.f10590c = true;
                this.f10591d = false;
                try {
                    if (this.f10589b.g()) {
                        if (this.f10588a.j0() != null) {
                            D(this.f10588a, true);
                        } else {
                            C(this.f10588a);
                        }
                    }
                    D(this.f10588a, false);
                    this.f10590c = false;
                    this.f10591d = false;
                    Q q10 = this.f10597j;
                    if (q10 != null) {
                        q10.a();
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        this.f10590c = false;
                        this.f10591d = false;
                        throw th3;
                    }
                }
            }
        }
    }

    public final void z(J j10) {
        this.f10589b.j(j10);
        this.f10592e.f(j10);
    }

    public final void K(y0.a aVar) {
    }
}
