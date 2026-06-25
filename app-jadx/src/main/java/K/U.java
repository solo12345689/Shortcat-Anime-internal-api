package K;

import U0.T0;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.U1;
import Y.h2;
import a1.C2527U;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.V0;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5912g;
import r0.C6226h;
import x.EnumC6992L;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9855a;

        static {
            int[] iArr = new int[z.q.values().length];
            try {
                iArr[z.q.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.q.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9855a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f9856a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ B.m f9857b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9858c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(V v10, B.m mVar, boolean z10) {
            super(1);
            this.f9856a = v10;
            this.f9857b = mVar;
            this.f9858c = z10;
        }

        public final void a(V0 v02) {
            v02.d("textFieldScrollable");
            v02.b().c("scrollerPosition", this.f9856a);
            v02.b().c("interactionSource", this.f9857b);
            v02.b().c("enabled", Boolean.valueOf(this.f9858c));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((V0) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V f9859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ B.m f9861c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ V f9862a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V v10) {
                super(1);
                this.f9862a = v10;
            }

            public final Float a(float f10) {
                float fD = this.f9862a.d() + f10;
                if (fD > this.f9862a.c()) {
                    f10 = this.f9862a.c() - this.f9862a.d();
                } else if (fD < 0.0f) {
                    f10 = -this.f9862a.d();
                }
                V v10 = this.f9862a;
                v10.h(v10.d() + f10);
                return Float.valueOf(f10);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).floatValue());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements z.x {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ z.x f9863a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final h2 f9864b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final h2 f9865c;

            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends AbstractC5506u implements InterfaceC5082a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ V f9866a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(V v10) {
                    super(0);
                    this.f9866a = v10;
                }

                @Override // ie.InterfaceC5082a
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f9866a.d() > 0.0f);
                }
            }

            /* JADX INFO: renamed from: K.U$c$b$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class C0146b extends AbstractC5506u implements InterfaceC5082a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ V f9867a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0146b(V v10) {
                    super(0);
                    this.f9867a = v10;
                }

                @Override // ie.InterfaceC5082a
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f9867a.d() < this.f9867a.c());
                }
            }

            b(z.x xVar, V v10) {
                this.f9863a = xVar;
                this.f9864b = U1.d(new C0146b(v10));
                this.f9865c = U1.d(new a(v10));
            }

            @Override // z.x
            public boolean a() {
                return this.f9863a.a();
            }

            @Override // z.x
            public Object b(EnumC6992L enumC6992L, Function2 function2, Zd.e eVar) {
                return this.f9863a.b(enumC6992L, function2, eVar);
            }

            @Override // z.x
            public boolean c() {
                return ((Boolean) this.f9865c.getValue()).booleanValue();
            }

            @Override // z.x
            public boolean e() {
                return ((Boolean) this.f9864b.getValue()).booleanValue();
            }

            @Override // z.x
            public float f(float f10) {
                return this.f9863a.f(f10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(V v10, boolean z10, B.m mVar) {
            super(3);
            this.f9859a = v10;
            this.f9860b = z10;
            this.f9861c = mVar;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
            interfaceC2425m.V(805428266);
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(805428266, i10, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
            }
            boolean z10 = this.f9859a.f() == z.q.Vertical || !(interfaceC2425m.n(AbstractC2739w0.k()) == EnumC5027t.f48574b);
            boolean zU = interfaceC2425m.U(this.f9859a);
            V v10 = this.f9859a;
            Object objD = interfaceC2425m.D();
            if (zU || objD == InterfaceC2425m.f22370a.a()) {
                objD = new a(v10);
                interfaceC2425m.u(objD);
            }
            z.x xVarB = z.y.b((Function1) objD, interfaceC2425m, 0);
            boolean zU2 = interfaceC2425m.U(xVarB) | interfaceC2425m.U(this.f9859a);
            V v11 = this.f9859a;
            Object objD2 = interfaceC2425m.D();
            if (zU2 || objD2 == InterfaceC2425m.f22370a.a()) {
                objD2 = new b(xVarB, v11);
                interfaceC2425m.u(objD2);
            }
            androidx.compose.ui.e eVarI = androidx.compose.foundation.gestures.d.i(androidx.compose.ui.e.f26613a, (b) objD2, this.f9859a.f(), this.f9860b && this.f9859a.c() != 0.0f, z10, null, this.f9861c, 16, null);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
            interfaceC2425m.O();
            return eVarI;
        }

        @Override // ie.InterfaceC5096o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6226h b(InterfaceC5011d interfaceC5011d, int i10, a1.d0 d0Var, T0 t02, boolean z10, int i11) {
        C6226h c6226hA;
        if (t02 == null || (c6226hA = t02.e(d0Var.a().b(i10))) == null) {
            c6226hA = C6226h.f58334e.a();
        }
        C6226h c6226h = c6226hA;
        int iS0 = interfaceC5011d.s0(K.b());
        return C6226h.d(c6226h, z10 ? (i11 - c6226h.i()) - iS0 : c6226h.i(), 0.0f, z10 ? i11 - c6226h.i() : iS0 + c6226h.i(), 0.0f, 10, null);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, V v10, C2527U c2527u, a1.f0 f0Var, InterfaceC5082a interfaceC5082a) {
        androidx.compose.ui.e o0Var;
        z.q qVarF = v10.f();
        int iE = v10.e(c2527u.k());
        v10.i(c2527u.k());
        a1.d0 d0VarC = n0.c(f0Var, c2527u.i());
        int i10 = a.f9855a[qVarF.ordinal()];
        if (i10 == 1) {
            o0Var = new o0(v10, iE, d0VarC, interfaceC5082a);
        } else {
            if (i10 != 2) {
                throw new Td.r();
            }
            o0Var = new C1765o(v10, iE, d0VarC, interfaceC5082a);
        }
        return AbstractC5912g.b(eVar).then(o0Var);
    }

    public static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, V v10, B.m mVar, boolean z10) {
        return androidx.compose.ui.c.b(eVar, androidx.compose.ui.platform.T0.b() ? new b(v10, mVar, z10) : androidx.compose.ui.platform.T0.a(), new c(v10, z10, mVar));
    }
}
