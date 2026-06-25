package K8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends b9.c implements v {
    public u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // b9.c
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) b9.e.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) b9.e.a(parcel, Status.CREATOR);
                b9.e.d(parcel);
                h0(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) b9.e.a(parcel, Status.CREATOR);
                b9.e.d(parcel);
                L2(status2);
                break;
            case 103:
                Status status3 = (Status) b9.e.a(parcel, Status.CREATOR);
                b9.e.d(parcel);
                U2(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
