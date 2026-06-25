package l9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d9.AbstractC4571a;

/* JADX INFO: renamed from: l9.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5576g extends AbstractC4571a implements IInterface {
    C5576g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void K3(C5579j c5579j, InterfaceC5575f interfaceC5575f) {
        Parcel parcelG3 = G3();
        d9.c.c(parcelG3, c5579j);
        d9.c.d(parcelG3, interfaceC5575f);
        I3(12, parcelG3);
    }
}
