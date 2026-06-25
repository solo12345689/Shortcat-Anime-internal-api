package com.google.android.gms.internal.gtm;

import R8.AbstractC2115p;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.util.o;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzct {
    private final zzbv zza;
    private volatile Boolean zzb;
    private String zzc;
    private Set<Integer> zzd;

    protected zzct(zzbv zzbvVar) {
        AbstractC2115p.l(zzbvVar);
        this.zza = zzbvVar;
    }

    public static final long zzd() {
        return zzeu.zzm.zzb().longValue();
    }

    public static final long zze() {
        return zzeu.zzj.zzb().longValue();
    }

    public static final int zzf() {
        return zzeu.zzy.zzb().intValue();
    }

    public static final int zzg() {
        return zzeu.zzp.zzb().intValue();
    }

    public static final int zzh() {
        return zzeu.zzo.zzb().intValue();
    }

    public static final String zzi() {
        return zzeu.zzr.zzb();
    }

    public static final String zzj() {
        return zzeu.zzs.zzb();
    }

    public static final String zzk() {
        return zzeu.zzq.zzb();
    }

    public static final boolean zzl() {
        return zzeu.zzb.zzb().booleanValue();
    }

    public final Set<Integer> zza() {
        String str;
        String strZzb = zzeu.zzB.zzb();
        if (this.zzd == null || (str = this.zzc) == null || !str.equals(strZzb)) {
            String[] strArrSplit = TextUtils.split(strZzb, f.f34694a);
            HashSet hashSet = new HashSet();
            for (String str2 : strArrSplit) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str2)));
                } catch (NumberFormatException unused) {
                }
            }
            this.zzc = strZzb;
            this.zzd = hashSet;
        }
        return this.zzd;
    }

    public final boolean zzb() {
        if (this.zzb == null) {
            synchronized (this) {
                try {
                    if (this.zzb == null) {
                        ApplicationInfo applicationInfo = this.zza.zza().getApplicationInfo();
                        String strA = o.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z10 = false;
                            if (str != null && str.equals(strA)) {
                                z10 = true;
                            }
                            this.zzb = Boolean.valueOf(z10);
                        }
                        if ((this.zzb == null || !this.zzb.booleanValue()) && "com.google.android.gms.analytics".equals(strA)) {
                            this.zzb = Boolean.TRUE;
                        }
                        if (this.zzb == null) {
                            this.zzb = Boolean.TRUE;
                            this.zza.zzm().zzJ("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzb.booleanValue();
    }
}
