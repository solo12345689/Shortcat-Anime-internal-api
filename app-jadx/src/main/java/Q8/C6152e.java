package q8;

import q8.AbstractC6158k;

/* JADX INFO: renamed from: q8.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6152e extends AbstractC6158k {

    /* JADX INFO: renamed from: a */
    private final AbstractC6158k.b f57753a;

    /* JADX INFO: renamed from: b */
    private final AbstractC6148a f57754b;

    /* JADX INFO: renamed from: q8.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC6158k.a {

        /* JADX INFO: renamed from: a */
        private AbstractC6158k.b f57755a;

        /* JADX INFO: renamed from: b */
        private AbstractC6148a f57756b;

        b() {
        }

        @Override // q8.AbstractC6158k.a
        public AbstractC6158k a() {
            return new C6152e(this.f57755a, this.f57756b);
        }

        @Override // q8.AbstractC6158k.a
        public AbstractC6158k.a b(AbstractC6148a abstractC6148a) {
            this.f57756b = abstractC6148a;
            return this;
        }

        @Override // q8.AbstractC6158k.a
        public AbstractC6158k.a c(AbstractC6158k.b bVar) {
            this.f57755a = bVar;
            return this;
        }
    }

    /* synthetic */ C6152e(AbstractC6158k.b bVar, AbstractC6148a abstractC6148a, a aVar) {
        this(bVar, abstractC6148a);
    }

    @Override // q8.AbstractC6158k
    public AbstractC6148a b() {
        return this.f57754b;
    }

    @Override // q8.AbstractC6158k
    public AbstractC6158k.b c() {
        return this.f57753a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6158k) {
            AbstractC6158k abstractC6158k = (AbstractC6158k) obj;
            AbstractC6158k.b bVar = this.f57753a;
            if (bVar != null ? bVar.equals(abstractC6158k.c()) : abstractC6158k.c() == null) {
                AbstractC6148a abstractC6148a = this.f57754b;
                if (abstractC6148a != null ? abstractC6148a.equals(abstractC6158k.b()) : abstractC6158k.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC6158k.b bVar = this.f57753a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC6148a abstractC6148a = this.f57754b;
        return iHashCode ^ (abstractC6148a != null ? abstractC6148a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f57753a + ", androidClientInfo=" + this.f57754b + "}";
    }

    private C6152e(AbstractC6158k.b bVar, AbstractC6148a abstractC6148a) {
        this.f57753a = bVar;
        this.f57754b = abstractC6148a;
    }
}
