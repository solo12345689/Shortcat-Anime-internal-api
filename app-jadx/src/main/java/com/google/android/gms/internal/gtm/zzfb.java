package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? String.valueOf(obj) : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l10 = (Long) obj;
        if (Math.abs(l10.longValue()) < 100) {
            return String.valueOf(obj);
        }
        String str = String.valueOf(obj).charAt(0) != '-' ? "" : "-";
        String strValueOf = String.valueOf(Math.abs(l10.longValue()));
        return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
    }

    public final void zzb(zzex zzexVar, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzexVar != null ? zzexVar.toString() : "no hit data");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i10, String str, Object obj, Object obj2, Object obj3) {
        char c10;
        try {
            AbstractC2115p.l(str);
            if (zzw().zzb()) {
                zzw();
                c10 = 'C';
            } else {
                zzw();
                c10 = 'c';
            }
            char cCharAt = "01VDIWEA?".charAt(i10);
            String str2 = zzbt.zza;
            String strZzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(strZzD).length());
            sb2.append("3");
            sb2.append(cCharAt);
            sb2.append(c10);
            sb2.append(str2);
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(strZzD);
            String string = sb2.toString();
            if (string.length() > 1024) {
                string = string.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            }
            zzfh zzfhVarZzp = zzt().zzp();
            if (zzfhVarZzp != null) {
                zzfhVarZzp.zze().zzc(string);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
