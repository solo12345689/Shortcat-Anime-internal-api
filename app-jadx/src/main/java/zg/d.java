package Zg;

/* JADX INFO: loaded from: classes5.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f23457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f23458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final byte[] f23459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final byte[] f23460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final byte[] f23461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final byte[] f23462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f23463i;

    public d(c cVar, byte[] bArr, e eVar) {
        super(true, cVar);
        a aVarA = cVar.a(null);
        this.f23457c = Oh.a.m(bArr, 0, 32);
        this.f23458d = Oh.a.m(bArr, 32, 64);
        this.f23459e = Oh.a.m(bArr, 64, 128);
        int iB = (aVarA.b() * aVarA.c()) + 128;
        this.f23460f = Oh.a.m(bArr, 128, iB);
        int iA = (aVarA.a() * aVarA.c()) + iB;
        this.f23461g = Oh.a.m(bArr, iB, iA);
        this.f23462h = Oh.a.m(bArr, iA, (aVarA.a() * 416) + iA);
        if (eVar != null) {
            this.f23463i = eVar.d();
        } else {
            this.f23463i = null;
        }
    }

    public e c() {
        return new e(b(), this.f23457c, this.f23463i);
    }

    public byte[] getEncoded() {
        return Oh.a.j(new byte[][]{this.f23457c, this.f23458d, this.f23459e, this.f23460f, this.f23461g, this.f23462h});
    }

    public d(c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7) {
        super(true, cVar);
        this.f23457c = Oh.a.f(bArr);
        this.f23458d = Oh.a.f(bArr2);
        this.f23459e = Oh.a.f(bArr3);
        this.f23460f = Oh.a.f(bArr4);
        this.f23461g = Oh.a.f(bArr5);
        this.f23462h = Oh.a.f(bArr6);
        this.f23463i = Oh.a.f(bArr7);
    }
}
