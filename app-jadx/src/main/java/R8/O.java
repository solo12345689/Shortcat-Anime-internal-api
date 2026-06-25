package R8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class O extends S8.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* JADX INFO: renamed from: a */
    final int f15215a;

    /* JADX INFO: renamed from: b */
    private final Account f15216b;

    /* JADX INFO: renamed from: c */
    private final int f15217c;

    /* JADX INFO: renamed from: d */
    private final GoogleSignInAccount f15218d;

    O(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f15215a = i10;
        this.f15216b = account;
        this.f15217c = i11;
        this.f15218d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f15215a;
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, i11);
        S8.c.p(parcel, 2, this.f15216b, i10, false);
        S8.c.j(parcel, 3, this.f15217c);
        S8.c.p(parcel, 4, this.f15218d, i10, false);
        S8.c.b(parcel, iA);
    }

    public O(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
