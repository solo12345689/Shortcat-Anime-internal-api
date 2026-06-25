package u8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f61424b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f61425a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f61426a = null;

        a() {
        }

        public b a() {
            return new b(this.f61426a);
        }

        public a b(e eVar) {
            this.f61426a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f61425a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f61425a;
    }
}
