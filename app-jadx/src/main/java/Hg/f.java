package Hg;

/* JADX INFO: loaded from: classes5.dex */
public class f extends b {
    public f(int i10) {
        super(r(i10), Fg.d.ANY);
    }

    private static int r(int i10) {
        if (i10 == 224 || i10 == 256 || i10 == 384 || i10 == 512) {
            return i10;
        }
        throw new IllegalArgumentException("'bitLength' " + i10 + " not supported for SHA-3");
    }

    @Override // Hg.b, Fg.j
    public int a(byte[] bArr, int i10) {
        k(2, 2);
        return super.a(bArr, i10);
    }

    @Override // Fg.j
    public String c() {
        return "SHA3-" + this.f8613f;
    }
}
