package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strF2 = "";
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 4) {
                strF = S8.b.f(parcel, iP);
            } else if (iK == 7) {
                googleSignInAccount = (GoogleSignInAccount) S8.b.e(parcel, iP, GoogleSignInAccount.CREATOR);
            } else if (iK != 8) {
                S8.b.w(parcel, iP);
            } else {
                strF2 = S8.b.f(parcel, iP);
            }
        }
        S8.b.j(parcel, iX);
        return new SignInAccount(strF, googleSignInAccount, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
