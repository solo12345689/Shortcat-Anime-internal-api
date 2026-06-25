package R8;

import android.os.IBinder;
import android.os.Parcel;
import f9.AbstractC4782a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y extends AbstractC4782a implements a0 {
    Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // R8.a0
    public final boolean B1(com.google.android.gms.common.v vVar, Y8.a aVar) {
        Parcel parcelG3 = G3();
        f9.o.c(parcelG3, vVar);
        f9.o.d(parcelG3, aVar);
        Parcel parcelC = c(5, parcelG3);
        boolean zA = f9.o.a(parcelC);
        parcelC.recycle();
        return zA;
    }

    @Override // R8.a0
    public final O8.q S2(com.google.android.gms.common.t tVar) {
        Parcel parcelG3 = G3();
        f9.o.c(parcelG3, tVar);
        Parcel parcelC = c(6, parcelG3);
        O8.q qVar = (O8.q) f9.o.b(parcelC, O8.q.CREATOR);
        parcelC.recycle();
        return qVar;
    }

    @Override // R8.a0
    public final boolean o() {
        Parcel parcelC = c(7, G3());
        boolean zA = f9.o.a(parcelC);
        parcelC.recycle();
        return zA;
    }

    @Override // R8.a0
    public final O8.q o3(com.google.android.gms.common.t tVar) {
        Parcel parcelG3 = G3();
        f9.o.c(parcelG3, tVar);
        Parcel parcelC = c(8, parcelG3);
        O8.q qVar = (O8.q) f9.o.b(parcelC, O8.q.CREATOR);
        parcelC.recycle();
        return qVar;
    }
}
