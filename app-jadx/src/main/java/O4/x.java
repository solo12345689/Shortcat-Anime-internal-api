package o4;

import Td.L;
import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f54517a;

    static {
        String strI = i4.i.i("WakeLocks");
        AbstractC5504s.g(strI, "tagWithPrefix(\"WakeLocks\")");
        f54517a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y yVar = y.f54518a;
        synchronized (yVar) {
            linkedHashMap.putAll(yVar.a());
            L l10 = L.f17438a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                i4.i.e().k(f54517a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String tag) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        y yVar = y.f54518a;
        synchronized (yVar) {
        }
        AbstractC5504s.g(wakeLock, "wakeLock");
        return wakeLock;
    }
}
