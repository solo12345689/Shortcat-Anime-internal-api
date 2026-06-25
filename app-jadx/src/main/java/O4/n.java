package o4;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static final Network a(ConnectivityManager connectivityManager) {
        AbstractC5504s.h(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
