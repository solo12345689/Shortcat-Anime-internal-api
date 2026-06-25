package F8;

import R8.AbstractC2115p;
import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzfs;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(Context context) {
        AbstractC2115p.l(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zZzi = zzfs.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zZzi);
        return zZzi;
    }
}
