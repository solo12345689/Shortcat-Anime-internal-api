package z8;

import z8.AbstractC7328e;

/* JADX INFO: renamed from: z8.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7324a extends AbstractC7328e {

    /* JADX INFO: renamed from: b */
    private final long f65980b;

    /* JADX INFO: renamed from: c */
    private final int f65981c;

    /* JADX INFO: renamed from: d */
    private final int f65982d;

    /* JADX INFO: renamed from: e */
    private final long f65983e;

    /* JADX INFO: renamed from: f */
    private final int f65984f;

    /* JADX INFO: renamed from: z8.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC7328e.a {

        /* JADX INFO: renamed from: a */
        private Long f65985a;

        /* JADX INFO: renamed from: b */
        private Integer f65986b;

        /* JADX INFO: renamed from: c */
        private Integer f65987c;

        /* JADX INFO: renamed from: d */
        private Long f65988d;

        /* JADX INFO: renamed from: e */
        private Integer f65989e;

        b() {
        }

        @Override // z8.AbstractC7328e.a
        AbstractC7328e a() {
            String str = "";
            if (this.f65985a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f65986b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f65987c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f65988d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f65989e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C7324a(this.f65985a.longValue(), this.f65986b.intValue(), this.f65987c.intValue(), this.f65988d.longValue(), this.f65989e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z8.AbstractC7328e.a
        AbstractC7328e.a b(int i10) {
            this.f65987c = Integer.valueOf(i10);
            return this;
        }

        @Override // z8.AbstractC7328e.a
        AbstractC7328e.a c(long j10) {
            this.f65988d = Long.valueOf(j10);
            return this;
        }

        @Override // z8.AbstractC7328e.a
        AbstractC7328e.a d(int i10) {
            this.f65986b = Integer.valueOf(i10);
            return this;
        }

        @Override // z8.AbstractC7328e.a
        AbstractC7328e.a e(int i10) {
            this.f65989e = Integer.valueOf(i10);
            return this;
        }

        @Override // z8.AbstractC7328e.a
        AbstractC7328e.a f(long j10) {
            this.f65985a = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C7324a(long j10, int i10, int i11, long j11, int i12, C0995a c0995a) {
        this(j10, i10, i11, j11, i12);
    }

    @Override // z8.AbstractC7328e
    int b() {
        return this.f65982d;
    }

    @Override // z8.AbstractC7328e
    long c() {
        return this.f65983e;
    }

    @Override // z8.AbstractC7328e
    int d() {
        return this.f65981c;
    }

    @Override // z8.AbstractC7328e
    int e() {
        return this.f65984f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7328e) {
            AbstractC7328e abstractC7328e = (AbstractC7328e) obj;
            if (this.f65980b == abstractC7328e.f() && this.f65981c == abstractC7328e.d() && this.f65982d == abstractC7328e.b() && this.f65983e == abstractC7328e.c() && this.f65984f == abstractC7328e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // z8.AbstractC7328e
    long f() {
        return this.f65980b;
    }

    public int hashCode() {
        long j10 = this.f65980b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f65981c) * 1000003) ^ this.f65982d) * 1000003;
        long j11 = this.f65983e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f65984f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f65980b + ", loadBatchSize=" + this.f65981c + ", criticalSectionEnterTimeoutMs=" + this.f65982d + ", eventCleanUpAge=" + this.f65983e + ", maxBlobByteSizePerRow=" + this.f65984f + "}";
    }

    private C7324a(long j10, int i10, int i11, long j11, int i12) {
        this.f65980b = j10;
        this.f65981c = i10;
        this.f65982d = i11;
        this.f65983e = j11;
        this.f65984f = i12;
    }
}
