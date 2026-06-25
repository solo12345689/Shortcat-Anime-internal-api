package m1;

import java.util.Arrays;
import java.util.Comparator;
import m1.C5623b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class h extends C5623b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f53000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f53001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53002j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f53003k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    C5624c f53004l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f53012c - iVar2.f53012c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f53006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f53007b;

        b(h hVar) {
            this.f53007b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f53006a.f53010a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f53018i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f53006a.f53018i[i10] = f12;
                    } else {
                        this.f53006a.f53018i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f53006a.f53018i;
                float f13 = fArr[i11] + (iVar.f53018i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f53006a.f53018i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f53006a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f53006a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f53006a.f53018i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f53018i[i10];
                float f11 = this.f53006a.f53018i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f53006a.f53018i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f53006a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f53006a.f53018i[i10] + " ";
                }
            }
            return str + "] " + this.f53006a;
        }
    }

    public h(C5624c c5624c) {
        super(c5624c);
        this.f52999g = 128;
        this.f53000h = new i[128];
        this.f53001i = new i[128];
        this.f53002j = 0;
        this.f53003k = new b(this);
        this.f53004l = c5624c;
    }

    private void F(i iVar) {
        int i10;
        int i11 = this.f53002j + 1;
        i[] iVarArr = this.f53000h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f53000h = iVarArr2;
            this.f53001i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f53000h;
        int i12 = this.f53002j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f53002j = i13;
        if (i13 > 1 && iVarArr3[i12].f53012c > iVar.f53012c) {
            int i14 = 0;
            while (true) {
                i10 = this.f53002j;
                if (i14 >= i10) {
                    break;
                }
                this.f53001i[i14] = this.f53000h[i14];
                i14++;
            }
            Arrays.sort(this.f53001i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f53002j; i15++) {
                this.f53000h[i15] = this.f53001i[i15];
            }
        }
        iVar.f53010a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f53002j) {
            if (this.f53000h[i10] == iVar) {
                while (true) {
                    int i11 = this.f53002j;
                    if (i10 >= i11 - 1) {
                        this.f53002j = i11 - 1;
                        iVar.f53010a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f53000h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // m1.C5623b
    public void B(C5625d c5625d, C5623b c5623b, boolean z10) {
        i iVar = c5623b.f52962a;
        if (iVar == null) {
            return;
        }
        C5623b.a aVar = c5623b.f52966e;
        int iF = aVar.f();
        for (int i10 = 0; i10 < iF; i10++) {
            i iVarA = aVar.a(i10);
            float fI = aVar.i(i10);
            this.f53003k.b(iVarA);
            if (this.f53003k.a(iVar, fI)) {
                F(iVarA);
            }
            this.f52963b += c5623b.f52963b * fI;
        }
        G(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // m1.C5623b, m1.C5625d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m1.i a(m1.C5625d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f53002j
            if (r0 >= r2) goto L32
            m1.i[] r2 = r4.f53000h
            r2 = r2[r0]
            int r3 = r2.f53012c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            m1.h$b r3 = r4.f53003k
            r3.b(r2)
            if (r1 != r5) goto L22
            m1.h$b r2 = r4.f53003k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            m1.h$b r2 = r4.f53003k
            m1.i[] r3 = r4.f53000h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            m1.i[] r5 = r4.f53000h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.h.a(m1.d, boolean[]):m1.i");
    }

    @Override // m1.C5623b, m1.C5625d.a
    public void c(i iVar) {
        this.f53003k.b(iVar);
        this.f53003k.e();
        iVar.f53018i[iVar.f53014e] = 1.0f;
        F(iVar);
    }

    @Override // m1.C5623b, m1.C5625d.a
    public void clear() {
        this.f53002j = 0;
        this.f52963b = 0.0f;
    }

    @Override // m1.C5623b, m1.C5625d.a
    public boolean isEmpty() {
        return this.f53002j == 0;
    }

    @Override // m1.C5623b
    public String toString() {
        String str = " goal -> (" + this.f52963b + ") : ";
        for (int i10 = 0; i10 < this.f53002j; i10++) {
            this.f53003k.b(this.f53000h[i10]);
            str = str + this.f53003k + " ";
        }
        return str;
    }
}
