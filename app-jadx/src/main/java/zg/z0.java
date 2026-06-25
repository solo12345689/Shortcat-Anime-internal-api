package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class z0 extends AbstractC7394b {
    z0(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    static void G(C7430w c7430w, boolean z10, byte b10, byte[] bArr, int i10, int i11) throws IOException {
        c7430w.n(z10, 3, b10, bArr, i10, i11);
    }

    static void I(C7430w c7430w, boolean z10, byte[] bArr, int i10, int i11) {
        c7430w.p(z10, 3, bArr, i10, i11);
    }

    static int K(boolean z10, int i10) {
        return C7430w.g(z10, i10);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 3, this.f66384a);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66384a.length);
    }

    @Override // zg.AbstractC7394b, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
