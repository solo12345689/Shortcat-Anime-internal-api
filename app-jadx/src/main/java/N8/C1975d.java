package N8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1975d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            if (S8.b.k(iP) != 1) {
                S8.b.w(parcel, iP);
            } else {
                intent = (Intent) S8.b.e(parcel, iP, Intent.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new C1972a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C1972a[i10];
    }
}
