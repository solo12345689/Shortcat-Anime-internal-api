package l9;

import R8.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: l9.m */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5582m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        ConnectionResult connectionResult = null;
        int iR = 0;
        Q q10 = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 2) {
                connectionResult = (ConnectionResult) S8.b.e(parcel, iP, ConnectionResult.CREATOR);
            } else if (iK != 3) {
                S8.b.w(parcel, iP);
            } else {
                q10 = (Q) S8.b.e(parcel, iP, Q.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new C5581l(iR, connectionResult, q10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C5581l[i10];
    }
}
