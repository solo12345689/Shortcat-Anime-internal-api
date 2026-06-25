package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58881a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58882b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58883c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58884d = d(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return H1.f58884d;
        }

        public final int b() {
            return H1.f58882b;
        }

        public final int c() {
            return H1.f58883c;
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
        return e(i10, f58882b) ? "Miter" : e(i10, f58883c) ? "Round" : e(i10, f58884d) ? "Bevel" : "Unknown";
    }

    public static int d(int i10) {
        return i10;
    }
}
