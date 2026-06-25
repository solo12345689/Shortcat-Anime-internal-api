package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.android.vending.billing.IInAppBillingService;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3653d extends AbstractC3678i implements InterfaceC3663f {
    C3653d(IBinder iBinder) {
        super(iBinder, IInAppBillingService.DESCRIPTOR);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle A3(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(9);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        AbstractC3688k.c(parcelG3, bundle);
        Parcel parcelH3 = H3(902, parcelG3);
        Bundle bundle2 = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final int D1(int i10, String str, String str2) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(i10);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Parcel parcelH3 = H3(1, parcelG3);
        int i11 = parcelH3.readInt();
        parcelH3.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle Q1(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(9);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        AbstractC3688k.c(parcelG3, bundle);
        Parcel parcelH3 = H3(12, parcelG3);
        Bundle bundle2 = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final int R(int i10, String str, String str2) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(3);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Parcel parcelH3 = H3(5, parcelG3);
        int i11 = parcelH3.readInt();
        parcelH3.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle R0(int i10, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(i10);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        parcelG3.writeString(null);
        AbstractC3688k.c(parcelG3, bundle);
        Parcel parcelH3 = H3(8, parcelG3);
        Bundle bundle2 = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final void V0(int i10, String str, Bundle bundle, InterfaceC3648c interfaceC3648c) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(18);
        parcelG3.writeString(str);
        AbstractC3688k.c(parcelG3, bundle);
        parcelG3.writeStrongBinder(interfaceC3648c);
        I3(1301, parcelG3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final int i3(int i10, String str, String str2, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(i10);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        AbstractC3688k.c(parcelG3, bundle);
        Parcel parcelH3 = H3(10, parcelG3);
        int i11 = parcelH3.readInt();
        parcelH3.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle l1(int i10, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(i10);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        AbstractC3688k.c(parcelG3, bundle);
        Parcel parcelH3 = H3(11, parcelG3);
        Bundle bundle2 = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle l3(int i10, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(i10);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        AbstractC3688k.c(parcelG3, bundle);
        AbstractC3688k.c(parcelG3, bundle2);
        Parcel parcelH3 = H3(901, parcelG3);
        Bundle bundle3 = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle p2(int i10, String str, String str2, String str3, String str4) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(3);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        parcelG3.writeString(null);
        Parcel parcelH3 = H3(3, parcelG3);
        Bundle bundle = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final void q2(int i10, String str, Bundle bundle, InterfaceC3673h interfaceC3673h) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(12);
        parcelG3.writeString(str);
        AbstractC3688k.c(parcelG3, bundle);
        parcelG3.writeStrongBinder(interfaceC3673h);
        I3(1201, parcelG3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3663f
    public final Bundle z0(int i10, String str, String str2, String str3) {
        Parcel parcelG3 = G3();
        parcelG3.writeInt(3);
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        parcelG3.writeString(str3);
        Parcel parcelH3 = H3(4, parcelG3);
        Bundle bundle = (Bundle) AbstractC3688k.a(parcelH3, Bundle.CREATOR);
        parcelH3.recycle();
        return bundle;
    }
}
