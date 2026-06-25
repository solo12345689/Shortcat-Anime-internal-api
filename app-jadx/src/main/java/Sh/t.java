package sh;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends q implements Oh.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f59914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f59915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f59916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f59917f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f59918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f59919b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private byte[] f59920c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f59921d = null;

        public b(r rVar) {
            this.f59918a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f59921d = AbstractC6533A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f59920c = AbstractC6533A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f59919b = AbstractC6533A.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f59918a.e());
        r rVar = bVar.f59918a;
        this.f59914c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int iF = rVar.f();
        byte[] bArr = bVar.f59921d;
        if (bArr != null) {
            if (bArr.length == iF + iF) {
                this.f59915d = 0;
                this.f59916e = AbstractC6533A.g(bArr, 0, iF);
                this.f59917f = AbstractC6533A.g(bArr, iF, iF);
                return;
            } else {
                if (bArr.length != iF + 4 + iF) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f59915d = Oh.g.a(bArr, 0);
                this.f59916e = AbstractC6533A.g(bArr, 4, iF);
                this.f59917f = AbstractC6533A.g(bArr, 4 + iF, iF);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f59915d = rVar.d().a();
        } else {
            this.f59915d = 0;
        }
        byte[] bArr2 = bVar.f59919b;
        if (bArr2 == null) {
            this.f59916e = new byte[iF];
        } else {
            if (bArr2.length != iF) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f59916e = bArr2;
        }
        byte[] bArr3 = bVar.f59920c;
        if (bArr3 == null) {
            this.f59917f = new byte[iF];
        } else {
            if (bArr3.length != iF) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f59917f = bArr3;
        }
    }

    public r c() {
        return this.f59914c;
    }

    public byte[] d() {
        return AbstractC6533A.c(this.f59917f);
    }

    public byte[] e() {
        return AbstractC6533A.c(this.f59916e);
    }

    public byte[] f() {
        byte[] bArr;
        int iF = this.f59914c.f();
        int i10 = this.f59915d;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[iF + 4 + iF];
            Oh.g.c(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[iF + iF];
        }
        AbstractC6533A.e(bArr, this.f59916e, i11);
        AbstractC6533A.e(bArr, this.f59917f, i11 + iF);
        return bArr;
    }

    @Override // Oh.c
    public byte[] getEncoded() {
        return f();
    }
}
