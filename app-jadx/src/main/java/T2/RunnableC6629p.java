package t2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import t2.r;

/* JADX INFO: renamed from: t2.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6629p implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f60610g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f60611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f60612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EGLDisplay f60613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EGLContext f60614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EGLSurface f60615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceTexture f60616f;

    /* JADX INFO: renamed from: t2.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
    }

    public RunnableC6629p(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws r.a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f60610g, 0, eGLConfigArr, 0, 1, iArr, 0);
        r.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, a0.I("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws r.a {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        r.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws r.a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            r.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        r.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private static void e(int[] iArr) throws r.a {
        GLES20.glGenTextures(1, iArr, 0);
        r.b();
    }

    private static EGLDisplay f() throws r.a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        r.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        r.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) AbstractC6614a.e(this.f60616f);
    }

    public void h(int i10) throws r.a {
        EGLDisplay eGLDisplayF = f();
        this.f60613c = eGLDisplayF;
        EGLConfig eGLConfigA = a(eGLDisplayF);
        EGLContext eGLContextB = b(this.f60613c, eGLConfigA, i10);
        this.f60614d = eGLContextB;
        this.f60615e = c(this.f60613c, eGLConfigA, eGLContextB, i10);
        e(this.f60612b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f60612b[0]);
        this.f60616f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f60611a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f60616f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f60612b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f60613c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f60613c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f60615e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f60613c, this.f60615e);
            }
            EGLContext eGLContext = this.f60614d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f60613c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f60613c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f60613c);
            }
            this.f60613c = null;
            this.f60614d = null;
            this.f60615e = null;
            this.f60616f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f60611a.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f60616f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public RunnableC6629p(Handler handler, a aVar) {
        this.f60611a = handler;
        this.f60612b = new int[1];
    }

    private void d() {
    }
}
