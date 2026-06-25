package m1;

import java.util.Arrays;
import java.util.HashMap;
import m1.i;
import t1.C6591d;
import t1.C6592e;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5625d {

    /* JADX INFO: renamed from: s */
    public static boolean f52972s = false;

    /* JADX INFO: renamed from: t */
    public static boolean f52973t = true;

    /* JADX INFO: renamed from: u */
    public static boolean f52974u = true;

    /* JADX INFO: renamed from: v */
    public static boolean f52975v = true;

    /* JADX INFO: renamed from: w */
    public static boolean f52976w = false;

    /* JADX INFO: renamed from: x */
    public static long f52977x;

    /* JADX INFO: renamed from: y */
    public static long f52978y;

    /* JADX INFO: renamed from: e */
    private a f52983e;

    /* JADX INFO: renamed from: o */
    final C5624c f52993o;

    /* JADX INFO: renamed from: r */
    private a f52996r;

    /* JADX INFO: renamed from: a */
    private int f52979a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f52980b = false;

    /* JADX INFO: renamed from: c */
    int f52981c = 0;

    /* JADX INFO: renamed from: d */
    private HashMap f52982d = null;

    /* JADX INFO: renamed from: f */
    private int f52984f = 32;

    /* JADX INFO: renamed from: g */
    private int f52985g = 32;

    /* JADX INFO: renamed from: i */
    public boolean f52987i = false;

    /* JADX INFO: renamed from: j */
    public boolean f52988j = false;

    /* JADX INFO: renamed from: k */
    private boolean[] f52989k = new boolean[32];

    /* JADX INFO: renamed from: l */
    int f52990l = 1;

    /* JADX INFO: renamed from: m */
    int f52991m = 0;

    /* JADX INFO: renamed from: n */
    private int f52992n = 32;

    /* JADX INFO: renamed from: p */
    private i[] f52994p = new i[1000];

    /* JADX INFO: renamed from: q */
    private int f52995q = 0;

    /* JADX INFO: renamed from: h */
    C5623b[] f52986h = new C5623b[32];

    /* JADX INFO: renamed from: m1.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface a {
        i a(C5625d c5625d, boolean[] zArr);

        void b(a aVar);

        void c(i iVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: renamed from: m1.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class b extends C5623b {
        b(C5624c c5624c) {
            this.f52966e = new j(this, c5624c);
        }
    }

    public C5625d() {
        C();
        C5624c c5624c = new C5624c();
        this.f52993o = c5624c;
        this.f52983e = new h(c5624c);
        if (f52976w) {
            this.f52996r = new b(c5624c);
        } else {
            this.f52996r = new C5623b(c5624c);
        }
    }

    private int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f52990l; i10++) {
            this.f52989k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 < this.f52990l * 2) {
                if (aVar.getKey() != null) {
                    this.f52989k[aVar.getKey().f53012c] = true;
                }
                i iVarA = aVar.a(this, this.f52989k);
                if (iVarA != null) {
                    boolean[] zArr = this.f52989k;
                    int i12 = iVarA.f53012c;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    }
                }
                if (iVarA != null) {
                    float f10 = Float.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < this.f52991m; i14++) {
                        C5623b c5623b = this.f52986h[i14];
                        if (c5623b.f52962a.f53019j != i.a.UNRESTRICTED && !c5623b.f52967f && c5623b.t(iVarA)) {
                            float fK = c5623b.f52966e.k(iVarA);
                            if (fK < 0.0f) {
                                float f11 = (-c5623b.f52963b) / fK;
                                if (f11 < f10) {
                                    i13 = i14;
                                    f10 = f11;
                                }
                            }
                        }
                    }
                    if (i13 > -1) {
                        C5623b c5623b2 = this.f52986h[i13];
                        c5623b2.f52962a.f53013d = -1;
                        c5623b2.x(iVarA);
                        i iVar = c5623b2.f52962a;
                        iVar.f53013d = i13;
                        iVar.p(this, c5623b2);
                    }
                } else {
                    z11 = true;
                }
            }
            return i11;
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f52976w) {
            while (i10 < this.f52991m) {
                C5623b c5623b = this.f52986h[i10];
                if (c5623b != null) {
                    this.f52993o.f52968a.a(c5623b);
                }
                this.f52986h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f52991m) {
            C5623b c5623b2 = this.f52986h[i10];
            if (c5623b2 != null) {
                this.f52993o.f52969b.a(c5623b2);
            }
            this.f52986h[i10] = null;
            i10++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVar = (i) this.f52993o.f52970c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.n(aVar, str);
        } else {
            iVar.k();
            iVar.n(aVar, str);
        }
        int i10 = this.f52995q;
        int i11 = this.f52979a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f52979a = i12;
            this.f52994p = (i[]) Arrays.copyOf(this.f52994p, i12);
        }
        i[] iVarArr = this.f52994p;
        int i13 = this.f52995q;
        this.f52995q = i13 + 1;
        iVarArr[i13] = iVar;
        return iVar;
    }

    private void l(C5623b c5623b) {
        int i10;
        if (f52974u && c5623b.f52967f) {
            c5623b.f52962a.m(this, c5623b.f52963b);
        } else {
            C5623b[] c5623bArr = this.f52986h;
            int i11 = this.f52991m;
            c5623bArr[i11] = c5623b;
            i iVar = c5623b.f52962a;
            iVar.f53013d = i11;
            this.f52991m = i11 + 1;
            iVar.p(this, c5623b);
        }
        if (f52974u && this.f52980b) {
            int i12 = 0;
            while (i12 < this.f52991m) {
                if (this.f52986h[i12] == null) {
                    System.out.println("WTF");
                }
                C5623b c5623b2 = this.f52986h[i12];
                if (c5623b2 != null && c5623b2.f52967f) {
                    c5623b2.f52962a.m(this, c5623b2.f52963b);
                    if (f52976w) {
                        this.f52993o.f52968a.a(c5623b2);
                    } else {
                        this.f52993o.f52969b.a(c5623b2);
                    }
                    this.f52986h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f52991m;
                        if (i13 >= i10) {
                            break;
                        }
                        C5623b[] c5623bArr2 = this.f52986h;
                        int i15 = i13 - 1;
                        C5623b c5623b3 = c5623bArr2[i13];
                        c5623bArr2[i15] = c5623b3;
                        i iVar2 = c5623b3.f52962a;
                        if (iVar2.f53013d == i13) {
                            iVar2.f53013d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f52986h[i14] = null;
                    }
                    this.f52991m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f52980b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f52991m; i10++) {
            C5623b c5623b = this.f52986h[i10];
            c5623b.f52962a.f53015f = c5623b.f52963b;
        }
    }

    public static C5623b s(C5625d c5625d, i iVar, i iVar2, float f10) {
        return c5625d.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        float f10;
        float f11;
        for (int i10 = 0; i10 < this.f52991m; i10++) {
            C5623b c5623b = this.f52986h[i10];
            if (c5623b.f52962a.f53019j != i.a.UNRESTRICTED) {
                float f12 = 0.0f;
                if (c5623b.f52963b < 0.0f) {
                    boolean z10 = false;
                    int i11 = 0;
                    while (!z10) {
                        i11++;
                        float f13 = Float.MAX_VALUE;
                        int i12 = 0;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        while (true) {
                            if (i12 >= this.f52991m) {
                                break;
                            }
                            C5623b c5623b2 = this.f52986h[i12];
                            if (c5623b2.f52962a.f53019j == i.a.UNRESTRICTED || c5623b2.f52967f || c5623b2.f52963b >= f12) {
                                f10 = f12;
                            } else if (f52975v) {
                                int iF = c5623b2.f52966e.f();
                                int i16 = 0;
                                while (i16 < iF) {
                                    i iVarA = c5623b2.f52966e.a(i16);
                                    float fK = c5623b2.f52966e.k(iVarA);
                                    if (fK <= f12) {
                                        f11 = f12;
                                    } else {
                                        f11 = f12;
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f14 = iVarA.f53017h[i17] / fK;
                                            if ((f14 < f13 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i14 = iVarA.f53012c;
                                                i13 = i12;
                                                f13 = f14;
                                            }
                                        }
                                    }
                                    i16++;
                                    f12 = f11;
                                }
                                f10 = f12;
                            } else {
                                f10 = f12;
                                for (int i18 = 1; i18 < this.f52990l; i18++) {
                                    i iVar = this.f52993o.f52971d[i18];
                                    float fK2 = c5623b2.f52966e.k(iVar);
                                    if (fK2 > f10) {
                                        for (int i19 = 0; i19 < 9; i19++) {
                                            float f15 = iVar.f53017h[i19] / fK2;
                                            if ((f15 < f13 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i13 = i12;
                                                i14 = i18;
                                                f13 = f15;
                                            }
                                        }
                                    }
                                }
                            }
                            i12++;
                            f12 = f10;
                        }
                        float f16 = f12;
                        if (i13 != -1) {
                            C5623b c5623b3 = this.f52986h[i13];
                            c5623b3.f52962a.f53013d = -1;
                            c5623b3.x(this.f52993o.f52971d[i14]);
                            i iVar2 = c5623b3.f52962a;
                            iVar2.f53013d = i13;
                            iVar2.p(this, c5623b3);
                        } else {
                            z10 = true;
                        }
                        if (i11 > this.f52990l / 2) {
                            z10 = true;
                        }
                        f12 = f16;
                    }
                    return i11;
                }
            }
        }
        return 0;
    }

    public static AbstractC5626e w() {
        return null;
    }

    private void y() {
        int i10 = this.f52984f * 2;
        this.f52984f = i10;
        this.f52986h = (C5623b[]) Arrays.copyOf(this.f52986h, i10);
        C5624c c5624c = this.f52993o;
        c5624c.f52971d = (i[]) Arrays.copyOf(c5624c.f52971d, this.f52984f);
        int i11 = this.f52984f;
        this.f52989k = new boolean[i11];
        this.f52985g = i11;
        this.f52992n = i11;
    }

    void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        C5624c c5624c;
        int i10 = 0;
        while (true) {
            c5624c = this.f52993o;
            i[] iVarArr = c5624c.f52971d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.k();
            }
            i10++;
        }
        c5624c.f52970c.c(this.f52994p, this.f52995q);
        this.f52995q = 0;
        Arrays.fill(this.f52993o.f52971d, (Object) null);
        HashMap map = this.f52982d;
        if (map != null) {
            map.clear();
        }
        this.f52981c = 0;
        this.f52983e.clear();
        this.f52990l = 1;
        for (int i11 = 0; i11 < this.f52991m; i11++) {
            C5623b c5623b = this.f52986h[i11];
            if (c5623b != null) {
                c5623b.f52964c = false;
            }
        }
        C();
        this.f52991m = 0;
        if (f52976w) {
            this.f52996r = new b(this.f52993o);
        } else {
            this.f52996r = new C5623b(this.f52993o);
        }
    }

    public void b(C6592e c6592e, C6592e c6592e2, float f10, int i10) {
        C6591d.a aVar = C6591d.a.LEFT;
        i iVarQ = q(c6592e.o(aVar));
        C6591d.a aVar2 = C6591d.a.TOP;
        i iVarQ2 = q(c6592e.o(aVar2));
        C6591d.a aVar3 = C6591d.a.RIGHT;
        i iVarQ3 = q(c6592e.o(aVar3));
        C6591d.a aVar4 = C6591d.a.BOTTOM;
        i iVarQ4 = q(c6592e.o(aVar4));
        i iVarQ5 = q(c6592e2.o(aVar));
        i iVarQ6 = q(c6592e2.o(aVar2));
        i iVarQ7 = q(c6592e2.o(aVar3));
        i iVarQ8 = q(c6592e2.o(aVar4));
        C5623b c5623bR = r();
        double d10 = f10;
        double d11 = i10;
        c5623bR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d10) * d11));
        d(c5623bR);
        C5623b c5623bR2 = r();
        c5623bR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d10) * d11));
        d(c5623bR2);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        C5623b c5623bR = r();
        c5623bR.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            c5623bR.d(this, i12);
        }
        d(c5623bR);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(m1.C5623b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            goto L8a
        L4:
            int r0 = r5.f52991m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f52992n
            if (r0 >= r2) goto L13
            int r0 = r5.f52990l
            int r0 = r0 + r1
            int r2 = r5.f52985g
            if (r0 < r2) goto L16
        L13:
            r5.y()
        L16:
            boolean r0 = r6.f52967f
            r2 = 0
            if (r0 != 0) goto L85
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L25
            goto L8a
        L25:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L7c
            m1.i r0 = r5.p()
            r6.f52962a = r0
            int r3 = r5.f52991m
            r5.l(r6)
            int r4 = r5.f52991m
            int r3 = r3 + r1
            if (r4 != r3) goto L7c
            m1.d$a r2 = r5.f52996r
            r2.b(r6)
            m1.d$a r2 = r5.f52996r
            r5.B(r2, r1)
            int r2 = r0.f53013d
            r3 = -1
            if (r2 != r3) goto L7d
            m1.i r2 = r6.f52962a
            if (r2 != r0) goto L5a
            m1.i r0 = r6.v(r0)
            if (r0 == 0) goto L5a
            r6.x(r0)
        L5a:
            boolean r0 = r6.f52967f
            if (r0 != 0) goto L63
            m1.i r0 = r6.f52962a
            r0.p(r5, r6)
        L63:
            boolean r0 = m1.C5625d.f52976w
            if (r0 == 0) goto L6f
            m1.c r0 = r5.f52993o
            m1.f r0 = r0.f52968a
            r0.a(r6)
            goto L76
        L6f:
            m1.c r0 = r5.f52993o
            m1.f r0 = r0.f52969b
            r0.a(r6)
        L76:
            int r0 = r5.f52991m
            int r0 = r0 - r1
            r5.f52991m = r0
            goto L7d
        L7c:
            r1 = r2
        L7d:
            boolean r0 = r6.s()
            if (r0 != 0) goto L84
            goto L8a
        L84:
            r2 = r1
        L85:
            if (r2 != 0) goto L8a
            r5.l(r6)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C5625d.d(m1.b):void");
    }

    public C5623b e(i iVar, i iVar2, int i10, int i11) {
        if (f52973t && i11 == 8 && iVar2.f53016g && iVar.f53013d == -1) {
            iVar.m(this, iVar2.f53015f + i10);
            return null;
        }
        C5623b c5623bR = r();
        c5623bR.n(iVar, iVar2, i10);
        if (i11 != 8) {
            c5623bR.d(this, i11);
        }
        d(c5623bR);
        return c5623bR;
    }

    public void f(i iVar, int i10) {
        if (f52973t && iVar.f53013d == -1) {
            float f10 = i10;
            iVar.m(this, f10);
            for (int i11 = 0; i11 < this.f52981c + 1; i11++) {
                i iVar2 = this.f52993o.f52971d[i11];
                if (iVar2 != null && iVar2.f53023n && iVar2.f53024o == iVar.f53012c) {
                    iVar2.m(this, iVar2.f53025p + f10);
                }
            }
            return;
        }
        int i12 = iVar.f53013d;
        if (i12 == -1) {
            C5623b c5623bR = r();
            c5623bR.i(iVar, i10);
            d(c5623bR);
            return;
        }
        C5623b c5623b = this.f52986h[i12];
        if (c5623b.f52967f) {
            c5623b.f52963b = i10;
            return;
        }
        if (c5623b.f52966e.f() == 0) {
            c5623b.f52967f = true;
            c5623b.f52963b = i10;
        } else {
            C5623b c5623bR2 = r();
            c5623bR2.m(iVar, i10);
            d(c5623bR2);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        C5623b c5623bR = r();
        i iVarT = t();
        iVarT.f53014e = 0;
        c5623bR.o(iVar, iVar2, iVarT, i10);
        d(c5623bR);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        C5623b c5623bR = r();
        i iVarT = t();
        iVarT.f53014e = 0;
        c5623bR.o(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(c5623bR, (int) (c5623bR.f52966e.k(iVarT) * (-1.0f)), i11);
        }
        d(c5623bR);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        C5623b c5623bR = r();
        i iVarT = t();
        iVarT.f53014e = 0;
        c5623bR.p(iVar, iVar2, iVarT, i10);
        d(c5623bR);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        C5623b c5623bR = r();
        i iVarT = t();
        iVarT.f53014e = 0;
        c5623bR.p(iVar, iVar2, iVarT, i10);
        if (i11 != 8) {
            m(c5623bR, (int) (c5623bR.f52966e.k(iVarT) * (-1.0f)), i11);
        }
        d(c5623bR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        C5623b c5623bR = r();
        c5623bR.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            c5623bR.d(this, i10);
        }
        d(c5623bR);
    }

    void m(C5623b c5623b, int i10, int i11) {
        c5623b.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f52990l + 1 >= this.f52985g) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i11 = this.f52981c + 1;
        this.f52981c = i11;
        this.f52990l++;
        iVarA.f53012c = i11;
        iVarA.f53014e = i10;
        this.f52993o.f52971d[i11] = iVarA;
        this.f52983e.c(iVarA);
        return iVarA;
    }

    public i p() {
        if (this.f52990l + 1 >= this.f52985g) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f52981c + 1;
        this.f52981c = i10;
        this.f52990l++;
        iVarA.f53012c = i10;
        this.f52993o.f52971d[i10] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarI = null;
        if (obj == null) {
            return null;
        }
        if (this.f52990l + 1 >= this.f52985g) {
            y();
        }
        if (obj instanceof C6591d) {
            C6591d c6591d = (C6591d) obj;
            iVarI = c6591d.i();
            if (iVarI == null) {
                c6591d.s(this.f52993o);
                iVarI = c6591d.i();
            }
            int i10 = iVarI.f53012c;
            if (i10 != -1 && i10 <= this.f52981c && this.f52993o.f52971d[i10] != null) {
                return iVarI;
            }
            if (i10 != -1) {
                iVarI.k();
            }
            int i11 = this.f52981c + 1;
            this.f52981c = i11;
            this.f52990l++;
            iVarI.f53012c = i11;
            iVarI.f53019j = i.a.UNRESTRICTED;
            this.f52993o.f52971d[i11] = iVarI;
        }
        return iVarI;
    }

    public C5623b r() {
        C5623b c5623b;
        if (f52976w) {
            c5623b = (C5623b) this.f52993o.f52968a.b();
            if (c5623b == null) {
                c5623b = new b(this.f52993o);
                f52978y++;
            } else {
                c5623b.y();
            }
        } else {
            c5623b = (C5623b) this.f52993o.f52969b.b();
            if (c5623b == null) {
                c5623b = new C5623b(this.f52993o);
                f52977x++;
            } else {
                c5623b.y();
            }
        }
        i.c();
        return c5623b;
    }

    public i t() {
        if (this.f52990l + 1 >= this.f52985g) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i10 = this.f52981c + 1;
        this.f52981c = i10;
        this.f52990l++;
        iVarA.f53012c = i10;
        this.f52993o.f52971d[i10] = iVarA;
        return iVarA;
    }

    public C5624c v() {
        return this.f52993o;
    }

    public int x(Object obj) {
        i iVarI = ((C6591d) obj).i();
        if (iVarI != null) {
            return (int) (iVarI.f53015f + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (this.f52983e.isEmpty()) {
            n();
            return;
        }
        if (!this.f52987i && !this.f52988j) {
            A(this.f52983e);
            return;
        }
        for (int i10 = 0; i10 < this.f52991m; i10++) {
            if (!this.f52986h[i10].f52967f) {
                A(this.f52983e);
                return;
            }
        }
        n();
    }
}
