package u8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f61451c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f61452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f61453b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f61454a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f61455b = 0;

        a() {
        }

        public f a() {
            return new f(this.f61454a, this.f61455b);
        }

        public a b(long j10) {
            this.f61455b = j10;
            return this;
        }

        public a c(long j10) {
            this.f61454a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f61452a = j10;
        this.f61453b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f61453b;
    }

    public long b() {
        return this.f61452a;
    }
}
