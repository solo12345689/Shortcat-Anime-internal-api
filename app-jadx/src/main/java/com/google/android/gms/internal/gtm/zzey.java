package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzey extends zzas implements IInterface {
    zzey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
    }

    public final void zzf(Map map, long j10, String str, List<zzcp> list) {
        Parcel parcelZza = zza();
        parcelZza.writeMap(map);
        parcelZza.writeLong(j10);
        parcelZza.writeString(str);
        parcelZza.writeTypedList(list);
        zzl(1, parcelZza);
    }
}
