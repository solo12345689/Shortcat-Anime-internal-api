package u1;

import java.util.ArrayList;
import t1.C6588a;
import t1.C6591d;
import t1.C6592e;
import t1.C6593f;
import t1.C6595h;
import u1.C6718b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C6718b.a f61172a = new C6718b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f61173b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f61174c = 0;

    private static boolean a(int i10, C6592e c6592e) {
        C6592e.b bVar;
        C6592e.b bVar2;
        C6592e.b bVarA = c6592e.A();
        C6592e.b bVarS = c6592e.S();
        C6593f c6593f = c6592e.L() != null ? (C6593f) c6592e.L() : null;
        if (c6593f != null) {
            c6593f.A();
            C6592e.b bVar3 = C6592e.b.FIXED;
        }
        if (c6593f != null) {
            c6593f.S();
            C6592e.b bVar4 = C6592e.b.FIXED;
        }
        C6592e.b bVar5 = C6592e.b.FIXED;
        boolean z10 = bVarA == bVar5 || c6592e.m0() || bVarA == C6592e.b.WRAP_CONTENT || (bVarA == (bVar2 = C6592e.b.MATCH_CONSTRAINT) && c6592e.f60397w == 0 && c6592e.f60360d0 == 0.0f && c6592e.Z(0)) || (bVarA == bVar2 && c6592e.f60397w == 1 && c6592e.c0(0, c6592e.V()));
        boolean z11 = bVarS == bVar5 || c6592e.n0() || bVarS == C6592e.b.WRAP_CONTENT || (bVarS == (bVar = C6592e.b.MATCH_CONSTRAINT) && c6592e.f60399x == 0 && c6592e.f60360d0 == 0.0f && c6592e.Z(1)) || (bVarS == bVar && c6592e.f60399x == 1 && c6592e.c0(1, c6592e.x()));
        if (c6592e.f60360d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, C6592e c6592e, C6718b.InterfaceC0913b interfaceC0913b, boolean z10) {
        C6591d c6591d;
        C6591d c6591d2;
        boolean z11;
        C6591d c6591d3;
        C6591d c6591d4;
        if (c6592e.f0()) {
            return;
        }
        boolean z12 = true;
        f61173b++;
        if (!(c6592e instanceof C6593f) && c6592e.l0()) {
            int i11 = i10 + 1;
            if (a(i11, c6592e)) {
                C6593f.P1(i11, c6592e, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
            }
        }
        C6591d c6591dO = c6592e.o(C6591d.a.LEFT);
        C6591d c6591dO2 = c6592e.o(C6591d.a.RIGHT);
        int iE = c6591dO.e();
        int iE2 = c6591dO2.e();
        if (c6591dO.d() != null && c6591dO.n()) {
            for (C6591d c6591d5 : c6591dO.d()) {
                C6592e c6592e2 = c6591d5.f60300d;
                int i12 = i10 + 1;
                boolean zA = a(i12, c6592e2);
                if (c6592e2.l0() && zA) {
                    z11 = z12;
                    C6593f.P1(i12, c6592e2, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
                } else {
                    z11 = z12;
                }
                boolean z13 = ((c6591d5 == c6592e2.f60341O && (c6591d4 = c6592e2.f60343Q.f60302f) != null && c6591d4.n()) || (c6591d5 == c6592e2.f60343Q && (c6591d3 = c6592e2.f60341O.f60302f) != null && c6591d3.n())) ? z11 : false;
                C6592e.b bVarA = c6592e2.A();
                C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
                if (bVarA != bVar || zA) {
                    if (!c6592e2.l0()) {
                        C6591d c6591d6 = c6592e2.f60341O;
                        if (c6591d5 == c6591d6 && c6592e2.f60343Q.f60302f == null) {
                            int iF = c6591d6.f() + iE;
                            c6592e2.B0(iF, c6592e2.V() + iF);
                            b(i12, c6592e2, interfaceC0913b, z10);
                        } else {
                            C6591d c6591d7 = c6592e2.f60343Q;
                            if (c6591d5 == c6591d7 && c6591d6.f60302f == null) {
                                int iF2 = iE - c6591d7.f();
                                c6592e2.B0(iF2 - c6592e2.V(), iF2);
                                b(i12, c6592e2, interfaceC0913b, z10);
                            } else if (z13 && !c6592e2.h0()) {
                                d(i12, interfaceC0913b, c6592e2, z10);
                            }
                        }
                    }
                } else if (c6592e2.A() == bVar && c6592e2.f60317A >= 0 && c6592e2.f60403z >= 0 && ((c6592e2.U() == 8 || (c6592e2.f60397w == 0 && c6592e2.v() == 0.0f)) && !c6592e2.h0() && !c6592e2.k0() && z13 && !c6592e2.h0())) {
                    e(i12, c6592e, interfaceC0913b, c6592e2, z10);
                }
                z12 = z11;
            }
        }
        boolean z14 = z12;
        if (c6592e instanceof C6595h) {
            return;
        }
        if (c6591dO2.d() != null && c6591dO2.n()) {
            for (C6591d c6591d8 : c6591dO2.d()) {
                C6592e c6592e3 = c6591d8.f60300d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, c6592e3);
                if (c6592e3.l0() && zA2) {
                    C6593f.P1(i13, c6592e3, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
                }
                boolean z15 = ((c6591d8 == c6592e3.f60341O && (c6591d2 = c6592e3.f60343Q.f60302f) != null && c6591d2.n()) || (c6591d8 == c6592e3.f60343Q && (c6591d = c6592e3.f60341O.f60302f) != null && c6591d.n())) ? z14 : false;
                C6592e.b bVarA2 = c6592e3.A();
                C6592e.b bVar2 = C6592e.b.MATCH_CONSTRAINT;
                if (bVarA2 != bVar2 || zA2) {
                    if (!c6592e3.l0()) {
                        C6591d c6591d9 = c6592e3.f60341O;
                        if (c6591d8 == c6591d9 && c6592e3.f60343Q.f60302f == null) {
                            int iF3 = c6591d9.f() + iE2;
                            c6592e3.B0(iF3, c6592e3.V() + iF3);
                            b(i13, c6592e3, interfaceC0913b, z10);
                        } else {
                            C6591d c6591d10 = c6592e3.f60343Q;
                            if (c6591d8 == c6591d10 && c6591d9.f60302f == null) {
                                int iF4 = iE2 - c6591d10.f();
                                c6592e3.B0(iF4 - c6592e3.V(), iF4);
                                b(i13, c6592e3, interfaceC0913b, z10);
                            } else if (z15 && !c6592e3.h0()) {
                                d(i13, interfaceC0913b, c6592e3, z10);
                            }
                        }
                    }
                } else if (c6592e3.A() == bVar2 && c6592e3.f60317A >= 0 && c6592e3.f60403z >= 0 && (c6592e3.U() == 8 || (c6592e3.f60397w == 0 && c6592e3.v() == 0.0f))) {
                    if (!c6592e3.h0() && !c6592e3.k0() && z15 && !c6592e3.h0()) {
                        e(i13, c6592e, interfaceC0913b, c6592e3, z10);
                    }
                }
            }
        }
        c6592e.p0();
    }

    private static void c(int i10, C6588a c6588a, C6718b.InterfaceC0913b interfaceC0913b, int i11, boolean z10) {
        if (c6588a.p1()) {
            if (i11 == 0) {
                b(i10 + 1, c6588a, interfaceC0913b, z10);
            } else {
                i(i10 + 1, c6588a, interfaceC0913b);
            }
        }
    }

    private static void d(int i10, C6718b.InterfaceC0913b interfaceC0913b, C6592e c6592e, boolean z10) {
        float fY = c6592e.y();
        int iE = c6592e.f60341O.f60302f.e();
        int iE2 = c6592e.f60343Q.f60302f.e();
        int iF = c6592e.f60341O.f() + iE;
        int iF2 = iE2 - c6592e.f60343Q.f();
        if (iE == iE2) {
            fY = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iV = c6592e.V();
        int i11 = (iE2 - iE) - iV;
        if (iE > iE2) {
            i11 = (iE - iE2) - iV;
        }
        int i12 = ((int) (i11 > 0 ? (fY * i11) + 0.5f : fY * i11)) + iE;
        int i13 = i12 + iV;
        if (iE > iE2) {
            i13 = i12 - iV;
        }
        c6592e.B0(i12, i13);
        b(i10 + 1, c6592e, interfaceC0913b, z10);
    }

    private static void e(int i10, C6592e c6592e, C6718b.InterfaceC0913b interfaceC0913b, C6592e c6592e2, boolean z10) {
        float fY = c6592e2.y();
        int iE = c6592e2.f60341O.f60302f.e() + c6592e2.f60341O.f();
        int iE2 = c6592e2.f60343Q.f60302f.e() - c6592e2.f60343Q.f();
        if (iE2 >= iE) {
            int iV = c6592e2.V();
            if (c6592e2.U() != 8) {
                int i11 = c6592e2.f60397w;
                if (i11 == 2) {
                    iV = (int) (c6592e2.y() * 0.5f * (c6592e instanceof C6593f ? c6592e.V() : c6592e.L().V()));
                } else if (i11 == 0) {
                    iV = iE2 - iE;
                }
                iV = Math.max(c6592e2.f60403z, iV);
                int i12 = c6592e2.f60317A;
                if (i12 > 0) {
                    iV = Math.min(i12, iV);
                }
            }
            int i13 = iE + ((int) ((fY * ((iE2 - iE) - iV)) + 0.5f));
            c6592e2.B0(i13, iV + i13);
            b(i10 + 1, c6592e2, interfaceC0913b, z10);
        }
    }

    private static void f(int i10, C6718b.InterfaceC0913b interfaceC0913b, C6592e c6592e) {
        float fQ = c6592e.Q();
        int iE = c6592e.f60342P.f60302f.e();
        int iE2 = c6592e.f60344R.f60302f.e();
        int iF = c6592e.f60342P.f() + iE;
        int iF2 = iE2 - c6592e.f60344R.f();
        if (iE == iE2) {
            fQ = 0.5f;
        } else {
            iE = iF;
            iE2 = iF2;
        }
        int iX = c6592e.x();
        int i11 = (iE2 - iE) - iX;
        if (iE > iE2) {
            i11 = (iE - iE2) - iX;
        }
        int i12 = (int) (i11 > 0 ? (fQ * i11) + 0.5f : fQ * i11);
        int i13 = iE + i12;
        int i14 = i13 + iX;
        if (iE > iE2) {
            i13 = iE - i12;
            i14 = i13 - iX;
        }
        c6592e.E0(i13, i14);
        i(i10 + 1, c6592e, interfaceC0913b);
    }

    private static void g(int i10, C6592e c6592e, C6718b.InterfaceC0913b interfaceC0913b, C6592e c6592e2) {
        float fQ = c6592e2.Q();
        int iE = c6592e2.f60342P.f60302f.e() + c6592e2.f60342P.f();
        int iE2 = c6592e2.f60344R.f60302f.e() - c6592e2.f60344R.f();
        if (iE2 >= iE) {
            int iX = c6592e2.x();
            if (c6592e2.U() != 8) {
                int i11 = c6592e2.f60399x;
                if (i11 == 2) {
                    iX = (int) (fQ * 0.5f * (c6592e instanceof C6593f ? c6592e.x() : c6592e.L().x()));
                } else if (i11 == 0) {
                    iX = iE2 - iE;
                }
                iX = Math.max(c6592e2.f60321C, iX);
                int i12 = c6592e2.f60323D;
                if (i12 > 0) {
                    iX = Math.min(i12, iX);
                }
            }
            int i13 = iE + ((int) ((fQ * ((iE2 - iE) - iX)) + 0.5f));
            c6592e2.E0(i13, iX + i13);
            i(i10 + 1, c6592e2, interfaceC0913b);
        }
    }

    public static void h(C6593f c6593f, C6718b.InterfaceC0913b interfaceC0913b) {
        C6592e.b bVarA = c6593f.A();
        C6592e.b bVarS = c6593f.S();
        f61173b = 0;
        f61174c = 0;
        c6593f.u0();
        ArrayList arrayListO1 = c6593f.o1();
        int size = arrayListO1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C6592e) arrayListO1.get(i10)).u0();
        }
        boolean zM1 = c6593f.M1();
        if (bVarA == C6592e.b.FIXED) {
            c6593f.B0(0, c6593f.V());
        } else {
            c6593f.C0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C6592e c6592e = (C6592e) arrayListO1.get(i11);
            if (c6592e instanceof C6595h) {
                C6595h c6595h = (C6595h) c6592e;
                if (c6595h.o1() == 1) {
                    if (c6595h.p1() != -1) {
                        c6595h.s1(c6595h.p1());
                    } else if (c6595h.q1() != -1 && c6593f.m0()) {
                        c6595h.s1(c6593f.V() - c6595h.q1());
                    } else if (c6593f.m0()) {
                        c6595h.s1((int) ((c6595h.r1() * c6593f.V()) + 0.5f));
                    }
                    z10 = true;
                }
            } else if ((c6592e instanceof C6588a) && ((C6588a) c6592e).t1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C6592e c6592e2 = (C6592e) arrayListO1.get(i12);
                if (c6592e2 instanceof C6595h) {
                    C6595h c6595h2 = (C6595h) c6592e2;
                    if (c6595h2.o1() == 1) {
                        b(0, c6595h2, interfaceC0913b, zM1);
                    }
                }
            }
        }
        b(0, c6593f, interfaceC0913b, zM1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C6592e c6592e3 = (C6592e) arrayListO1.get(i13);
                if (c6592e3 instanceof C6588a) {
                    C6588a c6588a = (C6588a) c6592e3;
                    if (c6588a.t1() == 0) {
                        c(0, c6588a, interfaceC0913b, 0, zM1);
                    }
                }
            }
        }
        if (bVarS == C6592e.b.FIXED) {
            c6593f.E0(0, c6593f.x());
        } else {
            c6593f.D0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C6592e c6592e4 = (C6592e) arrayListO1.get(i14);
            if (c6592e4 instanceof C6595h) {
                C6595h c6595h3 = (C6595h) c6592e4;
                if (c6595h3.o1() == 0) {
                    if (c6595h3.p1() != -1) {
                        c6595h3.s1(c6595h3.p1());
                    } else if (c6595h3.q1() != -1 && c6593f.n0()) {
                        c6595h3.s1(c6593f.x() - c6595h3.q1());
                    } else if (c6593f.n0()) {
                        c6595h3.s1((int) ((c6595h3.r1() * c6593f.x()) + 0.5f));
                    }
                    z12 = true;
                }
            } else if ((c6592e4 instanceof C6588a) && ((C6588a) c6592e4).t1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                C6592e c6592e5 = (C6592e) arrayListO1.get(i15);
                if (c6592e5 instanceof C6595h) {
                    C6595h c6595h4 = (C6595h) c6592e5;
                    if (c6595h4.o1() == 0) {
                        i(1, c6595h4, interfaceC0913b);
                    }
                }
            }
        }
        i(0, c6593f, interfaceC0913b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C6592e c6592e6 = (C6592e) arrayListO1.get(i16);
                if (c6592e6 instanceof C6588a) {
                    C6588a c6588a2 = (C6588a) c6592e6;
                    if (c6588a2.t1() == 1) {
                        c(0, c6588a2, interfaceC0913b, 1, zM1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            C6592e c6592e7 = (C6592e) arrayListO1.get(i17);
            if (c6592e7.l0() && a(0, c6592e7)) {
                C6593f.P1(0, c6592e7, interfaceC0913b, f61172a, C6718b.a.f61126k);
                if (!(c6592e7 instanceof C6595h)) {
                    b(0, c6592e7, interfaceC0913b, zM1);
                    i(0, c6592e7, interfaceC0913b);
                } else if (((C6595h) c6592e7).o1() == 0) {
                    i(0, c6592e7, interfaceC0913b);
                } else {
                    b(0, c6592e7, interfaceC0913b, zM1);
                }
            }
        }
    }

    private static void i(int i10, C6592e c6592e, C6718b.InterfaceC0913b interfaceC0913b) {
        C6591d c6591d;
        C6591d c6591d2;
        C6591d c6591d3;
        C6591d c6591d4;
        if (c6592e.o0()) {
            return;
        }
        boolean z10 = true;
        f61174c++;
        if (!(c6592e instanceof C6593f) && c6592e.l0()) {
            int i11 = i10 + 1;
            if (a(i11, c6592e)) {
                C6593f.P1(i11, c6592e, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
            }
        }
        C6591d c6591dO = c6592e.o(C6591d.a.TOP);
        C6591d c6591dO2 = c6592e.o(C6591d.a.BOTTOM);
        int iE = c6591dO.e();
        int iE2 = c6591dO2.e();
        if (c6591dO.d() != null && c6591dO.n()) {
            for (C6591d c6591d5 : c6591dO.d()) {
                C6592e c6592e2 = c6591d5.f60300d;
                int i12 = i10 + 1;
                boolean zA = a(i12, c6592e2);
                if (c6592e2.l0() && zA) {
                    C6593f.P1(i12, c6592e2, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
                }
                boolean z11 = ((c6591d5 == c6592e2.f60342P && (c6591d4 = c6592e2.f60344R.f60302f) != null && c6591d4.n()) || (c6591d5 == c6592e2.f60344R && (c6591d3 = c6592e2.f60342P.f60302f) != null && c6591d3.n())) ? z10 : false;
                C6592e.b bVarS = c6592e2.S();
                boolean z12 = z10;
                C6592e.b bVar = C6592e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || zA) {
                    if (!c6592e2.l0()) {
                        C6591d c6591d6 = c6592e2.f60342P;
                        if (c6591d5 == c6591d6 && c6592e2.f60344R.f60302f == null) {
                            int iF = c6591d6.f() + iE;
                            c6592e2.E0(iF, c6592e2.x() + iF);
                            i(i12, c6592e2, interfaceC0913b);
                        } else {
                            C6591d c6591d7 = c6592e2.f60344R;
                            if (c6591d5 == c6591d7 && c6591d6.f60302f == null) {
                                int iF2 = iE - c6591d7.f();
                                c6592e2.E0(iF2 - c6592e2.x(), iF2);
                                i(i12, c6592e2, interfaceC0913b);
                            } else if (z11 && !c6592e2.j0()) {
                                f(i12, interfaceC0913b, c6592e2);
                            }
                        }
                    }
                } else if (c6592e2.S() == bVar && c6592e2.f60323D >= 0 && c6592e2.f60321C >= 0 && ((c6592e2.U() == 8 || (c6592e2.f60399x == 0 && c6592e2.v() == 0.0f)) && !c6592e2.j0() && !c6592e2.k0() && z11 && !c6592e2.j0())) {
                    g(i12, c6592e, interfaceC0913b, c6592e2);
                }
                z10 = z12;
            }
        }
        boolean z13 = z10;
        if (c6592e instanceof C6595h) {
            return;
        }
        if (c6591dO2.d() != null && c6591dO2.n()) {
            for (C6591d c6591d8 : c6591dO2.d()) {
                C6592e c6592e3 = c6591d8.f60300d;
                int i13 = i10 + 1;
                boolean zA2 = a(i13, c6592e3);
                if (c6592e3.l0() && zA2) {
                    C6593f.P1(i13, c6592e3, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
                }
                boolean z14 = ((c6591d8 == c6592e3.f60342P && (c6591d2 = c6592e3.f60344R.f60302f) != null && c6591d2.n()) || (c6591d8 == c6592e3.f60344R && (c6591d = c6592e3.f60342P.f60302f) != null && c6591d.n())) ? z13 : false;
                C6592e.b bVarS2 = c6592e3.S();
                C6592e.b bVar2 = C6592e.b.MATCH_CONSTRAINT;
                if (bVarS2 != bVar2 || zA2) {
                    if (!c6592e3.l0()) {
                        C6591d c6591d9 = c6592e3.f60342P;
                        if (c6591d8 == c6591d9 && c6592e3.f60344R.f60302f == null) {
                            int iF3 = c6591d9.f() + iE2;
                            c6592e3.E0(iF3, c6592e3.x() + iF3);
                            i(i13, c6592e3, interfaceC0913b);
                        } else {
                            C6591d c6591d10 = c6592e3.f60344R;
                            if (c6591d8 == c6591d10 && c6591d9.f60302f == null) {
                                int iF4 = iE2 - c6591d10.f();
                                c6592e3.E0(iF4 - c6592e3.x(), iF4);
                                i(i13, c6592e3, interfaceC0913b);
                            } else if (z14 && !c6592e3.j0()) {
                                f(i13, interfaceC0913b, c6592e3);
                            }
                        }
                    }
                } else if (c6592e3.S() == bVar2 && c6592e3.f60323D >= 0 && c6592e3.f60321C >= 0 && (c6592e3.U() == 8 || (c6592e3.f60399x == 0 && c6592e3.v() == 0.0f))) {
                    if (!c6592e3.j0() && !c6592e3.k0() && z14 && !c6592e3.j0()) {
                        g(i13, c6592e, interfaceC0913b, c6592e3);
                    }
                }
            }
        }
        C6591d c6591dO3 = c6592e.o(C6591d.a.BASELINE);
        if (c6591dO3.d() != null && c6591dO3.n()) {
            int iE3 = c6591dO3.e();
            for (C6591d c6591d11 : c6591dO3.d()) {
                C6592e c6592e4 = c6591d11.f60300d;
                int i14 = i10 + 1;
                boolean zA3 = a(i14, c6592e4);
                if (c6592e4.l0() && zA3) {
                    C6593f.P1(i14, c6592e4, interfaceC0913b, new C6718b.a(), C6718b.a.f61126k);
                }
                if (c6592e4.S() != C6592e.b.MATCH_CONSTRAINT || zA3) {
                    if (!c6592e4.l0() && c6591d11 == c6592e4.f60345S) {
                        c6592e4.A0(c6591d11.f() + iE3);
                        i(i14, c6592e4, interfaceC0913b);
                    }
                }
            }
        }
        c6592e.q0();
    }
}
