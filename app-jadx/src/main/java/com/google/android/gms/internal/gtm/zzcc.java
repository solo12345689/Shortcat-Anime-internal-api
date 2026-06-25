package com.google.android.gms.internal.gtm;

import F8.n;
import R8.AbstractC2115p;
import V8.a;
import android.content.ComponentName;
import android.os.RemoteException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcc extends zzbs {
    private final zzcb zza;
    private final zzcw zzb;
    private final zzfo zzc;
    private zzey zzd;

    protected zzcc(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzfo(zzbvVar.zzr());
        this.zza = new zzcb(this);
        this.zzb = new zzby(this, zzbvVar);
    }

    static /* bridge */ /* synthetic */ void zzb(zzcc zzccVar, ComponentName componentName) {
        n.d();
        if (zzccVar.zzd != null) {
            zzccVar.zzd = null;
            zzccVar.zzP("Disconnected from device AnalyticsService", componentName);
            zzccVar.zzs().zzk();
        }
    }

    static /* bridge */ /* synthetic */ void zzi(zzcc zzccVar, zzey zzeyVar) {
        n.d();
        zzccVar.zzd = zzeyVar;
        zzccVar.zzj();
        zzccVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzcw zzcwVar = this.zzb;
        zzw();
        zzcwVar.zzg(zzeu.zzK.zzb().longValue());
    }

    public final void zzc() {
        n.d();
        zzW();
        try {
            a.b().c(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    public final boolean zzf() {
        n.d();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        zzey zzeyVarZza = this.zza.zza();
        if (zzeyVarZza == null) {
            return false;
        }
        this.zzd = zzeyVarZza;
        zzj();
        return true;
    }

    public final boolean zzg() {
        n.d();
        zzW();
        return this.zzd != null;
    }

    public final boolean zzh(zzex zzexVar) {
        String strZzk;
        AbstractC2115p.l(zzexVar);
        n.d();
        zzW();
        zzey zzeyVar = this.zzd;
        if (zzeyVar == null) {
            return false;
        }
        if (zzexVar.zzh()) {
            zzw();
            strZzk = zzct.zzi();
        } else {
            zzw();
            strZzk = zzct.zzk();
        }
        try {
            zzeyVar.zzf(zzexVar.zzg(), zzexVar.zzd(), strZzk, Collections.EMPTY_LIST);
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzO("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }
}
