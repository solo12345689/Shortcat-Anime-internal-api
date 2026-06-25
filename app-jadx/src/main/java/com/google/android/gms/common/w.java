package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        boolean zL = false;
        String strF = null;
        IBinder iBinderQ = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                strF = S8.b.f(parcel, iP);
            } else if (iK == 2) {
                iBinderQ = S8.b.q(parcel, iP);
            } else if (iK == 3) {
                zL = S8.b.l(parcel, iP);
            } else if (iK != 4) {
                S8.b.w(parcel, iP);
            } else {
                zL2 = S8.b.l(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new v(strF, iBinderQ, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
