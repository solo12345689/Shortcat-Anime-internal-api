package t1;

import java.util.ArrayList;
import m1.C5625d;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6589b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r15 r16
  0x0033: PHI (r15v26 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r15 r16
  0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v28 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r0v27, types: [m1.d] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [m1.d] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [t1.e] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [m1.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(t1.C6593f r37, m1.C5625d r38, int r39, int r40, t1.C6590c r41) {
        /*
            Method dump skipped, instruction units count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC6589b.a(t1.f, m1.d, int, int, t1.c):void");
    }

    public static void b(C6593f c6593f, C5625d c5625d, ArrayList arrayList, int i10) {
        int i11;
        C6590c[] c6590cArr;
        int i12;
        if (i10 == 0) {
            i11 = c6593f.f60421W0;
            c6590cArr = c6593f.f60424Z0;
            i12 = 0;
        } else {
            i11 = c6593f.f60422X0;
            c6590cArr = c6593f.f60423Y0;
            i12 = 2;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            C6590c c6590c = c6590cArr[i13];
            c6590c.a();
            if (arrayList == null || arrayList.contains(c6590c.f60275a)) {
                a(c6593f, c5625d, i10, i12, c6590c);
            }
        }
    }
}
