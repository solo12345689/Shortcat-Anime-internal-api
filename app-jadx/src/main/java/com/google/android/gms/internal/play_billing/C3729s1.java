package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class C3729s1 extends AbstractC3744v1 {

    /* JADX INFO: renamed from: e */
    private final byte[] f40547e;

    /* JADX INFO: renamed from: f */
    private final int f40548f;

    /* JADX INFO: renamed from: g */
    private int f40549g;

    C3729s1(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f40547e = bArr;
        this.f40549g = 0;
        this.f40548f = i11;
    }

    public final void A(byte[] bArr, int i10, int i11) throws C3734t1 {
        try {
            System.arraycopy(bArr, 0, this.f40547e, this.f40549g, i11);
            this.f40549g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C3734t1(this.f40549g, this.f40548f, i11, e10);
        }
    }

    public final void B(AbstractC3710o1 abstractC3710o1) throws C3734t1 {
        w(abstractC3710o1.d());
        abstractC3710o1.i(this);
    }

    public final void C(String str) throws C3734t1 {
        int i10 = this.f40549g;
        try {
            int iC = AbstractC3744v1.c(str.length() * 3);
            int iC2 = AbstractC3744v1.c(str.length());
            if (iC2 != iC) {
                w(F2.c(str));
                byte[] bArr = this.f40547e;
                int i11 = this.f40549g;
                this.f40549g = F2.b(str, bArr, i11, this.f40548f - i11);
                return;
            }
            int i12 = i10 + iC2;
            this.f40549g = i12;
            int iB = F2.b(str, this.f40547e, i12, this.f40548f - i12);
            this.f40549g = i10;
            w((iB - i10) - iC2);
            this.f40549g = iB;
        } catch (E2 e10) {
            this.f40549g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C3734t1(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final int h() {
        return this.f40548f - this.f40549g;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void i(byte b10) throws C3734t1 {
        int i10;
        int i11 = this.f40549g;
        try {
            i10 = i11 + 1;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
        try {
            this.f40547e[i11] = b10;
            this.f40549g = i10;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            i11 = i10;
            throw new C3734t1(i11, this.f40548f, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void j(int i10, boolean z10) throws C3734t1 {
        w(i10 << 3);
        i(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void k(int i10, AbstractC3710o1 abstractC3710o1) throws C3734t1 {
        w((i10 << 3) | 2);
        B(abstractC3710o1);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void l(int i10, int i11) throws C3734t1 {
        w((i10 << 3) | 5);
        m(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void m(int i10) throws C3734t1 {
        int i11 = this.f40549g;
        try {
            byte[] bArr = this.f40547e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f40549g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C3734t1(i11, this.f40548f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void n(int i10, long j10) throws C3734t1 {
        w((i10 << 3) | 1);
        o(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void o(long j10) throws C3734t1 {
        int i10 = this.f40549g;
        try {
            byte[] bArr = this.f40547e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f40549g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C3734t1(i10, this.f40548f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void p(int i10, int i11) throws C3734t1 {
        w(i10 << 3);
        q(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void q(int i10) throws C3734t1 {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void r(byte[] bArr, int i10, int i11) throws C3734t1 {
        A(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    final void s(int i10, InterfaceC3666f2 interfaceC3666f2, InterfaceC3716p2 interfaceC3716p2) throws C3734t1 {
        w((i10 << 3) | 2);
        w(((AbstractC3640a1) interfaceC3666f2).e(interfaceC3716p2));
        interfaceC3716p2.d(interfaceC3666f2, this.f40577a);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void t(int i10, String str) throws C3734t1 {
        w((i10 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void u(int i10, int i11) throws C3734t1 {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void v(int i10, int i11) throws C3734t1 {
        w(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void w(int i10) throws C3734t1 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f40549g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new C3734t1(i12, this.f40548f, 1, indexOutOfBoundsException);
            }
            try {
                this.f40547e[i12] = (byte) (i10 | 128);
                i10 >>>= 7;
                i12 = i11;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i11;
                throw new C3734t1(i12, this.f40548f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f40547e[i12] = (byte) i10;
        this.f40549g = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void x(int i10, long j10) throws C3734t1 {
        w(i10 << 3);
        y(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3744v1
    public final void y(long j10) throws C3734t1 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        int i12 = this.f40549g;
        if (!AbstractC3744v1.f40575c || this.f40548f - i12 < 10) {
            int i13 = i12;
            while ((j10 & (-128)) != 0) {
                try {
                    i11 = i13 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
                try {
                    this.f40547e[i13] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i13 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i13 = i11;
                    throw new C3734t1(i13, this.f40548f, 1, indexOutOfBoundsException);
                }
            }
            i10 = i13 + 1;
            try {
                this.f40547e[i13] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i13 = i10;
                throw new C3734t1(i13, this.f40548f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                C2.s(this.f40547e, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i12++;
            }
            i10 = i12 + 1;
            C2.s(this.f40547e, i12, (byte) j10);
        }
        this.f40549g = i10;
    }
}
