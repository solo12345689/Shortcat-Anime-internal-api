package gh;

/* JADX INFO: loaded from: classes5.dex */
public class f extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f47511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f47512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f47513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final byte[] f47514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final byte[] f47515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final byte[] f47516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f47517i;

    public f(e eVar, byte[] bArr) {
        this(eVar, bArr, null);
    }

    public int c() {
        return this.f47517i;
    }

    public byte[] d() {
        return g.c(this.f47514f, this.f47515g);
    }

    public g e() {
        return new g(b(), this.f47514f, this.f47515g);
    }

    public byte[] f() {
        return Oh.a.f(this.f47516h);
    }

    public byte[] getEncoded() {
        return Oh.a.j(new byte[][]{this.f47511c, this.f47514f, this.f47515g, this.f47512d, this.f47513e});
    }

    public f(e eVar, byte[] bArr, g gVar) {
        super(true, eVar);
        C4886b c4886bA = eVar.a();
        if (bArr.length == 64) {
            byte[][] bArrA = c4886bA.a(Oh.a.m(bArr, 0, 32), Oh.a.m(bArr, 32, bArr.length));
            this.f47511c = bArrA[2];
            this.f47512d = bArrA[3];
            this.f47513e = bArrA[4];
            this.f47514f = bArrA[0];
            this.f47515g = bArrA[1];
            this.f47516h = bArrA[5];
        } else {
            this.f47511c = Oh.a.m(bArr, 0, c4886bA.f());
            int iF = c4886bA.f();
            this.f47514f = Oh.a.m(bArr, iF, (c4886bA.e() + iF) - 32);
            int iE = iF + (c4886bA.e() - 32);
            int i10 = iE + 32;
            this.f47515g = Oh.a.m(bArr, iE, i10);
            int i11 = iE + 64;
            this.f47512d = Oh.a.m(bArr, i10, i11);
            this.f47513e = Oh.a.m(bArr, i11, iE + 96);
            this.f47516h = null;
        }
        if (gVar != null && (!Oh.a.k(this.f47514f, gVar.f47518c) || !Oh.a.k(this.f47515g, gVar.f47519d))) {
            throw new IllegalArgumentException("passed in public key does not match private values");
        }
        this.f47517i = this.f47516h != null ? 0 : 2;
    }
}
