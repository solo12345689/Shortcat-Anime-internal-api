package Z;

import Td.C2160k;
import Td.L;
import Y.AbstractC2454w;
import Y.AbstractC2460y;
import Y.C2392b;
import Y.C2406f1;
import Y.C2456w1;
import Y.C2461y0;
import Y.E1;
import Y.H0;
import Y.H1;
import Y.InterfaceC2398d;
import Y.InterfaceC2450u1;
import Y.InterfaceC2457x;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23050b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final A f23051c = new A();

        /* JADX WARN: Illegal instructions before constructor call */
        private A() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2450u1.g((InterfaceC5082a) eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final B f23052c = new B();

        /* JADX WARN: Illegal instructions before constructor call */
        private B() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.U0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C f23053c = new C();

        /* JADX WARN: Illegal instructions before constructor call */
        private C() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2450u1.e((C2406f1) eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class D extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final D f23054c = new D();

        private D() {
            super(1, 0, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            int i10 = eVar.getInt(0);
            int iA0 = h12.a0();
            int iA1 = h12.a1(iA0);
            int iZ0 = h12.Z0(iA0);
            for (int iMax = Math.max(iA1, iZ0 - i10); iMax < iZ0; iMax++) {
                Object obj = h12.f22134c[h12.P(iMax)];
                if (obj instanceof C2456w1) {
                    interfaceC2450u1.a((C2456w1) obj);
                } else if (obj instanceof C2406f1) {
                    ((C2406f1) obj).A();
                }
            }
            h12.h1(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class E extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final E f23055c = new E();

        private E() {
            super(1, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            Object objA = eVar.a(t.a(0));
            C2392b c2392b = (C2392b) eVar.a(t.a(1));
            int i10 = eVar.getInt(0);
            if (objA instanceof C2456w1) {
                interfaceC2450u1.c((C2456w1) objA);
            }
            Object objQ0 = h12.Q0(h12.C(c2392b), i10, objA);
            if (objQ0 instanceof C2456w1) {
                interfaceC2450u1.a((C2456w1) objQ0);
            } else if (objQ0 instanceof C2406f1) {
                ((C2406f1) objQ0).A();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class F extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final F f23056c = new F();

        /* JADX WARN: Illegal instructions before constructor call */
        private F() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.l1(eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class G extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final G f23057c = new G();

        private G() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2398d.d((Function2) eVar.a(t.a(1)), eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class H extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final H f23058c = new H();

        /* JADX WARN: Illegal instructions before constructor call */
        private H() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            Object objA = eVar.a(t.a(0));
            int i10 = eVar.getInt(0);
            if (objA instanceof C2456w1) {
                interfaceC2450u1.c((C2456w1) objA);
            }
            Object objQ0 = h12.Q0(h12.Z(), i10, objA);
            if (objQ0 instanceof C2456w1) {
                interfaceC2450u1.a((C2456w1) objQ0);
            } else if (objQ0 instanceof C2406f1) {
                ((C2406f1) objQ0).A();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class I extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final I f23059c = new I();

        private I() {
            super(1, 0, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            int i10 = eVar.getInt(0);
            for (int i11 = 0; i11 < i10; i11++) {
                interfaceC2398d.k();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class J extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final J f23060c = new J();

        /* JADX WARN: Illegal instructions before constructor call */
        private J() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2398d.i();
        }
    }

    /* JADX INFO: renamed from: Z.d$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2493a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2493a f23061c = new C2493a();

        private C2493a() {
            super(1, 0, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.A(eVar.getInt(0));
        }
    }

    /* JADX INFO: renamed from: Z.d$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2494b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2494b f23062c = new C2494b();

        private C2494b() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            C2392b c2392b = (C2392b) eVar.a(t.a(0));
            Object objA = eVar.a(t.a(1));
            if (objA instanceof C2456w1) {
                interfaceC2450u1.c((C2456w1) objA);
            }
            h12.D(c2392b, objA);
        }
    }

    /* JADX INFO: renamed from: Z.d$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2495c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2495c f23063c = new C2495c();

        private C2495c() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            g0.k kVar = (g0.k) eVar.a(t.a(1));
            int iA = kVar != null ? kVar.a() : 0;
            a aVar = (a) eVar.a(t.a(0));
            if (iA > 0) {
                interfaceC2398d = new H0(interfaceC2398d, iA);
            }
            aVar.b(interfaceC2398d, h12, interfaceC2450u1, fVar != null ? h.k(fVar, h12) : null);
        }
    }

    /* JADX INFO: renamed from: Z.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0394d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0394d f23064c = new C0394d();

        private C0394d() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            int iA = ((g0.k) eVar.a(t.a(0))).a();
            List list = (List) eVar.a(t.a(1));
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i11 = iA + i10;
                interfaceC2398d.g(i11, obj);
                interfaceC2398d.e(i11, obj);
            }
        }
    }

    /* JADX INFO: renamed from: Z.d$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2496e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2496e f23065c = new C2496e();

        private C2496e() {
            super(0, 4, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            C2461y0 c2461y0 = (C2461y0) eVar.a(t.a(2));
            AbstractC2460y abstractC2460y = (AbstractC2460y) eVar.a(t.a(1));
            abstractC2460y.n(c2461y0);
            AbstractC2454w.u("Could not resolve state for movable content");
            throw new C2160k();
        }
    }

    /* JADX INFO: renamed from: Z.d$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2497f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2497f f23066c = new C2497f();

        /* JADX WARN: Illegal instructions before constructor call */
        private C2497f() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            AbstractC2454w.v(h12, interfaceC2450u1);
        }
    }

    /* JADX INFO: renamed from: Z.d$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2498g extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2498g f23067c = new C2498g();

        private C2498g() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            g0.k kVar = (g0.k) eVar.a(t.a(0));
            C2392b c2392b = (C2392b) eVar.a(t.a(1));
            AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            kVar.b(h.i(h12, c2392b, interfaceC2398d));
        }
    }

    /* JADX INFO: renamed from: Z.d$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2499h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2499h f23068c = new C2499h();

        /* JADX WARN: Illegal instructions before constructor call */
        private C2499h() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(t.a(0))) {
                interfaceC2398d.h(obj);
            }
        }
    }

    /* JADX INFO: renamed from: Z.d$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2500i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2500i f23069c = new C2500i();

        private C2500i() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            ((Function1) eVar.a(t.a(0))).invoke((InterfaceC2457x) eVar.a(t.a(1)));
        }
    }

    /* JADX INFO: renamed from: Z.d$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C2501j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2501j f23070c = new C2501j();

        /* JADX WARN: Illegal instructions before constructor call */
        private C2501j() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f23071c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        private k() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            h.j(h12, interfaceC2398d, 0);
            h12.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f23072c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        private l() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2450u1.h((C2406f1) eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f23073c = new m();

        /* JADX WARN: Illegal instructions before constructor call */
        private m() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.U((C2392b) eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f23074c = new n();

        /* JADX WARN: Illegal instructions before constructor call */
        private n() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.T(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f23075c = new o();

        private o() {
            super(1, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            Object objInvoke = ((InterfaceC5082a) eVar.a(t.a(0))).invoke();
            C2392b c2392b = (C2392b) eVar.a(t.a(1));
            int i10 = eVar.getInt(0);
            AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            h12.p1(c2392b, objInvoke);
            interfaceC2398d.e(i10, objInvoke);
            interfaceC2398d.h(objInvoke);
        }

        @Override // Z.d
        protected C2392b c(e eVar, H1 h12) {
            return (C2392b) eVar.a(t.a(1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final p f23076c = new p();

        private p() {
            super(0, 2, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            E1 e12 = (E1) eVar.a(t.a(1));
            C2392b c2392b = (C2392b) eVar.a(t.a(0));
            h12.F();
            h12.t0(e12, c2392b.d(e12), false);
            h12.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f23077c = new q();

        private q() {
            super(0, 3, 1, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            f fVarK;
            E1 e12 = (E1) eVar.a(t.a(1));
            C2392b c2392b = (C2392b) eVar.a(t.a(0));
            c cVar = (c) eVar.a(t.a(2));
            H1 h1G = e12.G();
            if (fVar != null) {
                try {
                    fVarK = h.k(fVar, h12);
                } catch (Throwable th2) {
                    h1G.J(false);
                    throw th2;
                }
            } else {
                fVarK = null;
            }
            cVar.d(interfaceC2398d, h1G, interfaceC2450u1, fVarK);
            L l10 = L.f17438a;
            h1G.J(true);
            h12.F();
            h12.t0(e12, c2392b.d(e12), false);
            h12.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f23078c = new r();

        private r() {
            super(1, 0, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.u0(eVar.getInt(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s f23079c = new s();

        private s() {
            super(3, 0, 2, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2398d.c(eVar.getInt(0), eVar.getInt(1), eVar.getInt(2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f23080c = new u();

        /* JADX WARN: Illegal instructions before constructor call */
        private u() {
            int i10 = 1;
            super(i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            C2392b c2392b = (C2392b) eVar.a(t.a(0));
            int i10 = eVar.getInt(0);
            interfaceC2398d.k();
            AbstractC5504s.f(interfaceC2398d, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            interfaceC2398d.g(i10, h12.z0(c2392b));
        }

        @Override // Z.d
        protected C2392b c(e eVar, H1 h12) {
            return (C2392b) eVar.a(t.a(0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f23081c = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        private v() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2450u1.c((C2456w1) eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f23082c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        private w() {
            int i10 = 1;
            super(0, i10, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2450u1.f((C2406f1) eVar.a(t.a(0)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f23083c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        private x() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            AbstractC2454w.O(h12, interfaceC2450u1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f23084c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        private y() {
            int i10 = 2;
            super(i10, 0, i10, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            interfaceC2398d.b(eVar.getInt(0), eVar.getInt(1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f23085c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        private z() {
            int i10 = 0;
            super(i10, i10, 3, null);
        }

        @Override // Z.d
        protected void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) {
            h12.M0();
        }
    }

    public /* synthetic */ d(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11);
    }

    protected abstract void a(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar);

    public final void b(e eVar, InterfaceC2398d interfaceC2398d, H1 h12, InterfaceC2450u1 interfaceC2450u1, f fVar) throws Throwable {
        C2392b c2392bC = c(eVar, h12);
        try {
            a(eVar, interfaceC2398d, h12, interfaceC2450u1, fVar);
        } catch (Throwable th2) {
            throw h.f(th2, fVar, h12, c2392bC);
        }
    }

    protected C2392b c(e eVar, H1 h12) {
        return null;
    }

    public final int d() {
        return this.f23049a;
    }

    public final String e() {
        String strV = O.b(getClass()).v();
        return strV == null ? "" : strV;
    }

    public final int f() {
        return this.f23050b;
    }

    public String toString() {
        return e();
    }

    private d(int i10, int i11) {
        this.f23049a = i10;
        this.f23050b = i11;
    }

    public /* synthetic */ d(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11, null);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t {
        public static int a(int i10) {
            return i10;
        }
    }
}
