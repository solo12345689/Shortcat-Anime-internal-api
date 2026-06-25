package j9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import java.util.List;

/* JADX INFO: renamed from: j9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5348e extends O implements InterfaceC5350g {
    C5348e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // j9.InterfaceC5350g
    public final void o1(List list) {
        Parcel parcelG3 = G3();
        parcelG3.writeTypedList(list);
        I3(2, parcelG3);
    }
}
