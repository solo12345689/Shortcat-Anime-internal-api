package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
abstract class I extends F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f32328d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f32329e = true;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {
        static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    I() {
    }

    @Override // androidx.transition.F
    public void g(View view, Matrix matrix) {
        if (f32328d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32328d = false;
            }
        }
    }

    @Override // androidx.transition.F
    public void h(View view, Matrix matrix) {
        if (f32329e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f32329e = false;
            }
        }
    }
}
