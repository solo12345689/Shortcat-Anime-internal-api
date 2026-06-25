package io.sentry;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.l3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5230l3 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f50811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f50812c;

    /* JADX INFO: renamed from: io.sentry.l3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5230l3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            String strI1 = null;
            Object objN1 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("type")) {
                    strI1 = interfaceC5218j1.i1();
                } else if (strR0.equals("value")) {
                    objN1 = interfaceC5218j1.N1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            if (strI1 != null) {
                C5230l3 c5230l3 = new C5230l3(strI1, objN1);
                c5230l3.a(map);
                return c5230l3;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.b(EnumC5215i3.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public C5230l3(String str, Object obj) {
        this.f50810a = str;
        if (obj == null || !str.equals("string")) {
            this.f50811b = obj;
        } else {
            this.f50811b = obj.toString();
        }
    }

    public void a(Map map) {
        this.f50812c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("type").j(iLogger, this.f50810a);
        interfaceC5223k1.e("value").j(iLogger, this.f50811b);
        Map map = this.f50812c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50812c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
