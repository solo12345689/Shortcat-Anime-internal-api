package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface h extends IInterface {
    String a();

    String b();

    String c();

    String d();

    boolean e();

    Map f();

    String g();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f34902a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final int f34903b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final int f34904c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f34905d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final int f34906e = 5;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final int f34907f = 6;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final int f34908g = 7;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f34909h = "com.amazon.venezia.command.FailureResult";

        /* JADX INFO: renamed from: com.amazon.d.a.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0589a implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f34910a;

            C0589a(IBinder iBinder) {
                this.f34910a = iBinder;
            }

            @Override // com.amazon.d.a.h
            public String a() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f34910a;
            }

            @Override // com.amazon.d.a.h
            public String b() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String c() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String d() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public boolean e() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public Map f() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.amazon.d.a.h
            public String g() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f34909h);
                    this.f34910a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String h() {
                return a.f34909h;
            }
        }

        public a() {
            attachInterface(this, f34909h);
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(f34909h);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof h)) ? new C0589a(iBinder) : (h) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                parcel2.writeString(f34909h);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(f34909h);
                    String strA = a();
                    parcel2.writeNoException();
                    parcel2.writeString(strA);
                    return true;
                case 2:
                    parcel.enforceInterface(f34909h);
                    String strB = b();
                    parcel2.writeNoException();
                    parcel2.writeString(strB);
                    return true;
                case 3:
                    parcel.enforceInterface(f34909h);
                    String strC = c();
                    parcel2.writeNoException();
                    parcel2.writeString(strC);
                    return true;
                case 4:
                    parcel.enforceInterface(f34909h);
                    String strD = d();
                    parcel2.writeNoException();
                    parcel2.writeString(strD);
                    return true;
                case 5:
                    parcel.enforceInterface(f34909h);
                    boolean zE = e();
                    parcel2.writeNoException();
                    parcel2.writeInt(zE ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f34909h);
                    Map mapF = f();
                    parcel2.writeNoException();
                    parcel2.writeMap(mapF);
                    return true;
                case 7:
                    parcel.enforceInterface(f34909h);
                    String strG = g();
                    parcel2.writeNoException();
                    parcel2.writeString(strG);
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
