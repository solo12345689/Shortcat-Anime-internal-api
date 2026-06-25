package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3708o extends AbstractBinderC3683j implements InterfaceC3713p {
    public AbstractBinderC3708o() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC3683j
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int i12 = parcel.readInt();
        AbstractC3688k.b(parcel);
        a(i12);
        return true;
    }
}
