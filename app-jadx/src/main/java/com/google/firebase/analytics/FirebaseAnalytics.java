package com.google.firebase.analytics;

import R8.AbstractC2115p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3632z1;
import com.google.android.gms.internal.measurement.J0;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import j9.E;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n9.i;
import n9.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile FirebaseAnalytics f43191c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3632z1 f43192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f43193b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        GRANTED,
        DENIED
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public FirebaseAnalytics(C3632z1 c3632z1) {
        AbstractC2115p.l(c3632z1);
        this.f43192a = c3632z1;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f43191c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f43191c == null) {
                        f43191c = new FirebaseAnalytics(C3632z1.s(context, null));
                    }
                } finally {
                }
            }
        }
        return f43191c;
    }

    public static E getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C3632z1 c3632z1S = C3632z1.s(context, bundle);
        if (c3632z1S == null) {
            return null;
        }
        return new d(c3632z1S);
    }

    private final ExecutorService l() throws Throwable {
        FirebaseAnalytics firebaseAnalytics;
        synchronized (FirebaseAnalytics.class) {
            try {
                try {
                    if (this.f43193b == null) {
                        firebaseAnalytics = this;
                        firebaseAnalytics.f43193b = new com.google.firebase.analytics.a(firebaseAnalytics, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    } else {
                        firebaseAnalytics = this;
                    }
                    return firebaseAnalytics.f43193b;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public i a() {
        try {
            return l.d(l(), new com.google.firebase.analytics.b(this));
        } catch (RuntimeException e10) {
            this.f43192a.d(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return l.e(e10);
        }
    }

    public i b() {
        try {
            return l.d(l(), new c(this));
        } catch (RuntimeException e10) {
            this.f43192a.d(5, "Failed to schedule task for getSessionId", null, null, null);
            return l.e(e10);
        }
    }

    public void c(String str, Bundle bundle) {
        this.f43192a.v(str, bundle);
    }

    public void d() {
        this.f43192a.F();
    }

    public void e(boolean z10) {
        this.f43192a.D(Boolean.valueOf(z10));
    }

    public void f(Map map) {
        Bundle bundle = new Bundle();
        a aVar = (a) map.get(b.AD_STORAGE);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        a aVar2 = (a) map.get(b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        a aVar3 = (a) map.get(b.AD_USER_DATA);
        if (aVar3 != null) {
            int iOrdinal3 = aVar3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        a aVar4 = (a) map.get(b.AD_PERSONALIZATION);
        if (aVar4 != null) {
            int iOrdinal4 = aVar4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.f43192a.E(bundle);
    }

    public void g(Bundle bundle) {
        if (bundle != null) {
            bundle = new Bundle(bundle);
        }
        this.f43192a.i(bundle);
    }

    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(com.google.firebase.installations.c.p().getId(), HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(long j10) {
        this.f43192a.G(j10);
    }

    public void i(String str) {
        this.f43192a.B(str);
    }

    public void j(String str, String str2) {
        this.f43192a.x(null, str, str2, false);
    }

    final /* synthetic */ C3632z1 k() {
        return this.f43192a;
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f43192a.C(J0.c(activity), str, str2);
    }
}
