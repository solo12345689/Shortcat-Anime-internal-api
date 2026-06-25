package t1;

import java.util.ArrayList;
import m1.C5625d;
import t1.C6592e;

/* JADX INFO: renamed from: t1.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C6594g extends AbstractC6599l {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private C6592e[] f60464x1;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f60441a1 = -1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f60442b1 = -1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f60443c1 = -1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private int f60444d1 = -1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private int f60445e1 = -1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f60446f1 = -1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private float f60447g1 = 0.5f;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private float f60448h1 = 0.5f;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private float f60449i1 = 0.5f;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private float f60450j1 = 0.5f;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private float f60451k1 = 0.5f;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private float f60452l1 = 0.5f;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private int f60453m1 = 0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f60454n1 = 0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f60455o1 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f60456p1 = 2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private int f60457q1 = 0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private int f60458r1 = -1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f60459s1 = 0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private ArrayList f60460t1 = new ArrayList();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private C6592e[] f60461u1 = null;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private C6592e[] f60462v1 = null;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private int[] f60463w1 = null;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f60465y1 = 0;

    /* JADX INFO: renamed from: t1.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f60466a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private C6591d f60469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C6591d f60470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private C6591d f60471f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private C6591d f60472g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f60473h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f60474i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f60475j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f60476k;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f60482q;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C6592e f60467b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f60468c = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f60477l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f60478m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f60479n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f60480o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f60481p = 0;

        a(int i10, C6591d c6591d, C6591d c6591d2, C6591d c6591d3, C6591d c6591d4, int i11) {
            this.f60473h = 0;
            this.f60474i = 0;
            this.f60475j = 0;
            this.f60476k = 0;
            this.f60482q = 0;
            this.f60466a = i10;
            this.f60469d = c6591d;
            this.f60470e = c6591d2;
            this.f60471f = c6591d3;
            this.f60472g = c6591d4;
            this.f60473h = C6594g.this.v1();
            this.f60474i = C6594g.this.x1();
            this.f60475j = C6594g.this.w1();
            this.f60476k = C6594g.this.u1();
            this.f60482q = i11;
        }

        private void h() {
            this.f60477l = 0;
            this.f60478m = 0;
            this.f60467b = null;
            this.f60468c = 0;
            int i10 = this.f60480o;
            for (int i11 = 0; i11 < i10 && this.f60479n + i11 < C6594g.this.f60465y1; i11++) {
                C6592e c6592e = C6594g.this.f60464x1[this.f60479n + i11];
                if (this.f60466a == 0) {
                    int iV = c6592e.V();
                    int i12 = C6594g.this.f60453m1;
                    if (c6592e.U() == 8) {
                        i12 = 0;
                    }
                    this.f60477l += iV + i12;
                    int iG2 = C6594g.this.g2(c6592e, this.f60482q);
                    if (this.f60467b == null || this.f60468c < iG2) {
                        this.f60467b = c6592e;
                        this.f60468c = iG2;
                        this.f60478m = iG2;
                    }
                } else {
                    int iH2 = C6594g.this.h2(c6592e, this.f60482q);
                    int iG22 = C6594g.this.g2(c6592e, this.f60482q);
                    int i13 = C6594g.this.f60454n1;
                    if (c6592e.U() == 8) {
                        i13 = 0;
                    }
                    this.f60478m += iG22 + i13;
                    if (this.f60467b == null || this.f60468c < iH2) {
                        this.f60467b = c6592e;
                        this.f60468c = iH2;
                        this.f60477l = iH2;
                    }
                }
            }
        }

        public void b(C6592e c6592e) {
            if (this.f60466a == 0) {
                int iH2 = C6594g.this.h2(c6592e, this.f60482q);
                if (c6592e.A() == C6592e.b.MATCH_CONSTRAINT) {
                    this.f60481p++;
                    iH2 = 0;
                }
                this.f60477l += iH2 + (c6592e.U() != 8 ? C6594g.this.f60453m1 : 0);
                int iG2 = C6594g.this.g2(c6592e, this.f60482q);
                if (this.f60467b == null || this.f60468c < iG2) {
                    this.f60467b = c6592e;
                    this.f60468c = iG2;
                    this.f60478m = iG2;
                }
            } else {
                int iH22 = C6594g.this.h2(c6592e, this.f60482q);
                int iG22 = C6594g.this.g2(c6592e, this.f60482q);
                if (c6592e.S() == C6592e.b.MATCH_CONSTRAINT) {
                    this.f60481p++;
                    iG22 = 0;
                }
                this.f60478m += iG22 + (c6592e.U() != 8 ? C6594g.this.f60454n1 : 0);
                if (this.f60467b == null || this.f60468c < iH22) {
                    this.f60467b = c6592e;
                    this.f60468c = iH22;
                    this.f60477l = iH22;
                }
            }
            this.f60480o++;
        }

        public void c() {
            this.f60468c = 0;
            this.f60467b = null;
            this.f60477l = 0;
            this.f60478m = 0;
            this.f60479n = 0;
            this.f60480o = 0;
            this.f60481p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            C6592e c6592e;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f60480o;
            for (int i13 = 0; i13 < i12 && this.f60479n + i13 < C6594g.this.f60465y1; i13++) {
                C6592e c6592e2 = C6594g.this.f60464x1[this.f60479n + i13];
                if (c6592e2 != null) {
                    c6592e2.t0();
                }
            }
            if (i12 == 0 || this.f60467b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f60479n + i17 >= C6594g.this.f60465y1) {
                    break;
                }
                C6592e c6592e3 = C6594g.this.f60464x1[this.f60479n + i17];
                if (c6592e3 != null && c6592e3.U() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            C6592e c6592e4 = null;
            if (this.f60466a != 0) {
                C6592e c6592e5 = this.f60467b;
                c6592e5.J0(C6594g.this.f60441a1);
                int i18 = this.f60473h;
                if (i10 > 0) {
                    i18 += C6594g.this.f60453m1;
                }
                if (z10) {
                    c6592e5.f60343Q.a(this.f60471f, i18);
                    if (z11) {
                        c6592e5.f60341O.a(this.f60469d, this.f60475j);
                    }
                    if (i10 > 0) {
                        this.f60471f.f60300d.f60341O.a(c6592e5.f60343Q, 0);
                    }
                } else {
                    c6592e5.f60341O.a(this.f60469d, i18);
                    if (z11) {
                        c6592e5.f60343Q.a(this.f60471f, this.f60475j);
                    }
                    if (i10 > 0) {
                        this.f60469d.f60300d.f60343Q.a(c6592e5.f60341O, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f60479n + i19 < C6594g.this.f60465y1; i19++) {
                    C6592e c6592e6 = C6594g.this.f60464x1[this.f60479n + i19];
                    if (c6592e6 != null) {
                        if (i19 == 0) {
                            c6592e6.k(c6592e6.f60342P, this.f60470e, this.f60474i);
                            int i20 = C6594g.this.f60442b1;
                            float f12 = C6594g.this.f60448h1;
                            if (this.f60479n == 0 && C6594g.this.f60444d1 != -1) {
                                i20 = C6594g.this.f60444d1;
                                f12 = C6594g.this.f60450j1;
                            } else if (z11 && C6594g.this.f60446f1 != -1) {
                                i20 = C6594g.this.f60446f1;
                                f12 = C6594g.this.f60452l1;
                            }
                            c6592e6.a1(i20);
                            c6592e6.Z0(f12);
                        }
                        if (i19 == i12 - 1) {
                            c6592e6.k(c6592e6.f60344R, this.f60472g, this.f60476k);
                        }
                        if (c6592e4 != null) {
                            c6592e6.f60342P.a(c6592e4.f60344R, C6594g.this.f60454n1);
                            if (i19 == i14) {
                                c6592e6.f60342P.u(this.f60474i);
                            }
                            c6592e4.f60344R.a(c6592e6.f60342P, 0);
                            if (i19 == i15 + 1) {
                                c6592e4.f60344R.u(this.f60476k);
                            }
                        }
                        if (c6592e6 == c6592e5) {
                            c6592e4 = c6592e6;
                        } else if (z10) {
                            int i21 = C6594g.this.f60455o1;
                            if (i21 == 0) {
                                c6592e6.f60343Q.a(c6592e5.f60343Q, 0);
                            } else if (i21 == 1) {
                                c6592e6.f60341O.a(c6592e5.f60341O, 0);
                            } else if (i21 == 2) {
                                c6592e6.f60341O.a(c6592e5.f60341O, 0);
                                c6592e6.f60343Q.a(c6592e5.f60343Q, 0);
                            }
                            c6592e4 = c6592e6;
                        } else {
                            int i22 = C6594g.this.f60455o1;
                            if (i22 == 0) {
                                c6592e6.f60341O.a(c6592e5.f60341O, 0);
                            } else if (i22 == 1) {
                                c6592e6.f60343Q.a(c6592e5.f60343Q, 0);
                            } else if (i22 == 2) {
                                if (z12) {
                                    c6592e6.f60341O.a(this.f60469d, this.f60473h);
                                    c6592e6.f60343Q.a(this.f60471f, this.f60475j);
                                } else {
                                    c6592e6.f60341O.a(c6592e5.f60341O, 0);
                                    c6592e6.f60343Q.a(c6592e5.f60343Q, 0);
                                }
                            }
                            c6592e4 = c6592e6;
                        }
                    }
                }
                return;
            }
            C6592e c6592e7 = this.f60467b;
            c6592e7.a1(C6594g.this.f60442b1);
            int i23 = this.f60474i;
            if (i10 > 0) {
                i23 += C6594g.this.f60454n1;
            }
            c6592e7.f60342P.a(this.f60470e, i23);
            if (z11) {
                c6592e7.f60344R.a(this.f60472g, this.f60476k);
            }
            if (i10 > 0) {
                this.f60470e.f60300d.f60344R.a(c6592e7.f60342P, 0);
            }
            char c11 = 3;
            if (C6594g.this.f60456p1 != 3 || c6592e7.Y()) {
                c6592e = c6592e7;
            } else {
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f60479n + i25 >= C6594g.this.f60465y1) {
                        break;
                    }
                    c6592e = C6594g.this.f60464x1[this.f60479n + i25];
                    if (c6592e.Y()) {
                        break;
                    }
                }
                c6592e = c6592e7;
            }
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f60479n + i27 >= C6594g.this.f60465y1) {
                    return;
                }
                C6592e c6592e8 = C6594g.this.f60464x1[this.f60479n + i27];
                if (c6592e8 == null) {
                    c6592e8 = c6592e4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        c6592e8.k(c6592e8.f60341O, this.f60469d, this.f60473h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = C6594g.this.f60441a1;
                        float f13 = C6594g.this.f60447g1;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f60479n != 0 || C6594g.this.f60443c1 == -1) {
                            if (z11 && C6594g.this.f60445e1 != -1) {
                                i28 = C6594g.this.f60445e1;
                                if (z10) {
                                    f11 = C6594g.this.f60451k1;
                                    f10 = 1.0f - f11;
                                    f13 = f10;
                                } else {
                                    f10 = C6594g.this.f60451k1;
                                    f13 = f10;
                                }
                            }
                            c6592e8.J0(i28);
                            c6592e8.I0(f13);
                        } else {
                            i28 = C6594g.this.f60443c1;
                            if (z10) {
                                f11 = C6594g.this.f60449i1;
                                f10 = 1.0f - f11;
                                f13 = f10;
                                c6592e8.J0(i28);
                                c6592e8.I0(f13);
                            } else {
                                f10 = C6594g.this.f60449i1;
                                f13 = f10;
                                c6592e8.J0(i28);
                                c6592e8.I0(f13);
                            }
                        }
                    }
                    if (i26 == i12 - 1) {
                        c6592e8.k(c6592e8.f60343Q, this.f60471f, this.f60475j);
                    }
                    if (c6592e4 != null) {
                        c6592e8.f60341O.a(c6592e4.f60343Q, C6594g.this.f60453m1);
                        if (i26 == i14) {
                            c6592e8.f60341O.u(this.f60473h);
                        }
                        c6592e4.f60343Q.a(c6592e8.f60341O, 0);
                        if (i26 == i15 + 1) {
                            c6592e4.f60343Q.u(this.f60475j);
                        }
                    }
                    if (c6592e8 != c6592e7) {
                        c10 = 3;
                        if (C6594g.this.f60456p1 == 3 && c6592e.Y() && c6592e8 != c6592e && c6592e8.Y()) {
                            c6592e8.f60345S.a(c6592e.f60345S, 0);
                        } else {
                            int i29 = C6594g.this.f60456p1;
                            if (i29 == 0) {
                                c6592e8.f60342P.a(c6592e7.f60342P, 0);
                            } else if (i29 == i11) {
                                c6592e8.f60344R.a(c6592e7.f60344R, 0);
                            } else if (z12) {
                                c6592e8.f60342P.a(this.f60470e, this.f60474i);
                                c6592e8.f60344R.a(this.f60472g, this.f60476k);
                            } else {
                                c6592e8.f60342P.a(c6592e7.f60342P, 0);
                                c6592e8.f60344R.a(c6592e7.f60344R, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                c6592e4 = c6592e8;
            }
        }

        public int e() {
            return this.f60466a == 1 ? this.f60478m - C6594g.this.f60454n1 : this.f60478m;
        }

        public int f() {
            return this.f60466a == 0 ? this.f60477l - C6594g.this.f60453m1 : this.f60477l;
        }

        public void g(int i10) {
            int i11 = this.f60481p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f60480o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f60479n + i14 < C6594g.this.f60465y1; i14++) {
                C6592e c6592e = C6594g.this.f60464x1[this.f60479n + i14];
                if (this.f60466a == 0) {
                    if (c6592e != null && c6592e.A() == C6592e.b.MATCH_CONSTRAINT && c6592e.f60397w == 0) {
                        C6594g.this.z1(c6592e, C6592e.b.FIXED, i13, c6592e.S(), c6592e.x());
                    }
                } else if (c6592e != null && c6592e.S() == C6592e.b.MATCH_CONSTRAINT && c6592e.f60399x == 0) {
                    int i15 = i13;
                    C6594g.this.z1(c6592e, c6592e.A(), c6592e.V(), C6592e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public void i(int i10) {
            this.f60479n = i10;
        }

        public void j(int i10, C6591d c6591d, C6591d c6591d2, C6591d c6591d3, C6591d c6591d4, int i11, int i12, int i13, int i14, int i15) {
            this.f60466a = i10;
            this.f60469d = c6591d;
            this.f60470e = c6591d2;
            this.f60471f = c6591d3;
            this.f60472g = c6591d4;
            this.f60473h = i11;
            this.f60474i = i12;
            this.f60475j = i13;
            this.f60476k = i14;
            this.f60482q = i15;
        }
    }

    private void f2(boolean z10) {
        C6592e c6592e;
        float f10;
        int i10;
        if (this.f60463w1 == null || this.f60462v1 == null || this.f60461u1 == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f60465y1; i11++) {
            this.f60464x1[i11].t0();
        }
        int[] iArr = this.f60463w1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f60447g1;
        C6592e c6592e2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f60447g1;
            } else {
                f10 = f11;
                i10 = i14;
            }
            C6592e c6592e3 = this.f60462v1[i10];
            if (c6592e3 != null && c6592e3.U() != 8) {
                if (i14 == 0) {
                    c6592e3.k(c6592e3.f60341O, this.f60341O, v1());
                    c6592e3.J0(this.f60441a1);
                    c6592e3.I0(f10);
                }
                if (i14 == i12 - 1) {
                    c6592e3.k(c6592e3.f60343Q, this.f60343Q, w1());
                }
                if (i14 > 0 && c6592e2 != null) {
                    c6592e3.k(c6592e3.f60341O, c6592e2.f60343Q, this.f60453m1);
                    c6592e2.k(c6592e2.f60343Q, c6592e3.f60341O, 0);
                }
                c6592e2 = c6592e3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            C6592e c6592e4 = this.f60461u1[i15];
            if (c6592e4 != null && c6592e4.U() != 8) {
                if (i15 == 0) {
                    c6592e4.k(c6592e4.f60342P, this.f60342P, x1());
                    c6592e4.a1(this.f60442b1);
                    c6592e4.Z0(this.f60448h1);
                }
                if (i15 == i13 - 1) {
                    c6592e4.k(c6592e4.f60344R, this.f60344R, u1());
                }
                if (i15 > 0 && c6592e2 != null) {
                    c6592e4.k(c6592e4.f60342P, c6592e2.f60344R, this.f60454n1);
                    c6592e2.k(c6592e2.f60344R, c6592e4.f60342P, 0);
                }
                c6592e2 = c6592e4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f60459s1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                C6592e[] c6592eArr = this.f60464x1;
                if (i18 < c6592eArr.length && (c6592e = c6592eArr[i18]) != null && c6592e.U() != 8) {
                    C6592e c6592e5 = this.f60462v1[i16];
                    C6592e c6592e6 = this.f60461u1[i17];
                    if (c6592e != c6592e5) {
                        c6592e.k(c6592e.f60341O, c6592e5.f60341O, 0);
                        c6592e.k(c6592e.f60343Q, c6592e5.f60343Q, 0);
                    }
                    if (c6592e != c6592e6) {
                        c6592e.k(c6592e.f60342P, c6592e6.f60342P, 0);
                        c6592e.k(c6592e.f60344R, c6592e6.f60344R, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g2(C6592e c6592e, int i10) {
        C6592e c6592e2;
        if (c6592e == null) {
            return 0;
        }
        if (c6592e.S() == C6592e.b.MATCH_CONSTRAINT) {
            int i11 = c6592e.f60399x;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c6592e.f60325E * i10);
                if (i12 != c6592e.x()) {
                    c6592e.U0(true);
                    z1(c6592e, c6592e.A(), c6592e.V(), C6592e.b.FIXED, i12);
                }
                return i12;
            }
            c6592e2 = c6592e;
            if (i11 == 1) {
                return c6592e2.x();
            }
            if (i11 == 3) {
                return (int) ((c6592e2.V() * c6592e2.f60360d0) + 0.5f);
            }
        } else {
            c6592e2 = c6592e;
        }
        return c6592e2.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h2(C6592e c6592e, int i10) {
        C6592e c6592e2;
        if (c6592e == null) {
            return 0;
        }
        if (c6592e.A() == C6592e.b.MATCH_CONSTRAINT) {
            int i11 = c6592e.f60397w;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (c6592e.f60319B * i10);
                if (i12 != c6592e.V()) {
                    c6592e.U0(true);
                    z1(c6592e, C6592e.b.FIXED, i12, c6592e.S(), c6592e.x());
                }
                return i12;
            }
            c6592e2 = c6592e;
            if (i11 == 1) {
                return c6592e2.V();
            }
            if (i11 == 3) {
                return (int) ((c6592e2.x() * c6592e2.f60360d0) + 0.5f);
            }
        } else {
            c6592e2 = c6592e;
        }
        return c6592e2.V();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void i2(t1.C6592e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.C6594g.i2(t1.e[], int, int, int, int[]):void");
    }

    private void j2(C6592e[] c6592eArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        C6594g c6594g;
        int i14;
        C6591d c6591d;
        int i15;
        C6594g c6594g2 = this;
        if (i10 == 0) {
            return;
        }
        c6594g2.f60460t1.clear();
        int i16 = i12;
        a aVar = c6594g2.new a(i11, c6594g2.f60341O, c6594g2.f60342P, c6594g2.f60343Q, c6594g2.f60344R, i16);
        c6594g2.f60460t1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C6592e c6592e = c6592eArr[i18];
                int iH2 = c6594g2.h2(c6592e, i16);
                if (c6592e.A() == C6592e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (c6594g2.f60453m1 + i17) + iH2 > i16) && aVar.f60467b != null;
                if (!z10 && i18 > 0 && (i15 = c6594g2.f60458r1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = c6594g2.new a(i11, c6594g2.f60341O, c6594g2.f60342P, c6594g2.f60343Q, c6594g2.f60344R, i16);
                    aVar.i(i18);
                    c6594g2.f60460t1.add(aVar);
                } else {
                    if (i18 > 0) {
                        i17 += c6594g2.f60453m1 + iH2;
                    }
                    aVar.b(c6592e);
                    i18++;
                    i13 = i19;
                }
                i17 = iH2;
                aVar.b(c6592e);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                C6592e c6592e2 = c6592eArr[i21];
                int iG2 = c6594g2.g2(c6592e2, i16);
                if (c6592e2.S() == C6592e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (c6594g2.f60454n1 + i20) + iG2 > i16) && aVar.f60467b != null;
                if (!z11 && i21 > 0 && (i14 = c6594g2.f60458r1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = c6594g2.new a(i11, c6594g2.f60341O, c6594g2.f60342P, c6594g2.f60343Q, c6594g2.f60344R, i16);
                    c6594g = c6594g2;
                    aVar.i(i21);
                    c6594g.f60460t1.add(aVar);
                } else {
                    c6594g = c6594g2;
                    if (i21 > 0) {
                        i20 += c6594g.f60454n1 + iG2;
                    }
                    aVar.b(c6592e2);
                    i21++;
                    i16 = i12;
                    i13 = i22;
                    c6594g2 = c6594g;
                }
                i20 = iG2;
                aVar.b(c6592e2);
                i21++;
                i16 = i12;
                i13 = i22;
                c6594g2 = c6594g;
            }
        }
        C6594g c6594g3 = c6594g2;
        int size = c6594g3.f60460t1.size();
        C6591d c6591d2 = c6594g3.f60341O;
        C6591d c6591d3 = c6594g3.f60342P;
        C6591d c6591d4 = c6594g3.f60343Q;
        C6591d c6591d5 = c6594g3.f60344R;
        int iV1 = c6594g3.v1();
        int iX1 = c6594g3.x1();
        int iW1 = c6594g3.w1();
        int iU1 = c6594g3.u1();
        C6592e.b bVarA = c6594g3.A();
        C6592e.b bVar = C6592e.b.WRAP_CONTENT;
        boolean z12 = bVarA == bVar || c6594g3.S() == bVar;
        if (i13 > 0 && z12) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) c6594g3.f60460t1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        C6591d c6591d6 = c6591d2;
        int iU12 = iU1;
        int i24 = 0;
        int iW12 = iW1;
        int i25 = iX1;
        int i26 = iV1;
        C6591d c6591d7 = c6591d5;
        C6591d c6591d8 = c6591d4;
        C6591d c6591d9 = c6591d3;
        int i27 = 0;
        for (int i28 = 0; i28 < size; i28++) {
            a aVar3 = (a) c6594g3.f60460t1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    c6591d7 = ((a) c6594g3.f60460t1.get(i28 + 1)).f60467b.f60342P;
                    iU12 = 0;
                } else {
                    c6591d7 = c6594g3.f60344R;
                    iU12 = c6594g3.u1();
                }
                C6591d c6591d10 = aVar3.f60467b.f60344R;
                int i29 = i27;
                aVar3.j(i11, c6591d6, c6591d9, c6591d8, c6591d7, i26, i25, iW12, iU12, i12);
                int iMax = Math.max(i24, aVar3.f());
                int iE = aVar3.e() + i29;
                if (i28 > 0) {
                    iE += c6594g3.f60454n1;
                }
                i27 = iE;
                i24 = iMax;
                c6591d9 = c6591d10;
                i25 = 0;
            } else {
                int i30 = i24;
                int i31 = i27;
                if (i28 < size - 1) {
                    c6591d = ((a) c6594g3.f60460t1.get(i28 + 1)).f60467b.f60341O;
                    iW12 = 0;
                } else {
                    c6591d = c6594g3.f60343Q;
                    iW12 = c6594g3.w1();
                }
                c6591d8 = c6591d;
                C6591d c6591d11 = aVar3.f60467b.f60343Q;
                aVar3.j(i11, c6591d6, c6591d9, c6591d8, c6591d7, i26, i25, iW12, iU12, i12);
                int iF = aVar3.f() + i30;
                int iMax2 = Math.max(i31, aVar3.e());
                if (i28 > 0) {
                    iF += c6594g3.f60453m1;
                }
                int i32 = iF;
                i27 = iMax2;
                i24 = i32;
                i26 = 0;
                c6591d6 = c6591d11;
            }
        }
        iArr[0] = i24;
        iArr[1] = i27;
    }

    private void k2(C6592e[] c6592eArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        C6594g c6594g;
        int i14;
        boolean z10;
        C6591d c6591d;
        int i15;
        C6594g c6594g2 = this;
        if (i10 == 0) {
            return;
        }
        c6594g2.f60460t1.clear();
        int i16 = i12;
        a aVar = c6594g2.new a(i11, c6594g2.f60341O, c6594g2.f60342P, c6594g2.f60343Q, c6594g2.f60344R, i16);
        c6594g2.f60460t1.add(aVar);
        boolean z11 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                C6592e c6592e = c6592eArr[i19];
                int iH2 = c6594g2.h2(c6592e, i16);
                if (c6592e.A() == C6592e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z12 = (i18 == i16 || (c6594g2.f60453m1 + i18) + iH2 > i16) && aVar.f60467b != null;
                if (!z12 && i19 > 0 && (i15 = c6594g2.f60458r1) > 0 && i17 > i15) {
                    z12 = true;
                }
                if (z12) {
                    aVar = c6594g2.new a(i11, c6594g2.f60341O, c6594g2.f60342P, c6594g2.f60343Q, c6594g2.f60344R, i16);
                    aVar.i(i19);
                    c6594g2.f60460t1.add(aVar);
                    i17 = 1;
                } else {
                    if (i19 > 0) {
                        i18 += c6594g2.f60453m1 + iH2;
                    }
                    aVar.b(c6592e);
                    i19++;
                    i13 = i20;
                }
                i18 = iH2;
                aVar.b(c6592e);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                C6592e c6592e2 = c6592eArr[i23];
                int iG2 = c6594g2.g2(c6592e2, i16);
                if (c6592e2.S() == C6592e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z13 = (i22 == i16 || (c6594g2.f60454n1 + i22) + iG2 > i16) && aVar.f60467b != null;
                if (!z13 && i23 > 0 && (i14 = c6594g2.f60458r1) > 0 && i21 > i14) {
                    z13 = true;
                }
                if (z13) {
                    aVar = c6594g2.new a(i11, c6594g2.f60341O, c6594g2.f60342P, c6594g2.f60343Q, c6594g2.f60344R, i16);
                    c6594g = c6594g2;
                    aVar.i(i23);
                    c6594g.f60460t1.add(aVar);
                    i21 = 1;
                } else {
                    c6594g = c6594g2;
                    if (i23 > 0) {
                        i22 += c6594g.f60454n1 + iG2;
                    }
                    aVar.b(c6592e2);
                    i23++;
                    i16 = i12;
                    i13 = i24;
                    c6594g2 = c6594g;
                }
                i22 = iG2;
                aVar.b(c6592e2);
                i23++;
                i16 = i12;
                i13 = i24;
                c6594g2 = c6594g;
            }
        }
        C6594g c6594g3 = c6594g2;
        int size = c6594g3.f60460t1.size();
        C6591d c6591d2 = c6594g3.f60341O;
        C6591d c6591d3 = c6594g3.f60342P;
        C6591d c6591d4 = c6594g3.f60343Q;
        C6591d c6591d5 = c6594g3.f60344R;
        int iV1 = c6594g3.v1();
        int iX1 = c6594g3.x1();
        int iW1 = c6594g3.w1();
        int iU1 = c6594g3.u1();
        C6592e.b bVarA = c6594g3.A();
        C6592e.b bVar = C6592e.b.WRAP_CONTENT;
        boolean z14 = bVarA == bVar || c6594g3.S() == bVar;
        if (i13 > 0 && z14) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = (a) c6594g3.f60460t1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        C6591d c6591d6 = c6591d3;
        int iU12 = iU1;
        int i26 = 0;
        int i27 = 0;
        int iW12 = iW1;
        int i28 = iX1;
        int i29 = iV1;
        C6591d c6591d7 = c6591d5;
        C6591d c6591d8 = c6591d4;
        C6591d c6591d9 = c6591d2;
        int i30 = 0;
        while (i27 < size) {
            a aVar3 = (a) c6594g3.f60460t1.get(i27);
            if (i11 == 0) {
                if (i27 < size - 1) {
                    c6591d7 = ((a) c6594g3.f60460t1.get(i27 + 1)).f60467b.f60342P;
                    iU12 = 0;
                } else {
                    c6591d7 = c6594g3.f60344R;
                    iU12 = c6594g3.u1();
                }
                C6591d c6591d10 = aVar3.f60467b.f60344R;
                z10 = z11;
                int i31 = i26;
                aVar3.j(i11, c6591d9, c6591d6, c6591d8, c6591d7, i29, i28, iW12, iU12, i12);
                int iMax = Math.max(i30, aVar3.f());
                int iE = aVar3.e() + i31;
                if (i27 > 0) {
                    iE += c6594g3.f60454n1;
                }
                i26 = iE;
                i30 = iMax;
                c6591d6 = c6591d10;
                i28 = 0;
            } else {
                int i32 = i26;
                z10 = z11;
                int i33 = i30;
                if (i27 < size - 1) {
                    c6591d = ((a) c6594g3.f60460t1.get(i27 + 1)).f60467b.f60341O;
                    iW12 = 0;
                } else {
                    c6591d = c6594g3.f60343Q;
                    iW12 = c6594g3.w1();
                }
                c6591d8 = c6591d;
                C6591d c6591d11 = aVar3.f60467b.f60343Q;
                aVar3.j(i11, c6591d9, c6591d6, c6591d8, c6591d7, i29, i28, iW12, iU12, i12);
                int iF = aVar3.f() + i33;
                int iMax2 = Math.max(i32, aVar3.e());
                if (i27 > 0) {
                    iF += c6594g3.f60453m1;
                }
                int i34 = iF;
                i26 = iMax2;
                i30 = i34;
                i29 = 0;
                c6591d9 = c6591d11;
            }
            i27++;
            z11 = z10;
        }
        iArr[0] = i30;
        iArr[z11 ? 1 : 0] = i26;
    }

    private void l2(C6592e[] c6592eArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f60460t1.size() == 0) {
            aVar = new a(i11, this.f60341O, this.f60342P, this.f60343Q, this.f60344R, i12);
            this.f60460t1.add(aVar);
        } else {
            a aVar2 = (a) this.f60460t1.get(0);
            aVar2.c();
            aVar2.j(i11, this.f60341O, this.f60342P, this.f60343Q, this.f60344R, v1(), x1(), w1(), u1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(c6592eArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void A2(int i10) {
        this.f60456p1 = i10;
    }

    public void B2(float f10) {
        this.f60448h1 = f10;
    }

    public void C2(int i10) {
        this.f60454n1 = i10;
    }

    public void D2(int i10) {
        this.f60442b1 = i10;
    }

    public void E2(int i10) {
        this.f60457q1 = i10;
    }

    @Override // t1.C6592e
    public void g(C5625d c5625d, boolean z10) {
        super.g(c5625d, z10);
        boolean z11 = L() != null && ((C6593f) L()).M1();
        int i10 = this.f60457q1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f60460t1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f60460t1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                f2(z11);
            } else if (i10 == 3) {
                int size2 = this.f60460t1.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((a) this.f60460t1.get(i12)).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f60460t1.size() > 0) {
            ((a) this.f60460t1.get(0)).d(z11, 0, true);
        }
        C1(false);
    }

    public void m2(float f10) {
        this.f60449i1 = f10;
    }

    public void n2(int i10) {
        this.f60443c1 = i10;
    }

    public void o2(float f10) {
        this.f60450j1 = f10;
    }

    public void p2(int i10) {
        this.f60444d1 = i10;
    }

    public void q2(int i10) {
        this.f60455o1 = i10;
    }

    public void r2(float f10) {
        this.f60447g1 = f10;
    }

    public void s2(int i10) {
        this.f60453m1 = i10;
    }

    public void t2(int i10) {
        this.f60441a1 = i10;
    }

    public void u2(float f10) {
        this.f60451k1 = f10;
    }

    public void v2(int i10) {
        this.f60445e1 = i10;
    }

    public void w2(float f10) {
        this.f60452l1 = f10;
    }

    public void x2(int i10) {
        this.f60446f1 = i10;
    }

    @Override // t1.AbstractC6599l
    public void y1(int i10, int i11, int i12, int i13) {
        int i14;
        C6592e[] c6592eArr;
        if (this.f60494M0 > 0 && !A1()) {
            D1(0, 0);
            C1(false);
            return;
        }
        int iV1 = v1();
        int iW1 = w1();
        int iX1 = x1();
        int iU1 = u1();
        int[] iArr = new int[2];
        int i15 = (i11 - iV1) - iW1;
        int i16 = this.f60459s1;
        if (i16 == 1) {
            i15 = (i13 - iX1) - iU1;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f60441a1 == -1) {
                this.f60441a1 = 0;
            }
            if (this.f60442b1 == -1) {
                this.f60442b1 = 0;
            }
        } else {
            if (this.f60441a1 == -1) {
                this.f60441a1 = 0;
            }
            if (this.f60442b1 == -1) {
                this.f60442b1 = 0;
            }
        }
        C6592e[] c6592eArr2 = this.f60493L0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f60494M0;
            if (i18 >= i14) {
                break;
            }
            if (this.f60493L0[i18].U() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            C6592e[] c6592eArr3 = new C6592e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f60494M0) {
                C6592e c6592e = this.f60493L0[i20];
                C6592e[] c6592eArr4 = c6592eArr3;
                if (c6592e.U() != 8) {
                    c6592eArr4[i14] = c6592e;
                    i14++;
                }
                i20++;
                c6592eArr3 = c6592eArr4;
            }
            c6592eArr = c6592eArr3;
        } else {
            c6592eArr = c6592eArr2;
        }
        int i21 = i14;
        this.f60464x1 = c6592eArr;
        this.f60465y1 = i21;
        int i22 = this.f60457q1;
        if (i22 == 0) {
            l2(c6592eArr, i21, this.f60459s1, i17, iArr);
        } else if (i22 == 1) {
            j2(c6592eArr, i21, this.f60459s1, i17, iArr);
        } else if (i22 == 2) {
            i2(c6592eArr, i21, this.f60459s1, i17, iArr);
        } else if (i22 == 3) {
            k2(c6592eArr, i21, this.f60459s1, i17, iArr);
        }
        int iMin = iArr[0] + iV1 + iW1;
        int iMin2 = iArr[1] + iX1 + iU1;
        if (i10 == 1073741824) {
            iMin = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i11);
        } else if (i10 != 0) {
            iMin = 0;
        }
        if (i12 == 1073741824) {
            iMin2 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i13);
        } else if (i12 != 0) {
            iMin2 = 0;
        }
        D1(iMin, iMin2);
        g1(iMin);
        H0(iMin2);
        C1(this.f60494M0 > 0);
    }

    public void y2(int i10) {
        this.f60458r1 = i10;
    }

    public void z2(int i10) {
        this.f60459s1 = i10;
    }
}
