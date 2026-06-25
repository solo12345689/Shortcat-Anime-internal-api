package R8;

import Y8.a;
import android.os.IBinder;
import android.os.Parcel;
import f9.AbstractC4782a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends AbstractC4782a implements y0 {
    w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // R8.y0
    public final Y8.a l() {
        Parcel parcelC = c(1, G3());
        Y8.a aVarE = a.AbstractBinderC0389a.e(parcelC.readStrongBinder());
        parcelC.recycle();
        return aVarE;
    }

    @Override // R8.y0
    public final int m() {
        Parcel parcelC = c(2, G3());
        int i10 = parcelC.readInt();
        parcelC.recycle();
        return i10;
    }
}
