package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzcp implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<zzcp> CREATOR = new zzco();
    private String zza;
    private String zzb;
    private String zzc;

    @Deprecated
    zzcp(Parcel parcel) {
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzc;
    }
}
