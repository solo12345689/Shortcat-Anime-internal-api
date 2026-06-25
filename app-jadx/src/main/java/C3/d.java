package C3;

import U2.InterfaceC2256q;
import android.util.Pair;
import java.util.Arrays;
import q2.C6080L;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f2850a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f2851b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f2853b;

        private a(int i10, long j10) {
            this.f2852a = i10;
            this.f2853b = j10;
        }

        public static a a(InterfaceC2256q interfaceC2256q, C6609I c6609i) {
            interfaceC2256q.o(c6609i.f(), 0, 8);
            c6609i.b0(0);
            return new a(c6609i.v(), c6609i.C());
        }
    }

    public static boolean a(InterfaceC2256q interfaceC2256q) {
        C6609I c6609i = new C6609I(8);
        int i10 = a.a(interfaceC2256q, c6609i).f2852a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        interfaceC2256q.o(c6609i.f(), 0, 4);
        c6609i.b0(0);
        int iV = c6609i.v();
        if (iV == 1463899717) {
            return true;
        }
        AbstractC6635w.d("WavHeaderReader", "Unsupported form type: " + iV);
        return false;
    }

    public static c b(InterfaceC2256q interfaceC2256q) throws C6080L {
        byte[] bArr;
        C6609I c6609i = new C6609I(16);
        a aVarD = d(1718449184, interfaceC2256q, c6609i);
        AbstractC6614a.g(aVarD.f2853b >= 16);
        interfaceC2256q.o(c6609i.f(), 0, 16);
        c6609i.b0(0);
        int iE = c6609i.E();
        int iE2 = c6609i.E();
        int iD = c6609i.D();
        int iD2 = c6609i.D();
        int iE3 = c6609i.E();
        int iE4 = c6609i.E();
        int i10 = ((int) aVarD.f2853b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC2256q.o(bArr, 0, i10);
            if (iE == 65534 && i10 == 24) {
                C6609I c6609i2 = new C6609I(bArr);
                c6609i2.E();
                int iE5 = c6609i2.E();
                if (iE5 != 0 && iE5 != iE4) {
                    throw C6080L.d("validBits ( " + iE5 + ")  != bitsPerSample( " + iE4 + ") are not supported");
                }
                int iD3 = c6609i2.D();
                if ((iD3 >> 18) != 0) {
                    throw C6080L.d("invalid channel mask " + iD3);
                }
                if (iD3 != 0 && Integer.bitCount(iD3) != iE2) {
                    throw C6080L.d("invalid number of channels (" + Integer.bitCount(iD3) + ") in channel mask " + iD3);
                }
                iE = c6609i2.E();
                byte[] bArr2 = new byte[14];
                c6609i2.q(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, f2850a) && !Arrays.equals(bArr2, f2851b)) {
                    throw C6080L.d("invalid wav format extension guid");
                }
            }
        } else {
            bArr = a0.f60567f;
        }
        byte[] bArr3 = bArr;
        int i11 = iE;
        interfaceC2256q.m((int) (interfaceC2256q.j() - interfaceC2256q.getPosition()));
        return new c(i11, iE2, iD, iD2, iE3, iE4, bArr3);
    }

    public static long c(InterfaceC2256q interfaceC2256q) {
        C6609I c6609i = new C6609I(8);
        a aVarA = a.a(interfaceC2256q, c6609i);
        if (aVarA.f2852a != 1685272116) {
            interfaceC2256q.g();
            return -1L;
        }
        interfaceC2256q.k(8);
        c6609i.b0(0);
        interfaceC2256q.o(c6609i.f(), 0, 8);
        long jA = c6609i.A();
        interfaceC2256q.m(((int) aVarA.f2853b) + 8);
        return jA;
    }

    private static a d(int i10, InterfaceC2256q interfaceC2256q, C6609I c6609i) throws C6080L {
        a aVarA = a.a(interfaceC2256q, c6609i);
        while (aVarA.f2852a != i10) {
            AbstractC6635w.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f2852a);
            long j10 = aVarA.f2853b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw C6080L.d("Chunk is too large (~2GB+) to skip; id: " + aVarA.f2852a);
            }
            interfaceC2256q.m((int) j11);
            aVarA = a.a(interfaceC2256q, c6609i);
        }
        return aVarA;
    }

    public static Pair e(InterfaceC2256q interfaceC2256q) throws C6080L {
        interfaceC2256q.g();
        a aVarD = d(1684108385, interfaceC2256q, new C6609I(8));
        interfaceC2256q.m(8);
        return Pair.create(Long.valueOf(interfaceC2256q.getPosition()), Long.valueOf(aVarD.f2853b));
    }
}
