package Xd;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends c {
    public static int h(int i10, int... other) {
        AbstractC5504s.h(other, "other");
        for (int i11 : other) {
            i10 = Math.max(i10, i11);
        }
        return i10;
    }

    public static int i(int i10, int... other) {
        AbstractC5504s.h(other, "other");
        for (int i11 : other) {
            i10 = Math.min(i10, i11);
        }
        return i10;
    }
}
