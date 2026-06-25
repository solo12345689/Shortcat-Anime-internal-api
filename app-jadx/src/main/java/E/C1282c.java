package E;

/* JADX INFO: renamed from: E.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1282c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3874a;

    private /* synthetic */ C1282c(long j10) {
        this.f3874a = j10;
    }

    public static final /* synthetic */ C1282c a(long j10) {
        return new C1282c(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C1282c) && j10 == ((C1282c) obj).g();
    }

    public static final int d(long j10) {
        return (int) j10;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f3874a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f3874a;
    }

    public int hashCode() {
        return e(this.f3874a);
    }

    public String toString() {
        return f(this.f3874a);
    }

    public static long b(long j10) {
        return j10;
    }
}
