package E0;

import K0.C1809w;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K0.J f4062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1295e f4063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final D f4064c = new D();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1809w f4065d = new C1809w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4066e;

    public G(K0.J j10) {
        this.f4062a = j10;
        this.f4063b = new C1295e(j10.x());
    }

    public final void a() {
        this.f4063b.c();
    }

    public final int b(E e10, S s10, boolean z10) {
        boolean z11;
        boolean z12;
        if (this.f4066e) {
            return H.a(false, false, false);
        }
        boolean z13 = true;
        try {
            this.f4066e = true;
            C1297g c1297gB = this.f4064c.b(e10, s10);
            int iM = c1297gB.b().m();
            for (int i10 = 0; i10 < iM; i10++) {
                C c10 = (C) c1297gB.b().n(i10);
                if (!c10.i() && !c10.l()) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int iM2 = c1297gB.b().m();
            for (int i11 = 0; i11 < iM2; i11++) {
                C c11 = (C) c1297gB.b().n(i11);
                if (z11 || r.b(c11)) {
                    K0.J.L0(this.f4062a, c11.h(), this.f4065d, c11.n(), false, 8, null);
                    if (!this.f4065d.isEmpty()) {
                        this.f4063b.b(c11.f(), this.f4065d, r.b(c11));
                        this.f4065d.clear();
                    }
                }
            }
            boolean zD = this.f4063b.d(c1297gB, z10);
            if (c1297gB.d()) {
                z12 = false;
            } else {
                int iM3 = c1297gB.b().m();
                for (int i12 = 0; i12 < iM3; i12++) {
                    C c12 = (C) c1297gB.b().n(i12);
                    if (r.j(c12) && c12.p()) {
                        z12 = true;
                        break;
                    }
                }
                z12 = false;
            }
            int iM4 = c1297gB.b().m();
            int i13 = 0;
            while (true) {
                if (i13 >= iM4) {
                    z13 = false;
                    break;
                }
                if (((C) c1297gB.b().n(i13)).p()) {
                    break;
                }
                i13++;
            }
            int iA = H.a(zD, z12, z13);
            this.f4066e = false;
            return iA;
        } catch (Throwable th2) {
            this.f4066e = false;
            throw th2;
        }
    }

    public final void c() {
        if (this.f4066e) {
            return;
        }
        this.f4064c.a();
        this.f4063b.e();
    }
}
