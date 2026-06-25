package Vh;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class d extends ai.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ai.d[] f20392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20393b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20394c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20395d = false;

    public d(ai.d... dVarArr) {
        this.f20392a = dVarArr;
    }

    @Override // ai.f
    public ai.f a(int i10) {
        this.f20394c = i10;
        return this;
    }

    @Override // ai.f
    public ai.f b(int i10) {
        this.f20393b = i10;
        return this;
    }

    @Override // ai.f
    public ai.f e() {
        this.f20395d = true;
        return this;
    }

    public ai.d[] f() {
        return this.f20392a;
    }

    public int g() {
        return this.f20394c;
    }

    public int h() {
        return this.f20393b;
    }

    public boolean i() {
        return this.f20395d;
    }
}
