package K0;

import androidx.compose.ui.e;

/* JADX INFO: renamed from: K0.f0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1787f0 {
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(t.C6545K r14, java.util.Map r15) {
        /*
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            int r1 = r14.f()
            int r2 = r15.size()
            if (r1 == r2) goto Lf
            return r0
        Lf:
            java.lang.Object[] r1 = r14.f60001b
            int[] r2 = r14.f60002c
            long[] r14 = r14.f60000a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L64
            r4 = r0
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5f
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r0
        L35:
            if (r9 >= r7) goto L5d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L59
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r1[r10]
            r10 = r2[r10]
            I0.a r11 = (I0.AbstractC1675a) r11
            java.lang.Object r11 = r15.get(r11)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 != 0) goto L52
            goto L58
        L52:
            int r11 = r11.intValue()
            if (r11 == r10) goto L59
        L58:
            return r0
        L59:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L5d:
            if (r7 != r8) goto L64
        L5f:
            if (r4 == r3) goto L64
            int r4 = r4 + 1
            goto L1b
        L64:
            r14 = 1
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.AbstractC1787f0.c(t.K, java.util.Map):boolean");
    }

    public static final e.c d(InterfaceC1794j interfaceC1794j, int i10, int i11) {
        e.c child$ui_release = interfaceC1794j.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & i10) == 0) {
            return null;
        }
        while (child$ui_release != null) {
            int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
            if ((kindSet$ui_release & i11) != 0) {
                return null;
            }
            if ((kindSet$ui_release & i10) != 0) {
                return child$ui_release;
            }
            child$ui_release = child$ui_release.getChild$ui_release();
        }
        return null;
    }
}
