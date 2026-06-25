package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbw {
    private final Context zza;
    private final Context zzb;

    public zzbw(Context context) {
        AbstractC2115p.l(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC2115p.m(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
