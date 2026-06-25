package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzfd {
    final /* synthetic */ zzfe zza;
    private int zzb;
    private final ByteArrayOutputStream zzc = new ByteArrayOutputStream();

    public zzfd(zzfe zzfeVar) {
        this.zza = zzfeVar;
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzex zzexVar) {
        AbstractC2115p.l(zzexVar);
        int i10 = this.zzb;
        this.zza.zzw();
        if (i10 + 1 > zzct.zzg()) {
            return false;
        }
        String strZza = this.zza.zza(zzexVar, false);
        if (strZza == null) {
            this.zza.zzz().zzb(zzexVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = strZza.getBytes();
        int length = bytes.length;
        this.zza.zzw();
        if (length > zzct.zzf()) {
            this.zza.zzz().zzb(zzexVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.zzc.size() > 0) {
            length++;
        }
        int size = this.zzc.size();
        this.zza.zzw();
        if (size + length > zzeu.zzA.zzb().intValue()) {
            return false;
        }
        try {
            if (this.zzc.size() > 0) {
                this.zzc.write(zzfe.zza);
            }
            this.zzc.write(bytes);
            this.zzb++;
            return true;
        } catch (IOException e10) {
            this.zza.zzK("Failed to write payload when batching hits", e10);
            return true;
        }
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}
