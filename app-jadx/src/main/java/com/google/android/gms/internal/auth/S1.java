package com.google.android.gms.internal.auth;

import Q8.InterfaceC2058f;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class S1 extends AbstractC3334a implements IInterface {
    S1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void J3(InterfaceC2058f interfaceC2058f, C3352g c3352g) {
        Parcel parcelG3 = G3();
        AbstractC3361j.d(parcelG3, interfaceC2058f);
        AbstractC3361j.c(parcelG3, c3352g);
        I3(2, parcelG3);
    }

    public final void K3(R1 r12, Account account, String str, Bundle bundle) {
        Parcel parcelG3 = G3();
        AbstractC3361j.d(parcelG3, r12);
        AbstractC3361j.c(parcelG3, account);
        parcelG3.writeString(str);
        AbstractC3361j.c(parcelG3, bundle);
        I3(1, parcelG3);
    }
}
