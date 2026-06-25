package A0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0001a f96b = new C0001a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f97c = d(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f98d = d(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f99a;

    /* JADX INFO: renamed from: A0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0001a {
        public /* synthetic */ C0001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f98d;
        }

        public final int b() {
            return a.f97c;
        }

        private C0001a() {
        }
    }

    private /* synthetic */ a(int i10) {
        this.f99a = i10;
    }

    public static final /* synthetic */ a c(int i10) {
        return new a(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof a) && i10 == ((a) obj).i();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return Integer.hashCode(i10);
    }

    public static String h(int i10) {
        return f(i10, f97c) ? "Touch" : f(i10, f98d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return e(this.f99a, obj);
    }

    public int hashCode() {
        return g(this.f99a);
    }

    public final /* synthetic */ int i() {
        return this.f99a;
    }

    public String toString() {
        return h(this.f99a);
    }

    public static int d(int i10) {
        return i10;
    }
}
