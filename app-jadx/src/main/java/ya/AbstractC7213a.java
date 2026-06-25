package ya;

import android.util.Log;

/* JADX INFO: renamed from: ya.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7213a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f64989a = false;

    public static synchronized void a() {
        if (f64989a) {
            return;
        }
        try {
            Log.i("NitroModules", "Loading NitroModules C++ library...");
            System.loadLibrary("NitroModules");
            Log.i("NitroModules", "Successfully loaded NitroModules C++ library!");
            f64989a = true;
        } finally {
        }
    }
}
