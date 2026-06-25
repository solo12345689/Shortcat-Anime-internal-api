package c9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends AbstractBinderC3087d implements l {
    public k() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    @Override // c9.AbstractBinderC3087d
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Status status = (Status) e.a(parcel, Status.CREATOR);
            byte[] bArrCreateByteArray = parcel.createByteArray();
            e(parcel);
            j1(status, bArrCreateByteArray);
        } else {
            if (i10 != 2) {
                return false;
            }
            Status status2 = (Status) e.a(parcel, Status.CREATOR);
            L8.e eVar = (L8.e) e.a(parcel, L8.e.CREATOR);
            e(parcel);
            d3(status2, eVar);
        }
        return true;
    }
}
