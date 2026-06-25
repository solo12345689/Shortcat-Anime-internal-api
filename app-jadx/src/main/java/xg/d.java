package Xg;

/* JADX INFO: loaded from: classes5.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f22037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f22038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f22039e;

    public d(c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, cVar);
        this.f22037c = Oh.a.f(bArr);
        this.f22038d = Oh.a.f(bArr2);
        this.f22039e = Oh.a.f(bArr3);
    }

    public byte[] getEncoded() {
        return Oh.a.i(this.f22037c, this.f22038d, this.f22039e);
    }
}
