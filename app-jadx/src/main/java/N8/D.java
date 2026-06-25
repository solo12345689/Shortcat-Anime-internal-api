package N8;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import e9.AbstractC4662e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: e */
    private static D f12699e;

    /* JADX INFO: renamed from: a */
    private final Context f12700a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f12701b;

    /* JADX INFO: renamed from: c */
    private x f12702c = new x(this, null);

    /* JADX INFO: renamed from: d */
    private int f12703d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12701b = scheduledExecutorService;
        this.f12700a = context.getApplicationContext();
    }

    public static synchronized D b(Context context) {
        try {
            if (f12699e == null) {
                AbstractC4662e.a();
                f12699e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new W8.a("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f12699e;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f12703d;
        this.f12703d = i10 + 1;
        return i10;
    }

    private final synchronized n9.i g(A a10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a10.toString()));
            }
            if (!this.f12702c.g(a10)) {
                x xVar = new x(this, null);
                this.f12702c = xVar;
                xVar.g(a10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10.f12696b.a();
    }

    public final n9.i c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final n9.i d(int i10, Bundle bundle) {
        return g(new C(f(), i10, bundle));
    }
}
