package y8;

import java.util.Set;
import y8.f;

/* JADX INFO: renamed from: y8.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C7210c extends f.b {

    /* JADX INFO: renamed from: a */
    private final long f64915a;

    /* JADX INFO: renamed from: b */
    private final long f64916b;

    /* JADX INFO: renamed from: c */
    private final Set f64917c;

    /* JADX INFO: renamed from: y8.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a */
        private Long f64918a;

        /* JADX INFO: renamed from: b */
        private Long f64919b;

        /* JADX INFO: renamed from: c */
        private Set f64920c;

        b() {
        }

        @Override // y8.f.b.a
        public f.b a() {
            String str = "";
            if (this.f64918a == null) {
                str = " delta";
            }
            if (this.f64919b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f64920c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C7210c(this.f64918a.longValue(), this.f64919b.longValue(), this.f64920c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // y8.f.b.a
        public f.b.a b(long j10) {
            this.f64918a = Long.valueOf(j10);
            return this;
        }

        @Override // y8.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f64920c = set;
            return this;
        }

        @Override // y8.f.b.a
        public f.b.a d(long j10) {
            this.f64919b = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C7210c(long j10, long j11, Set set, a aVar) {
        this(j10, j11, set);
    }

    @Override // y8.f.b
    long b() {
        return this.f64915a;
    }

    @Override // y8.f.b
    Set c() {
        return this.f64917c;
    }

    @Override // y8.f.b
    long d() {
        return this.f64916b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f64915a == bVar.b() && this.f64916b == bVar.d() && this.f64917c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f64915a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f64916b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f64917c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f64915a + ", maxAllowedDelay=" + this.f64916b + ", flags=" + this.f64917c + "}";
    }

    private C7210c(long j10, long j11, Set set) {
        this.f64915a = j10;
        this.f64916b = j11;
        this.f64917c = set;
    }
}
