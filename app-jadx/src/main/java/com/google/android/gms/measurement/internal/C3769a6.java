package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a6 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3769a6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        ArrayList arrayListI = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            if (S8.b.k(iP) != 1) {
                S8.b.w(parcel, iP);
            } else {
                arrayListI = S8.b.i(parcel, iP, X5.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new Z5(arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Z5[i10];
    }
}
