package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC5219j2;
import io.sentry.AbstractC5226l;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.L3;
import io.sentry.S3;
import io.sentry.T3;
import io.sentry.h4;
import io.sentry.protocol.A;
import io.sentry.protocol.C5261k;
import io.sentry.protocol.G;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class E extends AbstractC5219j2 implements B0 {

    /* JADX INFO: renamed from: p */
    private String f50957p;

    /* JADX INFO: renamed from: q */
    private Double f50958q;

    /* JADX INFO: renamed from: r */
    private Double f50959r;

    /* JADX INFO: renamed from: s */
    private final List f50960s;

    /* JADX INFO: renamed from: t */
    private final String f50961t;

    /* JADX INFO: renamed from: u */
    private final Map f50962u;

    /* JADX INFO: renamed from: v */
    private G f50963v;

    /* JADX INFO: renamed from: w */
    private Map f50964w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public E a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            E e10 = new E("", Double.valueOf(0.0d), null, new ArrayList(), new HashMap(), new G(H.CUSTOM.apiName()));
            AbstractC5219j2.a aVar = new AbstractC5219j2.a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "start_timestamp":
                        try {
                            Double dQ0 = interfaceC5218j1.q0();
                            if (dQ0 != null) {
                                e10.f50958q = dQ0;
                            }
                            break;
                        } catch (NumberFormatException unused) {
                            Date dateU0 = interfaceC5218j1.u0(iLogger);
                            if (dateU0 != null) {
                                e10.f50958q = Double.valueOf(AbstractC5226l.b(dateU0));
                            }
                            break;
                        }
                        break;
                    case "measurements":
                        Map mapK1 = interfaceC5218j1.k1(iLogger, new C5261k.a());
                        if (mapK1 != null) {
                            e10.f50962u.putAll(mapK1);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "type":
                        interfaceC5218j1.X0();
                        break;
                    case "timestamp":
                        try {
                            Double dQ02 = interfaceC5218j1.q0();
                            if (dQ02 != null) {
                                e10.f50959r = dQ02;
                            }
                            break;
                        } catch (NumberFormatException unused2) {
                            Date dateU02 = interfaceC5218j1.u0(iLogger);
                            if (dateU02 != null) {
                                e10.f50959r = Double.valueOf(AbstractC5226l.b(dateU02));
                            }
                            break;
                        }
                        break;
                    case "spans":
                        List listT1 = interfaceC5218j1.T1(iLogger, new A.a());
                        if (listT1 != null) {
                            e10.f50960s.addAll(listT1);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "transaction_info":
                        e10.f50963v = new G.a().a(interfaceC5218j1, iLogger);
                        break;
                    case "transaction":
                        e10.f50957p = interfaceC5218j1.i1();
                        break;
                    default:
                        if (aVar.a(e10, strR0, interfaceC5218j1, iLogger)) {
                            break;
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                            break;
                        }
                        break;
                }
            }
            e10.s0(concurrentHashMap);
            interfaceC5218j1.I();
            return e10;
        }
    }

    public E(L3 l32) {
        super(l32.f());
        this.f50960s = new ArrayList();
        this.f50961t = "transaction";
        this.f50962u = new HashMap();
        io.sentry.util.w.c(l32, "sentryTracer is required");
        this.f50958q = Double.valueOf(AbstractC5226l.m(l32.t().m()));
        this.f50959r = Double.valueOf(AbstractC5226l.m(l32.t().k(l32.r())));
        this.f50957p = l32.getName();
        for (S3 s32 : l32.H()) {
            if (Boolean.TRUE.equals(s32.c())) {
                this.f50960s.add(new A(s32));
            }
        }
        C5253c c5253cC = C();
        c5253cC.m(l32.I());
        T3 t3Q = l32.q();
        Map mapJ = l32.J();
        T3 t32 = new T3(t3Q.p(), t3Q.m(), t3Q.h(), t3Q.f(), t3Q.c(), t3Q.l(), t3Q.n(), t3Q.g());
        for (Map.Entry entry : t3Q.o().entrySet()) {
            d0((String) entry.getKey(), (String) entry.getValue());
        }
        if (mapJ != null) {
            for (Map.Entry entry2 : mapJ.entrySet()) {
                t32.q((String) entry2.getKey(), entry2.getValue());
            }
        }
        C5257g c5257gN = t3Q.d().n();
        if (c5257gN != null) {
            for (C5256f c5256f : c5257gN.a()) {
                t32.q("flag.evaluation." + c5256f.a(), c5256f.b());
            }
        }
        c5253cC.z(t32);
        this.f50963v = new G(l32.O().apiName());
    }

    public Map m0() {
        return this.f50962u;
    }

    public h4 n0() {
        T3 t3J = C().j();
        if (t3J == null) {
            return null;
        }
        return t3J.l();
    }

    public List o0() {
        return this.f50960s;
    }

    public String p0() {
        return this.f50957p;
    }

    public boolean q0() {
        return this.f50959r != null;
    }

    public boolean r0() {
        h4 h4VarN0 = n0();
        if (h4VarN0 == null) {
            return false;
        }
        return h4VarN0.e().booleanValue();
    }

    public void s0(Map map) {
        this.f50964w = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50957p != null) {
            interfaceC5223k1.e("transaction").f(this.f50957p);
        }
        interfaceC5223k1.e("start_timestamp").j(iLogger, AbstractC5226l.c(this.f50958q));
        if (this.f50959r != null) {
            interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, AbstractC5226l.c(this.f50959r));
        }
        if (!this.f50960s.isEmpty()) {
            interfaceC5223k1.e("spans").j(iLogger, this.f50960s);
        }
        interfaceC5223k1.e("type").f("transaction");
        if (!this.f50962u.isEmpty()) {
            interfaceC5223k1.e("measurements").j(iLogger, this.f50962u);
        }
        interfaceC5223k1.e("transaction_info").j(iLogger, this.f50963v);
        new AbstractC5219j2.b().a(this, interfaceC5223k1, iLogger);
        Map map = this.f50964w;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50964w.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public E(String str, Double d10, Double d11, List list, Map map, G g10) {
        ArrayList arrayList = new ArrayList();
        this.f50960s = arrayList;
        this.f50961t = "transaction";
        HashMap map2 = new HashMap();
        this.f50962u = map2;
        this.f50957p = str;
        this.f50958q = d10;
        this.f50959r = d11;
        arrayList.addAll(list);
        map2.putAll(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f50962u.putAll(((A) it.next()).c());
        }
        this.f50963v = g10;
    }
}
