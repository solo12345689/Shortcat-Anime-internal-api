package t2;

import P9.AbstractC2013w;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: renamed from: t2.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6609I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f60530d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f60531e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AbstractC2013w f60532f = AbstractC2013w.F(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f60533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60535c;

    public C6609I() {
        this.f60533a = a0.f60567f;
    }

    private static int c(int i10, int i11, int i12, int i13) {
        byte b10 = (byte) i12;
        return S9.f.i((byte) 0, S9.i.a(((i10 & 7) << 2) | ((i11 & 48) >> 4)), S9.i.a(((((byte) i11) & 15) << 4) | ((b10 & 60) >> 2)), S9.i.a(((b10 & 3) << 6) | (((byte) i13) & 63)));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L41
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2a
            goto L41
        L2a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported charset: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L41:
            r0 = 2
            goto L44
        L43:
            r0 = 1
        L44:
            int r1 = r4.f60534b
        L46:
            int r2 = r4.f60535c
            int r3 = r0 + (-1)
            int r3 = r2 - r3
            if (r1 >= r3) goto La5
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5e
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L69
        L5e:
            byte[] r2 = r4.f60533a
            r2 = r2[r1]
            boolean r2 = t2.a0.N0(r2)
            if (r2 == 0) goto L69
            goto La2
        L69:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L79
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
        L79:
            byte[] r2 = r4.f60533a
            r3 = r2[r1]
            if (r3 != 0) goto L8a
            int r3 = r1 + 1
            r2 = r2[r3]
            boolean r2 = t2.a0.N0(r2)
            if (r2 == 0) goto L8a
            goto La2
        L8a:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto La3
            byte[] r2 = r4.f60533a
            int r3 = r1 + 1
            r3 = r2[r3]
            if (r3 != 0) goto La3
            r2 = r2[r1]
            boolean r2 = t2.a0.N0(r2)
            if (r2 == 0) goto La3
        La2:
            return r1
        La3:
            int r1 = r1 + r0
            goto L46
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C6609I.e(java.nio.charset.Charset):int");
    }

    private void e0(Charset charset) {
        if (r(charset, f60530d) == '\r') {
            r(charset, f60531e);
        }
    }

    private static int h(Charset charset) {
        AbstractC6614a.b(f60532f.contains(charset), "Unsupported charset: " + charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean i(byte b10) {
        return (b10 & 192) == 128;
    }

    private char k(ByteOrder byteOrder, int i10) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f60533a;
            int i11 = this.f60534b;
            return S9.b.c(bArr[i11 + i10], bArr[i11 + i10 + 1]);
        }
        byte[] bArr2 = this.f60533a;
        int i12 = this.f60534b;
        return S9.b.c(bArr2[i12 + i10 + 1], bArr2[i12 + i10]);
    }

    private int m(Charset charset) {
        int codePoint;
        int iB;
        AbstractC6614a.b(f60532f.contains(charset), "Unsupported charset: " + charset);
        if (a() < h(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f60534b + ", limit=" + this.f60535c);
        }
        byte b10 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b11 = this.f60533a[this.f60534b];
            if ((b11 & 128) != 0) {
                return 0;
            }
            codePoint = S9.i.b(b11);
        } else if (charset.equals(StandardCharsets.UTF_8)) {
            byte bO = o();
            if (bO == 1) {
                iB = S9.i.b(this.f60533a[this.f60534b]);
            } else if (bO == 2) {
                byte[] bArr = this.f60533a;
                int i10 = this.f60534b;
                iB = c(0, 0, bArr[i10], bArr[i10 + 1]);
            } else if (bO == 3) {
                byte[] bArr2 = this.f60533a;
                int i11 = this.f60534b;
                iB = c(0, bArr2[i11] & 15, bArr2[i11 + 1], bArr2[i11 + 2]);
            } else {
                if (bO != 4) {
                    return 0;
                }
                byte[] bArr3 = this.f60533a;
                int i12 = this.f60534b;
                iB = c(bArr3[i12], bArr3[i12 + 1], bArr3[i12 + 2], bArr3[i12 + 3]);
            }
            b10 = bO;
            codePoint = iB;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cK = k(byteOrder, 0);
            if (!Character.isHighSurrogate(cK) || a() < 4) {
                codePoint = cK;
                b10 = 2;
            } else {
                codePoint = Character.toCodePoint(cK, k(byteOrder, 2));
                b10 = 4;
            }
        }
        return (codePoint << 8) | b10;
    }

    private byte o() {
        byte b10 = this.f60533a[this.f60534b];
        if ((b10 & 128) == 0) {
            return (byte) 1;
        }
        if ((b10 & 224) == 192 && a() >= 2 && i(this.f60533a[this.f60534b + 1])) {
            return (byte) 2;
        }
        if ((this.f60533a[this.f60534b] & 240) == 224 && a() >= 3 && i(this.f60533a[this.f60534b + 1]) && i(this.f60533a[this.f60534b + 2])) {
            return (byte) 3;
        }
        return ((this.f60533a[this.f60534b] & 248) == 240 && a() >= 4 && i(this.f60533a[this.f60534b + 1]) && i(this.f60533a[this.f60534b + 2]) && i(this.f60533a[this.f60534b + 3])) ? (byte) 4 : (byte) 0;
    }

    private char r(Charset charset, char[] cArr) {
        int iM;
        if (a() < h(charset) || (iM = m(charset)) == 0) {
            return (char) 0;
        }
        int iA = S9.j.a(iM >>> 8);
        if (Character.isSupplementaryCodePoint(iA)) {
            return (char) 0;
        }
        char cA = S9.b.a(iA);
        if (!S9.b.b(cArr, cA)) {
            return (char) 0;
        }
        this.f60534b += S9.f.e(iM & 255);
        return cA;
    }

    public long A() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f60534b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f60534b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        int i14 = i10 + 4;
        this.f60534b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i10 + 5;
        this.f60534b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 32);
        int i16 = i10 + 6;
        this.f60534b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 40);
        int i17 = i10 + 7;
        this.f60534b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 48);
        this.f60534b = i10 + 8;
        return ((((long) bArr[i17]) & 255) << 56) | j16;
    }

    public short B() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = bArr[i10] & 255;
        this.f60534b = i10 + 2;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long C() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        long j10 = ((long) bArr[i10]) & 255;
        int i12 = i10 + 2;
        this.f60534b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 8);
        int i13 = i10 + 3;
        this.f60534b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 16);
        this.f60534b = i10 + 4;
        return ((((long) bArr[i13]) & 255) << 24) | j12;
    }

    public int D() {
        int iZ = z();
        if (iZ >= 0) {
            return iZ;
        }
        throw new IllegalStateException("Top bit not zero: " + iZ);
    }

    public int E() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = bArr[i10] & 255;
        this.f60534b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public long F() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 56;
        int i12 = i10 + 2;
        this.f60534b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 48);
        int i13 = i10 + 3;
        this.f60534b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 40);
        int i14 = i10 + 4;
        this.f60534b = i14;
        long j13 = j12 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i10 + 5;
        this.f60534b = i15;
        long j14 = j13 | ((((long) bArr[i14]) & 255) << 24);
        int i16 = i10 + 6;
        this.f60534b = i16;
        long j15 = j14 | ((((long) bArr[i15]) & 255) << 16);
        int i17 = i10 + 7;
        this.f60534b = i17;
        long j16 = j15 | ((((long) bArr[i16]) & 255) << 8);
        this.f60534b = i10 + 8;
        return (((long) bArr[i17]) & 255) | j16;
    }

    public String G() {
        return s((char) 0);
    }

    public String H(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f60534b;
        int i12 = (i11 + i10) - 1;
        String strK = a0.K(this.f60533a, i11, (i12 >= this.f60535c || this.f60533a[i12] != 0) ? i10 : i10 - 1);
        this.f60534b += i10;
        return strK;
    }

    public short I() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f60534b = i10 + 2;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String J(int i10) {
        return K(i10, StandardCharsets.UTF_8);
    }

    public String K(int i10, Charset charset) {
        String str = new String(this.f60533a, this.f60534b, i10, charset);
        this.f60534b += i10;
        return str;
    }

    public int L() {
        return (M() << 21) | (M() << 14) | (M() << 7) | M();
    }

    public int M() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        this.f60534b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int N() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f60534b = i10 + 2;
        int i13 = (bArr[i11] & 255) | i12;
        this.f60534b = i10 + 4;
        return i13;
    }

    public long O() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        long j10 = (((long) bArr[i10]) & 255) << 24;
        int i12 = i10 + 2;
        this.f60534b = i12;
        long j11 = j10 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i10 + 3;
        this.f60534b = i13;
        long j12 = j11 | ((((long) bArr[i12]) & 255) << 8);
        this.f60534b = i10 + 4;
        return (((long) bArr[i13]) & 255) | j12;
    }

    public int P() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = (bArr[i10] & 255) << 16;
        int i13 = i10 + 2;
        this.f60534b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f60534b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public int Q() {
        int iV = v();
        if (iV >= 0) {
            return iV;
        }
        throw new IllegalStateException("Top bit not zero: " + iV);
    }

    public int R() {
        return S9.f.e(S());
    }

    public long S() {
        long j10 = 0;
        for (int i10 = 0; i10 < 9; i10++) {
            if (this.f60534b == this.f60535c) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM = M();
            j10 |= (127 & jM) << (i10 * 7);
            if ((jM & 128) == 0) {
                return j10;
            }
        }
        return j10;
    }

    public long T() {
        long jF = F();
        if (jF >= 0) {
            return jF;
        }
        throw new IllegalStateException("Top bit not zero: " + jF);
    }

    public int U() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = (bArr[i10] & 255) << 8;
        this.f60534b = i10 + 2;
        return (bArr[i11] & 255) | i12;
    }

    public long V() {
        int i10;
        int i11;
        long j10 = this.f60533a[this.f60534b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            byte b10 = this.f60533a[this.f60534b + i10];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f60534b += i11;
        return j10;
    }

    public Charset W() {
        if (a() >= 3) {
            byte[] bArr = this.f60533a;
            int i10 = this.f60534b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f60534b = i10 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f60533a;
        int i11 = this.f60534b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f60534b = i11 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f60534b = i11 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void X(int i10) {
        Z(b() < i10 ? new byte[i10] : this.f60533a, i10);
    }

    public void Y(byte[] bArr) {
        Z(bArr, bArr.length);
    }

    public void Z(byte[] bArr, int i10) {
        this.f60533a = bArr;
        this.f60535c = i10;
        this.f60534b = 0;
    }

    public int a() {
        return Math.max(this.f60535c - this.f60534b, 0);
    }

    public void a0(int i10) {
        AbstractC6614a.a(i10 >= 0 && i10 <= this.f60533a.length);
        this.f60535c = i10;
    }

    public int b() {
        return this.f60533a.length;
    }

    public void b0(int i10) {
        AbstractC6614a.a(i10 >= 0 && i10 <= this.f60535c);
        this.f60534b = i10;
    }

    public void c0(int i10) {
        b0(this.f60534b + i10);
    }

    public void d(int i10) {
        if (i10 > b()) {
            this.f60533a = Arrays.copyOf(this.f60533a, i10);
        }
    }

    public void d0() {
        while ((M() & 128) != 0) {
        }
    }

    public byte[] f() {
        return this.f60533a;
    }

    public int g() {
        return this.f60534b;
    }

    public int j() {
        return this.f60535c;
    }

    public int l(Charset charset) {
        if (m(charset) != 0) {
            return S9.f.e(r3 >>> 8);
        }
        return 1114112;
    }

    public int n() {
        return this.f60533a[this.f60534b] & 255;
    }

    public void p(C6608H c6608h, int i10) {
        q(c6608h.f60526a, 0, i10);
        c6608h.p(0);
    }

    public void q(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f60533a, this.f60534b, bArr, i10, i11);
        this.f60534b += i11;
    }

    public String s(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f60534b;
        while (i10 < this.f60535c && this.f60533a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f60533a;
        int i11 = this.f60534b;
        String strK = a0.K(bArr, i11, i10 - i11);
        this.f60534b = i10;
        if (i10 < this.f60535c) {
            this.f60534b = i10 + 1;
        }
        return strK;
    }

    public double t() {
        return Double.longBitsToDouble(F());
    }

    public float u() {
        return Float.intBitsToFloat(v());
    }

    public int v() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = (bArr[i10] & 255) << 24;
        int i13 = i10 + 2;
        this.f60534b = i13;
        int i14 = ((bArr[i11] & 255) << 16) | i12;
        int i15 = i10 + 3;
        this.f60534b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        this.f60534b = i10 + 4;
        return (bArr[i15] & 255) | i16;
    }

    public int w() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = ((bArr[i10] & 255) << 24) >> 8;
        int i13 = i10 + 2;
        this.f60534b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        this.f60534b = i10 + 3;
        return (bArr[i13] & 255) | i14;
    }

    public String x() {
        return y(StandardCharsets.UTF_8);
    }

    public String y(Charset charset) {
        AbstractC6614a.b(f60532f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            W();
        }
        String strK = K(e(charset) - this.f60534b, charset);
        if (this.f60534b == this.f60535c) {
            return strK;
        }
        e0(charset);
        return strK;
    }

    public int z() {
        byte[] bArr = this.f60533a;
        int i10 = this.f60534b;
        int i11 = i10 + 1;
        this.f60534b = i11;
        int i12 = bArr[i10] & 255;
        int i13 = i10 + 2;
        this.f60534b = i13;
        int i14 = ((bArr[i11] & 255) << 8) | i12;
        int i15 = i10 + 3;
        this.f60534b = i15;
        int i16 = i14 | ((bArr[i13] & 255) << 16);
        this.f60534b = i10 + 4;
        return ((bArr[i15] & 255) << 24) | i16;
    }

    public C6609I(int i10) {
        this.f60533a = new byte[i10];
        this.f60535c = i10;
    }

    public C6609I(byte[] bArr) {
        this.f60533a = bArr;
        this.f60535c = bArr.length;
    }

    public C6609I(byte[] bArr, int i10) {
        this.f60533a = bArr;
        this.f60535c = i10;
    }
}
