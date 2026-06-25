package l9;

import android.os.Parcel;

/* JADX INFO: renamed from: l9.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5574e extends d9.b implements InterfaceC5575f {
    public AbstractBinderC5574e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // d9.b
    protected final boolean G3(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                d9.c.b(parcel);
                break;
            case 4:
                d9.c.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                d9.c.b(parcel);
                break;
            case 7:
                d9.c.b(parcel);
                break;
            case 8:
                C5581l c5581l = (C5581l) d9.c.a(parcel, C5581l.CREATOR);
                d9.c.b(parcel);
                a3(c5581l);
                break;
            case 9:
                d9.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
