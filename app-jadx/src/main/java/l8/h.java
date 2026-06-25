package L8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        boolean zL = false;
        ArrayList arrayListG = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                arrayListG = S8.b.g(parcel, iP);
            } else if (iK != 2) {
                S8.b.w(parcel, iP);
            } else {
                zL = S8.b.l(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new c(arrayListG, zL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
