package tg;

import Ud.AbstractC2273n;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ug.AbstractC6776b;

/* JADX INFO: renamed from: tg.k */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class C6686k implements Serializable, Comparable {

    /* JADX INFO: renamed from: d */
    public static final a f61044d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C6686k f61045e = new C6686k(new byte[0]);

    /* JADX INFO: renamed from: a */
    private final byte[] f61046a;

    /* JADX INFO: renamed from: b */
    private transient int f61047b;

    /* JADX INFO: renamed from: c */
    private transient String f61048c;

    /* JADX INFO: renamed from: tg.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ C6686k j(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = AbstractC6680e.c();
            }
            return aVar.i(bArr, i10, i11);
        }

        public final C6686k a(String string) {
            AbstractC5504s.h(string, "string");
            return d(string);
        }

        public final C6686k b(String string) {
            AbstractC5504s.h(string, "string");
            return g(string);
        }

        public final C6686k c(ByteBuffer buffer) {
            AbstractC5504s.h(buffer, "buffer");
            return h(buffer);
        }

        public final C6686k d(String str) {
            AbstractC5504s.h(str, "<this>");
            byte[] bArrA = AbstractC6676a.a(str);
            if (bArrA != null) {
                return new C6686k(bArrA);
            }
            return null;
        }

        public final C6686k e(String str) {
            AbstractC5504s.h(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((AbstractC6776b.e(str.charAt(i11)) << 4) + AbstractC6776b.e(str.charAt(i11 + 1)));
            }
            return new C6686k(bArr);
        }

        public final C6686k f(String str, Charset charset) {
            AbstractC5504s.h(str, "<this>");
            AbstractC5504s.h(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            AbstractC5504s.g(bytes, "this as java.lang.String).getBytes(charset)");
            return new C6686k(bytes);
        }

        public final C6686k g(String str) {
            AbstractC5504s.h(str, "<this>");
            C6686k c6686k = new C6686k(d0.a(str));
            c6686k.H(str);
            return c6686k;
        }

        public final C6686k h(ByteBuffer byteBuffer) {
            AbstractC5504s.h(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new C6686k(bArr);
        }

        public final C6686k i(byte[] bArr, int i10, int i11) {
            AbstractC5504s.h(bArr, "<this>");
            int iF = AbstractC6680e.f(bArr, i11);
            AbstractC6680e.b(bArr.length, i10, iF);
            return new C6686k(AbstractC2273n.s(bArr, i10, iF + i10));
        }

        private a() {
        }
    }

    public C6686k(byte[] data) {
        AbstractC5504s.h(data, "data");
        this.f61046a = data;
    }

    public static /* synthetic */ int C(C6686k c6686k, C6686k c6686k2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC6680e.c();
        }
        return c6686k.A(c6686k2, i10);
    }

    public static /* synthetic */ C6686k N(C6686k c6686k, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = AbstractC6680e.c();
        }
        return c6686k.M(i10, i11);
    }

    public static /* synthetic */ int x(C6686k c6686k, C6686k c6686k2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c6686k.v(c6686k2, i10);
    }

    public final int A(C6686k other, int i10) {
        AbstractC5504s.h(other, "other");
        return B(other.y(), i10);
    }

    public int B(byte[] other, int i10) {
        AbstractC5504s.h(other, "other");
        for (int iMin = Math.min(AbstractC6680e.e(this, i10), p().length - other.length); -1 < iMin; iMin--) {
            if (AbstractC6680e.a(p(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public final C6686k D() {
        return h("MD5");
    }

    public boolean E(int i10, C6686k other, int i11, int i12) {
        AbstractC5504s.h(other, "other");
        return other.F(i11, p(), i10, i12);
    }

    public boolean F(int i10, byte[] other, int i11, int i12) {
        AbstractC5504s.h(other, "other");
        return i10 >= 0 && i10 <= p().length - i12 && i11 >= 0 && i11 <= other.length - i12 && AbstractC6680e.a(p(), i10, other, i11, i12);
    }

    public final void G(int i10) {
        this.f61047b = i10;
    }

    public final void H(String str) {
        this.f61048c = str;
    }

    public final C6686k I() {
        return h("SHA-1");
    }

    public final C6686k J() {
        return h("SHA-256");
    }

    public final int K() {
        return s();
    }

    public final boolean L(C6686k prefix) {
        AbstractC5504s.h(prefix, "prefix");
        return E(0, prefix, 0, prefix.K());
    }

    public C6686k M(int i10, int i11) {
        int iE = AbstractC6680e.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iE <= p().length) {
            if (iE - i10 >= 0) {
                return (i10 == 0 && iE == p().length) ? this : new C6686k(AbstractC2273n.s(p(), i10, iE));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + p().length + ')').toString());
    }

    public C6686k O() {
        for (int i10 = 0; i10 < p().length; i10++) {
            byte b10 = p()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrP = p();
                byte[] bArrCopyOf = Arrays.copyOf(bArrP, bArrP.length);
                AbstractC5504s.g(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new C6686k(bArrCopyOf);
            }
        }
        return this;
    }

    public byte[] P() {
        byte[] bArrP = p();
        byte[] bArrCopyOf = Arrays.copyOf(bArrP, bArrP.length);
        AbstractC5504s.g(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public String Q() {
        String strT = t();
        if (strT != null) {
            return strT;
        }
        String strC = d0.c(y());
        H(strC);
        return strC;
    }

    public void R(C6683h buffer, int i10, int i11) {
        AbstractC5504s.h(buffer, "buffer");
        AbstractC6776b.d(this, buffer, i10, i11);
    }

    public final int a() {
        return K();
    }

    public String b() {
        return AbstractC6676a.c(p(), null, 1, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c */
    public int compareTo(C6686k other) {
        AbstractC5504s.h(other, "other");
        int iK = K();
        int iK2 = other.K();
        int iMin = Math.min(iK, iK2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM = m(i10) & 255;
            int iM2 = other.m(i10) & 255;
            if (iM != iM2) {
                return iM < iM2 ? -1 : 1;
            }
        }
        if (iK == iK2) {
            return 0;
        }
        return iK < iK2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6686k) {
            C6686k c6686k = (C6686k) obj;
            if (c6686k.K() == p().length && c6686k.F(0, p(), 0, p().length)) {
                return true;
            }
        }
        return false;
    }

    public C6686k h(String algorithm) throws NoSuchAlgorithmException {
        AbstractC5504s.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f61046a, 0, K());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC5504s.e(bArrDigest);
        return new C6686k(bArrDigest);
    }

    public int hashCode() {
        int iQ = q();
        if (iQ != 0) {
            return iQ;
        }
        int iHashCode = Arrays.hashCode(p());
        G(iHashCode);
        return iHashCode;
    }

    public final boolean k(C6686k suffix) {
        AbstractC5504s.h(suffix, "suffix");
        return E(K() - suffix.K(), suffix, 0, suffix.K());
    }

    public final byte m(int i10) {
        return z(i10);
    }

    public final byte[] p() {
        return this.f61046a;
    }

    public final int q() {
        return this.f61047b;
    }

    public int s() {
        return p().length;
    }

    public final String t() {
        return this.f61048c;
    }

    public String toString() {
        if (p().length == 0) {
            return "[size=0]";
        }
        int iC = AbstractC6776b.c(p(), 64);
        if (iC != -1) {
            String strQ = Q();
            String strSubstring = strQ.substring(0, iC);
            AbstractC5504s.g(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strK = Df.r.K(Df.r.K(Df.r.K(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iC >= strQ.length()) {
                return "[text=" + strK + ']';
            }
            return "[size=" + p().length + " text=" + strK + "…]";
        }
        if (p().length <= 64) {
            return "[hex=" + u() + ']';
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(p().length);
        sb2.append(" hex=");
        int iE = AbstractC6680e.e(this, 64);
        if (iE <= p().length) {
            if (iE < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iE == p().length ? this : new C6686k(AbstractC2273n.s(p(), 0, iE))).u());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + p().length + ')').toString());
    }

    public String u() {
        char[] cArr = new char[p().length * 2];
        int i10 = 0;
        for (byte b10 : p()) {
            int i11 = i10 + 1;
            cArr[i10] = AbstractC6776b.f()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = AbstractC6776b.f()[b10 & 15];
        }
        return Df.r.v(cArr);
    }

    public final int v(C6686k other, int i10) {
        AbstractC5504s.h(other, "other");
        return w(other.y(), i10);
    }

    public int w(byte[] other, int i10) {
        AbstractC5504s.h(other, "other");
        int length = p().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC6680e.a(p(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] y() {
        return p();
    }

    public byte z(int i10) {
        return p()[i10];
    }
}
