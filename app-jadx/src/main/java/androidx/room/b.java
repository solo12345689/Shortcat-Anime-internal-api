package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f32173l = "androidx$room$IMultiInstanceInvalidationService".replace('$', com.amazon.a.a.o.c.a.b.f34706a);

    int e2(androidx.room.a aVar, String str);

    void y1(int i10, String[] strArr);

    void z3(androidx.room.a aVar, int i10);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0533a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f32174a;

            C0533a(IBinder iBinder) {
                this.f32174a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f32174a;
            }

            @Override // androidx.room.b
            public int e2(androidx.room.a aVar, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f32173l);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f32174a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.b
            public void y1(int i10, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f32173l);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f32174a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f32173l);
        }

        public static b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f32173l);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0533a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = b.f32173l;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iE2 = e2(a.AbstractBinderC0531a.c(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iE2);
            } else if (i10 == 2) {
                z3(a.AbstractBinderC0531a.c(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                y1(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
