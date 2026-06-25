package oa;

import oa.c;
import oa.d;

/* JADX INFO: renamed from: oa.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C5849a extends d {

    /* JADX INFO: renamed from: b */
    private final String f55320b;

    /* JADX INFO: renamed from: c */
    private final c.a f55321c;

    /* JADX INFO: renamed from: d */
    private final String f55322d;

    /* JADX INFO: renamed from: e */
    private final String f55323e;

    /* JADX INFO: renamed from: f */
    private final long f55324f;

    /* JADX INFO: renamed from: g */
    private final long f55325g;

    /* JADX INFO: renamed from: h */
    private final String f55326h;

    /* JADX INFO: renamed from: oa.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends d.a {

        /* JADX INFO: renamed from: a */
        private String f55327a;

        /* JADX INFO: renamed from: b */
        private c.a f55328b;

        /* JADX INFO: renamed from: c */
        private String f55329c;

        /* JADX INFO: renamed from: d */
        private String f55330d;

        /* JADX INFO: renamed from: e */
        private long f55331e;

        /* JADX INFO: renamed from: f */
        private long f55332f;

        /* JADX INFO: renamed from: g */
        private String f55333g;

        /* JADX INFO: renamed from: h */
        private byte f55334h;

        /* synthetic */ b(d dVar, C0848a c0848a) {
            this(dVar);
        }

        @Override // oa.d.a
        public d a() {
            if (this.f55334h == 3 && this.f55328b != null) {
                return new C5849a(this.f55327a, this.f55328b, this.f55329c, this.f55330d, this.f55331e, this.f55332f, this.f55333g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f55328b == null) {
                sb2.append(" registrationStatus");
            }
            if ((this.f55334h & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((this.f55334h & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // oa.d.a
        public d.a b(String str) {
            this.f55329c = str;
            return this;
        }

        @Override // oa.d.a
        public d.a c(long j10) {
            this.f55331e = j10;
            this.f55334h = (byte) (this.f55334h | 1);
            return this;
        }

        @Override // oa.d.a
        public d.a d(String str) {
            this.f55327a = str;
            return this;
        }

        @Override // oa.d.a
        public d.a e(String str) {
            this.f55333g = str;
            return this;
        }

        @Override // oa.d.a
        public d.a f(String str) {
            this.f55330d = str;
            return this;
        }

        @Override // oa.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f55328b = aVar;
            return this;
        }

        @Override // oa.d.a
        public d.a h(long j10) {
            this.f55332f = j10;
            this.f55334h = (byte) (this.f55334h | 2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f55327a = dVar.d();
            this.f55328b = dVar.g();
            this.f55329c = dVar.b();
            this.f55330d = dVar.f();
            this.f55331e = dVar.c();
            this.f55332f = dVar.h();
            this.f55333g = dVar.e();
            this.f55334h = (byte) 3;
        }
    }

    /* synthetic */ C5849a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4, C0848a c0848a) {
        this(str, aVar, str2, str3, j10, j11, str4);
    }

    @Override // oa.d
    public String b() {
        return this.f55322d;
    }

    @Override // oa.d
    public long c() {
        return this.f55324f;
    }

    @Override // oa.d
    public String d() {
        return this.f55320b;
    }

    @Override // oa.d
    public String e() {
        return this.f55326h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f55320b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f55321c.equals(dVar.g()) && ((str = this.f55322d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f55323e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f55324f == dVar.c() && this.f55325g == dVar.h() && ((str3 = this.f55326h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oa.d
    public String f() {
        return this.f55323e;
    }

    @Override // oa.d
    public c.a g() {
        return this.f55321c;
    }

    @Override // oa.d
    public long h() {
        return this.f55325g;
    }

    public int hashCode() {
        String str = this.f55320b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f55321c.hashCode()) * 1000003;
        String str2 = this.f55322d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f55323e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f55324f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f55325g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f55326h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // oa.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f55320b + ", registrationStatus=" + this.f55321c + ", authToken=" + this.f55322d + ", refreshToken=" + this.f55323e + ", expiresInSecs=" + this.f55324f + ", tokenCreationEpochInSecs=" + this.f55325g + ", fisError=" + this.f55326h + "}";
    }

    private C5849a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f55320b = str;
        this.f55321c = aVar;
        this.f55322d = str2;
        this.f55323e = str3;
        this.f55324f = j10;
        this.f55325g = j11;
        this.f55326h = str4;
    }
}
