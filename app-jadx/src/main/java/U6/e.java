package U6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements SensorEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f19370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f19372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f19373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f19374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SensorManager f19375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19378i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void a();
    }

    public e(a shakeListener, int i10) {
        AbstractC5504s.h(shakeListener, "shakeListener");
        this.f19370a = shakeListener;
        this.f19371b = i10;
    }

    private final boolean a(float f10) {
        return Math.abs(f10) > 13.042845f;
    }

    private final void b(long j10) {
        if (this.f19377h >= this.f19371b * 8) {
            d();
            this.f19370a.a();
        }
        if (j10 - this.f19378i > f.f19380b) {
            d();
        }
    }

    private final void c(long j10) {
        this.f19378i = j10;
        this.f19377h++;
    }

    private final void d() {
        this.f19377h = 0;
        this.f19372c = 0.0f;
        this.f19373d = 0.0f;
        this.f19374e = 0.0f;
    }

    public final void e(SensorManager manager) {
        AbstractC5504s.h(manager, "manager");
        Sensor defaultSensor = manager.getDefaultSensor(1);
        if (defaultSensor == null) {
            return;
        }
        this.f19375f = manager;
        this.f19376g = -1L;
        manager.registerListener(this, defaultSensor, 2);
        this.f19378i = 0L;
        d();
    }

    public final void f() {
        SensorManager sensorManager = this.f19375f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        this.f19375f = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
        AbstractC5504s.h(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        AbstractC5504s.h(sensorEvent, "sensorEvent");
        if (sensorEvent.timestamp - this.f19376g < f.f19379a) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2] - 9.80665f;
        this.f19376g = sensorEvent.timestamp;
        if (a(f10) && this.f19372c * f10 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f19372c = f10;
        } else if (a(f11) && this.f19373d * f11 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f19373d = f11;
        } else if (a(f12) && this.f19374e * f12 <= 0.0f) {
            c(sensorEvent.timestamp);
            this.f19374e = f12;
        }
        b(sensorEvent.timestamp);
    }
}
