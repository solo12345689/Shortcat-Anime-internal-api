package androidx.compose.animation;

import I0.A;
import I0.C;
import Td.L;
import Y.h2;
import androidx.compose.ui.layout.s;
import i1.AbstractC5010c;
import i1.AbstractC5026s;
import i1.C5021n;
import i1.C5025r;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import v.q;
import v.r;
import v.x;
import w.InterfaceC6878G;
import w.o0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class g extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o0 f25675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o0.a f25676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o0.a f25677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o0.a f25678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.compose.animation.h f25679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.compose.animation.j f25680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC5082a f25681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f25682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f25683i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l0.e f25686l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f25684j = v.g.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25685k = AbstractC5010c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Function1 f25687m = new i();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function1 f25688n = new j();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25689a;

        static {
            int[] iArr = new int[v.l.values().length];
            try {
                iArr[v.l.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v.l.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v.l.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25689a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f25690a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(1);
            this.f25690a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f25690a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f25691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f25692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f25693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f25694d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s sVar, long j10, long j11, Function1 function1) {
            super(1);
            this.f25691a = sVar;
            this.f25692b = j10;
            this.f25693c = j11;
            this.f25694d = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            aVar.q0(this.f25691a, C5021n.k(this.f25693c) + C5021n.k(this.f25692b), C5021n.l(this.f25693c) + C5021n.l(this.f25692b), 0.0f, this.f25694d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f25695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s sVar) {
            super(1);
            this.f25695a = sVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.N(aVar, this.f25695a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f25697b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10) {
            super(1);
            this.f25697b = j10;
        }

        public final long a(v.l lVar) {
            return g.this.Q1(lVar, this.f25697b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5025r.b(a((v.l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f25698a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6878G invoke(o0.b bVar) {
            return androidx.compose.animation.f.f25636c;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0438g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f25700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0438g(long j10) {
            super(1);
            this.f25700b = j10;
        }

        public final long a(v.l lVar) {
            return g.this.S1(lVar, this.f25700b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(a((v.l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f25702b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10) {
            super(1);
            this.f25702b = j10;
        }

        public final long a(v.l lVar) {
            return g.this.R1(lVar, this.f25702b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(a((v.l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6878G invoke(o0.b bVar) {
            v.l lVar = v.l.PreEnter;
            v.l lVar2 = v.l.Visible;
            InterfaceC6878G interfaceC6878GB = null;
            if (bVar.c(lVar, lVar2)) {
                v.h hVarA = g.this.F1().b().a();
                if (hVarA != null) {
                    interfaceC6878GB = hVarA.b();
                }
            } else if (bVar.c(lVar2, v.l.PostExit)) {
                v.h hVarA2 = g.this.G1().b().a();
                if (hVarA2 != null) {
                    interfaceC6878GB = hVarA2.b();
                }
            } else {
                interfaceC6878GB = androidx.compose.animation.f.f25637d;
            }
            return interfaceC6878GB == null ? androidx.compose.animation.f.f25637d : interfaceC6878GB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function1 {
        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6878G invoke(o0.b bVar) {
            InterfaceC6878G interfaceC6878GA;
            InterfaceC6878G interfaceC6878GA2;
            v.l lVar = v.l.PreEnter;
            v.l lVar2 = v.l.Visible;
            if (bVar.c(lVar, lVar2)) {
                x xVarF = g.this.F1().b().f();
                return (xVarF == null || (interfaceC6878GA2 = xVarF.a()) == null) ? androidx.compose.animation.f.f25636c : interfaceC6878GA2;
            }
            if (!bVar.c(lVar2, v.l.PostExit)) {
                return androidx.compose.animation.f.f25636c;
            }
            x xVarF2 = g.this.G1().b().f();
            return (xVarF2 == null || (interfaceC6878GA = xVarF2.a()) == null) ? androidx.compose.animation.f.f25636c : interfaceC6878GA;
        }
    }

    public g(o0 o0Var, o0.a aVar, o0.a aVar2, o0.a aVar3, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, InterfaceC5082a interfaceC5082a, q qVar) {
        this.f25675a = o0Var;
        this.f25676b = aVar;
        this.f25677c = aVar2;
        this.f25678d = aVar3;
        this.f25679e = hVar;
        this.f25680f = jVar;
        this.f25681g = interfaceC5082a;
        this.f25682h = qVar;
    }

    private final void L1(long j10) {
        this.f25683i = true;
        this.f25685k = j10;
    }

    public final l0.e E1() {
        l0.e eVarA;
        l0.e eVarA2;
        if (this.f25675a.m().c(v.l.PreEnter, v.l.Visible)) {
            v.h hVarA = this.f25679e.b().a();
            if (hVarA != null && (eVarA2 = hVarA.a()) != null) {
                return eVarA2;
            }
            v.h hVarA2 = this.f25680f.b().a();
            if (hVarA2 != null) {
                return hVarA2.a();
            }
            return null;
        }
        v.h hVarA3 = this.f25680f.b().a();
        if (hVarA3 != null && (eVarA = hVarA3.a()) != null) {
            return eVarA;
        }
        v.h hVarA4 = this.f25679e.b().a();
        if (hVarA4 != null) {
            return hVarA4.a();
        }
        return null;
    }

    public final androidx.compose.animation.h F1() {
        return this.f25679e;
    }

    public final androidx.compose.animation.j G1() {
        return this.f25680f;
    }

    public final void H1(InterfaceC5082a interfaceC5082a) {
        this.f25681g = interfaceC5082a;
    }

    public final void I1(androidx.compose.animation.h hVar) {
        this.f25679e = hVar;
    }

    public final void J1(androidx.compose.animation.j jVar) {
        this.f25680f = jVar;
    }

    public final void K1(q qVar) {
        this.f25682h = qVar;
    }

    public final void M1(o0.a aVar) {
        this.f25677c = aVar;
    }

    public final void N1(o0.a aVar) {
        this.f25676b = aVar;
    }

    public final void O1(o0.a aVar) {
        this.f25678d = aVar;
    }

    public final void P1(o0 o0Var) {
        this.f25675a = o0Var;
    }

    public final long Q1(v.l lVar, long j10) {
        Function1 function1D;
        Function1 function1D2;
        int i10 = a.f25689a[lVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                v.h hVarA = this.f25679e.b().a();
                if (hVarA != null && (function1D = hVarA.d()) != null) {
                    return ((C5025r) function1D.invoke(C5025r.b(j10))).j();
                }
            } else {
                if (i10 != 3) {
                    throw new Td.r();
                }
                v.h hVarA2 = this.f25680f.b().a();
                if (hVarA2 != null && (function1D2 = hVarA2.d()) != null) {
                    return ((C5025r) function1D2.invoke(C5025r.b(j10))).j();
                }
            }
        }
        return j10;
    }

    public final long R1(v.l lVar, long j10) {
        Function1 function1B;
        Function1 function1B2;
        x xVarF = this.f25679e.b().f();
        long jB = (xVarF == null || (function1B2 = xVarF.b()) == null) ? C5021n.f48560b.b() : ((C5021n) function1B2.invoke(C5025r.b(j10))).q();
        x xVarF2 = this.f25680f.b().f();
        long jB2 = (xVarF2 == null || (function1B = xVarF2.b()) == null) ? C5021n.f48560b.b() : ((C5021n) function1B.invoke(C5025r.b(j10))).q();
        int i10 = a.f25689a[lVar.ordinal()];
        if (i10 == 1) {
            return C5021n.f48560b.b();
        }
        if (i10 == 2) {
            return jB;
        }
        if (i10 == 3) {
            return jB2;
        }
        throw new Td.r();
    }

    public final long S1(v.l lVar, long j10) {
        if (this.f25686l == null) {
            return C5021n.f48560b.b();
        }
        if (E1() == null) {
            return C5021n.f48560b.b();
        }
        if (AbstractC5504s.c(this.f25686l, E1())) {
            return C5021n.f48560b.b();
        }
        int i10 = a.f25689a[lVar.ordinal()];
        if (i10 == 1) {
            return C5021n.f48560b.b();
        }
        if (i10 == 2) {
            return C5021n.f48560b.b();
        }
        if (i10 != 3) {
            throw new Td.r();
        }
        v.h hVarA = this.f25680f.b().a();
        if (hVarA == null) {
            return C5021n.f48560b.b();
        }
        long j11 = ((C5025r) hVarA.d().invoke(C5025r.b(j10))).j();
        l0.e eVarE1 = E1();
        AbstractC5504s.e(eVarE1);
        EnumC5027t enumC5027t = EnumC5027t.f48573a;
        long jA = eVarE1.a(j10, j11, enumC5027t);
        l0.e eVar = this.f25686l;
        AbstractC5504s.e(eVar);
        return C5021n.n(jA, eVar.a(j10, j11, enumC5027t));
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
        h2 h2VarA;
        h2 h2VarA2;
        if (this.f25675a.h() == this.f25675a.o()) {
            this.f25686l = null;
        } else if (this.f25686l == null) {
            l0.e eVarE1 = E1();
            if (eVarE1 == null) {
                eVarE1 = l0.e.f52304a.o();
            }
            this.f25686l = eVarE1;
        }
        if (lVar.k0()) {
            s sVarV0 = a10.v0(j10);
            long jA = AbstractC5026s.a(sVarV0.W0(), sVarV0.P0());
            this.f25684j = jA;
            L1(j10);
            return androidx.compose.ui.layout.l.u0(lVar, C5025r.g(jA), C5025r.f(jA), null, new b(sVarV0), 4, null);
        }
        if (!((Boolean) this.f25681g.invoke()).booleanValue()) {
            s sVarV02 = a10.v0(j10);
            return androidx.compose.ui.layout.l.u0(lVar, sVarV02.W0(), sVarV02.P0(), null, new d(sVarV02), 4, null);
        }
        Function1 function1A = this.f25682h.a();
        s sVarV03 = a10.v0(j10);
        long jA2 = AbstractC5026s.a(sVarV03.W0(), sVarV03.P0());
        long j11 = v.g.b(this.f25684j) ? this.f25684j : jA2;
        o0.a aVar = this.f25676b;
        h2 h2VarA3 = aVar != null ? aVar.a(this.f25687m, new e(j11)) : null;
        if (h2VarA3 != null) {
            jA2 = ((C5025r) h2VarA3.getValue()).j();
        }
        long jD = AbstractC5010c.d(j10, jA2);
        o0.a aVar2 = this.f25677c;
        long jB = (aVar2 == null || (h2VarA2 = aVar2.a(f.f25698a, new C0438g(j11))) == null) ? C5021n.f48560b.b() : ((C5021n) h2VarA2.getValue()).q();
        o0.a aVar3 = this.f25678d;
        long jB2 = (aVar3 == null || (h2VarA = aVar3.a(this.f25688n, new h(j11))) == null) ? C5021n.f48560b.b() : ((C5021n) h2VarA.getValue()).q();
        l0.e eVar = this.f25686l;
        return androidx.compose.ui.layout.l.u0(lVar, C5025r.g(jD), C5025r.f(jD), null, new c(sVarV03, C5021n.o(eVar != null ? eVar.a(j11, jD, EnumC5027t.f48573a) : C5021n.f48560b.b(), jB2), jB, function1A), 4, null);
    }

    @Override // androidx.compose.ui.e.c
    public void onAttach() {
        super.onAttach();
        this.f25683i = false;
        this.f25684j = v.g.a();
    }
}
