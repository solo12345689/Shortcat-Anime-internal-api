package oh;

/* JADX INFO: renamed from: oh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5902b extends Kg.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f55638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5901a f55639c;

    public C5902b(C5901a c5901a, byte[] bArr) {
        super(true);
        this.f55638b = Oh.a.f(bArr);
        this.f55639c = c5901a;
    }

    public C5901a b() {
        return this.f55639c;
    }

    public byte[] getEncoded() {
        return Oh.a.f(this.f55638b);
    }
}
