package sh;

/* JADX INFO: loaded from: classes5.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f59881a;

    protected n(m mVar, byte[][] bArr) {
        if (mVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (AbstractC6533A.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != mVar.a()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != mVar.c()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.f59881a = AbstractC6533A.d(bArr);
    }

    protected byte[][] a() {
        return AbstractC6533A.d(this.f59881a);
    }
}
