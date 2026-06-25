package com.google.android.gms.internal.gtm;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzet<V> {
    private final zzes<V> zza;
    private final V zzb;
    private final V zzc;
    private final Object zzd = new Object();

    private zzet(V v10, V v11, zzes<V> zzesVar) {
        this.zzb = v10;
        this.zzc = v11;
        this.zza = zzesVar;
    }

    static <T> zzet<T> zza(T t10, T t11, zzes<T> zzesVar) {
        return new zzet<>(t10, t11, zzesVar);
    }

    public final V zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
