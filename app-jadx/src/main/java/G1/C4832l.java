package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4832l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47292b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47293c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47294d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47295e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47296f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f47297g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47298h = h(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47299a;

    /* JADX INFO: renamed from: g1.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4832l.f47295e;
        }

        public final int b() {
            return C4832l.f47296f;
        }

        public final int c() {
            return C4832l.f47297g;
        }

        public final int d() {
            return C4832l.f47293c;
        }

        public final int e() {
            return C4832l.f47294d;
        }

        public final int f() {
            return C4832l.f47298h;
        }

        private a() {
        }
    }

    private /* synthetic */ C4832l(int i10) {
        this.f47299a = i10;
    }

    public static final /* synthetic */ C4832l g(int i10) {
        return new C4832l(i10);
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof C4832l) && i10 == ((C4832l) obj).m();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return Integer.hashCode(i10);
    }

    public static String l(int i10) {
        return j(i10, f47293c) ? "Ltr" : j(i10, f47294d) ? "Rtl" : j(i10, f47295e) ? "Content" : j(i10, f47296f) ? "ContentOrLtr" : j(i10, f47297g) ? "ContentOrRtl" : j(i10, f47298h) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.f47299a, obj);
    }

    public int hashCode() {
        return k(this.f47299a);
    }

    public final /* synthetic */ int m() {
        return this.f47299a;
    }

    public String toString() {
        return l(this.f47299a);
    }

    public static int h(int i10) {
        return i10;
    }
}
