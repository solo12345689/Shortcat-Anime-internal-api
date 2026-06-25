package R8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Bundle bundleA = null;
        C2104e c2104e = null;
        int iR = 0;
        O8.c[] cVarArr = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                bundleA = S8.b.a(parcel, iP);
            } else if (iK == 2) {
                cVarArr = (O8.c[]) S8.b.h(parcel, iP, O8.c.CREATOR);
            } else if (iK == 3) {
                iR = S8.b.r(parcel, iP);
            } else if (iK != 4) {
                S8.b.w(parcel, iP);
            } else {
                c2104e = (C2104e) S8.b.e(parcel, iP, C2104e.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new l0(bundleA, cVarArr, iR, c2104e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l0[i10];
    }
}
