package zg;

import java.math.BigInteger;

/* JADX INFO: renamed from: zg.o */
/* JADX INFO: loaded from: classes5.dex */
public class C7420o extends AbstractC7432y {

    /* JADX INFO: renamed from: c */
    static final L f66427c = new a(C7420o.class, 2);

    /* JADX INFO: renamed from: a */
    private final byte[] f66428a;

    /* JADX INFO: renamed from: b */
    private final int f66429b;

    /* JADX INFO: renamed from: zg.o$a */
    static class a extends L {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // zg.L
        AbstractC7432y d(C7419n0 c7419n0) {
            return C7420o.y(c7419n0.B());
        }
    }

    public C7420o(long j10) {
        this.f66428a = BigInteger.valueOf(j10).toByteArray();
        this.f66429b = 0;
    }

    public static C7420o A(G g10, boolean z10) {
        return (C7420o) f66427c.e(g10, z10);
    }

    static int F(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 4);
        int i12 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i12;
            }
            i12 = (i12 << 8) | (bArr[iMax] & 255);
        }
    }

    static boolean I(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || Oh.h.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static long K(byte[] bArr, int i10, int i11) {
        int length = bArr.length;
        int iMax = Math.max(i10, length - 8);
        long j10 = i11 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j10;
            }
            j10 = (j10 << 8) | ((long) (bArr[iMax] & 255));
        }
    }

    static int M(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            if (bArr[i10] != (bArr[i11] >> 7)) {
                break;
            }
            i10 = i11;
        }
        return i10;
    }

    static C7420o y(byte[] bArr) {
        return new C7420o(bArr, false);
    }

    public static C7420o z(Object obj) {
        if (obj == null || (obj instanceof C7420o)) {
            return (C7420o) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C7420o) f66427c.b((byte[]) obj);
        } catch (Exception e10) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e10.toString());
        }
    }

    public BigInteger B() {
        return new BigInteger(this.f66428a);
    }

    public boolean D(int i10) {
        byte[] bArr = this.f66428a;
        int length = bArr.length;
        int i11 = this.f66429b;
        return length - i11 <= 4 && F(bArr, i11, -1) == i10;
    }

    public int G() {
        byte[] bArr = this.f66428a;
        int length = bArr.length;
        int i10 = this.f66429b;
        if (length - i10 <= 4) {
            return F(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public long L() {
        byte[] bArr = this.f66428a;
        int length = bArr.length;
        int i10 = this.f66429b;
        if (length - i10 <= 8) {
            return K(bArr, i10, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    @Override // zg.AbstractC7432y, zg.r
    public int hashCode() {
        return Oh.a.q(this.f66428a);
    }

    @Override // zg.AbstractC7432y
    boolean l(AbstractC7432y abstractC7432y) {
        if (abstractC7432y instanceof C7420o) {
            return Oh.a.c(this.f66428a, ((C7420o) abstractC7432y).f66428a);
        }
        return false;
    }

    @Override // zg.AbstractC7432y
    void n(C7430w c7430w, boolean z10) {
        c7430w.o(z10, 2, this.f66428a);
    }

    @Override // zg.AbstractC7432y
    boolean p() {
        return false;
    }

    @Override // zg.AbstractC7432y
    int t(boolean z10) {
        return C7430w.g(z10, this.f66428a.length);
    }

    public String toString() {
        return B().toString();
    }

    public C7420o(BigInteger bigInteger) {
        this.f66428a = bigInteger.toByteArray();
        this.f66429b = 0;
    }

    C7420o(byte[] bArr, boolean z10) {
        if (I(bArr)) {
            throw new IllegalArgumentException("malformed integer");
        }
        this.f66428a = z10 ? Oh.a.f(bArr) : bArr;
        this.f66429b = M(bArr);
    }
}
