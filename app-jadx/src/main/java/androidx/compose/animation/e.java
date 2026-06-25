package androidx.compose.animation;

import I0.A;
import I0.C;
import I0.H;
import Td.L;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.U1;
import Y.b2;
import Y.h2;
import androidx.compose.ui.layout.s;
import i1.AbstractC5026s;
import i1.C5025r;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5912g;
import t.C6550P;
import t.d0;
import v.s;
import v.w;
import w.AbstractC6906j;
import w.InterfaceC6878G;
import w.o0;
import w.p0;
import w.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f25618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l0.e f25619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC5027t f25620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0 f25621d = b2.e(C5025r.b(C5025r.f48570b.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C6550P f25622e = d0.b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2 f25623f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0.a f25625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h2 f25626c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f25628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.layout.s f25629b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f25630c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, androidx.compose.ui.layout.s sVar, long j10) {
                super(1);
                this.f25628a = eVar;
                this.f25629b = sVar;
                this.f25630c = j10;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }

            public final void invoke(s.a aVar) {
                s.a.U(aVar, this.f25629b, this.f25628a.g().a(AbstractC5026s.a(this.f25629b.W0(), this.f25629b.P0()), this.f25630c, EnumC5027t.f48573a), 0.0f, 2, null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0436b extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f25631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f25632b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0436b(e eVar, b bVar) {
                super(1);
                this.f25631a = eVar;
                this.f25632b = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC6878G invoke(o0.b bVar) {
                InterfaceC6878G interfaceC6878GA;
                h2 h2Var = (h2) this.f25631a.h().e(bVar.b());
                long j10 = h2Var != null ? ((C5025r) h2Var.getValue()).j() : C5025r.f48570b.a();
                h2 h2Var2 = (h2) this.f25631a.h().e(bVar.a());
                long j11 = h2Var2 != null ? ((C5025r) h2Var2.getValue()).j() : C5025r.f48570b.a();
                w wVar = (w) this.f25632b.a().getValue();
                return (wVar == null || (interfaceC6878GA = wVar.a(j10, j11)) == null) ? AbstractC6906j.h(0.0f, 0.0f, null, 7, null) : interfaceC6878GA;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class c extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f25633a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(e eVar) {
                super(1);
                this.f25633a = eVar;
            }

            public final long a(Object obj) {
                h2 h2Var = (h2) this.f25633a.h().e(obj);
                return h2Var != null ? ((C5025r) h2Var.getValue()).j() : C5025r.f48570b.a();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return C5025r.b(a(obj));
            }
        }

        public b(o0.a aVar, h2 h2Var) {
            this.f25625b = aVar;
            this.f25626c = h2Var;
        }

        public final h2 a() {
            return this.f25626c;
        }

        @Override // I0.v
        /* JADX INFO: renamed from: measure-3p2s80s */
        public C mo2measure3p2s80s(androidx.compose.ui.layout.l lVar, A a10, long j10) {
            androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
            h2 h2VarA = this.f25625b.a(new C0436b(e.this, this), new c(e.this));
            e.this.i(h2VarA);
            long jA = lVar.k0() ? AbstractC5026s.a(sVarV0.W0(), sVarV0.P0()) : ((C5025r) h2VarA.getValue()).j();
            return androidx.compose.ui.layout.l.u0(lVar, C5025r.g(jA), C5025r.f(jA), null, new a(e.this, sVarV0, jA), 4, null);
        }
    }

    public e(o0 o0Var, l0.e eVar, EnumC5027t enumC5027t) {
        this.f25618a = o0Var;
        this.f25619b = eVar;
        this.f25620c = enumC5027t;
    }

    private static final boolean e(C0 c02) {
        return ((Boolean) c02.getValue()).booleanValue();
    }

    private static final void f(C0 c02, boolean z10) {
        c02.setValue(Boolean.valueOf(z10));
    }

    @Override // w.o0.b
    public Object a() {
        return this.f25618a.m().a();
    }

    @Override // w.o0.b
    public Object b() {
        return this.f25618a.m().b();
    }

    public final androidx.compose.ui.e d(v.j jVar, InterfaceC2425m interfaceC2425m, int i10) {
        androidx.compose.ui.e eVar;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(93755870, i10, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        boolean zU = interfaceC2425m.U(this);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = b2.e(Boolean.FALSE, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        h2 h2VarO = U1.o(jVar.b(), interfaceC2425m, 0);
        if (AbstractC5504s.c(this.f25618a.h(), this.f25618a.o())) {
            f(c02, false);
        } else if (h2VarO.getValue() != null) {
            f(c02, true);
        }
        if (e(c02)) {
            interfaceC2425m.V(249037309);
            o0.a aVarB = p0.b(this.f25618a, u0.e(C5025r.f48570b), null, interfaceC2425m, 0, 2);
            boolean zU2 = interfaceC2425m.U(aVarB);
            Object objD2 = interfaceC2425m.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                w wVar = (w) h2VarO.getValue();
                objD2 = ((wVar == null || wVar.l()) ? AbstractC5912g.b(androidx.compose.ui.e.f26613a) : androidx.compose.ui.e.f26613a).then(new b(aVarB, h2VarO));
                interfaceC2425m.u(objD2);
            }
            eVar = (androidx.compose.ui.e) objD2;
            interfaceC2425m.O();
        } else {
            interfaceC2425m.V(249353726);
            interfaceC2425m.O();
            this.f25623f = null;
            eVar = androidx.compose.ui.e.f26613a;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return eVar;
    }

    public l0.e g() {
        return this.f25619b;
    }

    public final C6550P h() {
        return this.f25622e;
    }

    public final void i(h2 h2Var) {
        this.f25623f = h2Var;
    }

    public void j(l0.e eVar) {
        this.f25619b = eVar;
    }

    public final void k(EnumC5027t enumC5027t) {
        this.f25620c = enumC5027t;
    }

    public final void l(long j10) {
        this.f25621d.setValue(C5025r.b(j10));
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0 f25624b;

        public a(boolean z10) {
            this.f25624b = b2.e(Boolean.valueOf(z10), null, 2, null);
        }

        public final boolean a() {
            return ((Boolean) this.f25624b.getValue()).booleanValue();
        }

        public final void c(boolean z10) {
            this.f25624b.setValue(Boolean.valueOf(z10));
        }

        @Override // I0.H
        public Object b(InterfaceC5011d interfaceC5011d, Object obj) {
            return this;
        }
    }
}
