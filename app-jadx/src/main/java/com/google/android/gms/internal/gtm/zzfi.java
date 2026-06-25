package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import m9.C5649a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfi {
    static final Object zza = new Object();
    static C5649a zzb;
    static Boolean zzc;

    public static boolean zza(Context context) {
        AbstractC2115p.l(context);
        Boolean bool = zzc;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zZzi = zzfs.zzi(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        zzc = Boolean.valueOf(zZzi);
        return zZzi;
    }

    public static final void zzb(Context context, Intent intent) {
        zzbv zzbvVarZzg = zzbv.zzg(context);
        zzfb zzfbVarZzm = zzbvVarZzg.zzm();
        if (intent == null) {
            zzfbVarZzm.zzR("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzbvVarZzg.zzj();
        zzfbVarZzm.zzP("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zZzh = zzfn.zzh(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (zza) {
                context.startService(intent2);
                if (zZzh) {
                    try {
                        if (zzb == null) {
                            C5649a c5649a = new C5649a(context, 1, "Analytics WakeLock");
                            zzb = c5649a;
                            c5649a.d(false);
                        }
                        zzb.a(1000L);
                    } catch (SecurityException unused) {
                        zzfbVarZzm.zzR("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
