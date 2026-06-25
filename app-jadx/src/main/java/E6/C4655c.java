package e6;

import Ud.AbstractC2279u;
import Ud.S;
import java.util.LinkedHashMap;
import java.util.Map;
import oe.AbstractC5874j;
import oe.C5870f;

/* JADX INFO: renamed from: e6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4655c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45813a;

    public C4655c(int i10) {
        this.f45813a = i10;
    }

    public final Map a(int i10, int i11, int i12) {
        float fD = AbstractC5874j.d(AbstractC5874j.i(AbstractC5874j.e(i12, 1), this.f45813a) * b(i10), 0.0f);
        float f10 = i11;
        float fH = f10 / AbstractC5874j.h(fD, f10);
        int i13 = 0;
        C5870f c5870fX = AbstractC5874j.x(0, i11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(c5870fX, 10)), 16));
        for (Object obj : c5870fX) {
            int iIntValue = ((Number) obj).intValue();
            if (((int) (iIntValue % fH)) == 0) {
                i13 = iIntValue;
            }
            linkedHashMap.put(obj, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    public final float b(int i10) {
        return i10 / 1000.0f;
    }
}
