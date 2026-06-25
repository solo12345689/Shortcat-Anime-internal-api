package fh;

/* JADX INFO: loaded from: classes5.dex */
public class d extends AbstractC4809b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f47102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f47103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f47104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final byte[] f47105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final byte[] f47106g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final byte[] f47107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f47108i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f47109j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f47110k;

    public d(C4810c c4810c, byte[] bArr, e eVar) {
        super(true, c4810c);
        C4808a c4808aA = c4810c.a(null);
        if (bArr.length == 32) {
            byte[][] bArrC = c4808aA.c(bArr);
            this.f47102c = bArrC[0];
            this.f47103d = bArrC[1];
            this.f47104e = bArrC[2];
            this.f47105f = bArrC[3];
            this.f47106g = bArrC[4];
            this.f47107h = bArrC[5];
            this.f47108i = bArrC[6];
            this.f47109j = bArrC[7];
        } else {
            byte[] bArrM = Oh.a.m(bArr, 0, 32);
            this.f47102c = bArrM;
            byte[] bArrM2 = Oh.a.m(bArr, 32, 64);
            this.f47103d = bArrM2;
            byte[] bArrM3 = Oh.a.m(bArr, 64, 128);
            this.f47104e = bArrM3;
            int iG = (c4808aA.g() * c4808aA.h()) + 128;
            byte[] bArrM4 = Oh.a.m(bArr, 128, iG);
            this.f47105f = bArrM4;
            int iF = (c4808aA.f() * c4808aA.h()) + iG;
            byte[] bArrM5 = Oh.a.m(bArr, iG, iF);
            this.f47106g = bArrM5;
            byte[] bArrM6 = Oh.a.m(bArr, iF, (c4808aA.f() * 416) + iF);
            this.f47107h = bArrM6;
            this.f47108i = c4808aA.b(bArrM, bArrM2, bArrM3, bArrM4, bArrM5, bArrM6);
            this.f47109j = null;
        }
        if (eVar != null && !Oh.a.k(this.f47108i, eVar.d())) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.f47110k = this.f47109j != null ? 0 : 2;
    }

    public int c() {
        return this.f47110k;
    }

    public byte[] d() {
        return Oh.a.f(this.f47109j);
    }

    public byte[] getEncoded() {
        return Oh.a.j(new byte[][]{this.f47102c, this.f47103d, this.f47104e, this.f47105f, this.f47106g, this.f47107h});
    }
}
