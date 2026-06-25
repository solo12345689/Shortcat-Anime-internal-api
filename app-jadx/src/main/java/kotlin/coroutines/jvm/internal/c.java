package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Zd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f52245a = new c();

    private c() {
    }

    @Override // Zd.e
    public Zd.i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // Zd.e
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
