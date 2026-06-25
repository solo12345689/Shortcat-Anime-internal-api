package dh;

/* JADX INFO: loaded from: classes5.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f45741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f45742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fg.j f45743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f45744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f45745e;

    public q(byte[] bArr, byte[] bArr2, Fg.j jVar) {
        this.f45741a = bArr;
        this.f45742b = bArr2;
        this.f45743c = jVar;
    }

    public void a(byte[] bArr, boolean z10) {
        b(bArr, z10, 0);
    }

    public void b(byte[] bArr, boolean z10, int i10) {
        c(bArr, i10);
        if (z10) {
            this.f45745e++;
        }
    }

    public byte[] c(byte[] bArr, int i10) {
        if (bArr.length - i10 < this.f45743c.d()) {
            throw new IllegalArgumentException("target length is less than digest size.");
        }
        Fg.j jVar = this.f45743c;
        byte[] bArr2 = this.f45741a;
        jVar.update(bArr2, 0, bArr2.length);
        this.f45743c.b((byte) (this.f45744d >>> 24));
        this.f45743c.b((byte) (this.f45744d >>> 16));
        this.f45743c.b((byte) (this.f45744d >>> 8));
        this.f45743c.b((byte) this.f45744d);
        this.f45743c.b((byte) (this.f45745e >>> 8));
        this.f45743c.b((byte) this.f45745e);
        this.f45743c.b((byte) -1);
        Fg.j jVar2 = this.f45743c;
        byte[] bArr3 = this.f45742b;
        jVar2.update(bArr3, 0, bArr3.length);
        this.f45743c.a(bArr, i10);
        return bArr;
    }

    public void d(int i10) {
        this.f45745e = i10;
    }

    public void e(int i10) {
        this.f45744d = i10;
    }
}
