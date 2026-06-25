package zg;

import java.io.IOException;

/* JADX INFO: renamed from: zg.e0 */
/* JADX INFO: loaded from: classes5.dex */
public class C7401e0 extends AbstractC7394b {
    public C7401e0(InterfaceC7400e interfaceC7400e) {
        super(interfaceC7400e.e().i("DER"), 0);
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        byte[] bArr = this.f66384a;
        int i10 = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b10 = bArr[length];
        byte b11 = (byte) ((255 << i10) & b10);
        if (b10 == b11) {
            c7430w.o(z10, 3, bArr);
        } else {
            c7430w.q(z10, 3, bArr, 0, length, b11);
        }
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66384a.length);
    }

    public C7401e0(byte[] bArr) {
        this(bArr, 0);
    }

    public C7401e0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    C7401e0(byte[] bArr, boolean z10) {
        super(bArr, z10);
    }

    @Override // zg.AbstractC7394b, zg.AbstractC7432y
    AbstractC7432y w() {
        return this;
    }

    @Override // zg.AbstractC7394b, zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
