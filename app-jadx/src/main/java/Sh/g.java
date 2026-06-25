package sh;

import sh.o;

/* JADX INFO: loaded from: classes5.dex */
final class g extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f59849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f59850g;

    private g(b bVar) {
        super(bVar);
        this.f59848e = 0;
        this.f59849f = bVar.f59851e;
        this.f59850g = bVar.f59852f;
    }

    @Override // sh.o
    protected byte[] d() {
        byte[] bArrD = super.d();
        Oh.g.c(this.f59848e, bArrD, 16);
        Oh.g.c(this.f59849f, bArrD, 20);
        Oh.g.c(this.f59850g, bArrD, 24);
        return bArrD;
    }

    protected int e() {
        return this.f59849f;
    }

    protected int f() {
        return this.f59850g;
    }

    protected static class b extends o.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f59851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f59852f;

        protected b() {
            super(2);
            this.f59851e = 0;
            this.f59852f = 0;
        }

        protected o k() {
            return new g(this);
        }

        protected b m(int i10) {
            this.f59851e = i10;
            return this;
        }

        protected b n(int i10) {
            this.f59852f = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // sh.o.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
