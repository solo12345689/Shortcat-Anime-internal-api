package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.C;
import io.sentry.protocol.l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f51141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f51144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C f51145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private l f51146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f51147g;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            s sVar = new s();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "thread_id":
                        sVar.f51144d = interfaceC5218j1.d1();
                        break;
                    case "module":
                        sVar.f51143c = interfaceC5218j1.i1();
                        break;
                    case "type":
                        sVar.f51141a = interfaceC5218j1.i1();
                        break;
                    case "value":
                        sVar.f51142b = interfaceC5218j1.i1();
                        break;
                    case "mechanism":
                        sVar.f51146f = (l) interfaceC5218j1.C0(iLogger, new l.a());
                        break;
                    case "stacktrace":
                        sVar.f51145e = (C) interfaceC5218j1.C0(iLogger, new C.a());
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
            sVar.q(map);
            return sVar;
        }
    }

    public l g() {
        return this.f51146f;
    }

    public String h() {
        return this.f51143c;
    }

    public C i() {
        return this.f51145e;
    }

    public Long j() {
        return this.f51144d;
    }

    public String k() {
        return this.f51141a;
    }

    public void l(l lVar) {
        this.f51146f = lVar;
    }

    public void m(String str) {
        this.f51143c = str;
    }

    public void n(C c10) {
        this.f51145e = c10;
    }

    public void o(Long l10) {
        this.f51144d = l10;
    }

    public void p(String str) {
        this.f51141a = str;
    }

    public void q(Map map) {
        this.f51147g = map;
    }

    public void r(String str) {
        this.f51142b = str;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51141a != null) {
            interfaceC5223k1.e("type").f(this.f51141a);
        }
        if (this.f51142b != null) {
            interfaceC5223k1.e("value").f(this.f51142b);
        }
        if (this.f51143c != null) {
            interfaceC5223k1.e("module").f(this.f51143c);
        }
        if (this.f51144d != null) {
            interfaceC5223k1.e("thread_id").i(this.f51144d);
        }
        if (this.f51145e != null) {
            interfaceC5223k1.e("stacktrace").j(iLogger, this.f51145e);
        }
        if (this.f51146f != null) {
            interfaceC5223k1.e("mechanism").j(iLogger, this.f51146f);
        }
        Map map = this.f51147g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51147g.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
