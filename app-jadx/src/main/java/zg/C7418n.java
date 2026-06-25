package zg;

import com.facebook.imageutils.JfifUtil;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zg.n */
/* JADX INFO: loaded from: classes5.dex */
public class C7418n extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    private final int f66424a;

    /* JADX INFO: renamed from: b */
    private final boolean f66425b;

    /* JADX INFO: renamed from: c */
    private final byte[][] f66426c;

    public C7418n(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    static AbstractC7432y h(int i10, K0 k02, byte[][] bArr) throws IOException {
        try {
            switch (i10) {
                case 1:
                    return C7398d.y(k(k02, bArr));
                case 2:
                    return C7420o.y(k02.j());
                case 3:
                    return AbstractC7394b.y(k02.j());
                case 4:
                    return AbstractC7428u.y(k02.j());
                case 5:
                    return AbstractC7422p.y(k02.j());
                case 6:
                    C7427t.z(k02.g());
                    return C7427t.B(k(k02, bArr), true);
                case 7:
                    return C7426s.y(k02.j());
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i10 + " encountered");
                case 10:
                    return C7404g.y(k(k02, bArr), true);
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    return J.y(k02.j());
                case 13:
                    C7386A.y(k02.g());
                    return C7386A.A(k(k02, bArr), true);
                case 14:
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i10 + " encountered");
                case 18:
                    return AbstractC7424q.y(k02.j());
                case 19:
                    return AbstractC7433z.y(k02.j());
                case 20:
                    return AbstractC7390E.y(k02.j());
                case 21:
                    return N.y(k02.j());
                case 22:
                    return AbstractC7416m.y(k02.j());
                case 23:
                    return I.y(k02.j());
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    return C7412k.y(k02.j());
                case 25:
                    return AbstractC7414l.y(k02.j());
                case 26:
                    return O.y(k02.j());
                case 27:
                    return AbstractC7410j.y(k02.j());
                case 28:
                    return K.y(k02.j());
                case 30:
                    return AbstractC7392a.z(j(k02));
            }
        } catch (IllegalArgumentException e10) {
            throw new C7406h(e10.getMessage(), e10);
        } catch (IllegalStateException e11) {
            throw new C7406h(e11.getMessage(), e11);
        }
    }

    private static char[] j(K0 k02) throws IOException {
        int iG = k02.g();
        if ((iG & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i10 = iG / 2;
        char[] cArr = new char[i10];
        byte[] bArr = new byte[8];
        int i11 = 0;
        int i12 = 0;
        while (iG >= 8) {
            if (Qh.a.d(k02, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i12] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i12 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i12 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i12 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i12 += 4;
            iG -= 8;
        }
        if (iG > 0) {
            if (Qh.a.d(k02, bArr, 0, iG) != iG) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i13 = i11 + 1;
                int i14 = bArr[i11] << 8;
                i11 += 2;
                cArr[i12] = (char) ((bArr[i13] & 255) | i14);
                i12++;
            } while (i11 < iG);
        }
        if (k02.g() == 0 && i10 == i12) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    private static byte[] k(K0 k02, byte[][] bArr) throws IOException {
        int iG = k02.g();
        if (iG >= bArr.length) {
            return k02.j();
        }
        byte[] bArr2 = bArr[iG];
        if (bArr2 == null) {
            bArr2 = new byte[iG];
            bArr[iG] = bArr2;
        }
        k02.h(bArr2);
        return bArr2;
    }

    static int m(InputStream inputStream, int i10, boolean z10) {
        int i11 = inputStream.read();
        if ((i11 >>> 7) == 0) {
            return i11;
        }
        if (128 == i11) {
            return -1;
        }
        if (i11 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i11) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i12 = i11 & 127;
        int i13 = 0;
        int i14 = 0;
        do {
            int i15 = inputStream.read();
            if (i15 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i13 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i13 = (i13 << 8) + i15;
            i14++;
        } while (i14 < i12);
        if (i13 < i10 || z10) {
            return i13;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i13 + " >= " + i10);
    }

    static int q(InputStream inputStream, int i10) {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int i12 = inputStream.read();
        if (i12 < 31) {
            if (i12 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i13 = i12 & 127;
        if (i13 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i12 & 128) != 0) {
            if ((i13 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i14 = i13 << 7;
            int i15 = inputStream.read();
            if (i15 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i13 = i14 | (i15 & 127);
            i12 = i15;
        }
        return i13;
    }

    C7402f C(K0 k02) {
        int iG = k02.g();
        return iG < 1 ? new C7402f(0) : new C7418n(k02, iG, this.f66425b, this.f66426c).z();
    }

    AbstractC7394b a(C7402f c7402f) throws C7406h {
        int iF = c7402f.f();
        AbstractC7394b[] abstractC7394bArr = new AbstractC7394b[iF];
        for (int i10 = 0; i10 != iF; i10++) {
            InterfaceC7400e interfaceC7400eD = c7402f.d(i10);
            if (!(interfaceC7400eD instanceof AbstractC7394b)) {
                throw new C7406h("unknown object encountered in constructed BIT STRING: " + interfaceC7400eD.getClass());
            }
            abstractC7394bArr[i10] = (AbstractC7394b) interfaceC7400eD;
        }
        return new P(abstractC7394bArr);
    }

    AbstractC7428u b(C7402f c7402f) throws C7406h {
        int iF = c7402f.f();
        AbstractC7428u[] abstractC7428uArr = new AbstractC7428u[iF];
        for (int i10 = 0; i10 != iF; i10++) {
            InterfaceC7400e interfaceC7400eD = c7402f.d(i10);
            if (!(interfaceC7400eD instanceof AbstractC7428u)) {
                throw new C7406h("unknown object encountered in constructed OCTET STRING: " + interfaceC7400eD.getClass());
            }
            abstractC7428uArr[i10] = (AbstractC7428u) interfaceC7400eD;
        }
        return new T(abstractC7428uArr);
    }

    protected AbstractC7432y g(int i10, int i11, int i12) throws IOException {
        K0 k02 = new K0(this, i12, this.f66424a);
        if ((i10 & 224) == 0) {
            return h(i11, k02, this.f66426c);
        }
        int i13 = i10 & JfifUtil.MARKER_SOFn;
        if (i13 != 0) {
            return w(i13, i11, (i10 & 32) != 0, k02);
        }
        if (i11 == 3) {
            return a(C(k02));
        }
        if (i11 == 4) {
            return b(C(k02));
        }
        if (i11 == 8) {
            return C0.a(C(k02)).G();
        }
        if (i11 == 16) {
            return k02.g() < 1 ? C0.f66321a : this.f66425b ? new O0(k02.j()) : C0.a(C(k02));
        }
        if (i11 == 17) {
            return C0.b(C(k02));
        }
        throw new IOException("unknown tag " + i11 + " encountered");
    }

    protected int l() {
        return m(this, this.f66424a, false);
    }

    public AbstractC7432y o() {
        int i10 = read();
        if (i10 <= 0) {
            if (i10 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iQ = q(this, i10);
        int iL = l();
        if (iL >= 0) {
            try {
                return g(i10, iQ, iL);
            } catch (IllegalArgumentException e10) {
                throw new C7406h("corrupted stream detected", e10);
            }
        }
        if ((i10 & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C7389D c7389d = new C7389D(new M0(this, this.f66424a), this.f66424a, this.f66426c);
        int i11 = i10 & JfifUtil.MARKER_SOFn;
        if (i11 != 0) {
            return c7389d.c(i11, iQ);
        }
        if (iQ == 3) {
            return Q.a(c7389d);
        }
        if (iQ == 4) {
            return U.a(c7389d);
        }
        if (iQ == 8) {
            return C7405g0.a(c7389d);
        }
        if (iQ == 16) {
            return W.a(c7389d);
        }
        if (iQ == 17) {
            return Y.a(c7389d);
        }
        throw new IOException("unknown BER object encountered");
    }

    AbstractC7432y w(int i10, int i11, boolean z10, K0 k02) {
        return !z10 ? G.B(i10, i11, k02.j()) : G.z(i10, i11, C(k02));
    }

    C7402f z() {
        AbstractC7432y abstractC7432yO = o();
        if (abstractC7432yO == null) {
            return new C7402f(0);
        }
        C7402f c7402f = new C7402f();
        do {
            c7402f.a(abstractC7432yO);
            abstractC7432yO = o();
        } while (abstractC7432yO != null);
        return c7402f;
    }

    public C7418n(InputStream inputStream, int i10, boolean z10) {
        this(inputStream, i10, z10, new byte[11][]);
    }

    private C7418n(InputStream inputStream, int i10, boolean z10, byte[][] bArr) {
        super(inputStream);
        this.f66424a = i10;
        this.f66425b = z10;
        this.f66426c = bArr;
    }

    public C7418n(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public C7418n(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }
}
