package Ib;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f9018a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9019b = "ExpoImage";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f9020c = "load new image";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9021d;

    private y() {
    }

    public final String a() {
        return f9020c;
    }

    public final int b() {
        int i10;
        synchronized (this) {
            i10 = f9021d;
            f9021d = i10 + 1;
        }
        return i10;
    }

    public final String c() {
        return f9019b;
    }
}
