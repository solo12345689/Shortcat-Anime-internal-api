package R0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: R0.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2099h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f14960b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14961c = k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14962d = k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14963e = k(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14964f = k(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f14965g = k(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f14966h = k(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f14967i = k(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f14968j = k(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f14969k = k(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14970a;

    /* JADX INFO: renamed from: R0.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2099h.f14961c;
        }

        public final int b() {
            return C2099h.f14969k;
        }

        public final int c() {
            return C2099h.f14962d;
        }

        public final int d() {
            return C2099h.f14967i;
        }

        public final int e() {
            return C2099h.f14966h;
        }

        public final int f() {
            return C2099h.f14964f;
        }

        public final int g() {
            return C2099h.f14963e;
        }

        public final int h() {
            return C2099h.f14965g;
        }

        public final int i() {
            return C2099h.f14968j;
        }

        private a() {
        }
    }

    private /* synthetic */ C2099h(int i10) {
        this.f14970a = i10;
    }

    public static final /* synthetic */ C2099h j(int i10) {
        return new C2099h(i10);
    }

    public static boolean l(int i10, Object obj) {
        return (obj instanceof C2099h) && i10 == ((C2099h) obj).p();
    }

    public static final boolean m(int i10, int i11) {
        return i10 == i11;
    }

    public static int n(int i10) {
        return Integer.hashCode(i10);
    }

    public static String o(int i10) {
        return m(i10, f14961c) ? "Button" : m(i10, f14962d) ? "Checkbox" : m(i10, f14963e) ? "Switch" : m(i10, f14964f) ? "RadioButton" : m(i10, f14965g) ? "Tab" : m(i10, f14966h) ? "Image" : m(i10, f14967i) ? "DropdownList" : m(i10, f14968j) ? "Picker" : m(i10, f14969k) ? "Carousel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return l(this.f14970a, obj);
    }

    public int hashCode() {
        return n(this.f14970a);
    }

    public final /* synthetic */ int p() {
        return this.f14970a;
    }

    public String toString() {
        return o(this.f14970a);
    }

    private static int k(int i10) {
        return i10;
    }
}
