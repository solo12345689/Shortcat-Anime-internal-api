package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListI = null;
        String strF7 = null;
        String strF8 = null;
        long jT = 0;
        int iR = 0;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 2:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                case 4:
                    strF3 = S8.b.f(parcel, iP);
                    break;
                case 5:
                    strF4 = S8.b.f(parcel, iP);
                    break;
                case 6:
                    uri = (Uri) S8.b.e(parcel, iP, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = S8.b.f(parcel, iP);
                    break;
                case 8:
                    jT = S8.b.t(parcel, iP);
                    break;
                case 9:
                    strF6 = S8.b.f(parcel, iP);
                    break;
                case 10:
                    arrayListI = S8.b.i(parcel, iP, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = S8.b.f(parcel, iP);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    strF8 = S8.b.f(parcel, iP);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new GoogleSignInAccount(iR, strF, strF2, strF3, strF4, uri, strF5, jT, strF6, arrayListI, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
