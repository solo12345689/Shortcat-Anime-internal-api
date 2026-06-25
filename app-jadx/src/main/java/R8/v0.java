package R8;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import f9.AbstractC4782a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends AbstractC4782a implements InterfaceC2109j {
    v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // R8.InterfaceC2109j
    public final Account j() {
        Parcel parcelC = c(2, G3());
        Account account = (Account) f9.o.b(parcelC, Account.CREATOR);
        parcelC.recycle();
        return account;
    }
}
