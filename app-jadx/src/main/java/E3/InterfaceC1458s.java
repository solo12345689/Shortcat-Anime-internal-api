package E3;

import E3.InterfaceC1443q;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: E3.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1458s extends IInterface {

    /* JADX INFO: renamed from: E3.s$b */
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

    void s3(InterfaceC1443q interfaceC1443q, Bundle bundle);

    /* JADX INFO: renamed from: E3.s$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements InterfaceC1458s {

        /* JADX INFO: renamed from: E3.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0053a implements InterfaceC1458s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f5515a;

            C0053a(IBinder iBinder) {
                this.f5515a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5515a;
            }

            @Override // E3.InterfaceC1458s
            public void s3(InterfaceC1443q interfaceC1443q, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    b.d(parcelObtain, bundle, 0);
                    this.f5515a.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaSessionService");
        }

        public static InterfaceC1458s c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSessionService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1458s)) ? new C0053a(iBinder) : (InterfaceC1458s) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSessionService");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSessionService");
                return true;
            }
            if (i10 != 3001) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            s3(InterfaceC1443q.a.c(parcel.readStrongBinder()), (Bundle) b.c(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
