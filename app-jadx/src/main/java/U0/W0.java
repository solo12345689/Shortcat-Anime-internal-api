package U0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class W0 {

    /* JADX INFO: renamed from: b */
    public static final a f18785b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final long f18786c = X0.a(0);

    /* JADX INFO: renamed from: a */
    private final long f18787a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return W0.f18786c;
        }

        private a() {
        }
    }

    private /* synthetic */ W0(long j10) {
        this.f18787a = j10;
    }

    public static final /* synthetic */ W0 b(long j10) {
        return new W0(j10);
    }

    public static final boolean d(long j10, long j11) {
        return (l(j10) <= l(j11)) & (k(j11) <= k(j10));
    }

    public static final boolean e(long j10, int i10) {
        return i10 < k(j10) && l(j10) <= i10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof W0) && j10 == ((W0) obj).r();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static final boolean h(long j10) {
        return n(j10) == i(j10);
    }

    public static final int i(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final int j(long j10) {
        return k(j10) - l(j10);
    }

    public static final int k(long j10) {
        return Math.max(n(j10), i(j10));
    }

    public static final int l(long j10) {
        return Math.min(n(j10), i(j10));
    }

    public static final boolean m(long j10) {
        return n(j10) > i(j10);
    }

    public static final int n(long j10) {
        return (int) (j10 >> 32);
    }

    public static int o(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean p(long j10, long j11) {
        return (l(j10) < k(j11)) & (l(j11) < k(j10));
    }

    public static String q(long j10) {
        return "TextRange(" + n(j10) + ", " + i(j10) + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f18787a, obj);
    }

    public int hashCode() {
        return o(this.f18787a);
    }

    public final /* synthetic */ long r() {
        return this.f18787a;
    }

    public String toString() {
        return q(this.f18787a);
    }

    public static long c(long j10) {
        return j10;
    }
}
