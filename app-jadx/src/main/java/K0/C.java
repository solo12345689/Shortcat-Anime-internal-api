package K0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f10401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f10402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f10403g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f10397a = 1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10398b = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f10404h = 8.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f10405i = androidx.compose.ui.graphics.j.f26818b.a();

    public final void a(C c10) {
        this.f10397a = c10.f10397a;
        this.f10398b = c10.f10398b;
        this.f10399c = c10.f10399c;
        this.f10400d = c10.f10400d;
        this.f10401e = c10.f10401e;
        this.f10402f = c10.f10402f;
        this.f10403g = c10.f10403g;
        this.f10404h = c10.f10404h;
        this.f10405i = c10.f10405i;
    }

    public final void b(androidx.compose.ui.graphics.g gVar) {
        this.f10397a = gVar.u();
        this.f10398b = gVar.H();
        this.f10399c = gVar.D();
        this.f10400d = gVar.C();
        this.f10401e = gVar.E();
        this.f10402f = gVar.h();
        this.f10403g = gVar.i();
        this.f10404h = gVar.m();
        this.f10405i = gVar.r0();
    }

    public final boolean c(C c10) {
        return this.f10397a == c10.f10397a && this.f10398b == c10.f10398b && this.f10399c == c10.f10399c && this.f10400d == c10.f10400d && this.f10401e == c10.f10401e && this.f10402f == c10.f10402f && this.f10403g == c10.f10403g && this.f10404h == c10.f10404h && androidx.compose.ui.graphics.j.e(this.f10405i, c10.f10405i);
    }
}
