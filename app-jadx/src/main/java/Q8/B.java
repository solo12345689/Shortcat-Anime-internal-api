package Q8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f14392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E f14393b;

    B(E e10, int i10) {
        this.f14393b = e10;
        this.f14392a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14393b.l(this.f14392a);
    }
}
