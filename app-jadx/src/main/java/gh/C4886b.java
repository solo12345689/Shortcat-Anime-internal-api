package gh;

import gh.l;

/* JADX INFO: renamed from: gh.b */
/* JADX INFO: loaded from: classes5.dex */
class C4886b {

    /* JADX INFO: renamed from: a */
    private C4887c f47477a;

    /* JADX INFO: renamed from: b */
    private final int f47478b;

    /* JADX INFO: renamed from: c */
    private final int f47479c;

    /* JADX INFO: renamed from: d */
    private final int f47480d;

    /* JADX INFO: renamed from: e */
    private final int f47481e;

    /* JADX INFO: renamed from: f */
    private final int f47482f;

    /* JADX INFO: renamed from: g */
    private final int f47483g;

    /* JADX INFO: renamed from: h */
    private final int f47484h;

    /* JADX INFO: renamed from: i */
    private final int f47485i;

    /* JADX INFO: renamed from: j */
    private final int f47486j;

    /* JADX INFO: renamed from: k */
    private final int f47487k;

    /* JADX INFO: renamed from: l */
    private final int f47488l;

    /* JADX INFO: renamed from: m */
    private final int f47489m;

    /* JADX INFO: renamed from: n */
    private final int f47490n;

    /* JADX INFO: renamed from: o */
    private final int f47491o;

    /* JADX INFO: renamed from: p */
    private final int f47492p;

    /* JADX INFO: renamed from: q */
    private final int f47493q;

    /* JADX INFO: renamed from: r */
    private final l f47494r;

    public C4886b(int i10) {
        int i11;
        this.f47478b = i10;
        if (i10 == 2) {
            this.f47482f = 3;
        } else {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalArgumentException("K: " + i10 + " is not supported for Crystals Kyber");
                }
                this.f47482f = 2;
                this.f47480d = 160;
                i11 = i10 * 352;
                this.f47481e = i11;
                this.f47493q = 32;
                int i12 = i10 * 384;
                this.f47479c = i12;
                int i13 = i12 + 32;
                this.f47483g = i13;
                this.f47484h = i12;
                int i14 = this.f47481e + this.f47480d;
                this.f47485i = i14;
                this.f47486j = i13;
                int i15 = i12 + i13 + 64;
                this.f47487k = i15;
                this.f47488l = i14;
                this.f47489m = 32;
                this.f47490n = i15;
                this.f47491o = i13;
                this.f47492p = i14;
                this.f47494r = new l.a();
                this.f47477a = new C4887c(this);
            }
            this.f47482f = 2;
        }
        this.f47480d = 128;
        i11 = i10 * 320;
        this.f47481e = i11;
        this.f47493q = 32;
        int i122 = i10 * 384;
        this.f47479c = i122;
        int i132 = i122 + 32;
        this.f47483g = i132;
        this.f47484h = i122;
        int i142 = this.f47481e + this.f47480d;
        this.f47485i = i142;
        this.f47486j = i132;
        int i152 = i122 + i132 + 64;
        this.f47487k = i152;
        this.f47488l = i142;
        this.f47489m = 32;
        this.f47490n = i152;
        this.f47491o = i132;
        this.f47492p = i142;
        this.f47494r = new l.a();
        this.f47477a = new C4887c(this);
    }

    public static int c() {
        return 2;
    }

    public byte[][] a(byte[] bArr, byte[] bArr2) {
        byte[][] bArrA = this.f47477a.a(bArr);
        int i10 = this.f47484h;
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArrA[1], 0, bArr3, 0, i10);
        byte[] bArr4 = new byte[32];
        this.f47494r.b(bArr4, bArrA[0], 0);
        int i11 = this.f47483g;
        byte[] bArr5 = new byte[i11];
        System.arraycopy(bArrA[0], 0, bArr5, 0, i11);
        int i12 = i11 - 32;
        return new byte[][]{Oh.a.m(bArr5, 0, i12), Oh.a.m(bArr5, i12, i11), bArr3, bArr4, bArr2, Oh.a.h(bArr, bArr2)};
    }

    public int b() {
        return this.f47482f;
    }

    public int d() {
        return this.f47485i;
    }

    public int e() {
        return this.f47483g;
    }

    public int f() {
        return this.f47484h;
    }

    public int g() {
        return this.f47478b;
    }

    public int h() {
        return this.f47480d;
    }

    public int i() {
        return this.f47479c;
    }

    public int j() {
        return this.f47481e;
    }

    public int k() {
        return this.f47486j;
    }

    public l l() {
        return this.f47494r;
    }
}
