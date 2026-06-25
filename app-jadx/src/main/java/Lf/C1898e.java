package Lf;

/* JADX INFO: renamed from: Lf.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1898e implements Gf.O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zd.i f11567a;

    public C1898e(Zd.i iVar) {
        this.f11567a = iVar;
    }

    @Override // Gf.O
    public Zd.i getCoroutineContext() {
        return this.f11567a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
