package w;

import t.AbstractC6563m;

/* JADX INFO: renamed from: w.P, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6887P {
    public static final int a(AbstractC6563m abstractC6563m, int i10, int i11, int i12) {
        if (!(i11 <= i12)) {
            AbstractC6889a0.a("fromIndex(" + i11 + ") > toIndex(" + i12 + ')');
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Index out of range: " + i11);
        }
        if (i12 > abstractC6563m.c()) {
            throw new IndexOutOfBoundsException("Index out of range: " + i12);
        }
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int iB = abstractC6563m.b(i14);
            if (iB < i10) {
                i11 = i14 + 1;
            } else {
                if (iB <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int b(AbstractC6563m abstractC6563m, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = abstractC6563m.c();
        }
        return a(abstractC6563m, i10, i11, i12);
    }
}
