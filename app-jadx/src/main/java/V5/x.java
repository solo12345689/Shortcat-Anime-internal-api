package V5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class x extends p {

    /* JADX INFO: renamed from: l */
    public static final q f19918l = new x();

    private x() {
    }

    @Override // V5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fMin = Math.min(f12, f13);
        float f14 = rect.left;
        float f15 = rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f14 + 0.5f), (int) (f15 + 0.5f));
    }

    public String toString() {
        return "fit_start";
    }
}
