package F4;

import F4.e;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f6557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f6558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6559c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            g.this.d(network, false);
        }
    }

    public g(ConnectivityManager connectivityManager, e.a aVar) {
        this.f6557a = connectivityManager;
        this.f6558b = aVar;
        a aVar2 = new a();
        this.f6559c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f6557a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        Network[] allNetworks = this.f6557a.getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (AbstractC5504s.c(network2, network) ? z10 : c(network2)) {
                z11 = true;
                break;
            }
            i10++;
        }
        this.f6558b.a(z11);
    }

    @Override // F4.e
    public boolean a() {
        for (Network network : this.f6557a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // F4.e
    public void shutdown() {
        this.f6557a.unregisterNetworkCallback(this.f6559c);
    }
}
