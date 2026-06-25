package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5192e0;
import io.sentry.M;
import io.sentry.android.core.AbstractC5156p0;
import io.sentry.android.core.C5123c0;
import io.sentry.android.core.C5131g0;
import io.sentry.util.C5288a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5142g implements M, C5123c0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile ConnectivityManager f49885n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5322z3 f49891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5131g0 f49892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.sentry.transport.o f49893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f49894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f49895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5288a f49896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile ConnectivityManager.NetworkCallback f49897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile NetworkCapabilities f49898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile Network f49899j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile long f49900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f49901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final C5288a f49884m = new C5288a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final C5288a f49886o = new C5288a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List f49887p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f49888q = {1, 0, 3, 2};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f49889r = new int[2];

    /* JADX INFO: renamed from: io.sentry.android.core.internal.util.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        private void a() {
            C5142g.this.f49901l.set(false);
            InterfaceC5192e0 interfaceC5192e0A = C5142g.this.f49896g.a();
            try {
                C5142g.this.f49898i = null;
                C5142g.this.f49899j = null;
                C5142g c5142g = C5142g.this;
                c5142g.f49900k = c5142g.f49893d.getCurrentTimeMillis();
                C5142g.this.f49891b.getLogger().c(EnumC5215i3.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = C5142g.this.f49894e.iterator();
                while (it.hasNext()) {
                    ((M.b) it.next()).a(M.a.DISCONNECTED);
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

        private boolean b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : C5142g.f49889r) {
                if (i10 != 0 && networkCapabilities.hasCapability(i10) != networkCapabilities2.hasCapability(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean c(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : C5142g.f49888q) {
                if (networkCapabilities.hasTransport(i10) != networkCapabilities2.hasTransport(i10)) {
                    return true;
                }
            }
            return false;
        }

        private boolean d(NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = C5142g.this.f49898i;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        private void e(Network network, NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                C5142g.this.Z1(networkCapabilities);
                M.a aVarG0 = C5142g.this.G0();
                InterfaceC5192e0 interfaceC5192e0A = C5142g.this.f49896g.a();
                try {
                    Iterator it = C5142g.this.f49894e.iterator();
                    while (it.hasNext()) {
                        ((M.b) it.next()).a(aVarG0);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C5142g.this.f49899j = network;
            if (C5142g.this.f49901l.getAndSet(true)) {
                return;
            }
            InterfaceC5192e0 interfaceC5192e0A = C5142g.f49886o.a();
            try {
                Iterator it = C5142g.f49887p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(C5142g.this.f49899j)) {
                e(network, networkCapabilities);
                InterfaceC5192e0 interfaceC5192e0A = C5142g.f49886o.a();
                try {
                    Iterator it = C5142g.f49887p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(C5142g.this.f49899j)) {
                a();
                InterfaceC5192e0 interfaceC5192e0A = C5142g.f49886o.a();
                try {
                    Iterator it = C5142g.f49887p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
            InterfaceC5192e0 interfaceC5192e0A = C5142g.f49886o.a();
            try {
                Iterator it = C5142g.f49887p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
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

    public C5142g(Context context, C5322z3 c5322z3, C5131g0 c5131g0, io.sentry.transport.o oVar) {
        this(context, c5322z3, c5131g0, oVar, null);
    }

    static boolean A1(Context context, ILogger iLogger, C5131g0 c5131g0, Handler handler, ConnectivityManager.NetworkCallback networkCallback) {
        if (c5131g0.d() < 24) {
            iLogger.c(EnumC5215i3.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager connectivityManagerT1 = t1(context, iLogger);
        if (connectivityManagerT1 == null) {
            return false;
        }
        if (!v.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC5215i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            if (handler != null) {
                connectivityManagerT1.registerDefaultNetworkCallback(networkCallback, handler);
                return true;
            }
            connectivityManagerT1.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        if (AbstractC5156p0.s() && this.f49897h == null) {
            InterfaceC5192e0 interfaceC5192e0A = this.f49896g.a();
            try {
                if (this.f49897h != null) {
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (A1(this.f49890a, this.f49891b.getLogger(), this.f49892c, this.f49895f, aVar)) {
                    this.f49897h = aVar;
                    this.f49891b.getLogger().c(EnumC5215i3.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f49891b.getLogger().c(EnumC5215i3.WARNING, "Failed to register network callback", new Object[0]);
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

    public static void D1(ConnectivityManager.NetworkCallback networkCallback) {
        InterfaceC5192e0 interfaceC5192e0A = f49886o.a();
        try {
            f49887p.remove(networkCallback);
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

    private static M.a F0(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!v.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC5215i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return M.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? M.a.CONNECTED : M.a.DISCONNECTED;
            }
            iLogger.c(EnumC5215i3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return M.a.DISCONNECTED;
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.WARNING, "Could not retrieve Connection Status", th2);
            return M.a.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public M.a G0() {
        if (this.f49898i != null) {
            return y1(this.f49898i) ? M.a.CONNECTED : M.a.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerT1 = t1(this.f49890a, this.f49891b.getLogger());
        return connectivityManagerT1 != null ? F0(this.f49890a, connectivityManagerT1, this.f49891b.getLogger()) : M.a.UNKNOWN;
    }

    public static String M0(Context context, ILogger iLogger, C5131g0 c5131g0) {
        boolean zHasTransport;
        boolean zHasTransport2;
        ConnectivityManager connectivityManagerT1 = t1(context, iLogger);
        if (connectivityManagerT1 == null) {
            return null;
        }
        boolean z10 = false;
        if (!v.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC5215i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            zHasTransport = true;
            if (c5131g0.d() >= 23) {
                Network activeNetwork = connectivityManagerT1.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(EnumC5215i3.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = connectivityManagerT1.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(EnumC5215i3.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport3 = networkCapabilities.hasTransport(3);
                zHasTransport2 = networkCapabilities.hasTransport(1);
                zHasTransport = networkCapabilities.hasTransport(0);
                z10 = zHasTransport3;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManagerT1.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(EnumC5215i3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    zHasTransport2 = false;
                } else if (type != 1) {
                    if (type != 9) {
                        zHasTransport2 = false;
                    } else {
                        zHasTransport2 = false;
                        z10 = true;
                    }
                    zHasTransport = zHasTransport2;
                } else {
                    zHasTransport2 = true;
                    zHasTransport = false;
                }
            }
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.ERROR, "Failed to retrieve network info", th2);
        }
        if (z10) {
            return "ethernet";
        }
        if (zHasTransport2) {
            return "wifi";
        }
        if (zHasTransport) {
            return "cellular";
        }
        return null;
    }

    private void O1(Runnable runnable) {
        try {
            this.f49891b.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            this.f49891b.getLogger().b(EnumC5215i3.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    static void S1(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager connectivityManagerT1 = t1(context, iLogger);
        if (connectivityManagerT1 == null) {
            return;
        }
        try {
            connectivityManagerT1.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th2) {
            iLogger.b(EnumC5215i3.WARNING, "unregisterNetworkCallback failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y1(boolean z10) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49896g.a();
        if (z10) {
            try {
                this.f49894e.clear();
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
        ConnectivityManager.NetworkCallback networkCallback = this.f49897h;
        this.f49897h = null;
        if (networkCallback != null) {
            S1(this.f49890a, this.f49891b.getLogger(), networkCallback);
        }
        this.f49898i = null;
        this.f49899j = null;
        this.f49900k = 0L;
        if (interfaceC5192e0A != null) {
            interfaceC5192e0A.close();
        }
        this.f49891b.getLogger().c(EnumC5215i3.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z1(NetworkCapabilities networkCapabilities) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49896g.a();
        try {
            if (networkCapabilities != null) {
                this.f49898i = networkCapabilities;
            } else {
                if (!v.a(this.f49890a, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f49891b.getLogger().c(EnumC5215i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f49898i = null;
                    this.f49900k = this.f49893d.getCurrentTimeMillis();
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                        return;
                    }
                    return;
                }
                if (this.f49892c.d() < 23) {
                    this.f49898i = null;
                    this.f49900k = this.f49893d.getCurrentTimeMillis();
                    if (interfaceC5192e0A != null) {
                        interfaceC5192e0A.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager connectivityManagerT1 = t1(this.f49890a, this.f49891b.getLogger());
                if (connectivityManagerT1 != null) {
                    Network activeNetwork = connectivityManagerT1.getActiveNetwork();
                    this.f49898i = activeNetwork != null ? connectivityManagerT1.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f49898i = null;
                }
            }
            this.f49900k = this.f49893d.getCurrentTimeMillis();
            this.f49891b.getLogger().c(EnumC5215i3.DEBUG, "Cache updated - Status: " + G0() + ", Type: " + q1(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f49891b.getLogger().b(EnumC5215i3.WARNING, "Failed to update connection status cache", th2);
                this.f49898i = null;
                this.f49900k = this.f49893d.getCurrentTimeMillis();
            } catch (Throwable th3) {
                if (interfaceC5192e0A != null) {
                    try {
                        interfaceC5192e0A.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (interfaceC5192e0A != null) {
            interfaceC5192e0A.close();
        }
    }

    public static String a1(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public static /* synthetic */ void j(C5142g c5142g) {
        c5142g.Y1(true);
        InterfaceC5192e0 interfaceC5192e0A = f49886o.a();
        try {
            f49887p.clear();
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            interfaceC5192e0A = f49884m.a();
            try {
                f49885n = null;
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                C5123c0.l().q(c5142g);
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void k(C5142g c5142g) {
        InterfaceC5192e0 interfaceC5192e0A;
        c5142g.Z1(null);
        M.a aVarG0 = c5142g.G0();
        if (aVarG0 == M.a.DISCONNECTED) {
            c5142g.f49901l.set(false);
            interfaceC5192e0A = f49886o.a();
            try {
                Iterator it = f49887p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                }
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
            } finally {
            }
        }
        interfaceC5192e0A = c5142g.f49896g.a();
        try {
            Iterator it2 = c5142g.f49894e.iterator();
            while (it2.hasNext()) {
                ((M.b) it2.next()).a(aVarG0);
            }
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            c5142g.B0();
        } finally {
        }
    }

    public static boolean p0(Context context, ILogger iLogger, C5131g0 c5131g0, ConnectivityManager.NetworkCallback networkCallback) {
        if (c5131g0.d() < 24) {
            iLogger.c(EnumC5215i3.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!v.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC5215i3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        InterfaceC5192e0 interfaceC5192e0A = f49886o.a();
        try {
            f49887p.add(networkCallback);
            if (interfaceC5192e0A == null) {
                return true;
            }
            interfaceC5192e0A.close();
            return true;
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

    private String q1() {
        NetworkCapabilities networkCapabilities = this.f49898i;
        return networkCapabilities != null ? a1(networkCapabilities) : M0(this.f49890a, this.f49891b.getLogger(), this.f49892c);
    }

    private static ConnectivityManager t1(Context context, ILogger iLogger) {
        if (f49885n != null) {
            return f49885n;
        }
        InterfaceC5192e0 interfaceC5192e0A = f49884m.a();
        try {
            if (f49885n != null) {
                ConnectivityManager connectivityManager = f49885n;
                if (interfaceC5192e0A != null) {
                    interfaceC5192e0A.close();
                }
                return connectivityManager;
            }
            f49885n = (ConnectivityManager) context.getSystemService("connectivity");
            if (f49885n == null) {
                iLogger.c(EnumC5215i3.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f49885n;
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            return connectivityManager2;
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

    private boolean u1() {
        return this.f49893d.getCurrentTimeMillis() - this.f49900k < 120000;
    }

    private boolean y1(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean zHasCapability = networkCapabilities.hasCapability(12);
        if (this.f49892c.d() >= 23) {
            zHasCapability = zHasCapability && networkCapabilities.hasCapability(16);
        }
        if (!zHasCapability) {
            return false;
        }
        for (int i10 : f49888q) {
            if (networkCapabilities.hasTransport(i10)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.M
    public boolean C1(M.b bVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49896g.a();
        try {
            this.f49894e.add(bVar);
            if (interfaceC5192e0A != null) {
                interfaceC5192e0A.close();
            }
            B0();
            return this.f49897h != null;
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

    @Override // io.sentry.M
    public void P1(M.b bVar) {
        InterfaceC5192e0 interfaceC5192e0A = this.f49896g.a();
        try {
            this.f49894e.remove(bVar);
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

    @Override // io.sentry.android.core.C5123c0.a
    public void a() {
        if (this.f49897h != null) {
            return;
        }
        O1(new Runnable() { // from class: io.sentry.android.core.internal.util.e
            @Override // java.lang.Runnable
            public final void run() {
                C5142g.k(this.f49883a);
            }
        });
    }

    @Override // io.sentry.M
    public String a0() {
        if (!u1()) {
            Z1(null);
        }
        return q1();
    }

    @Override // io.sentry.android.core.C5123c0.a
    public void b() {
        if (this.f49897h == null) {
            return;
        }
        O1(new Runnable() { // from class: io.sentry.android.core.internal.util.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f49882a.Y1(false);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        O1(new Runnable() { // from class: io.sentry.android.core.internal.util.b
            @Override // java.lang.Runnable
            public final void run() {
                C5142g.j(this.f49880a);
            }
        });
    }

    @Override // io.sentry.M
    public M.a x0() {
        if (!u1()) {
            Z1(null);
        }
        return G0();
    }

    public C5142g(Context context, C5322z3 c5322z3, C5131g0 c5131g0, io.sentry.transport.o oVar, Handler handler) {
        this.f49896g = new C5288a();
        this.f49900k = 0L;
        this.f49901l = new AtomicBoolean(false);
        this.f49890a = AbstractC5156p0.g(context);
        this.f49891b = c5322z3;
        this.f49892c = c5131g0;
        this.f49893d = oVar;
        this.f49895f = handler;
        this.f49894e = new ArrayList();
        int[] iArr = f49889r;
        iArr[0] = 12;
        if (c5131g0.d() >= 23) {
            iArr[1] = 16;
        }
        O1(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f49881a.B0();
            }
        });
        C5123c0.l().h(this);
    }
}
