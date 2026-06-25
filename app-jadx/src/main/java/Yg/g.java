package Yg;

/* JADX INFO: loaded from: classes5.dex */
public class g extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f22992c;

    public g(f fVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, fVar);
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length];
        this.f22992c = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        int length = bArr.length;
        System.arraycopy(bArr2, 0, bArr6, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr6, length2, bArr3.length);
        int length3 = length2 + bArr3.length;
        System.arraycopy(bArr4, 0, bArr6, length3, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, length3 + bArr4.length, bArr5.length);
    }

    public byte[] c() {
        return Oh.a.m(this.f22992c, (b().c() * 2) + 40, this.f22992c.length - 32);
    }

    public byte[] d() {
        return Oh.a.m(this.f22992c, 32, 40);
    }

    public byte[] e() {
        return Oh.a.m(this.f22992c, 0, 32);
    }

    public byte[] f() {
        return Oh.a.m(this.f22992c, 40, (b().c() * 2) + 40);
    }

    public byte[] g() {
        byte[] bArr = this.f22992c;
        return Oh.a.m(bArr, bArr.length - 32, bArr.length);
    }

    public byte[] getEncoded() {
        return Oh.a.f(this.f22992c);
    }

    public byte[] h() {
        d dVarA = b().a();
        byte[] bArr = new byte[dVarA.d()];
        dVarA.c(this.f22992c);
        return bArr;
    }
}
