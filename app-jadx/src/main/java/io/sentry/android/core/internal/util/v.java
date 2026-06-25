package io.sentry.android.core.internal.util;

import android.content.Context;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v {
    public static boolean a(Context context, String str) {
        io.sentry.util.w.c(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
