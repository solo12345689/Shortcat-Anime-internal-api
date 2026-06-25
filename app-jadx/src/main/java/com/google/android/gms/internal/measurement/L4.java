package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class L4 extends N4 {

    /* JADX INFO: renamed from: e */
    private final byte[] f39413e;

    /* JADX INFO: renamed from: f */
    private final int f39414f;

    /* JADX INFO: renamed from: g */
    private int f39415g;

    L4(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f39413e = bArr;
        this.f39415g = 0;
        this.f39414f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void A(long j10) throws M4 {
        int i10 = this.f39415g;
        try {
            byte[] bArr = this.f39413e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f39415g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(i10, this.f39414f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void B(byte[] bArr, int i10, int i11) throws M4 {
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void C(String str) throws M4 {
        int i10 = this.f39415g;
        try {
            int iE = N4.E(str.length() * 3);
            int iE2 = N4.E(str.length());
            if (iE2 != iE) {
                x(AbstractC3506k6.b(str));
                byte[] bArr = this.f39413e;
                int i11 = this.f39415g;
                this.f39415g = AbstractC3506k6.c(str, bArr, i11, this.f39414f - i11);
                return;
            }
            int i12 = i10 + iE2;
            this.f39415g = i12;
            int iC = AbstractC3506k6.c(str, this.f39413e, i12, this.f39414f - i12);
            this.f39415g = i10;
            x((iC - i10) - iE2);
            this.f39415g = iC;
        } catch (C3497j6 e10) {
            this.f39415g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new M4(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final int D() {
        return this.f39414f - this.f39415g;
    }

    public final void F(byte[] bArr, int i10, int i11) throws M4 {
        try {
            System.arraycopy(bArr, 0, this.f39413e, this.f39415g, i11);
            this.f39415g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(this.f39415g, this.f39414f, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void i(int i10, int i11) throws M4 {
        x((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void j(int i10, int i11) throws M4 {
        x(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void k(int i10, int i11) throws M4 {
        x(i10 << 3);
        x(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void l(int i10, int i11) throws M4 {
        x((i10 << 3) | 5);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void m(int i10, long j10) throws M4 {
        x(i10 << 3);
        z(j10);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void n(int i10, long j10) throws M4 {
        x((i10 << 3) | 1);
        A(j10);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void o(int i10, boolean z10) throws M4 {
        x(i10 << 3);
        v(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void p(int i10, String str) throws M4 {
        x((i10 << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void q(int i10, I4 i42) throws M4 {
        x((i10 << 3) | 2);
        r(i42);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void r(I4 i42) throws M4 {
        x(i42.d());
        i42.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void s(byte[] bArr, int i10, int i11) throws M4 {
        x(i11);
        F(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    final void t(int i10, E5 e52, P5 p52) throws M4 {
        x((i10 << 3) | 2);
        x(((AbstractC3593u4) e52).f(p52));
        p52.h(e52, this.f39513a);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void u(E5 e52) throws M4 {
        x(e52.a());
        e52.c(this);
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void v(byte b10) throws M4 {
        int i10;
        int i11 = this.f39415g;
        try {
            i10 = i11 + 1;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
        try {
            this.f39413e[i11] = b10;
            this.f39415g = i10;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            i11 = i10;
            throw new M4(i11, this.f39414f, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void w(int i10) throws M4 {
        if (i10 >= 0) {
            x(i10);
        } else {
            z(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void x(int i10) throws M4 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f39415g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new M4(i12, this.f39414f, 1, indexOutOfBoundsException);
            }
            try {
                this.f39413e[i12] = (byte) (i10 | 128);
                i10 >>>= 7;
                i12 = i11;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i11;
                throw new M4(i12, this.f39414f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f39413e[i12] = (byte) i10;
        this.f39415g = i11;
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void y(int i10) throws M4 {
        int i11 = this.f39415g;
        try {
            byte[] bArr = this.f39413e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f39415g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(i11, this.f39414f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N4
    public final void z(long j10) throws M4 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        boolean z10 = N4.f39511c;
        int i12 = this.f39415g;
        if (!z10 || this.f39414f - i12 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
                try {
                    this.f39413e[i12] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i12 = i11;
                    throw new M4(i12, this.f39414f, 1, indexOutOfBoundsException);
                }
            }
            i10 = i12 + 1;
            try {
                this.f39413e[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new M4(i12, this.f39414f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC3479h6.u(this.f39413e, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i12++;
            }
            i10 = i12 + 1;
            AbstractC3479h6.u(this.f39413e, i12, (byte) j10);
        }
        this.f39415g = i10;
    }
}
