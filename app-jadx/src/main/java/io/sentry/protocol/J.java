package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.K;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class J implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f50978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f50979c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public J a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            String strI1 = null;
            List listT1 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("rendering_system")) {
                    strI1 = interfaceC5218j1.i1();
                } else if (strR0.equals("windows")) {
                    listT1 = interfaceC5218j1.T1(iLogger, new K.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            J j10 = new J(strI1, listT1);
            j10.a(map);
            return j10;
        }
    }

    public J(String str, List list) {
        this.f50977a = str;
        this.f50978b = list;
    }

    public void a(Map map) {
        this.f50979c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50977a != null) {
            interfaceC5223k1.e("rendering_system").f(this.f50977a);
        }
        if (this.f50978b != null) {
            interfaceC5223k1.e("windows").j(iLogger, this.f50978b);
        }
        Map map = this.f50979c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50979c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
