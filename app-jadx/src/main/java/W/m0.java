package w;

import Y.AbstractC2452v0;
import ae.AbstractC2605b;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.C5498l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function2 f62547a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ s0 f62548b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, s0 s0Var) {
            super(1);
            this.f62547a = function2;
            this.f62548b = s0Var;
        }

        public final void a(C6902h c6902h) {
            this.f62547a.invoke(c6902h.e(), this.f62548b.b().invoke(c6902h.g()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6902h) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f62549a;

        /* JADX INFO: renamed from: b */
        Object f62550b;

        /* JADX INFO: renamed from: c */
        Object f62551c;

        /* JADX INFO: renamed from: d */
        Object f62552d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f62553e;

        /* JADX INFO: renamed from: f */
        int f62554f;

        b(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62553e = obj;
            this.f62554f |= Integer.MIN_VALUE;
            return m0.c(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.N f62556a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object f62557b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6894d f62558c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC6913q f62559d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C6907k f62560e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ float f62561f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Function1 f62562g;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C6907k f62563a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6907k c6907k) {
                super(0);
                this.f62563a = c6907k;
            }

            /* JADX INFO: renamed from: invoke */
            public final void m973invoke() {
                this.f62563a.u(false);
            }

            @Override // ie.InterfaceC5082a
            public /* bridge */ /* synthetic */ Object invoke() {
                m973invoke();
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.N n10, Object obj, InterfaceC6894d interfaceC6894d, AbstractC6913q abstractC6913q, C6907k c6907k, float f10, Function1 function1) {
            super(1);
            this.f62556a = n10;
            this.f62557b = obj;
            this.f62558c = interfaceC6894d;
            this.f62559d = abstractC6913q;
            this.f62560e = c6907k;
            this.f62561f = f10;
            this.f62562g = function1;
        }

        public final void a(long j10) {
            kotlin.jvm.internal.N n10 = this.f62556a;
            C6902h c6902h = new C6902h(this.f62557b, this.f62558c.e(), this.f62559d, j10, this.f62558c.g(), j10, true, new a(this.f62560e));
            m0.m(c6902h, j10, this.f62561f, this.f62558c, this.f62560e, this.f62562g);
            n10.f52259a = c6902h;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6907k f62564a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C6907k c6907k) {
            super(0);
            this.f62564a = c6907k;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m974invoke() {
            this.f62564a.u(false);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m974invoke();
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ kotlin.jvm.internal.N f62565a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ float f62566b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6894d f62567c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6907k f62568d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Function1 f62569e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(kotlin.jvm.internal.N n10, float f10, InterfaceC6894d interfaceC6894d, C6907k c6907k, Function1 function1) {
            super(1);
            this.f62565a = n10;
            this.f62566b = f10;
            this.f62567c = interfaceC6894d;
            this.f62568d = c6907k;
            this.f62569e = function1;
        }

        public final void a(long j10) {
            Object obj = this.f62565a.f52259a;
            AbstractC5504s.e(obj);
            m0.m((C6902h) obj, j10, this.f62566b, this.f62567c, this.f62568d, this.f62569e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f62572a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Function1 function1) {
            super(1);
            this.f62572a = function1;
        }

        public final Object a(long j10) {
            return this.f62572a.invoke(Long.valueOf(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, InterfaceC6904i interfaceC6904i, Function2 function2, Zd.e eVar) {
        Object objD = d(u0.f(C5498l.f52289a), kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), kotlin.coroutines.jvm.internal.b.c(f12), interfaceC6904i, function2, eVar);
        return objD == AbstractC2605b.f() ? objD : Td.L.f17438a;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(w.C6907k r23, w.InterfaceC6894d r24, long r25, kotlin.jvm.functions.Function1 r27, Zd.e r28) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.m0.c(w.k, w.d, long, kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    public static final Object d(s0 s0Var, Object obj, Object obj2, Object obj3, InterfaceC6904i interfaceC6904i, Function2 function2, Zd.e eVar) {
        AbstractC6913q abstractC6913qG;
        if (obj3 == null || (abstractC6913qG = (AbstractC6913q) s0Var.a().invoke(obj3)) == null) {
            abstractC6913qG = r.g((AbstractC6913q) s0Var.a().invoke(obj));
        }
        AbstractC6913q abstractC6913q = abstractC6913qG;
        Object objF = f(new C6907k(s0Var, obj, abstractC6913q, 0L, 0L, false, 56, null), new n0(interfaceC6904i, s0Var, obj, obj2, abstractC6913q), 0L, new a(function2, s0Var), eVar, 2, null);
        return objF == AbstractC2605b.f() ? objF : Td.L.f17438a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, InterfaceC6904i interfaceC6904i, Function2 function2, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            interfaceC6904i = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f12, interfaceC6904i, function2, eVar);
    }

    public static /* synthetic */ Object f(C6907k c6907k, InterfaceC6894d interfaceC6894d, long j10, Function1 function1, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = c.f62555a;
        }
        return c(c6907k, interfaceC6894d, j11, function1, eVar);
    }

    public static final Object g(C6907k c6907k, InterfaceC6921z interfaceC6921z, boolean z10, Function1 function1, Zd.e eVar) {
        Object objC = c(c6907k, new C6920y(interfaceC6921z, c6907k.n(), c6907k.getValue(), c6907k.q()), z10 ? c6907k.l() : Long.MIN_VALUE, function1, eVar);
        return objC == AbstractC2605b.f() ? objC : Td.L.f17438a;
    }

    public static /* synthetic */ Object h(C6907k c6907k, InterfaceC6921z interfaceC6921z, boolean z10, Function1 function1, Zd.e eVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = g.f62570a;
        }
        return g(c6907k, interfaceC6921z, z10, function1, eVar);
    }

    public static final Object i(C6907k c6907k, Object obj, InterfaceC6904i interfaceC6904i, boolean z10, Function1 function1, Zd.e eVar) {
        Object objC = c(c6907k, new n0(interfaceC6904i, c6907k.n(), c6907k.getValue(), obj, c6907k.q()), z10 ? c6907k.l() : Long.MIN_VALUE, function1, eVar);
        return objC == AbstractC2605b.f() ? objC : Td.L.f17438a;
    }

    public static /* synthetic */ Object j(C6907k c6907k, Object obj, InterfaceC6904i interfaceC6904i, boolean z10, Function1 function1, Zd.e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC6904i = AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC6904i interfaceC6904i2 = interfaceC6904i;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function1 = h.f62571a;
        }
        return i(c6907k, obj, interfaceC6904i2, z11, function1, eVar);
    }

    private static final Object k(InterfaceC6894d interfaceC6894d, Function1 function1, Zd.e eVar) {
        return interfaceC6894d.a() ? AbstractC6883L.a(function1, eVar) : AbstractC2452v0.c(new i(function1), eVar);
    }

    private static final void l(C6902h c6902h, long j10, long j11, InterfaceC6894d interfaceC6894d, C6907k c6907k, Function1 function1) {
        c6902h.j(j10);
        c6902h.l(interfaceC6894d.f(j11));
        c6902h.m(interfaceC6894d.b(j11));
        if (interfaceC6894d.c(j11)) {
            c6902h.i(c6902h.c());
            c6902h.k(false);
        }
        o(c6902h, c6907k);
        function1.invoke(c6902h);
    }

    public static final void m(C6902h c6902h, long j10, float f10, InterfaceC6894d interfaceC6894d, C6907k c6907k, Function1 function1) {
        l(c6902h, j10, f10 == 0.0f ? interfaceC6894d.d() : (long) ((j10 - c6902h.d()) / f10), interfaceC6894d, c6907k, function1);
    }

    public static final float n(Zd.i iVar) {
        l0.k kVar = (l0.k) iVar.l(l0.k.f52346h0);
        float fE = kVar != null ? kVar.E() : 1.0f;
        if (!(fE >= 0.0f)) {
            AbstractC6889a0.b("negative scale factor");
        }
        return fE;
    }

    public static final void o(C6902h c6902h, C6907k c6907k) {
        c6907k.v(c6902h.e());
        r.f(c6907k.q(), c6902h.g());
        c6907k.s(c6902h.b());
        c6907k.t(c6902h.c());
        c6907k.u(c6902h.h());
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final c f62555a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6902h) obj);
            return Td.L.f17438a;
        }

        public final void a(C6902h c6902h) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final g f62570a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6902h) obj);
            return Td.L.f17438a;
        }

        public final void a(C6902h c6902h) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final h f62571a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6902h) obj);
            return Td.L.f17438a;
        }

        public final void a(C6902h c6902h) {
        }
    }
}
