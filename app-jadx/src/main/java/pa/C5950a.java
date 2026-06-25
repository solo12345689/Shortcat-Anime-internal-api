package pa;

import pa.AbstractC5953d;

/* JADX INFO: renamed from: pa.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5950a extends AbstractC5953d {

    /* JADX INFO: renamed from: a */
    private final String f55838a;

    /* JADX INFO: renamed from: b */
    private final String f55839b;

    /* JADX INFO: renamed from: c */
    private final String f55840c;

    /* JADX INFO: renamed from: d */
    private final AbstractC5955f f55841d;

    /* JADX INFO: renamed from: e */
    private final AbstractC5953d.b f55842e;

    /* JADX INFO: renamed from: pa.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5953d.a {

        /* JADX INFO: renamed from: a */
        private String f55843a;

        /* JADX INFO: renamed from: b */
        private String f55844b;

        /* JADX INFO: renamed from: c */
        private String f55845c;

        /* JADX INFO: renamed from: d */
        private AbstractC5955f f55846d;

        /* JADX INFO: renamed from: e */
        private AbstractC5953d.b f55847e;

        b() {
        }

        @Override // pa.AbstractC5953d.a
        public AbstractC5953d a() {
            return new C5950a(this.f55843a, this.f55844b, this.f55845c, this.f55846d, this.f55847e);
        }

        @Override // pa.AbstractC5953d.a
        public AbstractC5953d.a b(AbstractC5955f abstractC5955f) {
            this.f55846d = abstractC5955f;
            return this;
        }

        @Override // pa.AbstractC5953d.a
        public AbstractC5953d.a c(String str) {
            this.f55844b = str;
            return this;
        }

        @Override // pa.AbstractC5953d.a
        public AbstractC5953d.a d(String str) {
            this.f55845c = str;
            return this;
        }

        @Override // pa.AbstractC5953d.a
        public AbstractC5953d.a e(AbstractC5953d.b bVar) {
            this.f55847e = bVar;
            return this;
        }

        @Override // pa.AbstractC5953d.a
        public AbstractC5953d.a f(String str) {
            this.f55843a = str;
            return this;
        }
    }

    /* synthetic */ C5950a(String str, String str2, String str3, AbstractC5955f abstractC5955f, AbstractC5953d.b bVar, C0858a c0858a) {
        this(str, str2, str3, abstractC5955f, bVar);
    }

    @Override // pa.AbstractC5953d
    public AbstractC5955f b() {
        return this.f55841d;
    }

    @Override // pa.AbstractC5953d
    public String c() {
        return this.f55839b;
    }

    @Override // pa.AbstractC5953d
    public String d() {
        return this.f55840c;
    }

    @Override // pa.AbstractC5953d
    public AbstractC5953d.b e() {
        return this.f55842e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5953d) {
            AbstractC5953d abstractC5953d = (AbstractC5953d) obj;
            String str = this.f55838a;
            if (str != null ? str.equals(abstractC5953d.f()) : abstractC5953d.f() == null) {
                String str2 = this.f55839b;
                if (str2 != null ? str2.equals(abstractC5953d.c()) : abstractC5953d.c() == null) {
                    String str3 = this.f55840c;
                    if (str3 != null ? str3.equals(abstractC5953d.d()) : abstractC5953d.d() == null) {
                        AbstractC5955f abstractC5955f = this.f55841d;
                        if (abstractC5955f != null ? abstractC5955f.equals(abstractC5953d.b()) : abstractC5953d.b() == null) {
                            AbstractC5953d.b bVar = this.f55842e;
                            if (bVar != null ? bVar.equals(abstractC5953d.e()) : abstractC5953d.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // pa.AbstractC5953d
    public String f() {
        return this.f55838a;
    }

    public int hashCode() {
        String str = this.f55838a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f55839b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f55840c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC5955f abstractC5955f = this.f55841d;
        int iHashCode4 = (iHashCode3 ^ (abstractC5955f == null ? 0 : abstractC5955f.hashCode())) * 1000003;
        AbstractC5953d.b bVar = this.f55842e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f55838a + ", fid=" + this.f55839b + ", refreshToken=" + this.f55840c + ", authToken=" + this.f55841d + ", responseCode=" + this.f55842e + "}";
    }

    private C5950a(String str, String str2, String str3, AbstractC5955f abstractC5955f, AbstractC5953d.b bVar) {
        this.f55838a = str;
        this.f55839b = str2;
        this.f55840c = str3;
        this.f55841d = abstractC5955f;
        this.f55842e = bVar;
    }
}
