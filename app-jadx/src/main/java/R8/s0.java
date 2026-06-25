package R8;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class s0 extends AbstractC2107h {

    /* JADX INFO: renamed from: g */
    private final HashMap f15369g = new HashMap();

    /* JADX INFO: renamed from: h */
    private final Context f15370h;

    /* JADX INFO: renamed from: i */
    private volatile Handler f15371i;

    /* JADX INFO: renamed from: j */
    private final r0 f15372j;

    /* JADX INFO: renamed from: k */
    private final V8.a f15373k;

    /* JADX INFO: renamed from: l */
    private final long f15374l;

    /* JADX INFO: renamed from: m */
    private final long f15375m;

    /* JADX INFO: renamed from: n */
    private volatile Executor f15376n;

    s0(Context context, Looper looper, Executor executor) {
        r0 r0Var = new r0(this, null);
        this.f15372j = r0Var;
        this.f15370h = context.getApplicationContext();
        this.f15371i = new f9.p(looper, r0Var);
        this.f15373k = V8.a.b();
        this.f15374l = HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS;
        this.f15375m = 300000L;
        this.f15376n = executor;
    }

    @Override // R8.AbstractC2107h
    protected final ConnectionResult e(p0 p0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        ConnectionResult connectionResultJ;
        AbstractC2115p.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f15369g;
        synchronized (map) {
            try {
                q0 q0Var = (q0) map.get(p0Var);
                if (executor == null) {
                    executor = this.f15376n;
                }
                if (q0Var == null) {
                    q0Var = new q0(this, p0Var);
                    q0Var.b(serviceConnection, serviceConnection, str);
                    connectionResultJ = q0Var.j(str, executor);
                    map.put(p0Var, q0Var);
                } else {
                    this.f15371i.removeMessages(0, p0Var);
                    if (q0Var.f(serviceConnection)) {
                        String string = p0Var.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(string);
                        throw new IllegalStateException(sb2.toString());
                    }
                    q0Var.b(serviceConnection, serviceConnection, str);
                    int iE = q0Var.e();
                    if (iE == 1) {
                        serviceConnection.onServiceConnected(q0Var.i(), q0Var.h());
                    } else if (iE == 2) {
                        connectionResultJ = q0Var.j(str, executor);
                    }
                    connectionResultJ = null;
                }
                if (q0Var.d()) {
                    return ConnectionResult.f38918f;
                }
                if (connectionResultJ == null) {
                    connectionResultJ = new ConnectionResult(-1);
                }
                return connectionResultJ;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // R8.AbstractC2107h
    protected final void g(p0 p0Var, ServiceConnection serviceConnection, String str) {
        AbstractC2115p.m(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f15369g;
        synchronized (map) {
            try {
                q0 q0Var = (q0) map.get(p0Var);
                if (q0Var == null) {
                    String string = p0Var.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(string);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!q0Var.f(serviceConnection)) {
                    String string2 = p0Var.toString();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 76);
                    sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb3.append(string2);
                    throw new IllegalStateException(sb3.toString());
                }
                q0Var.c(serviceConnection, str);
                if (q0Var.g()) {
                    this.f15371i.sendMessageDelayed(this.f15371i.obtainMessage(0, p0Var), this.f15374l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ HashMap h() {
        return this.f15369g;
    }

    final /* synthetic */ Context i() {
        return this.f15370h;
    }

    final /* synthetic */ Handler j() {
        return this.f15371i;
    }

    final /* synthetic */ V8.a k() {
        return this.f15373k;
    }

    final /* synthetic */ long l() {
        return this.f15375m;
    }
}
