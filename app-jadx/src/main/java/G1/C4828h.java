package g1;

import b1.AbstractC2968a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4828h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f47253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C4828h f47254e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f47255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47257c;

    /* JADX INFO: renamed from: g1.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0758a f47258b = new C0758a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f47259c = d(0.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f47260d = d(0.5f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f47261e = d(-1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final float f47262f = d(1.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f47263a;

        /* JADX INFO: renamed from: g1.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0758a {
            public /* synthetic */ C0758a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final float a() {
                return a.f47260d;
            }

            public final float b() {
                return a.f47261e;
            }

            private C0758a() {
            }
        }

        private /* synthetic */ a(float f10) {
            this.f47263a = f10;
        }

        public static final /* synthetic */ a c(float f10) {
            return new a(f10);
        }

        public static float d(float f10) {
            if (!((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f)) {
                AbstractC2968a.c("topRatio should be in [0..1] range or -1");
            }
            return f10;
        }

        public static boolean e(float f10, Object obj) {
            return (obj instanceof a) && Float.compare(f10, ((a) obj).i()) == 0;
        }

        public static final boolean f(float f10, float f11) {
            return Float.compare(f10, f11) == 0;
        }

        public static int g(float f10) {
            return Float.hashCode(f10);
        }

        public static String h(float f10) {
            if (f10 == f47259c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f47260d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f47261e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f47262f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f47263a, obj);
        }

        public int hashCode() {
            return g(this.f47263a);
        }

        public final /* synthetic */ float i() {
            return this.f47263a;
        }

        public String toString() {
            return h(this.f47263a);
        }
    }

    /* JADX INFO: renamed from: g1.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C4828h a() {
            return C4828h.f47254e;
        }

        private b() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        f47253d = new b(defaultConstructorMarker);
        f47254e = new C4828h(a.f47258b.b(), d.f47268b.a(), c.f47264b.a(), defaultConstructorMarker);
    }

    public /* synthetic */ C4828h(float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10, i11);
    }

    public final float b() {
        return this.f47255a;
    }

    public final int c() {
        return this.f47257c;
    }

    public final int d() {
        return this.f47256b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4828h)) {
            return false;
        }
        C4828h c4828h = (C4828h) obj;
        return a.f(this.f47255a, c4828h.f47255a) && d.f(this.f47256b, c4828h.f47256b) && c.f(this.f47257c, c4828h.f47257c);
    }

    public int hashCode() {
        return (((a.g(this.f47255a) * 31) + d.g(this.f47256b)) * 31) + c.g(this.f47257c);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.h(this.f47255a)) + ", trim=" + ((Object) d.j(this.f47256b)) + ",mode=" + ((Object) c.h(this.f47257c)) + ')';
    }

    public /* synthetic */ C4828h(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, i10);
    }

    private C4828h(float f10, int i10, int i11) {
        this.f47255a = f10;
        this.f47256b = i10;
        this.f47257c = i11;
    }

    private C4828h(float f10, int i10) {
        this(f10, i10, c.f47264b.a(), null);
    }

    /* JADX INFO: renamed from: g1.h$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47264b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f47265c = d(0);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f47266d = d(1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47267a;

        /* JADX INFO: renamed from: g1.h$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return c.f47265c;
            }

            public final int b() {
                return c.f47266d;
            }

            private a() {
            }
        }

        private /* synthetic */ c(int i10) {
            this.f47267a = i10;
        }

        public static final /* synthetic */ c c(int i10) {
            return new c(i10);
        }

        public static boolean e(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).i();
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static int g(int i10) {
            return Integer.hashCode(i10);
        }

        public static String h(int i10) {
            return "Mode(value=" + i10 + ')';
        }

        public boolean equals(Object obj) {
            return e(this.f47267a, obj);
        }

        public int hashCode() {
            return g(this.f47267a);
        }

        public final /* synthetic */ int i() {
            return this.f47267a;
        }

        public String toString() {
            return h(this.f47267a);
        }

        private static int d(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: g1.h$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f47268b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f47269c = d(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f47270d = d(16);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f47271e = d(17);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f47272f = d(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f47273a;

        /* JADX INFO: renamed from: g1.h$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return d.f47271e;
            }

            public final int b() {
                return d.f47272f;
            }

            private a() {
            }
        }

        private /* synthetic */ d(int i10) {
            this.f47273a = i10;
        }

        public static final /* synthetic */ d c(int i10) {
            return new d(i10);
        }

        public static boolean e(int i10, Object obj) {
            return (obj instanceof d) && i10 == ((d) obj).k();
        }

        public static final boolean f(int i10, int i11) {
            return i10 == i11;
        }

        public static int g(int i10) {
            return Integer.hashCode(i10);
        }

        public static final boolean h(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean i(int i10) {
            return (i10 & 16) > 0;
        }

        public static String j(int i10) {
            return i10 == f47269c ? "LineHeightStyle.Trim.FirstLineTop" : i10 == f47270d ? "LineHeightStyle.Trim.LastLineBottom" : i10 == f47271e ? "LineHeightStyle.Trim.Both" : i10 == f47272f ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return e(this.f47273a, obj);
        }

        public int hashCode() {
            return g(this.f47273a);
        }

        public final /* synthetic */ int k() {
            return this.f47273a;
        }

        public String toString() {
            return j(this.f47273a);
        }

        private static int d(int i10) {
            return i10;
        }
    }
}
