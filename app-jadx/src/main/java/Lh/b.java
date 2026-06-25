package Lh;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends Kg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f11611c;

    public b(int i10, byte[] bArr) {
        super(false);
        if (bArr.length != c.b(i10)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f11610b = i10;
        this.f11611c = Oh.a.f(bArr);
    }

    public byte[] b() {
        return Oh.a.f(this.f11611c);
    }

    public int c() {
        return this.f11610b;
    }
}
