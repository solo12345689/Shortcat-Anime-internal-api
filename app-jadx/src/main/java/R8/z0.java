package R8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z0 extends f9.n implements InterfaceC2110k {
    public z0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // f9.n
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) f9.o.b(parcel, Bundle.CREATOR);
            f9.o.e(parcel);
            B0(i12, strongBinder, bundle);
        } else if (i10 == 2) {
            int i13 = parcel.readInt();
            Bundle bundle2 = (Bundle) f9.o.b(parcel, Bundle.CREATOR);
            f9.o.e(parcel);
            i2(i13, bundle2);
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            l0 l0Var = (l0) f9.o.b(parcel, l0.CREATOR);
            f9.o.e(parcel);
            L1(i14, strongBinder2, l0Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
