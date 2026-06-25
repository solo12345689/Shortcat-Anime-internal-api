package U2;

import U2.J;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class A implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final J f18878a;

    public A(J j10) {
        this.f18878a = j10;
    }

    @Override // U2.J
    public J.a g(long j10) {
        return this.f18878a.g(j10);
    }

    @Override // U2.J
    public boolean k() {
        return this.f18878a.k();
    }

    @Override // U2.J
    public long n() {
        return this.f18878a.n();
    }
}
