package r8;

import java.util.Map;
import r8.AbstractC6283i;

/* JADX INFO: renamed from: r8.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6276b extends AbstractC6283i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f58657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f58658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6282h f58659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f58660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f58661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f58662f;

    /* JADX INFO: renamed from: r8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0887b extends AbstractC6283i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f58663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f58664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C6282h f58665c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f58666d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f58667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f58668f;

        C0887b() {
        }

        @Override // r8.AbstractC6283i.a
        public AbstractC6283i d() {
            String str = "";
            if (this.f58663a == null) {
                str = " transportName";
            }
            if (this.f58665c == null) {
                str = str + " encodedPayload";
            }
            if (this.f58666d == null) {
                str = str + " eventMillis";
            }
            if (this.f58667e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f58668f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C6276b(this.f58663a, this.f58664b, this.f58665c, this.f58666d.longValue(), this.f58667e.longValue(), this.f58668f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.AbstractC6283i.a
        protected Map e() {
            Map map = this.f58668f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // r8.AbstractC6283i.a
        protected AbstractC6283i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f58668f = map;
            return this;
        }

        @Override // r8.AbstractC6283i.a
        public AbstractC6283i.a g(Integer num) {
            this.f58664b = num;
            return this;
        }

        @Override // r8.AbstractC6283i.a
        public AbstractC6283i.a h(C6282h c6282h) {
            if (c6282h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f58665c = c6282h;
            return this;
        }

        @Override // r8.AbstractC6283i.a
        public AbstractC6283i.a i(long j10) {
            this.f58666d = Long.valueOf(j10);
            return this;
        }

        @Override // r8.AbstractC6283i.a
        public AbstractC6283i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f58663a = str;
            return this;
        }

        @Override // r8.AbstractC6283i.a
        public AbstractC6283i.a k(long j10) {
            this.f58667e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // r8.AbstractC6283i
    protected Map c() {
        return this.f58662f;
    }

    @Override // r8.AbstractC6283i
    public Integer d() {
        return this.f58658b;
    }

    @Override // r8.AbstractC6283i
    public C6282h e() {
        return this.f58659c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6283i) {
            AbstractC6283i abstractC6283i = (AbstractC6283i) obj;
            if (this.f58657a.equals(abstractC6283i.j()) && ((num = this.f58658b) != null ? num.equals(abstractC6283i.d()) : abstractC6283i.d() == null) && this.f58659c.equals(abstractC6283i.e()) && this.f58660d == abstractC6283i.f() && this.f58661e == abstractC6283i.k() && this.f58662f.equals(abstractC6283i.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.AbstractC6283i
    public long f() {
        return this.f58660d;
    }

    public int hashCode() {
        int iHashCode = (this.f58657a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f58658b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f58659c.hashCode()) * 1000003;
        long j10 = this.f58660d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f58661e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f58662f.hashCode();
    }

    @Override // r8.AbstractC6283i
    public String j() {
        return this.f58657a;
    }

    @Override // r8.AbstractC6283i
    public long k() {
        return this.f58661e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f58657a + ", code=" + this.f58658b + ", encodedPayload=" + this.f58659c + ", eventMillis=" + this.f58660d + ", uptimeMillis=" + this.f58661e + ", autoMetadata=" + this.f58662f + "}";
    }

    private C6276b(String str, Integer num, C6282h c6282h, long j10, long j11, Map map) {
        this.f58657a = str;
        this.f58658b = num;
        this.f58659c = c6282h;
        this.f58660d = j10;
        this.f58661e = j11;
        this.f58662f = map;
    }
}
