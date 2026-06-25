package Q8;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: Q8.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2058f extends IInterface {

    /* JADX INFO: renamed from: Q8.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends d9.b implements InterfaceC2058f {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // d9.b
        protected final boolean G3(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) d9.c.a(parcel, Status.CREATOR);
            d9.c.b(parcel);
            g2(status);
            return true;
        }
    }

    void g2(Status status);
}
