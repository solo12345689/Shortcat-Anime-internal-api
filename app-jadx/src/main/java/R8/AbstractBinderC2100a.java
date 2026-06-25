package R8;

import R8.InterfaceC2109j;
import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: renamed from: R8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2100a extends InterfaceC2109j.a {
    public static Account h(InterfaceC2109j interfaceC2109j) {
        if (interfaceC2109j == null) {
            return null;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return interfaceC2109j.j();
        } catch (RemoteException unused) {
            Log.w("AccountAccessor", "Remote account accessor probably died");
            return null;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }
}
