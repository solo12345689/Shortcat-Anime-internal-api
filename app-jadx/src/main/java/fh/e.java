package fh;

/* JADX INFO: loaded from: classes5.dex */
public class e extends AbstractC4809b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f47111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final byte[] f47112d;

    public e(C4810c c4810c, byte[] bArr) {
        super(false, c4810c);
        this.f47111c = Oh.a.m(bArr, 0, 32);
        byte[] bArrM = Oh.a.m(bArr, 32, bArr.length);
        this.f47112d = bArrM;
        if (bArrM.length == 0) {
            throw new IllegalArgumentException("encoding too short");
        }
    }

    static byte[] c(byte[] bArr, byte[] bArr2) {
        return Oh.a.h(bArr, bArr2);
    }

    public byte[] d() {
        return Oh.a.f(this.f47112d);
    }

    public byte[] getEncoded() {
        return c(this.f47111c, this.f47112d);
    }

    public e(C4810c c4810c, byte[] bArr, byte[] bArr2) {
        super(false, c4810c);
        if (bArr == null) {
            throw new NullPointerException("rho cannot be null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("t1 cannot be null");
        }
        this.f47111c = Oh.a.f(bArr);
        this.f47112d = Oh.a.f(bArr2);
    }
}
