package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.r, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5025r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48570b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48571c = c(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48572a;

    /* JADX INFO: renamed from: i1.r$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5025r.f48571c;
        }

        private a() {
        }
    }

    private /* synthetic */ C5025r(long j10) {
        this.f48572a = j10;
    }

    public static final /* synthetic */ C5025r b(long j10) {
        return new C5025r(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C5025r) && j10 == ((C5025r) obj).j();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int g(long j10) {
        return (int) (j10 >> 32);
    }

    public static int h(long j10) {
        return Long.hashCode(j10);
    }

    public static String i(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return d(this.f48572a, obj);
    }

    public int hashCode() {
        return h(this.f48572a);
    }

    public final /* synthetic */ long j() {
        return this.f48572a;
    }

    public String toString() {
        return i(this.f48572a);
    }

    public static long c(long j10) {
        return j10;
    }
}
