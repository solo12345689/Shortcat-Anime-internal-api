package N8;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Messenger f12732a;

    public l(IBinder iBinder) {
        this.f12732a = new Messenger(iBinder);
    }

    public final IBinder a() {
        Messenger messenger = this.f12732a;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f12732a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((l) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Messenger messenger = this.f12732a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
