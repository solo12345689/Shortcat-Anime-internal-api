package E;

import Ud.AbstractC2273n;
import Y.A0;
import Y.J1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f3797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0 f3798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f3800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.y f3801e;

    public D(int i10, int i11) {
        this.f3797a = J1.a(i10);
        this.f3798b = J1.a(i11);
        this.f3801e = new F.y(i10, 90, 200);
    }

    private final void e(int i10) {
        this.f3797a.f(i10);
    }

    private final void f(int i10) {
        this.f3798b.f(i10);
    }

    private final void g(int i10, int i11) {
        if (i10 >= 0.0f) {
            e(i10);
            this.f3801e.n(i10);
            f(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }

    public final int a() {
        return this.f3797a.b();
    }

    public final F.y b() {
        return this.f3801e;
    }

    public final int c() {
        return this.f3798b.b();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f3800d = null;
    }

    public final void h(u uVar) {
        v[] vVarArrB;
        v vVar;
        v[] vVarArrB2;
        v vVar2;
        x xVarM = uVar.m();
        this.f3800d = (xVarM == null || (vVarArrB2 = xVarM.b()) == null || (vVar2 = (v) AbstractC2273n.Y(vVarArrB2)) == null) ? null : vVar2.getKey();
        if (this.f3799c || uVar.g() > 0) {
            this.f3799c = true;
            int iN = uVar.n();
            if (iN >= 0.0f) {
                x xVarM2 = uVar.m();
                g((xVarM2 == null || (vVarArrB = xVarM2.b()) == null || (vVar = (v) AbstractC2273n.Y(vVarArrB)) == null) ? 0 : vVar.getIndex(), iN);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + iN + ')').toString());
            }
        }
    }

    public final void i(int i10) {
        if (i10 >= 0.0f) {
            f(i10);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i10 + ')').toString());
    }

    public final int j(l lVar, int i10) {
        int iA = F.r.a(lVar, this.f3800d, i10);
        if (i10 != iA) {
            e(iA);
            this.f3801e.n(i10);
        }
        return iA;
    }
}
