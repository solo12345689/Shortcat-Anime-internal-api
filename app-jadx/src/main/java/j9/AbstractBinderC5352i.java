package j9;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* JADX INFO: renamed from: j9.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5352i extends P implements InterfaceC5353j {
    public AbstractBinderC5352i() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Z5 z52 = (Z5) Q.b(parcel, Z5.CREATOR);
        Q.f(parcel);
        Z2(z52);
        return true;
    }
}
