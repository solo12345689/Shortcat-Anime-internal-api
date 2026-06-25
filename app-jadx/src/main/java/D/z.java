package D;

import Y.A0;
import Y.J1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A0 f3501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A0 f3502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f3504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.y f3505e;

    public z(int i10, int i11) {
        this.f3501a = J1.a(i10);
        this.f3502b = J1.a(i11);
        this.f3505e = new F.y(i10, 30, 100);
    }

    private final void f(int i10) {
        this.f3502b.f(i10);
    }

    private final void g(int i10, int i11) {
        if (i10 >= 0.0f) {
            e(i10);
            this.f3505e.n(i10);
            f(i11);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i10 + ')').toString());
        }
    }

    public final int a() {
        return this.f3501a.b();
    }

    public final F.y b() {
        return this.f3505e;
    }

    public final int c() {
        return this.f3502b.b();
    }

    public final void d(int i10, int i11) {
        g(i10, i11);
        this.f3504d = null;
    }

    public final void e(int i10) {
        this.f3501a.f(i10);
    }

    public final void h(s sVar) {
        t tVarP = sVar.p();
        this.f3504d = tVarP != null ? tVarP.getKey() : null;
        if (this.f3503c || sVar.g() > 0) {
            this.f3503c = true;
            int iQ = sVar.q();
            if (iQ >= 0.0f) {
                t tVarP2 = sVar.p();
                g(tVarP2 != null ? tVarP2.getIndex() : 0, iQ);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + iQ + ')').toString());
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

    public final int j(m mVar, int i10) {
        int iA = F.r.a(mVar, this.f3504d, i10);
        if (i10 != iA) {
            e(iA);
            this.f3505e.n(i10);
        }
        return iA;
    }
}
