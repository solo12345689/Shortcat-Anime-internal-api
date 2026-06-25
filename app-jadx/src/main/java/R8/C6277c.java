package r8;

import p8.AbstractC5939d;
import p8.C5938c;
import p8.InterfaceC5942g;
import r8.AbstractC6288n;

/* JADX INFO: renamed from: r8.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6277c extends AbstractC6288n {

    /* JADX INFO: renamed from: a */
    private final AbstractC6289o f58669a;

    /* JADX INFO: renamed from: b */
    private final String f58670b;

    /* JADX INFO: renamed from: c */
    private final AbstractC5939d f58671c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5942g f58672d;

    /* JADX INFO: renamed from: e */
    private final C5938c f58673e;

    /* JADX INFO: renamed from: r8.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC6288n.a {

        /* JADX INFO: renamed from: a */
        private AbstractC6289o f58674a;

        /* JADX INFO: renamed from: b */
        private String f58675b;

        /* JADX INFO: renamed from: c */
        private AbstractC5939d f58676c;

        /* JADX INFO: renamed from: d */
        private InterfaceC5942g f58677d;

        /* JADX INFO: renamed from: e */
        private C5938c f58678e;

        b() {
        }

        @Override // r8.AbstractC6288n.a
        public AbstractC6288n a() {
            String str = "";
            if (this.f58674a == null) {
                str = " transportContext";
            }
            if (this.f58675b == null) {
                str = str + " transportName";
            }
            if (this.f58676c == null) {
                str = str + " event";
            }
            if (this.f58677d == null) {
                str = str + " transformer";
            }
            if (this.f58678e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6277c(this.f58674a, this.f58675b, this.f58676c, this.f58677d, this.f58678e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.AbstractC6288n.a
        AbstractC6288n.a b(C5938c c5938c) {
            if (c5938c == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f58678e = c5938c;
            return this;
        }

        @Override // r8.AbstractC6288n.a
        AbstractC6288n.a c(AbstractC5939d abstractC5939d) {
            if (abstractC5939d == null) {
                throw new NullPointerException("Null event");
            }
            this.f58676c = abstractC5939d;
            return this;
        }

        @Override // r8.AbstractC6288n.a
        AbstractC6288n.a d(InterfaceC5942g interfaceC5942g) {
            if (interfaceC5942g == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f58677d = interfaceC5942g;
            return this;
        }

        @Override // r8.AbstractC6288n.a
        public AbstractC6288n.a e(AbstractC6289o abstractC6289o) {
            if (abstractC6289o == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f58674a = abstractC6289o;
            return this;
        }

        @Override // r8.AbstractC6288n.a
        public AbstractC6288n.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f58675b = str;
            return this;
        }
    }

    /* synthetic */ C6277c(AbstractC6289o abstractC6289o, String str, AbstractC5939d abstractC5939d, InterfaceC5942g interfaceC5942g, C5938c c5938c, a aVar) {
        this(abstractC6289o, str, abstractC5939d, interfaceC5942g, c5938c);
    }

    @Override // r8.AbstractC6288n
    public C5938c b() {
        return this.f58673e;
    }

    @Override // r8.AbstractC6288n
    AbstractC5939d c() {
        return this.f58671c;
    }

    @Override // r8.AbstractC6288n
    InterfaceC5942g e() {
        return this.f58672d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6288n) {
            AbstractC6288n abstractC6288n = (AbstractC6288n) obj;
            if (this.f58669a.equals(abstractC6288n.f()) && this.f58670b.equals(abstractC6288n.g()) && this.f58671c.equals(abstractC6288n.c()) && this.f58672d.equals(abstractC6288n.e()) && this.f58673e.equals(abstractC6288n.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.AbstractC6288n
    public AbstractC6289o f() {
        return this.f58669a;
    }

    @Override // r8.AbstractC6288n
    public String g() {
        return this.f58670b;
    }

    public int hashCode() {
        return ((((((((this.f58669a.hashCode() ^ 1000003) * 1000003) ^ this.f58670b.hashCode()) * 1000003) ^ this.f58671c.hashCode()) * 1000003) ^ this.f58672d.hashCode()) * 1000003) ^ this.f58673e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f58669a + ", transportName=" + this.f58670b + ", event=" + this.f58671c + ", transformer=" + this.f58672d + ", encoding=" + this.f58673e + "}";
    }

    private C6277c(AbstractC6289o abstractC6289o, String str, AbstractC5939d abstractC5939d, InterfaceC5942g interfaceC5942g, C5938c c5938c) {
        this.f58669a = abstractC6289o;
        this.f58670b = str;
        this.f58671c = abstractC5939d;
        this.f58672d = interfaceC5942g;
        this.f58673e = c5938c;
    }
}
