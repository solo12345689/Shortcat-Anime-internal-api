package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends Service {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {
        static int a() {
            return IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) t.class), a.a() | 128);
    }
}
