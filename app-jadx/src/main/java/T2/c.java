package T2;

import android.opengl.Matrix;
import t2.N;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a */
    private final float[] f17026a = new float[16];

    /* JADX INFO: renamed from: b */
    private final float[] f17027b = new float[16];

    /* JADX INFO: renamed from: c */
    private final N f17028c = new N();

    /* JADX INFO: renamed from: d */
    private boolean f17029d;

    public static void a(float[] fArr, float[] fArr2) {
        r.o(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
        float f12 = fArr2[10];
        fArr[0] = f12 / fSqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / fSqrt;
        fArr[8] = (-f13) / fSqrt;
        fArr[10] = f12 / fSqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
        } else {
            r.o(fArr);
        }
    }

    public boolean c(float[] fArr, long j10) {
        float[] fArr2 = (float[]) this.f17028c.j(j10);
        if (fArr2 == null) {
            return false;
        }
        b(this.f17027b, fArr2);
        if (!this.f17029d) {
            a(this.f17026a, this.f17027b);
            this.f17029d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f17026a, 0, this.f17027b, 0);
        return true;
    }

    public void d() {
        this.f17028c.c();
        this.f17029d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f17028c.a(j10, fArr);
    }
}
