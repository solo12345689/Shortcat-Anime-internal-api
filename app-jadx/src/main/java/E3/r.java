package E3;

import E3.InterfaceC1443q;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface r extends IInterface {

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

    void A1(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder);

    void B2(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12, int i13);

    void B3(InterfaceC1443q interfaceC1443q, int i10);

    void C2(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12, IBinder iBinder);

    void E0(InterfaceC1443q interfaceC1443q, int i10);

    void F3(InterfaceC1443q interfaceC1443q, int i10);

    void G2(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12);

    void I(InterfaceC1443q interfaceC1443q, int i10, int i11);

    void I1(InterfaceC1443q interfaceC1443q, int i10);

    void J2(InterfaceC1443q interfaceC1443q, int i10);

    void K0(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12);

    void M1(InterfaceC1443q interfaceC1443q, int i10, String str);

    void N(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12);

    void N0(InterfaceC1443q interfaceC1443q);

    void N2(InterfaceC1443q interfaceC1443q, int i10, int i11, Bundle bundle);

    void O0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void O1(InterfaceC1443q interfaceC1443q, int i10);

    void P(InterfaceC1443q interfaceC1443q, int i10, String str);

    void Q0(InterfaceC1443q interfaceC1443q, int i10, int i11);

    void Q2(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder, boolean z10);

    void R2(InterfaceC1443q interfaceC1443q, int i10, int i11);

    void S1(InterfaceC1443q interfaceC1443q, int i10);

    void T0(InterfaceC1443q interfaceC1443q, int i10, String str, int i11, int i12, Bundle bundle);

    void T2(InterfaceC1443q interfaceC1443q, int i10, int i11, Bundle bundle);

    void U(InterfaceC1443q interfaceC1443q, int i10, boolean z10, int i11);

    void V(InterfaceC1443q interfaceC1443q, int i10, int i11);

    void V1(InterfaceC1443q interfaceC1443q, int i10, boolean z10);

    void V2(InterfaceC1443q interfaceC1443q, int i10);

    void W(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder);

    void W1(InterfaceC1443q interfaceC1443q, int i10, String str, int i11, int i12, Bundle bundle);

    void X0(InterfaceC1443q interfaceC1443q, int i10);

    void X1(InterfaceC1443q interfaceC1443q, int i10, String str, Bundle bundle);

    void X2(InterfaceC1443q interfaceC1443q, int i10, int i11, long j10);

    void Y(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, boolean z10);

    void Y0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void Z(InterfaceC1443q interfaceC1443q, int i10, Surface surface);

    void Z0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void Z1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, Bundle bundle2);

    void b1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void b3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, long j10);

    void c0(InterfaceC1443q interfaceC1443q, int i10, boolean z10);

    void c3(InterfaceC1443q interfaceC1443q, int i10, int i11, IBinder iBinder);

    void d1(InterfaceC1443q interfaceC1443q, int i10, float f10);

    void d2(InterfaceC1443q interfaceC1443q, int i10);

    void e0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void f3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, boolean z10);

    void g3(InterfaceC1443q interfaceC1443q, int i10, int i11);

    void h1(InterfaceC1443q interfaceC1443q, int i10, float f10);

    void h2(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void h3(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder, int i11, long j10);

    void i0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void i1(InterfaceC1443q interfaceC1443q, int i10, int i11);

    void j2(InterfaceC1443q interfaceC1443q, int i10, String str, Bundle bundle);

    void m1(InterfaceC1443q interfaceC1443q, int i10);

    void n2(InterfaceC1443q interfaceC1443q, int i10);

    void q0(InterfaceC1443q interfaceC1443q, int i10, String str, Bundle bundle);

    void q1(InterfaceC1443q interfaceC1443q, int i10);

    void q3(InterfaceC1443q interfaceC1443q, int i10, boolean z10);

    void r2(InterfaceC1443q interfaceC1443q, int i10);

    void r3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    void t0(InterfaceC1443q interfaceC1443q, int i10);

    void v1(InterfaceC1443q interfaceC1443q, int i10, long j10);

    void x1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements r {

        /* JADX INFO: renamed from: E3.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0052a implements r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f5501a;

            C0052a(IBinder iBinder) {
                this.f5501a = iBinder;
            }

            @Override // E3.r
            public void B2(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12, int i13) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    this.f5501a.transact(3023, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void B3(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3036, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void C2(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f5501a.transact(3056, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void E0(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3021, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void F3(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3025, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void G2(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f5501a.transact(3020, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void I(InterfaceC1443q interfaceC1443q, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3019, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void I1(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3043, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void J2(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3004, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void K0(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f5501a.transact(3051, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void N(InterfaceC1443q interfaceC1443q, int i10, int i11, int i12) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    this.f5501a.transact(3022, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void N0(InterfaceC1443q interfaceC1443q) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    this.f5501a.transact(3045, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void N2(InterfaceC1443q interfaceC1443q, int i10, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3030, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void O0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3015, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void O1(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3046, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void Q0(InterfaceC1443q interfaceC1443q, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3053, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void Q2(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5501a.transact(3011, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void R2(InterfaceC1443q interfaceC1443q, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3052, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void S1(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3034, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void T2(InterfaceC1443q interfaceC1443q, int i10, int i11, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3055, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void U(InterfaceC1443q interfaceC1443q, int i10, boolean z10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3054, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void V(InterfaceC1443q interfaceC1443q, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3017, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void V1(InterfaceC1443q interfaceC1443q, int i10, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5501a.transact(3018, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void V2(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3035, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void W(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f5501a.transact(3031, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void X0(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3040, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void X2(InterfaceC1443q interfaceC1443q, int i10, int i11, long j10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j10);
                    this.f5501a.transact(3039, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void Y(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5501a.transact(3009, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void Z(InterfaceC1443q interfaceC1443q, int i10, Surface surface) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, surface, 0);
                    this.f5501a.transact(3044, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void Z0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3014, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void Z1(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, Bundle bundle2) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    b.d(parcelObtain, bundle2, 0);
                    this.f5501a.transact(3016, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5501a;
            }

            @Override // E3.r
            public void b3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, long j10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeLong(j10);
                    this.f5501a.transact(3008, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void c0(InterfaceC1443q interfaceC1443q, int i10, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5501a.transact(3006, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void c3(InterfaceC1443q interfaceC1443q, int i10, int i11, IBinder iBinder) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeStrongBinder(iBinder);
                    this.f5501a.transact(3032, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void d1(InterfaceC1443q interfaceC1443q, int i10, float f10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeFloat(f10);
                    this.f5501a.transact(3028, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void d2(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3047, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void e0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3033, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void f3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5501a.transact(3057, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void g3(InterfaceC1443q interfaceC1443q, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3037, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void h1(InterfaceC1443q interfaceC1443q, int i10, float f10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeFloat(f10);
                    this.f5501a.transact(3002, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void h3(InterfaceC1443q interfaceC1443q, int i10, IBinder iBinder, int i11, long j10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongBinder(iBinder);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j10);
                    this.f5501a.transact(3012, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void i0(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3048, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void i1(InterfaceC1443q interfaceC1443q, int i10, int i11) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    this.f5501a.transact(3003, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void m1(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3005, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void n2(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3041, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void q1(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3024, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void q3(InterfaceC1443q interfaceC1443q, int i10, boolean z10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f5501a.transact(3013, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void r2(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3042, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void r3(InterfaceC1443q interfaceC1443q, int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    b.d(parcelObtain, bundle, 0);
                    this.f5501a.transact(3027, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void t0(InterfaceC1443q interfaceC1443q, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    this.f5501a.transact(3026, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // E3.r
            public void v1(InterfaceC1443q interfaceC1443q, int i10, long j10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSession");
                    parcelObtain.writeStrongInterface(interfaceC1443q);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeLong(j10);
                    this.f5501a.transact(3038, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.media3.session.IMediaSession");
        }

        public static r c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r)) ? new C0052a(iBinder) : (r) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.media3.session.IMediaSession");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.media3.session.IMediaSession");
                return true;
            }
            switch (i10) {
                case 3002:
                    h1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3003:
                    i1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3004:
                    J2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3005:
                    m1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3006:
                    c0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3007:
                    b1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3008:
                    b3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readLong());
                    return true;
                case 3009:
                    Y(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                case 3010:
                    A1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3011:
                    Q2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt() != 0);
                    return true;
                case 3012:
                    h3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3013:
                    q3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3014:
                    Z0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3015:
                    O0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3016:
                    InterfaceC1443q interfaceC1443qC = InterfaceC1443q.a.c(parcel.readStrongBinder());
                    int i12 = parcel.readInt();
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Z1(interfaceC1443qC, i12, (Bundle) b.c(parcel, creator), (Bundle) b.c(parcel, creator));
                    return true;
                case 3017:
                    V(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3018:
                    V1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0);
                    return true;
                case 3019:
                    I(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3020:
                    G2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3021:
                    E0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3022:
                    N(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3023:
                    B2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3024:
                    q1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3025:
                    F3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3026:
                    t0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3027:
                    r3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3028:
                    d1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readFloat());
                    return true;
                case 3029:
                    Y0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3030:
                    N2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3031:
                    W(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3032:
                    c3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3033:
                    e0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3034:
                    S1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3035:
                    V2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3036:
                    B3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3037:
                    g3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3038:
                    v1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readLong());
                    return true;
                case 3039:
                    X2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readLong());
                    return true;
                case 3040:
                    X0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3041:
                    n2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3042:
                    r2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3043:
                    I1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3044:
                    Z(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Surface) b.c(parcel, Surface.CREATOR));
                    return true;
                case 3045:
                    N0(InterfaceC1443q.a.c(parcel.readStrongBinder()));
                    return true;
                case 3046:
                    O1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3047:
                    d2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt());
                    return true;
                case 3048:
                    i0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3049:
                    X1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3050:
                    h2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3051:
                    K0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    return true;
                case 3052:
                    R2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3053:
                    Q0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt());
                    return true;
                case 3054:
                    U(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt());
                    return true;
                case 3055:
                    T2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    return true;
                case 3056:
                    C2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    return true;
                case 3057:
                    f3(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                    return true;
                default:
                    switch (i10) {
                        case 4001:
                            x1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4002:
                            P(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        case 4003:
                            W1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4004:
                            j2(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4005:
                            T0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4006:
                            q0(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR));
                            return true;
                        case 4007:
                            M1(InterfaceC1443q.a.c(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                            return true;
                        default:
                            return super.onTransact(i10, parcel, parcel2, i11);
                    }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
