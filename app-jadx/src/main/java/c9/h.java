package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends AbstractC3084a implements IInterface {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    public final void I3(j jVar, L8.c cVar) {
        Parcel parcelG3 = G3();
        e.c(parcelG3, jVar);
        e.b(parcelG3, cVar);
        H3(13, parcelG3);
    }

    public final void J3(l lVar, L8.d dVar) {
        Parcel parcelG3 = G3();
        e.c(parcelG3, lVar);
        e.b(parcelG3, dVar);
        H3(12, parcelG3);
    }

    public final void K3(n nVar, L8.f fVar) {
        Parcel parcelG3 = G3();
        e.c(parcelG3, nVar);
        e.b(parcelG3, fVar);
        H3(10, parcelG3);
    }
}
