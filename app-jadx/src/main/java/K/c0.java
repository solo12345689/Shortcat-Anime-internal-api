package K;

import E0.AbstractC1314y;
import E0.InterfaceC1313x;
import U0.AbstractC2207j;
import U0.C2197e;
import U0.I0;
import U0.S0;
import U0.T0;
import U0.U0;
import Y.AbstractC2393b0;
import Y.AbstractC2409g1;
import Y.AbstractC2454w;
import Y.B1;
import Y.C0;
import Y.InterfaceC2425m;
import Y.U1;
import Y.b2;
import Y.h2;
import androidx.compose.ui.platform.AbstractC2739w0;
import androidx.compose.ui.platform.v1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import i0.C4961E;
import i1.AbstractC5024q;
import i1.C5021n;
import i1.C5023p;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import p0.AbstractC5912g;
import r0.AbstractC6225g;
import r0.C6224f;
import r0.C6226h;
import s0.AbstractC6362i1;
import s0.E1;
import s0.InterfaceC6374m1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a */
    private final C2197e f9944a;

    /* JADX INFO: renamed from: b */
    private final C0 f9945b = b2.e(null, null, 2, null);

    /* JADX INFO: renamed from: c */
    private C2197e f9946c;

    /* JADX INFO: renamed from: d */
    private final C4961E f9947d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2197e.d f9949b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ v1 f9950c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2197e.d dVar, v1 v1Var) {
            super(0);
            this.f9949b = dVar;
            this.f9950c = v1Var;
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            m12invoke();
            return Td.L.f17438a;
        }

        /* JADX INFO: renamed from: invoke */
        public final void m12invoke() {
            c0.this.r((AbstractC2207j) this.f9949b.g(), this.f9950c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2197e.d f9952b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ h2 f9953c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ h2 f9954d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ h2 f9955e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2197e.d dVar, h2 h2Var, h2 h2Var2, h2 h2Var3) {
            super(1);
            this.f9952b = dVar;
            this.f9953c = h2Var;
            this.f9954d = h2Var2;
            this.f9955e = h2Var3;
        }

        public final void a(F f10) {
            U0 u0B;
            U0 u0B2;
            U0 u0B3;
            c0 c0Var = c0.this;
            U0 u0B4 = ((AbstractC2207j) this.f9952b.g()).b();
            I0 i0C = null;
            I0 i0S = c0Var.s(c0Var.s(u0B4 != null ? u0B4.d() : null, (!c0.c(this.f9953c) || (u0B3 = ((AbstractC2207j) this.f9952b.g()).b()) == null) ? null : u0B3.a()), (!c0.e(this.f9954d) || (u0B2 = ((AbstractC2207j) this.f9952b.g()).b()) == null) ? null : u0B2.b());
            if (c0.d(this.f9955e) && (u0B = ((AbstractC2207j) this.f9952b.g()).b()) != null) {
                i0C = u0B.c();
            }
            I0 i0S2 = c0Var.s(i0S, i0C);
            if (i0S2 != null) {
                C2197e.d dVar = this.f9952b;
                f10.a(i0S2, dVar.h(), dVar.f());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((F) obj);
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f9957b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f9957b = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            c0.this.b(interfaceC2425m, AbstractC2409g1.a(this.f9957b | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f9959b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements Y.X {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ c0 f9960a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ Function1 f9961b;

            public a(c0 c0Var, Function1 function1) {
                this.f9960a = c0Var;
                this.f9961b = function1;
            }

            @Override // Y.X
            public void dispose() {
                this.f9960a.f9947d.remove(this.f9961b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1 function1) {
            super(1);
            this.f9959b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Y.X invoke(Y.Y y10) {
            c0.this.f9947d.add(this.f9959b);
            return new a(c0.this, this.f9959b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends AbstractC5506u implements Function2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Object[] f9963b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function1 f9964c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f9965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object[] objArr, Function1 function1, int i10) {
            super(2);
            this.f9963b = objArr;
            this.f9964c = function1;
            this.f9965d = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
            return Td.L.f17438a;
        }

        public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
            c0 c0Var = c0.this;
            Object[] objArr = this.f9963b;
            c0Var.f(Arrays.copyOf(objArr, objArr.length), this.f9964c, interfaceC2425m, AbstractC2409g1.a(this.f9965d | 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements E1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6374m1 f9966a;

        f(InterfaceC6374m1 interfaceC6374m1) {
            this.f9966a = interfaceC6374m1;
        }

        @Override // s0.E1
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public AbstractC6362i1 mo6createOutlinePq9zytI(long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d) {
            return new AbstractC6362i1.a(this.f9966a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends AbstractC5506u implements InterfaceC5082a {
        g() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() {
            S0 s0L;
            C2197e c2197eP = c0.this.p();
            T0 t0Q = c0.this.q();
            return Boolean.valueOf(AbstractC5504s.c(c2197eP, (t0Q == null || (s0L = t0Q.l()) == null) ? null : s0L.j()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C5023p f9968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C5023p c5023p) {
            super(0);
            this.f9968a = c5023p;
        }

        public final long a() {
            return this.f9968a.i();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C5021n.c(a());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a */
        public static final i f9969a = new i();

        i() {
            super(0);
        }

        public final long a() {
            return C5021n.f48560b.b();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C5021n.c(a());
        }
    }

    public c0(C2197e c2197e) {
        I0 i0D;
        this.f9944a = c2197e;
        C2197e.b bVar = new C2197e.b(c2197e);
        List listD = c2197e.d(0, c2197e.length());
        int size = listD.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) listD.get(i10);
            U0 u0B = ((AbstractC2207j) dVar.g()).b();
            if (u0B != null && (i0D = u0B.d()) != null) {
                bVar.a(i0D, dVar.h(), dVar.f());
            }
        }
        this.f9946c = bVar.l();
        this.f9947d = U1.e();
    }

    public static final boolean c(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public static final boolean d(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public static final boolean e(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    public final void f(Object[] objArr, Function1 function1, InterfaceC2425m interfaceC2425m, int i10) {
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(-2083052099);
        int i11 = (i10 & 48) == 0 ? (interfaceC2425mG.F(function1) ? 32 : 16) | i10 : i10;
        if ((i10 & 384) == 0) {
            i11 |= interfaceC2425mG.F(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : 128;
        }
        interfaceC2425mG.H(-416717687, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= interfaceC2425mG.F(obj) ? 4 : 0;
        }
        interfaceC2425mG.S();
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if ((i11 & 147) == 146 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(-2083052099, i11, -1, "androidx.compose.foundation.text.TextLinkScope.StyleAnnotation (TextLinkScope.kt:237)");
            }
            kotlin.jvm.internal.T t10 = new kotlin.jvm.internal.T(2);
            t10.a(function1);
            t10.b(objArr);
            Object[] objArrD = t10.d(new Object[t10.c()]);
            boolean zF = ((i11 & 112) == 32) | interfaceC2425mG.F(this);
            Object objD = interfaceC2425mG.D();
            if (zF || objD == InterfaceC2425m.f22370a.a()) {
                objD = new d(function1);
                interfaceC2425mG.u(objD);
            }
            AbstractC2393b0.c(objArrD, (Function1) objD, interfaceC2425mG, 0);
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new e(objArr, function1, i10));
        }
    }

    public final void r(AbstractC2207j abstractC2207j, v1 v1Var) {
        if (abstractC2207j instanceof AbstractC2207j.b) {
            abstractC2207j.a();
            try {
                v1Var.a(((AbstractC2207j.b) abstractC2207j).c());
            } catch (IllegalArgumentException unused) {
            }
        } else if (abstractC2207j instanceof AbstractC2207j.a) {
            abstractC2207j.a();
        }
    }

    public final I0 s(I0 i02, I0 i03) {
        I0 i0X;
        return (i02 == null || (i0X = i02.x(i03)) == null) ? i03 : i0X;
    }

    private final InterfaceC6374m1 t(C2197e.d dVar) {
        InterfaceC6374m1 interfaceC6374m1Z = null;
        if (!((Boolean) o().invoke()).booleanValue()) {
            return null;
        }
        T0 t0Q = q();
        if (t0Q != null) {
            interfaceC6374m1Z = t0Q.z(dVar.h(), dVar.f());
            C6226h c6226hD = t0Q.d(dVar.h());
            interfaceC6374m1Z.l(C6224f.t(AbstractC6225g.a(t0Q.q(dVar.h()) == t0Q.q(dVar.f()) ? Math.min(t0Q.d(dVar.f() - 1).i(), c6226hD.i()) : 0.0f, c6226hD.l())));
        }
        return interfaceC6374m1Z;
    }

    private final E1 v(C2197e.d dVar) {
        InterfaceC6374m1 interfaceC6374m1T = t(dVar);
        if (interfaceC6374m1T != null) {
            return new f(interfaceC6374m1T);
        }
        return null;
    }

    private final androidx.compose.ui.e w(androidx.compose.ui.e eVar, final int i10, final int i11) {
        return eVar.then(new h0(new i0() { // from class: K.b0
            @Override // K.i0
            public final f0 a(g0 g0Var) {
                return c0.x(this.f9913a, i10, i11, g0Var);
            }
        }));
    }

    public static final f0 x(c0 c0Var, int i10, int i11, g0 g0Var) {
        T0 t0Q = c0Var.q();
        if (t0Q == null) {
            return g0Var.a(0, 0, i.f9969a);
        }
        C5023p c5023pB = AbstractC5024q.b(t0Q.z(i10, i11).getBounds());
        return g0Var.a(c5023pB.j(), c5023pB.e(), new h(c5023pB));
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    public final void b(InterfaceC2425m interfaceC2425m, int i10) {
        int i11;
        androidx.compose.ui.e eVarA;
        InterfaceC2425m interfaceC2425mG = interfaceC2425m.g(1154651354);
        int i12 = 2;
        if ((i10 & 6) == 0) {
            i11 = (interfaceC2425mG.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC2425mG.i()) {
            interfaceC2425mG.K();
        } else {
            if (AbstractC2454w.L()) {
                AbstractC2454w.U(1154651354, i11, -1, "androidx.compose.foundation.text.TextLinkScope.LinksComposables (TextLinkScope.kt:152)");
            }
            v1 v1Var = (v1) interfaceC2425mG.n(AbstractC2739w0.q());
            C2197e c2197e = this.f9946c;
            ?? r11 = 0;
            List listD = c2197e.d(0, c2197e.length());
            int size = listD.size();
            int i13 = 0;
            while (i13 < size) {
                C2197e.d dVar = (C2197e.d) listD.get(i13);
                E1 e1V = v(dVar);
                if (e1V == null || (eVarA = AbstractC5912g.a(androidx.compose.ui.e.f26613a, e1V)) == null) {
                    eVarA = androidx.compose.ui.e.f26613a;
                }
                Object objD = interfaceC2425mG.D();
                InterfaceC2425m.a aVar = InterfaceC2425m.f22370a;
                if (objD == aVar.a()) {
                    objD = B.l.a();
                    interfaceC2425mG.u(objD);
                }
                B.m mVar = (B.m) objD;
                androidx.compose.ui.e eVarB = AbstractC1314y.b(androidx.compose.foundation.h.b(w(eVarA, dVar.h(), dVar.f()), mVar, r11, i12, null), InterfaceC1313x.f4192a.b(), r11, i12, null);
                boolean zF = interfaceC2425mG.F(this) | interfaceC2425mG.U(dVar) | interfaceC2425mG.F(v1Var);
                Object objD2 = interfaceC2425mG.D();
                if (zF || objD2 == aVar.a()) {
                    objD2 = new a(dVar, v1Var);
                    interfaceC2425mG.u(objD2);
                }
                androidx.compose.foundation.layout.f.a(androidx.compose.foundation.d.f(eVarB, mVar, null, false, null, null, null, null, null, (InterfaceC5082a) objD2, 252, null), interfaceC2425mG, r11);
                h2 h2VarA = B.i.a(mVar, interfaceC2425mG, 6);
                h2 h2VarA2 = B.f.a(mVar, interfaceC2425mG, 6);
                h2 h2VarA3 = B.p.a(mVar, interfaceC2425mG, 6);
                Boolean boolValueOf = Boolean.valueOf(e(h2VarA));
                Boolean boolValueOf2 = Boolean.valueOf(c(h2VarA2));
                Boolean boolValueOf3 = Boolean.valueOf(d(h2VarA3));
                U0 u0B = ((AbstractC2207j) dVar.g()).b();
                I0 i0D = u0B != null ? u0B.d() : null;
                U0 u0B2 = ((AbstractC2207j) dVar.g()).b();
                I0 i0A = u0B2 != null ? u0B2.a() : null;
                U0 u0B3 = ((AbstractC2207j) dVar.g()).b();
                I0 i0B = u0B3 != null ? u0B3.b() : null;
                U0 u0B4 = ((AbstractC2207j) dVar.g()).b();
                Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, i0D, i0A, i0B, u0B4 != null ? u0B4.c() : null};
                boolean zF2 = interfaceC2425mG.F(this) | interfaceC2425mG.U(dVar) | interfaceC2425mG.U(h2VarA2) | interfaceC2425mG.U(h2VarA) | interfaceC2425mG.U(h2VarA3);
                Object objD3 = interfaceC2425mG.D();
                if (zF2 || objD3 == aVar.a()) {
                    Object bVar = new b(dVar, h2VarA2, h2VarA, h2VarA3);
                    interfaceC2425mG.u(bVar);
                    objD3 = bVar;
                }
                f(objArr, (Function1) objD3, interfaceC2425mG, (i11 << 6) & 896);
                i13++;
                i12 = 2;
                r11 = 0;
            }
            if (AbstractC2454w.L()) {
                AbstractC2454w.T();
            }
        }
        B1 b1K = interfaceC2425mG.k();
        if (b1K != null) {
            b1K.a(new c(i10));
        }
    }

    public final C2197e n() {
        C2197e c2197eL;
        if (this.f9947d.isEmpty()) {
            c2197eL = this.f9946c;
        } else {
            C2197e.b bVar = new C2197e.b(0, 1, null);
            bVar.e(this.f9944a);
            F f10 = new F(bVar);
            C4961E c4961e = this.f9947d;
            int size = c4961e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Function1) c4961e.get(i10)).invoke(f10);
            }
            c2197eL = bVar.l();
        }
        this.f9946c = c2197eL;
        return c2197eL;
    }

    public final InterfaceC5082a o() {
        return new g();
    }

    public final C2197e p() {
        return this.f9946c;
    }

    public final T0 q() {
        return (T0) this.f9945b.getValue();
    }

    public final void u(T0 t02) {
        this.f9945b.setValue(t02);
    }
}
