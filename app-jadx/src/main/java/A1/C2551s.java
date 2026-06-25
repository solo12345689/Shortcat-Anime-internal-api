package a1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2551s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23628b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23629c = k(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f23630d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f23631e = k(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f23632f = k(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f23633g = k(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f23634h = k(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f23635i = k(5);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f23636j = k(6);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f23637k = k(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23638a;

    /* JADX INFO: renamed from: a1.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2551s.f23630d;
        }

        public final int b() {
            return C2551s.f23637k;
        }

        public final int c() {
            return C2551s.f23632f;
        }

        public final int d() {
            return C2551s.f23636j;
        }

        public final int e() {
            return C2551s.f23631e;
        }

        public final int f() {
            return C2551s.f23635i;
        }

        public final int g() {
            return C2551s.f23633g;
        }

        public final int h() {
            return C2551s.f23634h;
        }

        public final int i() {
            return C2551s.f23629c;
        }

        private a() {
        }
    }

    private /* synthetic */ C2551s(int i10) {
        this.f23638a = i10;
    }

    public static final /* synthetic */ C2551s j(int i10) {
        return new C2551s(i10);
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof C2551s) && i10 == ((C2551s) obj).p();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public static String o(int i10) {
        return m(i10, f23629c) ? "Unspecified" : m(i10, f23631e) ? "None" : m(i10, f23630d) ? "Default" : m(i10, f23632f) ? "Go" : m(i10, f23633g) ? "Search" : m(i10, f23634h) ? "Send" : m(i10, f23635i) ? "Previous" : m(i10, f23636j) ? "Next" : m(i10, f23637k) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return l(this.f23638a, obj);
    }

    public int hashCode() {
        return n(this.f23638a);
    }

    public final /* synthetic */ int p() {
        return this.f23638a;
    }

    public String toString() {
        return o(this.f23638a);
    }

    private static int k(int i10) {
        return i10;
    }
}
