package V5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class s extends p {

    /* JADX INFO: renamed from: l */
    public static final q f19913l = new s();

    private s() {
    }

    @Override // V5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fHeight;
        float fWidth;
        if (f13 > f12) {
            fWidth = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
            fHeight = rect.top;
            f12 = f13;
        } else {
            float f14 = rect.left;
            fHeight = ((rect.height() - (i11 * f12)) * 0.5f) + rect.top;
            fWidth = f14;
        }
        matrix.setScale(f12, f12);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public String toString() {
        return "center_crop";
    }
}
