package q8;

import java.util.Arrays;
import q8.AbstractC6159l;

/* JADX INFO: renamed from: q8.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6153f extends AbstractC6159l {

    /* JADX INFO: renamed from: a */
    private final long f57757a;

    /* JADX INFO: renamed from: b */
    private final Integer f57758b;

    /* JADX INFO: renamed from: c */
    private final long f57759c;

    /* JADX INFO: renamed from: d */
    private final byte[] f57760d;

    /* JADX INFO: renamed from: e */
    private final String f57761e;

    /* JADX INFO: renamed from: f */
    private final long f57762f;

    /* JADX INFO: renamed from: g */
    private final AbstractC6162o f57763g;

    /* JADX INFO: renamed from: q8.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC6159l.a {

        /* JADX INFO: renamed from: a */
        private Long f57764a;

        /* JADX INFO: renamed from: b */
        private Integer f57765b;

        /* JADX INFO: renamed from: c */
        private Long f57766c;

        /* JADX INFO: renamed from: d */
        private byte[] f57767d;

        /* JADX INFO: renamed from: e */
        private String f57768e;

        /* JADX INFO: renamed from: f */
        private Long f57769f;

        /* JADX INFO: renamed from: g */
        private AbstractC6162o f57770g;

        b() {
        }

        @Override // q8.AbstractC6159l.a
        public AbstractC6159l a() {
            String str = "";
            if (this.f57764a == null) {
                str = " eventTimeMs";
            }
            if (this.f57766c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f57769f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C6153f(this.f57764a.longValue(), this.f57765b, this.f57766c.longValue(), this.f57767d, this.f57768e, this.f57769f.longValue(), this.f57770g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q8.AbstractC6159l.a
        public AbstractC6159l.a b(Integer num) {
            this.f57765b = num;
            return this;
        }

        @Override // q8.AbstractC6159l.a
        public AbstractC6159l.a c(long j10) {
            this.f57764a = Long.valueOf(j10);
            return this;
        }

        @Override // q8.AbstractC6159l.a
        public AbstractC6159l.a d(long j10) {
            this.f57766c = Long.valueOf(j10);
            return this;
        }

        @Override // q8.AbstractC6159l.a
        public AbstractC6159l.a e(AbstractC6162o abstractC6162o) {
            this.f57770g = abstractC6162o;
            return this;
        }

        @Override // q8.AbstractC6159l.a
        AbstractC6159l.a f(byte[] bArr) {
            this.f57767d = bArr;
            return this;
        }

        @Override // q8.AbstractC6159l.a
        AbstractC6159l.a g(String str) {
            this.f57768e = str;
            return this;
        }

        @Override // q8.AbstractC6159l.a
        public AbstractC6159l.a h(long j10) {
            this.f57769f = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C6153f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC6162o abstractC6162o, a aVar) {
        this(j10, num, j11, bArr, str, j12, abstractC6162o);
    }

    @Override // q8.AbstractC6159l
    public Integer b() {
        return this.f57758b;
    }

    @Override // q8.AbstractC6159l
    public long c() {
        return this.f57757a;
    }

    @Override // q8.AbstractC6159l
    public long d() {
        return this.f57759c;
    }

    @Override // q8.AbstractC6159l
    public AbstractC6162o e() {
        return this.f57763g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        AbstractC6162o abstractC6162o;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6159l) {
            AbstractC6159l abstractC6159l = (AbstractC6159l) obj;
            if (this.f57757a == abstractC6159l.c() && ((num = this.f57758b) != null ? num.equals(abstractC6159l.b()) : abstractC6159l.b() == null) && this.f57759c == abstractC6159l.d()) {
                if (Arrays.equals(this.f57760d, abstractC6159l instanceof C6153f ? ((C6153f) abstractC6159l).f57760d : abstractC6159l.f()) && ((str = this.f57761e) != null ? str.equals(abstractC6159l.g()) : abstractC6159l.g() == null) && this.f57762f == abstractC6159l.h() && ((abstractC6162o = this.f57763g) != null ? abstractC6162o.equals(abstractC6159l.e()) : abstractC6159l.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // q8.AbstractC6159l
    public byte[] f() {
        return this.f57760d;
    }

    @Override // q8.AbstractC6159l
    public String g() {
        return this.f57761e;
    }

    @Override // q8.AbstractC6159l
    public long h() {
        return this.f57762f;
    }

    public int hashCode() {
        long j10 = this.f57757a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f57758b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f57759c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f57760d)) * 1000003;
        String str = this.f57761e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f57762f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC6162o abstractC6162o = this.f57763g;
        return i11 ^ (abstractC6162o != null ? abstractC6162o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f57757a + ", eventCode=" + this.f57758b + ", eventUptimeMs=" + this.f57759c + ", sourceExtension=" + Arrays.toString(this.f57760d) + ", sourceExtensionJsonProto3=" + this.f57761e + ", timezoneOffsetSeconds=" + this.f57762f + ", networkConnectionInfo=" + this.f57763g + "}";
    }

    private C6153f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC6162o abstractC6162o) {
        this.f57757a = j10;
        this.f57758b = num;
        this.f57759c = j11;
        this.f57760d = bArr;
        this.f57761e = str;
        this.f57762f = j12;
        this.f57763g = abstractC6162o;
    }
}
