package F4;

import F4.e;
import L4.h;
import L4.r;
import android.content.Context;
import android.net.ConnectivityManager;
import y1.AbstractC7194b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final e a(Context context, e.a aVar, r rVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC7194b.j(context, ConnectivityManager.class);
        if (connectivityManager == null || !L4.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (rVar != null && rVar.m() <= 5) {
                rVar.n("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new c();
        }
        try {
            return new g(connectivityManager, aVar);
        } catch (Exception e10) {
            if (rVar != null) {
                h.a(rVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new c();
        }
    }
}
