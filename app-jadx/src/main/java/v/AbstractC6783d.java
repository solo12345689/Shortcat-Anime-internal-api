package v;

import C.InterfaceC1138i;
import I0.C;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2409g1;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.I;
import Y.InterfaceC2425m;
import Y.U1;
import Y.Z0;
import Y.b2;
import Y.h2;
import Y.m2;
import ae.AbstractC2605b;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.s;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.C5025r;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import w.o0;
import w.p0;

/* JADX INFO: renamed from: v.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6783d {

    /* JADX INFO: renamed from: v.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: v.d$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0923a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ androidx.compose.ui.layout.s f61581a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0923a(androidx.compose.ui.layout.s sVar) {
                super(1);
                this.f61581a = sVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }

            public final void invoke(s.a aVar) {
                s.a.N(aVar, this.f61581a, 0, 0, 0.0f, 4, null);
            }
        }

        a(t tVar) {
            super(3);
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m969invoke3p2s80s((androidx.compose.ui.layout.l) obj, (I0.A) obj2, ((C5009b) obj3).r());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s */
        public final C m969invoke3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
            if (!lVar.k0()) {
                return androidx.compose.ui.layout.l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new C0923a(sVarV0), 4, null);
            }
            AbstractC5026s.a(sVarV0.W0(), sVarV0.P0());
            throw null;
        }
    }

    /* JADX INFO: renamed from: v.d$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o0 f61582a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f61583b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f61584c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ androidx.compose.animation.h f61585d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ androidx.compose.animation.j f61586e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Function2 f61587f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC5096o f61588g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f61589h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ int f61590i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o0 o0Var, Function1 function1, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function2 function2, t tVar, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f61582a = o0Var;
            this.f61583b = function1;
            this.f61584c = eVar;
            this.f61585d = hVar;
            this.f61586e = jVar;
            this.f61587f = function2;
            this.f61588g = interfaceC5096o;
            this.f61589h = i10;
            this.f61590i = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC6783d.a(this.f61582a, this.f61583b, this.f61584c, this.f61585d, this.f61586e, this.f61587f, null, this.f61588g, interfaceC2425m, AbstractC2409g1.a(this.f61589h | 1), this.f61590i);
        }
    }

    /* JADX INFO: renamed from: v.d$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f61591a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f61592b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ o0 f61593c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ h2 f61594d;

        /* JADX INFO: renamed from: v.d$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements InterfaceC5082a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ o0 f61595a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var) {
                super(0);
                this.f61595a = o0Var;
            }

            @Override // ie.InterfaceC5082a
            public final Boolean invoke() {
                return Boolean.valueOf(AbstractC6783d.i(this.f61595a));
            }
        }

        /* JADX INFO: renamed from: v.d$c$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class b implements InterfaceC1743f {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Z0 f61596a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ o0 f61597b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ h2 f61598c;

            b(Z0 z02, o0 o0Var, h2 h2Var) {
                this.f61596a = z02;
                this.f61597b = o0Var;
                this.f61598c = h2Var;
            }

            public final Object a(boolean z10, Zd.e eVar) {
                this.f61596a.setValue(kotlin.coroutines.jvm.internal.b.a(z10 ? ((Boolean) AbstractC6783d.b(this.f61598c).invoke(this.f61597b.h(), this.f61597b.o())).booleanValue() : false));
                return L.f17438a;
            }

            @Override // Jf.InterfaceC1743f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Zd.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(o0 o0Var, h2 h2Var, Zd.e eVar) {
            super(2, eVar);
            this.f61593c = o0Var;
            this.f61594d = h2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(Z0 z02, Zd.e eVar) {
            return ((c) create(z02, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = new c(this.f61593c, this.f61594d, eVar);
            cVar.f61592b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f61591a;
            if (i10 == 0) {
                Td.v.b(obj);
                Z0 z02 = (Z0) this.f61592b;
                InterfaceC1742e interfaceC1742eP = U1.p(new a(this.f61593c));
                b bVar = new b(z02, this.f61593c, this.f61594d);
                this.f61591a = 1;
                if (interfaceC1742eP.collect(bVar, this) == objF) {
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

    /* JADX INFO: renamed from: v.d$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0924d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C0924d f61599a = new C0924d();

        C0924d() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: v.d$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f61600a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.ui.e f61601b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.animation.h f61602c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ androidx.compose.animation.j f61603d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ String f61604e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC5096o f61605f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f61606g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f61607h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, String str, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f61600a = z10;
            this.f61601b = eVar;
            this.f61602c = hVar;
            this.f61603d = jVar;
            this.f61604e = str;
            this.f61605f = interfaceC5096o;
            this.f61606g = i10;
            this.f61607h = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC6783d.e(this.f61600a, this.f61601b, this.f61602c, this.f61603d, this.f61604e, this.f61605f, interfaceC2425m, AbstractC2409g1.a(this.f61606g | 1), this.f61607h);
        }
    }

    /* JADX INFO: renamed from: v.d$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final f f61608a = new f();

        f() {
            super(1);
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: renamed from: v.d$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1138i f61609a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ boolean f61610b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f61611c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ androidx.compose.animation.h f61612d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ androidx.compose.animation.j f61613e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ String f61614f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ InterfaceC5096o f61615g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ int f61616h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ int f61617i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC1138i interfaceC1138i, boolean z10, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, String str, InterfaceC5096o interfaceC5096o, int i10, int i11) {
            super(2);
            this.f61609a = interfaceC1138i;
            this.f61610b = z10;
            this.f61611c = eVar;
            this.f61612d = hVar;
            this.f61613e = jVar;
            this.f61614f = str;
            this.f61615g = interfaceC5096o;
            this.f61616h = i10;
            this.f61617i = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC6783d.d(this.f61609a, this.f61610b, this.f61611c, this.f61612d, this.f61613e, this.f61614f, this.f61615g, interfaceC2425m, AbstractC2409g1.a(this.f61616h | 1), this.f61617i);
        }
    }

    /* JADX INFO: renamed from: v.d$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f61618a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o0 f61619b;

        /* JADX INFO: renamed from: v.d$h$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ androidx.compose.ui.layout.s f61620a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.layout.s sVar) {
                super(1);
                this.f61620a = sVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((s.a) obj);
                return L.f17438a;
            }

            public final void invoke(s.a aVar) {
                s.a.N(aVar, this.f61620a, 0, 0, 0.0f, 4, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Function1 function1, o0 o0Var) {
            super(3);
            this.f61618a = function1;
            this.f61619b = o0Var;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m970invoke3p2s80s((androidx.compose.ui.layout.l) obj, (I0.A) obj2, ((C5009b) obj3).r());
        }

        /* JADX INFO: renamed from: invoke-3p2s80s */
        public final C m970invoke3p2s80s(androidx.compose.ui.layout.l lVar, I0.A a10, long j10) {
            androidx.compose.ui.layout.s sVarV0 = a10.v0(j10);
            long jA = (!lVar.k0() || ((Boolean) this.f61618a.invoke(this.f61619b.o())).booleanValue()) ? AbstractC5026s.a(sVarV0.W0(), sVarV0.P0()) : C5025r.f48570b.a();
            return androidx.compose.ui.layout.l.u0(lVar, C5025r.g(jA), C5025r.f(jA), null, new a(sVarV0), 4, null);
        }
    }

    /* JADX INFO: renamed from: v.d$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        public static final i f61621a = new i();

        i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Boolean invoke(l lVar, l lVar2) {
            return Boolean.valueOf(lVar == lVar2 && lVar2 == l.PostExit);
        }
    }

    /* JADX INFO: renamed from: v.d$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o0 f61622a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f61623b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.ui.e f61624c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ androidx.compose.animation.h f61625d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ androidx.compose.animation.j f61626e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC5096o f61627f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f61628g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(o0 o0Var, Function1 function1, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, InterfaceC5096o interfaceC5096o, int i10) {
            super(2);
            this.f61622a = o0Var;
            this.f61623b = function1;
            this.f61624c = eVar;
            this.f61625d = hVar;
            this.f61626e = jVar;
            this.f61627f = interfaceC5096o;
            this.f61628g = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            AbstractC6783d.f(this.f61622a, this.f61623b, this.f61624c, this.f61625d, this.f61626e, this.f61627f, interfaceC2425m, AbstractC2409g1.a(this.f61628g | 1));
        }
    }

    public static final void a(o0 o0Var, Function1 function1, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function2 function2, t tVar, InterfaceC5096o interfaceC5096o, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        int i12;
        androidx.compose.animation.h hVar2;
        androidx.compose.animation.j jVar2;
        t tVar2;
        int i13;
        l lVar;
        t tVar3;
        InterfaceC2425m interfaceC2425m2;
        androidx.compose.ui.e eVarA;
        t tVar4 = tVar;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-891967166);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC2425mG.U(o0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC2425mG.F(function1) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC2425mG.U(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            if ((i10 & 3072) == 0) {
                i12 |= interfaceC2425mG.U(hVar2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i10 & 24576) == 0) {
                i12 |= interfaceC2425mG.U(jVar2) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= interfaceC2425mG.F(function2) ? 131072 : 65536;
        }
        int i14 = i11 & 64;
        int i15 = 1572864;
        if (i14 != 0) {
            i12 |= i15;
        } else if ((i10 & 1572864) == 0) {
            i15 = (i10 & 2097152) == 0 ? interfaceC2425mG.U(tVar4) : interfaceC2425mG.F(tVar4) ? 1048576 : 524288;
            i12 |= i15;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i12 |= interfaceC2425mG.F(interfaceC5096o) ? 8388608 : 4194304;
        }
        int i16 = i12;
        if ((4793491 & i16) == 4793490 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
            tVar3 = tVar4;
            interfaceC2425m2 = interfaceC2425mG;
        } else {
            if (i14 != 0) {
                tVar4 = null;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-891967166, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)");
            }
            if (((Boolean) function1.invoke(o0Var.o())).booleanValue() || ((Boolean) function1.invoke(o0Var.h())).booleanValue() || o0Var.s() || o0Var.i()) {
                interfaceC2425mG.V(1787977937);
                int i17 = i16 & 14;
                int i18 = i17 | 48;
                int i19 = i18 & 14;
                boolean z10 = ((i19 ^ 6) > 4 && interfaceC2425mG.U(o0Var)) || (i18 & 6) == 4;
                Object objD = interfaceC2425mG.D();
                if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                    objD = o0Var.h();
                    interfaceC2425mG.u(objD);
                }
                if (o0Var.s()) {
                    objD = o0Var.h();
                }
                interfaceC2425mG.V(-466616829);
                if (AbstractC2454w.L()) {
                    tVar2 = tVar4;
                    i13 = i17;
                    AbstractC2454w.U(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    tVar2 = tVar4;
                    i13 = i17;
                }
                int i20 = i16 & 126;
                l lVarJ = j(o0Var, function1, objD, interfaceC2425mG, i20);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                interfaceC2425mG.O();
                Object objO = o0Var.o();
                interfaceC2425mG.V(-466616829);
                if (AbstractC2454w.L()) {
                    lVar = lVarJ;
                    AbstractC2454w.U(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)");
                } else {
                    lVar = lVarJ;
                }
                l lVarJ2 = j(o0Var, function1, objO, interfaceC2425mG, i20);
                if (AbstractC2454w.L()) {
                    AbstractC2454w.T();
                }
                interfaceC2425mG.O();
                int i21 = i19 | 3072;
                tVar3 = tVar2;
                int i22 = i13;
                o0 o0VarA = p0.a(o0Var, lVar, lVarJ2, "EnterExitTransition", interfaceC2425mG, i21);
                h2 h2VarO = U1.o(function2, interfaceC2425mG, (i16 >> 15) & 14);
                Object objInvoke = function2.invoke(o0VarA.h(), o0VarA.o());
                boolean zU = interfaceC2425mG.U(o0VarA) | interfaceC2425mG.U(h2VarO);
                Object objD2 = interfaceC2425mG.D();
                if (zU || objD2 == InterfaceC2425m.f22370a.a()) {
                    objD2 = new c(o0VarA, h2VarO, null);
                    interfaceC2425mG.u(objD2);
                }
                h2 h2VarL = U1.l(objInvoke, (Function2) objD2, interfaceC2425mG, 0);
                if (i(o0VarA) && c(h2VarL)) {
                    interfaceC2425mG.V(1790256282);
                    interfaceC2425mG.O();
                    interfaceC2425m2 = interfaceC2425mG;
                } else {
                    interfaceC2425mG.V(1788869559);
                    boolean z11 = i22 == 4;
                    Object objD3 = interfaceC2425mG.D();
                    if (z11 || objD3 == InterfaceC2425m.f22370a.a()) {
                        objD3 = new v.f(o0VarA);
                        interfaceC2425mG.u(objD3);
                    }
                    v.f fVar = (v.f) objD3;
                    int i23 = i16 >> 6;
                    androidx.compose.ui.e eVarG = androidx.compose.animation.f.g(o0VarA, hVar2, jVar2, null, "Built-in", interfaceC2425mG, (i23 & 896) | (i23 & 112) | 24576, 4);
                    interfaceC2425m2 = interfaceC2425mG;
                    if (tVar3 != null) {
                        interfaceC2425m2.V(1789227361);
                        e.a aVar = androidx.compose.ui.e.f26613a;
                        boolean z12 = (3670016 & i16) == 1048576 || ((i16 & 2097152) != 0 && interfaceC2425m2.F(tVar3));
                        Object objD4 = interfaceC2425m2.D();
                        if (z12 || objD4 == InterfaceC2425m.f22370a.a()) {
                            objD4 = new a(tVar3);
                            interfaceC2425m2.u(objD4);
                        }
                        eVarA = androidx.compose.ui.layout.i.a(aVar, (InterfaceC5096o) objD4);
                        interfaceC2425m2.O();
                    } else {
                        interfaceC2425m2.V(1581766416);
                        interfaceC2425m2.O();
                        eVarA = androidx.compose.ui.e.f26613a;
                    }
                    androidx.compose.ui.e eVarThen = eVar.then(eVarG.then(eVarA));
                    Object objD5 = interfaceC2425m2.D();
                    if (objD5 == InterfaceC2425m.f22370a.a()) {
                        objD5 = new C6782c(fVar);
                        interfaceC2425m2.u(objD5);
                    }
                    C6782c c6782c = (C6782c) objD5;
                    int iA = AbstractC2410h.a(interfaceC2425m2, 0);
                    I iR = interfaceC2425m2.r();
                    androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m2, eVarThen);
                    InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
                    InterfaceC5082a interfaceC5082aA = aVar2.a();
                    if (interfaceC2425m2.j() == null) {
                        AbstractC2410h.d();
                    }
                    interfaceC2425m2.I();
                    if (interfaceC2425m2.e()) {
                        interfaceC2425m2.h(interfaceC5082aA);
                    } else {
                        interfaceC2425m2.s();
                    }
                    InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m2);
                    m2.e(interfaceC2425mB, c6782c, aVar2.e());
                    m2.e(interfaceC2425mB, iR, aVar2.g());
                    Function2 function2B = aVar2.b();
                    if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
                        interfaceC2425mB.u(Integer.valueOf(iA));
                        interfaceC2425mB.m(Integer.valueOf(iA), function2B);
                    }
                    m2.e(interfaceC2425mB, eVarF, aVar2.f());
                    interfaceC5096o.invoke(fVar, interfaceC2425m2, Integer.valueOf((i16 >> 18) & 112));
                    interfaceC2425m2.x();
                    interfaceC2425m2.O();
                }
                interfaceC2425m2.O();
            } else {
                interfaceC2425mG.V(1790262234);
                interfaceC2425mG.O();
                tVar3 = tVar4;
                interfaceC2425m2 = interfaceC2425mG;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425m2.k();
        if (b1K != null) {
            b1K.a(new b(o0Var, function1, eVar, hVar, jVar, function2, tVar3, interfaceC5096o, i10, i11));
        }
    }

    public static final Function2 b(h2 h2Var) {
        return (Function2) h2Var.getValue();
    }

    private static final boolean c(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(C.InterfaceC1138i r22, boolean r23, androidx.compose.ui.e r24, androidx.compose.animation.h r25, androidx.compose.animation.j r26, java.lang.String r27, ie.InterfaceC5096o r28, Y.InterfaceC2425m r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.AbstractC6783d.d(C.i, boolean, androidx.compose.ui.e, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, ie.o, Y.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(boolean r22, androidx.compose.ui.e r23, androidx.compose.animation.h r24, androidx.compose.animation.j r25, java.lang.String r26, ie.InterfaceC5096o r27, Y.InterfaceC2425m r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v.AbstractC6783d.e(boolean, androidx.compose.ui.e, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, ie.o, Y.m, int, int):void");
    }

    public static final void f(o0 o0Var, Function1 function1, androidx.compose.ui.e eVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, InterfaceC5096o interfaceC5096o, InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        androidx.compose.animation.j jVar2;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(429978603);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.U(o0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC2425mG.F(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.U(eVar) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC2425mG.U(hVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i10 & 24576) == 0) {
            jVar2 = jVar;
            i11 |= interfaceC2425mG.U(jVar2) ? 16384 : 8192;
        } else {
            jVar2 = jVar;
        }
        if ((i10 & 196608) == 0) {
            i11 |= interfaceC2425mG.F(interfaceC5096o) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(429978603, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)");
            }
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objD = interfaceC2425mG.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new h(function1, o0Var);
                interfaceC2425mG.u(objD);
            }
            a(o0Var, function1, androidx.compose.ui.layout.i.a(eVar, (InterfaceC5096o) objD), hVar, jVar2, i.f61621a, null, interfaceC5096o, interfaceC2425mG, i12 | i13 | 196608 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new j(o0Var, function1, eVar, hVar, jVar, interfaceC5096o, i10));
        }
    }

    public static final boolean i(o0 o0Var) {
        Object objH = o0Var.h();
        l lVar = l.PostExit;
        return objH == lVar && o0Var.o() == lVar;
    }

    private static final l j(o0 o0Var, Function1 function1, Object obj, InterfaceC2425m interfaceC2425m, int i10) {
        l lVar;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)");
        }
        interfaceC2425m.H(-902048200, o0Var);
        if (o0Var.s()) {
            interfaceC2425m.V(2101296683);
            interfaceC2425m.O();
            lVar = ((Boolean) function1.invoke(obj)).booleanValue() ? l.Visible : ((Boolean) function1.invoke(o0Var.h())).booleanValue() ? l.PostExit : l.PreEnter;
        } else {
            interfaceC2425m.V(2101530516);
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = b2.e(Boolean.FALSE, null, 2, null);
                interfaceC2425m.u(objD);
            }
            C0 c02 = (C0) objD;
            if (((Boolean) function1.invoke(o0Var.h())).booleanValue()) {
                c02.setValue(Boolean.TRUE);
            }
            lVar = ((Boolean) function1.invoke(obj)).booleanValue() ? l.Visible : ((Boolean) c02.getValue()).booleanValue() ? l.PostExit : l.PreEnter;
            interfaceC2425m.O();
        }
        interfaceC2425m.S();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return lVar;
    }
}
