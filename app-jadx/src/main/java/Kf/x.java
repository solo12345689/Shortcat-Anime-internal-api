package Kf;

import Jf.I;
import Jf.z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class x extends z implements I {
    public x(int i10) {
        super(1, Integer.MAX_VALUE, If.a.f9115b);
        c(Integer.valueOf(i10));
    }

    @Override // Jf.I
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) L()).intValue());
        }
        return numValueOf;
    }

    public final boolean Z(int i10) {
        boolean zC;
        synchronized (this) {
            zC = c(Integer.valueOf(((Number) L()).intValue() + i10));
        }
        return zC;
    }
}
