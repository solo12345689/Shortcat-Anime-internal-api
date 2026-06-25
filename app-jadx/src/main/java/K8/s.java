package K8;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends b9.c implements t {
    public s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // b9.c
    protected final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Q();
        } else {
            if (i10 != 2) {
                return false;
            }
            f0();
        }
        return true;
    }
}
