package F;

import F.B;
import I0.I;
import Y.A0;
import Y.C0;
import Y.J1;
import Y.b2;
import i0.AbstractC4993l;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class z implements I0.I, I.a, B.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f6113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A0 f6114c = J1.a(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final A0 f6115d = J1.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C0 f6116e = b2.e(null, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0 f6117f = b2.e(null, null, 2, null);

    public z(Object obj, B b10) {
        this.f6112a = obj;
        this.f6113b = b10;
    }

    private final I.a c() {
        return (I.a) this.f6116e.getValue();
    }

    private final int e() {
        return this.f6115d.b();
    }

    private final I0.I f() {
        return (I0.I) this.f6117f.getValue();
    }

    private final void i(I.a aVar) {
        this.f6116e.setValue(aVar);
    }

    private final void k(int i10) {
        this.f6115d.f(i10);
    }

    private final void l(I0.I i10) {
        this.f6117f.setValue(i10);
    }

    @Override // I0.I.a
    public void a() {
        if (e() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        k(e() - 1);
        if (e() == 0) {
            this.f6113b.n(this);
            I.a aVarC = c();
            if (aVarC != null) {
                aVarC.a();
            }
            i(null);
        }
    }

    @Override // I0.I
    public I.a b() {
        if (e() == 0) {
            this.f6113b.l(this);
            I0.I iD = d();
            i(iD != null ? iD.b() : null);
        }
        k(e() + 1);
        return this;
    }

    public final I0.I d() {
        return f();
    }

    public final void g() {
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            a();
        }
    }

    @Override // F.B.a
    public int getIndex() {
        return this.f6114c.b();
    }

    @Override // F.B.a
    public Object getKey() {
        return this.f6112a;
    }

    public void h(int i10) {
        this.f6114c.f(i10);
    }

    public final void j(I0.I i10) {
        AbstractC4993l.a aVar = AbstractC4993l.f48495e;
        AbstractC4993l abstractC4993lD = aVar.d();
        Function1 function1G = abstractC4993lD != null ? abstractC4993lD.g() : null;
        AbstractC4993l abstractC4993lE = aVar.e(abstractC4993lD);
        try {
            if (i10 != f()) {
                l(i10);
                if (e() > 0) {
                    I.a aVarC = c();
                    if (aVarC != null) {
                        aVarC.a();
                    }
                    i(i10 != null ? i10.b() : null);
                }
            }
            Td.L l10 = Td.L.f17438a;
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
        } catch (Throwable th2) {
            aVar.l(abstractC4993lD, abstractC4993lE, function1G);
            throw th2;
        }
    }
}
