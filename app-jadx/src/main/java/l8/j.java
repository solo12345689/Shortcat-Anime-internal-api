package L8;

import L8.e;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Bundle bundleA = null;
        ArrayList arrayListI = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                bundleA = S8.b.a(parcel, iP);
            } else if (iK != 2) {
                S8.b.w(parcel, iP);
            } else {
                arrayListI = S8.b.i(parcel, iP, e.a.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new e(bundleA, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
