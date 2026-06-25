package u1;

import java.util.ArrayList;
import m1.C5625d;
import t1.AbstractC6598k;
import t1.AbstractC6599l;
import t1.C6591d;
import t1.C6592e;
import t1.C6593f;
import t1.C6595h;
import t1.InterfaceC6596i;

/* JADX INFO: renamed from: u1.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6718b {

    /* JADX INFO: renamed from: a */
    private final ArrayList f61123a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private a f61124b = new a();

    /* JADX INFO: renamed from: c */
    private C6593f f61125c;

    /* JADX INFO: renamed from: u1.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: k */
        public static int f61126k = 0;

        /* JADX INFO: renamed from: l */
        public static int f61127l = 1;

        /* JADX INFO: renamed from: m */
        public static int f61128m = 2;

        /* JADX INFO: renamed from: a */
        public C6592e.b f61129a;

        /* JADX INFO: renamed from: b */
        public C6592e.b f61130b;

        /* JADX INFO: renamed from: c */
        public int f61131c;

        /* JADX INFO: renamed from: d */
        public int f61132d;

        /* JADX INFO: renamed from: e */
        public int f61133e;

        /* JADX INFO: renamed from: f */
        public int f61134f;

        /* JADX INFO: renamed from: g */
        public int f61135g;

        /* JADX INFO: renamed from: h */
        public boolean f61136h;

        /* JADX INFO: renamed from: i */
        public boolean f61137i;

        /* JADX INFO: renamed from: j */
        public int f61138j;
    }

    /* JADX INFO: renamed from: u1.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface InterfaceC0913b {
        void a();

        void b(C6592e c6592e, a aVar);
    }

    public C6718b(C6593f c6593f) {
        this.f61125c = c6593f;
    }

    private boolean a(InterfaceC0913b interfaceC0913b, C6592e c6592e, int i10) {
        this.f61124b.f61129a = c6592e.A();
        this.f61124b.f61130b = c6592e.S();
        this.f61124b.f61131c = c6592e.V();
        this.f61124b.f61132d = c6592e.x();
        a aVar = this.f61124b;
        aVar.f61137i = false;
        aVar.f61138j = i10;
        C6592e.b bVar = aVar.f61129a;
        C6592e.b bVar2 = C6592e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f61130b == bVar2;
        boolean z12 = z10 && c6592e.f60360d0 > 0.0f;
        boolean z13 = z11 && c6592e.f60360d0 > 0.0f;
        if (z12 && c6592e.f60401y[0] == 4) {
            aVar.f61129a = C6592e.b.FIXED;
        }
        if (z13 && c6592e.f60401y[1] == 4) {
            aVar.f61130b = C6592e.b.FIXED;
        }
        interfaceC0913b.b(c6592e, aVar);
        c6592e.g1(this.f61124b.f61133e);
        c6592e.H0(this.f61124b.f61134f);
        c6592e.G0(this.f61124b.f61136h);
        c6592e.w0(this.f61124b.f61135g);
        a aVar2 = this.f61124b;
        aVar2.f61138j = a.f61126k;
        return aVar2.f61137i;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:102:0x0061, B:104:0x0067, B:106:0x006b, B:124:0x0094, B:122:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(t1.C6593f r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = r13.f60509L0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.Q1(r1)
            u1.b$b r2 = r13.F1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList r5 = r13.f60509L0
            java.lang.Object r5 = r5.get(r4)
            t1.e r5 = (t1.C6592e) r5
            boolean r6 = r5 instanceof t1.C6595h
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof t1.C6588a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.k0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            u1.l r6 = r5.f60361e
            if (r6 == 0) goto L47
            u1.n r7 = r5.f60363f
            if (r7 == 0) goto L47
            u1.g r6 = r6.f61206e
            boolean r6 = r6.f61159j
            if (r6 == 0) goto L47
            u1.g r6 = r7.f61206e
            boolean r6 = r6.f61159j
            if (r6 == 0) goto L47
            goto La0
        L47:
            t1.e$b r6 = r5.u(r3)
            r7 = 1
            t1.e$b r8 = r5.u(r7)
            t1.e$b r9 = t1.C6592e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f60397w
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f60399x
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.Q1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof t1.AbstractC6599l
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f60397w
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.h0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f60399x
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.h0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f60360d0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = u1.C6718b.a.f61126k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C6718b.b(t1.f):void");
    }

    private void c(C6593f c6593f, String str, int i10, int i11, int i12) {
        c6593f.getClass();
        int iJ = c6593f.J();
        int I10 = c6593f.I();
        c6593f.W0(0);
        c6593f.V0(0);
        c6593f.g1(i11);
        c6593f.H0(i12);
        c6593f.W0(iJ);
        c6593f.V0(I10);
        this.f61125c.U1(i10);
        this.f61125c.p1();
    }

    public long d(C6593f c6593f, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        boolean zE1;
        int i19;
        int i20;
        int i21;
        boolean z10;
        int i22;
        int i23;
        boolean z11;
        C6718b c6718b = this;
        InterfaceC0913b interfaceC0913bF1 = c6593f.F1();
        int size = c6593f.f60509L0.size();
        int iV = c6593f.V();
        int iX = c6593f.x();
        boolean zB = AbstractC6598k.b(i10, 128);
        boolean z12 = zB || AbstractC6598k.b(i10, 64);
        if (z12) {
            for (int i24 = 0; i24 < size; i24++) {
                C6592e c6592e = (C6592e) c6593f.f60509L0.get(i24);
                C6592e.b bVarA = c6592e.A();
                C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
                boolean z13 = (bVarA == bVar) && (c6592e.S() == bVar) && c6592e.v() > 0.0f;
                if ((c6592e.h0() && z13) || ((c6592e.j0() && z13) || (c6592e instanceof AbstractC6599l) || c6592e.h0() || c6592e.j0())) {
                    z12 = false;
                    break;
                }
            }
        }
        if (z12) {
            boolean z14 = C5625d.f52972s;
        }
        boolean z15 = z12 & ((i13 == 1073741824 && i15 == 1073741824) || zB);
        int i25 = 2;
        if (z15) {
            int iMin = Math.min(c6593f.H(), i14);
            int iMin2 = Math.min(c6593f.G(), i16);
            if (i13 == 1073741824 && c6593f.V() != iMin) {
                c6593f.g1(iMin);
                c6593f.J1();
            }
            if (i15 == 1073741824 && c6593f.x() != iMin2) {
                c6593f.H0(iMin2);
                c6593f.J1();
            }
            if (i13 == 1073741824 && i15 == 1073741824) {
                zE1 = c6593f.C1(zB);
                i19 = 2;
            } else {
                boolean zD1 = c6593f.D1(zB);
                if (i13 == 1073741824) {
                    zD1 &= c6593f.E1(zB, 0);
                    i19 = 1;
                } else {
                    i19 = 0;
                }
                if (i15 == 1073741824) {
                    zE1 = c6593f.E1(zB, 1) & zD1;
                    i19++;
                } else {
                    zE1 = zD1;
                }
            }
            if (zE1) {
                c6593f.l1(i13 == 1073741824, i15 == 1073741824);
            }
        } else {
            zE1 = false;
            i19 = 0;
        }
        if (zE1 && i19 == 2) {
            return 0L;
        }
        int iG1 = c6593f.G1();
        if (size > 0) {
            b(c6593f);
        }
        e(c6593f);
        int size2 = c6718b.f61123a.size();
        if (size > 0) {
            c6718b.c(c6593f, "First pass", 0, iV, iX);
            i20 = iV;
            i21 = iX;
        } else {
            i20 = iV;
            i21 = iX;
        }
        if (size2 > 0) {
            C6592e.b bVarA2 = c6593f.A();
            C6592e.b bVar2 = C6592e.b.WRAP_CONTENT;
            boolean z16 = bVarA2 == bVar2;
            boolean z17 = c6593f.S() == bVar2;
            int iMax = Math.max(c6593f.V(), c6718b.f61125c.J());
            int iMax2 = Math.max(c6593f.x(), c6718b.f61125c.I());
            int i26 = 0;
            boolean zB1 = false;
            while (i26 < size2) {
                C6592e c6592e2 = (C6592e) c6718b.f61123a.get(i26);
                if (c6592e2 instanceof AbstractC6599l) {
                    int iV2 = c6592e2.V();
                    int iX2 = c6592e2.x();
                    i23 = i20;
                    boolean zA = c6718b.a(interfaceC0913bF1, c6592e2, a.f61127l) | zB1;
                    int iV3 = c6592e2.V();
                    int iX3 = c6592e2.x();
                    if (iV3 != iV2) {
                        c6592e2.g1(iV3);
                        if (z16 && c6592e2.N() > iMax) {
                            iMax = Math.max(iMax, c6592e2.N() + c6592e2.o(C6591d.a.RIGHT).f());
                        }
                        z11 = true;
                    } else {
                        z11 = zA;
                    }
                    if (iX3 != iX2) {
                        c6592e2.H0(iX3);
                        if (z17 && c6592e2.r() > iMax2) {
                            iMax2 = Math.max(iMax2, c6592e2.r() + c6592e2.o(C6591d.a.BOTTOM).f());
                        }
                        z11 = true;
                    }
                    zB1 = z11 | ((AbstractC6599l) c6592e2).B1();
                } else {
                    i23 = i20;
                }
                i26++;
                i20 = i23;
                i25 = 2;
            }
            int i27 = i20;
            int i28 = i25;
            int i29 = 0;
            while (i29 < i28) {
                int i30 = 0;
                while (i30 < size2) {
                    C6592e c6592e3 = (C6592e) c6718b.f61123a.get(i30);
                    if (((c6592e3 instanceof InterfaceC6596i) && !(c6592e3 instanceof AbstractC6599l)) || (c6592e3 instanceof C6595h) || c6592e3.U() == 8 || ((z15 && c6592e3.f60361e.f61206e.f61159j && c6592e3.f60363f.f61206e.f61159j) || (c6592e3 instanceof AbstractC6599l))) {
                        z10 = z15;
                        i22 = size2;
                    } else {
                        int iV4 = c6592e3.V();
                        int iX4 = c6592e3.x();
                        z10 = z15;
                        int iP = c6592e3.p();
                        int i31 = a.f61127l;
                        i22 = size2;
                        if (i29 == 1) {
                            i31 = a.f61128m;
                        }
                        boolean zA2 = c6718b.a(interfaceC0913bF1, c6592e3, i31) | zB1;
                        int iV5 = c6592e3.V();
                        int iX5 = c6592e3.x();
                        if (iV5 != iV4) {
                            c6592e3.g1(iV5);
                            if (z16 && c6592e3.N() > iMax) {
                                iMax = Math.max(iMax, c6592e3.N() + c6592e3.o(C6591d.a.RIGHT).f());
                            }
                            zA2 = true;
                        }
                        if (iX5 != iX4) {
                            c6592e3.H0(iX5);
                            if (z17 && c6592e3.r() > iMax2) {
                                iMax2 = Math.max(iMax2, c6592e3.r() + c6592e3.o(C6591d.a.BOTTOM).f());
                            }
                            zA2 = true;
                        }
                        zB1 = (!c6592e3.Y() || iP == c6592e3.p()) ? zA2 : true;
                    }
                    i30++;
                    c6718b = this;
                    size2 = i22;
                    z15 = z10;
                }
                boolean z18 = z15;
                int i32 = size2;
                if (!zB1) {
                    break;
                }
                i29++;
                c(c6593f, "intermediate pass", i29, i27, i21);
                c6718b = this;
                size2 = i32;
                z15 = z18;
                i28 = 2;
                zB1 = false;
            }
        }
        c6593f.T1(iG1);
        return 0L;
    }

    public void e(C6593f c6593f) {
        this.f61123a.clear();
        int size = c6593f.f60509L0.size();
        for (int i10 = 0; i10 < size; i10++) {
            C6592e c6592e = (C6592e) c6593f.f60509L0.get(i10);
            C6592e.b bVarA = c6592e.A();
            C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
            if (bVarA == bVar || c6592e.S() == bVar) {
                this.f61123a.add(c6592e);
            }
        }
        c6593f.J1();
    }
}
