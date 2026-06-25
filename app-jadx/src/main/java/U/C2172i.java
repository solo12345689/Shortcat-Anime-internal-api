package U;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.C5015h;
import s0.C6385r0;
import s0.E1;
import x.AbstractC7010h;
import x.C7009g;

/* JADX INFO: renamed from: U.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2172i {

    /* JADX INFO: renamed from: a */
    public static final C2172i f18372a = new C2172i();

    /* JADX INFO: renamed from: b */
    private static final float f18373b;

    /* JADX INFO: renamed from: c */
    private static final float f18374c;

    /* JADX INFO: renamed from: d */
    private static final C.A f18375d;

    /* JADX INFO: renamed from: e */
    private static final float f18376e;

    /* JADX INFO: renamed from: f */
    private static final C.A f18377f;

    /* JADX INFO: renamed from: g */
    private static final float f18378g;

    /* JADX INFO: renamed from: h */
    private static final C.A f18379h;

    /* JADX INFO: renamed from: i */
    private static final float f18380i;

    /* JADX INFO: renamed from: j */
    private static final C.A f18381j;

    /* JADX INFO: renamed from: k */
    private static final float f18382k;

    /* JADX INFO: renamed from: l */
    private static final float f18383l;

    /* JADX INFO: renamed from: m */
    private static final float f18384m;

    /* JADX INFO: renamed from: n */
    private static final float f18385n;

    /* JADX INFO: renamed from: o */
    public static final int f18386o = 0;

    static {
        float fN = C5015h.n(24);
        f18373b = fN;
        float f10 = 8;
        float fN2 = C5015h.n(f10);
        f18374c = fN2;
        C.A aD = androidx.compose.foundation.layout.p.d(fN, fN2, fN, fN2);
        f18375d = aD;
        float f11 = 16;
        float fN3 = C5015h.n(f11);
        f18376e = fN3;
        f18377f = androidx.compose.foundation.layout.p.d(fN3, fN2, fN, fN2);
        float fN4 = C5015h.n(12);
        f18378g = fN4;
        f18379h = androidx.compose.foundation.layout.p.d(fN4, aD.d(), fN4, aD.c());
        float fN5 = C5015h.n(f11);
        f18380i = fN5;
        f18381j = androidx.compose.foundation.layout.p.d(fN4, aD.d(), fN5, aD.c());
        f18382k = C5015h.n(58);
        f18383l = C5015h.n(40);
        f18384m = X.f.f21140a.i();
        f18385n = C5015h.n(f10);
    }

    private C2172i() {
    }

    public final C2171h a(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1449248637, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:564)");
        }
        C2171h c2171hE = e(D.f17597a.a(interfaceC2425m, 6));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2171hE;
    }

    public final C2171h b(long j10, long j11, long j12, long j13, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = C6385r0.f58985b.j();
        }
        if ((i11 & 2) != 0) {
            j11 = C6385r0.f58985b.j();
        }
        if ((i11 & 4) != 0) {
            j12 = C6385r0.f58985b.j();
        }
        if ((i11 & 8) != 0) {
            j13 = C6385r0.f58985b.j();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-339300779, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:582)");
        }
        long j14 = j10;
        C2171h c2171hC = e(D.f17597a.a(interfaceC2425m, 6)).c(j14, j11, j12, j13);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2171hC;
    }

    public final C2173j c(float f10, float f11, float f12, float f13, float f14, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = X.f.f21140a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = X.f.f21140a.k();
        }
        if ((i11 & 4) != 0) {
            f12 = X.f.f21140a.g();
        }
        if ((i11 & 8) != 0) {
            f13 = X.f.f21140a.h();
        }
        float f15 = f13;
        if ((i11 & 16) != 0) {
            f14 = X.f.f21140a.e();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1827791191, i10, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:802)");
        }
        float f16 = f14;
        float f17 = f12;
        C2173j c2173j = new C2173j(f10, f11, f17, f15, f16, null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2173j;
    }

    public final C.A d() {
        return f18375d;
    }

    public final C2171h e(C2175l c2175l) {
        C2171h c2171hD = c2175l.d();
        if (c2171hD != null) {
            return c2171hD;
        }
        X.f fVar = X.f.f21140a;
        C2171h c2171h = new C2171h(AbstractC2176m.f(c2175l, fVar.a()), AbstractC2176m.f(c2175l, fVar.j()), C6385r0.q(AbstractC2176m.f(c2175l, fVar.d()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), C6385r0.q(AbstractC2176m.f(c2175l, fVar.f()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c2175l.T(c2171h);
        return c2171h;
    }

    public final C2171h f(C2175l c2175l) {
        C2171h c2171hG = c2175l.g();
        if (c2171hG != null) {
            return c2171hG;
        }
        C6385r0.a aVar = C6385r0.f58985b;
        long jI = aVar.i();
        X.h hVar = X.h.f21175a;
        C2171h c2171h = new C2171h(jI, AbstractC2176m.f(c2175l, hVar.c()), aVar.i(), C6385r0.q(AbstractC2176m.f(c2175l, hVar.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c2175l.W(c2171h);
        return c2171h;
    }

    public final C2171h g(C2175l c2175l) {
        C2171h c2171hI = c2175l.i();
        if (c2171hI != null) {
            return c2171hI;
        }
        C6385r0.a aVar = C6385r0.f58985b;
        long jI = aVar.i();
        X.o oVar = X.o.f21401a;
        C2171h c2171h = new C2171h(jI, AbstractC2176m.f(c2175l, oVar.c()), aVar.i(), C6385r0.q(AbstractC2176m.f(c2175l, oVar.b()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        c2175l.Y(c2171h);
        return c2171h;
    }

    public final float h() {
        return f18383l;
    }

    public final float i() {
        return f18382k;
    }

    public final E1 j(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2045213065, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:554)");
        }
        E1 e1D = V.d(X.h.f21175a.a(), interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return e1D;
    }

    public final E1 k(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1234923021, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:542)");
        }
        E1 e1D = V.d(X.f.f21140a.c(), interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return e1D;
    }

    public final C.A l() {
        return f18379h;
    }

    public final E1 m(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-349121587, i10, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:558)");
        }
        E1 e1D = V.d(X.o.f21401a.a(), interfaceC2425m, 6);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return e1D;
    }

    public final C7009g n(boolean z10, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        long jQ;
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-626854767, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:889)");
        }
        X.h hVar = X.h.f21175a;
        float fE = hVar.e();
        if (z10) {
            interfaceC2425m.V(-855870548);
            jQ = AbstractC2176m.h(hVar.d(), interfaceC2425m, 6);
            interfaceC2425m.O();
        } else {
            interfaceC2425m.V(-855783004);
            jQ = C6385r0.q(AbstractC2176m.h(hVar.d(), interfaceC2425m, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            interfaceC2425m.O();
        }
        C7009g c7009gA = AbstractC7010h.a(fE, jQ);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c7009gA;
    }

    public final C2171h o(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1344886725, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:701)");
        }
        C2171h c2171hF = f(D.f17597a.a(interfaceC2425m, 6));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2171hF;
    }

    public final C2171h p(long j10, long j11, long j12, long j13, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = C6385r0.f58985b.j();
        }
        if ((i11 & 2) != 0) {
            j11 = C6385r0.f58985b.j();
        }
        if ((i11 & 4) != 0) {
            j12 = C6385r0.f58985b.j();
        }
        if ((i11 & 8) != 0) {
            j13 = C6385r0.f58985b.j();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1778526249, i10, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:719)");
        }
        long j14 = j10;
        C2171h c2171hC = f(D.f17597a.a(interfaceC2425m, 6)).c(j14, j11, j12, j13);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2171hC;
    }

    public final C2171h q(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1880341584, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:744)");
        }
        C2171h c2171hG = g(D.f17597a.a(interfaceC2425m, 6));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2171hG;
    }

    public final C2171h r(long j10, long j11, long j12, long j13, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        if ((i11 & 1) != 0) {
            j10 = C6385r0.f58985b.j();
        }
        if ((i11 & 2) != 0) {
            j11 = C6385r0.f58985b.j();
        }
        if ((i11 & 4) != 0) {
            j12 = C6385r0.f58985b.j();
        }
        if ((i11 & 8) != 0) {
            j13 = C6385r0.f58985b.j();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1402274782, i10, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:762)");
        }
        long j14 = j10;
        C2171h c2171hC = g(D.f17597a.a(interfaceC2425m, 6)).c(j14, j11, j12, j13);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c2171hC;
    }
}
