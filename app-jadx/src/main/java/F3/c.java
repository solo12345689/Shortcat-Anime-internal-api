package F3;

import F3.b;
import F3.n;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.List;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends IInterface {
    int A();

    boolean B();

    void C();

    void D(int i10);

    boolean D0(KeyEvent keyEvent);

    CharSequence E();

    void E3(w wVar, Bundle bundle);

    void F1(l lVar, int i10);

    List G();

    void H(l lVar);

    void H2(int i10, int i11, String str);

    void J(String str, Bundle bundle);

    void M0(b bVar);

    void M2(boolean z10);

    void N1(int i10, int i11, String str);

    boolean O();

    void P1(l lVar);

    void T(Uri uri, Bundle bundle);

    boolean U1();

    void W0(int i10);

    PendingIntent X();

    void Y1(String str, Bundle bundle);

    Bundle getExtras();

    m getMetadata();

    void k1(String str, Bundle bundle, n.i iVar);

    u k3();

    void m2();

    void n0(String str, Bundle bundle);

    void n1(b bVar);

    void next();

    Bundle o0();

    v p();

    void pause();

    void previous();

    String q();

    String r();

    void r0(String str, Bundle bundle);

    void s();

    void s0(String str, Bundle bundle);

    void s1(long j10);

    void stop();

    void t(float f10);

    void u();

    void u1(boolean z10);

    void v(int i10);

    void v0(Uri uri, Bundle bundle);

    long w();

    int x();

    int y();

    void y3(w wVar);

    void z(long j10);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends Binder implements c {

        /* JADX INFO: renamed from: F3.c$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static class C0077a implements c {

            /* JADX INFO: renamed from: b */
            public static c f6285b;

            /* JADX INFO: renamed from: a */
            private IBinder f6286a;

            C0077a(IBinder iBinder) {
                this.f6286a = iBinder;
            }

            @Override // F3.c
            public int A() {
                int iA;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f6286a.transact(47, parcelObtain, parcelObtain2, 0) || a.G3() == null) {
                        parcelObtain2.readException();
                        iA = parcelObtain2.readInt();
                    } else {
                        iA = ((c) AbstractC6614a.e(a.G3())).A();
                    }
                    return iA;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F3.c
            public boolean B() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f6286a.transact(45, parcelObtain, parcelObtain2, 0) && a.G3() != null) {
                        return ((c) AbstractC6614a.e(a.G3())).B();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F3.c
            public void M0(b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f6286a.transact(4, parcelObtain, parcelObtain2, 0) || a.G3() == null) {
                        parcelObtain2.readException();
                    } else {
                        ((c) AbstractC6614a.e(a.G3())).M0(bVar);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f6286a;
            }

            @Override // F3.c
            public void n1(b bVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (this.f6286a.transact(3, parcelObtain, parcelObtain2, 0) || a.G3() == null) {
                        parcelObtain2.readException();
                    } else {
                        ((c) AbstractC6614a.e(a.G3())).n1(bVar);
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                } catch (Throwable th2) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th2;
                }
            }

            @Override // F3.c
            public v p() {
                v vVarCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f6286a.transact(28, parcelObtain, parcelObtain2, 0) || a.G3() == null) {
                        parcelObtain2.readException();
                        vVarCreateFromParcel = parcelObtain2.readInt() != 0 ? v.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        vVarCreateFromParcel = ((c) AbstractC6614a.e(a.G3())).p();
                    }
                    return vVarCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F3.c
            public int x() {
                int iX;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f6286a.transact(37, parcelObtain, parcelObtain2, 0) || a.G3() == null) {
                        parcelObtain2.readException();
                        iX = parcelObtain2.readInt();
                    } else {
                        iX = ((c) AbstractC6614a.e(a.G3())).x();
                    }
                    return iX;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F3.c
            public int y() {
                int iY;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f6286a.transact(32, parcelObtain, parcelObtain2, 0) || a.G3() == null) {
                        parcelObtain2.readException();
                        iY = parcelObtain2.readInt();
                    } else {
                        iY = ((c) AbstractC6614a.e(a.G3())).y();
                    }
                    return iY;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static c G3() {
            return C0077a.f6285b;
        }

        public static c c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0077a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1598968902) {
                ((Parcel) AbstractC6614a.e(parcel2)).writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    k1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? n.i.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zD0 = D0(parcel.readInt() != 0 ? (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(zD0 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n1(b.a.c(parcel.readStrongBinder()));
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    M0(b.a.c(parcel.readStrongBinder()));
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zU1 = U1();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(zU1 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strR = r();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeString(strR);
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    String strQ = q();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeString(strQ);
                    return true;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    PendingIntent pendingIntentX = X();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (pendingIntentX != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        pendingIntentX.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    long jW = w();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeLong(jW);
                    return true;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    u uVarK3 = k3();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (uVarK3 != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        uVarK3.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    H2(parcel.readInt(), parcel.readInt(), parcel.readString());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    N1(parcel.readInt(), parcel.readInt(), parcel.readString());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    u();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    r0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    v0(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s1(parcel.readLong());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m2();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    C();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    z(parcel.readLong());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    y3(parcel.readInt() != 0 ? w.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    J(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    m metadata = getMetadata();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (metadata != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        metadata.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    v vVarP = p();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (vVarP != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        vVarP.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List listG = G();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeTypedList(listG);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    CharSequence charSequenceE = E();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (charSequenceE != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        TextUtils.writeToParcel(charSequenceE, parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle extras = getExtras();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (extras != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        extras.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iY = y();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(iY);
                    return true;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    n0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Y1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    T(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iX = x();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(iX);
                    return true;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zO = O();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(zO ? 1 : 0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    v(parcel.readInt());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    u1(parcel.readInt() != 0);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    P1(parcel.readInt() != 0 ? l.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    F1(parcel.readInt() != 0 ? l.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    H(parcel.readInt() != 0 ? l.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    W0(parcel.readInt());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    boolean zB = B();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(zB ? 1 : 0);
                    return true;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    M2(parcel.readInt() != 0);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    int iA = A();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeInt(iA);
                    return true;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    D(parcel.readInt());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS /* 49 */:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    t(parcel.readFloat());
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    return true;
                case 50:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    Bundle bundleO0 = o0();
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
                    if (bundleO0 != null) {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(1);
                        bundleO0.writeToParcel(parcel2, 1);
                    } else {
                        ((Parcel) AbstractC6614a.e(parcel2)).writeInt(0);
                    }
                    return true;
                case 51:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    E3(parcel.readInt() != 0 ? w.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    ((Parcel) AbstractC6614a.e(parcel2)).writeNoException();
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
