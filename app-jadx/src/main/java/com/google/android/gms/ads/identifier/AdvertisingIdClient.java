package com.google.android.gms.ads.identifier;

import O8.g;
import R8.AbstractC2115p;
import a9.e;
import a9.f;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdvertisingIdClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    O8.a f38826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    f f38827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f38828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f38829d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    b f38830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f38831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f38832g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Info {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f38834b;

        public Info(String str, boolean z10) {
            this.f38833a = str;
            this.f38834b = z10;
        }

        public String getId() {
            return this.f38833a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f38834b;
        }

        public String toString() {
            String str = this.f38833a;
            boolean z10 = this.f38834b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        AbstractC2115p.l(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f38831f = context;
        this.f38828c = false;
        this.f38832g = j10;
    }

    private final Info e(int i10) {
        Info info;
        AbstractC2115p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f38828c) {
                    synchronized (this.f38829d) {
                        b bVar = this.f38830e;
                        if (bVar == null || !bVar.f38839d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c(false);
                        if (!this.f38828c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                AbstractC2115p.l(this.f38826a);
                AbstractC2115p.l(this.f38827b);
                try {
                    info = new Info(this.f38827b.k(), this.f38827b.d0(true));
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f();
        return info;
    }

    private final void f() {
        synchronized (this.f38829d) {
            b bVar = this.f38830e;
            if (bVar != null) {
                bVar.f38838c.countDown();
                try {
                    this.f38830e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f38832g;
            if (j10 > 0) {
                this.f38830e = new b(this, j10);
            }
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.c(false);
            Info infoE = advertisingIdClient.e(-1);
            advertisingIdClient.d(infoE, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return infoE;
        } finally {
        }
    }

    public final void b() {
        AbstractC2115p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f38831f == null || this.f38826a == null) {
                    return;
                }
                try {
                    if (this.f38828c) {
                        V8.a.b().c(this.f38831f, this.f38826a);
                    }
                } catch (Throwable th2) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th2);
                }
                this.f38828c = false;
                this.f38827b = null;
                this.f38826a = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    protected final void c(boolean z10) {
        AbstractC2115p.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f38828c) {
                    b();
                }
                Context context = this.f38831f;
                try {
                    context.getPackageManager().getPackageInfo(BillingConstants.VENDING_PACKAGE, 0);
                    int iH = com.google.android.gms.common.b.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    O8.a aVar = new O8.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!V8.a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f38826a = aVar;
                        try {
                            this.f38827b = e.c(aVar.b(10000L, TimeUnit.MILLISECONDS));
                            this.f38828c = true;
                            if (z10) {
                                f();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    final boolean d(Info info, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (info != null) {
            map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id2 = info.getId();
            if (id2 != null) {
                map.put("ad_id_size", Integer.toString(id2.length()));
            }
        }
        if (th2 != null) {
            map.put(LogEvent.LEVEL_ERROR, th2.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j10));
        new a(this, map).start();
        return true;
    }

    protected final void finalize() throws Throwable {
        b();
        super.finalize();
    }

    public static void a(boolean z10) {
    }
}
