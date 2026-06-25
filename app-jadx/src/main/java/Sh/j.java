package sh;

import sh.o;

/* JADX INFO: loaded from: classes5.dex */
final class j extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f59861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f59862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f59863g;

    private j(b bVar) {
        super(bVar);
        this.f59861e = bVar.f59864e;
        this.f59862f = bVar.f59865f;
        this.f59863g = bVar.f59866g;
    }

    @Override // sh.o
    protected byte[] d() {
        byte[] bArrD = super.d();
        Oh.g.c(this.f59861e, bArrD, 16);
        Oh.g.c(this.f59862f, bArrD, 20);
        Oh.g.c(this.f59863g, bArrD, 24);
        return bArrD;
    }

    protected int e() {
        return this.f59862f;
    }

    protected int f() {
        return this.f59863g;
    }

    protected int g() {
        return this.f59861e;
    }

    protected static class b extends o.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f59864e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f59865f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f59866g;

        protected b() {
            super(0);
            this.f59864e = 0;
            this.f59865f = 0;
            this.f59866g = 0;
        }

        protected o l() {
            return new j(this);
        }

        protected b n(int i10) {
            this.f59865f = i10;
            return this;
        }

        protected b o(int i10) {
            this.f59866g = i10;
            return this;
        }

        protected b p(int i10) {
            this.f59864e = i10;
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
