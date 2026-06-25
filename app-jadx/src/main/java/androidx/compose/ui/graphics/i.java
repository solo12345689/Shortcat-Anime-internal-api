package androidx.compose.ui.graphics;

import I0.A;
import I0.C;
import K0.A0;
import K0.AbstractC1785e0;
import K0.AbstractC1789g0;
import K0.AbstractC1796k;
import K0.E;
import Td.L;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.layout.s;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;
import s0.E1;
import s0.u1;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class i extends e.c implements E, A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f26794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f26795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f26796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f26797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f26798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f26799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f26800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f26801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f26802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f26803j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f26804k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private E1 f26805l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26806m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private u1 f26807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f26808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f26809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f26812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f26813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Function1 f26814u;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((g) obj);
            return L.f17438a;
        }

        public final void invoke(g gVar) {
            gVar.l(i.this.u());
            gVar.y(i.this.H());
            gVar.e(i.this.F1());
            gVar.F(i.this.D());
            gVar.g(i.this.C());
            gVar.v(i.this.M1());
            gVar.s(i.this.E());
            gVar.t(i.this.h());
            gVar.w(i.this.i());
            gVar.r(i.this.m());
            gVar.t0(i.this.r0());
            gVar.s1(i.this.N1());
            gVar.n(i.this.I1());
            gVar.G(i.this.L1());
            gVar.k(i.this.G1());
            gVar.o(i.this.O1());
            gVar.X(i.this.K1());
            gVar.c(i.this.H1());
            gVar.d(i.this.J1());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f26816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f26817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, i iVar) {
            super(1);
            this.f26816a = sVar;
            this.f26817b = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((s.a) obj);
            return L.f17438a;
        }

        public final void invoke(s.a aVar) {
            s.a.v0(aVar, this.f26816a, 0, 0, 0.0f, this.f26817b.f26814u, 4, null);
        }
    }

    public /* synthetic */ i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10, int i11, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, e12, z10, u1Var, j11, j12, i10, i11, dVar);
    }

    public final float C() {
        return this.f26798e;
    }

    public final float D() {
        return this.f26797d;
    }

    public final float E() {
        return this.f26800g;
    }

    public final void F(float f10) {
        this.f26797d = f10;
    }

    public final float F1() {
        return this.f26796c;
    }

    public final void G(u1 u1Var) {
        this.f26807n = u1Var;
    }

    public final long G1() {
        return this.f26808o;
    }

    public final float H() {
        return this.f26795b;
    }

    public final int H1() {
        return this.f26811r;
    }

    public final boolean I1() {
        return this.f26806m;
    }

    public final d J1() {
        return this.f26812s;
    }

    public final int K1() {
        return this.f26810q;
    }

    public final u1 L1() {
        return this.f26807n;
    }

    public final float M1() {
        return this.f26799f;
    }

    public final E1 N1() {
        return this.f26805l;
    }

    public final long O1() {
        return this.f26809p;
    }

    public final void P1() {
        AbstractC1785e0 abstractC1785e0O2 = AbstractC1796k.i(this, AbstractC1789g0.a(2)).O2();
        if (abstractC1785e0O2 != null) {
            abstractC1785e0O2.F3(this.f26814u, true);
        }
    }

    public final void X(int i10) {
        this.f26810q = i10;
    }

    public final void c(int i10) {
        this.f26811r = i10;
    }

    public final void d(d dVar) {
        this.f26812s = dVar;
    }

    public final void e(float f10) {
        this.f26796c = f10;
    }

    public final void g(float f10) {
        this.f26798e = f10;
    }

    @Override // androidx.compose.ui.e.c
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final float h() {
        return this.f26801h;
    }

    public final float i() {
        return this.f26802i;
    }

    public final void k(long j10) {
        this.f26808o = j10;
    }

    public final void l(float f10) {
        this.f26794a = f10;
    }

    public final float m() {
        return this.f26803j;
    }

    @Override // K0.E
    /* JADX INFO: renamed from: measure-3p2s80s */
    public C mo5measure3p2s80s(l lVar, A a10, long j10) {
        s sVarV0 = a10.v0(j10);
        return l.u0(lVar, sVarV0.W0(), sVarV0.P0(), null, new b(sVarV0, this), 4, null);
    }

    public final void n(boolean z10) {
        this.f26806m = z10;
    }

    public final void o(long j10) {
        this.f26809p = j10;
    }

    public final void r(float f10) {
        this.f26803j = f10;
    }

    public final long r0() {
        return this.f26804k;
    }

    public final void s(float f10) {
        this.f26800g = f10;
    }

    public final void s1(E1 e12) {
        this.f26805l = e12;
    }

    public final void t(float f10) {
        this.f26801h = f10;
    }

    public final void t0(long j10) {
        this.f26804k = j10;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.f26794a + ", scaleY=" + this.f26795b + ", alpha = " + this.f26796c + ", translationX=" + this.f26797d + ", translationY=" + this.f26798e + ", shadowElevation=" + this.f26799f + ", rotationX=" + this.f26800g + ", rotationY=" + this.f26801h + ", rotationZ=" + this.f26802i + ", cameraDistance=" + this.f26803j + ", transformOrigin=" + ((Object) j.i(this.f26804k)) + ", shape=" + this.f26805l + ", clip=" + this.f26806m + ", renderEffect=" + this.f26807n + ", ambientShadowColor=" + ((Object) C6385r0.z(this.f26808o)) + ", spotShadowColor=" + ((Object) C6385r0.z(this.f26809p)) + ", compositingStrategy=" + ((Object) e.i(this.f26810q)) + ", blendMode=" + ((Object) c.I(this.f26811r)) + ", colorFilter=" + this.f26812s + ')';
    }

    public final float u() {
        return this.f26794a;
    }

    public final void v(float f10) {
        this.f26799f = f10;
    }

    public final void w(float f10) {
        this.f26802i = f10;
    }

    public final void y(float f10) {
        this.f26795b = f10;
    }

    @Override // K0.A0
    public boolean z() {
        return this.f26813t;
    }

    private i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, E1 e12, boolean z10, u1 u1Var, long j11, long j12, int i10, int i11, d dVar) {
        this.f26794a = f10;
        this.f26795b = f11;
        this.f26796c = f12;
        this.f26797d = f13;
        this.f26798e = f14;
        this.f26799f = f15;
        this.f26800g = f16;
        this.f26801h = f17;
        this.f26802i = f18;
        this.f26803j = f19;
        this.f26804k = j10;
        this.f26805l = e12;
        this.f26806m = z10;
        this.f26807n = u1Var;
        this.f26808o = j11;
        this.f26809p = j12;
        this.f26810q = i10;
        this.f26811r = i11;
        this.f26812s = dVar;
        this.f26814u = new a();
    }

    @Override // K0.A0
    public void Y(R0.C c10) {
    }
}
