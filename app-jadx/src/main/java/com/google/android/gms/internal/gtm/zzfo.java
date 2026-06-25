package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import com.google.android.gms.common.util.d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfo {
    private final d zza;
    private long zzb;

    public zzfo(d dVar) {
        AbstractC2115p.l(dVar);
        this.zza = dVar;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        this.zzb = this.zza.c();
    }

    public final boolean zzc(long j10) {
        return this.zzb == 0 || this.zza.c() - this.zzb > j10;
    }
}
