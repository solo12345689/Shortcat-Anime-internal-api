package R8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Account account = null;
        int iR = 0;
        int iR2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            int iK = S8.b.k(iP);
            if (iK == 1) {
                iR = S8.b.r(parcel, iP);
            } else if (iK == 2) {
                account = (Account) S8.b.e(parcel, iP, Account.CREATOR);
            } else if (iK == 3) {
                iR2 = S8.b.r(parcel, iP);
            } else if (iK != 4) {
                S8.b.w(parcel, iP);
            } else {
                googleSignInAccount = (GoogleSignInAccount) S8.b.e(parcel, iP, GoogleSignInAccount.CREATOR);
            }
        }
        S8.b.j(parcel, iX);
        return new O(iR, account, iR2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new O[i10];
    }
}
