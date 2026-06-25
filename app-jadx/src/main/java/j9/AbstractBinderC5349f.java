package j9;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.internal.measurement.Q;
import com.google.android.gms.measurement.internal.S5;
import java.util.ArrayList;

/* JADX INFO: renamed from: j9.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5349f extends P implements InterfaceC5350g {
    public AbstractBinderC5349f() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.P
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(S5.CREATOR);
        Q.f(parcel);
        o1(arrayListCreateTypedArrayList);
        return true;
    }
}
