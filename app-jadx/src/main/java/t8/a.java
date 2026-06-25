package T8;

import R8.C2118t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d9.AbstractC4571a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractC4571a implements IInterface {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void K3(C2118t c2118t) {
        Parcel parcelG3 = G3();
        d9.c.c(parcelG3, c2118t);
        J3(1, parcelG3);
    }
}
