package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;
import t2.AbstractC6635w;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6631s f31040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31042d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f31043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PowerManager.WakeLock f31044b;

        public a(Context context) {
            this.f31043a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f31044b == null) {
                PowerManager powerManager = (PowerManager) this.f31043a.getSystemService("power");
                if (powerManager == null) {
                    AbstractC6635w.i("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f31044b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f31044b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public j1(Context context, Looper looper, InterfaceC6623j interfaceC6623j) {
        this.f31039a = new a(context.getApplicationContext());
        this.f31040b = interfaceC6623j.e(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f31041c == z10) {
            return;
        }
        this.f31041c = z10;
        final boolean z11 = this.f31042d;
        this.f31040b.i(new Runnable() { // from class: androidx.media3.exoplayer.i1
            @Override // java.lang.Runnable
            public final void run() {
                this.f31021a.f31039a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f31042d == z10) {
            return;
        }
        this.f31042d = z10;
        if (this.f31041c) {
            this.f31040b.i(new Runnable() { // from class: androidx.media3.exoplayer.h1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30794a.f31039a.a(true, z10);
                }
            });
        }
    }
}
