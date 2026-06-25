package i0;

import Td.C2160k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i0.Z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4981Z extends AbstractC4993l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AbstractC4993l f48464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f48465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f48466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Function1 f48467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Function1 f48468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f48469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC4993l f48470m;

    public C4981Z(AbstractC4993l abstractC4993l, Function1 function1, boolean z10, boolean z11) {
        Function1 function1G;
        super(AbstractC5003v.f48527b, C4997p.f48509e.a(), null);
        this.f48464g = abstractC4993l;
        this.f48465h = z10;
        this.f48466i = z11;
        this.f48467j = AbstractC5003v.P(function1, (abstractC4993l == null || (function1G = abstractC4993l.g()) == null) ? AbstractC5003v.f48536k.g() : function1G, z10);
        this.f48469l = g0.w.a();
        this.f48470m = this;
    }

    private final AbstractC4993l A() {
        AbstractC4993l abstractC4993l = this.f48464g;
        return abstractC4993l == null ? AbstractC5003v.f48536k : abstractC4993l;
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Function1 g() {
        return this.f48467j;
    }

    public final long C() {
        return this.f48469l;
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Void m(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.AbstractC4993l
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public Void n(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    public void F(Function1 function1) {
        this.f48467j = function1;
    }

    @Override // i0.AbstractC4993l
    public void d() {
        AbstractC4993l abstractC4993l;
        t(true);
        if (!this.f48466i || (abstractC4993l = this.f48464g) == null) {
            return;
        }
        abstractC4993l.d();
    }

    @Override // i0.AbstractC4993l
    public C4997p f() {
        return A().f();
    }

    @Override // i0.AbstractC4993l
    public boolean h() {
        return A().h();
    }

    @Override // i0.AbstractC4993l
    public long i() {
        return A().i();
    }

    @Override // i0.AbstractC4993l
    public Function1 k() {
        return this.f48468k;
    }

    @Override // i0.AbstractC4993l
    public void o() {
        A().o();
    }

    @Override // i0.AbstractC4993l
    public void p(InterfaceC4976U interfaceC4976U) {
        A().p(interfaceC4976U);
    }

    @Override // i0.AbstractC4993l
    public AbstractC4993l x(Function1 function1) {
        Function1 function1Q = AbstractC5003v.Q(function1, g(), false, 4, null);
        return !this.f48465h ? AbstractC5003v.I(A().x(null), function1Q, true) : A().x(function1Q);
    }
}
