package m1;

import java.util.ArrayList;
import m1.C5625d;
import m1.i;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5623b implements C5625d.a {

    /* JADX INFO: renamed from: e */
    public a f52966e;

    /* JADX INFO: renamed from: a */
    i f52962a = null;

    /* JADX INFO: renamed from: b */
    float f52963b = 0.0f;

    /* JADX INFO: renamed from: c */
    boolean f52964c = false;

    /* JADX INFO: renamed from: d */
    ArrayList f52965d = new ArrayList();

    /* JADX INFO: renamed from: f */
    boolean f52967f = false;

    /* JADX INFO: renamed from: m1.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        i a(int i10);

        float b(C5623b c5623b, boolean z10);

        void c();

        void clear();

        void d(i iVar, float f10, boolean z10);

        boolean e(i iVar);

        int f();

        void g(i iVar, float f10);

        float h(i iVar, boolean z10);

        float i(int i10);

        void j(float f10);

        float k(i iVar);
    }

    public C5623b() {
    }

    private boolean u(i iVar, C5625d c5625d) {
        return iVar.f53022m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iF = this.f52966e.f();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iF; i10++) {
            float fI = this.f52966e.i(i10);
            if (fI < 0.0f) {
                i iVarA = this.f52966e.a(i10);
                if ((zArr == null || !zArr[iVarA.f53012c]) && iVarA != iVar && (((aVar = iVarA.f53019j) == i.a.SLACK || aVar == i.a.ERROR) && fI < f10)) {
                    f10 = fI;
                    iVar2 = iVarA;
                }
            }
        }
        return iVar2;
    }

    public void A(C5625d c5625d, i iVar, boolean z10) {
        if (iVar == null || !iVar.f53016g) {
            return;
        }
        this.f52963b += iVar.f53015f * this.f52966e.k(iVar);
        this.f52966e.h(iVar, z10);
        if (z10) {
            iVar.h(this);
        }
        if (C5625d.f52974u && this.f52966e.f() == 0) {
            this.f52967f = true;
            c5625d.f52980b = true;
        }
    }

    public void B(C5625d c5625d, C5623b c5623b, boolean z10) {
        this.f52963b += c5623b.f52963b * this.f52966e.b(c5623b, z10);
        if (z10) {
            c5623b.f52962a.h(this);
        }
        if (C5625d.f52974u && this.f52962a != null && this.f52966e.f() == 0) {
            this.f52967f = true;
            c5625d.f52980b = true;
        }
    }

    public void C(C5625d c5625d, i iVar, boolean z10) {
        if (iVar == null || !iVar.f53023n) {
            return;
        }
        float fK = this.f52966e.k(iVar);
        this.f52963b += iVar.f53025p * fK;
        this.f52966e.h(iVar, z10);
        if (z10) {
            iVar.h(this);
        }
        this.f52966e.d(c5625d.f52993o.f52971d[iVar.f53024o], fK, z10);
        if (C5625d.f52974u && this.f52966e.f() == 0) {
            this.f52967f = true;
            c5625d.f52980b = true;
        }
    }

    public void D(C5625d c5625d) {
        if (c5625d.f52986h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iF = this.f52966e.f();
            for (int i10 = 0; i10 < iF; i10++) {
                i iVarA = this.f52966e.a(i10);
                if (iVarA.f53013d != -1 || iVarA.f53016g || iVarA.f53023n) {
                    this.f52965d.add(iVarA);
                }
            }
            int size = this.f52965d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = (i) this.f52965d.get(i11);
                    if (iVar.f53016g) {
                        A(c5625d, iVar, true);
                    } else if (iVar.f53023n) {
                        C(c5625d, iVar, true);
                    } else {
                        B(c5625d, c5625d.f52986h[iVar.f53013d], true);
                    }
                }
                this.f52965d.clear();
            } else {
                z10 = true;
            }
        }
        if (C5625d.f52974u && this.f52962a != null && this.f52966e.f() == 0) {
            this.f52967f = true;
            c5625d.f52980b = true;
        }
    }

    @Override // m1.C5625d.a
    public i a(C5625d c5625d, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // m1.C5625d.a
    public void b(C5625d.a aVar) {
        if (aVar instanceof C5623b) {
            C5623b c5623b = (C5623b) aVar;
            this.f52962a = null;
            this.f52966e.clear();
            for (int i10 = 0; i10 < c5623b.f52966e.f(); i10++) {
                this.f52966e.d(c5623b.f52966e.a(i10), c5623b.f52966e.i(i10), true);
            }
        }
    }

    @Override // m1.C5625d.a
    public void c(i iVar) {
        int i10 = iVar.f53014e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f52966e.g(iVar, f10);
    }

    @Override // m1.C5625d.a
    public void clear() {
        this.f52966e.clear();
        this.f52962a = null;
        this.f52963b = 0.0f;
    }

    public C5623b d(C5625d c5625d, int i10) {
        this.f52966e.g(c5625d.o(i10, "ep"), 1.0f);
        this.f52966e.g(c5625d.o(i10, "em"), -1.0f);
        return this;
    }

    C5623b e(i iVar, int i10) {
        this.f52966e.g(iVar, i10);
        return this;
    }

    boolean f(C5625d c5625d) {
        boolean z10;
        i iVarG = g(c5625d);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f52966e.f() == 0) {
            this.f52967f = true;
        }
        return z10;
    }

    i g(C5625d c5625d) {
        int iF = this.f52966e.f();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < iF; i10++) {
            float fI = this.f52966e.i(i10);
            i iVarA = this.f52966e.a(i10);
            if (iVarA.f53019j == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fI) {
                    boolean zU = u(iVarA, c5625d);
                    z10 = zU;
                    f10 = fI;
                    iVar = iVarA;
                } else if (!z10 && u(iVarA, c5625d)) {
                    f10 = fI;
                    iVar = iVarA;
                    z10 = true;
                }
            } else if (iVar == null && fI < 0.0f) {
                if (iVar2 == null || f11 > fI) {
                    boolean zU2 = u(iVarA, c5625d);
                    z11 = zU2;
                    f11 = fI;
                    iVar2 = iVarA;
                } else if (!z11 && u(iVarA, c5625d)) {
                    f11 = fI;
                    iVar2 = iVarA;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // m1.C5625d.a
    public i getKey() {
        return this.f52962a;
    }

    C5623b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar4, 1.0f);
            this.f52966e.g(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar2, -1.0f);
            this.f52966e.g(iVar3, -1.0f);
            this.f52966e.g(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f52963b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f52966e.g(iVar, -1.0f);
                this.f52966e.g(iVar2, 1.0f);
                this.f52963b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f52966e.g(iVar4, -1.0f);
                this.f52966e.g(iVar3, 1.0f);
                this.f52963b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f52966e.g(iVar, f11 * 1.0f);
            this.f52966e.g(iVar2, f11 * (-1.0f));
            this.f52966e.g(iVar3, (-1.0f) * f10);
            this.f52966e.g(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f52963b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    C5623b i(i iVar, int i10) {
        this.f52962a = iVar;
        float f10 = i10;
        iVar.f53015f = f10;
        this.f52963b = f10;
        this.f52967f = true;
        return this;
    }

    @Override // m1.C5625d.a
    public boolean isEmpty() {
        return this.f52962a == null && this.f52963b == 0.0f && this.f52966e.f() == 0;
    }

    C5623b j(i iVar, i iVar2, float f10) {
        this.f52966e.g(iVar, -1.0f);
        this.f52966e.g(iVar2, f10);
        return this;
    }

    public C5623b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f52966e.g(iVar, -1.0f);
        this.f52966e.g(iVar2, 1.0f);
        this.f52966e.g(iVar3, f10);
        this.f52966e.g(iVar4, -f10);
        return this;
    }

    public C5623b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f52963b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar2, -1.0f);
            this.f52966e.g(iVar4, 1.0f);
            this.f52966e.g(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f52966e.g(iVar3, 1.0f);
            this.f52966e.g(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f52966e.g(iVar, 1.0f);
        this.f52966e.g(iVar2, -1.0f);
        this.f52966e.g(iVar4, f13);
        this.f52966e.g(iVar3, -f13);
        return this;
    }

    public C5623b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f52963b = i10 * (-1);
            this.f52966e.g(iVar, 1.0f);
            return this;
        }
        this.f52963b = i10;
        this.f52966e.g(iVar, -1.0f);
        return this;
    }

    public C5623b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f52963b = i10;
        }
        if (z10) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar2, -1.0f);
            return this;
        }
        this.f52966e.g(iVar, -1.0f);
        this.f52966e.g(iVar2, 1.0f);
        return this;
    }

    public C5623b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f52963b = i10;
        }
        if (z10) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar2, -1.0f);
            this.f52966e.g(iVar3, -1.0f);
            return this;
        }
        this.f52966e.g(iVar, -1.0f);
        this.f52966e.g(iVar2, 1.0f);
        this.f52966e.g(iVar3, 1.0f);
        return this;
    }

    public C5623b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f52963b = i10;
        }
        if (z10) {
            this.f52966e.g(iVar, 1.0f);
            this.f52966e.g(iVar2, -1.0f);
            this.f52966e.g(iVar3, 1.0f);
            return this;
        }
        this.f52966e.g(iVar, -1.0f);
        this.f52966e.g(iVar2, 1.0f);
        this.f52966e.g(iVar3, -1.0f);
        return this;
    }

    public C5623b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f52966e.g(iVar3, 0.5f);
        this.f52966e.g(iVar4, 0.5f);
        this.f52966e.g(iVar, -0.5f);
        this.f52966e.g(iVar2, -0.5f);
        this.f52963b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f52963b;
        if (f10 < 0.0f) {
            this.f52963b = f10 * (-1.0f);
            this.f52966e.c();
        }
    }

    boolean s() {
        i iVar = this.f52962a;
        if (iVar != null) {
            return iVar.f53019j == i.a.UNRESTRICTED || this.f52963b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f52966e.e(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f52962a;
        if (iVar2 != null) {
            this.f52966e.g(iVar2, -1.0f);
            this.f52962a.f53013d = -1;
            this.f52962a = null;
        }
        float fH = this.f52966e.h(iVar, true) * (-1.0f);
        this.f52962a = iVar;
        if (fH == 1.0f) {
            return;
        }
        this.f52963b /= fH;
        this.f52966e.j(fH);
    }

    public void y() {
        this.f52962a = null;
        this.f52966e.clear();
        this.f52963b = 0.0f;
        this.f52967f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C5623b.z():java.lang.String");
    }

    public C5623b(C5624c c5624c) {
        this.f52966e = new C5622a(this, c5624c);
    }
}
