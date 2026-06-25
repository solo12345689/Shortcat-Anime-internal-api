package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface b extends IInterface {
    Map a();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f34871a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f34872b = "com.amazon.venezia.command.ChoiceContext";

        /* JADX INFO: renamed from: com.amazon.d.a.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0583a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f34873a;

            C0583a(IBinder iBinder) {
                this.f34873a = iBinder;
            }

            @Override // com.amazon.d.a.b
            public Map a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34872b);
                    this.f34873a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34873a;
            }

            public String b() {
                return a.f34872b;
            }
        }

        public a() {
            attachInterface(this, f34872b);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f34872b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0583a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(f34872b);
                return true;
            }
            parcel.enforceInterface(f34872b);
            Map mapA = a();
            parcel2.writeNoException();
            parcel2.writeMap(mapA);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
