package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2803g {

    /* JADX INFO: renamed from: f */
    private static volatile int f29298f = 100;

    /* JADX INFO: renamed from: a */
    int f29299a;

    /* JADX INFO: renamed from: b */
    int f29300b;

    /* JADX INFO: renamed from: c */
    int f29301c;

    /* JADX INFO: renamed from: d */
    C2804h f29302d;

    /* JADX INFO: renamed from: e */
    private boolean f29303e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends AbstractC2803g {

        /* JADX INFO: renamed from: g */
        private final byte[] f29304g;

        /* JADX INFO: renamed from: h */
        private final boolean f29305h;

        /* JADX INFO: renamed from: i */
        private int f29306i;

        /* JADX INFO: renamed from: j */
        private int f29307j;

        /* JADX INFO: renamed from: k */
        private int f29308k;

        /* JADX INFO: renamed from: l */
        private int f29309l;

        /* JADX INFO: renamed from: m */
        private int f29310m;

        /* JADX INFO: renamed from: n */
        private boolean f29311n;

        /* JADX INFO: renamed from: o */
        private int f29312o;

        /* synthetic */ b(byte[] bArr, int i10, int i11, boolean z10, a aVar) {
            this(bArr, i10, i11, z10);
        }

        private void O() {
            int i10 = this.f29306i + this.f29307j;
            this.f29306i = i10;
            int i11 = i10 - this.f29309l;
            int i12 = this.f29312o;
            if (i11 <= i12) {
                this.f29307j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f29307j = i13;
            this.f29306i = i10 - i13;
        }

        private void Q() throws C2817v {
            if (this.f29306i - this.f29308k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws C2817v {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f29304g;
                int i11 = this.f29308k;
                this.f29308k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2817v.f();
        }

        private void S() throws C2817v {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw C2817v.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public String A() throws C2817v {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f29306i;
                int i11 = this.f29308k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f29304g, i11, iL, AbstractC2816u.f29503b);
                    this.f29308k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw C2817v.g();
            }
            throw C2817v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public String B() throws C2817v {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f29306i;
                int i11 = this.f29308k;
                if (iL <= i10 - i11) {
                    String strA = l0.a(this.f29304g, i11, iL);
                    this.f29308k += iL;
                    return strA;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw C2817v.g();
            }
            throw C2817v.m();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int C() throws C2817v {
            if (f()) {
                this.f29310m = 0;
                return 0;
            }
            int iL = L();
            this.f29310m = iL;
            if (m0.a(iL) != 0) {
                return this.f29310m;
            }
            throw C2817v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int D() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long E() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public boolean F(int i10) throws C2817v {
            int iB = m0.b(i10);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(L());
                return true;
            }
            if (iB == 3) {
                G();
                a(m0.c(m0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C2817v.e();
            }
            P(4);
            return true;
        }

        public byte H() throws C2817v {
            int i10 = this.f29308k;
            if (i10 == this.f29306i) {
                throw C2817v.m();
            }
            byte[] bArr = this.f29304g;
            this.f29308k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws C2817v {
            if (i10 > 0) {
                int i11 = this.f29306i;
                int i12 = this.f29308k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f29308k = i13;
                    return Arrays.copyOfRange(this.f29304g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw C2817v.m();
            }
            if (i10 == 0) {
                return AbstractC2816u.f29505d;
            }
            throw C2817v.g();
        }

        public int J() throws C2817v {
            int i10 = this.f29308k;
            if (this.f29306i - i10 < 4) {
                throw C2817v.m();
            }
            byte[] bArr = this.f29304g;
            this.f29308k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws C2817v {
            int i10 = this.f29308k;
            if (this.f29306i - i10 < 8) {
                throw C2817v.m();
            }
            byte[] bArr = this.f29304g;
            this.f29308k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f29308k;
            int i12 = this.f29306i;
            if (i12 != i11) {
                byte[] bArr = this.f29304g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f29308k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f29308k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f29308k;
            int i11 = this.f29306i;
            if (i11 != i10) {
                byte[] bArr = this.f29304g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f29308k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f29308k = i13;
                    return j10;
                }
            }
            return N();
        }

        long N() throws C2817v {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw C2817v.f();
        }

        public void P(int i10) throws C2817v {
            if (i10 >= 0) {
                int i11 = this.f29306i;
                int i12 = this.f29308k;
                if (i10 <= i11 - i12) {
                    this.f29308k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw C2817v.m();
            }
            throw C2817v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public void a(int i10) throws C2817v {
            if (this.f29310m != i10) {
                throw C2817v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int e() {
            return this.f29308k - this.f29309l;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public boolean f() {
            return this.f29308k == this.f29306i;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public void l(int i10) {
            this.f29312o = i10;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int m(int i10) throws C2817v {
            if (i10 < 0) {
                throw C2817v.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw C2817v.h();
            }
            int i11 = this.f29312o;
            if (iE > i11) {
                throw C2817v.m();
            }
            this.f29312o = iE;
            O();
            return i11;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public boolean n() {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public AbstractC2802f o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f29306i;
                int i11 = this.f29308k;
                if (iL <= i10 - i11) {
                    AbstractC2802f abstractC2802fB = (this.f29305h && this.f29311n) ? AbstractC2802f.B(this.f29304g, i11, iL) : AbstractC2802f.i(this.f29304g, i11, iL);
                    this.f29308k += iL;
                    return abstractC2802fB;
                }
            }
            return iL == 0 ? AbstractC2802f.f29287b : AbstractC2802f.A(I(iL));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int q() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int r() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long s() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int u() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long v() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int w() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long x() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int y() {
            return AbstractC2803g.c(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long z() {
            return AbstractC2803g.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f29312o = Integer.MAX_VALUE;
            this.f29304g = bArr;
            this.f29306i = i11 + i10;
            this.f29308k = i10;
            this.f29309l = i10;
            this.f29305h = z10;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends AbstractC2803g {

        /* JADX INFO: renamed from: g */
        private final InputStream f29313g;

        /* JADX INFO: renamed from: h */
        private final byte[] f29314h;

        /* JADX INFO: renamed from: i */
        private int f29315i;

        /* JADX INFO: renamed from: j */
        private int f29316j;

        /* JADX INFO: renamed from: k */
        private int f29317k;

        /* JADX INFO: renamed from: l */
        private int f29318l;

        /* JADX INFO: renamed from: m */
        private int f29319m;

        /* JADX INFO: renamed from: n */
        private int f29320n;

        /* synthetic */ c(InputStream inputStream, int i10, a aVar) {
            this(inputStream, i10);
        }

        private static int H(InputStream inputStream) throws C2817v {
            try {
                return inputStream.available();
            } catch (C2817v e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws C2817v {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (C2817v e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC2802f J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return AbstractC2802f.f(bArrM);
            }
            int i11 = this.f29317k;
            int i12 = this.f29315i;
            int length = i12 - i11;
            this.f29319m += i12;
            this.f29317k = 0;
            this.f29315i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f29314h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC2802f.A(bArr);
        }

        private byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f29317k;
            int i12 = this.f29315i;
            int length = i12 - i11;
            this.f29319m += i12;
            this.f29317k = 0;
            this.f29315i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f29314h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) throws C2817v {
            if (i10 == 0) {
                return AbstractC2816u.f29505d;
            }
            if (i10 < 0) {
                throw C2817v.g();
            }
            int i11 = this.f29319m;
            int i12 = this.f29317k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f29301c > 0) {
                throw C2817v.l();
            }
            int i14 = this.f29320n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C2817v.m();
            }
            int i15 = this.f29315i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f29313g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f29314h, this.f29317k, bArr, 0, i15);
            this.f29319m += this.f29315i;
            this.f29317k = 0;
            this.f29315i = 0;
            while (i15 < i10) {
                int I10 = I(this.f29313g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw C2817v.m();
                }
                this.f29319m += I10;
                i15 += I10;
            }
            return bArr;
        }

        private List N(int i10) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int iMin = Math.min(i10, 4096);
                byte[] bArr = new byte[iMin];
                int i11 = 0;
                while (i11 < iMin) {
                    int i12 = this.f29313g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw C2817v.m();
                    }
                    this.f29319m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f29315i + this.f29316j;
            this.f29315i = i10;
            int i11 = this.f29319m + i10;
            int i12 = this.f29320n;
            if (i11 <= i12) {
                this.f29316j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f29316j = i13;
            this.f29315i = i10 - i13;
        }

        private void U(int i10) throws C2817v {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f29301c - this.f29319m) - this.f29317k) {
                throw C2817v.m();
            }
            throw C2817v.l();
        }

        private static long V(InputStream inputStream, long j10) throws C2817v {
            try {
                return inputStream.skip(j10);
            } catch (C2817v e10) {
                e10.j();
                throw e10;
            }
        }

        private void X(int i10) throws C2817v {
            if (i10 < 0) {
                throw C2817v.g();
            }
            int i11 = this.f29319m;
            int i12 = this.f29317k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f29320n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw C2817v.m();
            }
            this.f29319m = i11 + i12;
            int i15 = this.f29315i - i12;
            this.f29315i = 0;
            this.f29317k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f29313g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f29313g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } finally {
                    this.f29319m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f29315i;
            int i17 = i16 - this.f29317k;
            this.f29317k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f29315i;
                if (i18 <= i19) {
                    this.f29317k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f29317k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws C2817v {
            if (this.f29315i - this.f29317k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws C2817v {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f29314h;
                int i11 = this.f29317k;
                this.f29317k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw C2817v.f();
        }

        private void a0() throws C2817v {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw C2817v.f();
        }

        private boolean b0(int i10) throws C2817v {
            int i11 = this.f29317k;
            int i12 = i11 + i10;
            int i13 = this.f29315i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f29301c;
            int i15 = this.f29319m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f29320n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f29314h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f29319m += i11;
                this.f29315i -= i11;
                this.f29317k = 0;
            }
            InputStream inputStream = this.f29313g;
            byte[] bArr2 = this.f29314h;
            int i16 = this.f29315i;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f29301c - this.f29319m) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.f29314h.length) {
                throw new IllegalStateException(this.f29313g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f29315i += I10;
            T();
            if (this.f29315i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public String A() throws C2817v {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f29315i;
                int i11 = this.f29317k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f29314h, i11, iQ, AbstractC2816u.f29503b);
                    this.f29317k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw C2817v.g();
            }
            if (iQ > this.f29315i) {
                return new String(L(iQ, false), AbstractC2816u.f29503b);
            }
            U(iQ);
            String str2 = new String(this.f29314h, this.f29317k, iQ, AbstractC2816u.f29503b);
            this.f29317k += iQ;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f29317k;
            int i11 = this.f29315i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f29314h;
                this.f29317k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw C2817v.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f29314h;
                    this.f29317k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return l0.a(bArrL, i10, iQ);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int C() throws C2817v {
            if (f()) {
                this.f29318l = 0;
                return 0;
            }
            int iQ = Q();
            this.f29318l = iQ;
            if (m0.a(iQ) != 0) {
                return this.f29318l;
            }
            throw C2817v.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int D() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long E() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public boolean F(int i10) throws C2817v {
            int iB = m0.b(i10);
            if (iB == 0) {
                Y();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(Q());
                return true;
            }
            if (iB == 3) {
                G();
                a(m0.c(m0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C2817v.e();
            }
            W(4);
            return true;
        }

        public byte K() throws C2817v {
            if (this.f29317k == this.f29315i) {
                U(1);
            }
            byte[] bArr = this.f29314h;
            int i10 = this.f29317k;
            this.f29317k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws C2817v {
            int i10 = this.f29317k;
            if (this.f29315i - i10 < 4) {
                U(4);
                i10 = this.f29317k;
            }
            byte[] bArr = this.f29314h;
            this.f29317k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws C2817v {
            int i10 = this.f29317k;
            if (this.f29315i - i10 < 8) {
                U(8);
                i10 = this.f29317k;
            }
            byte[] bArr = this.f29314h;
            this.f29317k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f29317k;
            int i12 = this.f29315i;
            if (i12 != i11) {
                byte[] bArr = this.f29314h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f29317k = i13;
                    return b10;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b10;
                    if (i15 < 0) {
                        i10 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            i10 = i17 ^ 16256;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                i10 = (-2080896) ^ i19;
                            } else {
                                i16 = i11 + 5;
                                byte b11 = bArr[i18];
                                int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                                if (b11 < 0) {
                                    i18 = i11 + 6;
                                    if (bArr[i16] < 0) {
                                        i16 = i11 + 7;
                                        if (bArr[i18] < 0) {
                                            i18 = i11 + 8;
                                            if (bArr[i16] < 0) {
                                                i16 = i11 + 9;
                                                if (bArr[i18] < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i16] >= 0) {
                                                        i14 = i21;
                                                        i10 = i20;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i10 = i20;
                                }
                                i10 = i20;
                            }
                            i14 = i18;
                        }
                        i14 = i16;
                    }
                    this.f29317k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f29317k;
            int i11 = this.f29315i;
            if (i11 != i10) {
                byte[] bArr = this.f29314h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f29317k = i12;
                    return b10;
                }
                if (i11 - i12 >= 9) {
                    int i13 = i10 + 2;
                    int i14 = (bArr[i12] << 7) ^ b10;
                    if (i14 < 0) {
                        j10 = i14 ^ (-128);
                    } else {
                        int i15 = i10 + 3;
                        int i16 = (bArr[i13] << 14) ^ i14;
                        if (i16 >= 0) {
                            j10 = i16 ^ 16256;
                            i13 = i15;
                        } else {
                            int i17 = i10 + 4;
                            int i18 = i16 ^ (bArr[i15] << 21);
                            if (i18 < 0) {
                                long j13 = (-2080896) ^ i18;
                                i13 = i17;
                                j10 = j13;
                            } else {
                                long j14 = i18;
                                i13 = i10 + 5;
                                long j15 = j14 ^ (((long) bArr[i17]) << 28);
                                if (j15 >= 0) {
                                    j12 = 266354560;
                                } else {
                                    int i19 = i10 + 6;
                                    long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                    if (j16 < 0) {
                                        j11 = -34093383808L;
                                    } else {
                                        i13 = i10 + 7;
                                        j15 = j16 ^ (((long) bArr[i19]) << 42);
                                        if (j15 >= 0) {
                                            j12 = 4363953127296L;
                                        } else {
                                            i19 = i10 + 8;
                                            j16 = j15 ^ (((long) bArr[i13]) << 49);
                                            if (j16 < 0) {
                                                j11 = -558586000294016L;
                                            } else {
                                                i13 = i10 + 9;
                                                long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                                if (j17 < 0) {
                                                    int i20 = i10 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i13 = i20;
                                                    }
                                                }
                                                j10 = j17;
                                            }
                                        }
                                    }
                                    j10 = j16 ^ j11;
                                    i13 = i19;
                                }
                                j10 = j15 ^ j12;
                            }
                        }
                    }
                    this.f29317k = i13;
                    return j10;
                }
            }
            return S();
        }

        long S() throws C2817v {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw C2817v.f();
        }

        public void W(int i10) throws C2817v {
            int i11 = this.f29315i;
            int i12 = this.f29317k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f29317k = i12 + i10;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public void a(int i10) throws C2817v {
            if (this.f29318l != i10) {
                throw C2817v.b();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int e() {
            return this.f29319m + this.f29317k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public boolean f() {
            return this.f29317k == this.f29315i && !b0(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public void l(int i10) {
            this.f29320n = i10;
            T();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int m(int i10) throws C2817v {
            if (i10 < 0) {
                throw C2817v.g();
            }
            int i11 = i10 + this.f29319m + this.f29317k;
            if (i11 < 0) {
                throw C2817v.h();
            }
            int i12 = this.f29320n;
            if (i11 > i12) {
                throw C2817v.m();
            }
            this.f29320n = i11;
            T();
            return i12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public boolean n() {
            return R() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public AbstractC2802f o() throws C2817v {
            int iQ = Q();
            int i10 = this.f29315i;
            int i11 = this.f29317k;
            if (iQ <= i10 - i11 && iQ > 0) {
                AbstractC2802f abstractC2802fI = AbstractC2802f.i(this.f29314h, i11, iQ);
                this.f29317k += iQ;
                return abstractC2802fI;
            }
            if (iQ == 0) {
                return AbstractC2802f.f29287b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw C2817v.g();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int q() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int r() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long s() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int u() {
            return Q();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long v() {
            return R();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int w() {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long x() {
            return P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public int y() {
            return AbstractC2803g.c(Q());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2803g
        public long z() {
            return AbstractC2803g.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f29320n = Integer.MAX_VALUE;
            AbstractC2816u.b(inputStream, "input");
            this.f29313g = inputStream;
            this.f29314h = new byte[i10];
            this.f29315i = 0;
            this.f29317k = 0;
            this.f29319m = 0;
        }
    }

    /* synthetic */ AbstractC2803g(a aVar) {
        this();
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC2803g g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC2803g h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC2816u.f29505d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC2803g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC2803g j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static AbstractC2803g k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (C2817v e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws C2817v {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f29299a++;
            this.f29299a--;
        } while (F(iC));
    }

    public abstract void a(int i10);

    public void b() throws C2817v {
        if (this.f29299a >= this.f29300b) {
            throw C2817v.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC2802f o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    private AbstractC2803g() {
        this.f29300b = f29298f;
        this.f29301c = Integer.MAX_VALUE;
        this.f29303e = false;
    }
}
