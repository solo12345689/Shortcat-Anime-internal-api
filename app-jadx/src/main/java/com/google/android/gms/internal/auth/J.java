package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class J extends AbstractC3334a implements F0 {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle T1(Account account, String str, Bundle bundle) {
        Parcel parcelG3 = G3();
        AbstractC3361j.c(parcelG3, account);
        parcelG3.writeString(str);
        AbstractC3361j.c(parcelG3, bundle);
        Parcel parcelH3 = H3(5, parcelG3);
        Bundle bundle2 = (Bundle) AbstractC3361j.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle g1(String str, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        AbstractC3361j.c(parcelG3, bundle);
        Parcel parcelH3 = H3(2, parcelG3);
        Bundle bundle2 = (Bundle) AbstractC3361j.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle2;
    }
}
