package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            if (S8.b.k(iP) != 2) {
                S8.b.w(parcel, iP);
            } else {
                bundleA = S8.b.a(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new E(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new E[i10];
    }
}
