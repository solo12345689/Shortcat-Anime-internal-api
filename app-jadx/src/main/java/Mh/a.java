package Mh;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes5.dex */
public class a extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[][] f12442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12443d;

    public a(int i10, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i10 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.f12454b = i10;
        this.f12453a = iArr.length;
        this.f12443d = iArr2.length;
        int i11 = i10 & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.f12453a; i13++) {
            int[] iArr3 = iArr[i13];
            int i14 = this.f12443d - 1;
            iArr3[i14] = iArr3[i14] & i12;
        }
        this.f12442c = iArr;
    }

    public byte[] c() {
        int i10 = (this.f12454b + 7) >>> 3;
        int i11 = this.f12453a;
        int i12 = 8;
        byte[] bArr = new byte[(i10 * i11) + 8];
        f.a(i11, bArr, 0);
        f.a(this.f12454b, bArr, 4);
        int i13 = this.f12454b;
        int i14 = i13 >>> 5;
        int i15 = i13 & 31;
        for (int i16 = 0; i16 < this.f12453a; i16++) {
            int i17 = 0;
            while (i17 < i14) {
                f.a(this.f12442c[i16][i17], bArr, i12);
                i17++;
                i12 += 4;
            }
            int i18 = 0;
            while (i18 < i15) {
                bArr[i12] = (byte) ((this.f12442c[i16][i14] >>> i18) & 255);
                i18 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f12453a != aVar.f12453a || this.f12454b != aVar.f12454b || this.f12443d != aVar.f12443d) {
            return false;
        }
        for (int i10 = 0; i10 < this.f12453a; i10++) {
            if (!d.b(this.f12442c[i10], aVar.f12442c[i10])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iT = (((this.f12453a * 31) + this.f12454b) * 31) + this.f12443d;
        for (int i10 = 0; i10 < this.f12453a; i10++) {
            iT = (iT * 31) + Oh.a.t(this.f12442c[i10]);
        }
        return iT;
    }

    public String toString() {
        int i10 = this.f12454b & 31;
        int i11 = this.f12443d;
        if (i10 != 0) {
            i11--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < this.f12453a; i12++) {
            stringBuffer.append(i12 + ": ");
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = this.f12442c[i12][i13];
                for (int i15 = 0; i15 < 32; i15++) {
                    if (((i14 >>> i15) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i16 = this.f12442c[i12][this.f12443d - 1];
            for (int i17 = 0; i17 < i10; i17++) {
                if (((i16 >>> i17) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public a(a aVar) {
        this.f12454b = aVar.a();
        this.f12453a = aVar.b();
        this.f12443d = aVar.f12443d;
        this.f12442c = new int[aVar.f12442c.length][];
        int i10 = 0;
        while (true) {
            int[][] iArr = this.f12442c;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = d.a(aVar.f12442c[i10]);
            i10++;
        }
    }

    public a(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f12453a = f.e(bArr, 0);
        int iE = f.e(bArr, 4);
        this.f12454b = iE;
        int i10 = this.f12453a;
        int i11 = ((iE + 7) >>> 3) * i10;
        if (i10 > 0) {
            int i12 = 8;
            if (i11 == bArr.length - 8) {
                int i13 = (iE + 31) >>> 5;
                this.f12443d = i13;
                this.f12442c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i13);
                int i14 = this.f12454b;
                int i15 = i14 >> 5;
                int i16 = i14 & 31;
                for (int i17 = 0; i17 < this.f12453a; i17++) {
                    int i18 = 0;
                    while (i18 < i15) {
                        this.f12442c[i17][i18] = f.e(bArr, i12);
                        i18++;
                        i12 += 4;
                    }
                    int i19 = 0;
                    while (i19 < i16) {
                        int[] iArr = this.f12442c[i17];
                        iArr[i15] = ((bArr[i12] & 255) << i19) ^ iArr[i15];
                        i19 += 8;
                        i12++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
