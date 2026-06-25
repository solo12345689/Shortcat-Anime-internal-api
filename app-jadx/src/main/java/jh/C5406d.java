package jh;

/* JADX INFO: renamed from: jh.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5406d extends AbstractC5403a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f51946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f51947d;

    public C5406d(C5404b c5404b, byte[] bArr) {
        super(false, c5404b);
        byte[] bArrM = Oh.a.m(bArr, 0, 32);
        this.f51946c = bArrM;
        this.f51947d = Oh.a.m(bArr, bArrM.length, bArr.length);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[b().a()];
        byte[] bArr2 = this.f51946c;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        byte[] bArr3 = this.f51947d;
        System.arraycopy(bArr3, 0, bArr, this.f51946c.length, bArr3.length);
        return bArr;
    }
}
