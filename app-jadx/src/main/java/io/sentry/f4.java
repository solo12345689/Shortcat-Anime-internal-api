package io.sentry;

import io.sentry.protocol.x;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class f4 implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.x f50674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f50675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f50677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f50679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f50680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f50681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f50682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.sentry.protocol.x f50683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f50684k;

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
        public f4 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) throws Exception {
            String strR0;
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.x xVarA = null;
            String strX0 = null;
            String strI1 = null;
            String strI12 = null;
            String strI13 = null;
            String strI14 = null;
            String strI15 = null;
            String strI16 = null;
            io.sentry.protocol.x xVarA2 = null;
            String strI17 = null;
            while (true) {
                io.sentry.protocol.x xVar = xVarA;
                String str = strX0;
                if (interfaceC5218j1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (xVar == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (str == null) {
                        throw c("public_key", iLogger);
                    }
                    f4 f4Var = new f4(xVar, str, strI1, strI12, strI13, strI14, strI15, strI16, xVarA2, strI17);
                    f4Var.c(concurrentHashMap);
                    interfaceC5218j1.I();
                    return f4Var;
                }
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "replay_id":
                        xVarA2 = new x.a().a(interfaceC5218j1, iLogger);
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "user_id":
                        strI13 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "environment":
                        strI12 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "sample_rand":
                        strI17 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "sample_rate":
                        strI15 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "release":
                        strI1 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "trace_id":
                        xVarA = new x.a().a(interfaceC5218j1, iLogger);
                        strX0 = str;
                        break;
                    case "sampled":
                        strI16 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    case "public_key":
                        strX0 = interfaceC5218j1.X0();
                        xVarA = xVar;
                        break;
                    case "transaction":
                        strI14 = interfaceC5218j1.i1();
                        xVarA = xVar;
                        strX0 = str;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        xVarA = xVar;
                        strX0 = str;
                        break;
                }
            }
        }
    }

    f4(io.sentry.protocol.x xVar, String str) {
        this(xVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f50681h;
    }

    public String b() {
        return this.f50680g;
    }

    public void c(Map map) {
        this.f50684k = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("trace_id").j(iLogger, this.f50674a);
        interfaceC5223k1.e("public_key").f(this.f50675b);
        if (this.f50676c != null) {
            interfaceC5223k1.e("release").f(this.f50676c);
        }
        if (this.f50677d != null) {
            interfaceC5223k1.e("environment").f(this.f50677d);
        }
        if (this.f50678e != null) {
            interfaceC5223k1.e("user_id").f(this.f50678e);
        }
        if (this.f50679f != null) {
            interfaceC5223k1.e("transaction").f(this.f50679f);
        }
        if (this.f50680g != null) {
            interfaceC5223k1.e("sample_rate").f(this.f50680g);
        }
        if (this.f50681h != null) {
            interfaceC5223k1.e("sample_rand").f(this.f50681h);
        }
        if (this.f50682i != null) {
            interfaceC5223k1.e("sampled").f(this.f50682i);
        }
        if (this.f50683j != null) {
            interfaceC5223k1.e("replay_id").j(iLogger, this.f50683j);
        }
        Map map = this.f50684k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50684k.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    f4(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2) {
        this(xVar, str, str2, str3, str4, str5, str6, str7, xVar2, null);
    }

    f4(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2, String str8) {
        this.f50674a = xVar;
        this.f50675b = str;
        this.f50676c = str2;
        this.f50677d = str3;
        this.f50678e = str4;
        this.f50679f = str5;
        this.f50680g = str6;
        this.f50682i = str7;
        this.f50683j = xVar2;
        this.f50681h = str8;
    }
}
