package qa;

/* JADX INFO: renamed from: qa.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6166b implements InterfaceC6165a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C6166b f57907a;

    private C6166b() {
    }

    public static C6166b b() {
        if (f57907a == null) {
            f57907a = new C6166b();
        }
        return f57907a;
    }

    @Override // qa.InterfaceC6165a
    public long a() {
        return System.currentTimeMillis();
    }
}
