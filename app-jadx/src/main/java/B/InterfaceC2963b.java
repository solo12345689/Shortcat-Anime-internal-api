package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: b.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2963b extends IInterface {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f33016n = "android$support$customtabs$ICustomTabsService".replace('$', com.amazon.a.a.o.c.a.b.f34706a);

    /* JADX INFO: renamed from: b.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements InterfaceC2963b {

        /* JADX INFO: renamed from: b.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0553a implements InterfaceC2963b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f33017a;

            C0553a(IBinder iBinder) {
                this.f33017a = iBinder;
            }

            @Override // b.InterfaceC2963b
            public boolean a1(InterfaceC2962a interfaceC2962a, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2963b.f33016n);
                    parcelObtain.writeStrongInterface(interfaceC2962a);
                    C0554b.d(parcelObtain, bundle, 0);
                    this.f33017a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33017a;
            }

            @Override // b.InterfaceC2963b
            public boolean k2(InterfaceC2962a interfaceC2962a, Uri uri, Bundle bundle, List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2963b.f33016n);
                    parcelObtain.writeStrongInterface(interfaceC2962a);
                    C0554b.d(parcelObtain, uri, 0);
                    C0554b.d(parcelObtain, bundle, 0);
                    C0554b.c(parcelObtain, list, 0);
                    this.f33017a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC2963b
            public boolean v2(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2963b.f33016n);
                    parcelObtain.writeLong(j10);
                    this.f33017a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // b.InterfaceC2963b
            public boolean z2(InterfaceC2962a interfaceC2962a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC2963b.f33016n);
                    parcelObtain.writeStrongInterface(interfaceC2962a);
                    this.f33017a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC2963b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC2963b.f33016n);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC2963b)) ? new C0553a(iBinder) : (InterfaceC2963b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: b.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class C0554b {
        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                d(parcel, (Parcelable) list.get(i11), i10);
            }
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

    boolean a1(InterfaceC2962a interfaceC2962a, Bundle bundle);

    boolean k2(InterfaceC2962a interfaceC2962a, Uri uri, Bundle bundle, List list);

    boolean v2(long j10);

    boolean z2(InterfaceC2962a interfaceC2962a);
}
