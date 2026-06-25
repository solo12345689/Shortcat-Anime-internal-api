package sh;

import zg.C7427t;

/* JADX INFO: loaded from: classes5.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Fg.j f59853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f59854b;

    protected h(C7427t c7427t, int i10) {
        if (c7427t == null) {
            throw new NullPointerException("digest == null");
        }
        this.f59853a = f.a(c7427t);
        this.f59854b = i10;
    }

    private byte[] d(int i10, byte[] bArr, byte[] bArr2) {
        byte[] bArrQ = AbstractC6533A.q(i10, this.f59854b);
        this.f59853a.update(bArrQ, 0, bArrQ.length);
        this.f59853a.update(bArr, 0, bArr.length);
        this.f59853a.update(bArr2, 0, bArr2.length);
        int i11 = this.f59854b;
        byte[] bArr3 = new byte[i11];
        Fg.j jVar = this.f59853a;
        if (jVar instanceof Fg.q) {
            ((Fg.q) jVar).e(bArr3, 0, i11);
            return bArr3;
        }
        jVar.a(bArr3, 0);
        return bArr3;
    }

    protected byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f59854b;
        if (length != i10) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i10) {
            return d(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    protected byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f59854b;
        if (length != i10) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i10 * 2) {
            return d(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    protected byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f59854b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }
}
