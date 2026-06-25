package m1;

import java.util.Arrays;
import m1.C5623b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class j implements C5623b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f53033n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53034a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53035b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53036c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f53037d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f53038e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f53039f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f53040g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f53041h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f53042i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f53043j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f53044k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C5623b f53045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final C5624c f53046m;

    j(C5623b c5623b, C5624c c5624c) {
        this.f53045l = c5623b;
        this.f53046m = c5624c;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f53012c % this.f53036c;
        int[] iArr2 = this.f53037d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f53038e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f53038e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f53039f[i10] = iVar.f53012c;
        this.f53040g[i10] = f10;
        this.f53041h[i10] = -1;
        this.f53042i[i10] = -1;
        iVar.a(this.f53045l);
        iVar.f53022m++;
        this.f53043j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f53035b; i10++) {
            if (this.f53039f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f53035b * 2;
        this.f53039f = Arrays.copyOf(this.f53039f, i10);
        this.f53040g = Arrays.copyOf(this.f53040g, i10);
        this.f53041h = Arrays.copyOf(this.f53041h, i10);
        this.f53042i = Arrays.copyOf(this.f53042i, i10);
        this.f53038e = Arrays.copyOf(this.f53038e, i10);
        for (int i11 = this.f53035b; i11 < i10; i11++) {
            this.f53039f[i11] = -1;
            this.f53038e[i11] = -1;
        }
        this.f53035b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f53041h[iN] = i10;
            int[] iArr = this.f53042i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f53041h[iN] = -1;
            if (this.f53043j > 0) {
                this.f53042i[iN] = this.f53044k;
                this.f53044k = iN;
            } else {
                this.f53042i[iN] = -1;
            }
        }
        int i11 = this.f53042i[iN];
        if (i11 != -1) {
            this.f53041h[i11] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f53012c;
        int i12 = i11 % this.f53036c;
        int[] iArr2 = this.f53037d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f53039f[i13] == i11) {
            int[] iArr3 = this.f53038e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f53038e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f53039f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f53039f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // m1.C5623b.a
    public i a(int i10) {
        int i11 = this.f53043j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f53044k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f53046m.f52971d[this.f53039f[i12]];
            }
            i12 = this.f53042i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // m1.C5623b.a
    public float b(C5623b c5623b, boolean z10) {
        float fK = k(c5623b.f52962a);
        h(c5623b.f52962a, z10);
        j jVar = (j) c5623b.f52966e;
        int iF = jVar.f();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iF) {
            int i12 = jVar.f53039f[i11];
            if (i12 != -1) {
                d(this.f53046m.f52971d[i12], jVar.f53040g[i11] * fK, z10);
                i10++;
            }
            i11++;
        }
        return fK;
    }

    @Override // m1.C5623b.a
    public void c() {
        int i10 = this.f53043j;
        int i11 = this.f53044k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f53040g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f53042i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // m1.C5623b.a
    public void clear() {
        int i10 = this.f53043j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarA = a(i11);
            if (iVarA != null) {
                iVarA.h(this.f53045l);
            }
        }
        for (int i12 = 0; i12 < this.f53035b; i12++) {
            this.f53039f[i12] = -1;
            this.f53038e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f53036c; i13++) {
            this.f53037d[i13] = -1;
        }
        this.f53043j = 0;
        this.f53044k = -1;
    }

    @Override // m1.C5623b.a
    public void d(i iVar, float f10, boolean z10) {
        float f11 = f53033n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                g(iVar, f10);
                return;
            }
            float[] fArr = this.f53040g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f53033n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            h(iVar, z10);
        }
    }

    @Override // m1.C5623b.a
    public boolean e(i iVar) {
        return p(iVar) != -1;
    }

    @Override // m1.C5623b.a
    public int f() {
        return this.f53043j;
    }

    @Override // m1.C5623b.a
    public void g(i iVar, float f10) {
        float f11 = f53033n;
        if (f10 > (-f11) && f10 < f11) {
            h(iVar, true);
            return;
        }
        if (this.f53043j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f53044k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f53040g[iP] = f10;
            return;
        }
        if (this.f53043j + 1 >= this.f53035b) {
            o();
        }
        int i10 = this.f53043j;
        int i11 = this.f53044k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f53039f[i11];
            int i15 = iVar.f53012c;
            if (i14 == i15) {
                this.f53040g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f53042i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // m1.C5623b.a
    public float h(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f53040g[iP];
        if (this.f53044k == iP) {
            this.f53044k = this.f53042i[iP];
        }
        this.f53039f[iP] = -1;
        int[] iArr = this.f53041h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f53042i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f53042i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f53043j--;
        iVar.f53022m--;
        if (z10) {
            iVar.h(this.f53045l);
        }
        return f10;
    }

    @Override // m1.C5623b.a
    public float i(int i10) {
        int i11 = this.f53043j;
        int i12 = this.f53044k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f53040g[i12];
            }
            i12 = this.f53042i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // m1.C5623b.a
    public void j(float f10) {
        int i10 = this.f53043j;
        int i11 = this.f53044k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f53040g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f53042i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // m1.C5623b.a
    public float k(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f53040g[iP];
        }
        return 0.0f;
    }

    public int p(i iVar) {
        if (this.f53043j != 0 && iVar != null) {
            int i10 = iVar.f53012c;
            int i11 = this.f53037d[i10 % this.f53036c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f53039f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f53038e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f53039f[i11] != i10);
            if (i11 != -1 && this.f53039f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f53043j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarA = a(i11);
            if (iVarA != null) {
                String str2 = str + iVarA + " = " + i(i11) + " ";
                int iP = p(iVarA);
                String str3 = str2 + "[p: ";
                String str4 = (this.f53041h[iP] != -1 ? str3 + this.f53046m.f52971d[this.f53039f[this.f53041h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f53042i[iP] != -1 ? str4 + this.f53046m.f52971d[this.f53039f[this.f53042i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
