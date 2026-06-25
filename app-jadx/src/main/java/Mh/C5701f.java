package mh;

/* JADX INFO: renamed from: mh.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5701f extends AbstractC5698c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f53742c;

    public C5701f(C5699d c5699d, byte[] bArr) {
        super(false, c5699d);
        this.f53742c = Oh.a.f(bArr);
    }

    public byte[] c() {
        return Oh.a.f(this.f53742c);
    }

    public byte[] getEncoded() {
        return c();
    }
}
