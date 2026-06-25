package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = 33554432;
        }
        return i11 | i10;
    }

    public static PendingIntent b(Context context, int i10, Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }
}
