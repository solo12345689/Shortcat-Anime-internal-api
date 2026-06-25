package Hb;

import Td.z;
import Ud.S;
import app.notifee.core.event.LogEvent;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8372a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f8373b = S.l(z.a(com.amazon.device.simplesignin.a.a.a.f35185s, new g(new long[]{0, 40, 100, 40}, new int[]{0, 50, 0, 60}, new long[]{0, 40, 100, 40})), z.a("warning", new g(new long[]{0, 40, 120, 60}, new int[]{0, 40, 0, 60}, new long[]{0, 40, 120, 60})), z.a(LogEvent.LEVEL_ERROR, new g(new long[]{0, 60, 100, 40, 80, 50}, new int[]{0, 50, 0, 40, 0, 50}, new long[]{0, 60, 100, 40, 80, 50})));

    private e() {
    }

    public final g a(String type) throws c {
        AbstractC5504s.h(type, "type");
        Object obj = f8373b.get(type);
        if (obj != null) {
            return (g) obj;
        }
        throw new c("'type' must be one of ['success', 'warning', 'error']. Obtained '" + type + "'.");
    }
}
