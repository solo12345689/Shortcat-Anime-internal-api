package cg;

import android.content.Context;
import app.notifee.core.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f33622a;

    public static void a(Context context) {
        Logger.d("context", "received application context");
        f33622a = context;
    }
}
