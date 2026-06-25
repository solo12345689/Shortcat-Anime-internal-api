package R8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class q0 implements ServiceConnection, t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f15354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IBinder f15357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p0 f15358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ComponentName f15359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ s0 f15360g;

    public q0(s0 s0Var, p0 p0Var) {
        Objects.requireNonNull(s0Var);
        this.f15360g = s0Var;
        this.f15358e = p0Var;
        this.f15354a = new HashMap();
        this.f15355b = 2;
    }

    public final void a(String str) {
        p0 p0Var = this.f15358e;
        s0 s0Var = this.f15360g;
        s0Var.j().removeMessages(1, p0Var);
        s0Var.k().c(s0Var.i(), this);
        this.f15356c = false;
        this.f15355b = 2;
    }

    public final void b(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f15354a.put(serviceConnection, serviceConnection2);
    }

    public final void c(ServiceConnection serviceConnection, String str) {
        this.f15354a.remove(serviceConnection);
    }

    public final boolean d() {
        return this.f15356c;
    }

    public final int e() {
        return this.f15355b;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.f15354a.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.f15354a.isEmpty();
    }

    public final IBinder h() {
        return this.f15357d;
    }

    public final ComponentName i() {
        return this.f15359f;
    }

    final /* synthetic */ ConnectionResult j(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = e0.a(this.f15360g.i(), this.f15358e);
            this.f15355b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.v.a();
            try {
                s0 s0Var = this.f15360g;
                V8.a aVarK = s0Var.k();
                Context contextI = s0Var.i();
                p0 p0Var = this.f15358e;
                try {
                    boolean zD = aVarK.d(contextI, str, intentA, this, 4225, executor);
                    this.f15356c = zD;
                    if (zD) {
                        s0Var.j().sendMessageDelayed(s0Var.j().obtainMessage(1, p0Var), s0Var.l());
                        ConnectionResult connectionResult = ConnectionResult.f38918f;
                        StrictMode.setVmPolicy(vmPolicyA);
                        return connectionResult;
                    }
                    this.f15355b = 2;
                    try {
                        s0Var.k().c(s0Var.i(), this);
                    } catch (IllegalArgumentException unused) {
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(16);
                    StrictMode.setVmPolicy(vmPolicyA);
                    return connectionResult2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    StrictMode.setVmPolicy(vmPolicyA);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (c0 e10) {
            return e10.f15269a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s0 s0Var = this.f15360g;
        synchronized (s0Var.h()) {
            try {
                s0Var.j().removeMessages(1, this.f15358e);
                this.f15357d = iBinder;
                this.f15359f = componentName;
                Iterator it = this.f15354a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f15355b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s0 s0Var = this.f15360g;
        synchronized (s0Var.h()) {
            try {
                s0Var.j().removeMessages(1, this.f15358e);
                this.f15357d = null;
                this.f15359f = componentName;
                Iterator it = this.f15354a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f15355b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
