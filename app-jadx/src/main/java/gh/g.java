package gh;

/* JADX INFO: loaded from: classes5.dex */
public class g extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f47518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f47519d;

    public g(e eVar, byte[] bArr) {
        super(false, eVar);
        this.f47518c = Oh.a.m(bArr, 0, bArr.length - 32);
        this.f47519d = Oh.a.m(bArr, bArr.length - 32, bArr.length);
    }

    static byte[] c(byte[] bArr, byte[] bArr2) {
        return Oh.a.h(bArr, bArr2);
    }

    public byte[] getEncoded() {
        return c(this.f47518c, this.f47519d);
    }

    public g(e eVar, byte[] bArr, byte[] bArr2) {
        super(false, eVar);
        this.f47518c = Oh.a.f(bArr);
        this.f47519d = Oh.a.f(bArr2);
    }
}
