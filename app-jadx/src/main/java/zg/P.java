package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class P extends AbstractC7394b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f66362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC7394b[] f66363e;

    public P(byte[] bArr, int i10) {
        this(bArr, i10, 1000);
    }

    static byte[] G(AbstractC7394b[] abstractC7394bArr) {
        int length = abstractC7394bArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC7394bArr[0].f66384a;
        }
        int i10 = length - 1;
        int length2 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr = abstractC7394bArr[i11].f66384a;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            length2 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC7394bArr[i10].f66384a;
        byte b10 = bArr2[0];
        byte[] bArr3 = new byte[length2 + bArr2.length];
        bArr3[0] = b10;
        int i12 = 1;
        for (AbstractC7394b abstractC7394b : abstractC7394bArr) {
            byte[] bArr4 = abstractC7394b.f66384a;
            int length3 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i12, length3);
            i12 += length3;
        }
        return bArr3;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        C7430w c7430w2;
        if (!p()) {
            byte[] bArr = this.f66384a;
            z0.I(c7430w, z10, bArr, 0, bArr.length);
            return;
        }
        c7430w.s(z10, 35);
        c7430w.i(128);
        AbstractC7394b[] abstractC7394bArr = this.f66363e;
        if (abstractC7394bArr == null) {
            byte[] bArr2 = this.f66384a;
            if (bArr2.length >= 2) {
                byte b10 = bArr2[0];
                int length = bArr2.length;
                int i10 = length - 1;
                int i11 = this.f66362d - 1;
                while (i10 > i11) {
                    C7430w c7430w3 = c7430w;
                    z0.G(c7430w3, true, (byte) 0, this.f66384a, length - i10, i11);
                    i10 -= i11;
                    c7430w = c7430w3;
                }
                c7430w2 = c7430w;
                z0.G(c7430w2, true, b10, this.f66384a, length - i10, i10);
            }
            c7430w2.i(0);
            c7430w2.i(0);
        }
        c7430w.v(abstractC7394bArr);
        c7430w2 = c7430w;
        c7430w2.i(0);
        c7430w2.i(0);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return this.f66363e != null || this.f66384a.length > this.f66362d;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        if (!p()) {
            return z0.K(z10, this.f66384a.length);
        }
        int iT = z10 ? 4 : 3;
        if (this.f66363e == null) {
            byte[] bArr = this.f66384a;
            if (bArr.length < 2) {
                return iT;
            }
            int length = bArr.length - 2;
            int i10 = this.f66362d;
            int i11 = length / (i10 - 1);
            return iT + (z0.K(true, i10) * i11) + z0.K(true, this.f66384a.length - (i11 * (this.f66362d - 1)));
        }
        int i12 = 0;
        while (true) {
            AbstractC7394b[] abstractC7394bArr = this.f66363e;
            if (i12 >= abstractC7394bArr.length) {
                return iT;
            }
            iT += abstractC7394bArr[i12].t(true);
            i12++;
        }
    }

    public P(byte[] bArr, int i10, int i11) {
        super(bArr, i10);
        this.f66363e = null;
        this.f66362d = i11;
    }

    public P(AbstractC7394b[] abstractC7394bArr) {
        this(abstractC7394bArr, 1000);
    }

    public P(AbstractC7394b[] abstractC7394bArr, int i10) {
        super(G(abstractC7394bArr), false);
        this.f66363e = abstractC7394bArr;
        this.f66362d = i10;
    }
}
