package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58877a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58878b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58879c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58880d = d(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return G1.f58878b;
        }

        public final int b() {
            return G1.f58879c;
        }

        public final int c() {
            return G1.f58880d;
        }

        private a() {
        }
    }

    public static final boolean e(int i10, int i11) {
        return i10 == i11;
    }

    public static int f(int i10) {
        return Integer.hashCode(i10);
    }

    public static String g(int i10) {
        return e(i10, f58878b) ? "Butt" : e(i10, f58879c) ? "Round" : e(i10, f58880d) ? "Square" : "Unknown";
    }

    public static int d(int i10) {
        return i10;
    }
}
