package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfg {
    final /* synthetic */ zzfh zza;
    private final String zzb;
    private final long zzc;

    /* synthetic */ zzfg(zzfh zzfhVar, String str, long j10, zzff zzffVar) {
        this.zza = zzfhVar;
        AbstractC2115p.f("monitoring");
        AbstractC2115p.a(j10 > 0);
        this.zzb = "monitoring";
        this.zzc = j10;
    }

    private final long zzd() {
        return this.zza.zza.getLong(zzf(), 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        long jA = this.zza.zzC().a();
        SharedPreferences.Editor editorEdit = this.zza.zza.edit();
        editorEdit.remove(zze());
        editorEdit.remove(zzb());
        editorEdit.putLong(zzf(), jA);
        editorEdit.commit();
    }

    protected final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            try {
                long j10 = this.zza.zza.getLong(zze(), 0L);
                if (j10 <= 0) {
                    SharedPreferences.Editor editorEdit = this.zza.zza.edit();
                    editorEdit.putString(zzb(), str);
                    editorEdit.putLong(zze(), 1L);
                    editorEdit.apply();
                    return;
                }
                long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;
                long j11 = j10 + 1;
                long j12 = Long.MAX_VALUE / j11;
                SharedPreferences.Editor editorEdit2 = this.zza.zza.edit();
                if (leastSignificantBits < j12) {
                    editorEdit2.putString(zzb(), str);
                }
                editorEdit2.putLong(zze(), j11);
                editorEdit2.apply();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
