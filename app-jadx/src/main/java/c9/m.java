package c9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends AbstractBinderC3087d implements n {
    public m() {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback");
    }

    @Override // c9.AbstractBinderC3087d
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) e.a(parcel, Status.CREATOR);
        int i12 = parcel.readInt();
        e(parcel);
        S(status, i12);
        return true;
    }
}
