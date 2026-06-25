package S2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a */
    private final C2133i f15870a = new C2133i();

    /* JADX INFO: renamed from: b */
    private final b f15871b;

    /* JADX INFO: renamed from: c */
    private final c f15872c;

    /* JADX INFO: renamed from: d */
    private boolean f15873d;

    /* JADX INFO: renamed from: e */
    private Surface f15874e;

    /* JADX INFO: renamed from: f */
    private float f15875f;

    /* JADX INFO: renamed from: g */
    private float f15876g;

    /* JADX INFO: renamed from: h */
    private float f15877h;

    /* JADX INFO: renamed from: i */
    private float f15878i;

    /* JADX INFO: renamed from: j */
    private int f15879j;

    /* JADX INFO: renamed from: k */
    private long f15880k;

    /* JADX INFO: renamed from: l */
    private long f15881l;

    /* JADX INFO: renamed from: m */
    private long f15882m;

    /* JADX INFO: renamed from: n */
    private long f15883n;

    /* JADX INFO: renamed from: o */
    private long f15884o;

    /* JADX INFO: renamed from: p */
    private long f15885p;

    /* JADX INFO: renamed from: q */
    private long f15886q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                AbstractC6635w.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f */
        private static final c f15889f = new c();

        /* JADX INFO: renamed from: a */
        public volatile long f15890a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        private final Handler f15891b;

        /* JADX INFO: renamed from: c */
        private final HandlerThread f15892c;

        /* JADX INFO: renamed from: d */
        private Choreographer f15893d;

        /* JADX INFO: renamed from: e */
        private int f15894e;

        private c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f15892c = handlerThread;
            handlerThread.start();
            Handler handlerB = a0.B(handlerThread.getLooper(), this);
            this.f15891b = handlerB;
            handlerB.sendEmptyMessage(1);
        }

        private void b() {
            Choreographer choreographer = this.f15893d;
            if (choreographer != null) {
                int i10 = this.f15894e + 1;
                this.f15894e = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void c() {
            try {
                this.f15893d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                AbstractC6635w.j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        public static c d() {
            return f15889f;
        }

        private void f() {
            Choreographer choreographer = this.f15893d;
            if (choreographer != null) {
                int i10 = this.f15894e - 1;
                this.f15894e = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f15890a = -9223372036854775807L;
                }
            }
        }

        public void a() {
            this.f15891b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f15890a = j10;
            ((Choreographer) AbstractC6614a.e(this.f15893d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f15891b.sendEmptyMessage(3);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                c();
                return true;
            }
            if (i10 == 2) {
                b();
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            f();
            return true;
        }
    }

    public y(Context context) {
        b bVarF = f(context);
        this.f15871b = bVarF;
        this.f15872c = bVarF != null ? c.d() : null;
        this.f15880k = -9223372036854775807L;
        this.f15881l = -9223372036854775807L;
        this.f15875f = -1.0f;
        this.f15878i = 1.0f;
        this.f15879j = 0;
    }

    private static boolean c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    private void d() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f15874e) == null || this.f15879j == Integer.MIN_VALUE || this.f15877h == 0.0f) {
            return;
        }
        this.f15877h = 0.0f;
        a.a(surface, 0.0f);
    }

    private static long e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j12 + j14;
            j13 = j14;
            j14 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private b f(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new b(displayManager);
    }

    private void n() {
        this.f15882m = 0L;
        this.f15885p = -1L;
        this.f15883n = -1L;
    }

    public void p(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f15880k = refreshRate;
            this.f15881l = (refreshRate * 80) / 100;
        } else {
            AbstractC6635w.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f15880k = -9223372036854775807L;
            this.f15881l = -9223372036854775807L;
        }
    }

    private void q() {
        if (Build.VERSION.SDK_INT < 30 || this.f15874e == null) {
            return;
        }
        float fB = this.f15870a.e() ? this.f15870a.b() : this.f15875f;
        float f10 = this.f15876g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f15876g) < ((!this.f15870a.e() || this.f15870a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f15870a.c() < 30) {
            return;
        }
        this.f15876g = fB;
        r(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f15874e
            if (r0 == 0) goto L30
            int r1 = r3.f15879j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f15873d
            if (r1 == 0) goto L21
            float r1 = r3.f15876g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f15878i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f15877h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f15877h = r1
            S2.y.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.y.r(boolean):void");
    }

    public long b(long j10) {
        long j11;
        if (this.f15885p == -1 || !this.f15870a.e()) {
            j11 = j10;
        } else {
            long jA = this.f15886q + ((long) ((this.f15870a.a() * (this.f15882m - this.f15885p)) / this.f15878i));
            if (c(j10, jA)) {
                j11 = jA;
            } else {
                n();
                j11 = j10;
            }
        }
        this.f15883n = this.f15882m;
        this.f15884o = j11;
        c cVar = this.f15872c;
        if (cVar != null && this.f15880k != -9223372036854775807L) {
            long j12 = cVar.f15890a;
            if (j12 != -9223372036854775807L) {
                return e(j11, j12, this.f15880k) - this.f15881l;
            }
        }
        return j11;
    }

    public void g(float f10) {
        this.f15875f = f10;
        this.f15870a.g();
        q();
    }

    public void h(long j10) {
        long j11 = this.f15883n;
        if (j11 != -1) {
            this.f15885p = j11;
            this.f15886q = this.f15884o;
        }
        this.f15882m++;
        this.f15870a.f(j10 * 1000);
        q();
    }

    public void i(float f10) {
        this.f15878i = f10;
        n();
        r(false);
    }

    public void j() {
        n();
    }

    public void k() {
        this.f15873d = true;
        n();
        if (this.f15871b != null) {
            ((c) AbstractC6614a.e(this.f15872c)).a();
            this.f15871b.b();
        }
        r(false);
    }

    public void l() {
        this.f15873d = false;
        b bVar = this.f15871b;
        if (bVar != null) {
            bVar.c();
            ((c) AbstractC6614a.e(this.f15872c)).e();
        }
        d();
    }

    public void m(Surface surface) {
        if (this.f15874e == surface) {
            return;
        }
        d();
        this.f15874e = surface;
        r(true);
    }

    public void o(int i10) {
        if (this.f15879j == i10) {
            return;
        }
        this.f15879j = i10;
        r(true);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        private final DisplayManager f15887a;

        public b(DisplayManager displayManager) {
            this.f15887a = displayManager;
        }

        private Display a() {
            return this.f15887a.getDisplay(0);
        }

        public void b() {
            this.f15887a.registerDisplayListener(this, a0.C());
            y.this.p(a());
        }

        public void c() {
            this.f15887a.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                y.this.p(a());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }
}
