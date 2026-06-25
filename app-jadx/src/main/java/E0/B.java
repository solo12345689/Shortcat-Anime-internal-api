package E0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4028a;

    private /* synthetic */ B(long j10) {
        this.f4028a = j10;
    }

    public static final /* synthetic */ B a(long j10) {
        return new B(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof B) && j10 == ((B) obj).g();
    }

    public static final boolean d(long j10, long j11) {
        return j10 == j11;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }

    public static String f(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f4028a, obj);
    }

    public final /* synthetic */ long g() {
        return this.f4028a;
    }

    public int hashCode() {
        return e(this.f4028a);
    }

    public String toString() {
        return f(this.f4028a);
    }

    public static long b(long j10) {
        return j10;
    }
}
