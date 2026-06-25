package D8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import o8.AbstractBinderC5836b;
import o8.AbstractC5835a;
import o8.AbstractC5837c;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: D8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractBinderC0040a extends AbstractBinderC5836b implements a {

        /* JADX INFO: renamed from: D8.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static class C0041a extends AbstractC5835a implements a {
            C0041a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // D8.a
            public final Bundle p0(Bundle bundle) {
                Parcel parcelG3 = G3();
                AbstractC5837c.b(parcelG3, bundle);
                Parcel parcelH3 = H3(parcelG3);
                Bundle bundle2 = (Bundle) AbstractC5837c.a(parcelH3, Bundle.CREATOR);
                parcelH3.recycle();
                return bundle2;
            }
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0041a(iBinder);
        }
    }

    Bundle p0(Bundle bundle);
}
