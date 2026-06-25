package pa;

import pa.AbstractC5955f;

/* JADX INFO: renamed from: pa.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5951b extends AbstractC5955f {

    /* JADX INFO: renamed from: a */
    private final String f55848a;

    /* JADX INFO: renamed from: b */
    private final long f55849b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5955f.b f55850c;

    /* JADX INFO: renamed from: pa.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0859b extends AbstractC5955f.a {

        /* JADX INFO: renamed from: a */
        private String f55851a;

        /* JADX INFO: renamed from: b */
        private long f55852b;

        /* JADX INFO: renamed from: c */
        private AbstractC5955f.b f55853c;

        /* JADX INFO: renamed from: d */
        private byte f55854d;

        C0859b() {
        }

        @Override // pa.AbstractC5955f.a
        public AbstractC5955f a() {
            if (this.f55854d == 1) {
                return new C5951b(this.f55851a, this.f55852b, this.f55853c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // pa.AbstractC5955f.a
        public AbstractC5955f.a b(AbstractC5955f.b bVar) {
            this.f55853c = bVar;
            return this;
        }

        @Override // pa.AbstractC5955f.a
        public AbstractC5955f.a c(String str) {
            this.f55851a = str;
            return this;
        }

        @Override // pa.AbstractC5955f.a
        public AbstractC5955f.a d(long j10) {
            this.f55852b = j10;
            this.f55854d = (byte) (this.f55854d | 1);
            return this;
        }
    }

    /* synthetic */ C5951b(String str, long j10, AbstractC5955f.b bVar, a aVar) {
        this(str, j10, bVar);
    }

    @Override // pa.AbstractC5955f
    public AbstractC5955f.b b() {
        return this.f55850c;
    }

    @Override // pa.AbstractC5955f
    public String c() {
        return this.f55848a;
    }

    @Override // pa.AbstractC5955f
    public long d() {
        return this.f55849b;
    }

    public boolean equals(Object obj) {
        AbstractC5955f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5955f) {
            AbstractC5955f abstractC5955f = (AbstractC5955f) obj;
            String str = this.f55848a;
            if (str != null ? str.equals(abstractC5955f.c()) : abstractC5955f.c() == null) {
                if (this.f55849b == abstractC5955f.d() && ((bVar = this.f55850c) != null ? bVar.equals(abstractC5955f.b()) : abstractC5955f.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f55848a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f55849b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC5955f.b bVar = this.f55850c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f55848a + ", tokenExpirationTimestamp=" + this.f55849b + ", responseCode=" + this.f55850c + "}";
    }

    private C5951b(String str, long j10, AbstractC5955f.b bVar) {
        this.f55848a = str;
        this.f55849b = j10;
        this.f55850c = bVar;
    }
}
