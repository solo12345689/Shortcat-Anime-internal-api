package d9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: d9.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4571a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f45079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45080b;

    protected AbstractC4571a(IBinder iBinder, String str) {
        this.f45079a = iBinder;
        this.f45080b = str;
    }

    protected final Parcel G3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f45080b);
        return parcelObtain;
    }

    protected final Parcel H3(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f45079a.transact(2, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void I3(int i10, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f45079a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    protected final void J3(int i10, Parcel parcel) {
        try {
            this.f45079a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f45079a;
    }
}
