package E0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4086a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4087b = f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f4088c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f4089d = f(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f4090e = f(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f4091f = f(4);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return Q.f4091f;
        }

        public final int b() {
            return Q.f4089d;
        }

        public final int c() {
            return Q.f4090e;
        }

        public final int d() {
            return Q.f4088c;
        }

        public final int e() {
            return Q.f4087b;
        }

        private a() {
        }
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    private static int f(int i10) {
        return i10;
    }
}
