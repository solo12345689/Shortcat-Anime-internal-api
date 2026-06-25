package a9;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC2587a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // a9.f
    public final boolean d0(boolean z10) {
        Parcel parcelG3 = G3();
        c.a(parcelG3, true);
        Parcel parcelH3 = H3(2, parcelG3);
        boolean zB = c.b(parcelH3);
        parcelH3.recycle();
        return zB;
    }

    @Override // a9.f
    public final String k() {
        Parcel parcelH3 = H3(1, G3());
        String string = parcelH3.readString();
        parcelH3.recycle();
        return string;
    }
}
