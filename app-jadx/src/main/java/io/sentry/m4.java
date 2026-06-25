package io.sentry;

import io.sentry.protocol.x;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m4 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f50839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f50842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f50843e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m4 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            io.sentry.protocol.x xVarA = null;
            String strI1 = null;
            String strI12 = null;
            String strI13 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "comments":
                        strI13 = interfaceC5218j1.i1();
                        break;
                    case "name":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    case "email":
                        strI12 = interfaceC5218j1.i1();
                        break;
                    case "event_id":
                        xVarA = new x.a().a(interfaceC5218j1, iLogger);
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
            if (xVarA != null) {
                m4 m4Var = new m4(xVarA, strI1, strI12, strI13);
                m4Var.a(map);
                return m4Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"event_id\"");
            iLogger.b(EnumC5215i3.ERROR, "Missing required field \"event_id\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public m4(io.sentry.protocol.x xVar, String str, String str2, String str3) {
        this.f50839a = xVar;
        this.f50840b = str;
        this.f50841c = str2;
        this.f50842d = str3;
    }

    public void a(Map map) {
        this.f50843e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("event_id");
        this.f50839a.serialize(interfaceC5223k1, iLogger);
        if (this.f50840b != null) {
            interfaceC5223k1.e("name").f(this.f50840b);
        }
        if (this.f50841c != null) {
            interfaceC5223k1.e("email").f(this.f50841c);
        }
        if (this.f50842d != null) {
            interfaceC5223k1.e("comments").f(this.f50842d);
        }
        Map map = this.f50843e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f50843e.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public String toString() {
        return "UserFeedback{eventId=" + this.f50839a + ", name='" + this.f50840b + "', email='" + this.f50841c + "', comments='" + this.f50842d + "'}";
    }
}
