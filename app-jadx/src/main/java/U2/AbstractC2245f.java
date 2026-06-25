package U2;

import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.C6609I;

/* JADX INFO: renamed from: U2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2245f {
    public static void a(long j10, C6609I c6609i, O[] oArr) {
        while (true) {
            if (c6609i.a() <= 1) {
                return;
            }
            int iC = c(c6609i);
            int iC2 = c(c6609i);
            int iG = c6609i.g() + iC2;
            if (iC2 == -1 || iC2 > c6609i.a()) {
                AbstractC6635w.i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iG = c6609i.j();
            } else if (iC == 4 && iC2 >= 8) {
                int iM = c6609i.M();
                int iU = c6609i.U();
                int iV = iU == 49 ? c6609i.v() : 0;
                int iM2 = c6609i.M();
                if (iU == 47) {
                    c6609i.c0(1);
                }
                boolean z10 = iM == 181 && (iU == 49 || iU == 47) && iM2 == 3;
                if (iU == 49) {
                    z10 &= iV == 1195456820;
                }
                if (z10) {
                    b(j10, c6609i, oArr);
                }
            }
            c6609i.b0(iG);
        }
    }

    public static void b(long j10, C6609I c6609i, O[] oArr) {
        int iM = c6609i.M();
        if ((iM & 64) != 0) {
            c6609i.c0(1);
            int i10 = (iM & 31) * 3;
            int iG = c6609i.g();
            for (O o10 : oArr) {
                c6609i.b0(iG);
                o10.f(c6609i, i10);
                AbstractC6614a.g(j10 != -9223372036854775807L);
                o10.a(j10, 1, i10, 0, null);
            }
        }
    }

    private static int c(C6609I c6609i) {
        int i10 = 0;
        while (c6609i.a() != 0) {
            int iM = c6609i.M();
            i10 += iM;
            if (iM != 255) {
                return i10;
            }
        }
        return -1;
    }
}
