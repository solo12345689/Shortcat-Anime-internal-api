package kh;

/* JADX INFO: renamed from: kh.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5486c extends AbstractC5484a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f52241c;

    public C5486c(C5485b c5485b, byte[] bArr) {
        super(true, c5485b);
        this.f52241c = Oh.a.f(bArr);
    }

    public byte[] getEncoded() {
        return Oh.a.f(this.f52241c);
    }
}
