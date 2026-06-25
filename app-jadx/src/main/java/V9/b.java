package V9;

import V9.a;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    /* JADX INFO: renamed from: a */
    static final long[] f19938a;

    /* JADX INFO: renamed from: b */
    static final long[] f19939b;

    /* JADX INFO: renamed from: c */
    static final long[] f19940c;

    /* JADX INFO: renamed from: d */
    static final a.C0342a[][] f19941d;

    /* JADX INFO: renamed from: e */
    static final a.C0342a[] f19942e;

    /* JADX INFO: renamed from: f */
    private static final BigInteger f19943f;

    /* JADX INFO: renamed from: g */
    private static final BigInteger f19944g;

    /* JADX INFO: renamed from: h */
    private static final BigInteger f19945h;

    /* JADX INFO: renamed from: i */
    private static final BigInteger f19946i;

    /* JADX INFO: renamed from: V9.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class C0343b {

        /* JADX INFO: renamed from: a */
        private BigInteger f19947a;

        /* JADX INFO: renamed from: b */
        private BigInteger f19948b;

        private C0343b() {
        }

        /* synthetic */ C0343b(a aVar) {
            this();
        }
    }

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f19943f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f19944g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f19945h = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        f19946i = bigIntegerModPow;
        C0343b c0343b = new C0343b();
        c0343b.f19948b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        c0343b.f19947a = c(c0343b.f19948b);
        f19938a = f.c(d(bigIntegerMod));
        f19939b = f.c(d(bigIntegerMod2));
        f19940c = f.c(d(bigIntegerModPow));
        f19941d = (a.C0342a[][]) Array.newInstance((Class<?>) a.C0342a.class, 32, 8);
        C0343b c0343bA = c0343b;
        for (int i10 = 0; i10 < 32; i10++) {
            C0343b c0343bA2 = c0343bA;
            for (int i11 = 0; i11 < 8; i11++) {
                f19941d[i10][i11] = b(c0343bA2);
                c0343bA2 = a(c0343bA2, c0343bA);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                c0343bA = a(c0343bA, c0343bA);
            }
        }
        C0343b c0343bA3 = a(c0343b, c0343b);
        f19942e = new a.C0342a[8];
        for (int i13 = 0; i13 < 8; i13++) {
            f19942e[i13] = b(c0343b);
            c0343b = a(c0343b, c0343bA3);
        }
    }

    private static C0343b a(C0343b c0343b, C0343b c0343b2) {
        C0343b c0343b3 = new C0343b();
        BigInteger bigIntegerMultiply = f19944g.multiply(c0343b.f19947a.multiply(c0343b2.f19947a).multiply(c0343b.f19948b).multiply(c0343b2.f19948b));
        BigInteger bigInteger = f19943f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = c0343b.f19947a.multiply(c0343b2.f19948b).add(c0343b2.f19947a.multiply(c0343b.f19948b));
        BigInteger bigInteger2 = BigInteger.ONE;
        c0343b3.f19947a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        c0343b3.f19948b = c0343b.f19948b.multiply(c0343b2.f19948b).add(c0343b.f19947a.multiply(c0343b2.f19947a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return c0343b3;
    }

    private static a.C0342a b(C0343b c0343b) {
        BigInteger bigIntegerAdd = c0343b.f19948b.add(c0343b.f19947a);
        BigInteger bigInteger = f19943f;
        return new a.C0342a(f.c(d(bigIntegerAdd.mod(bigInteger))), f.c(d(c0343b.f19948b.subtract(c0343b.f19947a).mod(bigInteger))), f.c(d(f19945h.multiply(c0343b.f19947a).multiply(c0343b.f19948b).mod(bigInteger))));
    }

    private static BigInteger c(BigInteger bigInteger) {
        BigInteger bigIntegerPow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigIntegerPow.subtract(bigInteger2);
        BigInteger bigIntegerAdd = f19944g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f19943f;
        BigInteger bigIntegerMultiply = bigIntegerSubtract.multiply(bigIntegerAdd.modInverse(bigInteger3));
        BigInteger bigIntegerModPow = bigIntegerMultiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!bigIntegerModPow.pow(2).subtract(bigIntegerMultiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            bigIntegerModPow = bigIntegerModPow.multiply(f19946i).mod(bigInteger3);
        }
        return bigIntegerModPow.testBit(0) ? bigInteger3.subtract(bigIntegerModPow) : bigIntegerModPow;
    }

    private static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = 31 - i10;
            bArr[i10] = bArr[i11];
            bArr[i11] = b10;
        }
        return bArr;
    }
}
