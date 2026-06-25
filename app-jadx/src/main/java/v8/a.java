package V8;

import R8.AbstractC2115p;
import R8.t0;
import X8.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.l;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b */
    private static final Object f19921b = new Object();

    /* JADX INFO: renamed from: c */
    private static volatile a f19922c;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f19923a = new ConcurrentHashMap();

    private a() {
    }

    public static a b() {
        if (f19922c == null) {
            synchronized (f19921b) {
                try {
                    if (f19922c == null) {
                        f19922c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f19922c;
        AbstractC2115p.l(aVar);
        return aVar;
    }

    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f19923a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i10, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.f19923a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof t0);
    }

    private static void g(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!l.g() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return e(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (f(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.f19923a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    g(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.f19923a.remove(serviceConnection);
                }
            }
        }
        g(context, serviceConnection);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return e(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
