package io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f48945a;

    public static Context a() {
        return f48945a;
    }

    public static void b(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f48945a = context;
    }
}
