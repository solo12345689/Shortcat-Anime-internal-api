package T2;

import S2.u;
import T2.d;
import T2.m;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import t2.AbstractC6614a;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends GLSurfaceView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f17081m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f17082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SensorManager f17083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Sensor f17084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f17085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f17086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f17087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f17088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SurfaceTexture f17089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Surface f17090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17093l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    final class a implements GLSurfaceView.Renderer, m.a, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f17094a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f17097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float[] f17098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float[] f17099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f17100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f17101h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f17095b = new float[16];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f17096c = new float[16];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float[] f17102i = new float[16];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f17103j = new float[16];

        public a(i iVar) {
            float[] fArr = new float[16];
            this.f17097d = fArr;
            float[] fArr2 = new float[16];
            this.f17098e = fArr2;
            float[] fArr3 = new float[16];
            this.f17099f = fArr3;
            this.f17094a = iVar;
            r.o(fArr);
            r.o(fArr2);
            r.o(fArr3);
            this.f17101h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f17098e, 0, -this.f17100g, (float) Math.cos(this.f17101h), (float) Math.sin(this.f17101h), 0.0f);
        }

        @Override // T2.d.a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f17097d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f17101h = -f10;
            d();
        }

        @Override // T2.m.a
        public synchronized void b(PointF pointF) {
            this.f17100g = pointF.y;
            d();
            Matrix.setRotateM(this.f17099f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f17103j, 0, this.f17097d, 0, this.f17099f, 0);
                Matrix.multiplyMM(this.f17102i, 0, this.f17098e, 0, this.f17103j, 0);
            }
            Matrix.multiplyMM(this.f17096c, 0, this.f17095b, 0, this.f17102i, 0);
            this.f17094a.d(this.f17096c, false);
        }

        @Override // T2.m.a
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return l.this.performClick();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f17095b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            l.this.e(this.f17094a.e());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void C(Surface surface);

        void E(Surface surface);
    }

    public l(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(l lVar) {
        Surface surface = lVar.f17090i;
        if (surface != null) {
            Iterator it = lVar.f17082a.iterator();
            while (it.hasNext()) {
                ((b) it.next()).C(surface);
            }
        }
        f(lVar.f17089h, surface);
        lVar.f17089h = null;
        lVar.f17090i = null;
    }

    public static /* synthetic */ void b(l lVar, SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = lVar.f17089h;
        Surface surface = lVar.f17090i;
        Surface surface2 = new Surface(surfaceTexture);
        lVar.f17089h = surfaceTexture;
        lVar.f17090i = surface2;
        Iterator it = lVar.f17082a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).E(surface2);
        }
        f(surfaceTexture2, surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final SurfaceTexture surfaceTexture) {
        this.f17086e.post(new Runnable() { // from class: T2.k
            @Override // java.lang.Runnable
            public final void run() {
                l.b(this.f17079a, surfaceTexture);
            }
        });
    }

    private static void f(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void h() {
        boolean z10 = this.f17091j && this.f17092k;
        Sensor sensor = this.f17084c;
        if (sensor == null || z10 == this.f17093l) {
            return;
        }
        if (z10) {
            this.f17083b.registerListener(this.f17085d, sensor, 0);
        } else {
            this.f17083b.unregisterListener(this.f17085d);
        }
        this.f17093l = z10;
    }

    public void d(b bVar) {
        this.f17082a.add(bVar);
    }

    public void g(b bVar) {
        this.f17082a.remove(bVar);
    }

    public T2.a getCameraMotionListener() {
        return this.f17088g;
    }

    public u getVideoFrameMetadataListener() {
        return this.f17088g;
    }

    public Surface getVideoSurface() {
        return this.f17090i;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17086e.post(new Runnable() { // from class: T2.j
            @Override // java.lang.Runnable
            public final void run() {
                l.a(this.f17078a);
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f17092k = false;
        h();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f17092k = true;
        h();
    }

    public void setDefaultStereoMode(int i10) {
        this.f17088g.f(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f17091j = z10;
        h();
    }

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17082a = new CopyOnWriteArrayList();
        this.f17086e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) AbstractC6614a.e(context.getSystemService("sensor"));
        this.f17083b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f17084c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.f17088g = iVar;
        a aVar = new a(iVar);
        m mVar = new m(context, aVar, 25.0f);
        this.f17087f = mVar;
        this.f17085d = new d(((WindowManager) AbstractC6614a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), mVar, aVar);
        this.f17091j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(mVar);
    }
}
