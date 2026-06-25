package R8;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class X implements InterfaceC2111l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f15232a;

    X(IBinder iBinder) {
        this.f15232a = iBinder;
    }

    @Override // R8.InterfaceC2111l
    public final void S0(InterfaceC2110k interfaceC2110k, C2105f c2105f) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC2110k != null ? interfaceC2110k.asBinder() : null);
            if (c2105f != null) {
                parcelObtain.writeInt(1);
                o0.a(c2105f, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f15232a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th2) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15232a;
    }
}
