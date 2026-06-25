package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3055a extends IInterface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f33383o = "android$support$v4$app$INotificationSideChannel".replace('$', com.amazon.a.a.o.c.a.b.f34706a);

    /* JADX INFO: renamed from: c.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class AbstractBinderC0561a extends Binder implements InterfaceC3055a {

        /* JADX INFO: renamed from: c.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0562a implements InterfaceC3055a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f33384a;

            C0562a(IBinder iBinder) {
                this.f33384a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33384a;
            }

            @Override // c.InterfaceC3055a
            public void v3(String str, int i10, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC3055a.f33383o);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f33384a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC3055a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC3055a.f33383o);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3055a)) ? new C0562a(iBinder) : (InterfaceC3055a) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.a$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void v3(String str, int i10, String str2, Notification notification);
}
