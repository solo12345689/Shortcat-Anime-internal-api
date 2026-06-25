package Td;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class F implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17427b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f17428a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ F(long j10) {
        this.f17428a = j10;
    }

    public static final /* synthetic */ F a(long j10) {
        return new F(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof F) && j10 == ((F) obj).n();
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    public static int k(long j10) {
        return Long.hashCode(j10);
    }

    public static String m(long j10) {
        return N.f(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return N.d(n(), ((F) obj).n());
    }

    public boolean equals(Object obj) {
        return c(this.f17428a, obj);
    }

    public int hashCode() {
        return k(this.f17428a);
    }

    public final /* synthetic */ long n() {
        return this.f17428a;
    }

    public String toString() {
        return m(this.f17428a);
    }

    public static long b(long j10) {
        return j10;
    }
}
