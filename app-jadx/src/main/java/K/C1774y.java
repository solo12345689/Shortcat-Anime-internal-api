package K;

import I0.InterfaceC1690p;
import U0.C2197e;
import U0.W0;
import U0.Y0;
import Ud.AbstractC2279u;
import Y.C0;
import Y.InterfaceC2400d1;
import Y.b2;
import Y0.AbstractC2485u;
import a1.C2527U;
import a1.C2544l;
import a1.C2551s;
import androidx.compose.ui.platform.InterfaceC2724o1;
import i1.C5015h;
import i1.InterfaceC5011d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import q0.InterfaceC6062h;
import s0.C6385r0;
import s0.InterfaceC6368k1;

/* JADX INFO: renamed from: K.y */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1774y {

    /* JADX INFO: renamed from: a */
    private H f10358a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2400d1 f10359b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC2724o1 f10360c;

    /* JADX INFO: renamed from: d */
    private final C2544l f10361d = new C2544l();

    /* JADX INFO: renamed from: e */
    private a1.c0 f10362e;

    /* JADX INFO: renamed from: f */
    private final C0 f10363f;

    /* JADX INFO: renamed from: g */
    private final C0 f10364g;

    /* JADX INFO: renamed from: h */
    private InterfaceC1690p f10365h;

    /* JADX INFO: renamed from: i */
    private final C0 f10366i;

    /* JADX INFO: renamed from: j */
    private C2197e f10367j;

    /* JADX INFO: renamed from: k */
    private final C0 f10368k;

    /* JADX INFO: renamed from: l */
    private final C0 f10369l;

    /* JADX INFO: renamed from: m */
    private final C0 f10370m;

    /* JADX INFO: renamed from: n */
    private final C0 f10371n;

    /* JADX INFO: renamed from: o */
    private final C0 f10372o;

    /* JADX INFO: renamed from: p */
    private boolean f10373p;

    /* JADX INFO: renamed from: q */
    private final C0 f10374q;

    /* JADX INFO: renamed from: r */
    private final C1770u f10375r;

    /* JADX INFO: renamed from: s */
    private Function1 f10376s;

    /* JADX INFO: renamed from: t */
    private final Function1 f10377t;

    /* JADX INFO: renamed from: u */
    private final Function1 f10378u;

    /* JADX INFO: renamed from: v */
    private final InterfaceC6368k1 f10379v;

    /* JADX INFO: renamed from: w */
    private long f10380w;

    /* JADX INFO: renamed from: x */
    private final C0 f10381x;

    /* JADX INFO: renamed from: y */
    private final C0 f10382y;

    /* JADX INFO: renamed from: K.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        public final void a(int i10) {
            C1774y.this.f10375r.d(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C2551s) obj).p());
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: renamed from: K.y$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(C2527U c2527u) {
            String strL = c2527u.l();
            C2197e c2197eW = C1774y.this.w();
            if (!AbstractC5504s.c(strL, c2197eW != null ? c2197eW.j() : null)) {
                C1774y.this.B(EnumC1763m.None);
            }
            C1774y c1774y = C1774y.this;
            W0.a aVar = W0.f18785b;
            c1774y.I(aVar.a());
            C1774y.this.A(aVar.a());
            C1774y.this.f10376s.invoke(c2527u);
            C1774y.this.o().invalidate();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2527U) obj);
            return Td.L.f17438a;
        }
    }

    public C1774y(H h10, InterfaceC2400d1 interfaceC2400d1, InterfaceC2724o1 interfaceC2724o1) {
        this.f10358a = h10;
        this.f10359b = interfaceC2400d1;
        this.f10360c = interfaceC2724o1;
        Boolean bool = Boolean.FALSE;
        this.f10363f = b2.e(bool, null, 2, null);
        this.f10364g = b2.e(C5015h.h(C5015h.n(0)), null, 2, null);
        this.f10366i = b2.e(null, null, 2, null);
        this.f10368k = b2.e(EnumC1763m.None, null, 2, null);
        this.f10369l = b2.e(bool, null, 2, null);
        this.f10370m = b2.e(bool, null, 2, null);
        this.f10371n = b2.e(bool, null, 2, null);
        this.f10372o = b2.e(bool, null, 2, null);
        this.f10373p = true;
        this.f10374q = b2.e(Boolean.TRUE, null, 2, null);
        this.f10375r = new C1770u(interfaceC2724o1);
        this.f10376s = c.f10385a;
        this.f10377t = new b();
        this.f10378u = new a();
        this.f10379v = s0.Q.a();
        this.f10380w = C6385r0.f58985b.j();
        W0.a aVar = W0.f18785b;
        this.f10381x = b2.e(W0.b(aVar.a()), null, 2, null);
        this.f10382y = b2.e(W0.b(aVar.a()), null, 2, null);
    }

    public final void A(long j10) {
        this.f10382y.setValue(W0.b(j10));
    }

    public final void B(EnumC1763m enumC1763m) {
        this.f10368k.setValue(enumC1763m);
    }

    public final void C(boolean z10) {
        this.f10363f.setValue(Boolean.valueOf(z10));
    }

    public final void D(boolean z10) {
        this.f10374q.setValue(Boolean.valueOf(z10));
    }

    public final void E(a1.c0 c0Var) {
        this.f10362e = c0Var;
    }

    public final void F(InterfaceC1690p interfaceC1690p) {
        this.f10365h = interfaceC1690p;
    }

    public final void G(Z z10) {
        this.f10366i.setValue(z10);
        this.f10373p = false;
    }

    public final void H(float f10) {
        this.f10364g.setValue(C5015h.h(f10));
    }

    public final void I(long j10) {
        this.f10381x.setValue(W0.b(j10));
    }

    public final void J(boolean z10) {
        this.f10372o.setValue(Boolean.valueOf(z10));
    }

    public final void K(boolean z10) {
        this.f10369l.setValue(Boolean.valueOf(z10));
    }

    public final void L(boolean z10) {
        this.f10371n.setValue(Boolean.valueOf(z10));
    }

    public final void M(boolean z10) {
        this.f10370m.setValue(Boolean.valueOf(z10));
    }

    public final void N(C2197e c2197e, C2197e c2197e2, Y0 y02, boolean z10, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar, Function1 function1, C1772w c1772w, InterfaceC6062h interfaceC6062h, long j10) {
        this.f10376s = function1;
        this.f10380w = j10;
        C1770u c1770u = this.f10375r;
        c1770u.f(c1772w);
        c1770u.e(interfaceC6062h);
        this.f10367j = c2197e;
        H hC = I.c(this.f10358a, c2197e2, y02, interfaceC5011d, bVar, z10, 0, 0, 0, AbstractC2279u.m(), 448, null);
        if (this.f10358a != hC) {
            this.f10373p = true;
        }
        this.f10358a = hC;
    }

    public final long c() {
        return ((W0) this.f10382y.getValue()).r();
    }

    public final EnumC1763m d() {
        return (EnumC1763m) this.f10368k.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.f10363f.getValue()).booleanValue();
    }

    public final InterfaceC6368k1 f() {
        return this.f10379v;
    }

    public final a1.c0 g() {
        return this.f10362e;
    }

    public final InterfaceC2724o1 h() {
        return this.f10360c;
    }

    public final InterfaceC1690p i() {
        InterfaceC1690p interfaceC1690p = this.f10365h;
        if (interfaceC1690p == null || !interfaceC1690p.b()) {
            return null;
        }
        return interfaceC1690p;
    }

    public final Z j() {
        return (Z) this.f10366i.getValue();
    }

    public final float k() {
        return ((C5015h) this.f10364g.getValue()).t();
    }

    public final Function1 l() {
        return this.f10378u;
    }

    public final Function1 m() {
        return this.f10377t;
    }

    public final C2544l n() {
        return this.f10361d;
    }

    public final InterfaceC2400d1 o() {
        return this.f10359b;
    }

    public final long p() {
        return this.f10380w;
    }

    public final long q() {
        return ((W0) this.f10381x.getValue()).r();
    }

    public final boolean r() {
        return ((Boolean) this.f10372o.getValue()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) this.f10369l.getValue()).booleanValue();
    }

    public final boolean t() {
        return ((Boolean) this.f10371n.getValue()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) this.f10370m.getValue()).booleanValue();
    }

    public final H v() {
        return this.f10358a;
    }

    public final C2197e w() {
        return this.f10367j;
    }

    public final boolean x() {
        return (W0.h(q()) && W0.h(c())) ? false : true;
    }

    public final boolean y() {
        return ((Boolean) this.f10374q.getValue()).booleanValue();
    }

    public final boolean z() {
        return this.f10373p;
    }

    /* JADX INFO: renamed from: K.y$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final c f10385a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C2527U) obj);
            return Td.L.f17438a;
        }

        public final void a(C2527U c2527u) {
        }
    }
}
