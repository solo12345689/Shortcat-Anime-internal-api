package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends O implements E0 {
    C0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void L(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        parcelG3.writeString(str2);
        Q.c(parcelG3, bundle);
        parcelG3.writeLong(j10);
        H3(1, parcelG3);
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int n() {
        Parcel parcelC = c(2, G3());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }
}
