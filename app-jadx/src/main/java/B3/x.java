package B3;

import B3.L;
import q2.C6109x;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C6109x f1461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t2.O f1462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private U2.O f1463c;

    public x(String str, String str2) {
        this.f1461a = new C6109x.b().W(str2).y0(str).P();
    }

    private void c() {
        AbstractC6614a.i(this.f1462b);
        a0.l(this.f1463c);
    }

    @Override // B3.D
    public void a(t2.O o10, U2.r rVar, L.d dVar) {
        this.f1462b = o10;
        dVar.a();
        U2.O oE = rVar.e(dVar.c(), 5);
        this.f1463c = oE;
        oE.c(this.f1461a);
    }

    @Override // B3.D
    public void b(C6609I c6609i) {
        c();
        long jE = this.f1462b.e();
        long jF = this.f1462b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        C6109x c6109x = this.f1461a;
        if (jF != c6109x.f57027t) {
            C6109x c6109xP = c6109x.b().C0(jF).P();
            this.f1461a = c6109xP;
            this.f1463c.c(c6109xP);
        }
        int iA = c6609i.a();
        this.f1463c.f(c6609i, iA);
        this.f1463c.a(jE, 1, iA, 0, null);
    }
}
