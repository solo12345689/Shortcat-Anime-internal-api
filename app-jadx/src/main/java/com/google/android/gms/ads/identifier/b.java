package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class b extends Thread {

    /* JADX INFO: renamed from: a */
    private final WeakReference f38836a;

    /* JADX INFO: renamed from: b */
    private final long f38837b;

    /* JADX INFO: renamed from: c */
    final CountDownLatch f38838c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    boolean f38839d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j10) {
        this.f38836a = new WeakReference(advertisingIdClient);
        this.f38837b = j10;
        start();
    }

    private final void a() {
        AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f38836a.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.b();
            this.f38839d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f38838c.await(this.f38837b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
