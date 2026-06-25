package sh;

import java.io.IOException;
import sh.j;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends p implements Oh.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f59933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f59934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f59935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f59936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f59937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile C6534a f59938h;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f59939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59940b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f59941c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f59942d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f59943e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte[] f59944f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte[] f59945g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private C6534a f59946h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f59947i = null;

        public b(x xVar) {
            this.f59939a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(C6534a c6534a) {
            this.f59946h = c6534a;
            return this;
        }

        public b l(int i10) {
            this.f59940b = i10;
            return this;
        }

        public b m(int i10) {
            this.f59941c = i10;
            return this;
        }

        public b n(byte[] bArr) {
            this.f59944f = AbstractC6533A.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f59945g = AbstractC6533A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f59943e = AbstractC6533A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f59942d = AbstractC6533A.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f59939a.f());
        x xVar = bVar.f59939a;
        this.f59933c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int iH = xVar.h();
        byte[] bArr = bVar.f59947i;
        if (bArr != null) {
            int iB = xVar.b();
            int iA = Oh.g.a(bArr, 0);
            if (!AbstractC6533A.l(iB, iA)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f59934d = AbstractC6533A.g(bArr, 4, iH);
            int i10 = 4 + iH;
            this.f59935e = AbstractC6533A.g(bArr, i10, iH);
            int i11 = i10 + iH;
            this.f59936f = AbstractC6533A.g(bArr, i11, iH);
            int i12 = i11 + iH;
            this.f59937g = AbstractC6533A.g(bArr, i12, iH);
            int i13 = i12 + iH;
            try {
                C6534a c6534a = (C6534a) AbstractC6533A.f(AbstractC6533A.g(bArr, i13, bArr.length - i13), C6534a.class);
                if (c6534a.b() != iA) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f59938h = c6534a.h(bVar.f59939a.g());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        byte[] bArr2 = bVar.f59942d;
        if (bArr2 == null) {
            this.f59934d = new byte[iH];
        } else {
            if (bArr2.length != iH) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f59934d = bArr2;
        }
        byte[] bArr3 = bVar.f59943e;
        if (bArr3 == null) {
            this.f59935e = new byte[iH];
        } else {
            if (bArr3.length != iH) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f59935e = bArr3;
        }
        byte[] bArr4 = bVar.f59944f;
        if (bArr4 == null) {
            this.f59936f = new byte[iH];
        } else {
            if (bArr4.length != iH) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f59936f = bArr4;
        }
        byte[] bArr5 = bVar.f59945g;
        if (bArr5 == null) {
            this.f59937g = new byte[iH];
        } else {
            if (bArr5.length != iH) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f59937g = bArr5;
        }
        C6534a c6534a2 = bVar.f59946h;
        if (c6534a2 != null) {
            this.f59938h = c6534a2;
        } else if (bVar.f59940b >= (1 << xVar.b()) - 2 || bArr4 == null || bArr2 == null) {
            c6534a2 = new C6534a(xVar, (1 << xVar.b()) - 1, bVar.f59940b);
            this.f59938h = c6534a2;
        } else {
            this.f59938h = new C6534a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f59940b);
        }
        if (bVar.f59941c >= 0 && bVar.f59941c != this.f59938h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public x c() {
        return this.f59933c;
    }

    public byte[] d() {
        byte[] bArrH;
        synchronized (this) {
            try {
                int iH = this.f59933c.h();
                byte[] bArr = new byte[iH + 4 + iH + iH + iH];
                Oh.g.c(this.f59938h.b(), bArr, 0);
                AbstractC6533A.e(bArr, this.f59934d, 4);
                int i10 = 4 + iH;
                AbstractC6533A.e(bArr, this.f59935e, i10);
                int i11 = i10 + iH;
                AbstractC6533A.e(bArr, this.f59936f, i11);
                AbstractC6533A.e(bArr, this.f59937g, i11 + iH);
                try {
                    bArrH = Oh.a.h(bArr, AbstractC6533A.p(this.f59938h));
                } catch (IOException e10) {
                    throw new RuntimeException("error serializing bds state: " + e10.getMessage());
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
