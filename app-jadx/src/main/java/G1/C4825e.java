package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4825e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47227b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47228c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47229d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47230e = e(Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47231a;

    /* JADX INFO: renamed from: g1.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4825e.f47229d;
        }

        public final int b() {
            return C4825e.f47228c;
        }

        public final int c() {
            return C4825e.f47230e;
        }

        private a() {
        }
    }

    private /* synthetic */ C4825e(int i10) {
        this.f47231a = i10;
    }

    public static final /* synthetic */ C4825e d(int i10) {
        return new C4825e(i10);
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof C4825e) && i10 == ((C4825e) obj).j();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return Integer.hashCode(i10);
    }

    public static String i(int i10) {
        return g(i10, f47228c) ? "Hyphens.None" : g(i10, f47229d) ? "Hyphens.Auto" : g(i10, f47230e) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f47231a, obj);
    }

    public int hashCode() {
        return h(this.f47231a);
    }

    public final /* synthetic */ int j() {
        return this.f47231a;
    }

    public String toString() {
        return i(this.f47231a);
    }

    private static int e(int i10) {
        return i10;
    }
}
