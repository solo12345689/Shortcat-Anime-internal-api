package E7;

import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final float a(float f10, float f11) {
        float fPow;
        if (f10 < Math.abs(f11)) {
            fPow = 1 + ((float) Math.pow((f10 / Math.abs(f11)) - r0, 3));
        } else {
            fPow = 1.0f;
        }
        return AbstractC5874j.d(f10 + (f11 * fPow), 0.0f);
    }
}
