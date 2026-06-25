package R0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: R0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14950b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14951c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14952d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14953a;

    /* JADX INFO: renamed from: R0.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2096e.f14952d;
        }

        public final int b() {
            return C2096e.f14951c;
        }

        private a() {
        }
    }

    private /* synthetic */ C2096e(int i10) {
        this.f14953a = i10;
    }

    public static final /* synthetic */ C2096e c(int i10) {
        return new C2096e(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C2096e) && i10 == ((C2096e) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f14951c) ? "Polite" : f(i10, f14952d) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.f14953a, obj);
    }

    public int hashCode() {
        return g(this.f14953a);
    }

    public final /* synthetic */ int i() {
        return this.f14953a;
    }

    public String toString() {
        return h(this.f14953a);
    }

    private static int d(int i10) {
        return i10;
    }
}
