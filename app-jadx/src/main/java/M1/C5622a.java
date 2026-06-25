package m1;

import java.util.Arrays;
import m1.C5623b;

/* JADX INFO: renamed from: m1.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5622a implements C5623b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f52950l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5623b f52952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C5624c f52953c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f52951a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52954d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f52955e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f52956f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f52957g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f52958h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f52959i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52960j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f52961k = false;

    C5622a(C5623b c5623b, C5624c c5624c) {
        this.f52952b = c5623b;
        this.f52953c = c5624c;
    }

    @Override // m1.C5623b.a
    public i a(int i10) {
        int i11 = this.f52959i;
        for (int i12 = 0; i11 != -1 && i12 < this.f52951a; i12++) {
            if (i12 == i10) {
                return this.f52953c.f52971d[this.f52956f[i11]];
            }
            i11 = this.f52957g[i11];
        }
        return null;
    }

    @Override // m1.C5623b.a
    public float b(C5623b c5623b, boolean z10) {
        float fK = k(c5623b.f52962a);
        h(c5623b.f52962a, z10);
        C5623b.a aVar = c5623b.f52966e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarA = aVar.a(i10);
            d(iVarA, aVar.k(iVarA) * fK, z10);
        }
        return fK;
    }

    @Override // m1.C5623b.a
    public void c() {
        int i10 = this.f52959i;
        for (int i11 = 0; i10 != -1 && i11 < this.f52951a; i11++) {
            float[] fArr = this.f52958h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f52957g[i10];
        }
    }

    @Override // m1.C5623b.a
    public final void clear() {
        int i10 = this.f52959i;
        for (int i11 = 0; i10 != -1 && i11 < this.f52951a; i11++) {
            i iVar = this.f52953c.f52971d[this.f52956f[i10]];
            if (iVar != null) {
                iVar.h(this.f52952b);
            }
            i10 = this.f52957g[i10];
        }
        this.f52959i = -1;
        this.f52960j = -1;
        this.f52961k = false;
        this.f52951a = 0;
    }

    @Override // m1.C5623b.a
    public void d(i iVar, float f10, boolean z10) {
        float f11 = f52950l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f52959i;
            if (i10 == -1) {
                this.f52959i = 0;
                this.f52958h[0] = f10;
                this.f52956f[0] = iVar.f53012c;
                this.f52957g[0] = -1;
                iVar.f53022m++;
                iVar.a(this.f52952b);
                this.f52951a++;
                if (this.f52961k) {
                    return;
                }
                int i11 = this.f52960j + 1;
                this.f52960j = i11;
                int[] iArr = this.f52956f;
                if (i11 >= iArr.length) {
                    this.f52961k = true;
                    this.f52960j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f52951a; i13++) {
                int i14 = this.f52956f[i10];
                int i15 = iVar.f53012c;
                if (i14 == i15) {
                    float[] fArr = this.f52958h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f52950l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f52959i) {
                            this.f52959i = this.f52957g[i10];
                        } else {
                            int[] iArr2 = this.f52957g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.h(this.f52952b);
                        }
                        if (this.f52961k) {
                            this.f52960j = i10;
                        }
                        iVar.f53022m--;
                        this.f52951a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f52957g[i10];
            }
            int length = this.f52960j;
            int i16 = length + 1;
            if (this.f52961k) {
                int[] iArr3 = this.f52956f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f52956f;
            if (length >= iArr4.length && this.f52951a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f52956f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f52956f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f52954d * 2;
                this.f52954d = i18;
                this.f52961k = false;
                this.f52960j = length - 1;
                this.f52958h = Arrays.copyOf(this.f52958h, i18);
                this.f52956f = Arrays.copyOf(this.f52956f, this.f52954d);
                this.f52957g = Arrays.copyOf(this.f52957g, this.f52954d);
            }
            this.f52956f[length] = iVar.f53012c;
            this.f52958h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f52957g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f52957g[length] = this.f52959i;
                this.f52959i = length;
            }
            iVar.f53022m++;
            iVar.a(this.f52952b);
            this.f52951a++;
            if (!this.f52961k) {
                this.f52960j++;
            }
            int i19 = this.f52960j;
            int[] iArr8 = this.f52956f;
            if (i19 >= iArr8.length) {
                this.f52961k = true;
                this.f52960j = iArr8.length - 1;
            }
        }
    }

    @Override // m1.C5623b.a
    public boolean e(i iVar) {
        int i10 = this.f52959i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f52951a; i11++) {
            if (this.f52956f[i10] == iVar.f53012c) {
                return true;
            }
            i10 = this.f52957g[i10];
        }
        return false;
    }

    @Override // m1.C5623b.a
    public int f() {
        return this.f52951a;
    }

    @Override // m1.C5623b.a
    public final void g(i iVar, float f10) {
        if (f10 == 0.0f) {
            h(iVar, true);
            return;
        }
        int i10 = this.f52959i;
        if (i10 == -1) {
            this.f52959i = 0;
            this.f52958h[0] = f10;
            this.f52956f[0] = iVar.f53012c;
            this.f52957g[0] = -1;
            iVar.f53022m++;
            iVar.a(this.f52952b);
            this.f52951a++;
            if (this.f52961k) {
                return;
            }
            int i11 = this.f52960j + 1;
            this.f52960j = i11;
            int[] iArr = this.f52956f;
            if (i11 >= iArr.length) {
                this.f52961k = true;
                this.f52960j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f52951a; i13++) {
            int i14 = this.f52956f[i10];
            int i15 = iVar.f53012c;
            if (i14 == i15) {
                this.f52958h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f52957g[i10];
        }
        int length = this.f52960j;
        int i16 = length + 1;
        if (this.f52961k) {
            int[] iArr2 = this.f52956f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f52956f;
        if (length >= iArr3.length && this.f52951a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f52956f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f52956f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f52954d * 2;
            this.f52954d = i18;
            this.f52961k = false;
            this.f52960j = length - 1;
            this.f52958h = Arrays.copyOf(this.f52958h, i18);
            this.f52956f = Arrays.copyOf(this.f52956f, this.f52954d);
            this.f52957g = Arrays.copyOf(this.f52957g, this.f52954d);
        }
        this.f52956f[length] = iVar.f53012c;
        this.f52958h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f52957g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f52957g[length] = this.f52959i;
            this.f52959i = length;
        }
        iVar.f53022m++;
        iVar.a(this.f52952b);
        int i19 = this.f52951a + 1;
        this.f52951a = i19;
        if (!this.f52961k) {
            this.f52960j++;
        }
        int[] iArr7 = this.f52956f;
        if (i19 >= iArr7.length) {
            this.f52961k = true;
        }
        if (this.f52960j >= iArr7.length) {
            this.f52961k = true;
            this.f52960j = iArr7.length - 1;
        }
    }

    @Override // m1.C5623b.a
    public final float h(i iVar, boolean z10) {
        if (this.f52955e == iVar) {
            this.f52955e = null;
        }
        int i10 = this.f52959i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f52951a) {
            if (this.f52956f[i10] == iVar.f53012c) {
                if (i10 == this.f52959i) {
                    this.f52959i = this.f52957g[i10];
                } else {
                    int[] iArr = this.f52957g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.h(this.f52952b);
                }
                iVar.f53022m--;
                this.f52951a--;
                this.f52956f[i10] = -1;
                if (this.f52961k) {
                    this.f52960j = i10;
                }
                return this.f52958h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f52957g[i10];
        }
        return 0.0f;
    }

    @Override // m1.C5623b.a
    public float i(int i10) {
        int i11 = this.f52959i;
        for (int i12 = 0; i11 != -1 && i12 < this.f52951a; i12++) {
            if (i12 == i10) {
                return this.f52958h[i11];
            }
            i11 = this.f52957g[i11];
        }
        return 0.0f;
    }

    @Override // m1.C5623b.a
    public void j(float f10) {
        int i10 = this.f52959i;
        for (int i11 = 0; i10 != -1 && i11 < this.f52951a; i11++) {
            float[] fArr = this.f52958h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f52957g[i10];
        }
    }

    @Override // m1.C5623b.a
    public final float k(i iVar) {
        int i10 = this.f52959i;
        for (int i11 = 0; i10 != -1 && i11 < this.f52951a; i11++) {
            if (this.f52956f[i10] == iVar.f53012c) {
                return this.f52958h[i10];
            }
            i10 = this.f52957g[i10];
        }
        return 0.0f;
    }

    public String toString() {
        int i10 = this.f52959i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f52951a; i11++) {
            str = ((str + " -> ") + this.f52958h[i10] + " : ") + this.f52953c.f52971d[this.f52956f[i10]];
            i10 = this.f52957g[i10];
        }
        return str;
    }
}
