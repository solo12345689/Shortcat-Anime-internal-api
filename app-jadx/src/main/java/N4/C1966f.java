package N4;

/* JADX INFO: renamed from: N4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1966f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12671a;

    /* JADX INFO: renamed from: N4.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12672a;

        /* synthetic */ a(z zVar) {
        }

        public C1966f a() {
            String str = this.f12672a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C1966f c1966f = new C1966f(null);
            c1966f.f12671a = str;
            return c1966f;
        }

        public a b(String str) {
            this.f12672a = str;
            return this;
        }
    }

    /* synthetic */ C1966f(z zVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f12671a;
    }
}
