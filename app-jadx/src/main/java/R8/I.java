package R8;

import Y8.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d9.AbstractC4571a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends AbstractC4571a implements IInterface {
    I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final Y8.a K3(Y8.a aVar, T t10) {
        Parcel parcelG3 = G3();
        d9.c.d(parcelG3, aVar);
        d9.c.c(parcelG3, t10);
        Parcel parcelH3 = H3(2, parcelG3);
        Y8.a aVarE = a.AbstractBinderC0389a.e(parcelH3.readStrongBinder());
        parcelH3.recycle();
        return aVarE;
    }
}
