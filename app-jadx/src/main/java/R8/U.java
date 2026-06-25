package R8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Scope[] scopeArr = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 2) {
                iR2 = S8.b.r(parcel, iP);
            } else if (iK == 3) {
                iR3 = S8.b.r(parcel, iP);
            } else if (iK != 4) {
                S8.b.w(parcel, iP);
            } else {
                scopeArr = (Scope[]) S8.b.h(parcel, iP, Scope.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new T(iR, iR2, iR3, scopeArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new T[i10];
    }
}
