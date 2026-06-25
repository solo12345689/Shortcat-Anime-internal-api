package u8;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f61446c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f61447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f61448b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f61449a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f61450b = 0;

        a() {
        }

        public e a() {
            return new e(this.f61449a, this.f61450b);
        }

        public a b(long j10) {
            this.f61449a = j10;
            return this;
        }

        public a c(long j10) {
            this.f61450b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f61447a = j10;
        this.f61448b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f61447a;
    }

    public long b() {
        return this.f61448b;
    }
}
