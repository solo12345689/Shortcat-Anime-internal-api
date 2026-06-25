package com.google.firebase.installations;

import com.google.firebase.installations.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class a extends g {

    /* JADX INFO: renamed from: a */
    private final String f43265a;

    /* JADX INFO: renamed from: b */
    private final long f43266b;

    /* JADX INFO: renamed from: c */
    private final long f43267c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends g.a {

        /* JADX INFO: renamed from: a */
        private String f43268a;

        /* JADX INFO: renamed from: b */
        private long f43269b;

        /* JADX INFO: renamed from: c */
        private long f43270c;

        /* JADX INFO: renamed from: d */
        private byte f43271d;

        b() {
        }

        @Override // com.google.firebase.installations.g.a
        public g a() {
            String str;
            if (this.f43271d == 3 && (str = this.f43268a) != null) {
                return new a(str, this.f43269b, this.f43270c);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f43268a == null) {
                sb2.append(" token");
            }
            if ((this.f43271d & 1) == 0) {
                sb2.append(" tokenExpirationTimestamp");
            }
            if ((this.f43271d & 2) == 0) {
                sb2.append(" tokenCreationTimestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.installations.g.a
        public g.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f43268a = str;
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a c(long j10) {
            this.f43270c = j10;
            this.f43271d = (byte) (this.f43271d | 2);
            return this;
        }

        @Override // com.google.firebase.installations.g.a
        public g.a d(long j10) {
            this.f43269b = j10;
            this.f43271d = (byte) (this.f43271d | 1);
            return this;
        }
    }

    /* synthetic */ a(String str, long j10, long j11, C0649a c0649a) {
        this(str, j10, j11);
    }

    @Override // com.google.firebase.installations.g
    public String b() {
        return this.f43265a;
    }

    @Override // com.google.firebase.installations.g
    public long c() {
        return this.f43267c;
    }

    @Override // com.google.firebase.installations.g
    public long d() {
        return this.f43266b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f43265a.equals(gVar.b()) && this.f43266b == gVar.d() && this.f43267c == gVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f43265a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f43266b;
        long j11 = this.f43267c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f43265a + ", tokenExpirationTimestamp=" + this.f43266b + ", tokenCreationTimestamp=" + this.f43267c + "}";
    }

    private a(String str, long j10, long j11) {
        this.f43265a = str;
        this.f43266b = j10;
        this.f43267c = j11;
    }
}
