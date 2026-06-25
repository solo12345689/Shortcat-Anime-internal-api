package androidx.compose.animation;

import Td.L;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.b2;
import Y.h2;
import androidx.compose.ui.e;
import i1.AbstractC5022o;
import i1.AbstractC5026s;
import i1.C5021n;
import i1.C5025r;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import s0.L1;
import v.C6779B;
import w.AbstractC6906j;
import w.C6903h0;
import w.C6910n;
import w.I0;
import w.InterfaceC6878G;
import w.o0;
import w.p0;
import w.s0;
import w.u0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    private static final s0 f25634a = u0.a(a.f25638a, b.f25639a);

    /* JADX INFO: renamed from: b */
    private static final C6903h0 f25635b = AbstractC6906j.h(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c */
    private static final C6903h0 f25636c = AbstractC6906j.h(0.0f, 400.0f, C5021n.c(I0.c(C5021n.f48560b)), 1, null);

    /* JADX INFO: renamed from: d */
    private static final C6903h0 f25637d = AbstractC6906j.h(0.0f, 400.0f, C5025r.b(I0.d(C5025r.f48570b)), 1, null);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f25638a = new a();

        a() {
            super(1);
        }

        public final C6910n a(long j10) {
            return new C6910n(androidx.compose.ui.graphics.j.f(j10), androidx.compose.ui.graphics.j.g(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((androidx.compose.ui.graphics.j) obj).j());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final b f25639a = new b();

        b() {
            super(1);
        }

        public final long a(C6910n c6910n) {
            return L1.a(c6910n.f(), c6910n.g());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.j.b(a((C6910n) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.animation.h f25640a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.animation.j f25641b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f25640a = hVar;
            this.f25641b = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final InterfaceC6878G invoke(o0.b bVar) {
            InterfaceC6878G interfaceC6878GB;
            InterfaceC6878G interfaceC6878GB2;
            v.l lVar = v.l.PreEnter;
            v.l lVar2 = v.l.Visible;
            if (bVar.c(lVar, lVar2)) {
                v.n nVarC = this.f25640a.b().c();
                return (nVarC == null || (interfaceC6878GB2 = nVarC.b()) == null) ? f.f25635b : interfaceC6878GB2;
            }
            if (!bVar.c(lVar2, v.l.PostExit)) {
                return f.f25635b;
            }
            v.n nVarC2 = this.f25641b.b().c();
            return (nVarC2 == null || (interfaceC6878GB = nVarC2.b()) == null) ? f.f25635b : interfaceC6878GB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.animation.h f25642a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.animation.j f25643b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f25644a;

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
                f25644a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f25642a = hVar;
            this.f25643b = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Float invoke(v.l lVar) {
            int i10 = a.f25644a[lVar.ordinal()];
            float fA = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    v.n nVarC = this.f25642a.b().c();
                    if (nVarC != null) {
                        fA = nVarC.a();
                    }
                } else {
                    if (i10 != 3) {
                        throw new Td.r();
                    }
                    v.n nVarC2 = this.f25643b.b().c();
                    if (nVarC2 != null) {
                        fA = nVarC2.a();
                    }
                }
            }
            return Float.valueOf(fA);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ h2 f25645a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h2 f25646b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ h2 f25647c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h2 h2Var, h2 h2Var2, h2 h2Var3) {
            super(1);
            this.f25645a = h2Var;
            this.f25646b = h2Var2;
            this.f25647c = h2Var3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return L.f17438a;
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
            h2 h2Var = this.f25645a;
            gVar.e(h2Var != null ? ((Number) h2Var.getValue()).floatValue() : 1.0f);
            h2 h2Var2 = this.f25646b;
            gVar.l(h2Var2 != null ? ((Number) h2Var2.getValue()).floatValue() : 1.0f);
            h2 h2Var3 = this.f25646b;
            gVar.y(h2Var3 != null ? ((Number) h2Var3.getValue()).floatValue() : 1.0f);
            h2 h2Var4 = this.f25647c;
            gVar.t0(h2Var4 != null ? ((androidx.compose.ui.graphics.j) h2Var4.getValue()).j() : androidx.compose.ui.graphics.j.f26818b.a());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.f$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0437f extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.animation.h f25648a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.animation.j f25649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0437f(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f25648a = hVar;
            this.f25649b = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final InterfaceC6878G invoke(o0.b bVar) {
            InterfaceC6878G interfaceC6878GA;
            InterfaceC6878G interfaceC6878GA2;
            v.l lVar = v.l.PreEnter;
            v.l lVar2 = v.l.Visible;
            if (bVar.c(lVar, lVar2)) {
                v.u uVarE = this.f25648a.b().e();
                return (uVarE == null || (interfaceC6878GA2 = uVarE.a()) == null) ? f.f25635b : interfaceC6878GA2;
            }
            if (!bVar.c(lVar2, v.l.PostExit)) {
                return f.f25635b;
            }
            v.u uVarE2 = this.f25649b.b().e();
            return (uVarE2 == null || (interfaceC6878GA = uVarE2.a()) == null) ? f.f25635b : interfaceC6878GA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.animation.h f25650a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.animation.j f25651b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f25652a;

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
                f25652a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(androidx.compose.animation.h hVar, androidx.compose.animation.j jVar) {
            super(1);
            this.f25650a = hVar;
            this.f25651b = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final Float invoke(v.l lVar) {
            int i10 = a.f25652a[lVar.ordinal()];
            float fB = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    v.u uVarE = this.f25650a.b().e();
                    if (uVarE != null) {
                        fB = uVarE.b();
                    }
                } else {
                    if (i10 != 3) {
                        throw new Td.r();
                    }
                    v.u uVarE2 = this.f25651b.b().e();
                    if (uVarE2 != null) {
                        fB = uVarE2.b();
                    }
                }
            }
            return Float.valueOf(fB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final h f25653a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final InterfaceC6878G invoke(o0.b bVar) {
            return AbstractC6906j.h(0.0f, 0.0f, null, 7, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.compose.ui.graphics.j f25654a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ androidx.compose.animation.h f25655b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ androidx.compose.animation.j f25656c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f25657a;

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
                f25657a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.j jVar, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar2) {
            super(1);
            this.f25654a = jVar;
            this.f25655b = hVar;
            this.f25656c = jVar2;
        }

        public final long a(v.l lVar) {
            androidx.compose.ui.graphics.j jVarB;
            int i10 = a.f25657a[lVar.ordinal()];
            if (i10 != 1) {
                jVarB = null;
                if (i10 == 2) {
                    v.u uVarE = this.f25655b.b().e();
                    if (uVarE != null || (uVarE = this.f25656c.b().e()) != null) {
                        jVarB = androidx.compose.ui.graphics.j.b(uVarE.c());
                    }
                } else {
                    if (i10 != 3) {
                        throw new Td.r();
                    }
                    v.u uVarE2 = this.f25656c.b().e();
                    if (uVarE2 != null || (uVarE2 = this.f25655b.b().e()) != null) {
                        jVarB = androidx.compose.ui.graphics.j.b(uVarE2.c());
                    }
                }
            } else {
                jVarB = this.f25654a;
            }
            return jVarB != null ? jVarB.j() : androidx.compose.ui.graphics.j.f26818b.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return androidx.compose.ui.graphics.j.b(a((v.l) obj));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final j f25658a = new j();

        j() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f25659a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5082a f25660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, InterfaceC5082a interfaceC5082a) {
            super(1);
            this.f25659a = z10;
            this.f25660b = interfaceC5082a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((androidx.compose.ui.graphics.g) obj);
            return L.f17438a;
        }

        public final void invoke(androidx.compose.ui.graphics.g gVar) {
            gVar.n(!this.f25659a && ((Boolean) this.f25660b.invoke()).booleanValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final l f25661a = new l();

        l() {
            super(1);
        }

        public final long a(long j10) {
            return AbstractC5026s.a(0, 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5025r.b(a(((C5025r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final m f25662a = new m();

        m() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class n extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f25663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1) {
            super(1);
            this.f25663a = function1;
        }

        public final long a(long j10) {
            return AbstractC5026s.a(C5025r.g(j10), ((Number) this.f25663a.invoke(Integer.valueOf(C5025r.f(j10)))).intValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5025r.b(a(((C5025r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final o f25664a = new o();

        o() {
            super(1);
        }

        public final long a(long j10) {
            return AbstractC5026s.a(0, 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5025r.b(a(((C5025r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final p f25665a = new p();

        p() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class q extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f25666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Function1 function1) {
            super(1);
            this.f25666a = function1;
        }

        public final long a(long j10) {
            return AbstractC5026s.a(C5025r.g(j10), ((Number) this.f25666a.invoke(Integer.valueOf(C5025r.f(j10)))).intValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5025r.b(a(((C5025r) obj).j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final r f25667a = new r();

        r() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class s extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f25668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(Function1 function1) {
            super(1);
            this.f25668a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(m60invokemHKZG7I(((C5025r) obj).j()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m60invokemHKZG7I(long j10) {
            return AbstractC5022o.a(((Number) this.f25668a.invoke(Integer.valueOf(C5025r.g(j10)))).intValue(), 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final t f25669a = new t();

        t() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class u extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f25670a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(Function1 function1) {
            super(1);
            this.f25670a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(m61invokemHKZG7I(((C5025r) obj).j()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m61invokemHKZG7I(long j10) {
            return AbstractC5022o.a(0, ((Number) this.f25670a.invoke(Integer.valueOf(C5025r.f(j10)))).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final v f25671a = new v();

        v() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class w extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f25672a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(Function1 function1) {
            super(1);
            this.f25672a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(m62invokemHKZG7I(((C5025r) obj).j()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m62invokemHKZG7I(long j10) {
            return AbstractC5022o.a(((Number) this.f25672a.invoke(Integer.valueOf(C5025r.g(j10)))).intValue(), 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final x f25673a = new x();

        x() {
            super(1);
        }

        public final Integer invoke(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class y extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f25674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Function1 function1) {
            super(1);
            this.f25674a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return C5021n.c(m63invokemHKZG7I(((C5025r) obj).j()));
        }

        /* JADX INFO: renamed from: invoke-mHKZG7I */
        public final long m63invokemHKZG7I(long j10) {
            return AbstractC5022o.a(0, ((Number) this.f25674a.invoke(Integer.valueOf(C5025r.f(j10)))).intValue());
        }
    }

    public static final androidx.compose.animation.j A(InterfaceC6878G interfaceC6878G, Function1 function1) {
        return new androidx.compose.animation.k(new C6779B(null, new v.x(function1, interfaceC6878G), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.j B(InterfaceC6878G interfaceC6878G, Function1 function1) {
        return A(interfaceC6878G, new w(function1));
    }

    public static /* synthetic */ androidx.compose.animation.j C(InterfaceC6878G interfaceC6878G, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5021n.c(I0.c(C5021n.f48560b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = v.f25671a;
        }
        return B(interfaceC6878G, function1);
    }

    public static final androidx.compose.animation.j D(InterfaceC6878G interfaceC6878G, Function1 function1) {
        return A(interfaceC6878G, new y(function1));
    }

    public static /* synthetic */ androidx.compose.animation.j E(InterfaceC6878G interfaceC6878G, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5021n.c(I0.c(C5021n.f48560b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = x.f25673a;
        }
        return D(interfaceC6878G, function1);
    }

    private static final l0.e F(e.c cVar) {
        e.a aVar = l0.e.f52304a;
        return AbstractC5504s.c(cVar, aVar.l()) ? aVar.m() : AbstractC5504s.c(cVar, aVar.a()) ? aVar.b() : aVar.e();
    }

    public static final androidx.compose.animation.h G(o0 o0Var, androidx.compose.animation.h hVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(o0Var)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = b2.e(hVar, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        if (o0Var.h() == o0Var.o() && o0Var.h() == v.l.Visible) {
            if (o0Var.s()) {
                I(c02, hVar);
            } else {
                I(c02, androidx.compose.animation.h.f25705a.a());
            }
        } else if (o0Var.o() == v.l.Visible) {
            I(c02, H(c02).c(hVar));
        }
        androidx.compose.animation.h hVarH = H(c02);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return hVarH;
    }

    private static final androidx.compose.animation.h H(C0 c02) {
        return (androidx.compose.animation.h) c02.getValue();
    }

    private static final void I(C0 c02, androidx.compose.animation.h hVar) {
        c02.setValue(hVar);
    }

    public static final androidx.compose.animation.j J(o0 o0Var, androidx.compose.animation.j jVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(o0Var)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = b2.e(jVar, null, 2, null);
            interfaceC2425m.u(objD);
        }
        C0 c02 = (C0) objD;
        if (o0Var.h() == o0Var.o() && o0Var.h() == v.l.Visible) {
            if (o0Var.s()) {
                L(c02, jVar);
            } else {
                L(c02, androidx.compose.animation.j.f25708a.a());
            }
        } else if (o0Var.o() != v.l.Visible) {
            L(c02, K(c02).c(jVar));
        }
        androidx.compose.animation.j jVarK = K(c02);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return jVarK;
    }

    private static final androidx.compose.animation.j K(C0 c02) {
        return (androidx.compose.animation.j) c02.getValue();
    }

    private static final void L(C0 c02, androidx.compose.animation.j jVar) {
        c02.setValue(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x011e A[PHI: r1
  0x011e: PHI (r1v11 androidx.compose.animation.h) = (r1v9 androidx.compose.animation.h), (r1v12 androidx.compose.animation.h) binds: [B:114:0x011c, B:110:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0139 A[PHI: r2
  0x0139: PHI (r2v10 androidx.compose.animation.j) = (r2v8 androidx.compose.animation.j), (r2v11 androidx.compose.animation.j) binds: [B:124:0x0137, B:120:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final v.q e(final w.o0 r19, androidx.compose.animation.h r20, androidx.compose.animation.j r21, java.lang.String r22, Y.InterfaceC2425m r23, int r24) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.e(w.o0, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, Y.m, int):v.q");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.jvm.functions.Function1 f(w.o0.a r3, w.o0.a r4, w.o0 r5, androidx.compose.animation.h r6, androidx.compose.animation.j r7, w.o0.a r8) {
        /*
            r0 = 0
            if (r3 == 0) goto L12
            androidx.compose.animation.f$c r1 = new androidx.compose.animation.f$c
            r1.<init>(r6, r7)
            androidx.compose.animation.f$d r2 = new androidx.compose.animation.f$d
            r2.<init>(r6, r7)
            Y.h2 r3 = r3.a(r1, r2)
            goto L13
        L12:
            r3 = r0
        L13:
            if (r4 == 0) goto L24
            androidx.compose.animation.f$f r1 = new androidx.compose.animation.f$f
            r1.<init>(r6, r7)
            androidx.compose.animation.f$g r2 = new androidx.compose.animation.f$g
            r2.<init>(r6, r7)
            Y.h2 r4 = r4.a(r1, r2)
            goto L25
        L24:
            r4 = r0
        L25:
            java.lang.Object r5 = r5.h()
            v.l r1 = v.l.PreEnter
            if (r5 != r1) goto L4d
            v.B r5 = r6.b()
            v.u r5 = r5.e()
            if (r5 == 0) goto L40
        L37:
            long r1 = r5.c()
            androidx.compose.ui.graphics.j r5 = androidx.compose.ui.graphics.j.b(r1)
            goto L6b
        L40:
            v.B r5 = r7.b()
            v.u r5 = r5.e()
            if (r5 == 0) goto L4b
            goto L37
        L4b:
            r5 = r0
            goto L6b
        L4d:
            v.B r5 = r7.b()
            v.u r5 = r5.e()
            if (r5 == 0) goto L60
        L57:
            long r1 = r5.c()
            androidx.compose.ui.graphics.j r5 = androidx.compose.ui.graphics.j.b(r1)
            goto L6b
        L60:
            v.B r5 = r6.b()
            v.u r5 = r5.e()
            if (r5 == 0) goto L4b
            goto L57
        L6b:
            if (r8 == 0) goto L78
            androidx.compose.animation.f$h r0 = androidx.compose.animation.f.h.f25653a
            androidx.compose.animation.f$i r1 = new androidx.compose.animation.f$i
            r1.<init>(r5, r6, r7)
            Y.h2 r0 = r8.a(r0, r1)
        L78:
            androidx.compose.animation.f$e r5 = new androidx.compose.animation.f$e
            r5.<init>(r3, r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.f(w.o0$a, w.o0$a, w.o0, androidx.compose.animation.h, androidx.compose.animation.j, w.o0$a):kotlin.jvm.functions.Function1");
    }

    public static final androidx.compose.ui.e g(o0 o0Var, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, InterfaceC5082a interfaceC5082a, String str, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        o0.a aVar;
        o0.a aVar2;
        v.h hVarA;
        InterfaceC5082a interfaceC5082a2 = (i11 & 4) != 0 ? j.f25658a : interfaceC5082a;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(28261782, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)");
        }
        int i12 = i10 & 14;
        androidx.compose.animation.h hVarG = G(o0Var, hVar, interfaceC2425m, i10 & 126);
        int i13 = i10 >> 3;
        androidx.compose.animation.j jVarJ = J(o0Var, jVar, interfaceC2425m, (i13 & 112) | i12);
        boolean z10 = true;
        boolean z11 = (hVarG.b().f() == null && jVarJ.b().f() == null) ? false : true;
        boolean z12 = (hVarG.b().a() == null && jVarJ.b().a() == null) ? false : true;
        o0.a aVarB = null;
        if (z11) {
            interfaceC2425m.V(-821375963);
            s0 s0VarD = u0.d(C5021n.f48560b);
            Object objD = interfaceC2425m.D();
            if (objD == InterfaceC2425m.f22370a.a()) {
                objD = str + " slide";
                interfaceC2425m.u(objD);
            }
            o0.a aVarB2 = p0.b(o0Var, s0VarD, (String) objD, interfaceC2425m, i12 | 384, 0);
            interfaceC2425m.O();
            aVar = aVarB2;
        } else {
            interfaceC2425m.V(-821278096);
            interfaceC2425m.O();
            aVar = null;
        }
        if (z12) {
            interfaceC2425m.V(-821202177);
            s0 s0VarE = u0.e(C5025r.f48570b);
            Object objD2 = interfaceC2425m.D();
            if (objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = str + " shrink/expand";
                interfaceC2425m.u(objD2);
            }
            o0.a aVarB3 = p0.b(o0Var, s0VarE, (String) objD2, interfaceC2425m, i12 | 384, 0);
            interfaceC2425m.O();
            aVar2 = aVarB3;
        } else {
            interfaceC2425m.V(-821099041);
            interfaceC2425m.O();
            aVar2 = null;
        }
        if (z12) {
            interfaceC2425m.V(-821034002);
            s0 s0VarD2 = u0.d(C5021n.f48560b);
            Object objD3 = interfaceC2425m.D();
            if (objD3 == InterfaceC2425m.f22370a.a()) {
                objD3 = str + " InterruptionHandlingOffset";
                interfaceC2425m.u(objD3);
            }
            aVarB = p0.b(o0Var, s0VarD2, (String) objD3, interfaceC2425m, i12 | 384, 0);
            interfaceC2425m.O();
        } else {
            interfaceC2425m.V(-820883777);
            interfaceC2425m.O();
        }
        v.h hVarA2 = hVarG.b().a();
        boolean z13 = ((hVarA2 == null || hVarA2.c()) && ((hVarA = jVarJ.b().a()) == null || hVarA.c()) && z12) ? false : true;
        v.q qVarE = e(o0Var, hVarG, jVarJ, str, interfaceC2425m, i12 | (i13 & 7168));
        e.a aVar3 = androidx.compose.ui.e.f26613a;
        boolean zA = interfaceC2425m.a(z13);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !interfaceC2425m.U(interfaceC5082a2)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z14 = zA | z10;
        Object objD4 = interfaceC2425m.D();
        if (z14 || objD4 == InterfaceC2425m.f22370a.a()) {
            objD4 = new k(z13, interfaceC5082a2);
            interfaceC2425m.u(objD4);
        }
        androidx.compose.ui.e eVarThen = androidx.compose.ui.graphics.f.a(aVar3, (Function1) objD4).then(new EnterExitTransitionElement(o0Var, aVar2, aVarB, aVar, hVarG, jVarJ, interfaceC5082a2, qVarE));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return eVarThen;
    }

    public static final androidx.compose.animation.h h(InterfaceC6878G interfaceC6878G, l0.e eVar, boolean z10, Function1 function1) {
        return new androidx.compose.animation.i(new C6779B(null, null, new v.h(eVar, function1, interfaceC6878G, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.h i(InterfaceC6878G interfaceC6878G, l0.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5025r.b(I0.d(C5025r.f48570b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = l0.e.f52304a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = l.f25661a;
        }
        return h(interfaceC6878G, eVar, z10, function1);
    }

    public static final androidx.compose.animation.h j(InterfaceC6878G interfaceC6878G, e.c cVar, boolean z10, Function1 function1) {
        return h(interfaceC6878G, F(cVar), z10, new n(function1));
    }

    public static /* synthetic */ androidx.compose.animation.h k(InterfaceC6878G interfaceC6878G, e.c cVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5025r.b(I0.d(C5025r.f48570b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = l0.e.f52304a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = m.f25662a;
        }
        return j(interfaceC6878G, cVar, z10, function1);
    }

    public static final androidx.compose.animation.h l(InterfaceC6878G interfaceC6878G, float f10) {
        return new androidx.compose.animation.i(new C6779B(new v.n(f10, interfaceC6878G), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.h m(InterfaceC6878G interfaceC6878G, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return l(interfaceC6878G, f10);
    }

    public static final androidx.compose.animation.j n(InterfaceC6878G interfaceC6878G, float f10) {
        return new androidx.compose.animation.k(new C6779B(new v.n(f10, interfaceC6878G), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ androidx.compose.animation.j o(InterfaceC6878G interfaceC6878G, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(interfaceC6878G, f10);
    }

    public static final androidx.compose.animation.h p(InterfaceC6878G interfaceC6878G, float f10, long j10) {
        return new androidx.compose.animation.i(new C6779B(null, null, null, new v.u(f10, j10, interfaceC6878G, null), false, null, 55, null));
    }

    public static /* synthetic */ androidx.compose.animation.h q(InterfaceC6878G interfaceC6878G, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.j.f26818b.a();
        }
        return p(interfaceC6878G, f10, j10);
    }

    public static final androidx.compose.animation.j r(InterfaceC6878G interfaceC6878G, l0.e eVar, boolean z10, Function1 function1) {
        return new androidx.compose.animation.k(new C6779B(null, null, new v.h(eVar, function1, interfaceC6878G, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ androidx.compose.animation.j s(InterfaceC6878G interfaceC6878G, l0.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5025r.b(I0.d(C5025r.f48570b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = l0.e.f52304a.c();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = o.f25664a;
        }
        return r(interfaceC6878G, eVar, z10, function1);
    }

    public static final androidx.compose.animation.j t(InterfaceC6878G interfaceC6878G, e.c cVar, boolean z10, Function1 function1) {
        return r(interfaceC6878G, F(cVar), z10, new q(function1));
    }

    public static /* synthetic */ androidx.compose.animation.j u(InterfaceC6878G interfaceC6878G, e.c cVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5025r.b(I0.d(C5025r.f48570b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = l0.e.f52304a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = p.f25665a;
        }
        return t(interfaceC6878G, cVar, z10, function1);
    }

    public static final androidx.compose.animation.h v(InterfaceC6878G interfaceC6878G, Function1 function1) {
        return new androidx.compose.animation.i(new C6779B(null, new v.x(function1, interfaceC6878G), null, null, false, null, 61, null));
    }

    public static final androidx.compose.animation.h w(InterfaceC6878G interfaceC6878G, Function1 function1) {
        return v(interfaceC6878G, new s(function1));
    }

    public static /* synthetic */ androidx.compose.animation.h x(InterfaceC6878G interfaceC6878G, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5021n.c(I0.c(C5021n.f48560b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = r.f25667a;
        }
        return w(interfaceC6878G, function1);
    }

    public static final androidx.compose.animation.h y(InterfaceC6878G interfaceC6878G, Function1 function1) {
        return v(interfaceC6878G, new u(function1));
    }

    public static /* synthetic */ androidx.compose.animation.h z(InterfaceC6878G interfaceC6878G, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC6878G = AbstractC6906j.h(0.0f, 400.0f, C5021n.c(I0.c(C5021n.f48560b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = t.f25669a;
        }
        return y(interfaceC6878G, function1);
    }
}
