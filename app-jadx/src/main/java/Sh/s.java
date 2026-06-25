package sh;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends q implements Oh.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f59897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f59898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f59899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f59900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f59901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile long f59902h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile sh.b f59903i;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f59904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f59905b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f59906c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f59907d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f59908e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte[] f59909f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f59910g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private sh.b f59911h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f59912i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private x f59913j = null;

        public b(r rVar) {
            this.f59904a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(sh.b bVar) {
            if (bVar.b() == 0) {
                this.f59911h = new sh.b(bVar, (1 << this.f59904a.a()) - 1);
                return this;
            }
            this.f59911h = bVar;
            return this;
        }

        public b m(long j10) {
            this.f59905b = j10;
            return this;
        }

        public b n(long j10) {
            this.f59906c = j10;
            return this;
        }

        public b o(byte[] bArr) {
            this.f59909f = AbstractC6533A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f59910g = AbstractC6533A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f59908e = AbstractC6533A.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f59907d = AbstractC6533A.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f59904a.e());
        r rVar = bVar.f59904a;
        this.f59897c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int iF = rVar.f();
        byte[] bArr = bVar.f59912i;
        if (bArr != null) {
            if (bVar.f59913j == null) {
                throw new NullPointerException("xmss == null");
            }
            int iA = rVar.a();
            int i10 = (iA + 7) / 8;
            this.f59902h = AbstractC6533A.a(bArr, 0, i10);
            if (!AbstractC6533A.l(iA, this.f59902h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f59898d = AbstractC6533A.g(bArr, i10, iF);
            int i11 = i10 + iF;
            this.f59899e = AbstractC6533A.g(bArr, i11, iF);
            int i12 = i11 + iF;
            this.f59900f = AbstractC6533A.g(bArr, i12, iF);
            int i13 = i12 + iF;
            this.f59901g = AbstractC6533A.g(bArr, i13, iF);
            int i14 = i13 + iF;
            try {
                this.f59903i = ((sh.b) AbstractC6533A.f(AbstractC6533A.g(bArr, i14, bArr.length - i14), sh.b.class)).f(bVar.f59913j.g());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        this.f59902h = bVar.f59905b;
        byte[] bArr2 = bVar.f59907d;
        if (bArr2 == null) {
            this.f59898d = new byte[iF];
        } else {
            if (bArr2.length != iF) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f59898d = bArr2;
        }
        byte[] bArr3 = bVar.f59908e;
        if (bArr3 == null) {
            this.f59899e = new byte[iF];
        } else {
            if (bArr3.length != iF) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f59899e = bArr3;
        }
        byte[] bArr4 = bVar.f59909f;
        if (bArr4 == null) {
            this.f59900f = new byte[iF];
        } else {
            if (bArr4.length != iF) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f59900f = bArr4;
        }
        byte[] bArr5 = bVar.f59910g;
        if (bArr5 == null) {
            this.f59901g = new byte[iF];
        } else {
            if (bArr5.length != iF) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f59901g = bArr5;
        }
        sh.b bVar2 = bVar.f59911h;
        if (bVar2 != null) {
            this.f59903i = bVar2;
        } else {
            if (!AbstractC6533A.l(rVar.a(), bVar.f59905b) || bArr4 == null || bArr2 == null) {
                bVar2 = new sh.b(bVar.f59906c + 1);
                this.f59903i = bVar2;
            } else {
                this.f59903i = new sh.b(rVar, bVar.f59905b, bArr4, bArr2);
            }
        }
        if (bVar.f59906c >= 0 && bVar.f59906c != this.f59903i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r c() {
        return this.f59897c;
    }

    public byte[] d() {
        byte[] bArrH;
        synchronized (this) {
            try {
                int iF = this.f59897c.f();
                int iA = (this.f59897c.a() + 7) / 8;
                byte[] bArr = new byte[iA + iF + iF + iF + iF];
                AbstractC6533A.e(bArr, AbstractC6533A.q(this.f59902h, iA), 0);
                AbstractC6533A.e(bArr, this.f59898d, iA);
                int i10 = iA + iF;
                AbstractC6533A.e(bArr, this.f59899e, i10);
                int i11 = i10 + iF;
                AbstractC6533A.e(bArr, this.f59900f, i11);
                AbstractC6533A.e(bArr, this.f59901g, i11 + iF);
                try {
                    bArrH = Oh.a.h(bArr, AbstractC6533A.p(this.f59903i));
                } catch (IOException e10) {
                    throw new IllegalStateException("error serializing bds state: " + e10.getMessage(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrH;
    }

    @Override // Oh.c
    public byte[] getEncoded() {
        byte[] bArrD;
        synchronized (this) {
            bArrD = d();
        }
        return bArrD;
    }
}
