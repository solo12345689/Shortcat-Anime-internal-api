package m4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import k4.C5446b;
import kotlin.jvm.internal.AbstractC5504s;
import o4.o;
import p4.InterfaceC5931b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConnectivityManager f53201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f53202g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            AbstractC5504s.h(network, "network");
            AbstractC5504s.h(capabilities, "capabilities");
            i4.i.e().a(k.f53204a, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f53201f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC5504s.h(network, "network");
            i4.i.e().a(k.f53204a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f53201f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, InterfaceC5931b taskExecutor) {
        super(context, taskExecutor);
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f53201f = (ConnectivityManager) systemService;
        this.f53202g = new a();
    }

    @Override // m4.h
    public void h() {
        try {
            i4.i.e().a(k.f53204a, "Registering network callback");
            o.a(this.f53201f, this.f53202g);
        } catch (IllegalArgumentException e10) {
            i4.i.e().d(k.f53204a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            i4.i.e().d(k.f53204a, "Received exception while registering network callback", e11);
        }
    }

    @Override // m4.h
    public void i() {
        try {
            i4.i.e().a(k.f53204a, "Unregistering network callback");
            o4.m.c(this.f53201f, this.f53202g);
        } catch (IllegalArgumentException e10) {
            i4.i.e().d(k.f53204a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            i4.i.e().d(k.f53204a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // m4.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public C5446b e() {
        return k.c(this.f53201f);
    }
}
