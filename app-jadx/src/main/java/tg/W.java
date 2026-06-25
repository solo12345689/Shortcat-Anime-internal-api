package tg;

import Ud.AbstractC2273n;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class W extends C6686k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient byte[][] f60998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int[] f60999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(byte[][] segments, int[] directory) {
        super(C6686k.f61045e.p());
        AbstractC5504s.h(segments, "segments");
        AbstractC5504s.h(directory, "directory");
        this.f60998f = segments;
        this.f60999g = directory;
    }

    private final C6686k U() {
        return new C6686k(P());
    }

    @Override // tg.C6686k
    public int B(byte[] other, int i10) {
        AbstractC5504s.h(other, "other");
        return U().B(other, i10);
    }

    @Override // tg.C6686k
    public boolean E(int i10, C6686k other, int i11, int i12) {
        AbstractC5504s.h(other, "other");
        if (i10 < 0 || i10 > K() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = ug.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : S()[iB - 1];
            int i15 = S()[iB] - i14;
            int i16 = S()[T().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.F(i11, T()[iB], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // tg.C6686k
    public boolean F(int i10, byte[] other, int i11, int i12) {
        AbstractC5504s.h(other, "other");
        if (i10 < 0 || i10 > K() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iB = ug.e.b(this, i10);
        while (i10 < i13) {
            int i14 = iB == 0 ? 0 : S()[iB - 1];
            int i15 = S()[iB] - i14;
            int i16 = S()[T().length + iB];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC6680e.a(T()[iB], i16 + (i10 - i14), other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iB++;
        }
        return true;
    }

    @Override // tg.C6686k
    public C6686k M(int i10, int i11) {
        int iE = AbstractC6680e.e(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i10 + " < 0").toString());
        }
        if (iE > K()) {
            throw new IllegalArgumentException(("endIndex=" + iE + " > length(" + K() + ')').toString());
        }
        int i12 = iE - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iE + " < beginIndex=" + i10).toString());
        }
        if (i10 == 0 && iE == K()) {
            return this;
        }
        if (i10 == iE) {
            return C6686k.f61045e;
        }
        int iB = ug.e.b(this, i10);
        int iB2 = ug.e.b(this, iE - 1);
        byte[][] bArr = (byte[][]) AbstractC2273n.t(T(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i13 = iB;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(S()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = S()[T().length + i13];
                if (i13 == iB2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iB != 0 ? S()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new W(bArr, iArr);
    }

    @Override // tg.C6686k
    public C6686k O() {
        return U().O();
    }

    @Override // tg.C6686k
    public byte[] P() {
        byte[] bArr = new byte[K()];
        int length = T().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = S()[length + i10];
            int i14 = S()[i10];
            int i15 = i14 - i11;
            AbstractC2273n.h(T()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // tg.C6686k
    public void R(C6683h buffer, int i10, int i11) {
        AbstractC5504s.h(buffer, "buffer");
        int i12 = i10 + i11;
        int iB = ug.e.b(this, i10);
        while (i10 < i12) {
            int i13 = iB == 0 ? 0 : S()[iB - 1];
            int i14 = S()[iB] - i13;
            int i15 = S()[T().length + iB];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            U u10 = new U(T()[iB], i16, i16 + iMin, true, false);
            U u11 = buffer.f61033a;
            if (u11 == null) {
                u10.f60992g = u10;
                u10.f60991f = u10;
                buffer.f61033a = u10;
            } else {
                AbstractC5504s.e(u11);
                U u12 = u11.f60992g;
                AbstractC5504s.e(u12);
                u12.c(u10);
            }
            i10 += iMin;
            iB++;
        }
        buffer.G0(buffer.size() + ((long) i11));
    }

    public final int[] S() {
        return this.f60999g;
    }

    public final byte[][] T() {
        return this.f60998f;
    }

    @Override // tg.C6686k
    public String b() {
        return U().b();
    }

    @Override // tg.C6686k
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6686k) {
            C6686k c6686k = (C6686k) obj;
            if (c6686k.K() == K() && E(0, c6686k, 0, K())) {
                return true;
            }
        }
        return false;
    }

    @Override // tg.C6686k
    public C6686k h(String algorithm) throws NoSuchAlgorithmException {
        AbstractC5504s.h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = T().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = S()[length + i10];
            int i13 = S()[i10];
            messageDigest.update(T()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC5504s.e(bArrDigest);
        return new C6686k(bArrDigest);
    }

    @Override // tg.C6686k
    public int hashCode() {
        int iQ = q();
        if (iQ != 0) {
            return iQ;
        }
        int length = T().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = S()[length + i10];
            int i14 = S()[i10];
            byte[] bArr = T()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        G(i11);
        return i11;
    }

    @Override // tg.C6686k
    public int s() {
        return S()[T().length - 1];
    }

    @Override // tg.C6686k
    public String toString() {
        return U().toString();
    }

    @Override // tg.C6686k
    public String u() {
        return U().u();
    }

    @Override // tg.C6686k
    public int w(byte[] other, int i10) {
        AbstractC5504s.h(other, "other");
        return U().w(other, i10);
    }

    @Override // tg.C6686k
    public byte[] y() {
        return P();
    }

    @Override // tg.C6686k
    public byte z(int i10) {
        AbstractC6680e.b(S()[T().length - 1], i10, 1L);
        int iB = ug.e.b(this, i10);
        return T()[iB][(i10 - (iB == 0 ? 0 : S()[iB - 1])) + S()[T().length + iB]];
    }
}
