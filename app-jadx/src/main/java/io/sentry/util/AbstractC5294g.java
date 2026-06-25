package io.sentry.util;

import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.util.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5294g {
    private static boolean a(V2 v22, C5322z3 c5322z3) {
        return o.b(c5322z3.getSerializer(), c5322z3.getLogger(), v22) <= C5322z3.MAX_EVENT_SIZE_BYTES;
    }

    public static V2 b(V2 v22, io.sentry.H h10, C5322z3 c5322z3) {
        try {
            if (c5322z3.isEnableEventSizeLimiting() && !a(v22, c5322z3)) {
                c5322z3.getLogger().c(EnumC5215i3.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", v22.G(), Long.valueOf(C5322z3.MAX_EVENT_SIZE_BYTES));
                c5322z3.getOnOversizedEvent();
                V2 v2C = c(v22, c5322z3);
                if (a(v2C, c5322z3)) {
                    return v2C;
                }
                V2 v2D = d(v2C, c5322z3);
                if (a(v2D, c5322z3)) {
                    return v2D;
                }
                c5322z3.getLogger().c(EnumC5215i3.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", v22.G());
                return v2D;
            }
            return v22;
        } catch (Throwable th2) {
            c5322z3.getLogger().b(EnumC5215i3.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th2);
            return v22;
        }
    }

    private static V2 c(V2 v22, C5322z3 c5322z3) {
        List listB = v22.B();
        if (listB != null && !listB.isEmpty()) {
            v22.S(null);
            c5322z3.getLogger().c(EnumC5215i3.DEBUG, "Removed breadcrumbs to reduce size of event %s", v22.G());
        }
        return v22;
    }

    private static V2 d(V2 v22, C5322z3 c5322z3) {
        List listP0 = v22.p0();
        if (listP0 != null) {
            Iterator it = listP0.iterator();
            while (it.hasNext()) {
                io.sentry.protocol.C cI = ((io.sentry.protocol.s) it.next()).i();
                if (cI != null) {
                    e(cI, v22, c5322z3, "Truncated exception stack frames of event %s");
                }
            }
        }
        List listU0 = v22.u0();
        if (listU0 != null) {
            Iterator it2 = listU0.iterator();
            while (it2.hasNext()) {
                io.sentry.protocol.C cN = ((io.sentry.protocol.D) it2.next()).n();
                if (cN != null) {
                    e(cN, v22, c5322z3, "Truncated thread stack frames for event %s");
                }
            }
        }
        return v22;
    }

    private static void e(io.sentry.protocol.C c10, V2 v22, C5322z3 c5322z3, String str) {
        List listE = c10.e();
        if (listE == null || listE.size() <= 500) {
            return;
        }
        ArrayList arrayList = new ArrayList(500);
        arrayList.addAll(listE.subList(0, 250));
        arrayList.addAll(listE.subList(listE.size() - 250, listE.size()));
        c10.f(arrayList);
        c5322z3.getLogger().c(EnumC5215i3.DEBUG, str, v22.G());
    }
}
