package androidx.compose.foundation.gestures;

import B.m;
import C0.a;
import E0.AbstractC1310u;
import E0.C;
import E0.C1307q;
import E0.EnumC1308s;
import Gf.AbstractC1617k;
import Gf.O;
import I0.InterfaceC1690p;
import K0.A0;
import K0.AbstractC1792i;
import K0.AbstractC1796k;
import K0.AbstractC1797k0;
import K0.B0;
import K0.InterfaceC1790h;
import K0.InterfaceC1795j0;
import R0.A;
import Td.L;
import ae.AbstractC2605b;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.focus.i;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.C5025r;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6065k;
import r0.AbstractC6225g;
import r0.C6224f;
import v.y;
import x.C6984D;
import x.EnumC6992L;
import x.InterfaceC6999T;
import z.AbstractC7260b;
import z.C7264f;
import z.C7266h;
import z.InterfaceC7262d;
import z.n;
import z.p;
import z.q;
import z.t;
import z.v;
import z.x;
import z.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class f extends androidx.compose.foundation.gestures.b implements InterfaceC1795j0, InterfaceC1790h, InterfaceC6065k, C0.e, A0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InterfaceC6999T f25999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n f26000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f26001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final D0.b f26002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final v f26003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C7266h f26004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final z f26005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final androidx.compose.foundation.gestures.e f26006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C7264f f26007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private t f26008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Function2 f26009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Function2 f26010w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC1690p) obj);
            return L.f17438a;
        }

        public final void invoke(InterfaceC1690p interfaceC1690p) {
            f.this.f26007t.Y1(interfaceC1690p);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f26014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f26015d;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f26016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f26017b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, z zVar) {
                super(1);
                this.f26016a = pVar;
                this.f26017b = zVar;
            }

            public final void a(a.b bVar) {
                this.f26016a.a(this.f26017b.x(bVar.a()), D0.e.f3532a.b());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function2 function2, z zVar, Zd.e eVar) {
            super(2, eVar);
            this.f26014c = function2;
            this.f26015d = zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, Zd.e eVar) {
            return ((b) create(pVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f26014c, this.f26015d, eVar);
            bVar.f26013b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26012a;
            if (i10 == 0) {
                Td.v.b(obj);
                p pVar = (p) this.f26013b;
                Function2 function2 = this.f26014c;
                a aVar = new a(pVar, this.f26015d);
                this.f26012a = 1;
                if (function2.invoke(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26018a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f26020c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f26020c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return f.this.new c(this.f26020c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26018a;
            if (i10 == 0) {
                Td.v.b(obj);
                z zVar = f.this.f26005r;
                long j10 = this.f26020c;
                this.f26018a = 1;
                if (zVar.q(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26021a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f26023c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26024a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f26025b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f26026c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, Zd.e eVar) {
                super(2, eVar);
                this.f26026c = j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p pVar, Zd.e eVar) {
                return ((a) create(pVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f26026c, eVar);
                aVar.f26025b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f26024a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                ((p) this.f26025b).b(this.f26026c, D0.e.f3532a.b());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f26023c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return f.this.new d(this.f26023c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26021a;
            if (i10 == 0) {
                Td.v.b(obj);
                z zVar = f.this.f26005r;
                EnumC6992L enumC6992L = EnumC6992L.UserInput;
                a aVar = new a(this.f26023c, null);
                this.f26021a = 1;
                if (zVar.v(enumC6992L, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26027a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f26029c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f26031b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f26032c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, Zd.e eVar) {
                super(2, eVar);
                this.f26032c = j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p pVar, Zd.e eVar) {
                return ((a) create(pVar, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f26032c, eVar);
                aVar.f26031b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f26030a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                ((p) this.f26031b).b(this.f26032c, D0.e.f3532a.b());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f26029c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return f.this.new e(this.f26029c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((e) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26027a;
            if (i10 == 0) {
                Td.v.b(obj);
                z zVar = f.this.f26005r;
                EnumC6992L enumC6992L = EnumC6992L.UserInput;
                a aVar = new a(this.f26029c, null);
                this.f26027a = 1;
                if (zVar.v(enumC6992L, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0451f extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26034a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f26035b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f26036c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f26037d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, float f10, float f11, Zd.e eVar) {
                super(2, eVar);
                this.f26035b = fVar;
                this.f26036c = f10;
                this.f26037d = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f26035b, this.f26036c, this.f26037d, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f26034a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    z zVar = this.f26035b.f26005r;
                    long jA = AbstractC6225g.a(this.f26036c, this.f26037d);
                    this.f26034a = 1;
                    if (androidx.compose.foundation.gestures.d.j(zVar, jA, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return L.f17438a;
            }
        }

        C0451f() {
            super(2);
        }

        public final Boolean a(float f10, float f11) {
            AbstractC1617k.d(f.this.getCoroutineScope(), null, null, new a(f.this, f10, f11, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ long f26039b;

        g(Zd.e eVar) {
            super(2, eVar);
        }

        public final Object a(long j10, Zd.e eVar) {
            return ((g) create(C6224f.d(j10), eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            g gVar = f.this.new g(eVar);
            gVar.f26039b = ((C6224f) obj).u();
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((C6224f) obj).u(), (Zd.e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f26038a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            long j10 = this.f26039b;
            z zVar = f.this.f26005r;
            this.f26038a = 1;
            Object objJ = androidx.compose.foundation.gestures.d.j(zVar, j10, this);
            return objJ == objF ? objF : objJ;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5082a {
        h() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m66invoke();
            return L.f17438a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m66invoke() {
            f.this.f26004q.f(y.c((InterfaceC5011d) AbstractC1792i.a(f.this, AbstractC2739w0.e())));
        }
    }

    public f(x xVar, InterfaceC6999T interfaceC6999T, n nVar, q qVar, boolean z10, boolean z11, m mVar, InterfaceC7262d interfaceC7262d) {
        super(androidx.compose.foundation.gestures.d.f25976a, z10, mVar, qVar);
        this.f25999l = interfaceC6999T;
        this.f26000m = nVar;
        D0.b bVar = new D0.b();
        this.f26002o = bVar;
        this.f26003p = (v) E1(new v(z10));
        C7266h c7266h = new C7266h(y.c(androidx.compose.foundation.gestures.d.f25979d), null, 2, null);
        this.f26004q = c7266h;
        InterfaceC6999T interfaceC6999T2 = this.f25999l;
        n nVar2 = this.f26000m;
        z zVar = new z(xVar, interfaceC6999T2, nVar2 == null ? c7266h : nVar2, qVar, z11, bVar);
        this.f26005r = zVar;
        androidx.compose.foundation.gestures.e eVar = new androidx.compose.foundation.gestures.e(zVar, z10);
        this.f26006s = eVar;
        C7264f c7264f = (C7264f) E1(new C7264f(qVar, zVar, z11, interfaceC7262d));
        this.f26007t = c7264f;
        E1(D0.d.c(eVar, bVar));
        E1(androidx.compose.ui.focus.p.a());
        E1(new androidx.compose.foundation.relocation.f(c7264f));
        E1(new C6984D(new a()));
    }

    private final void i2() {
        this.f26009v = null;
        this.f26010w = null;
    }

    private final void j2(C1307q c1307q, long j10) {
        List listC = c1307q.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C) listC.get(i10)).p()) {
                return;
            }
        }
        t tVar = this.f26008u;
        AbstractC5504s.e(tVar);
        AbstractC1617k.d(getCoroutineScope(), null, null, new e(tVar.a(AbstractC1796k.j(this), c1307q, j10), null), 3, null);
        List listC2 = c1307q.c();
        int size2 = listC2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((C) listC2.get(i11)).a();
        }
    }

    private final void k2() {
        this.f26009v = new C0451f();
        this.f26010w = new g(null);
    }

    private final void m2() {
        AbstractC1797k0.a(this, new h());
    }

    @Override // C0.e
    public boolean E0(KeyEvent keyEvent) {
        return false;
    }

    @Override // q0.InterfaceC6065k
    public void P0(i iVar) {
        iVar.g(false);
    }

    @Override // androidx.compose.foundation.gestures.b, K0.v0
    public void S(C1307q c1307q, EnumC1308s enumC1308s, long j10) {
        List listC = c1307q.c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) U1().invoke((C) listC.get(i10))).booleanValue()) {
                super.S(c1307q, enumC1308s, j10);
                break;
            }
            i10++;
        }
        if (enumC1308s == EnumC1308s.f4179b && AbstractC1310u.i(c1307q.f(), AbstractC1310u.f4183a.f())) {
            j2(c1307q, j10);
        }
    }

    @Override // C0.e
    public boolean T0(KeyEvent keyEvent) {
        long jA;
        if (!V1()) {
            return false;
        }
        long jA2 = C0.d.a(keyEvent);
        a.C0028a c0028a = C0.a.f2332b;
        if ((!C0.a.r(jA2, c0028a.l()) && !C0.a.r(C0.d.a(keyEvent), c0028a.m())) || !C0.c.e(C0.d.b(keyEvent), C0.c.f2484a.a()) || C0.d.e(keyEvent)) {
            return false;
        }
        if (this.f26005r.p()) {
            int iF = C5025r.f(this.f26007t.U1());
            jA = AbstractC6225g.a(0.0f, C0.a.r(C0.d.a(keyEvent), c0028a.m()) ? iF : -iF);
        } else {
            int iG = C5025r.g(this.f26007t.U1());
            jA = AbstractC6225g.a(C0.a.r(C0.d.a(keyEvent), c0028a.m()) ? iG : -iG, 0.0f);
        }
        AbstractC1617k.d(getCoroutineScope(), null, null, new d(jA, null), 3, null);
        return true;
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object T1(Function2 function2, Zd.e eVar) {
        z zVar = this.f26005r;
        Object objV = zVar.v(EnumC6992L.UserInput, new b(function2, zVar, null), eVar);
        return objV == AbstractC2605b.f() ? objV : L.f17438a;
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
        if (V1() && (this.f26009v == null || this.f26010w == null)) {
            k2();
        }
        Function2 function2 = this.f26009v;
        if (function2 != null) {
            A.N(c10, null, function2, 1, null);
        }
        Function2 function22 = this.f26010w;
        if (function22 != null) {
            A.O(c10, function22);
        }
    }

    @Override // androidx.compose.foundation.gestures.b
    public void Y1(long j10) {
        AbstractC1617k.d(this.f26002o.e(), null, null, new c(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public boolean c2() {
        return this.f26005r.w();
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return this.f26001n;
    }

    public final void l2(x xVar, q qVar, InterfaceC6999T interfaceC6999T, boolean z10, boolean z11, n nVar, m mVar, InterfaceC7262d interfaceC7262d) {
        boolean z12;
        if (V1() != z10) {
            this.f26006s.a(z10);
            this.f26003p.F1(z10);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z13 = z12;
        boolean zC = this.f26005r.C(xVar, qVar, interfaceC6999T, z11, nVar == null ? this.f26004q : nVar, this.f26002o);
        this.f26007t.b2(qVar, z11, interfaceC7262d);
        this.f25999l = interfaceC6999T;
        this.f26000m = nVar;
        e2(androidx.compose.foundation.gestures.d.f25976a, z10, mVar, this.f26005r.p() ? q.Vertical : q.Horizontal, zC);
        if (z13) {
            i2();
            B0.b(this);
        }
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        m2();
        this.f26008u = AbstractC7260b.a(this);
    }

    @Override // K0.InterfaceC1795j0
    public void q0() {
        m2();
    }

    @Override // androidx.compose.foundation.gestures.b
    public void X1(long j10) {
    }
}
