package R8;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements Parcelable.Creator {
    static void a(C2105f c2105f, Parcel parcel, int i10) {
        int iA = S8.c.a(parcel);
        S8.c.j(parcel, 1, c2105f.f15294a);
        S8.c.j(parcel, 2, c2105f.f15295b);
        S8.c.j(parcel, 3, c2105f.f15296c);
        S8.c.q(parcel, 4, c2105f.f15297d, false);
        S8.c.i(parcel, 5, c2105f.f15298e, false);
        S8.c.s(parcel, 6, c2105f.f15299f, i10, false);
        S8.c.e(parcel, 7, c2105f.f15300g, false);
        S8.c.p(parcel, 8, c2105f.f15301h, i10, false);
        S8.c.s(parcel, 10, c2105f.f15302i, i10, false);
        S8.c.s(parcel, 11, c2105f.f15303j, i10, false);
        S8.c.c(parcel, 12, c2105f.f15304k);
        S8.c.j(parcel, 13, c2105f.f15305l);
        S8.c.c(parcel, 14, c2105f.f15306m);
        S8.c.q(parcel, 15, c2105f.c(), false);
        S8.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iX = S8.b.x(parcel);
        Scope[] scopeArr = C2105f.f15292o;
        Bundle bundle = new Bundle();
        O8.c[] cVarArr = C2105f.f15293p;
        O8.c[] cVarArr2 = cVarArr;
        String strF = null;
        IBinder iBinderQ = null;
        Account account = null;
        String strF2 = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        boolean zL = false;
        int iR4 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iX) {
            int iP = S8.b.p(parcel);
            switch (S8.b.k(iP)) {
                case 1:
                    iR = S8.b.r(parcel, iP);
                    break;
                case 2:
                    iR2 = S8.b.r(parcel, iP);
                    break;
                case 3:
                    iR3 = S8.b.r(parcel, iP);
                    break;
                case 4:
                    strF = S8.b.f(parcel, iP);
                    break;
                case 5:
                    iBinderQ = S8.b.q(parcel, iP);
                    break;
                case 6:
                    scopeArr = (Scope[]) S8.b.h(parcel, iP, Scope.CREATOR);
                    break;
                case 7:
                    bundle = S8.b.a(parcel, iP);
                    break;
                case 8:
                    account = (Account) S8.b.e(parcel, iP, Account.CREATOR);
                    break;
                case 9:
                default:
                    S8.b.w(parcel, iP);
                    break;
                case 10:
                    cVarArr = (O8.c[]) S8.b.h(parcel, iP, O8.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (O8.c[]) S8.b.h(parcel, iP, O8.c.CREATOR);
                    break;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    zL = S8.b.l(parcel, iP);
                    break;
                case 13:
                    iR4 = S8.b.r(parcel, iP);
                    break;
                case 14:
                    zL2 = S8.b.l(parcel, iP);
                    break;
                case 15:
                    strF2 = S8.b.f(parcel, iP);
                    break;
            }
        }
        S8.b.j(parcel, iX);
        return new C2105f(iR, iR2, iR3, strF, iBinderQ, scopeArr, bundle, account, cVarArr, cVarArr2, zL, iR4, zL2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new C2105f[i10];
    }
}
