package o3;

import U2.InterfaceC2256q;
import U2.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f54408a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f54408a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static N b(InterfaceC2256q interfaceC2256q) {
        return c(interfaceC2256q, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static U2.N c(U2.InterfaceC2256q r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.s.c(U2.q, boolean, boolean):U2.N");
    }

    public static N d(InterfaceC2256q interfaceC2256q, boolean z10) {
        return c(interfaceC2256q, false, z10);
    }
}
