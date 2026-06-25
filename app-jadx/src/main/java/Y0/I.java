package Y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22598b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22599c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f22600d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f22601e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f22602f = f(65535);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22603a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return I.f22602f;
        }

        public final int b() {
            return I.f22599c;
        }

        public final int c() {
            return I.f22601e;
        }

        public final int d() {
            return I.f22600d;
        }

        private a() {
        }
    }

    private /* synthetic */ I(int i10) {
        this.f22603a = i10;
    }

    public static final /* synthetic */ I e(int i10) {
        return new I(i10);
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof I) && i10 == ((I) obj).m();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    public static final boolean j(int i10) {
        return (i10 & 2) != 0;
    }

    public static final boolean k(int i10) {
        return (i10 & 1) != 0;
    }

    public static String l(int i10) {
        return h(i10, f22599c) ? "None" : h(i10, f22600d) ? "Weight" : h(i10, f22601e) ? "Style" : h(i10, f22602f) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return g(this.f22603a, obj);
    }

    public int hashCode() {
        return i(this.f22603a);
    }

    public final /* synthetic */ int m() {
        return this.f22603a;
    }

    public String toString() {
        return l(this.f22603a);
    }

    public static int f(int i10) {
        return i10;
    }
}
