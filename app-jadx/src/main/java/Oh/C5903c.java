package oh;

/* JADX INFO: renamed from: oh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5903c extends Kg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f55640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5901a f55641c;

    public C5903c(C5901a c5901a, byte[] bArr) {
        super(false);
        this.f55640b = Oh.a.f(bArr);
        this.f55641c = c5901a;
    }

    public C5901a b() {
        return this.f55641c;
    }

    public byte[] getEncoded() {
        return Oh.a.f(this.f55640b);
    }
}
