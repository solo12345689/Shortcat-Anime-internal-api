package i0;

import Td.C2160k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i0.Y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4980Y extends C4985d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final C4985d f48458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f48459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f48460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Function1 f48461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Function1 f48462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f48463x;

    public C4980Y(C4985d c4985d, Function1 function1, Function1 function12, boolean z10, boolean z11) {
        Function1 function1K;
        Function1 function1G;
        super(AbstractC5003v.f48527b, C4997p.f48509e.a(), AbstractC5003v.P(function1, (c4985d == null || (function1G = c4985d.g()) == null) ? AbstractC5003v.f48536k.g() : function1G, z10), AbstractC5003v.S(function12, (c4985d == null || (function1K = c4985d.k()) == null) ? AbstractC5003v.f48536k.k() : function1K));
        this.f48458s = c4985d;
        this.f48459t = z10;
        this.f48460u = z11;
        this.f48461v = super.g();
        this.f48462w = super.k();
        this.f48463x = g0.w.a();
    }

    private final C4985d U() {
        C4985d c4985d = this.f48458s;
        return c4985d == null ? AbstractC5003v.f48536k : c4985d;
    }

    @Override // i0.C4985d
    public AbstractC4994m C() {
        return U().C();
    }

    @Override // i0.C4985d
    public t.Q E() {
        return U().E();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    /* JADX INFO: renamed from: H */
    public Function1 g() {
        return this.f48461v;
    }

    @Override // i0.C4985d
    public void Q(t.Q q10) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.C4985d
    public C4985d R(Function1 function1, Function1 function12) {
        Function1 function1Q = AbstractC5003v.Q(function1, g(), false, 4, null);
        Function1 function1S = AbstractC5003v.S(function12, k());
        return !this.f48459t ? new C4980Y(U().R(null, function1S), function1Q, function1S, false, true) : U().R(function1Q, function1S);
    }

    public final long V() {
        return this.f48463x;
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    public void Y(Function1 function1) {
        this.f48461v = function1;
    }

    public void Z(Function1 function1) {
        this.f48462w = function1;
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void d() {
        C4985d c4985d;
        t(true);
        if (!this.f48460u || (c4985d = this.f48458s) == null) {
            return;
        }
        c4985d.d();
    }

    @Override // i0.AbstractC4993l
    public C4997p f() {
        return U().f();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public boolean h() {
        return U().h();
    }

    @Override // i0.AbstractC4993l
    public long i() {
        return U().i();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public int j() {
        return U().j();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public Function1 k() {
        return this.f48462w;
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void o() {
        U().o();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void p(InterfaceC4976U interfaceC4976U) {
        U().p(interfaceC4976U);
    }

    @Override // i0.AbstractC4993l
    public void u(C4997p c4997p) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.AbstractC4993l
    public void v(long j10) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void w(int i10) {
        U().w(i10);
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public AbstractC4993l x(Function1 function1) {
        Function1 function1Q = AbstractC5003v.Q(function1, g(), false, 4, null);
        return !this.f48459t ? AbstractC5003v.I(U().x(null), function1Q, true) : U().x(function1Q);
    }
}
