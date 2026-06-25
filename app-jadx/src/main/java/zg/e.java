package Zg;

/* JADX INFO: loaded from: classes5.dex */
public class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f23464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f23465d;

    public e(c cVar, byte[] bArr) {
        super(false, cVar);
        this.f23464c = Oh.a.m(bArr, 0, 32);
        this.f23465d = Oh.a.m(bArr, 32, bArr.length);
    }

    static byte[] c(byte[] bArr, byte[] bArr2) {
        return Oh.a.h(bArr, bArr2);
    }

    public byte[] d() {
        return Oh.a.f(this.f23465d);
    }

    public byte[] getEncoded() {
        return c(this.f23464c, this.f23465d);
    }

    public e(c cVar, byte[] bArr, byte[] bArr2) {
        super(false, cVar);
        this.f23464c = Oh.a.f(bArr);
        this.f23465d = Oh.a.f(bArr2);
    }
}
