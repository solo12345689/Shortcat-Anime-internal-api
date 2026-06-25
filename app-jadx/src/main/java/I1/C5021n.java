package i1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5021n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48560b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f48561c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f48562d = f(9223372034707292159L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48563a;

    /* JADX INFO: renamed from: i1.n$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5021n.f48562d;
        }

        public final long b() {
            return C5021n.f48561c;
        }

        private a() {
        }
    }

    private /* synthetic */ C5021n(long j10) {
        this.f48563a = j10;
    }

    public static final /* synthetic */ C5021n c(long j10) {
        return new C5021n(j10);
    }

    public static final int d(long j10) {
        return k(j10);
    }

    public static final int e(long j10) {
        return l(j10);
    }

    public static final long g(long j10, int i10, int i11) {
        return f((((long) i10) << 32) | (((long) i11) & 4294967295L));
    }

    public static /* synthetic */ long h(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = (int) (j10 >> 32);
        }
        if ((i12 & 2) != 0) {
            i11 = (int) (4294967295L & j10);
        }
        return g(j10, i10, i11);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof C5021n) && j10 == ((C5021n) obj).q();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    public static final int k(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int l(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static int m(long j10) {
        return Long.hashCode(j10);
    }

    public static final long n(long j10, long j11) {
        return f((((long) (((int) (j10 >> 32)) - ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static final long o(long j10, long j11) {
        return f((((long) (((int) (j10 >> 32)) + ((int) (j11 >> 32)))) << 32) | (((long) (((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)))) & 4294967295L));
    }

    public static String p(long j10) {
        return '(' + k(j10) + ", " + l(j10) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.f48563a, obj);
    }

    public int hashCode() {
        return m(this.f48563a);
    }

    public final /* synthetic */ long q() {
        return this.f48563a;
    }

    public String toString() {
        return p(this.f48563a);
    }

    public static long f(long j10) {
        return j10;
    }
}
