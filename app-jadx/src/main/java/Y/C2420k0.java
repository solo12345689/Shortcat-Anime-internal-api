package Y;

/* JADX INFO: renamed from: Y.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2420k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2406f1 f22353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f22355c;

    public C2420k0(C2406f1 c2406f1, int i10, Object obj) {
        this.f22353a = c2406f1;
        this.f22354b = i10;
        this.f22355c = obj;
    }

    public final Object a() {
        return this.f22355c;
    }

    public final int b() {
        return this.f22354b;
    }

    public final C2406f1 c() {
        return this.f22353a;
    }

    public final boolean d() {
        return this.f22353a.x(this.f22355c);
    }

    public final void e(Object obj) {
        this.f22355c = obj;
    }

    public final void f(int i10) {
        this.f22354b = i10;
    }
}
