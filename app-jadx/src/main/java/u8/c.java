package u8;

import ia.InterfaceC5048c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f61427c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f61428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f61429b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f61430a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f61431b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f61430a, this.f61431b);
        }

        public a b(long j10) {
            this.f61430a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f61431b = bVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements InterfaceC5048c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f61440a;

        b(int i10) {
            this.f61440a = i10;
        }

        @Override // ia.InterfaceC5048c
        public int d() {
            return this.f61440a;
        }
    }

    c(long j10, b bVar) {
        this.f61428a = j10;
        this.f61429b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f61428a;
    }

    public b b() {
        return this.f61429b;
    }
}
