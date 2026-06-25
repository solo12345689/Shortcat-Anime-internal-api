package G;

import Y.A0;
import Y.InterfaceC2464z0;
import Y.J1;
import Y.W0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a */
    private final C f6964a;

    /* JADX INFO: renamed from: b */
    private final A0 f6965b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2464z0 f6966c;

    /* JADX INFO: renamed from: d */
    private boolean f6967d;

    /* JADX INFO: renamed from: e */
    private Object f6968e;

    /* JADX INFO: renamed from: f */
    private final F.y f6969f;

    public x(int i10, float f10, C c10) {
        this.f6964a = c10;
        this.f6965b = J1.a(i10);
        this.f6966c = W0.a(f10);
        this.f6969f = new F.y(i10, 30, 100);
    }

    private final void g(int i10) {
        this.f6965b.f(i10);
    }

    private final void h(float f10) {
        this.f6966c.k(f10);
    }

    private final void i(int i10, float f10) {
        g(i10);
        this.f6969f.n(i10);
        h(f10);
    }

    public final void a(int i10) {
        h(c() + (this.f6964a.H() == 0 ? 0.0f : i10 / this.f6964a.H()));
    }

    public final int b() {
        return this.f6965b.b();
    }

    public final float c() {
        return this.f6966c.c();
    }

    public final F.y d() {
        return this.f6969f;
    }

    public final int e(r rVar, int i10) {
        int iA = F.r.a(rVar, this.f6968e, i10);
        if (i10 != iA) {
            g(iA);
            this.f6969f.n(i10);
        }
        return iA;
    }

    public final void f(int i10, float f10) {
        i(i10, f10);
        this.f6968e = null;
    }

    public final void j(float f10) {
        h(f10);
    }

    public final void k(u uVar) {
        C1591e c1591eO = uVar.o();
        this.f6968e = c1591eO != null ? c1591eO.c() : null;
        if (this.f6967d || !uVar.i().isEmpty()) {
            this.f6967d = true;
            C1591e c1591eO2 = uVar.o();
            i(c1591eO2 != null ? c1591eO2.getIndex() : 0, uVar.p());
        }
    }
}
