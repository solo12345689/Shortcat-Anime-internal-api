package com.google.android.gms.internal.gtm;

import F8.c;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class zzfa {
    private static volatile c zza = new zzcu();

    public static void zzb(String str, Object obj) {
        String string;
        zzfb zzfbVarZza = zzfb.zza();
        if (zzfbVarZza != null) {
            zzfbVarZza.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str2 = (String) obj;
                StringBuilder sb2 = new StringBuilder(str.length() + 1 + str2.length());
                sb2.append(str);
                sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
                sb2.append(str2);
                string = sb2.toString();
            } else {
                string = str;
            }
            Log.e(zzeu.zzc.zzb(), string);
        }
        c cVar = zza;
        if (cVar != null) {
            cVar.error(str);
        }
    }

    public static boolean zzf(int i10) {
        return zza != null && zza.getLogLevel() <= i10;
    }
}
