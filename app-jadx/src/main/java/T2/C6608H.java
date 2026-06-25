package t2;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: t2.H */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6608H {

    /* JADX INFO: renamed from: a */
    public byte[] f60526a;

    /* JADX INFO: renamed from: b */
    private int f60527b;

    /* JADX INFO: renamed from: c */
    private int f60528c;

    /* JADX INFO: renamed from: d */
    private int f60529d;

    public C6608H() {
        this.f60526a = a0.f60567f;
    }

    private void a() {
        int i10;
        int i11 = this.f60527b;
        AbstractC6614a.g(i11 >= 0 && (i11 < (i10 = this.f60529d) || (i11 == i10 && this.f60528c == 0)));
    }

    public int b() {
        return ((this.f60529d - this.f60527b) * 8) - this.f60528c;
    }

    public void c() {
        if (this.f60528c == 0) {
            return;
        }
        this.f60528c = 0;
        this.f60527b++;
        a();
    }

    public int d() {
        AbstractC6614a.g(this.f60528c == 0);
        return this.f60527b;
    }

    public int e() {
        return (this.f60527b * 8) + this.f60528c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f60528c, i11);
        int i12 = this.f60528c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f60526a;
        int i14 = this.f60527b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f60526a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f60526a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f60526a[this.f60527b] & (128 >> this.f60528c)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f60528c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f60528c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f60528c = i13;
            byte[] bArr = this.f60526a;
            int i14 = this.f60527b;
            this.f60527b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f60526a;
        int i15 = this.f60527b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f60528c = 0;
            this.f60527b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f60526a;
            int i13 = this.f60527b;
            int i14 = i13 + 1;
            this.f60527b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f60528c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f60528c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f60526a;
            int i18 = this.f60527b;
            this.f60527b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f60528c = i17 - 8;
        }
        int i19 = this.f60528c + i16;
        this.f60528c = i19;
        byte[] bArr4 = this.f60526a;
        int i20 = this.f60527b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f60528c = 0;
            this.f60527b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? a0.C1(h(i10)) : a0.B1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        AbstractC6614a.g(this.f60528c == 0);
        System.arraycopy(this.f60526a, this.f60527b, bArr, i10, i11);
        this.f60527b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(C6609I c6609i) {
        o(c6609i.f(), c6609i.j());
        p(c6609i.g() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f60526a = bArr;
        this.f60527b = 0;
        this.f60528c = 0;
        this.f60529d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f60527b = i11;
        this.f60528c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f60528c + 1;
        this.f60528c = i10;
        if (i10 == 8) {
            this.f60528c = 0;
            this.f60527b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f60527b + i11;
        this.f60527b = i12;
        int i13 = this.f60528c + (i10 - (i11 * 8));
        this.f60528c = i13;
        if (i13 > 7) {
            this.f60527b = i12 + 1;
            this.f60528c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        AbstractC6614a.g(this.f60528c == 0);
        this.f60527b += i10;
        a();
    }

    public C6608H(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C6608H(byte[] bArr, int i10) {
        this.f60526a = bArr;
        this.f60529d = i10;
    }
}
