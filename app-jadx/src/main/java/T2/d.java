package T2;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class d implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f17030a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f17031b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f17032c = new float[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f17033d = new float[3];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Display f17034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f17035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17036g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a(float[] fArr, float f10);
    }

    public d(Display display, a... aVarArr) {
        this.f17034e = display;
        this.f17035f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f17031b);
        SensorManager.getOrientation(this.f17031b, this.f17033d);
        return this.f17033d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a aVar : this.f17035f) {
            aVar.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f17036g) {
            c.a(this.f17032c, fArr);
            this.f17036g = true;
        }
        float[] fArr2 = this.f17031b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f17031b, 0, this.f17032c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                i11 = 130;
            }
            float[] fArr2 = this.f17031b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f17031b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f17030a, sensorEvent.values);
        d(this.f17030a, this.f17034e.getRotation());
        float fA = a(this.f17030a);
        e(this.f17030a);
        c(this.f17030a);
        b(this.f17030a, fA);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
