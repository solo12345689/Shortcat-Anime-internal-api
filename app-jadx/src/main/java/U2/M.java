package U2;

import U2.J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18933b;

    public M(long j10) {
        this(j10, 0L);
    }

    @Override // U2.J
    public J.a g(long j10) {
        return new J.a(new K(j10, this.f18933b));
    }

    @Override // U2.J
    public boolean k() {
        return true;
    }

    @Override // U2.J
    public long n() {
        return this.f18932a;
    }

    public M(long j10, long j11) {
        this.f18932a = j10;
        this.f18933b = j11;
    }
}
