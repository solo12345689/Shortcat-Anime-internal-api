package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import app.notifee.core.event.LogEvent;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzft extends zzbs {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzft(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public final boolean zzc() {
        zzW();
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        ApplicationInfo applicationInfo;
        int i10;
        Context contextZzo = zzo();
        try {
            applicationInfo = contextZzo.getPackageManager().getApplicationInfo(contextZzo.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e10) {
            zzS("PackageManager doesn't know about the app package", e10);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzR("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i10 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        zzbv zzbvVarZzt = zzt();
        zzew zzewVar = (zzew) new zzcs(zzbvVarZzt, new zzev(zzbvVarZzt)).zza(i10);
        if (zzewVar != null) {
            zzO("Loading global XML config values");
            String str = zzewVar.zza;
            if (str != null) {
                this.zzb = str;
                zzG("XML config - app name", str);
            }
            String str2 = zzewVar.zzb;
            if (str2 != null) {
                this.zza = str2;
                zzG("XML config - app version", str2);
            }
            String str3 = zzewVar.zzc;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                int i11 = LogEvent.LEVEL_VERBOSE.equals(lowerCase) ? 0 : LogEvent.LEVEL_INFO.equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : LogEvent.LEVEL_ERROR.equals(lowerCase) ? 3 : -1;
                if (i11 >= 0) {
                    zzP("XML config - log level", Integer.valueOf(i11));
                }
            }
            int i12 = zzewVar.zzd;
            if (i12 >= 0) {
                this.zzd = i12;
                this.zzc = true;
                zzG("XML config - dispatch period (sec)", Integer.valueOf(i12));
            }
            int i13 = zzewVar.zze;
            if (i13 != -1) {
                boolean z10 = 1 == i13;
                this.zzf = z10;
                this.zze = true;
                zzG("XML config - dry run", Boolean.valueOf(z10));
            }
        }
    }

    public final boolean zze() {
        zzW();
        return this.zze;
    }

    public final boolean zzf() {
        zzW();
        return false;
    }
}
