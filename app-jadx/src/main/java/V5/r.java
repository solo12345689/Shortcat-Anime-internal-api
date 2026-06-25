package V5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class r extends p {

    /* JADX INFO: renamed from: l */
    public static final q f19912l = new r();

    private r() {
    }

    @Override // V5.p
    public void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13) {
        matrix.setTranslate((int) (rect.left + ((rect.width() - i10) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i11) * 0.5f) + 0.5f));
    }

    public String toString() {
        return "center";
    }
}
