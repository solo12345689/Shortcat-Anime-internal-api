package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f51132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f51133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f51134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f51135e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public q a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            q qVar = new q();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "sdk_name":
                        qVar.f51131a = interfaceC5218j1.i1();
                        break;
                    case "version_patchlevel":
                        qVar.f51134d = interfaceC5218j1.b1();
                        break;
                    case "version_major":
                        qVar.f51132b = interfaceC5218j1.b1();
                        break;
                    case "version_minor":
                        qVar.f51133c = interfaceC5218j1.b1();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        interfaceC5218j1.l1(iLogger, map, strR0);
                        break;
                }
            }
            interfaceC5218j1.I();
            qVar.e(map);
            return qVar;
        }
    }

    public void e(Map map) {
        this.f51135e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51131a != null) {
            interfaceC5223k1.e("sdk_name").f(this.f51131a);
        }
        if (this.f51132b != null) {
            interfaceC5223k1.e("version_major").i(this.f51132b);
        }
        if (this.f51133c != null) {
            interfaceC5223k1.e("version_minor").i(this.f51133c);
        }
        if (this.f51134d != null) {
            interfaceC5223k1.e("version_patchlevel").i(this.f51134d);
        }
        Map map = this.f51135e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51135e.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
