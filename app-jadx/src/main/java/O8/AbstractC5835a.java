package o8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: o8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5835a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f54584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54585b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected AbstractC5835a(IBinder iBinder) {
        this.f54584a = iBinder;
    }

    protected final Parcel G3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f54585b);
        return parcelObtain;
    }

    protected final Parcel H3(Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f54584a.transact(1, parcel, parcelObtain, 0);
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f54584a;
    }
}
