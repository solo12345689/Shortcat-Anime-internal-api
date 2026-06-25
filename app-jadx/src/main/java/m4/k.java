package m4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import k4.C5446b;
import kotlin.jvm.internal.AbstractC5504s;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f53204a;

    static {
        String strI = i4.i.i("NetworkStateTracker");
        AbstractC5504s.g(strI, "tagWithPrefix(\"NetworkStateTracker\")");
        f53204a = strI;
    }

    public static final h a(Context context, InterfaceC5931b taskExecutor) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final C5446b c(ConnectivityManager connectivityManager) {
        AbstractC5504s.h(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zD = d(connectivityManager);
        boolean zA = F1.a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new C5446b(z11, zD, zA, z10);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        AbstractC5504s.h(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = o4.m.a(connectivityManager, o4.n.a(connectivityManager));
            if (networkCapabilitiesA != null) {
                return o4.m.b(networkCapabilitiesA, 16);
            }
            return false;
        } catch (SecurityException e10) {
            i4.i.e().d(f53204a, "Unable to validate active network", e10);
            return false;
        }
    }
}
