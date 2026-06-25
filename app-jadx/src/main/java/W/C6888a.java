package w;

import Y.b2;
import Y.h2;
import ae.AbstractC2605b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: w.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6888a {

    /* JADX INFO: renamed from: a */
    private final s0 f62444a;

    /* JADX INFO: renamed from: b */
    private final Object f62445b;

    /* JADX INFO: renamed from: c */
    private final String f62446c;

    /* JADX INFO: renamed from: d */
    private final C6907k f62447d;

    /* JADX INFO: renamed from: e */
    private final Y.C0 f62448e;

    /* JADX INFO: renamed from: f */
    private final Y.C0 f62449f;

    /* JADX INFO: renamed from: g */
    private final Z f62450g;

    /* JADX INFO: renamed from: h */
    private final C6903h0 f62451h;

    /* JADX INFO: renamed from: i */
    private final AbstractC6913q f62452i;

    /* JADX INFO: renamed from: j */
    private final AbstractC6913q f62453j;

    /* JADX INFO: renamed from: k */
    private AbstractC6913q f62454k;

    /* JADX INFO: renamed from: l */
    private AbstractC6913q f62455l;

    /* JADX INFO: renamed from: w.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0936a extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: a */
        Object f62456a;

        /* JADX INFO: renamed from: b */
        Object f62457b;

        /* JADX INFO: renamed from: c */
        int f62458c;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Object f62460e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC6894d f62461f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ long f62462g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Function1 f62463h;

        /* JADX INFO: renamed from: w.a$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0937a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C6888a f62464a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6907k f62465b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Function1 f62466c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ kotlin.jvm.internal.J f62467d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0937a(C6888a c6888a, C6907k c6907k, Function1 function1, kotlin.jvm.internal.J j10) {
                super(1);
                this.f62464a = c6888a;
                this.f62465b = c6907k;
                this.f62466c = function1;
                this.f62467d = j10;
            }

            public final void a(C6902h c6902h) {
                m0.o(c6902h, this.f62464a.j());
                Object objH = this.f62464a.h(c6902h.e());
                if (AbstractC5504s.c(objH, c6902h.e())) {
                    Function1 function1 = this.f62466c;
                    if (function1 != null) {
                        function1.invoke(this.f62464a);
                        return;
                    }
                    return;
                }
                this.f62464a.j().v(objH);
                this.f62465b.v(objH);
                Function1 function12 = this.f62466c;
                if (function12 != null) {
                    function12.invoke(this.f62464a);
                }
                c6902h.a();
                this.f62467d.f52255a = true;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C6902h) obj);
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0936a(Object obj, InterfaceC6894d interfaceC6894d, long j10, Function1 function1, Zd.e eVar) {
            super(1, eVar);
            this.f62460e = obj;
            this.f62461f = interfaceC6894d;
            this.f62462g = j10;
            this.f62463h = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(Zd.e eVar) {
            return ((C0936a) create(eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Zd.e eVar) {
            return C6888a.this.new C0936a(this.f62460e, this.f62461f, this.f62462g, this.f62463h, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C6907k c6907k;
            kotlin.jvm.internal.J j10;
            Object objF = AbstractC2605b.f();
            int i10 = this.f62458c;
            try {
                if (i10 == 0) {
                    Td.v.b(obj);
                    C6888a.this.j().w((AbstractC6913q) C6888a.this.l().a().invoke(this.f62460e));
                    C6888a.this.r(this.f62461f.g());
                    C6888a.this.q(true);
                    C6907k c6907kH = AbstractC6908l.h(C6888a.this.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    kotlin.jvm.internal.J j11 = new kotlin.jvm.internal.J();
                    InterfaceC6894d interfaceC6894d = this.f62461f;
                    long j12 = this.f62462g;
                    C0937a c0937a = new C0937a(C6888a.this, c6907kH, this.f62463h, j11);
                    this.f62456a = c6907kH;
                    this.f62457b = j11;
                    this.f62458c = 1;
                    if (m0.c(c6907kH, interfaceC6894d, j12, c0937a, this) == objF) {
                        return objF;
                    }
                    c6907k = c6907kH;
                    j10 = j11;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = (kotlin.jvm.internal.J) this.f62457b;
                    c6907k = (C6907k) this.f62456a;
                    Td.v.b(obj);
                }
                EnumC6896e enumC6896e = j10.f52255a ? EnumC6896e.BoundReached : EnumC6896e.Finished;
                C6888a.this.i();
                return new C6900g(c6907k, enumC6896e);
            } catch (CancellationException e10) {
                C6888a.this.i();
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: w.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: a */
        int f62468a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f62470c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, Zd.e eVar) {
            super(1, eVar);
            this.f62470c = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(Zd.e eVar) {
            return ((b) create(eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Zd.e eVar) {
            return C6888a.this.new b(this.f62470c, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f62468a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            C6888a.this.i();
            Object objH = C6888a.this.h(this.f62470c);
            C6888a.this.j().v(objH);
            C6888a.this.r(objH);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: w.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function1 {

        /* JADX INFO: renamed from: a */
        int f62471a;

        c(Zd.e eVar) {
            super(1, eVar);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Object invoke(Zd.e eVar) {
            return ((c) create(eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Zd.e eVar) {
            return C6888a.this.new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f62471a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            C6888a.this.i();
            return Td.L.f17438a;
        }
    }

    public C6888a(Object obj, s0 s0Var, Object obj2, String str) {
        this.f62444a = s0Var;
        this.f62445b = obj2;
        this.f62446c = str;
        this.f62447d = new C6907k(s0Var, obj, null, 0L, 0L, false, 60, null);
        this.f62448e = b2.e(Boolean.FALSE, null, 2, null);
        this.f62449f = b2.e(obj, null, 2, null);
        this.f62450g = new Z();
        this.f62451h = new C6903h0(0.0f, 0.0f, obj2, 3, null);
        AbstractC6913q abstractC6913qO = o();
        AbstractC6913q abstractC6913q = abstractC6913qO instanceof C6909m ? AbstractC6890b.f62477e : abstractC6913qO instanceof C6910n ? AbstractC6890b.f62478f : abstractC6913qO instanceof C6911o ? AbstractC6890b.f62479g : AbstractC6890b.f62480h;
        AbstractC5504s.f(abstractC6913q, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f62452i = abstractC6913q;
        AbstractC6913q abstractC6913qO2 = o();
        AbstractC6913q abstractC6913q2 = abstractC6913qO2 instanceof C6909m ? AbstractC6890b.f62473a : abstractC6913qO2 instanceof C6910n ? AbstractC6890b.f62474b : abstractC6913qO2 instanceof C6911o ? AbstractC6890b.f62475c : AbstractC6890b.f62476d;
        AbstractC5504s.f(abstractC6913q2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.f62453j = abstractC6913q2;
        this.f62454k = abstractC6913q;
        this.f62455l = abstractC6913q2;
    }

    public static /* synthetic */ Object f(C6888a c6888a, Object obj, InterfaceC6904i interfaceC6904i, Object obj2, Function1 function1, Zd.e eVar, int i10, Object obj3) {
        if ((i10 & 2) != 0) {
            interfaceC6904i = c6888a.f62451h;
        }
        InterfaceC6904i interfaceC6904i2 = interfaceC6904i;
        if ((i10 & 4) != 0) {
            obj2 = c6888a.n();
        }
        Object obj4 = obj2;
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return c6888a.e(obj, interfaceC6904i2, obj4, function1, eVar);
    }

    public final Object h(Object obj) {
        if (AbstractC5504s.c(this.f62454k, this.f62452i) && AbstractC5504s.c(this.f62455l, this.f62453j)) {
            return obj;
        }
        AbstractC6913q abstractC6913q = (AbstractC6913q) this.f62444a.a().invoke(obj);
        int iB = abstractC6913q.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < iB; i10++) {
            if (abstractC6913q.a(i10) < this.f62454k.a(i10) || abstractC6913q.a(i10) > this.f62455l.a(i10)) {
                abstractC6913q.e(i10, AbstractC5874j.l(abstractC6913q.a(i10), this.f62454k.a(i10), this.f62455l.a(i10)));
                z10 = true;
            }
        }
        return z10 ? this.f62444a.b().invoke(abstractC6913q) : obj;
    }

    public final void i() {
        C6907k c6907k = this.f62447d;
        c6907k.q().d();
        c6907k.t(Long.MIN_VALUE);
        q(false);
    }

    private final Object p(InterfaceC6894d interfaceC6894d, Object obj, Function1 function1, Zd.e eVar) {
        return Z.e(this.f62450g, null, new C0936a(obj, interfaceC6894d, this.f62447d.l(), function1, null), eVar, 1, null);
    }

    public final void q(boolean z10) {
        this.f62448e.setValue(Boolean.valueOf(z10));
    }

    public final void r(Object obj) {
        this.f62449f.setValue(obj);
    }

    public final Object e(Object obj, InterfaceC6904i interfaceC6904i, Object obj2, Function1 function1, Zd.e eVar) {
        return p(AbstractC6898f.a(interfaceC6904i, this.f62444a, m(), obj, obj2), obj2, function1, eVar);
    }

    public final h2 g() {
        return this.f62447d;
    }

    public final C6907k j() {
        return this.f62447d;
    }

    public final Object k() {
        return this.f62449f.getValue();
    }

    public final s0 l() {
        return this.f62444a;
    }

    public final Object m() {
        return this.f62447d.getValue();
    }

    public final Object n() {
        return this.f62444a.b().invoke(o());
    }

    public final AbstractC6913q o() {
        return this.f62447d.q();
    }

    public final Object s(Object obj, Zd.e eVar) {
        Object objE = Z.e(this.f62450g, null, new b(obj, null), eVar, 1, null);
        return objE == AbstractC2605b.f() ? objE : Td.L.f17438a;
    }

    public final Object t(Zd.e eVar) {
        Object objE = Z.e(this.f62450g, null, new c(null), eVar, 1, null);
        return objE == AbstractC2605b.f() ? objE : Td.L.f17438a;
    }

    public /* synthetic */ C6888a(Object obj, s0 s0Var, Object obj2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, s0Var, (i10 & 4) != 0 ? null : obj2, (i10 & 8) != 0 ? "Animatable" : str);
    }
}
