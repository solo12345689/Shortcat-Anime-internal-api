package E3;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: E3.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1443q extends IInterface {

    /* JADX INFO: renamed from: E3.q$b */
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

    void C0(int i10, List list);

    void F0(int i10, PendingIntent pendingIntent);

    void G1(int i10, Bundle bundle);

    void H0(int i10, Bundle bundle);

    void J0(int i10, String str, int i11, Bundle bundle);

    void K2(int i10, Bundle bundle, Bundle bundle2);

    void b(int i10);

    void d(int i10);

    void f2(int i10, Bundle bundle);

    void i(int i10, List list);

    void k0(int i10, Bundle bundle);

    void m3(int i10, Bundle bundle);

    void o2(int i10, Bundle bundle);

    void u2(int i10, Bundle bundle);

    void u3(int i10, Bundle bundle, boolean z10);

    void w2(int i10, Bundle bundle, Bundle bundle2);

    void x3(int i10, String str, int i11, Bundle bundle);

    void y2(int i10, Bundle bundle, Bundle bundle2);

    /* JADX INFO: renamed from: E3.q$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements InterfaceC1443q {

        /* JADX INFO: renamed from: E3.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0051a implements InterfaceC1443q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f5490a;

            C0051a(IBinder iBinder) {
                this.f5490a = iBinder;
            }

            @Override // E3.InterfaceC1443q
            public void G1(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5490a.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void H0(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5490a.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5490a;
            }

            @Override // E3.InterfaceC1443q
            public void b(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    this.f5490a.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void d(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    this.f5490a.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void k0(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5490a.transact(3001, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void m3(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5490a.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void o2(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5490a.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void u2(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5490a.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void u3(int i10, Bundle bundle, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5490a.transact(3007, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void w2(int i10, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    b.d(parcelObtain, bundle2, 0);
                    this.f5490a.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.InterfaceC1443q
            public void y2(int i10, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaController");
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    b.d(parcelObtain, bundle2, 0);
                    this.f5490a.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaController");
        }

        public static InterfaceC1443q c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaController");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1443q)) ? new C0051a(iBinder) : (InterfaceC1443q) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaController");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaController");
                return true;
            }
            if (i10 == 4001) {
                x3(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            } else if (i10 != 4002) {
                switch (i10) {
                    case 3001:
                        k0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3002:
                        G1(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3003:
                        H0(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3004:
                        i(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    case 3005:
                        int i12 = parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        w2(i12, (Bundle) b.c(parcel, creator), (Bundle) b.c(parcel, creator));
                        break;
                    case 3006:
                        b(parcel.readInt());
                        break;
                    case 3007:
                        u3(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                        break;
                    case 3008:
                        u2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3009:
                        o2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3010:
                        int i13 = parcel.readInt();
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        K2(i13, (Bundle) b.c(parcel, creator2), (Bundle) b.c(parcel, creator2));
                        break;
                    case 3011:
                        d(parcel.readInt());
                        break;
                    case 3012:
                        m3(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3013:
                        int i14 = parcel.readInt();
                        Parcelable.Creator creator3 = Bundle.CREATOR;
                        y2(i14, (Bundle) b.c(parcel, creator3), (Bundle) b.c(parcel, creator3));
                        break;
                    case 3014:
                        F0(parcel.readInt(), (PendingIntent) b.c(parcel, PendingIntent.CREATOR));
                        break;
                    case 3015:
                        f2(parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                        break;
                    case 3016:
                        C0(parcel.readInt(), parcel.createTypedArrayList(Bundle.CREATOR));
                        break;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            } else {
                J0(parcel.readInt(), parcel.readString(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
