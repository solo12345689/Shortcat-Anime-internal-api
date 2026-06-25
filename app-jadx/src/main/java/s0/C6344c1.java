package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: s0.c1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6344c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f58930b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f58931c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f58932d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58933e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f58934f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f58935g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58936a;

    /* JADX INFO: renamed from: s0.c1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C6344c1.f58932d;
        }

        public final int b() {
            return C6344c1.f58931c;
        }

        public final int c() {
            return C6344c1.f58934f;
        }

        public final int d() {
            return C6344c1.f58935g;
        }

        public final int e() {
            return C6344c1.f58933e;
        }

        private a() {
        }
    }

    private /* synthetic */ C6344c1(int i10) {
        this.f58936a = i10;
    }

    public static final /* synthetic */ C6344c1 f(int i10) {
        return new C6344c1(i10);
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof C6344c1) && i10 == ((C6344c1) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f58931c) ? "Argb8888" : i(i10, f58932d) ? "Alpha8" : i(i10, f58933e) ? "Rgb565" : i(i10, f58934f) ? "F16" : i(i10, f58935g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return h(this.f58936a, obj);
    }

    public int hashCode() {
        return j(this.f58936a);
    }

    public final /* synthetic */ int l() {
        return this.f58936a;
    }

    public String toString() {
        return k(this.f58936a);
    }

    public static int g(int i10) {
        return i10;
    }
}
