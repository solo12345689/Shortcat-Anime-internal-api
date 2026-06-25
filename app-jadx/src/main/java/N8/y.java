package N8;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Messenger f12757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f12758b;

    y(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f12757a = new Messenger(iBinder);
            this.f12758b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f12758b = new l(iBinder);
            this.f12757a = null;
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f12757a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        l lVar = this.f12758b;
        if (lVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        lVar.b(message);
    }
}
