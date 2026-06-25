package v5;

/* JADX INFO: renamed from: v5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C6849c implements InterfaceC6848b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static C6849c f61967a;

    private C6849c() {
    }

    public static synchronized C6849c b() {
        try {
            if (f61967a == null) {
                f61967a = new C6849c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f61967a;
    }

    @Override // v5.InterfaceC6848b
    public void a(InterfaceC6847a interfaceC6847a) {
    }
}
