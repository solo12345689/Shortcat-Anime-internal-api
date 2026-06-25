package com.google.android.gms.internal.gtm;

import F8.n;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfh extends zzbs {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfg zzd;

    protected zzfh(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfg(this, "monitoring", zzeu.zzP.zzb().longValue(), null);
    }

    public final long zza() {
        n.d();
        zzW();
        long j10 = this.zzb;
        if (j10 != 0) {
            return j10;
        }
        long j11 = this.zza.getLong("first_run", 0L);
        if (j11 != 0) {
            this.zzb = j11;
            return j11;
        }
        long jA = zzC().a();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("first_run", jA);
        if (!editorEdit.commit()) {
            zzR("Failed to commit first run time");
        }
        this.zzb = jA;
        return jA;
    }

    public final long zzb() {
        n.d();
        zzW();
        long j10 = this.zzc;
        if (j10 != -1) {
            return j10;
        }
        long j11 = this.zza.getLong("last_dispatch", 0L);
        this.zzc = j11;
        return j11;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final void zzi() {
        n.d();
        zzW();
        long jA = zzC().a();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("last_dispatch", jA);
        editorEdit.apply();
        this.zzc = jA;
    }
}
