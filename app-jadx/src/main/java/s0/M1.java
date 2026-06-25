package s0;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Matrix f58902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Shader f58903b;

    private final Matrix b() {
        Matrix matrix = this.f58902a;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.f58902a = matrix2;
        return matrix2;
    }

    public final Shader a() {
        return this.f58903b;
    }

    public final void c(Shader shader) {
        Matrix matrix = this.f58902a;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.f58903b = shader;
    }

    public final void d(float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.f58902a = null;
        } else {
            Matrix matrixB = b();
            P.a(matrixB, fArr);
            matrix = matrixB;
        }
        Shader shader = this.f58903b;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
