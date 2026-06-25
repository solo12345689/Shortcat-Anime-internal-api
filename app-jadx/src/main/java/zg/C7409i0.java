package zg;

/* JADX INFO: renamed from: zg.i0 */
/* JADX INFO: loaded from: classes5.dex */
public class C7409i0 extends C7412k {
    public C7409i0(byte[] bArr) {
        super(bArr);
    }

    private byte[] F() {
        byte[] bArr = this.f66417a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!A()) {
            byte[] bArr2 = this.f66417a;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(Oh.i.e("0000Z"), 0, bArr3, this.f66417a.length - 1, 5);
            return bArr3;
        }
        if (!B()) {
            byte[] bArr4 = this.f66417a;
            byte[] bArr5 = new byte[bArr4.length + 2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(Oh.i.e("00Z"), 0, bArr5, this.f66417a.length - 1, 3);
            return bArr5;
        }
        if (!z()) {
            return this.f66417a;
        }
        int length = this.f66417a.length - 2;
        while (length > 0 && this.f66417a[length] == 48) {
            length--;
        }
        byte[] bArr6 = this.f66417a;
        if (bArr6[length] == 46) {
            byte[] bArr7 = new byte[length + 1];
            System.arraycopy(bArr6, 0, bArr7, 0, length);
            bArr7[length] = 90;
            return bArr7;
        }
        byte[] bArr8 = new byte[length + 2];
        int i10 = length + 1;
        System.arraycopy(bArr6, 0, bArr8, 0, i10);
        bArr8[i10] = 90;
        return bArr8;
    }

    @Override // zg.C7412k, zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 24, F());
    }

    @Override // zg.C7412k, zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, F().length);
    }

    @Override // zg.C7412k, zg.AbstractC7432y
    AbstractC7432y w() {
        return this;
    }

    @Override // zg.AbstractC7432y
    AbstractC7432y x() {
        return this;
    }
}
