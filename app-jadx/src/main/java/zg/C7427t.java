package zg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: zg.t */
/* JADX INFO: loaded from: classes5.dex */
public class C7427t extends AbstractC7432y {

    /* JADX INFO: renamed from: c */
    static final L f66438c = new a(C7427t.class, 6);

    /* JADX INFO: renamed from: d */
    private static final ConcurrentMap f66439d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private final byte[] f66440a;

    /* JADX INFO: renamed from: b */
    private String f66441b;

    /* JADX INFO: renamed from: zg.t$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return C7427t.B(c7419n0.B(), false);
        }
    }

    /* JADX INFO: renamed from: zg.t$b */
    static class b {

        /* JADX INFO: renamed from: a */
        private final int f66442a;

        /* JADX INFO: renamed from: b */
        private final byte[] f66443b;

        b(byte[] bArr) {
            this.f66442a = Oh.a.q(bArr);
            this.f66443b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return Oh.a.c(this.f66443b, ((b) obj).f66443b);
            }
            return false;
        }

        public int hashCode() {
            return this.f66442a;
        }
    }

    public C7427t(String str) {
        A(str);
        byte[] bArrM = M(str);
        z(bArrM.length);
        this.f66440a = bArrM;
        this.f66441b = str;
    }

    static void A(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (str.length() > 16385) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
        if (I(str)) {
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID");
    }

    static C7427t B(byte[] bArr, boolean z10) {
        z(bArr.length);
        C7427t c7427t = (C7427t) f66439d.get(new b(bArr));
        if (c7427t != null) {
            return c7427t;
        }
        if (!C7386A.D(bArr)) {
            throw new IllegalArgumentException("invalid OID contents");
        }
        if (z10) {
            bArr = Oh.a.f(bArr);
        }
        return new C7427t(bArr, null);
    }

    public static C7427t F(Object obj) {
        if (obj == null || (obj instanceof C7427t)) {
            return (C7427t) obj;
        }
        if (obj instanceof InterfaceC7400e) {
            AbstractC7432y abstractC7432yE = ((InterfaceC7400e) obj).e();
            if (abstractC7432yE instanceof C7427t) {
                return (C7427t) abstractC7432yE;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C7427t) f66438c.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    private static boolean I(String str) {
        char cCharAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !C7386A.F(str, 2)) {
            return false;
        }
        if (cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.') {
            return true;
        }
        return (str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4';
    }

    private static String L(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        BigInteger bigIntegerShiftLeft = null;
        long j10 = 0;
        for (int i10 = 0; i10 != bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        if (j11 < 40) {
                            sb2.append('0');
                        } else if (j11 < 80) {
                            sb2.append('1');
                            j11 -= 40;
                        } else {
                            sb2.append('2');
                            j11 -= 80;
                        }
                        z10 = false;
                    }
                    sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
                    sb2.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j10);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z10) {
                        sb2.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z10 = false;
                    }
                    sb2.append(com.amazon.a.a.o.c.a.b.f34706a);
                    sb2.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j10 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb2.toString();
    }

    private static byte[] M(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Q0 q02 = new Q0(str);
        int i10 = Integer.parseInt(q02.b()) * 40;
        String strB = q02.b();
        if (strB.length() <= 18) {
            C7386A.K(byteArrayOutputStream, ((long) i10) + Long.parseLong(strB));
        } else {
            C7386A.L(byteArrayOutputStream, new BigInteger(strB).add(BigInteger.valueOf(i10)));
        }
        while (q02.a()) {
            String strB2 = q02.b();
            if (strB2.length() <= 18) {
                C7386A.K(byteArrayOutputStream, Long.parseLong(strB2));
            } else {
                C7386A.L(byteArrayOutputStream, new BigInteger(strB2));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    static void z(int i10) {
        if (i10 > 4096) {
            throw new IllegalArgumentException("exceeded OID contents length limit");
        }
    }

    public synchronized String D() {
        try {
            if (this.f66441b == null) {
                this.f66441b = L(this.f66440a);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66441b;
    }

    public C7427t G() {
        b bVar = new b(this.f66440a);
        ConcurrentMap concurrentMap = f66439d;
        C7427t c7427t = (C7427t) concurrentMap.get(bVar);
        if (c7427t != null) {
            return c7427t;
        }
        synchronized (concurrentMap) {
            try {
                if (concurrentMap.containsKey(bVar)) {
                    return (C7427t) concurrentMap.get(bVar);
                }
                concurrentMap.put(bVar, this);
                return this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean K(C7427t c7427t) {
        byte[] bArr = this.f66440a;
        byte[] bArr2 = c7427t.f66440a;
        int length = bArr2.length;
        return bArr.length > length && Oh.a.b(bArr, 0, length, bArr2, 0, length);
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return Oh.a.q(this.f66440a);
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (this == abstractC7432y) {
            return true;
        }
        if (abstractC7432y instanceof C7427t) {
            return Oh.a.c(this.f66440a, ((C7427t) abstractC7432y).f66440a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 6, this.f66440a);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66440a.length);
    }

    public String toString() {
        return D();
    }

    public C7427t y(String str) {
        byte[] bArrH;
        C7386A.z(str);
        if (str.length() <= 2) {
            z(this.f66440a.length + 1);
            int iCharAt = str.charAt(0) - '0';
            if (str.length() == 2) {
                iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
            }
            bArrH = Oh.a.a(this.f66440a, (byte) iCharAt);
        } else {
            byte[] bArrI = C7386A.I(str);
            z(this.f66440a.length + bArrI.length);
            bArrH = Oh.a.h(this.f66440a, bArrI);
        }
        return new C7427t(bArrH, D() + "." + str);
    }

    private C7427t(byte[] bArr, String str) {
        this.f66440a = bArr;
        this.f66441b = str;
    }
}
