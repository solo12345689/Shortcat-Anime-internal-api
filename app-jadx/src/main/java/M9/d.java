package M9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // M9.f
    public final void p1(String str, Bundle bundle, h hVar) {
        Parcel parcelG3 = G3();
        parcelG3.writeString(str);
        c.c(parcelG3, bundle);
        c.d(parcelG3, hVar);
        H3(2, parcelG3);
    }
}
