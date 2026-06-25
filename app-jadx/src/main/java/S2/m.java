package S2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import t2.AbstractC6614a;
import t2.AbstractC6635w;
import t2.RunnableC6629p;
import t2.r;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends Surface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f15769e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f15771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15772c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private RunnableC6629p f15773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Handler f15774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Error f15775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RuntimeException f15776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private m f15777e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws r.a {
            AbstractC6614a.e(this.f15773a);
            this.f15773a.h(i10);
            this.f15777e = new m(this, this.f15773a.g(), i10 != 0);
        }

        private void d() {
            AbstractC6614a.e(this.f15773a);
            this.f15773a.i();
        }

        public m a(int i10) {
            boolean z10;
            start();
            this.f15774b = new Handler(getLooper(), this);
            this.f15773a = new RunnableC6629p(this.f15774b);
            synchronized (this) {
                z10 = false;
                this.f15774b.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f15777e == null && this.f15776d == null && this.f15775c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f15776d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f15775c;
            if (error == null) {
                return (m) AbstractC6614a.e(this.f15777e);
            }
            throw error;
        }

        public void c() {
            AbstractC6614a.e(this.f15774b);
            this.f15774b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    AbstractC6635w.e("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f15775c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    AbstractC6635w.e("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f15776d = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (r.a e12) {
                    AbstractC6635w.e("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f15776d = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th2) {
                synchronized (this) {
                    notify();
                    throw th2;
                }
            }
        }
    }

    private static int a(Context context) {
        try {
            if (t2.r.m(context)) {
                return t2.r.n() ? 1 : 2;
            }
            return 0;
        } catch (r.a e10) {
            AbstractC6635w.d("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e10.getMessage());
            return 0;
        }
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f15769e) {
                f15768d = a(context);
                f15769e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15768d != 0;
    }

    public static m c(Context context, boolean z10) {
        AbstractC6614a.g(!z10 || b(context));
        return new b().a(z10 ? f15768d : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f15771b) {
            try {
                if (!this.f15772c) {
                    this.f15771b.c();
                    this.f15772c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private m(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f15771b = bVar;
        this.f15770a = z10;
    }
}
