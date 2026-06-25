package io.sentry.protocol;

import com.adjust.sdk.Constants;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.AbstractC5290c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient Thread f51078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f51079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f51081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f51082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f51083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f51084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f51085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f51086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f51087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Boolean f51088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f51089l;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            l lVar = new l();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "description":
                        lVar.f51080c = interfaceC5218j1.i1();
                        break;
                    case "exception_id":
                        lVar.f51086i = interfaceC5218j1.b1();
                        break;
                    case "data":
                        lVar.f51084g = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "meta":
                        lVar.f51083f = AbstractC5290c.b((Map) interfaceC5218j1.N1());
                        break;
                    case "type":
                        lVar.f51079b = interfaceC5218j1.i1();
                        break;
                    case "handled":
                        lVar.f51082e = interfaceC5218j1.w0();
                        break;
                    case "synthetic":
                        lVar.f51085h = interfaceC5218j1.w0();
                        break;
                    case "is_exception_group":
                        lVar.f51088k = interfaceC5218j1.w0();
                        break;
                    case "help_link":
                        lVar.f51081d = interfaceC5218j1.i1();
                        break;
                    case "parent_id":
                        lVar.f51087j = interfaceC5218j1.b1();
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
            lVar.s(map);
            return lVar;
        }
    }

    public l() {
        this(null);
    }

    public String k() {
        return this.f51079b;
    }

    public Boolean l() {
        return this.f51082e;
    }

    public void m(Integer num) {
        this.f51086i = num;
    }

    public void n(Boolean bool) {
        this.f51082e = bool;
    }

    public void o(Map map) {
        this.f51083f = AbstractC5290c.c(map);
    }

    public void p(Integer num) {
        this.f51087j = num;
    }

    public void q(Boolean bool) {
        this.f51085h = bool;
    }

    public void r(String str) {
        this.f51079b = str;
    }

    public void s(Map map) {
        this.f51089l = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51079b != null) {
            interfaceC5223k1.e("type").f(this.f51079b);
        }
        if (this.f51080c != null) {
            interfaceC5223k1.e(com.amazon.a.a.o.b.f34645c).f(this.f51080c);
        }
        if (this.f51081d != null) {
            interfaceC5223k1.e("help_link").f(this.f51081d);
        }
        if (this.f51082e != null) {
            interfaceC5223k1.e("handled").k(this.f51082e);
        }
        if (this.f51083f != null) {
            interfaceC5223k1.e(Constants.REFERRER_API_META).j(iLogger, this.f51083f);
        }
        if (this.f51084g != null) {
            interfaceC5223k1.e("data").j(iLogger, this.f51084g);
        }
        if (this.f51085h != null) {
            interfaceC5223k1.e("synthetic").k(this.f51085h);
        }
        if (this.f51086i != null) {
            interfaceC5223k1.e("exception_id").j(iLogger, this.f51086i);
        }
        if (this.f51087j != null) {
            interfaceC5223k1.e("parent_id").j(iLogger, this.f51087j);
        }
        if (this.f51088k != null) {
            interfaceC5223k1.e("is_exception_group").k(this.f51088k);
        }
        Map map = this.f51089l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51089l.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public l(Thread thread) {
        this.f51078a = thread;
    }
}
