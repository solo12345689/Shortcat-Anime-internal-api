package io.sentry.clientreport;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC5226l;
import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.clientreport.g;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f50612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f50614c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC5215i3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            interfaceC5218j1.x();
            Date dateU0 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("discarded_events")) {
                    arrayList.addAll(interfaceC5218j1.T1(iLogger, new g.a()));
                } else if (strR0.equals(DiagnosticsEntry.TIMESTAMP_KEY)) {
                    dateU0 = interfaceC5218j1.u0(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            if (dateU0 == null) {
                throw c(DiagnosticsEntry.TIMESTAMP_KEY, iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(dateU0, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(Date date, List list) {
        this.f50612a = date;
        this.f50613b = list;
    }

    public List a() {
        return this.f50613b;
    }

    public void b(Map map) {
        this.f50614c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).f(AbstractC5226l.h(this.f50612a));
        interfaceC5223k1.e("discarded_events").j(iLogger, this.f50613b);
        Map map = this.f50614c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50614c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
