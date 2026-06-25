package K;

import I0.AbstractC1691q;
import I0.InterfaceC1690p;
import U0.C2197e;
import U0.I0;
import U0.T0;
import U0.V0;
import U0.W0;
import U0.X0;
import Y0.AbstractC2485u;
import a1.C2527U;
import a1.C2529W;
import a1.C2544l;
import a1.C2552t;
import a1.InterfaceC2517J;
import g1.C4821a;
import g1.C4831k;
import i1.C5025r;
import i1.EnumC5027t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.AbstractC6225g;
import r0.AbstractC6227i;
import r0.AbstractC6231m;
import r0.C6224f;
import r0.C6226h;
import s0.C1;
import s0.C6356g1;
import s0.C6385r0;
import s0.InterfaceC6364j0;
import s0.InterfaceC6368k1;
import u0.AbstractC6712g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9784a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: K.L$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0137a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2544l f9785a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f9786b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f9787c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0137a(C2544l c2544l, Function1 function1, kotlin.jvm.internal.N n10) {
                super(1);
                this.f9785a = c2544l;
                this.f9786b = function1;
                this.f9787c = n10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return Td.L.f17438a;
            }

            public final void invoke(List list) {
                L.f9784a.g(list, this.f9785a, this.f9786b, (a1.c0) this.f9787c.f52259a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC1690p f9788a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC1690p interfaceC1690p) {
                super(1);
                this.f9788a = interfaceC1690p;
            }

            public final void a(float[] fArr) {
                if (this.f9788a.b()) {
                    AbstractC1691q.d(this.f9788a).o0(this.f9788a, fArr);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C6356g1) obj).p());
                return Td.L.f17438a;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void c(InterfaceC6364j0 interfaceC6364j0, long j10, InterfaceC2517J interfaceC2517J, T0 t02, InterfaceC6368k1 interfaceC6368k1) {
            int iB = interfaceC2517J.b(W0.l(j10));
            int iB2 = interfaceC2517J.b(W0.k(j10));
            if (iB != iB2) {
                interfaceC6364j0.t(t02.z(iB, iB2), interfaceC6368k1);
            }
        }

        public final a1.d0 a(long j10, a1.d0 d0Var) {
            int iB = d0Var.a().b(W0.n(j10));
            int iB2 = d0Var.a().b(W0.i(j10));
            int iMin = Math.min(iB, iB2);
            int iMax = Math.max(iB, iB2);
            C2197e.b bVar = new C2197e.b(d0Var.b());
            bVar.a(new I0(0L, 0L, (Y0.L) null, (Y0.H) null, (Y0.I) null, (AbstractC2485u) null, (String) null, 0L, (C4821a) null, (g1.q) null, (c1.e) null, 0L, C4831k.f47287b.d(), (C1) null, (U0.F) null, (AbstractC6712g) null, 61439, (DefaultConstructorMarker) null), iMin, iMax);
            return new a1.d0(bVar.l(), d0Var.a());
        }

        public final void b(InterfaceC6364j0 interfaceC6364j0, C2527U c2527u, long j10, long j11, InterfaceC2517J interfaceC2517J, T0 t02, InterfaceC6368k1 interfaceC6368k1, long j12) throws Throwable {
            if (!W0.h(j10)) {
                interfaceC6368k1.p(j12);
                c(interfaceC6364j0, j10, interfaceC2517J, t02, interfaceC6368k1);
            } else if (!W0.h(j11)) {
                C6385r0 c6385r0M = C6385r0.m(t02.l().i().j());
                if (c6385r0M.A() == 16) {
                    c6385r0M = null;
                }
                long jA = c6385r0M != null ? c6385r0M.A() : C6385r0.f58985b.a();
                interfaceC6368k1.p(C6385r0.q(jA, C6385r0.t(jA) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                c(interfaceC6364j0, j11, interfaceC2517J, t02, interfaceC6368k1);
            } else if (!W0.h(c2527u.k())) {
                interfaceC6368k1.p(j12);
                c(interfaceC6364j0, c2527u.k(), interfaceC2517J, t02, interfaceC6368k1);
            }
            V0.f18784a.a(interfaceC6364j0, t02);
        }

        public final Td.y d(H h10, long j10, EnumC5027t enumC5027t, T0 t02) {
            T0 t0L = h10.l(j10, enumC5027t, t02);
            return new Td.y(Integer.valueOf(C5025r.g(t0L.B())), Integer.valueOf(C5025r.f(t0L.B())), t0L);
        }

        public final void e(C2527U c2527u, H h10, T0 t02, InterfaceC1690p interfaceC1690p, a1.c0 c0Var, boolean z10, InterfaceC2517J interfaceC2517J) {
            if (z10) {
                int iB = interfaceC2517J.b(W0.k(c2527u.k()));
                C6226h c6226hD = iB < t02.l().j().length() ? t02.d(iB) : iB != 0 ? t02.d(iB - 1) : new C6226h(0.0f, 0.0f, 1.0f, C5025r.f(M.b(h10.j(), h10.a(), h10.b(), null, 0, 24, null)));
                long jE0 = interfaceC1690p.E0(AbstractC6225g.a(c6226hD.i(), c6226hD.l()));
                c0Var.c(AbstractC6227i.b(AbstractC6225g.a(C6224f.m(jE0), C6224f.n(jE0)), AbstractC6231m.a(c6226hD.n(), c6226hD.h())));
            }
        }

        public final void f(a1.c0 c0Var, C2544l c2544l, Function1 function1) {
            function1.invoke(C2527U.g(c2544l.g(), null, 0L, null, 3, null));
            c0Var.a();
        }

        public final void g(List list, C2544l c2544l, Function1 function1, a1.c0 c0Var) {
            C2527U c2527uB = c2544l.b(list);
            if (c0Var != null) {
                c0Var.d(null, c2527uB);
            }
            function1.invoke(c2527uB);
        }

        public final a1.c0 h(C2529W c2529w, C2527U c2527u, C2544l c2544l, C2552t c2552t, Function1 function1, Function1 function12) {
            return i(c2529w, c2527u, c2544l, c2552t, function1, function12);
        }

        public final a1.c0 i(C2529W c2529w, C2527U c2527u, C2544l c2544l, C2552t c2552t, Function1 function1, Function1 function12) {
            kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
            a1.c0 c0VarD = c2529w.d(c2527u, c2552t, new C0137a(c2544l, function1, n10), function12);
            n10.f52259a = c0VarD;
            return c0VarD;
        }

        public final void j(long j10, Z z10, C2544l c2544l, InterfaceC2517J interfaceC2517J, Function1 function1) {
            function1.invoke(C2527U.g(c2544l.g(), null, X0.a(interfaceC2517J.a(Z.e(z10, j10, false, 2, null))), null, 5, null));
        }

        public final void k(a1.c0 c0Var, C2527U c2527u, InterfaceC2517J interfaceC2517J, Z z10) {
            InterfaceC1690p interfaceC1690pB;
            InterfaceC1690p interfaceC1690pC = z10.c();
            if (interfaceC1690pC == null || !interfaceC1690pC.b() || (interfaceC1690pB = z10.b()) == null) {
                return;
            }
            c0Var.e(c2527u, interfaceC2517J, z10.f(), new b(interfaceC1690pC), Q.z.b(interfaceC1690pC), interfaceC1690pC.w0(interfaceC1690pB, false));
        }

        private a() {
        }
    }
}
