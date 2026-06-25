package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbt {
    public static final String zza;
    public static final String zzb;

    static {
        String strReplaceAll = String.valueOf(b.f38946a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = strReplaceAll;
        String strValueOf = String.valueOf(strReplaceAll);
        zzb = strValueOf.length() != 0 ? "ma".concat(strValueOf) : new String("ma");
    }
}
