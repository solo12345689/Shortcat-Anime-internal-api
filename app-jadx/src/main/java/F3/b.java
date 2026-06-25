package F3;

import F3.n;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.revenuecat.purchases.common.verification.SigningManager;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {
    void D2(boolean z10);

    void D3(String str, Bundle bundle);

    void F(int i10);

    void F2(CharSequence charSequence);

    void J1(m mVar);

    void K1(v vVar);

    void L0();

    void c2(Bundle bundle);

    void e1(int i10);

    void f1(u uVar);

    void g0();

    void j0(List list);

    void s2(boolean z10);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: F3.b$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0076a implements b {

            /* JADX INFO: renamed from: b */
            public static b f6283b;

            /* JADX INFO: renamed from: a */
            private IBinder f6284a;

            C0076a(IBinder iBinder) {
                this.f6284a = iBinder;
            }

            @Override // F3.b
            public void D3(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f6284a.transact(1, parcelObtain, null, 1) || a.G3() == null) {
                        parcelObtain.recycle();
                    } else {
                        ((b) AbstractC6614a.e(a.G3())).D3(str, bundle);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // F3.b
            public void F(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i10);
                    if (this.f6284a.transact(9, parcelObtain, null, 1) || a.G3() == null) {
                        return;
                    }
                    ((b) AbstractC6614a.e(a.G3())).F(i10);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // F3.b
            public void K1(v vVar) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (vVar != null) {
                        parcelObtain.writeInt(1);
                        vVar.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f6284a.transact(3, parcelObtain, null, 1) || a.G3() == null) {
                        parcelObtain.recycle();
                    } else {
                        ((b) AbstractC6614a.e(a.G3())).K1(vVar);
                        parcelObtain.recycle();
                    }
                } catch (Throwable th2) {
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6284a;
            }

            @Override // F3.b
            public void e1(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i10);
                    if (this.f6284a.transact(12, parcelObtain, null, 1) || a.G3() == null) {
                        return;
                    }
                    ((b) AbstractC6614a.e(a.G3())).e1(i10);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static b G3() {
            return C0076a.f6283b;
        }

        public static b c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0076a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                ((Parcel) AbstractC6614a.e(parcel2)).writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    D3(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    L0();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    K1(parcel.readInt() != 0 ? v.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    J1(parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    j0(parcel.createTypedArrayList(n.h.CREATOR));
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    F2(parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    c2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    f1(parcel.readInt() != 0 ? u.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    F(parcel.readInt());
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    D2(parcel.readInt() != 0);
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    s2(parcel.readInt() != 0);
                    return true;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    e1(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    g0();
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
