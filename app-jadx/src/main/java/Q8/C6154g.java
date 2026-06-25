package q8;

import java.util.List;
import q8.AbstractC6160m;

/* JADX INFO: renamed from: q8.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6154g extends AbstractC6160m {

    /* JADX INFO: renamed from: a */
    private final long f57771a;

    /* JADX INFO: renamed from: b */
    private final long f57772b;

    /* JADX INFO: renamed from: c */
    private final AbstractC6158k f57773c;

    /* JADX INFO: renamed from: d */
    private final Integer f57774d;

    /* JADX INFO: renamed from: e */
    private final String f57775e;

    /* JADX INFO: renamed from: f */
    private final List f57776f;

    /* JADX INFO: renamed from: g */
    private final EnumC6163p f57777g;

    /* JADX INFO: renamed from: q8.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC6160m.a {

        /* JADX INFO: renamed from: a */
        private Long f57778a;

        /* JADX INFO: renamed from: b */
        private Long f57779b;

        /* JADX INFO: renamed from: c */
        private AbstractC6158k f57780c;

        /* JADX INFO: renamed from: d */
        private Integer f57781d;

        /* JADX INFO: renamed from: e */
        private String f57782e;

        /* JADX INFO: renamed from: f */
        private List f57783f;

        /* JADX INFO: renamed from: g */
        private EnumC6163p f57784g;

        b() {
        }

        @Override // q8.AbstractC6160m.a
        public AbstractC6160m a() {
            String str = "";
            if (this.f57778a == null) {
                str = " requestTimeMs";
            }
            if (this.f57779b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C6154g(this.f57778a.longValue(), this.f57779b.longValue(), this.f57780c, this.f57781d, this.f57782e, this.f57783f, this.f57784g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q8.AbstractC6160m.a
        public AbstractC6160m.a b(AbstractC6158k abstractC6158k) {
            this.f57780c = abstractC6158k;
            return this;
        }

        @Override // q8.AbstractC6160m.a
        public AbstractC6160m.a c(List list) {
            this.f57783f = list;
            return this;
        }

        @Override // q8.AbstractC6160m.a
        AbstractC6160m.a d(Integer num) {
            this.f57781d = num;
            return this;
        }

        @Override // q8.AbstractC6160m.a
        AbstractC6160m.a e(String str) {
            this.f57782e = str;
            return this;
        }

        @Override // q8.AbstractC6160m.a
        public AbstractC6160m.a f(EnumC6163p enumC6163p) {
            this.f57784g = enumC6163p;
            return this;
        }

        @Override // q8.AbstractC6160m.a
        public AbstractC6160m.a g(long j10) {
            this.f57778a = Long.valueOf(j10);
            return this;
        }

        @Override // q8.AbstractC6160m.a
        public AbstractC6160m.a h(long j10) {
            this.f57779b = Long.valueOf(j10);
            return this;
        }
    }

    /* synthetic */ C6154g(long j10, long j11, AbstractC6158k abstractC6158k, Integer num, String str, List list, EnumC6163p enumC6163p, a aVar) {
        this(j10, j11, abstractC6158k, num, str, list, enumC6163p);
    }

    @Override // q8.AbstractC6160m
    public AbstractC6158k b() {
        return this.f57773c;
    }

    @Override // q8.AbstractC6160m
    public List c() {
        return this.f57776f;
    }

    @Override // q8.AbstractC6160m
    public Integer d() {
        return this.f57774d;
    }

    @Override // q8.AbstractC6160m
    public String e() {
        return this.f57775e;
    }

    public boolean equals(Object obj) {
        AbstractC6158k abstractC6158k;
        Integer num;
        String str;
        List list;
        EnumC6163p enumC6163p;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6160m) {
            AbstractC6160m abstractC6160m = (AbstractC6160m) obj;
            if (this.f57771a == abstractC6160m.g() && this.f57772b == abstractC6160m.h() && ((abstractC6158k = this.f57773c) != null ? abstractC6158k.equals(abstractC6160m.b()) : abstractC6160m.b() == null) && ((num = this.f57774d) != null ? num.equals(abstractC6160m.d()) : abstractC6160m.d() == null) && ((str = this.f57775e) != null ? str.equals(abstractC6160m.e()) : abstractC6160m.e() == null) && ((list = this.f57776f) != null ? list.equals(abstractC6160m.c()) : abstractC6160m.c() == null) && ((enumC6163p = this.f57777g) != null ? enumC6163p.equals(abstractC6160m.f()) : abstractC6160m.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // q8.AbstractC6160m
    public EnumC6163p f() {
        return this.f57777g;
    }

    @Override // q8.AbstractC6160m
    public long g() {
        return this.f57771a;
    }

    @Override // q8.AbstractC6160m
    public long h() {
        return this.f57772b;
    }

    public int hashCode() {
        long j10 = this.f57771a;
        long j11 = this.f57772b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC6158k abstractC6158k = this.f57773c;
        int iHashCode = (i10 ^ (abstractC6158k == null ? 0 : abstractC6158k.hashCode())) * 1000003;
        Integer num = this.f57774d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f57775e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f57776f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC6163p enumC6163p = this.f57777g;
        return iHashCode4 ^ (enumC6163p != null ? enumC6163p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f57771a + ", requestUptimeMs=" + this.f57772b + ", clientInfo=" + this.f57773c + ", logSource=" + this.f57774d + ", logSourceName=" + this.f57775e + ", logEvents=" + this.f57776f + ", qosTier=" + this.f57777g + "}";
    }

    private C6154g(long j10, long j11, AbstractC6158k abstractC6158k, Integer num, String str, List list, EnumC6163p enumC6163p) {
        this.f57771a = j10;
        this.f57772b = j11;
        this.f57773c = abstractC6158k;
        this.f57774d = num;
        this.f57775e = str;
        this.f57776f = list;
        this.f57777g = enumC6163p;
    }
}
