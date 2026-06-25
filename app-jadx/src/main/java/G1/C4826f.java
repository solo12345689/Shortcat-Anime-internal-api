package g1;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4826f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47232b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f47233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f47234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f47235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f47236f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47237a;

    /* JADX INFO: renamed from: g1.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return C4826f.f47233c;
        }

        public final int b() {
            return C4826f.f47236f;
        }

        private a() {
        }
    }

    static {
        b.a aVar = b.f47238a;
        int iC = aVar.c();
        c.a aVar2 = c.f47243a;
        int iC2 = aVar2.c();
        d.a aVar3 = d.f47249a;
        f47233c = d(AbstractC4827g.e(iC, iC2, aVar3.a()));
        f47234d = d(AbstractC4827g.e(aVar.a(), aVar2.b(), aVar3.b()));
        f47235e = d(AbstractC4827g.e(aVar.b(), aVar2.d(), aVar3.a()));
        f47236f = d(0);
    }

    private /* synthetic */ C4826f(int i10) {
        this.f47237a = i10;
    }

    public static final /* synthetic */ C4826f c(int i10) {
        return new C4826f(i10);
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof C4826f) && i10 == ((C4826f) obj).l();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static final int g(int i10) {
        return b.d(AbstractC4827g.f(i10));
    }

    public static final int h(int i10) {
        return c.e(AbstractC4827g.g(i10));
    }

    public static final int i(int i10) {
        return d.c(AbstractC4827g.h(i10));
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static String k(int i10) {
        return "LineBreak(strategy=" + ((Object) b.f(g(i10))) + ", strictness=" + ((Object) c.g(h(i10))) + ", wordBreak=" + ((Object) d.e(i(i10))) + ')';
    }

    public boolean equals(Object obj) {
        return e(this.f47237a, obj);
    }

    public int hashCode() {
        return j(this.f47237a);
    }

    public final /* synthetic */ int l() {
        return this.f47237a;
    }

    public String toString() {
        return k(this.f47237a);
    }

    /* JADX INFO: renamed from: g1.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47238a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f47239b = d(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f47240c = d(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f47241d = d(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f47242e = d(0);

        /* JADX INFO: renamed from: g1.f$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return b.f47241d;
            }

            public final int b() {
                return b.f47240c;
            }

            public final int c() {
                return b.f47239b;
            }

            private a() {
            }
        }

        public static final boolean e(int i10, int i11) {
            return i10 == i11;
        }

        public static String f(int i10) {
            return e(i10, f47239b) ? "Strategy.Simple" : e(i10, f47240c) ? "Strategy.HighQuality" : e(i10, f47241d) ? "Strategy.Balanced" : e(i10, f47242e) ? "Strategy.Unspecified" : "Invalid";
        }

        public static int d(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: g1.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47243a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f47244b = e(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f47245c = e(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f47246d = e(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f47247e = e(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f47248f = e(0);

        /* JADX INFO: renamed from: g1.f$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f47244b;
            }

            public final int b() {
                return c.f47245c;
            }

            public final int c() {
                return c.f47246d;
            }

            public final int d() {
                return c.f47247e;
            }

            private a() {
            }
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static String g(int i10) {
            return f(i10, f47244b) ? "Strictness.None" : f(i10, f47245c) ? "Strictness.Loose" : f(i10, f47246d) ? "Strictness.Normal" : f(i10, f47247e) ? "Strictness.Strict" : f(i10, f47248f) ? "Strictness.Unspecified" : "Invalid";
        }

        public static int e(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: g1.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47249a = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f47250b = c(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f47251c = c(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f47252d = c(0);

        /* JADX INFO: renamed from: g1.f$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f47250b;
            }

            public final int b() {
                return d.f47251c;
            }

            private a() {
            }
        }

        public static final boolean d(int i10, int i11) {
            return i10 == i11;
        }

        public static String e(int i10) {
            return d(i10, f47250b) ? "WordBreak.None" : d(i10, f47251c) ? "WordBreak.Phrase" : d(i10, f47252d) ? "WordBreak.Unspecified" : "Invalid";
        }

        public static int c(int i10) {
            return i10;
        }
    }

    public static int d(int i10) {
        return i10;
    }
}
