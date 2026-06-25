package K8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b9.AbstractC3029a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends AbstractC3029a implements IInterface {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void I3(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelG3 = G3();
        b9.e.c(parcelG3, vVar);
        b9.e.b(parcelG3, googleSignInOptions);
        H3(101, parcelG3);
    }

    public final void J3(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelG3 = G3();
        b9.e.c(parcelG3, vVar);
        b9.e.b(parcelG3, googleSignInOptions);
        H3(102, parcelG3);
    }

    public final void K3(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelG3 = G3();
        b9.e.c(parcelG3, vVar);
        b9.e.b(parcelG3, googleSignInOptions);
        H3(103, parcelG3);
    }
}
