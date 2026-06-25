package p0;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.E1;
import s0.t1;

/* JADX INFO: renamed from: p0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5908c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55675b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final E1 f55676c = d(t1.a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final E1 f55677d = d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E1 f55678a;

    /* JADX INFO: renamed from: p0.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E1 a() {
            return C5908c.f55676c;
        }

        public final E1 b() {
            return C5908c.f55677d;
        }

        private a() {
        }
    }

    private /* synthetic */ C5908c(E1 e12) {
        this.f55678a = e12;
    }

    public static final /* synthetic */ C5908c c(E1 e12) {
        return new C5908c(e12);
    }

    public static boolean e(E1 e12, Object obj) {
        return (obj instanceof C5908c) && AbstractC5504s.c(e12, ((C5908c) obj).h());
    }

    public static int f(E1 e12) {
        if (e12 == null) {
            return 0;
        }
        return e12.hashCode();
    }

    public static String g(E1 e12) {
        return "BlurredEdgeTreatment(shape=" + e12 + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f55678a, obj);
    }

    public final /* synthetic */ E1 h() {
        return this.f55678a;
    }

    public int hashCode() {
        return f(this.f55678a);
    }

    public String toString() {
        return g(this.f55678a);
    }

    public static E1 d(E1 e12) {
        return e12;
    }
}
