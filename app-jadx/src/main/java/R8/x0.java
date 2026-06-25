package R8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 extends f9.n implements y0 {
    public x0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static y0 e(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof y0 ? (y0) iInterfaceQueryLocalInterface : new w0(iBinder);
    }

    @Override // f9.n
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Y8.a aVarL = l();
            parcel2.writeNoException();
            f9.o.d(parcel2, aVarL);
        } else {
            if (i10 != 2) {
                return false;
            }
            int iM = m();
            parcel2.writeNoException();
            parcel2.writeInt(iM);
        }
        return true;
    }
}
