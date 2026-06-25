package com.google.android.gms.dynamite;

import Y8.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f9.AbstractC4782a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends AbstractC4782a implements IInterface {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final Y8.a H3(Y8.a aVar, String str, int i10, Y8.a aVar2) {
        Parcel parcelG3 = G3();
        f9.o.d(parcelG3, aVar);
        parcelG3.writeString(str);
        parcelG3.writeInt(i10);
        f9.o.d(parcelG3, aVar2);
        Parcel parcelC = c(2, parcelG3);
        Y8.a aVarE = a.AbstractBinderC0389a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarE;
    }

    public final Y8.a I3(Y8.a aVar, String str, int i10, Y8.a aVar2) {
        Parcel parcelG3 = G3();
        f9.o.d(parcelG3, aVar);
        parcelG3.writeString(str);
        parcelG3.writeInt(i10);
        f9.o.d(parcelG3, aVar2);
        Parcel parcelC = c(3, parcelG3);
        Y8.a aVarE = a.AbstractBinderC0389a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarE;
    }
}
