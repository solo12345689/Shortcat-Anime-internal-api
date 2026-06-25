package a1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23651b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23652c = g(-1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f23653d = g(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f23654e = g(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f23655f = g(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f23656g = g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23657a;

    /* JADX INFO: renamed from: a1.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2557y.f23654e;
        }

        public final int b() {
            return C2557y.f23653d;
        }

        public final int c() {
            return C2557y.f23656g;
        }

        public final int d() {
            return C2557y.f23652c;
        }

        public final int e() {
            return C2557y.f23655f;
        }

        private a() {
        }
    }

    private /* synthetic */ C2557y(int i10) {
        this.f23657a = i10;
    }

    public static final /* synthetic */ C2557y f(int i10) {
        return new C2557y(i10);
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof C2557y) && i10 == ((C2557y) obj).l();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return i(i10, f23652c) ? "Unspecified" : i(i10, f23653d) ? "None" : i(i10, f23654e) ? "Characters" : i(i10, f23655f) ? "Words" : i(i10, f23656g) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return h(this.f23657a, obj);
    }

    public int hashCode() {
        return j(this.f23657a);
    }

    public final /* synthetic */ int l() {
        return this.f23657a;
    }

    public String toString() {
        return k(this.f23657a);
    }

    private static int g(int i10) {
        return i10;
    }
}
