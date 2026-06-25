package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        ArrayList arrayListI = null;
        Account account = null;
        String strF = null;
        String strF2 = null;
        ArrayList arrayListI2 = null;
        String strF3 = null;
        int iR = 0;
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 2:
                    arrayListI = S8.b.i(parcel, iP, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) S8.b.e(parcel, iP, Account.CREATOR);
                    break;
                case 4:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 5:
                    zL2 = S8.b.l(parcel, iP);
                    break;
                case 6:
                    zL3 = S8.b.l(parcel, iP);
                    break;
                case 7:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 8:
                    strF2 = S8.b.f(parcel, iP);
                    break;
                case 9:
                    arrayListI2 = S8.b.i(parcel, iP, K8.a.CREATOR);
                    break;
                case 10:
                    strF3 = S8.b.f(parcel, iP);
                    break;
                default:
                    S8.b.w(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new GoogleSignInOptions(iR, arrayListI, account, zL, zL2, zL3, strF, strF2, arrayListI2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
