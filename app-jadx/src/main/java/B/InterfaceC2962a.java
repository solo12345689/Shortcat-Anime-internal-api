package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2962a extends IInterface {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f33015m = "android$support$customtabs$ICustomTabsCallback".replace('$', com.amazon.a.a.o.c.a.b.f34706a);

    /* JADX INFO: renamed from: b.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void d(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void A2(Bundle bundle);

    void I2(int i10, int i11, Bundle bundle);

    void U0(String str, Bundle bundle);

    void Y2(int i10, Bundle bundle);

    void a0(int i10, int i11, int i12, int i13, int i14, Bundle bundle);

    void c1(Bundle bundle);

    Bundle m0(String str, Bundle bundle);

    void n3(String str, Bundle bundle);

    void t3(Bundle bundle);

    void w3(int i10, Uri uri, boolean z10, Bundle bundle);

    void x2(Bundle bundle);

    /* JADX INFO: renamed from: b.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractBinderC0552a extends Binder implements InterfaceC2962a {
        public AbstractBinderC0552a() {
            attachInterface(this, InterfaceC2962a.f33015m);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC2962a.f33015m;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    Y2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    U0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    t3((Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    n3(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    w3(parcel.readInt(), (Uri) b.c(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleM0 = m0(parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, bundleM0, 1);
                    return true;
                case 8:
                    I2(parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    c1((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    a0(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    x2((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    A2((Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
