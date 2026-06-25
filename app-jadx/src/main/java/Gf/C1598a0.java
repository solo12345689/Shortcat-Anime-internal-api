package Gf;

/* JADX INFO: renamed from: Gf.a0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1598a0 extends Exception {

    /* JADX INFO: renamed from: a */
    private final Throwable f7547a;

    public C1598a0(Throwable th2, K k10, Zd.i iVar) {
        super("Coroutine dispatcher " + k10 + " threw an exception, context = " + iVar, th2);
        this.f7547a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f7547a;
    }
}
