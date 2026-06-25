package mh;

/* JADX INFO: renamed from: mh.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5700e extends AbstractC5698c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f53741c;

    public C5700e(C5699d c5699d, byte[] bArr) {
        super(true, c5699d);
        this.f53741c = Oh.a.f(bArr);
    }

    public byte[] getEncoded() {
        return Oh.a.f(this.f53741c);
    }
}
