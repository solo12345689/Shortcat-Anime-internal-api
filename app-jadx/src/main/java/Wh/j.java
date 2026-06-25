package Wh;

import Yh.s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j {
    protected j() {
    }

    public static j a() {
        return null;
    }

    public static j b(s sVar, l lVar) {
        if (sVar == null) {
            throw new NullPointerException("node must not be null");
        }
        if (lVar != null) {
            return new k(sVar, lVar);
        }
        throw new NullPointerException("position must not be null");
    }
}
