package j9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.Z5;

/* JADX INFO: renamed from: j9.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5351h extends O implements InterfaceC5353j {
    C5351h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // j9.InterfaceC5353j
    public final void Z2(Z5 z52) {
        Parcel parcelG3 = G3();
        Q.c(parcelG3, z52);
        I3(2, parcelG3);
    }
}
