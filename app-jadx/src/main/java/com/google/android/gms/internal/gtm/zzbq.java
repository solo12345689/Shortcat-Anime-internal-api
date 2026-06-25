package com.google.android.gms.internal.gtm;

import F8.n;
import R8.AbstractC2115p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        AbstractC2115p.l(zzbwVar);
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final void zzc() {
        zzW();
        Context contextZzo = zzo();
        if (!zzfi.zza(contextZzo) || !zzfn.zzh(contextZzo)) {
            zze(null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsService"));
        contextZzo.startService(intent);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        zzq().e(new zzbo(this, zzczVar));
    }

    final void zzi() {
        n.d();
        this.zza.zzl();
    }

    final void zzj() {
        n.d();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        n.d();
        zzck zzckVar = this.zza;
        n.d();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }
}
