package M9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f12281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12282b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected a(IBinder iBinder, String str) {
        this.f12281a = iBinder;
    }

    protected final Parcel G3() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f12282b);
        return parcelObtain;
    }

    protected final void H3(int i10, Parcel parcel) {
        try {
            this.f12281a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12281a;
    }
}
