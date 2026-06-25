package i1;

import i1.C5031x;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5029v {

    /* JADX INFO: renamed from: b */
    public static final a f48578b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final C5031x[] f48579c;

    /* JADX INFO: renamed from: d */
    private static final long f48580d;

    /* JADX INFO: renamed from: a */
    private final long f48581a;

    /* JADX INFO: renamed from: i1.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C5029v.f48580d;
        }

        private a() {
        }
    }

    static {
        C5031x.a aVar = C5031x.f48582b;
        f48579c = new C5031x[]{C5031x.d(aVar.c()), C5031x.d(aVar.b()), C5031x.d(aVar.a())};
        f48580d = AbstractC5030w.i(0L, Float.NaN);
    }

    private /* synthetic */ C5029v(long j10) {
        this.f48581a = j10;
    }

    public static final /* synthetic */ C5029v b(long j10) {
        return new C5029v(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C5029v) && j10 == ((C5029v) obj).k();
    }

    public static final boolean e(long j10, long j11) {
        return j10 == j11;
    }

    public static final long f(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long g(long j10) {
        return f48579c[(int) (f(j10) >>> 32)].j();
    }

    public static final float h(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    public static int i(long j10) {
        return Long.hashCode(j10);
    }

    public static String j(long j10) {
        long jG = g(j10);
        C5031x.a aVar = C5031x.f48582b;
        if (C5031x.g(jG, aVar.c())) {
            return "Unspecified";
        }
        if (C5031x.g(jG, aVar.b())) {
            return h(j10) + ".sp";
        }
        if (!C5031x.g(jG, aVar.a())) {
            return "Invalid";
        }
        return h(j10) + ".em";
    }

    public boolean equals(Object obj) {
        return d(this.f48581a, obj);
    }

    public int hashCode() {
        return i(this.f48581a);
    }

    public final /* synthetic */ long k() {
        return this.f48581a;
    }

    public String toString() {
        return j(this.f48581a);
    }

    public static long c(long j10) {
        return j10;
    }
}
