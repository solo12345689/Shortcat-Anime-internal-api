package R8;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: R8.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2109j extends IInterface {

    /* JADX INFO: renamed from: R8.j$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a extends f9.n implements InterfaceC2109j {
        public static InterfaceC2109j e(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof InterfaceC2109j ? (InterfaceC2109j) iInterfaceQueryLocalInterface : new v0(iBinder);
        }
    }

    Account j();
}
