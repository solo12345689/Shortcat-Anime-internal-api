package E;

import Ud.AbstractC2279u;
import a0.C2507c;
import androidx.compose.foundation.lazy.layout.d;

/* JADX INFO: renamed from: E.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C1280a implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3870b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2507c f3871c = new C2507c(new d.b[16], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3872d;

    public C1280a(int i10) {
        this.f3869a = i10;
    }

    @Override // E.A
    public void a(F.I i10, int i11) {
        int i12 = this.f3869a;
        for (int i13 = 0; i13 < i12; i13++) {
            i10.a(i11 + i13);
        }
    }

    @Override // E.A
    public void c(z zVar, float f10, s sVar) {
        int iB;
        int index;
        C2507c c2507c;
        int iP;
        C2507c c2507c2;
        int iP2;
        C2507c c2507c3;
        int iP3;
        if (sVar.i().isEmpty()) {
            return;
        }
        int i10 = 0;
        boolean z10 = f10 < 0.0f;
        if (z10) {
            InterfaceC1290k interfaceC1290k = (InterfaceC1290k) AbstractC2279u.y0(sVar.i());
            iB = (sVar.a() == z.q.Vertical ? interfaceC1290k.b() : interfaceC1290k.getColumn()) + 1;
            index = ((InterfaceC1290k) AbstractC2279u.y0(sVar.i())).getIndex() + 1;
        } else {
            InterfaceC1290k interfaceC1290k2 = (InterfaceC1290k) AbstractC2279u.m0(sVar.i());
            iB = (sVar.a() == z.q.Vertical ? interfaceC1290k2.b() : interfaceC1290k2.getColumn()) - 1;
            index = ((InterfaceC1290k) AbstractC2279u.m0(sVar.i())).getIndex() - 1;
        }
        if (index < 0 || index >= sVar.g()) {
            return;
        }
        if (iB != this.f3870b) {
            if (this.f3872d != z10 && (iP3 = (c2507c3 = this.f3871c).p()) > 0) {
                Object[] objArrO = c2507c3.o();
                int i11 = 0;
                do {
                    ((d.b) objArrO[i11]).cancel();
                    i11++;
                } while (i11 < iP3);
            }
            this.f3872d = z10;
            this.f3870b = iB;
            this.f3871c.i();
            C2507c c2507c4 = this.f3871c;
            c2507c4.f(c2507c4.p(), zVar.a(iB));
        }
        if (!z10) {
            if (sVar.f() - A.e.a((InterfaceC1290k) AbstractC2279u.m0(sVar.i()), sVar.a()) >= f10 || (iP = (c2507c = this.f3871c).p()) <= 0) {
                return;
            }
            Object[] objArrO2 = c2507c.o();
            do {
                ((d.b) objArrO2[i10]).a();
                i10++;
            } while (i10 < iP);
            return;
        }
        InterfaceC1290k interfaceC1290k3 = (InterfaceC1290k) AbstractC2279u.y0(sVar.i());
        if (((A.e.a(interfaceC1290k3, sVar.a()) + A.e.b(interfaceC1290k3, sVar.a())) + sVar.h()) - sVar.d() >= (-f10) || (iP2 = (c2507c2 = this.f3871c).p()) <= 0) {
            return;
        }
        Object[] objArrO3 = c2507c2.o();
        do {
            ((d.b) objArrO3[i10]).a();
            i10++;
        } while (i10 < iP2);
    }

    @Override // E.A
    public void d(z zVar, s sVar) {
        int iB;
        if (this.f3870b == -1 || sVar.i().isEmpty()) {
            return;
        }
        if (this.f3872d) {
            InterfaceC1290k interfaceC1290k = (InterfaceC1290k) AbstractC2279u.y0(sVar.i());
            iB = (sVar.a() == z.q.Vertical ? interfaceC1290k.b() : interfaceC1290k.getColumn()) + 1;
        } else {
            InterfaceC1290k interfaceC1290k2 = (InterfaceC1290k) AbstractC2279u.m0(sVar.i());
            iB = (sVar.a() == z.q.Vertical ? interfaceC1290k2.b() : interfaceC1290k2.getColumn()) - 1;
        }
        if (this.f3870b != iB) {
            this.f3870b = -1;
            C2507c c2507c = this.f3871c;
            int iP = c2507c.p();
            if (iP > 0) {
                Object[] objArrO = c2507c.o();
                int i10 = 0;
                do {
                    ((d.b) objArrO[i10]).cancel();
                    i10++;
                } while (i10 < iP);
            }
            this.f3871c.i();
        }
    }
}
