package sh;

/* JADX INFO: loaded from: classes5.dex */
public final class z extends p implements Oh.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f59948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f59950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f59951f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f59952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f59953b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f59954c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f59955d = null;

        public b(x xVar) {
            this.f59952a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f59955d = AbstractC6533A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f59954c = AbstractC6533A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f59953b = AbstractC6533A.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f59952a.f());
        x xVar = bVar.f59952a;
        this.f59948c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int iH = xVar.h();
        byte[] bArr = bVar.f59955d;
        if (bArr != null) {
            if (bArr.length == iH + iH) {
                this.f59949d = 0;
                this.f59950e = AbstractC6533A.g(bArr, 0, iH);
                this.f59951f = AbstractC6533A.g(bArr, iH, iH);
                return;
            } else {
                if (bArr.length != iH + 4 + iH) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f59949d = Oh.g.a(bArr, 0);
                this.f59950e = AbstractC6533A.g(bArr, 4, iH);
                this.f59951f = AbstractC6533A.g(bArr, 4 + iH, iH);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f59949d = xVar.e().a();
        } else {
            this.f59949d = 0;
        }
        byte[] bArr2 = bVar.f59953b;
        if (bArr2 == null) {
            this.f59950e = new byte[iH];
        } else {
            if (bArr2.length != iH) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f59950e = bArr2;
        }
        byte[] bArr3 = bVar.f59954c;
        if (bArr3 == null) {
            this.f59951f = new byte[iH];
        } else {
            if (bArr3.length != iH) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f59951f = bArr3;
        }
    }

    public x c() {
        return this.f59948c;
    }

    public byte[] d() {
        return AbstractC6533A.c(this.f59951f);
    }

    public byte[] e() {
        return AbstractC6533A.c(this.f59950e);
    }

    public byte[] f() {
        byte[] bArr;
        int iH = this.f59948c.h();
        int i10 = this.f59949d;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[iH + 4 + iH];
            Oh.g.c(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[iH + iH];
        }
        AbstractC6533A.e(bArr, this.f59950e, i11);
        AbstractC6533A.e(bArr, this.f59951f, i11 + iH);
        return bArr;
    }

    @Override // Oh.c
    public byte[] getEncoded() {
        return f();
    }
}
