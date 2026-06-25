package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.AbstractC5226l;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5114a0;
import io.sentry.InterfaceC5192e0;
import io.sentry.InterfaceC5247p0;
import io.sentry.InterfaceC5249p2;
import io.sentry.android.core.internal.util.C5142g;
import io.sentry.util.C5288a;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC5247p0, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5131g0 f49546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5288a f49547c = new C5288a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C5322z3 f49548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    volatile b f49549e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f49550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f49551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f49552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f49553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f49554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f49555f;

        a(NetworkCapabilities networkCapabilities, C5131g0 c5131g0, long j10) {
            io.sentry.util.w.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.w.c(c5131g0, "BuildInfoProvider is required");
            this.f49550a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f49551b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = c5131g0.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f49552c = signalStrength > -100 ? signalStrength : 0;
            this.f49554e = networkCapabilities.hasTransport(4);
            String strA1 = C5142g.a1(networkCapabilities);
            this.f49555f = strA1 == null ? "" : strA1;
            this.f49553d = j10;
        }

        boolean a(a aVar) {
            int iAbs = Math.abs(this.f49552c - aVar.f49552c);
            int iAbs2 = Math.abs(this.f49550a - aVar.f49550a);
            int iAbs3 = Math.abs(this.f49551b - aVar.f49551b);
            boolean z10 = AbstractC5226l.l((double) Math.abs(this.f49553d - aVar.f49553d)) < 5000.0d;
            return this.f49554e == aVar.f49554e && this.f49555f.equals(aVar.f49555f) && (z10 || iAbs <= 5) && (z10 || (((double) iAbs2) > Math.max(1000.0d, ((double) Math.abs(this.f49550a)) * 0.1d) ? 1 : (((double) iAbs2) == Math.max(1000.0d, ((double) Math.abs(this.f49550a)) * 0.1d) ? 0 : -1)) <= 0) && (z10 || (((double) iAbs3) > Math.max(1000.0d, ((double) Math.abs(this.f49551b)) * 0.1d) ? 1 : (((double) iAbs3) == Math.max(1000.0d, ((double) Math.abs(this.f49551b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InterfaceC5114a0 f49556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final C5131g0 f49557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        NetworkCapabilities f49558c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f49559d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final InterfaceC5249p2 f49560e;

        b(InterfaceC5114a0 interfaceC5114a0, C5131g0 c5131g0, InterfaceC5249p2 interfaceC5249p2) {
            this.f49556a = (InterfaceC5114a0) io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
            this.f49557b = (C5131g0) io.sentry.util.w.c(c5131g0, "BuildInfoProvider is required");
            this.f49560e = (InterfaceC5249p2) io.sentry.util.w.c(interfaceC5249p2, "SentryDateProvider is required");
        }

        private C5191e a(String str) {
            C5191e c5191e = new C5191e();
            c5191e.H("system");
            c5191e.C("network.event");
            c5191e.D("action", str);
            c5191e.E(EnumC5215i3.INFO);
            return c5191e;
        }

        private a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j10, long j11) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f49557b, j11);
            }
            a aVar = new a(networkCapabilities, this.f49557b, j10);
            a aVar2 = new a(networkCapabilities2, this.f49557b, j11);
            if (aVar.a(aVar2)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.f49556a.a(a("NETWORK_AVAILABLE"));
            this.f49558c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long jM = this.f49560e.now().m();
            a aVarB = b(this.f49558c, networkCapabilities, this.f49559d, jM);
            if (aVarB == null) {
                return;
            }
            this.f49558c = networkCapabilities;
            this.f49559d = jM;
            C5191e c5191eA = a("NETWORK_CAPABILITIES_CHANGED");
            c5191eA.D("download_bandwidth", Integer.valueOf(aVarB.f49550a));
            c5191eA.D("upload_bandwidth", Integer.valueOf(aVarB.f49551b));
            c5191eA.D("vpn_active", Boolean.valueOf(aVarB.f49554e));
            c5191eA.D("network_type", aVarB.f49555f);
            int i10 = aVarB.f49552c;
            if (i10 != 0) {
                c5191eA.D("signal_strength", Integer.valueOf(i10));
            }
            io.sentry.H h10 = new io.sentry.H();
            h10.k("android:networkCapabilities", aVarB);
            this.f49556a.e(c5191eA, h10);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.f49556a.a(a("NETWORK_LOST"));
            this.f49558c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, C5131g0 c5131g0) {
        this.f49545a = (Context) io.sentry.util.w.c(AbstractC5156p0.g(context), "Context is required");
        this.f49546b = (C5131g0) io.sentry.util.w.c(c5131g0, "BuildInfoProvider is required");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5192e0 interfaceC5192e0A = this.f49547c.a();
        try {
            b bVar = this.f49549e;
            this.f49549e = null;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            if (bVar != null) {
                C5142g.D1(bVar);
            }
        } catch (Throwable th2) {
            if (interfaceC5192e0A != null) {
                try {
                    interfaceC5192e0A.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC5247p0
    public void g(InterfaceC5114a0 interfaceC5114a0, C5322z3 c5322z3) {
        io.sentry.util.w.c(interfaceC5114a0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(c5322z3 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5322z3 : null, "SentryAndroidOptions is required");
        this.f49548d = c5322z3;
        ILogger logger = c5322z3.getLogger();
        EnumC5215i3 enumC5215i3 = EnumC5215i3.DEBUG;
        logger.c(enumC5215i3, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f49546b.d() < 24) {
                c5322z3.getLogger().c(enumC5215i3, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            InterfaceC5192e0 interfaceC5192e0A = this.f49547c.a();
            try {
                this.f49549e = new b(interfaceC5114a0, this.f49546b, c5322z3.getDateProvider());
                if (C5142g.p0(this.f49545a, c5322z3.getLogger(), this.f49546b, this.f49549e)) {
                    c5322z3.getLogger().c(enumC5215i3, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.n.a("NetworkBreadcrumbs");
                } else {
                    c5322z3.getLogger().c(enumC5215i3, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } catch (Throwable th2) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }
}
