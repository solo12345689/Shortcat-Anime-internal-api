package P2;

import M2.n0;
import P2.D;
import P9.AbstractC2011u;
import Q2.k;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import q2.a0;
import q2.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static h0 a(D.a aVar, E[] eArr) {
        List[] listArr = new List[eArr.length];
        for (int i10 = 0; i10 < eArr.length; i10++) {
            E e10 = eArr[i10];
            listArr[i10] = e10 != null ? AbstractC2011u.B(e10) : AbstractC2011u.A();
        }
        return b(aVar, listArr);
    }

    public static h0 b(D.a aVar, List[] listArr) {
        boolean z10;
        AbstractC2011u.a aVar2 = new AbstractC2011u.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            n0 n0VarF = aVar.f(i10);
            List list = listArr[i10];
            for (int i11 = 0; i11 < n0VarF.f12003a; i11++) {
                a0 a0VarB = n0VarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = a0VarB.f56702a;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < a0VarB.f56702a; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        E e10 = (E) list.get(i14);
                        if (e10.m().equals(a0VarB) && e10.l(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new h0.a(a0VarB, z11, iArr, zArr));
            }
        }
        n0 n0VarH = aVar.h();
        for (int i15 = 0; i15 < n0VarH.f12003a; i15++) {
            a0 a0VarB2 = n0VarH.b(i15);
            int[] iArr2 = new int[a0VarB2.f56702a];
            Arrays.fill(iArr2, 0);
            aVar2.a(new h0.a(a0VarB2, false, iArr2, new boolean[a0VarB2.f56702a]));
        }
        return new h0(aVar2.k());
    }

    public static k.a c(A a10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = a10.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (a10.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        return new k.a(1, 0, length, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point d(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = t2.a0.n(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = t2.a0.n(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.F.d(boolean, int, int, int, int):android.graphics.Point");
    }
}
