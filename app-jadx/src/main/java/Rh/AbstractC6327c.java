package rh;

import fh.C4810c;
import hh.C4955b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jh.C5406d;
import mh.C5701f;
import nh.C5797g;
import oh.C5903c;
import ph.C6053c;
import sh.t;
import sh.z;
import zg.AbstractC7387B;
import zg.AbstractC7394b;
import zg.AbstractC7428u;
import zg.AbstractC7432y;
import zg.C7427t;

/* JADX INFO: renamed from: rh.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6327c {

    /* JADX INFO: renamed from: a */
    private static Map f58817a;

    /* JADX INFO: renamed from: rh.c$A */
    private static class A extends y {
        private A() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            t.b bVarF;
            Vg.l lVarN = Vg.l.n(bVar.l().p());
            if (lVarN != null) {
                C7427t c7427tL = lVarN.r().l();
                Vg.p pVarL = Vg.p.l(bVar.r());
                bVarF = new t.b(new sh.r(lVarN.l(), lVarN.p(), AbstractC6330e.j(c7427tL))).g(pVarL.n()).h(pVarL.p());
            } else {
                byte[] bArrB = AbstractC7428u.z(bVar.r()).B();
                bVarF = new t.b(sh.r.i(Oh.g.a(bArrB, 0))).f(bArrB);
            }
            return bVarF.e();
        }

        /* synthetic */ A(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$b */
    private static class b extends y {
        private b() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            try {
                return new Xg.e(AbstractC6330e.b(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
            } catch (Exception unused) {
                return new Xg.e(AbstractC6330e.b(bVar.l().l()), bVar.p().D());
            }
        }

        /* synthetic */ b(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$c */
    private static class C0891c extends y {
        private C0891c() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            try {
                return new Yg.h(AbstractC6330e.r(bVar.l().l()), Vg.b.l(bVar.r()).n());
            } catch (Exception unused) {
                return new Yg.h(AbstractC6330e.r(bVar.l().l()), bVar.p().D());
            }
        }

        /* synthetic */ C0891c(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$d */
    static class d extends y {
        d() {
            super();
        }

        static Zg.e b(Zg.c cVar, AbstractC7394b abstractC7394b) {
            try {
                AbstractC7432y abstractC7432yV = AbstractC7432y.v(abstractC7394b.D());
                if (!(abstractC7432yV instanceof AbstractC7387B)) {
                    return new Zg.e(cVar, AbstractC7428u.z(abstractC7432yV).B());
                }
                AbstractC7387B abstractC7387BA = AbstractC7387B.A(abstractC7432yV);
                return new Zg.e(cVar, AbstractC7428u.z(abstractC7387BA.B(0)).B(), AbstractC7428u.z(abstractC7387BA.B(1)).B());
            } catch (Exception unused) {
                return new Zg.e(cVar, abstractC7394b.D());
            }
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return b(AbstractC6330e.d(bVar.l().l()), bVar.p());
        }
    }

    /* JADX INFO: renamed from: rh.c$e */
    private static class e extends y {
        private e() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            byte[] bArrD = bVar.p().D();
            return new ah.d(AbstractC6330e.f(bVar.l().l()), Oh.a.m(bArrD, 1, bArrD.length));
        }

        /* synthetic */ e(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$f */
    private static class f extends y {
        private f() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new bh.f(AbstractC6330e.h(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ f(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$g */
    private static class g extends y {
        private g() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            try {
                return new ch.f(AbstractC6330e.m(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
            } catch (Exception unused) {
                return new ch.f(AbstractC6330e.m(bVar.l().l()), bVar.p().D());
            }
        }

        /* synthetic */ g(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$h */
    private static class h extends y {
        private h() {
            super();
        }

        private dh.j b(byte[] bArr) {
            return dh.d.b(bArr);
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            byte[] bArrD = bVar.p().D();
            AbstractC7428u abstractC7428u = (AbstractC7428u) AbstractC6330e.A(bArrD);
            return abstractC7428u != null ? b(abstractC7428u.B()) : b(bArrD);
        }

        /* synthetic */ h(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$i */
    static class i extends y {
        i() {
            super();
        }

        static fh.e b(C4810c c4810c, AbstractC7394b abstractC7394b) {
            try {
                AbstractC7432y abstractC7432yV = AbstractC7432y.v(abstractC7394b.D());
                if (!(abstractC7432yV instanceof AbstractC7387B)) {
                    return new fh.e(c4810c, AbstractC7428u.z(abstractC7432yV).B());
                }
                AbstractC7387B abstractC7387BA = AbstractC7387B.A(abstractC7432yV);
                return new fh.e(c4810c, AbstractC7428u.z(abstractC7387BA.B(0)).B(), AbstractC7428u.z(abstractC7387BA.B(1)).B());
            } catch (Exception unused) {
                return new fh.e(c4810c, abstractC7394b.D());
            }
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return b(AbstractC6330e.t(bVar.l().l()), bVar.p());
        }
    }

    /* JADX INFO: renamed from: rh.c$j */
    static class j extends y {
        j() {
            super();
        }

        static gh.g b(gh.e eVar, AbstractC7394b abstractC7394b) {
            try {
                AbstractC7432y abstractC7432yV = AbstractC7432y.v(abstractC7394b.D());
                if (!(abstractC7432yV instanceof AbstractC7387B)) {
                    return new gh.g(eVar, AbstractC7428u.z(abstractC7432yV).B());
                }
                AbstractC7387B abstractC7387BA = AbstractC7387B.A(abstractC7432yV);
                return new gh.g(eVar, AbstractC7428u.z(abstractC7387BA.B(0)).B(), AbstractC7428u.z(abstractC7387BA.B(1)).B());
            } catch (Exception unused) {
                return new gh.g(eVar, abstractC7394b.D());
            }
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new gh.g(AbstractC6330e.v(bVar.l().l()), bVar.p().D());
        }
    }

    /* JADX INFO: renamed from: rh.c$k */
    private static class k extends y {
        private k() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new eh.d(AbstractC6330e.p(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ k(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$l */
    private static class l extends y {
        private l() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            Vg.f fVarP = Vg.f.p(bVar.r());
            return new Kh.c(fVarP.r(), fVarP.s(), fVarP.n(), AbstractC6330e.k(fVarP.l().l()));
        }

        /* synthetic */ l(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$m */
    private static class m extends y {
        private m() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new C4955b(bVar.p().z());
        }

        /* synthetic */ m(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$n */
    private static class n extends y {
        private n() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new C5406d(AbstractC6330e.z(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ n(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$o */
    private static class o extends y {
        private o() {
            super();
        }

        private ih.d b(Dg.b bVar, byte[] bArr) {
            return new ih.d(AbstractC6330e.x(bVar.l().l()), bArr);
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            byte[] bArrD = bVar.p().D();
            AbstractC7428u abstractC7428uB = AbstractC6330e.B(bArrD);
            return abstractC7428uB != null ? b(bVar, abstractC7428uB.B()) : b(bVar, bArrD);
        }

        /* synthetic */ o(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$p */
    private static class p extends y {
        private p() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new kh.d(AbstractC6330e.D(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ p(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$q */
    private static class q extends y {
        private q() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new Lh.b(AbstractC6330e.F(bVar.l()), bVar.p().D());
        }

        /* synthetic */ q(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$r */
    private static class r extends y {
        private r() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new lh.h(AbstractC6330e.H(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ r(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$s */
    private static class s extends y {
        private s() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new C5701f(AbstractC6330e.K(bVar.l().l()), AbstractC7428u.z(AbstractC7387B.A(bVar.r()).B(0)).B());
        }

        /* synthetic */ s(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$t */
    private static class t extends y {
        private t() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            try {
                byte[] bArrB = AbstractC7428u.z(bVar.r()).B();
                return new C5797g(AbstractC6330e.M(bVar.l().l()), Oh.a.m(bArrB, 4, bArrB.length));
            } catch (Exception unused) {
                return new C5797g(AbstractC6330e.M(bVar.l().l()), bVar.p().D());
            }
        }

        /* synthetic */ t(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$u */
    private static class u extends y {
        private u() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new jh.h(AbstractC6330e.Q(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ u(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$v */
    private static class v extends y {
        private v() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new C6053c(bVar.p().z(), AbstractC6330e.S(Vg.h.l(bVar.l().p())));
        }

        /* synthetic */ v(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$w */
    private static class w extends y {
        private w() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            try {
                byte[] bArrB = AbstractC7428u.z(bVar.r()).B();
                return new qh.g(AbstractC6330e.U(bVar.l().l()), Oh.a.m(bArrB, 4, bArrB.length));
            } catch (Exception unused) {
                return new qh.g(AbstractC6330e.U(bVar.l().l()), bVar.p().D());
            }
        }

        /* synthetic */ w(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$x */
    private static class x extends y {
        private x() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            return new C5903c(AbstractC6330e.O(bVar.l().l()), AbstractC7428u.z(bVar.r()).B());
        }

        /* synthetic */ x(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$y */
    private static abstract class y {
        private y() {
        }

        abstract Kg.a a(Dg.b bVar, Object obj);

        /* synthetic */ y(C6328a c6328a) {
            this();
        }
    }

    /* JADX INFO: renamed from: rh.c$z */
    private static class z extends y {
        private z() {
            super();
        }

        @Override // rh.AbstractC6327c.y
        Kg.a a(Dg.b bVar, Object obj) {
            z.b bVarF;
            Vg.k kVarN = Vg.k.n(bVar.l().p());
            if (kVarN != null) {
                C7427t c7427tL = kVarN.p().l();
                Vg.p pVarL = Vg.p.l(bVar.r());
                bVarF = new z.b(new sh.x(kVarN.l(), AbstractC6330e.j(c7427tL))).g(pVarL.n()).h(pVarL.p());
            } else {
                byte[] bArrB = AbstractC7428u.z(bVar.r()).B();
                bVarF = new z.b(sh.x.k(Oh.g.a(bArrB, 0))).f(bArrB);
            }
            return bVarF.e();
        }

        /* synthetic */ z(C6328a c6328a) {
            this();
        }
    }

    static {
        HashMap map = new HashMap();
        f58817a = map;
        map.put(Vg.g.f20313X, new q());
        f58817a.put(Vg.g.f20314Y, new q());
        f58817a.put(Vg.g.f20342r, new v());
        f58817a.put(Vg.g.f20346v, new m());
        f58817a.put(Vg.g.f20347w, new z());
        f58817a.put(Vg.g.f20295F, new A());
        f58817a.put(Lg.a.f11606a, new z());
        f58817a.put(Lg.a.f11607b, new A());
        f58817a.put(Cg.a.f3192R0, new h());
        f58817a.put(Vg.g.f20338n, new l());
        f58817a.put(Ag.a.f596a0, new w());
        f58817a.put(Ag.a.f603b0, new w());
        f58817a.put(Ag.a.f610c0, new w());
        f58817a.put(Ag.a.f617d0, new w());
        f58817a.put(Ag.a.f624e0, new w());
        f58817a.put(Ag.a.f631f0, new w());
        f58817a.put(Ag.a.f638g0, new w());
        f58817a.put(Ag.a.f645h0, new w());
        f58817a.put(Ag.a.f652i0, new w());
        f58817a.put(Ag.a.f659j0, new w());
        f58817a.put(Ag.a.f666k0, new w());
        f58817a.put(Ag.a.f673l0, new w());
        f58817a.put(Ag.a.f680m0, new w());
        f58817a.put(Ag.a.f687n0, new w());
        f58817a.put(Ag.a.f693o0, new w());
        f58817a.put(Ag.a.f699p0, new w());
        f58817a.put(Ag.a.f705q0, new w());
        f58817a.put(Ag.a.f711r0, new w());
        f58817a.put(Ag.a.f717s0, new w());
        f58817a.put(Ag.a.f747x0, new w());
        f58817a.put(Ag.a.f753y0, new w());
        f58817a.put(Ag.a.f458D0, new w());
        f58817a.put(Ag.a.f464E0, new w());
        f58817a.put(Ag.a.f494J0, new w());
        f58817a.put(Ag.a.f500K0, new w());
        f58817a.put(Ag.a.f518N0, new w());
        f58817a.put(Ag.a.f512M0, new w());
        f58817a.put(Ag.a.f554T0, new w());
        f58817a.put(Ag.a.f548S0, new w());
        f58817a.put(Ag.a.f530P0, new w());
        f58817a.put(Ag.a.f524O0, new w());
        f58817a.put(Ag.a.f566V0, new w());
        f58817a.put(Ag.a.f560U0, new w());
        f58817a.put(Ag.a.f542R0, new w());
        f58817a.put(Ag.a.f536Q0, new w());
        f58817a.put(Ag.a.f578X0, new w());
        f58817a.put(Ag.a.f572W0, new w());
        f58817a.put(new C7427t("1.3.9999.6.4.10"), new w());
        f58817a.put(Ag.a.f460D2, new C0891c());
        f58817a.put(Ag.a.f466E2, new C0891c());
        f58817a.put(Ag.a.f472F2, new C0891c());
        f58817a.put(Ag.a.f478G2, new C0891c());
        f58817a.put(Ag.a.f484H2, new C0891c());
        f58817a.put(Ag.a.f490I2, new C0891c());
        f58817a.put(Ag.a.f496J2, new C0891c());
        f58817a.put(Ag.a.f502K2, new C0891c());
        f58817a.put(Ag.a.f508L2, new C0891c());
        f58817a.put(Ag.a.f514M2, new C0891c());
        f58817a.put(Ag.a.f526O2, new f());
        f58817a.put(Ag.a.f532P2, new f());
        f58817a.put(Ag.a.f538Q2, new f());
        f58817a.put(Ag.a.f544R2, new f());
        f58817a.put(Ag.a.f550S2, new f());
        f58817a.put(Ag.a.f556T2, new f());
        f58817a.put(Ag.a.f568V2, new s());
        f58817a.put(Ag.a.f574W2, new s());
        f58817a.put(Ag.a.f580X2, new s());
        f58817a.put(Ag.a.f586Y2, new s());
        f58817a.put(Ag.a.f592Z2, new s());
        f58817a.put(Ag.a.f599a3, new s());
        f58817a.put(Ag.a.f606b3, new s());
        f58817a.put(Ag.a.f613c3, new s());
        f58817a.put(Ag.a.f620d3, new s());
        f58817a.put(Ag.a.f627e3, new s());
        f58817a.put(Ag.a.f634f3, new s());
        f58817a.put(Ag.a.f641g3, new s());
        f58817a.put(Ag.a.f648h3, new s());
        f58817a.put(Ag.a.f655i3, new s());
        f58817a.put(Ag.a.f662j3, new s());
        f58817a.put(Ag.a.f669k3, new s());
        f58817a.put(Ag.a.f676l3, new s());
        f58817a.put(Ag.a.f683m3, new s());
        f58817a.put(Ag.a.f706q1, new p());
        f58817a.put(Ag.a.f712r1, new p());
        f58817a.put(Ag.a.f718s1, new p());
        f58817a.put(Ag.a.f724t1, new p());
        f58817a.put(Ag.a.f730u1, new p());
        f58817a.put(Ag.a.f736v1, new p());
        f58817a.put(Ag.a.f742w1, new p());
        f58817a.put(Ag.a.f748x1, new p());
        f58817a.put(Ag.a.f754y1, new p());
        f58817a.put(Ag.a.f760z1, new p());
        f58817a.put(Ag.a.f441A1, new p());
        f58817a.put(Ag.a.f447B1, new p());
        f58817a.put(Ag.a.f750x3, new o());
        f58817a.put(Ag.a.f756y3, new o());
        f58817a.put(Ag.a.f762z3, new o());
        f58817a.put(Ag.a.f449B3, new o());
        f58817a.put(Ag.a.f443A3, new o());
        f58817a.put(Ag.a.f455C3, new o());
        f58817a.put(Ag.a.f483H1, new e());
        f58817a.put(Ag.a.f501K1, new e());
        f58817a.put(Bg.a.f1949X0, new j());
        f58817a.put(Bg.a.f1951Y0, new j());
        f58817a.put(Bg.a.f1953Z0, new j());
        f58817a.put(Ag.a.f485H3, new j());
        f58817a.put(Ag.a.f491I3, new j());
        f58817a.put(Ag.a.f497J3, new j());
        f58817a.put(Ag.a.f515M3, new n());
        f58817a.put(Ag.a.f521N3, new n());
        f58817a.put(Ag.a.f527O3, new n());
        f58817a.put(Ag.a.f533P3, new n());
        f58817a.put(Ag.a.f539Q3, new n());
        f58817a.put(Ag.a.f545R3, new n());
        f58817a.put(Ag.a.f557T3, new u());
        f58817a.put(Ag.a.f563U3, new u());
        f58817a.put(Ag.a.f569V3, new u());
        f58817a.put(Ag.a.f575W3, new u());
        f58817a.put(Ag.a.f581X3, new u());
        f58817a.put(Ag.a.f587Y3, new u());
        f58817a.put(Bg.a.f1991s0, new i());
        f58817a.put(Bg.a.f1993t0, new i());
        f58817a.put(Bg.a.f1995u0, new i());
        f58817a.put(Bg.a.f1997v0, new i());
        f58817a.put(Bg.a.f1999w0, new i());
        f58817a.put(Bg.a.f2001x0, new i());
        f58817a.put(Ag.a.f549S1, new d());
        f58817a.put(Ag.a.f555T1, new d());
        f58817a.put(Ag.a.f561U1, new d());
        f58817a.put(Ag.a.f567V1, new d());
        f58817a.put(Ag.a.f573W1, new d());
        f58817a.put(Ag.a.f579X1, new d());
        f58817a.put(Ag.a.f600a4, new b());
        f58817a.put(Ag.a.f607b4, new b());
        f58817a.put(Ag.a.f614c4, new b());
        f58817a.put(Ag.a.f628e4, new g());
        f58817a.put(Ag.a.f635f4, new g());
        f58817a.put(Ag.a.f642g4, new g());
        f58817a.put(Ag.a.f707q2, new r());
        f58817a.put(Ag.a.f713r2, new r());
        f58817a.put(Ag.a.f719s2, new r());
        f58817a.put(Ag.a.f725t2, new r());
        f58817a.put(Ag.a.f731u2, new r());
        f58817a.put(Ag.a.f737v2, new r());
        f58817a.put(Bg.a.f2003y0, new t());
        f58817a.put(Bg.a.f2005z0, new t());
        f58817a.put(Bg.a.f1903A0, new t());
        f58817a.put(Bg.a.f1905B0, new t());
        f58817a.put(Bg.a.f1907C0, new t());
        f58817a.put(Bg.a.f1909D0, new t());
        f58817a.put(Bg.a.f1911E0, new t());
        f58817a.put(Bg.a.f1913F0, new t());
        f58817a.put(Bg.a.f1915G0, new t());
        f58817a.put(Bg.a.f1917H0, new t());
        f58817a.put(Bg.a.f1919I0, new t());
        f58817a.put(Bg.a.f1921J0, new t());
        f58817a.put(Bg.a.f1923K0, new t());
        f58817a.put(Bg.a.f1925L0, new t());
        f58817a.put(Bg.a.f1927M0, new t());
        f58817a.put(Bg.a.f1929N0, new t());
        f58817a.put(Bg.a.f1931O0, new t());
        f58817a.put(Bg.a.f1933P0, new t());
        f58817a.put(Bg.a.f1935Q0, new t());
        f58817a.put(Bg.a.f1937R0, new t());
        f58817a.put(Bg.a.f1939S0, new t());
        f58817a.put(Bg.a.f1941T0, new t());
        f58817a.put(Bg.a.f1943U0, new t());
        f58817a.put(Bg.a.f1945V0, new t());
        f58817a.put(Ag.a.f656i4, new k());
        f58817a.put(Ag.a.f663j4, new k());
        f58817a.put(Ag.a.f670k4, new k());
        f58817a.put(Ag.a.f677l4, new k());
        f58817a.put(Ag.a.f745w4, new x());
        f58817a.put(Ag.a.f739v4, new x());
        f58817a.put(Ag.a.f757y4, new x());
        f58817a.put(Ag.a.f751x4, new x());
        f58817a.put(Ag.a.f444A4, new x());
        f58817a.put(Ag.a.f763z4, new x());
        f58817a.put(Ag.a.f456C4, new x());
        f58817a.put(Ag.a.f450B4, new x());
        f58817a.put(Ag.a.f468E4, new x());
        f58817a.put(Ag.a.f462D4, new x());
        f58817a.put(Ag.a.f480G4, new x());
        f58817a.put(Ag.a.f474F4, new x());
        f58817a.put(Ag.a.f492I4, new x());
        f58817a.put(Ag.a.f486H4, new x());
        f58817a.put(Ag.a.f504K4, new x());
        f58817a.put(Ag.a.f498J4, new x());
        f58817a.put(Ag.a.f516M4, new x());
        f58817a.put(Ag.a.f510L4, new x());
        f58817a.put(Ag.a.f528O4, new x());
        f58817a.put(Ag.a.f522N4, new x());
        f58817a.put(Ag.a.f540Q4, new x());
        f58817a.put(Ag.a.f534P4, new x());
        f58817a.put(Ag.a.f552S4, new x());
        f58817a.put(Ag.a.f546R4, new x());
        f58817a.put(Ag.a.f564U4, new x());
        f58817a.put(Ag.a.f558T4, new x());
        f58817a.put(Ag.a.f576W4, new x());
        f58817a.put(Ag.a.f570V4, new x());
        f58817a.put(Ag.a.f588Y4, new x());
        f58817a.put(Ag.a.f582X4, new x());
        f58817a.put(Ag.a.f601a5, new x());
        f58817a.put(Ag.a.f594Z4, new x());
        f58817a.put(Ag.a.f615c5, new x());
        f58817a.put(Ag.a.f608b5, new x());
        f58817a.put(Ag.a.f629e5, new x());
        f58817a.put(Ag.a.f622d5, new x());
        f58817a.put(Ag.a.f643g5, new x());
        f58817a.put(Ag.a.f636f5, new x());
        f58817a.put(Ag.a.f657i5, new x());
        f58817a.put(Ag.a.f650h5, new x());
        f58817a.put(Ag.a.f671k5, new x());
        f58817a.put(Ag.a.f664j5, new x());
        f58817a.put(Ag.a.f685m5, new x());
        f58817a.put(Ag.a.f678l5, new x());
    }

    public static Kg.a a(Dg.b bVar) {
        if (bVar != null) {
            return b(bVar, null);
        }
        throw new IllegalArgumentException("keyInfo argument null");
    }

    public static Kg.a b(Dg.b bVar, Object obj) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("keyInfo argument null");
        }
        Dg.a aVarL = bVar.l();
        y yVar = (y) f58817a.get(aVarL.l());
        if (yVar != null) {
            return yVar.a(bVar, obj);
        }
        throw new IOException("algorithm identifier in public key not recognised: " + aVarL.l());
    }
}
