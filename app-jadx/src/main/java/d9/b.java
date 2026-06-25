package d9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends Binder implements IInterface {
    protected b(String str) {
        attachInterface(this, str);
    }

    protected abstract boolean G3(int i10, Parcel parcel, Parcel parcel2, int i11);

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return G3(i10, parcel, parcel2, i11);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
