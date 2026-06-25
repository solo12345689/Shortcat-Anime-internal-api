package X8;

import android.content.Context;
import com.google.android.gms.common.util.l;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f21684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f21685b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f21684a;
        if (context2 != null && (bool = f21685b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f21685b = null;
        if (l.e()) {
            f21685b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f21685b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f21685b = Boolean.FALSE;
            }
        }
        f21684a = applicationContext;
        return f21685b.booleanValue();
    }
}
