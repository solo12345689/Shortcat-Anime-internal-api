package Hg;

import Fg.q;

/* JADX INFO: loaded from: classes5.dex */
public class h extends b implements q {
    public h(int i10) {
        super(r(i10), Fg.d.ANY);
    }

    private static int r(int i10) {
        if (i10 == 128 || i10 == 256) {
            return i10;
        }
        throw new IllegalArgumentException("'bitStrength' " + i10 + " not supported for SHAKE");
    }

    @Override // Hg.b, Fg.j
    public int a(byte[] bArr, int i10) {
        return e(bArr, i10, d());
    }

    @Override // Fg.j
    public String c() {
        return "SHAKE" + this.f8613f;
    }

    @Override // Hg.b, Fg.j
    public int d() {
        return this.f8613f / 4;
    }

    @Override // Fg.q
    public int e(byte[] bArr, int i10, int i11) {
        int iS = s(bArr, i10, i11);
        p();
        return iS;
    }

    @Override // Hg.b
    protected Fg.c l() {
        return i.b(this, this.f8608a);
    }

    public int s(byte[] bArr, int i10, int i11) {
        if (!this.f8614g) {
            k(15, 4);
        }
        q(bArr, i10, ((long) i11) * 8);
        return i11;
    }
}
