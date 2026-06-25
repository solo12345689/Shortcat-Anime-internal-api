package V5;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p implements q {
    @Override // V5.q
    public Matrix a(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11) {
        b(matrix, rect, i10, i11, f10, f11, rect.width() / i10, rect.height() / i11);
        return matrix;
    }

    public abstract void b(Matrix matrix, Rect rect, int i10, int i11, float f10, float f11, float f12, float f13);
}
