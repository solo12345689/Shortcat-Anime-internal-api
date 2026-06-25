package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        boolean zL5 = false;
        String strF = null;
        IBinder iBinderQ = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 2:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 3:
                    zL2 = S8.b.l(parcel, iP);
                    break;
                case 4:
                    iBinderQ = S8.b.q(parcel, iP);
                    break;
                case 5:
                    zL3 = S8.b.l(parcel, iP);
                    break;
                case 6:
                    zL4 = S8.b.l(parcel, iP);
                    break;
                case 7:
                default:
                    S8.b.w(parcel, iP);
                    break;
                case 8:
                    zL5 = S8.b.l(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new t(strF, zL, zL2, iBinderQ, zL3, zL4, zL5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
