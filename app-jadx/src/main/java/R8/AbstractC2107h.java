package R8;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: R8.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2107h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f15315a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f15316b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static s0 f15317c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static HandlerThread f15318d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Executor f15319e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f15320f = false;

    public static AbstractC2107h b(Context context) {
        synchronized (f15315a) {
            try {
                if (f15317c == null) {
                    f15317c = new s0(context.getApplicationContext(), f15320f ? c().getLooper() : context.getMainLooper(), f15319e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f15317c;
    }

    public static HandlerThread c() {
        synchronized (f15315a) {
            try {
                HandlerThread handlerThread = f15318d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f15316b);
                f15318d = handlerThread2;
                handlerThread2.start();
                return f15318d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return e(new p0(componentName, 4225), serviceConnection, str, executor).l();
    }

    public void d(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        g(new p0(componentName, 4225), serviceConnection, str);
    }

    protected abstract ConnectionResult e(p0 p0Var, ServiceConnection serviceConnection, String str, Executor executor);

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        g(new p0(str, str2, 4225, z10), serviceConnection, str3);
    }

    protected abstract void g(p0 p0Var, ServiceConnection serviceConnection, String str);
}
