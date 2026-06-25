package L8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
        boolean zL = false;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                bArrB = S8.b.b(parcel, iP);
            } else if (iK == 2) {
                zL = S8.b.l(parcel, iP);
            } else if (iK != 3) {
                S8.b.w(parcel, iP);
            } else {
                strF = S8.b.f(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new f(bArrB, zL, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
