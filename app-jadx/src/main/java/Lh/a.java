package Lh;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends Kg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f11609c;

    public a(int i10, byte[] bArr) {
        super(true);
        if (bArr.length != c.a(i10)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f11608b = i10;
        this.f11609c = Oh.a.f(bArr);
    }

    public byte[] b() {
        return Oh.a.f(this.f11609c);
    }

    public int c() {
        return this.f11608b;
    }
}
