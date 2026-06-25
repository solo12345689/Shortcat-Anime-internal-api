package h5;

import android.content.Context;
import android.util.Log;
import h5.InterfaceC4905b;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements InterfaceC4906c {
    @Override // h5.InterfaceC4906c
    public InterfaceC4905b a(Context context, InterfaceC4905b.a aVar) {
        boolean z10 = AbstractC7194b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
