package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26884a = a.f26885a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26885a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final F f26886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final F f26887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final F f26888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final F f26889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final F f26890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final F f26891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final F f26892h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final F f26893i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final F f26894j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final F f26895k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final F f26896l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final F f26897m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final F f26898n;

        static {
            G g10 = new G("caption bar");
            f26886b = g10;
            G g11 = new G("display cutout");
            f26887c = g11;
            G g12 = new G("ime");
            f26888d = g12;
            G g13 = new G("mandatory system gestures");
            f26889e = g13;
            G g14 = new G("navigation bars");
            f26890f = g14;
            G g15 = new G("status bars");
            f26891g = g15;
            f26892h = new C2676e("system bars", new F[]{g15, g14, g10});
            G g16 = new G("system gestures");
            f26893i = g16;
            G g17 = new G("tappable element");
            f26894j = g17;
            G g18 = new G("waterfall");
            f26895k = g18;
            f26896l = new C2676e("safe drawing", new F[]{g15, g14, g10, g11, g12, g17});
            f26897m = new C2676e("safe gestures", new F[]{g13, g16, g17, g18});
            f26898n = new C2676e("safe content", new F[]{g15, g14, g10, g12, g16, g13, g17, g11, g18});
        }

        private a() {
        }

        public final F a() {
            return f26886b;
        }

        public final F b() {
            return f26887c;
        }

        public final F c() {
            return f26888d;
        }

        public final F d() {
            return f26889e;
        }

        public final F e() {
            return f26890f;
        }

        public final F f() {
            return f26891g;
        }

        public final F g() {
            return f26893i;
        }

        public final F h() {
            return f26894j;
        }

        public final F i() {
            return f26895k;
        }
    }

    u a();

    u b();
}
