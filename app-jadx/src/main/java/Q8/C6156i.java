package q8;

import q8.AbstractC6162o;

/* JADX INFO: renamed from: q8.i */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C6156i extends AbstractC6162o {

    /* JADX INFO: renamed from: a */
    private final AbstractC6162o.c f57786a;

    /* JADX INFO: renamed from: b */
    private final AbstractC6162o.b f57787b;

    /* JADX INFO: renamed from: q8.i$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC6162o.a {

        /* JADX INFO: renamed from: a */
        private AbstractC6162o.c f57788a;

        /* JADX INFO: renamed from: b */
        private AbstractC6162o.b f57789b;

        b() {
        }

        @Override // q8.AbstractC6162o.a
        public AbstractC6162o a() {
            return new C6156i(this.f57788a, this.f57789b);
        }

        @Override // q8.AbstractC6162o.a
        public AbstractC6162o.a b(AbstractC6162o.b bVar) {
            this.f57789b = bVar;
            return this;
        }

        @Override // q8.AbstractC6162o.a
        public AbstractC6162o.a c(AbstractC6162o.c cVar) {
            this.f57788a = cVar;
            return this;
        }
    }

    /* synthetic */ C6156i(AbstractC6162o.c cVar, AbstractC6162o.b bVar, a aVar) {
        this(cVar, bVar);
    }

    @Override // q8.AbstractC6162o
    public AbstractC6162o.b b() {
        return this.f57787b;
    }

    @Override // q8.AbstractC6162o
    public AbstractC6162o.c c() {
        return this.f57786a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6162o) {
            AbstractC6162o abstractC6162o = (AbstractC6162o) obj;
            AbstractC6162o.c cVar = this.f57786a;
            if (cVar != null ? cVar.equals(abstractC6162o.c()) : abstractC6162o.c() == null) {
                AbstractC6162o.b bVar = this.f57787b;
                if (bVar != null ? bVar.equals(abstractC6162o.b()) : abstractC6162o.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC6162o.c cVar = this.f57786a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC6162o.b bVar = this.f57787b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f57786a + ", mobileSubtype=" + this.f57787b + "}";
    }

    private C6156i(AbstractC6162o.c cVar, AbstractC6162o.b bVar) {
        this.f57786a = cVar;
        this.f57787b = bVar;
    }
}
