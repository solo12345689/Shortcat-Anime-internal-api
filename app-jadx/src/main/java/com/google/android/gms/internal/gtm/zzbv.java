package com.google.android.gms.internal.gtm;

import F8.b;
import F8.n;
import R8.AbstractC2115p;
import android.content.Context;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbv {
    private static volatile zzbv zza;
    private final Context zzb;
    private final Context zzc;
    private final d zzd;
    private final zzct zze;
    private final zzfb zzf;
    private final n zzg;
    private final zzbq zzh;
    private final zzcy zzi;
    private final zzft zzj;
    private final zzfh zzk;
    private final b zzl;
    private final zzcn zzm;
    private final zzbi zzn;
    private final zzcf zzo;
    private final zzcx zzp;

    protected zzbv(zzbw zzbwVar) {
        Context contextZza = zzbwVar.zza();
        AbstractC2115p.m(contextZza, "Application context can't be null");
        Context contextZzb = zzbwVar.zzb();
        AbstractC2115p.l(contextZzb);
        this.zzb = contextZza;
        this.zzc = contextZzb;
        this.zzd = g.d();
        this.zze = new zzct(this);
        zzfb zzfbVar = new zzfb(this);
        zzfbVar.zzX();
        this.zzf = zzfbVar;
        zzfb zzfbVarZzm = zzm();
        String str = zzbt.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 134);
        sb2.append("Google Analytics ");
        sb2.append(str);
        sb2.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfbVarZzm.zzM(sb2.toString());
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzX();
        this.zzk = zzfhVar;
        zzft zzftVar = new zzft(this);
        zzftVar.zzX();
        this.zzj = zzftVar;
        zzbq zzbqVar = new zzbq(this, zzbwVar);
        zzcn zzcnVar = new zzcn(this);
        zzbi zzbiVar = new zzbi(this);
        zzcf zzcfVar = new zzcf(this);
        zzcx zzcxVar = new zzcx(this);
        n nVarA = n.a(contextZza);
        nVarA.f(new zzbu(this));
        this.zzg = nVarA;
        b bVar = new b(this);
        zzcnVar.zzX();
        this.zzm = zzcnVar;
        zzbiVar.zzX();
        this.zzn = zzbiVar;
        zzcfVar.zzX();
        this.zzo = zzcfVar;
        zzcxVar.zzX();
        this.zzp = zzcxVar;
        zzcy zzcyVar = new zzcy(this);
        zzcyVar.zzX();
        this.zzi = zzcyVar;
        zzbqVar.zzX();
        this.zzh = zzbqVar;
        bVar.d();
        this.zzl = bVar;
        zzbqVar.zzm();
    }

    public static zzbv zzg(Context context) {
        AbstractC2115p.l(context);
        if (zza == null) {
            synchronized (zzbv.class) {
                try {
                    if (zza == null) {
                        d dVarD = g.d();
                        long jC = dVarD.c();
                        zzbv zzbvVar = new zzbv(new zzbw(context));
                        zza = zzbvVar;
                        b.c();
                        long jC2 = dVarD.c() - jC;
                        Long lZzb = zzeu.zzQ.zzb();
                        if (jC2 > lZzb.longValue()) {
                            zzbvVar.zzm().zzT("Slow initialization (ms)", Long.valueOf(jC2), lZzb);
                        }
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbs zzbsVar) {
        AbstractC2115p.m(zzbsVar, "Analytics service not created/initialized");
        AbstractC2115p.b(zzbsVar.zzY(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final n zzd() {
        AbstractC2115p.l(this.zzg);
        return this.zzg;
    }

    public final zzbq zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzct zzj() {
        return this.zze;
    }

    public final zzcy zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfb zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfb zzn() {
        return this.zzf;
    }

    public final zzfh zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfh zzp() {
        zzfh zzfhVar = this.zzk;
        if (zzfhVar == null || !zzfhVar.zzY()) {
            return null;
        }
        return this.zzk;
    }

    public final zzft zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final d zzr() {
        return this.zzd;
    }
}
