package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4830j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47278b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47279c = i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47280d = i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47281e = i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47282f = i(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f47283g = i(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f47284h = i(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f47285i = i(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47286a;

    /* JADX INFO: renamed from: g1.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4830j.f47281e;
        }

        public final int b() {
            return C4830j.f47284h;
        }

        public final int c() {
            return C4830j.f47282f;
        }

        public final int d() {
            return C4830j.f47279c;
        }

        public final int e() {
            return C4830j.f47280d;
        }

        public final int f() {
            return C4830j.f47283g;
        }

        public final int g() {
            return C4830j.f47285i;
        }

        private a() {
        }
    }

    private /* synthetic */ C4830j(int i10) {
        this.f47286a = i10;
    }

    public static final /* synthetic */ C4830j h(int i10) {
        return new C4830j(i10);
    }

    public static boolean j(int i10, Object obj) {
        return (obj instanceof C4830j) && i10 == ((C4830j) obj).n();
    }

    public static final boolean k(int i10, int i11) {
        return i10 == i11;
    }

    public static int l(int i10) {
        return Integer.hashCode(i10);
    }

    public static String m(int i10) {
        return k(i10, f47279c) ? "Left" : k(i10, f47280d) ? "Right" : k(i10, f47281e) ? "Center" : k(i10, f47282f) ? "Justify" : k(i10, f47283g) ? "Start" : k(i10, f47284h) ? "End" : k(i10, f47285i) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return j(this.f47286a, obj);
    }

    public int hashCode() {
        return l(this.f47286a);
    }

    public final /* synthetic */ int n() {
        return this.f47286a;
    }

    public String toString() {
        return m(this.f47286a);
    }

    public static int i(int i10) {
        return i10;
    }
}
