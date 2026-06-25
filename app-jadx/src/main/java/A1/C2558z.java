package a1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: a1.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2558z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f23658b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23659c = l(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f23660d = l(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f23661e = l(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f23662f = l(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f23663g = l(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f23664h = l(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f23665i = l(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f23666j = l(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f23667k = l(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f23668l = l(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23669a;

    /* JADX INFO: renamed from: a1.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C2558z.f23661e;
        }

        public final int b() {
            return C2558z.f23668l;
        }

        public final int c() {
            return C2558z.f23665i;
        }

        public final int d() {
            return C2558z.f23662f;
        }

        public final int e() {
            return C2558z.f23667k;
        }

        public final int f() {
            return C2558z.f23666j;
        }

        public final int g() {
            return C2558z.f23663g;
        }

        public final int h() {
            return C2558z.f23660d;
        }

        public final int i() {
            return C2558z.f23659c;
        }

        public final int j() {
            return C2558z.f23664h;
        }

        private a() {
        }
    }

    private /* synthetic */ C2558z(int i10) {
        this.f23669a = i10;
    }

    public static final /* synthetic */ C2558z k(int i10) {
        return new C2558z(i10);
    }

    public static boolean m(int i10, Object obj) {
        return (obj instanceof C2558z) && i10 == ((C2558z) obj).q();
    }

    public static final boolean n(int i10, int i11) {
        return i10 == i11;
    }

    public static int o(int i10) {
        return Integer.hashCode(i10);
    }

    public static String p(int i10) {
        return n(i10, f23659c) ? "Unspecified" : n(i10, f23660d) ? "Text" : n(i10, f23661e) ? "Ascii" : n(i10, f23662f) ? "Number" : n(i10, f23663g) ? "Phone" : n(i10, f23664h) ? "Uri" : n(i10, f23665i) ? "Email" : n(i10, f23666j) ? "Password" : n(i10, f23667k) ? "NumberPassword" : n(i10, f23668l) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m(this.f23669a, obj);
    }

    public int hashCode() {
        return o(this.f23669a);
    }

    public final /* synthetic */ int q() {
        return this.f23669a;
    }

    public String toString() {
        return p(this.f23669a);
    }

    private static int l(int i10) {
        return i10;
    }
}
