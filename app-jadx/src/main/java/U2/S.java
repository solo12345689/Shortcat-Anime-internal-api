package U2;

import P9.AbstractC2011u;
import android.util.Base64;
import g3.C4837a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l3.C5546a;
import q2.C6078J;
import q2.C6080L;
import t2.AbstractC6635w;
import t2.C6609I;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f18949a;

        /* JADX INFO: renamed from: b */
        public final String[] f18950b;

        /* JADX INFO: renamed from: c */
        public final int f18951c;

        public a(String str, String[] strArr, int i10) {
            this.f18949a = str;
            this.f18950b = strArr;
            this.f18951c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final boolean f18952a;

        /* JADX INFO: renamed from: b */
        public final int f18953b;

        /* JADX INFO: renamed from: c */
        public final int f18954c;

        /* JADX INFO: renamed from: d */
        public final int f18955d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f18952a = z10;
            this.f18953b = i10;
            this.f18954c = i11;
            this.f18955d = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f18956a;

        /* JADX INFO: renamed from: b */
        public final int f18957b;

        /* JADX INFO: renamed from: c */
        public final int f18958c;

        /* JADX INFO: renamed from: d */
        public final int f18959d;

        /* JADX INFO: renamed from: e */
        public final int f18960e;

        /* JADX INFO: renamed from: f */
        public final int f18961f;

        /* JADX INFO: renamed from: g */
        public final int f18962g;

        /* JADX INFO: renamed from: h */
        public final int f18963h;

        /* JADX INFO: renamed from: i */
        public final boolean f18964i;

        /* JADX INFO: renamed from: j */
        public final byte[] f18965j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f18956a = i10;
            this.f18957b = i11;
            this.f18958c = i12;
            this.f18959d = i13;
            this.f18960e = i14;
            this.f18961f = i15;
            this.f18962g = i16;
            this.f18963h = i17;
            this.f18964i = z10;
            this.f18965j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static C6078J d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] strArrW1 = a0.w1(str, com.amazon.a.a.o.b.f.f34695b);
            if (strArrW1.length != 2) {
                AbstractC6635w.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrW1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C4837a.d(new C6609I(Base64.decode(strArrW1[1], 0))));
                } catch (RuntimeException e10) {
                    AbstractC6635w.j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new C5546a(strArrW1[0], strArrW1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C6078J(arrayList);
    }

    public static AbstractC2011u e(byte[] bArr) {
        C6609I c6609i = new C6609I(bArr);
        c6609i.c0(1);
        int i10 = 0;
        while (c6609i.a() > 0 && c6609i.n() == 255) {
            i10 += 255;
            c6609i.c0(1);
        }
        int iM = i10 + c6609i.M();
        int i11 = 0;
        while (c6609i.a() > 0 && c6609i.n() == 255) {
            i11 += 255;
            c6609i.c0(1);
        }
        int iM2 = i11 + c6609i.M();
        byte[] bArr2 = new byte[iM];
        int iG = c6609i.g();
        System.arraycopy(bArr, iG, bArr2, 0, iM);
        int i12 = iG + iM + iM2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return AbstractC2011u.D(bArr2, bArr3);
    }

    private static void f(Q q10) throws C6080L {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = q10.d(16);
            if (iD2 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int iD3 = q10.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    q10.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw C6080L.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q10.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = q10.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int iD6 = q10.d(2);
                    if (iD6 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int iD7 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    private static void g(int i10, Q q10) throws C6080L {
        int iD = q10.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q10.d(16);
            if (iD2 != 0) {
                AbstractC6635w.d("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q10.c() ? q10.d(4) + 1 : 1;
                if (q10.c()) {
                    int iD4 = q10.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        q10.e(b(i13));
                        q10.e(b(i13));
                    }
                }
                if (q10.d(2) != 0) {
                    throw C6080L.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q10.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    q10.e(8);
                    q10.e(8);
                    q10.e(8);
                }
            }
        }
    }

    private static b[] h(Q q10) {
        int iD = q10.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    private static void i(Q q10) throws C6080L {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (q10.d(16) > 2) {
                throw C6080L.a("residueType greater than 2 is not decodable", null);
            }
            q10.e(24);
            q10.e(24);
            q10.e(24);
            int iD2 = q10.d(6) + 1;
            q10.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((q10.c() ? q10.d(5) : 0) * 8) + q10.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q10.e(8);
                    }
                }
            }
        }
    }

    public static a j(C6609I c6609i) {
        return k(c6609i, true, true);
    }

    public static a k(C6609I c6609i, boolean z10, boolean z11) throws C6080L {
        if (z10) {
            o(3, c6609i, false);
        }
        String strJ = c6609i.J((int) c6609i.C());
        int length = strJ.length();
        long jC = c6609i.C();
        String[] strArr = new String[(int) jC];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jC; i10++) {
            String strJ2 = c6609i.J((int) c6609i.C());
            strArr[i10] = strJ2;
            length2 = length2 + 4 + strJ2.length();
        }
        if (z11 && (c6609i.M() & 1) == 0) {
            throw C6080L.a("framing bit expected to be set", null);
        }
        return new a(strJ, strArr, length2 + 1);
    }

    public static c l(C6609I c6609i) throws C6080L {
        o(1, c6609i, false);
        int iD = c6609i.D();
        int iM = c6609i.M();
        int iD2 = c6609i.D();
        int iZ = c6609i.z();
        if (iZ <= 0) {
            iZ = -1;
        }
        int iZ2 = c6609i.z();
        if (iZ2 <= 0) {
            iZ2 = -1;
        }
        int iZ3 = c6609i.z();
        if (iZ3 <= 0) {
            iZ3 = -1;
        }
        int iM2 = c6609i.M();
        return new c(iD, iM, iD2, iZ, iZ2, iZ3, (int) Math.pow(2.0d, iM2 & 15), (int) Math.pow(2.0d, (iM2 & 240) >> 4), (c6609i.M() & 1) > 0, Arrays.copyOf(c6609i.f(), c6609i.j()));
    }

    public static b[] m(C6609I c6609i, int i10) throws C6080L {
        o(5, c6609i, false);
        int iM = c6609i.M() + 1;
        Q q10 = new Q(c6609i.f());
        q10.e(c6609i.g() * 8);
        for (int i11 = 0; i11 < iM; i11++) {
            n(q10);
        }
        int iD = q10.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (q10.d(16) != 0) {
                throw C6080L.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] bVarArrH = h(q10);
        if (q10.c()) {
            return bVarArrH;
        }
        throw C6080L.a("framing bit after modes not set as expected", null);
    }

    private static void n(Q q10) throws C6080L {
        if (q10.d(24) != 5653314) {
            throw C6080L.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), null);
        }
        int iD = q10.d(16);
        int iD2 = q10.d(24);
        int iD3 = 0;
        if (q10.c()) {
            q10.e(5);
            while (iD3 < iD2) {
                iD3 += q10.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q10.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q10.e(5);
                } else if (q10.c()) {
                    q10.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q10.d(4);
        if (iD4 > 2) {
            throw C6080L.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q10.e(32);
            q10.e(32);
            int iD5 = q10.d(4) + 1;
            q10.e(1);
            q10.e((int) ((iD4 == 1 ? iD != 0 ? c(iD2, iD) : 0L : ((long) iD) * ((long) iD2)) * ((long) iD5)));
        }
    }

    public static boolean o(int i10, C6609I c6609i, boolean z10) throws C6080L {
        if (c6609i.a() < 7) {
            if (z10) {
                return false;
            }
            throw C6080L.a("too short header: " + c6609i.a(), null);
        }
        if (c6609i.M() != i10) {
            if (z10) {
                return false;
            }
            throw C6080L.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (c6609i.M() == 118 && c6609i.M() == 111 && c6609i.M() == 114 && c6609i.M() == 98 && c6609i.M() == 105 && c6609i.M() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw C6080L.a("expected characters 'vorbis'", null);
    }
}
