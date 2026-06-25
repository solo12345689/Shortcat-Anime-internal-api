package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
class N extends M {
    N() {
    }

    @Override // androidx.transition.F
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.K, androidx.transition.F
    public void d(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.transition.F
    public void e(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // androidx.transition.M, androidx.transition.F
    public void f(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // androidx.transition.I, androidx.transition.F
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.I, androidx.transition.F
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
