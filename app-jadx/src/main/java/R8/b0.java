package R8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f15233a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f15234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f15235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f15236d;

    public static int a(Context context) {
        b(context);
        return f15236d;
    }

    private static void b(Context context) {
        synchronized (f15233a) {
            try {
                if (f15234b) {
                    return;
                }
                f15234b = true;
                try {
                    Bundle bundle = X8.e.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f15235c = bundle.getString("com.google.app.id");
                    f15236d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
