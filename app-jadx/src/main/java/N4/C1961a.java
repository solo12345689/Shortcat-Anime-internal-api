package N4;

/* JADX INFO: renamed from: N4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1961a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f12669a;

    /* JADX INFO: renamed from: N4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0196a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12670a;

        /* synthetic */ C0196a(q qVar) {
        }

        public C1961a a() {
            String str = this.f12670a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            C1961a c1961a = new C1961a(null);
            c1961a.f12669a = str;
            return c1961a;
        }

        public C0196a b(String str) {
            this.f12670a = str;
            return this;
        }
    }

    /* synthetic */ C1961a(q qVar) {
    }

    public static C0196a b() {
        return new C0196a(null);
    }

    public String a() {
        return this.f12669a;
    }
}
