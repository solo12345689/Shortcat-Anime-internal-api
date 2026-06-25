package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class zzco implements Parcelable.Creator<zzcp> {
    zzco() {
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* bridge */ /* synthetic */ zzcp createFromParcel(Parcel parcel) {
        return new zzcp(parcel);
    }

    @Override // android.os.Parcelable.Creator
    @Deprecated
    public final /* bridge */ /* synthetic */ zzcp[] newArray(int i10) {
        return new zzcp[i10];
    }
}
