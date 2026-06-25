package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class H implements Parcelable.Creator {
    static void a(G g10, Parcel parcel, int i10) {
        String str = g10.f40764a;
        int iA = S8.c.a(parcel);
        S8.c.q(parcel, 2, str, false);
        S8.c.p(parcel, 3, g10.f40765b, i10, false);
        S8.c.q(parcel, 4, g10.f40766c, false);
        S8.c.n(parcel, 5, g10.f40767d);
        S8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        long jT = 0;
        String strF = null;
        E e10 = null;
        String strF2 = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 2) {
                strF = S8.b.f(parcel, iP);
            } else if (iK == 3) {
                e10 = (E) S8.b.e(parcel, iP, E.CREATOR);
            } else if (iK == 4) {
                strF2 = S8.b.f(parcel, iP);
            } else if (iK != 5) {
                S8.b.w(parcel, iP);
            } else {
                jT = S8.b.t(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new G(strF, e10, strF2, jT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new G[i10];
    }
}
