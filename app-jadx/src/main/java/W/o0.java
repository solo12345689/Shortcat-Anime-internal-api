package w;

import Gf.AbstractC1617k;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2452v0;
import Y.AbstractC2454w;
import Y.B1;
import Y.InterfaceC2425m;
import Y.InterfaceC2464z0;
import Y.M1;
import Y.U1;
import Y.W0;
import Y.b2;
import Y.h2;
import ae.AbstractC2605b;
import i0.C4961E;
import ie.InterfaceC5082a;
import java.util.List;
import ke.AbstractC5466a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import w.AbstractC6893c0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a */
    private final q0 f62589a;

    /* JADX INFO: renamed from: b */
    private final o0 f62590b;

    /* JADX INFO: renamed from: c */
    private final String f62591c;

    /* JADX INFO: renamed from: d */
    private final Y.C0 f62592d;

    /* JADX INFO: renamed from: e */
    private final Y.C0 f62593e;

    /* JADX INFO: renamed from: f */
    private final Y.B0 f62594f;

    /* JADX INFO: renamed from: g */
    private final Y.B0 f62595g;

    /* JADX INFO: renamed from: h */
    private final Y.C0 f62596h;

    /* JADX INFO: renamed from: i */
    private final C4961E f62597i;

    /* JADX INFO: renamed from: j */
    private final C4961E f62598j;

    /* JADX INFO: renamed from: k */
    private final Y.C0 f62599k;

    /* JADX INFO: renamed from: l */
    private long f62600l;

    /* JADX INFO: renamed from: m */
    private final h2 f62601m;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class a {

        /* JADX INFO: renamed from: a */
        private final s0 f62602a;

        /* JADX INFO: renamed from: b */
        private final String f62603b;

        /* JADX INFO: renamed from: c */
        private final Y.C0 f62604c = b2.e(null, null, 2, null);

        /* JADX INFO: renamed from: w.o0$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public final class C0938a implements h2 {

            /* JADX INFO: renamed from: a */
            private final d f62606a;

            /* JADX INFO: renamed from: b */
            private Function1 f62607b;

            /* JADX INFO: renamed from: c */
            private Function1 f62608c;

            public C0938a(d dVar, Function1 function1, Function1 function12) {
                this.f62606a = dVar;
                this.f62607b = function1;
                this.f62608c = function12;
            }

            @Override // Y.h2
            public Object getValue() {
                r(o0.this.m());
                return this.f62606a.getValue();
            }

            public final d i() {
                return this.f62606a;
            }

            public final Function1 l() {
                return this.f62608c;
            }

            public final Function1 n() {
                return this.f62607b;
            }

            public final void p(Function1 function1) {
                this.f62608c = function1;
            }

            public final void q(Function1 function1) {
                this.f62607b = function1;
            }

            public final void r(b bVar) {
                Object objInvoke = this.f62608c.invoke(bVar.a());
                if (!o0.this.s()) {
                    this.f62606a.G(objInvoke, (InterfaceC6878G) this.f62607b.invoke(bVar));
                } else {
                    this.f62606a.F(this.f62608c.invoke(bVar.b()), objInvoke, (InterfaceC6878G) this.f62607b.invoke(bVar));
                }
            }
        }

        public a(s0 s0Var, String str) {
            this.f62602a = s0Var;
            this.f62603b = str;
        }

        public final h2 a(Function1 function1, Function1 function12) {
            C0938a c0938aB = b();
            if (c0938aB == null) {
                o0 o0Var = o0.this;
                c0938aB = new C0938a(o0Var.new d(function12.invoke(o0Var.h()), AbstractC6908l.i(this.f62602a, function12.invoke(o0.this.h())), this.f62602a, this.f62603b), function1, function12);
                o0 o0Var2 = o0.this;
                c(c0938aB);
                o0Var2.c(c0938aB.i());
            }
            o0 o0Var3 = o0.this;
            c0938aB.p(function12);
            c0938aB.q(function1);
            c0938aB.r(o0Var3.m());
            return c0938aB;
        }

        public final C0938a b() {
            return (C0938a) this.f62604c.getValue();
        }

        public final void c(C0938a c0938a) {
            this.f62604c.setValue(c0938a);
        }

        public final void d() {
            C0938a c0938aB = b();
            if (c0938aB != null) {
                o0 o0Var = o0.this;
                c0938aB.i().F(c0938aB.l().invoke(o0Var.m().b()), c0938aB.l().invoke(o0Var.m().a()), (InterfaceC6878G) c0938aB.n().invoke(o0Var.m()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        Object a();

        Object b();

        default boolean c(Object obj, Object obj2) {
            return AbstractC5504s.c(obj, b()) && AbstractC5504s.c(obj2, a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements b {

        /* JADX INFO: renamed from: a */
        private final Object f62610a;

        /* JADX INFO: renamed from: b */
        private final Object f62611b;

        public c(Object obj, Object obj2) {
            this.f62610a = obj;
            this.f62611b = obj2;
        }

        @Override // w.o0.b
        public Object a() {
            return this.f62611b;
        }

        @Override // w.o0.b
        public Object b() {
            return this.f62610a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC5504s.c(b(), bVar.b()) && AbstractC5504s.c(a(), bVar.a());
        }

        public int hashCode() {
            Object objB = b();
            int iHashCode = (objB != null ? objB.hashCode() : 0) * 31;
            Object objA = a();
            return iHashCode + (objA != null ? objA.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public final class d implements h2 {

        /* JADX INFO: renamed from: a */
        private final s0 f62612a;

        /* JADX INFO: renamed from: b */
        private final String f62613b;

        /* JADX INFO: renamed from: c */
        private final Y.C0 f62614c;

        /* JADX INFO: renamed from: d */
        private final C6903h0 f62615d;

        /* JADX INFO: renamed from: e */
        private final Y.C0 f62616e;

        /* JADX INFO: renamed from: f */
        private final Y.C0 f62617f;

        /* JADX INFO: renamed from: g */
        private n0 f62618g;

        /* JADX INFO: renamed from: h */
        private final Y.C0 f62619h;

        /* JADX INFO: renamed from: i */
        private final InterfaceC2464z0 f62620i;

        /* JADX INFO: renamed from: j */
        private boolean f62621j;

        /* JADX INFO: renamed from: k */
        private final Y.C0 f62622k;

        /* JADX INFO: renamed from: l */
        private AbstractC6913q f62623l;

        /* JADX INFO: renamed from: m */
        private final Y.B0 f62624m;

        /* JADX INFO: renamed from: n */
        private boolean f62625n;

        /* JADX INFO: renamed from: o */
        private final InterfaceC6878G f62626o;

        public d(Object obj, AbstractC6913q abstractC6913q, s0 s0Var, String str) {
            Object objInvoke;
            this.f62612a = s0Var;
            this.f62613b = str;
            this.f62614c = b2.e(obj, null, 2, null);
            C6903h0 c6903h0H = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
            this.f62615d = c6903h0H;
            this.f62616e = b2.e(c6903h0H, null, 2, null);
            this.f62617f = b2.e(new n0(l(), s0Var, obj, r(), abstractC6913q), null, 2, null);
            this.f62619h = b2.e(Boolean.TRUE, null, 2, null);
            this.f62620i = W0.a(-1.0f);
            this.f62622k = b2.e(obj, null, 2, null);
            this.f62623l = abstractC6913q;
            this.f62624m = M1.a(i().d());
            Float f10 = (Float) I0.h().get(s0Var);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                AbstractC6913q abstractC6913q2 = (AbstractC6913q) s0Var.a().invoke(obj);
                int iB = abstractC6913q2.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    abstractC6913q2.e(i10, fFloatValue);
                }
                objInvoke = this.f62612a.b().invoke(abstractC6913q2);
            } else {
                objInvoke = null;
            }
            this.f62626o = AbstractC6906j.h(0.0f, 0.0f, objInvoke, 3, null);
        }

        private final void B(Object obj) {
            this.f62614c.setValue(obj);
        }

        private final void D(Object obj, boolean z10) {
            n0 n0Var = this.f62618g;
            if (AbstractC5504s.c(n0Var != null ? n0Var.g() : null, r())) {
                w(new n0(this.f62626o, this.f62612a, obj, obj, r.g(this.f62623l)));
                this.f62621j = true;
                y(i().d());
                return;
            }
            InterfaceC6904i interfaceC6904iL = (!z10 || this.f62625n || (l() instanceof C6903h0)) ? l() : this.f62626o;
            if (o0.this.l() > 0) {
                interfaceC6904iL = AbstractC6906j.c(interfaceC6904iL, o0.this.l());
            }
            w(new n0(interfaceC6904iL, this.f62612a, obj, r(), this.f62623l));
            y(i().d());
            this.f62621j = false;
            o0.this.t();
        }

        static /* synthetic */ void E(d dVar, Object obj, boolean z10, int i10, Object obj2) {
            if ((i10 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            dVar.D(obj, z10);
        }

        private final Object r() {
            return this.f62614c.getValue();
        }

        private final void w(n0 n0Var) {
            this.f62617f.setValue(n0Var);
        }

        private final void x(InterfaceC6878G interfaceC6878G) {
            this.f62616e.setValue(interfaceC6878G);
        }

        public final void A(float f10) {
            this.f62620i.k(f10);
        }

        public void C(Object obj) {
            this.f62622k.setValue(obj);
        }

        public final void F(Object obj, Object obj2, InterfaceC6878G interfaceC6878G) {
            B(obj2);
            x(interfaceC6878G);
            if (AbstractC5504s.c(i().i(), obj) && AbstractC5504s.c(i().g(), obj2)) {
                return;
            }
            E(this, obj, false, 2, null);
        }

        public final void G(Object obj, InterfaceC6878G interfaceC6878G) {
            if (this.f62621j) {
                n0 n0Var = this.f62618g;
                if (AbstractC5504s.c(obj, n0Var != null ? n0Var.g() : null)) {
                    return;
                }
            }
            if (AbstractC5504s.c(r(), obj) && q() == -1.0f) {
                return;
            }
            B(obj);
            x(interfaceC6878G);
            D(q() == -3.0f ? obj : getValue(), !s());
            z(q() == -3.0f);
            if (q() >= 0.0f) {
                C(i().f((long) (i().d() * q())));
            } else if (q() == -3.0f) {
                C(obj);
            }
            this.f62621j = false;
            A(-1.0f);
        }

        @Override // Y.h2
        public Object getValue() {
            return this.f62622k.getValue();
        }

        public final n0 i() {
            return (n0) this.f62617f.getValue();
        }

        public final InterfaceC6878G l() {
            return (InterfaceC6878G) this.f62616e.getValue();
        }

        public final long n() {
            return this.f62624m.a();
        }

        public final AbstractC6893c0.a p() {
            return null;
        }

        public final float q() {
            return this.f62620i.c();
        }

        public final boolean s() {
            return ((Boolean) this.f62619h.getValue()).booleanValue();
        }

        public final void t(long j10, boolean z10) {
            if (z10) {
                j10 = i().d();
            }
            C(i().f(j10));
            this.f62623l = i().b(j10);
            if (i().c(j10)) {
                z(true);
            }
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + r() + ", spec: " + l();
        }

        public final void u() {
            A(-2.0f);
        }

        public final void v(long j10) {
            if (q() == -1.0f) {
                this.f62625n = true;
                if (AbstractC5504s.c(i().g(), i().i())) {
                    C(i().g());
                } else {
                    C(i().f(j10));
                    this.f62623l = i().b(j10);
                }
            }
        }

        public final void y(long j10) {
            this.f62624m.m(j10);
        }

        public final void z(boolean z10) {
            this.f62619h.setValue(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Gf.O f62628a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o0 f62629b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            float f62630a;

            /* JADX INFO: renamed from: b */
            int f62631b;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ Object f62632c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ o0 f62633d;

            /* JADX INFO: renamed from: w.o0$e$a$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0939a extends AbstractC5506u implements Function1 {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ o0 f62634a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ float f62635b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0939a(o0 o0Var, float f10) {
                    super(1);
                    this.f62634a = o0Var;
                    this.f62635b = f10;
                }

                public final void a(long j10) {
                    if (this.f62634a.s()) {
                        return;
                    }
                    this.f62634a.v(j10, this.f62635b);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).longValue());
                    return Td.L.f17438a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, Zd.e eVar) {
                super(2, eVar);
                this.f62633d = o0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f62633d, eVar);
                aVar.f62632c = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                float fN;
                Gf.O o10;
                Object objF = AbstractC2605b.f();
                int i10 = this.f62631b;
                if (i10 == 0) {
                    Td.v.b(obj);
                    Gf.O o11 = (Gf.O) this.f62632c;
                    fN = m0.n(o11.getCoroutineContext());
                    o10 = o11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fN = this.f62630a;
                    o10 = (Gf.O) this.f62632c;
                    Td.v.b(obj);
                }
                while (Gf.P.g(o10)) {
                    C0939a c0939a = new C0939a(this.f62633d, fN);
                    this.f62632c = o10;
                    this.f62630a = fN;
                    this.f62631b = 1;
                    if (AbstractC2452v0.c(c0939a, this) == objF) {
                        return objF;
                    }
                }
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Gf.O o10, o0 o0Var) {
            super(1);
            this.f62628a = o10;
            this.f62629b = o0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            AbstractC1617k.d(this.f62628a, null, Gf.Q.f7532d, new a(this.f62629b, null), 1, null);
            return new b();
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements Y.X {
            @Override // Y.X
            public void dispose() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f62637b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f62638c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Object obj, int i10) {
            super(2);
            this.f62637b = obj;
            this.f62638c = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            o0.this.e(this.f62637b, interfaceC2425m, AbstractC2409g1.a(this.f62638c | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements InterfaceC5082a {
        g() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Long invoke() {
            return Long.valueOf(o0.this.f());
        }
    }

    public o0(q0 q0Var, o0 o0Var, String str) {
        this.f62589a = q0Var;
        this.f62590b = o0Var;
        this.f62591c = str;
        this.f62592d = b2.e(h(), null, 2, null);
        this.f62593e = b2.e(new c(h(), h()), null, 2, null);
        this.f62594f = M1.a(0L);
        this.f62595g = M1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.f62596h = b2.e(bool, null, 2, null);
        this.f62597i = U1.e();
        this.f62598j = U1.e();
        this.f62599k = b2.e(bool, null, 2, null);
        this.f62601m = U1.d(new g());
        q0Var.e(this);
    }

    private final void C() {
        C4961E c4961e = this.f62597i;
        int size = c4961e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) c4961e.get(i10)).u();
        }
        C4961E c4961e2 = this.f62598j;
        int size2 = c4961e2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((o0) c4961e2.get(i11)).C();
        }
    }

    private final void G(b bVar) {
        this.f62593e.setValue(bVar);
    }

    private final void J(boolean z10) {
        this.f62596h.setValue(Boolean.valueOf(z10));
    }

    private final void K(long j10) {
        this.f62594f.m(j10);
    }

    public final long f() {
        C4961E c4961e = this.f62597i;
        int size = c4961e.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, ((d) c4961e.get(i10)).n());
        }
        C4961E c4961e2 = this.f62598j;
        int size2 = c4961e2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            jMax = Math.max(jMax, ((o0) c4961e2.get(i11)).f());
        }
        return jMax;
    }

    private final boolean p() {
        return ((Boolean) this.f62596h.getValue()).booleanValue();
    }

    private final long q() {
        return this.f62594f.a();
    }

    public final void t() {
        J(true);
        if (s()) {
            C4961E c4961e = this.f62597i;
            int size = c4961e.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) c4961e.get(i10);
                jMax = Math.max(jMax, dVar.n());
                dVar.v(this.f62600l);
            }
            J(false);
        }
    }

    public final void A(d dVar) {
        this.f62597i.remove(dVar);
    }

    public final boolean B(o0 o0Var) {
        return this.f62598j.remove(o0Var);
    }

    public final void D(Object obj, Object obj2, long j10) {
        H(Long.MIN_VALUE);
        this.f62589a.d(false);
        if (!s() || !AbstractC5504s.c(h(), obj) || !AbstractC5504s.c(o(), obj2)) {
            if (!AbstractC5504s.c(h(), obj)) {
                q0 q0Var = this.f62589a;
                if (q0Var instanceof V) {
                    q0Var.c(obj);
                }
            }
            I(obj2);
            F(true);
            G(new c(obj, obj2));
        }
        C4961E c4961e = this.f62598j;
        int size = c4961e.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) c4961e.get(i10);
            AbstractC5504s.f(o0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (o0Var.s()) {
                o0Var.D(o0Var.h(), o0Var.o(), j10);
            }
        }
        C4961E c4961e2 = this.f62597i;
        int size2 = c4961e2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((d) c4961e2.get(i11)).v(j10);
        }
        this.f62600l = j10;
    }

    public final void E(long j10) {
        if (this.f62590b == null) {
            K(j10);
        }
    }

    public final void F(boolean z10) {
        this.f62599k.setValue(Boolean.valueOf(z10));
    }

    public final void H(long j10) {
        this.f62595g.m(j10);
    }

    public final void I(Object obj) {
        this.f62592d.setValue(obj);
    }

    public final void L(Object obj) {
        if (AbstractC5504s.c(o(), obj)) {
            return;
        }
        G(new c(o(), obj));
        if (!AbstractC5504s.c(h(), o())) {
            this.f62589a.c(o());
        }
        I(obj);
        if (!r()) {
            J(true);
        }
        C();
    }

    public final boolean c(d dVar) {
        return this.f62597i.add(dVar);
    }

    public final boolean d(o0 o0Var) {
        return this.f62598j.add(o0Var);
    }

    public final void e(Object obj, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-1493585151);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? interfaceC2425mG.U(obj) : interfaceC2425mG.F(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.U(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-1493585151, i11, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (s()) {
                interfaceC2425mG.V(1823992347);
                interfaceC2425mG.O();
            } else {
                interfaceC2425mG.V(1822507602);
                L(obj);
                if (!AbstractC5504s.c(obj, h()) || r() || p()) {
                    interfaceC2425mG.V(1822738893);
                    Object objD = interfaceC2425mG.D();
                    InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
                    if (objD == aVar.a()) {
                        Y.L l10 = new Y.L(AbstractC2393b0.i(Zd.j.f23275a, interfaceC2425mG));
                        interfaceC2425mG.u(l10);
                        objD = l10;
                    }
                    Gf.O oA = ((Y.L) objD).a();
                    int i12 = i11 & 112;
                    boolean zF = (i12 == 32) | interfaceC2425mG.F(oA);
                    Object objD2 = interfaceC2425mG.D();
                    if (zF || objD2 == aVar.a()) {
                        objD2 = new e(oA, this);
                        interfaceC2425mG.u(objD2);
                    }
                    AbstractC2393b0.a(oA, this, (Function1) objD2, interfaceC2425mG, i12);
                    interfaceC2425mG.O();
                } else {
                    interfaceC2425mG.V(1823982427);
                    interfaceC2425mG.O();
                }
                interfaceC2425mG.O();
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new f(obj, i10));
        }
    }

    public final List g() {
        return this.f62597i;
    }

    public final Object h() {
        return this.f62589a.a();
    }

    public final boolean i() {
        C4961E c4961e = this.f62597i;
        int size = c4961e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) c4961e.get(i10)).p();
        }
        C4961E c4961e2 = this.f62598j;
        int size2 = c4961e2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            if (((o0) c4961e2.get(i11)).i()) {
                return true;
            }
        }
        return false;
    }

    public final String j() {
        return this.f62591c;
    }

    public final long k() {
        return this.f62600l;
    }

    public final long l() {
        o0 o0Var = this.f62590b;
        return o0Var != null ? o0Var.l() : q();
    }

    public final b m() {
        return (b) this.f62593e.getValue();
    }

    public final long n() {
        return this.f62595g.a();
    }

    public final Object o() {
        return this.f62592d.getValue();
    }

    public final boolean r() {
        return n() != Long.MIN_VALUE;
    }

    public final boolean s() {
        return ((Boolean) this.f62599k.getValue()).booleanValue();
    }

    public String toString() {
        List listG = g();
        int size = listG.size();
        String str = "Transition animation values: ";
        for (int i10 = 0; i10 < size; i10++) {
            str = str + ((d) listG.get(i10)) + ", ";
        }
        return str;
    }

    public final void u() {
        x();
        this.f62589a.f();
    }

    public final void v(long j10, float f10) {
        if (n() == Long.MIN_VALUE) {
            y(j10);
        }
        long jN = j10 - n();
        if (f10 != 0.0f) {
            jN = AbstractC5466a.e(jN / ((double) f10));
        }
        E(jN);
        w(jN, f10 == 0.0f);
    }

    public final void w(long j10, boolean z10) {
        boolean z11 = true;
        if (n() == Long.MIN_VALUE) {
            y(j10);
        } else if (!this.f62589a.b()) {
            this.f62589a.d(true);
        }
        J(false);
        C4961E c4961e = this.f62597i;
        int size = c4961e.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) c4961e.get(i10);
            if (!dVar.s()) {
                dVar.t(j10, z10);
            }
            if (!dVar.s()) {
                z11 = false;
            }
        }
        C4961E c4961e2 = this.f62598j;
        int size2 = c4961e2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            o0 o0Var = (o0) c4961e2.get(i11);
            if (!AbstractC5504s.c(o0Var.o(), o0Var.h())) {
                o0Var.w(j10, z10);
            }
            if (!AbstractC5504s.c(o0Var.o(), o0Var.h())) {
                z11 = false;
            }
        }
        if (z11) {
            x();
        }
    }

    public final void x() {
        H(Long.MIN_VALUE);
        q0 q0Var = this.f62589a;
        if (q0Var instanceof V) {
            q0Var.c(o());
        }
        E(0L);
        this.f62589a.d(false);
        C4961E c4961e = this.f62598j;
        int size = c4961e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o0) c4961e.get(i10)).x();
        }
    }

    public final void y(long j10) {
        H(j10);
        this.f62589a.d(true);
    }

    public final void z(a aVar) {
        d dVarI;
        a.C0938a c0938aB = aVar.b();
        if (c0938aB == null || (dVarI = c0938aB.i()) == null) {
            return;
        }
        A(dVarI);
    }

    public o0(Object obj, String str) {
        this(new V(obj), null, str);
    }
}
