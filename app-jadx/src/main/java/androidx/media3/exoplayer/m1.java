package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import t2.AbstractC6635w;
import t2.InterfaceC6623j;
import t2.InterfaceC6631s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6631s f31076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31078d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f31079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WifiManager.WifiLock f31080b;

        public a(Context context) {
            this.f31079a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f31080b == null) {
                WifiManager wifiManager = (WifiManager) this.f31079a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    AbstractC6635w.i("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f31080b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f31080b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public m1(Context context, Looper looper, InterfaceC6623j interfaceC6623j) {
        this.f31075a = new a(context.getApplicationContext());
        this.f31076b = interfaceC6623j.e(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f31077c == z10) {
            return;
        }
        this.f31077c = z10;
        final boolean z11 = this.f31078d;
        this.f31076b.i(new Runnable() { // from class: androidx.media3.exoplayer.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f31054a.f31075a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f31078d == z10) {
            return;
        }
        this.f31078d = z10;
        if (this.f31077c) {
            this.f31076b.i(new Runnable() { // from class: androidx.media3.exoplayer.l1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31071a.f31075a.a(true, z10);
                }
            });
        }
    }
}
