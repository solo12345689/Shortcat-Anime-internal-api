package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22590a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22591b = d(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22592c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22593d = d(2);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return F.f22593d;
        }

        public final int b() {
            return F.f22591b;
        }

        public final int c() {
            return F.f22592c;
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
        if (e(i10, f22591b)) {
            return "Blocking";
        }
        if (e(i10, f22592c)) {
            return "Optional";
        }
        if (e(i10, f22593d)) {
            return "Async";
        }
        return "Invalid(value=" + i10 + ')';
    }

    private static int d(int i10) {
        return i10;
    }
}
