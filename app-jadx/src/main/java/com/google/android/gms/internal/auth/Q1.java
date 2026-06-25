package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q1 extends AbstractBinderC3340c implements R1 {
    public Q1() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.AbstractBinderC3340c
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) AbstractC3361j.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) AbstractC3361j.a(parcel, Bundle.CREATOR);
        AbstractC3361j.b(parcel);
        r1(status, bundle);
        return true;
    }
}
