package zg;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class T extends AbstractC7428u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f66372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC7428u[] f66373e;

    public T(byte[] bArr) {
        this(bArr, 1000);
    }

    static byte[] D(AbstractC7428u[] abstractC7428uArr) {
        int length = abstractC7428uArr.length;
        if (length == 0) {
            return AbstractC7428u.f66445c;
        }
        if (length == 1) {
            return abstractC7428uArr[0].f66446a;
        }
        int length2 = 0;
        for (AbstractC7428u abstractC7428u : abstractC7428uArr) {
            length2 += abstractC7428u.f66446a.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (AbstractC7428u abstractC7428u2 : abstractC7428uArr) {
            byte[] bArr2 = abstractC7428u2.f66446a;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) throws IOException {
        c7430w.s(z10, 36);
        c7430w.i(128);
        AbstractC7428u[] abstractC7428uArr = this.f66373e;
        if (abstractC7428uArr == null) {
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f66446a;
                if (i10 >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i10, this.f66372d);
                C7419n0.D(c7430w, true, this.f66446a, i10, iMin);
                i10 += iMin;
            }
        } else {
            c7430w.v(abstractC7428uArr);
        }
        c7430w.i(0);
        c7430w.i(0);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return true;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        int iT = z10 ? 4 : 3;
        if (this.f66373e == null) {
            int length = this.f66446a.length;
            int i10 = this.f66372d;
            int i11 = length / i10;
            int iF = iT + (C7419n0.F(true, i10) * i11);
            int length2 = this.f66446a.length - (i11 * this.f66372d);
            return length2 > 0 ? iF + C7419n0.F(true, length2) : iF;
        }
        int i12 = 0;
        while (true) {
            AbstractC7428u[] abstractC7428uArr = this.f66373e;
            if (i12 >= abstractC7428uArr.length) {
                return iT;
            }
            iT += abstractC7428uArr[i12].t(true);
            i12++;
        }
    }

    public T(byte[] bArr, int i10) {
        this(bArr, null, i10);
    }

    private T(byte[] bArr, AbstractC7428u[] abstractC7428uArr, int i10) {
        super(bArr);
        this.f66373e = abstractC7428uArr;
        this.f66372d = i10;
    }

    public T(AbstractC7428u[] abstractC7428uArr) {
        this(abstractC7428uArr, 1000);
    }

    public T(AbstractC7428u[] abstractC7428uArr, int i10) {
        this(D(abstractC7428uArr), abstractC7428uArr, i10);
    }
}
