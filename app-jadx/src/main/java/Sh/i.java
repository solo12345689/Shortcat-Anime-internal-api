package sh;

import sh.o;

/* JADX INFO: loaded from: classes5.dex */
final class i extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f59856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f59857g;

    private i(b bVar) {
        super(bVar);
        this.f59855e = bVar.f59858e;
        this.f59856f = bVar.f59859f;
        this.f59857g = bVar.f59860g;
    }

    @Override // sh.o
    protected byte[] d() {
        byte[] bArrD = super.d();
        Oh.g.c(this.f59855e, bArrD, 16);
        Oh.g.c(this.f59856f, bArrD, 20);
        Oh.g.c(this.f59857g, bArrD, 24);
        return bArrD;
    }

    protected int e() {
        return this.f59855e;
    }

    protected int f() {
        return this.f59856f;
    }

    protected int g() {
        return this.f59857g;
    }

    protected static class b extends o.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f59858e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f59859f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f59860g;

        protected b() {
            super(1);
            this.f59858e = 0;
            this.f59859f = 0;
            this.f59860g = 0;
        }

        protected o l() {
            return new i(this);
        }

        protected b n(int i10) {
            this.f59858e = i10;
            return this;
        }

        protected b o(int i10) {
            this.f59859f = i10;
            return this;
        }

        protected b p(int i10) {
            this.f59860g = i10;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // sh.o.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }
    }
}
