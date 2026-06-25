package B5;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f1568a;

    public static synchronized e b() {
        try {
            if (f1568a == null) {
                f1568a = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1568a;
    }

    @Override // B5.d
    public void a(c cVar) {
    }
}
