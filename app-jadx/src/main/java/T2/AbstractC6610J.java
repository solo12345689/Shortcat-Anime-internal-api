package t2;

/* JADX INFO: renamed from: t2.J, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6610J {
    public static int a(int i10, int i11) {
        for (int i12 = 1; i12 <= 2; i12++) {
            int i13 = (i10 + i12) % 3;
            if (b(i13, i11)) {
                return i13;
            }
        }
        return i10;
    }

    public static boolean b(int i10, int i11) {
        if (i10 != 0) {
            return i10 != 1 ? i10 == 2 && (i11 & 2) != 0 : (i11 & 1) != 0;
        }
        return true;
    }
}
