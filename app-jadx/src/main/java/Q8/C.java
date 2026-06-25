package Q8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ D f14394a;

    C(D d10) {
        this.f14394a = d10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E e10 = this.f14394a.f14395a;
        e10.f14397b.b(e10.f14397b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
