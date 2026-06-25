package io.sentry.opentelemetry;

import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5280t3;
import io.sentry.N0;
import io.sentry.util.C;
import io.sentry.util.s;
import io.sentry.util.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static void a(C5322z3 c5322z3) {
        if (y.c()) {
            Iterator it = b(c5322z3).iterator();
            while (it.hasNext()) {
                c5322z3.addIgnoredSpanOrigin((String) it.next());
            }
        }
    }

    private static List b(C5322z3 c5322z3) {
        EnumC5280t3 openTelemetryMode = c5322z3.getOpenTelemetryMode();
        return EnumC5280t3.OFF.equals(openTelemetryMode) ? Collections.EMPTY_LIST : C.a(openTelemetryMode);
    }

    public static void c(C5322z3 c5322z3, s sVar) {
        if (y.c()) {
            if (EnumC5280t3.AUTO.equals(c5322z3.getOpenTelemetryMode())) {
                if (sVar.c("io.sentry.opentelemetry.agent.AgentMarker", N0.e())) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    c5322z3.setOpenTelemetryMode(EnumC5280t3.AGENT);
                } else if (sVar.c("io.sentry.opentelemetry.agent.AgentlessMarker", N0.e())) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    c5322z3.setOpenTelemetryMode(EnumC5280t3.AGENTLESS);
                } else if (sVar.c("io.sentry.opentelemetry.agent.AgentlessSpringMarker", N0.e())) {
                    c5322z3.getLogger().c(EnumC5215i3.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    c5322z3.setOpenTelemetryMode(EnumC5280t3.AGENTLESS_SPRING);
                }
            }
        }
    }
}
