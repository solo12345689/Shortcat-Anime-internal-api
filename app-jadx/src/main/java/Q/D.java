package Q;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class D implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f13992f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2051k f13996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2050j f13997e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public D(boolean z10, int i10, int i11, C2051k c2051k, C2050j c2050j) {
        this.f13993a = z10;
        this.f13994b = i10;
        this.f13995c = i11;
        this.f13996d = c2051k;
        this.f13997e = c2050j;
    }

    @Override // Q.w
    public boolean a() {
        return this.f13993a;
    }

    @Override // Q.w
    public C2050j b() {
        return this.f13997e;
    }

    @Override // Q.w
    public C2050j c() {
        return this.f13997e;
    }

    @Override // Q.w
    public int d() {
        return this.f13995c;
    }

    @Override // Q.w
    public EnumC2045e e() {
        return k() < d() ? EnumC2045e.NOT_CROSSED : k() > d() ? EnumC2045e.CROSSED : this.f13997e.d();
    }

    @Override // Q.w
    public boolean g(w wVar) {
        if (h() == null || wVar == null || !(wVar instanceof D)) {
            return true;
        }
        D d10 = (D) wVar;
        return (k() == d10.k() && d() == d10.d() && a() == d10.a() && !this.f13997e.m(d10.f13997e)) ? false : true;
    }

    @Override // Q.w
    public int getSize() {
        return 1;
    }

    @Override // Q.w
    public C2051k h() {
        return this.f13996d;
    }

    @Override // Q.w
    public C2050j i() {
        return this.f13997e;
    }

    @Override // Q.w
    public C2050j j() {
        return this.f13997e;
    }

    @Override // Q.w
    public int k() {
        return this.f13994b;
    }

    public String toString() {
        return "SingleSelectionLayout(isStartHandle=" + a() + ", crossed=" + e() + ", info=\n\t" + this.f13997e + ')';
    }

    @Override // Q.w
    public void f(Function1 function1) {
    }
}
