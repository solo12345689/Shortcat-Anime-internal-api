package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f58918a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f58919b = c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58920c = c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58921d = c(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58922e = c(3);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return X0.f58920c;
        }

        public final int b() {
            return X0.f58919b;
        }

        private a() {
        }
    }

    public static final boolean d(int i10, int i11) {
        return i10 == i11;
    }

    public static int e(int i10) {
        return Integer.hashCode(i10);
    }

    public static String f(int i10) {
        return d(i10, f58919b) ? "None" : d(i10, f58920c) ? "Low" : d(i10, f58921d) ? "Medium" : d(i10, f58922e) ? "High" : "Unknown";
    }

    public static int c(int i10) {
        return i10;
    }
}
