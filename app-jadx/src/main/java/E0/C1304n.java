package E0;

import I0.InterfaceC1690p;
import a0.C2507c;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6546L;
import t.C6573x;

/* JADX INFO: renamed from: E0.n */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C1304n {

    /* JADX INFO: renamed from: a */
    private final C2507c f4170a = new C2507c(new C1303m[16], 0);

    /* JADX INFO: renamed from: b */
    private final C6546L f4171b = new C6546L(10);

    public boolean a(C6573x c6573x, InterfaceC1690p interfaceC1690p, C1297g c1297g, boolean z10) {
        C2507c c2507c = this.f4170a;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        boolean z11 = false;
        for (int i10 = 0; i10 < iP; i10++) {
            z11 = ((C1303m) objArr[i10]).a(c6573x, interfaceC1690p, c1297g, z10) || z11;
        }
        return z11;
    }

    public void b(C1297g c1297g) {
        int iP = this.f4170a.p();
        while (true) {
            iP--;
            if (-1 >= iP) {
                return;
            }
            if (((C1303m) this.f4170a.f23496a[iP]).l().f()) {
                this.f4170a.y(iP);
            }
        }
    }

    public final void c() {
        this.f4170a.i();
    }

    public void d() {
        C2507c c2507c = this.f4170a;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((C1303m) objArr[i10]).d();
        }
    }

    public boolean e(C1297g c1297g) {
        C2507c c2507c = this.f4170a;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        boolean z10 = false;
        for (int i10 = 0; i10 < iP; i10++) {
            z10 = ((C1303m) objArr[i10]).e(c1297g) || z10;
        }
        b(c1297g);
        return z10;
    }

    public boolean f(C6573x c6573x, InterfaceC1690p interfaceC1690p, C1297g c1297g, boolean z10) {
        C2507c c2507c = this.f4170a;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        boolean z11 = false;
        for (int i10 = 0; i10 < iP; i10++) {
            z11 = ((C1303m) objArr[i10]).f(c6573x, interfaceC1690p, c1297g, z10) || z11;
        }
        return z11;
    }

    public final C2507c g() {
        return this.f4170a;
    }

    public void h(long j10, C6546L c6546l) {
        C2507c c2507c = this.f4170a;
        Object[] objArr = c2507c.f23496a;
        int iP = c2507c.p();
        for (int i10 = 0; i10 < iP; i10++) {
            ((C1303m) objArr[i10]).h(j10, c6546l);
        }
    }

    public void i(e.c cVar) {
        this.f4171b.n();
        this.f4171b.k(this);
        while (this.f4171b.g()) {
            C1304n c1304n = (C1304n) this.f4171b.r(r0.d() - 1);
            int i10 = 0;
            while (i10 < c1304n.f4170a.p()) {
                C1303m c1303m = (C1303m) c1304n.f4170a.f23496a[i10];
                if (AbstractC5504s.c(c1303m.k(), cVar)) {
                    c1304n.f4170a.w(c1303m);
                    c1303m.d();
                } else {
                    this.f4171b.k(c1303m);
                    i10++;
                }
            }
        }
    }
}
