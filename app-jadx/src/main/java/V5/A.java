package V5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class A extends p {

    /* JADX INFO: renamed from: l */
    public static final q f19774l = new A();

    private A() {
    }

    @Override // V5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        float fWidth = rect.left + ((rect.width() - (i10 * f13)) * 0.5f);
        float f14 = rect.top;
        matrix.setScale(f13, f13);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (f14 + 0.5f));
    }

    public String toString() {
        return "fit_y";
    }
}
