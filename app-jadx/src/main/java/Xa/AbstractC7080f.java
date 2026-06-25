package xa;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: xa.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7080f {

    /* JADX INFO: renamed from: f */
    private static volatile int f64207f = 100;

    /* JADX INFO: renamed from: a */
    int f64208a;

    /* JADX INFO: renamed from: b */
    int f64209b;

    /* JADX INFO: renamed from: c */
    int f64210c;

    /* JADX INFO: renamed from: d */
    C7081g f64211d;

    /* JADX INFO: renamed from: e */
    private boolean f64212e;

    /* JADX INFO: renamed from: xa.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b extends AbstractC7080f {

        /* JADX INFO: renamed from: g */
        private final byte[] f64213g;

        /* JADX INFO: renamed from: h */
        private final boolean f64214h;

        /* JADX INFO: renamed from: i */
        private int f64215i;

        /* JADX INFO: renamed from: j */
        private int f64216j;

        /* JADX INFO: renamed from: k */
        private int f64217k;

        /* JADX INFO: renamed from: l */
        private int f64218l;

        /* JADX INFO: renamed from: m */
        private int f64219m;

        /* JADX INFO: renamed from: n */
        private boolean f64220n;

        /* JADX INFO: renamed from: o */
        private int f64221o;

        /* synthetic */ b(byte[] bArr, int i10, int i11, boolean z10, a aVar) {
            this(bArr, i10, i11, z10);
        }

        private void O() {
            int i10 = this.f64215i + this.f64216j;
            this.f64215i = i10;
            int i11 = i10 - this.f64218l;
            int i12 = this.f64221o;
            if (i11 <= i12) {
                this.f64216j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f64216j = i13;
            this.f64215i = i10 - i13;
        }

        private void Q() throws r {
            if (this.f64215i - this.f64217k >= 10) {
                R();
            } else {
                S();
            }
        }

        private void R() throws r {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f64213g;
                int i11 = this.f64217k;
                this.f64217k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw r.f();
        }

        private void S() throws r {
            for (int i10 = 0; i10 < 10; i10++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw r.f();
        }

        @Override // xa.AbstractC7080f
        public String A() throws r {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f64215i;
                int i11 = this.f64217k;
                if (iL <= i10 - i11) {
                    String str = new String(this.f64213g, i11, iL, AbstractC7091q.f64260b);
                    this.f64217k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw r.g();
            }
            throw r.m();
        }

        @Override // xa.AbstractC7080f
        public String B() throws r {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f64215i;
                int i11 = this.f64217k;
                if (iL <= i10 - i11) {
                    String strE = d0.e(this.f64213g, i11, iL);
                    this.f64217k += iL;
                    return strE;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw r.g();
            }
            throw r.m();
        }

        @Override // xa.AbstractC7080f
        public int C() throws r {
            if (f()) {
                this.f64219m = 0;
                return 0;
            }
            int iL = L();
            this.f64219m = iL;
            if (e0.a(iL) != 0) {
                return this.f64219m;
            }
            throw r.c();
        }

        @Override // xa.AbstractC7080f
        public int D() {
            return L();
        }

        @Override // xa.AbstractC7080f
        public long E() {
            return M();
        }

        @Override // xa.AbstractC7080f
        public boolean F(int i10) throws r {
            int iB = e0.b(i10);
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
                a(e0.c(e0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw r.e();
            }
            P(4);
            return true;
        }

        public byte H() throws r {
            int i10 = this.f64217k;
            if (i10 == this.f64215i) {
                throw r.m();
            }
            byte[] bArr = this.f64213g;
            this.f64217k = i10 + 1;
            return bArr[i10];
        }

        public byte[] I(int i10) throws r {
            if (i10 > 0) {
                int i11 = this.f64215i;
                int i12 = this.f64217k;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f64217k = i13;
                    return Arrays.copyOfRange(this.f64213g, i12, i13);
                }
            }
            if (i10 > 0) {
                throw r.m();
            }
            if (i10 == 0) {
                return AbstractC7091q.f64262d;
            }
            throw r.g();
        }

        public int J() throws r {
            int i10 = this.f64217k;
            if (this.f64215i - i10 < 4) {
                throw r.m();
            }
            byte[] bArr = this.f64213g;
            this.f64217k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long K() throws r {
            int i10 = this.f64217k;
            if (this.f64215i - i10 < 8) {
                throw r.m();
            }
            byte[] bArr = this.f64213g;
            this.f64217k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int L() {
            int i10;
            int i11 = this.f64217k;
            int i12 = this.f64215i;
            if (i12 != i11) {
                byte[] bArr = this.f64213g;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f64217k = i13;
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
                    this.f64217k = i14;
                    return i10;
                }
            }
            return (int) N();
        }

        public long M() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f64217k;
            int i11 = this.f64215i;
            if (i11 != i10) {
                byte[] bArr = this.f64213g;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f64217k = i12;
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
                    this.f64217k = i13;
                    return j10;
                }
            }
            return N();
        }

        long N() throws r {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bH = H();
                j10 |= ((long) (bH & 127)) << i10;
                if ((bH & 128) == 0) {
                    return j10;
                }
            }
            throw r.f();
        }

        public void P(int i10) throws r {
            if (i10 >= 0) {
                int i11 = this.f64215i;
                int i12 = this.f64217k;
                if (i10 <= i11 - i12) {
                    this.f64217k = i12 + i10;
                    return;
                }
            }
            if (i10 >= 0) {
                throw r.m();
            }
            throw r.g();
        }

        @Override // xa.AbstractC7080f
        public void a(int i10) throws r {
            if (this.f64219m != i10) {
                throw r.b();
            }
        }

        @Override // xa.AbstractC7080f
        public int e() {
            return this.f64217k - this.f64218l;
        }

        @Override // xa.AbstractC7080f
        public boolean f() {
            return this.f64217k == this.f64215i;
        }

        @Override // xa.AbstractC7080f
        public void l(int i10) {
            this.f64221o = i10;
            O();
        }

        @Override // xa.AbstractC7080f
        public int m(int i10) throws r {
            if (i10 < 0) {
                throw r.g();
            }
            int iE = i10 + e();
            if (iE < 0) {
                throw r.h();
            }
            int i11 = this.f64221o;
            if (iE > i11) {
                throw r.m();
            }
            this.f64221o = iE;
            O();
            return i11;
        }

        @Override // xa.AbstractC7080f
        public boolean n() {
            return M() != 0;
        }

        @Override // xa.AbstractC7080f
        public AbstractC7079e o() {
            int iL = L();
            if (iL > 0) {
                int i10 = this.f64215i;
                int i11 = this.f64217k;
                if (iL <= i10 - i11) {
                    AbstractC7079e abstractC7079eF = (this.f64214h && this.f64220n) ? AbstractC7079e.F(this.f64213g, i11, iL) : AbstractC7079e.i(this.f64213g, i11, iL);
                    this.f64217k += iL;
                    return abstractC7079eF;
                }
            }
            return iL == 0 ? AbstractC7079e.f64161b : AbstractC7079e.D(I(iL));
        }

        @Override // xa.AbstractC7080f
        public double p() {
            return Double.longBitsToDouble(K());
        }

        @Override // xa.AbstractC7080f
        public int q() {
            return L();
        }

        @Override // xa.AbstractC7080f
        public int r() {
            return J();
        }

        @Override // xa.AbstractC7080f
        public long s() {
            return K();
        }

        @Override // xa.AbstractC7080f
        public float t() {
            return Float.intBitsToFloat(J());
        }

        @Override // xa.AbstractC7080f
        public int u() {
            return L();
        }

        @Override // xa.AbstractC7080f
        public long v() {
            return M();
        }

        @Override // xa.AbstractC7080f
        public int w() {
            return J();
        }

        @Override // xa.AbstractC7080f
        public long x() {
            return K();
        }

        @Override // xa.AbstractC7080f
        public int y() {
            return AbstractC7080f.c(L());
        }

        @Override // xa.AbstractC7080f
        public long z() {
            return AbstractC7080f.d(M());
        }

        private b(byte[] bArr, int i10, int i11, boolean z10) {
            super();
            this.f64221o = Integer.MAX_VALUE;
            this.f64213g = bArr;
            this.f64215i = i11 + i10;
            this.f64217k = i10;
            this.f64218l = i10;
            this.f64214h = z10;
        }
    }

    /* JADX INFO: renamed from: xa.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c extends AbstractC7080f {

        /* JADX INFO: renamed from: g */
        private final InputStream f64222g;

        /* JADX INFO: renamed from: h */
        private final byte[] f64223h;

        /* JADX INFO: renamed from: i */
        private int f64224i;

        /* JADX INFO: renamed from: j */
        private int f64225j;

        /* JADX INFO: renamed from: k */
        private int f64226k;

        /* JADX INFO: renamed from: l */
        private int f64227l;

        /* JADX INFO: renamed from: m */
        private int f64228m;

        /* JADX INFO: renamed from: n */
        private int f64229n;

        /* synthetic */ c(InputStream inputStream, int i10, a aVar) {
            this(inputStream, i10);
        }

        private static int H(InputStream inputStream) throws r {
            try {
                return inputStream.available();
            } catch (r e10) {
                e10.j();
                throw e10;
            }
        }

        private static int I(InputStream inputStream, byte[] bArr, int i10, int i11) throws r {
            try {
                return inputStream.read(bArr, i10, i11);
            } catch (r e10) {
                e10.j();
                throw e10;
            }
        }

        private AbstractC7079e J(int i10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return AbstractC7079e.f(bArrM);
            }
            int i11 = this.f64226k;
            int i12 = this.f64224i;
            int length = i12 - i11;
            this.f64228m += i12;
            this.f64226k = 0;
            this.f64224i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f64223h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC7079e.D(bArr);
        }

        private byte[] L(int i10, boolean z10) throws IOException {
            byte[] bArrM = M(i10);
            if (bArrM != null) {
                return z10 ? (byte[]) bArrM.clone() : bArrM;
            }
            int i11 = this.f64226k;
            int i12 = this.f64224i;
            int length = i12 - i11;
            this.f64228m += i12;
            this.f64226k = 0;
            this.f64224i = 0;
            List<byte[]> listN = N(i10 - length);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f64223h, i11, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] M(int i10) throws r {
            if (i10 == 0) {
                return AbstractC7091q.f64262d;
            }
            if (i10 < 0) {
                throw r.g();
            }
            int i11 = this.f64228m;
            int i12 = this.f64226k;
            int i13 = i11 + i12 + i10;
            if (i13 - this.f64210c > 0) {
                throw r.l();
            }
            int i14 = this.f64229n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw r.m();
            }
            int i15 = this.f64224i - i12;
            int i16 = i10 - i15;
            if (i16 >= 4096 && i16 > H(this.f64222g)) {
                return null;
            }
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f64223h, this.f64226k, bArr, 0, i15);
            this.f64228m += this.f64224i;
            this.f64226k = 0;
            this.f64224i = 0;
            while (i15 < i10) {
                int I10 = I(this.f64222g, bArr, i15, i10 - i15);
                if (I10 == -1) {
                    throw r.m();
                }
                this.f64228m += I10;
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
                    int i12 = this.f64222g.read(bArr, i11, iMin - i11);
                    if (i12 == -1) {
                        throw r.m();
                    }
                    this.f64228m += i12;
                    i11 += i12;
                }
                i10 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void T() {
            int i10 = this.f64224i + this.f64225j;
            this.f64224i = i10;
            int i11 = this.f64228m + i10;
            int i12 = this.f64229n;
            if (i11 <= i12) {
                this.f64225j = 0;
                return;
            }
            int i13 = i11 - i12;
            this.f64225j = i13;
            this.f64224i = i10 - i13;
        }

        private void U(int i10) throws r {
            if (b0(i10)) {
                return;
            }
            if (i10 <= (this.f64210c - this.f64228m) - this.f64226k) {
                throw r.m();
            }
            throw r.l();
        }

        private static long V(InputStream inputStream, long j10) throws r {
            try {
                return inputStream.skip(j10);
            } catch (r e10) {
                e10.j();
                throw e10;
            }
        }

        private void X(int i10) throws r {
            if (i10 < 0) {
                throw r.g();
            }
            int i11 = this.f64228m;
            int i12 = this.f64226k;
            int i13 = i11 + i12 + i10;
            int i14 = this.f64229n;
            if (i13 > i14) {
                W((i14 - i11) - i12);
                throw r.m();
            }
            this.f64228m = i11 + i12;
            int i15 = this.f64224i - i12;
            this.f64224i = 0;
            this.f64226k = 0;
            while (i15 < i10) {
                try {
                    long j10 = i10 - i15;
                    long jV = V(this.f64222g, j10);
                    if (jV < 0 || jV > j10) {
                        throw new IllegalStateException(this.f64222g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i15 += (int) jV;
                    }
                } finally {
                    this.f64228m += i15;
                    T();
                }
            }
            if (i15 >= i10) {
                return;
            }
            int i16 = this.f64224i;
            int i17 = i16 - this.f64226k;
            this.f64226k = i16;
            U(1);
            while (true) {
                int i18 = i10 - i17;
                int i19 = this.f64224i;
                if (i18 <= i19) {
                    this.f64226k = i18;
                    return;
                } else {
                    i17 += i19;
                    this.f64226k = i19;
                    U(1);
                }
            }
        }

        private void Y() throws r {
            if (this.f64224i - this.f64226k >= 10) {
                Z();
            } else {
                a0();
            }
        }

        private void Z() throws r {
            for (int i10 = 0; i10 < 10; i10++) {
                byte[] bArr = this.f64223h;
                int i11 = this.f64226k;
                this.f64226k = i11 + 1;
                if (bArr[i11] >= 0) {
                    return;
                }
            }
            throw r.f();
        }

        private void a0() throws r {
            for (int i10 = 0; i10 < 10; i10++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw r.f();
        }

        private boolean b0(int i10) throws r {
            int i11 = this.f64226k;
            int i12 = i11 + i10;
            int i13 = this.f64224i;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.f64210c;
            int i15 = this.f64228m;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f64229n) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.f64223h;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f64228m += i11;
                this.f64224i -= i11;
                this.f64226k = 0;
            }
            InputStream inputStream = this.f64222g;
            byte[] bArr2 = this.f64223h;
            int i16 = this.f64224i;
            int I10 = I(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.f64210c - this.f64228m) - i16));
            if (I10 == 0 || I10 < -1 || I10 > this.f64223h.length) {
                throw new IllegalStateException(this.f64222g.getClass() + "#read(byte[]) returned invalid result: " + I10 + "\nThe InputStream implementation is buggy.");
            }
            if (I10 <= 0) {
                return false;
            }
            this.f64224i += I10;
            T();
            if (this.f64224i >= i10) {
                return true;
            }
            return b0(i10);
        }

        @Override // xa.AbstractC7080f
        public String A() throws r {
            int iQ = Q();
            if (iQ > 0) {
                int i10 = this.f64224i;
                int i11 = this.f64226k;
                if (iQ <= i10 - i11) {
                    String str = new String(this.f64223h, i11, iQ, AbstractC7091q.f64260b);
                    this.f64226k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ < 0) {
                throw r.g();
            }
            if (iQ > this.f64224i) {
                return new String(L(iQ, false), AbstractC7091q.f64260b);
            }
            U(iQ);
            String str2 = new String(this.f64223h, this.f64226k, iQ, AbstractC7091q.f64260b);
            this.f64226k += iQ;
            return str2;
        }

        @Override // xa.AbstractC7080f
        public String B() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i10 = this.f64226k;
            int i11 = this.f64224i;
            if (iQ <= i11 - i10 && iQ > 0) {
                bArrL = this.f64223h;
                this.f64226k = i10 + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                if (iQ < 0) {
                    throw r.g();
                }
                i10 = 0;
                if (iQ <= i11) {
                    U(iQ);
                    bArrL = this.f64223h;
                    this.f64226k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return d0.e(bArrL, i10, iQ);
        }

        @Override // xa.AbstractC7080f
        public int C() throws r {
            if (f()) {
                this.f64227l = 0;
                return 0;
            }
            int iQ = Q();
            this.f64227l = iQ;
            if (e0.a(iQ) != 0) {
                return this.f64227l;
            }
            throw r.c();
        }

        @Override // xa.AbstractC7080f
        public int D() {
            return Q();
        }

        @Override // xa.AbstractC7080f
        public long E() {
            return R();
        }

        @Override // xa.AbstractC7080f
        public boolean F(int i10) throws r {
            int iB = e0.b(i10);
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
                a(e0.c(e0.a(i10), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw r.e();
            }
            W(4);
            return true;
        }

        public byte K() throws r {
            if (this.f64226k == this.f64224i) {
                U(1);
            }
            byte[] bArr = this.f64223h;
            int i10 = this.f64226k;
            this.f64226k = i10 + 1;
            return bArr[i10];
        }

        public int O() throws r {
            int i10 = this.f64226k;
            if (this.f64224i - i10 < 4) {
                U(4);
                i10 = this.f64226k;
            }
            byte[] bArr = this.f64223h;
            this.f64226k = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long P() throws r {
            int i10 = this.f64226k;
            if (this.f64224i - i10 < 8) {
                U(8);
                i10 = this.f64226k;
            }
            byte[] bArr = this.f64223h;
            this.f64226k = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        public int Q() {
            int i10;
            int i11 = this.f64226k;
            int i12 = this.f64224i;
            if (i12 != i11) {
                byte[] bArr = this.f64223h;
                int i13 = i11 + 1;
                byte b10 = bArr[i11];
                if (b10 >= 0) {
                    this.f64226k = i13;
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
                    this.f64226k = i14;
                    return i10;
                }
            }
            return (int) S();
        }

        public long R() {
            long j10;
            long j11;
            long j12;
            int i10 = this.f64226k;
            int i11 = this.f64224i;
            if (i11 != i10) {
                byte[] bArr = this.f64223h;
                int i12 = i10 + 1;
                byte b10 = bArr[i10];
                if (b10 >= 0) {
                    this.f64226k = i12;
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
                    this.f64226k = i13;
                    return j10;
                }
            }
            return S();
        }

        long S() throws r {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte bK = K();
                j10 |= ((long) (bK & 127)) << i10;
                if ((bK & 128) == 0) {
                    return j10;
                }
            }
            throw r.f();
        }

        public void W(int i10) throws r {
            int i11 = this.f64224i;
            int i12 = this.f64226k;
            if (i10 > i11 - i12 || i10 < 0) {
                X(i10);
            } else {
                this.f64226k = i12 + i10;
            }
        }

        @Override // xa.AbstractC7080f
        public void a(int i10) throws r {
            if (this.f64227l != i10) {
                throw r.b();
            }
        }

        @Override // xa.AbstractC7080f
        public int e() {
            return this.f64228m + this.f64226k;
        }

        @Override // xa.AbstractC7080f
        public boolean f() {
            return this.f64226k == this.f64224i && !b0(1);
        }

        @Override // xa.AbstractC7080f
        public void l(int i10) {
            this.f64229n = i10;
            T();
        }

        @Override // xa.AbstractC7080f
        public int m(int i10) throws r {
            if (i10 < 0) {
                throw r.g();
            }
            int i11 = i10 + this.f64228m + this.f64226k;
            int i12 = this.f64229n;
            if (i11 > i12) {
                throw r.m();
            }
            this.f64229n = i11;
            T();
            return i12;
        }

        @Override // xa.AbstractC7080f
        public boolean n() {
            return R() != 0;
        }

        @Override // xa.AbstractC7080f
        public AbstractC7079e o() throws r {
            int iQ = Q();
            int i10 = this.f64224i;
            int i11 = this.f64226k;
            if (iQ <= i10 - i11 && iQ > 0) {
                AbstractC7079e abstractC7079eI = AbstractC7079e.i(this.f64223h, i11, iQ);
                this.f64226k += iQ;
                return abstractC7079eI;
            }
            if (iQ == 0) {
                return AbstractC7079e.f64161b;
            }
            if (iQ >= 0) {
                return J(iQ);
            }
            throw r.g();
        }

        @Override // xa.AbstractC7080f
        public double p() {
            return Double.longBitsToDouble(P());
        }

        @Override // xa.AbstractC7080f
        public int q() {
            return Q();
        }

        @Override // xa.AbstractC7080f
        public int r() {
            return O();
        }

        @Override // xa.AbstractC7080f
        public long s() {
            return P();
        }

        @Override // xa.AbstractC7080f
        public float t() {
            return Float.intBitsToFloat(O());
        }

        @Override // xa.AbstractC7080f
        public int u() {
            return Q();
        }

        @Override // xa.AbstractC7080f
        public long v() {
            return R();
        }

        @Override // xa.AbstractC7080f
        public int w() {
            return O();
        }

        @Override // xa.AbstractC7080f
        public long x() {
            return P();
        }

        @Override // xa.AbstractC7080f
        public int y() {
            return AbstractC7080f.c(Q());
        }

        @Override // xa.AbstractC7080f
        public long z() {
            return AbstractC7080f.d(R());
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f64229n = Integer.MAX_VALUE;
            AbstractC7091q.b(inputStream, "input");
            this.f64222g = inputStream;
            this.f64223h = new byte[i10];
            this.f64224i = 0;
            this.f64226k = 0;
            this.f64228m = 0;
        }
    }

    /* synthetic */ AbstractC7080f(a aVar) {
        this();
    }

    public static int c(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long d(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static AbstractC7080f g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static AbstractC7080f h(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? i(AbstractC7091q.f64262d) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC7080f i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static AbstractC7080f j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10, i11, false);
    }

    static AbstractC7080f k(byte[] bArr, int i10, int i11, boolean z10) {
        b bVar = new b(bArr, i10, i11, z10);
        try {
            bVar.m(i11);
            return bVar;
        } catch (r e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i10);

    public void G() throws r {
        int iC;
        do {
            iC = C();
            if (iC == 0) {
                return;
            }
            b();
            this.f64208a++;
            this.f64208a--;
        } while (F(iC));
    }

    public abstract void a(int i10);

    public void b() throws r {
        if (this.f64208a >= this.f64209b) {
            throw r.i();
        }
    }

    public abstract int e();

    public abstract boolean f();

    public abstract void l(int i10);

    public abstract int m(int i10);

    public abstract boolean n();

    public abstract AbstractC7079e o();

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

    private AbstractC7080f() {
        this.f64209b = f64207f;
        this.f64210c = Integer.MAX_VALUE;
        this.f64212e = false;
    }
}
