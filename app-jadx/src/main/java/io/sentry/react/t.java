package io.sentry.react;

import io.sentry.C5191e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends io.sentry.android.replay.a {
    public static String i(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int iMin = Math.min(3, list.size() - 1); iMin >= 0; iMin--) {
            Object obj2 = list.get(iMin);
            if (!(obj2 instanceof Map)) {
                return null;
            }
            Map map = (Map) obj2;
            Object obj3 = map.get("name");
            Object obj4 = map.get("label");
            boolean z10 = obj4 instanceof String;
            if (!(obj3 instanceof String) && !z10) {
                return null;
            }
            if (z10) {
                sb2.append(obj4);
            } else {
                sb2.append(obj3);
            }
            Object obj5 = map.get("element");
            Object obj6 = map.get("file");
            boolean z11 = obj5 instanceof String;
            boolean z12 = obj6 instanceof String;
            if (z11 && z12) {
                sb2.append('(');
                sb2.append(obj5);
                sb2.append(", ");
                sb2.append(obj6);
                sb2.append(')');
            } else if (z11) {
                sb2.append('(');
                sb2.append(obj5);
                sb2.append(')');
            } else if (z12) {
                sb2.append('(');
                sb2.append(obj6);
                sb2.append(')');
            }
            if (iMin > 0) {
                sb2.append(" > ");
            }
        }
        return sb2.toString();
    }

    private void j(io.sentry.rrweb.a aVar, C5191e c5191e) {
        aVar.w(c5191e.u());
        aVar.u(c5191e.t());
        aVar.f(c5191e.x().getTime());
        aVar.r(c5191e.x().getTime() / 1000.0d);
        aVar.s("default");
    }

    @Override // io.sentry.android.replay.a, io.sentry.InterfaceC5315y1
    public io.sentry.rrweb.b a(C5191e c5191e) {
        if (c5191e.r() == null || "sentry.event".equals(c5191e.r()) || "sentry.transaction".equals(c5191e.r()) || "http".equals(c5191e.r())) {
            return null;
        }
        if ("touch".equals(c5191e.r())) {
            return h(c5191e);
        }
        if ("navigation".equals(c5191e.r())) {
            return f(c5191e);
        }
        if ("xhr".equals(c5191e.r())) {
            return g(c5191e);
        }
        io.sentry.rrweb.b bVarA = super.a(c5191e);
        if ((bVarA instanceof io.sentry.rrweb.a) && "navigation".equals(((io.sentry.rrweb.a) bVarA).n())) {
            return null;
        }
        return bVarA;
    }

    public io.sentry.rrweb.b f(C5191e c5191e) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t(c5191e.r());
        j(aVar, c5191e);
        return aVar;
    }

    public io.sentry.rrweb.b g(C5191e c5191e) {
        Double d10 = c5191e.s("start_timestamp") instanceof Number ? (Double) c5191e.s("start_timestamp") : null;
        Double d11 = c5191e.s("end_timestamp") instanceof Number ? (Double) c5191e.s("end_timestamp") : null;
        String str = c5191e.s("url") instanceof String ? (String) c5191e.s("url") : null;
        if (d10 == null || d11 == null || str == null) {
            return null;
        }
        HashMap map = new HashMap();
        if (c5191e.s("method") instanceof String) {
            map.put("method", c5191e.s("method"));
        }
        if (c5191e.s("status_code") instanceof Double) {
            Double d12 = (Double) c5191e.s("status_code");
            if (d12.doubleValue() > 0.0d) {
                map.put("statusCode", Integer.valueOf(d12.intValue()));
            }
        }
        if (c5191e.s("request_body_size") instanceof Double) {
            map.put("requestBodySize", c5191e.s("request_body_size"));
        }
        if (c5191e.s("response_body_size") instanceof Double) {
            map.put("responseBodySize", c5191e.s("response_body_size"));
        }
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.s("resource.http");
        iVar.u(d10.doubleValue() / 1000.0d);
        iVar.r(d11.doubleValue() / 1000.0d);
        iVar.q(str);
        iVar.o(map);
        return iVar;
    }

    public io.sentry.rrweb.b h(C5191e c5191e) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t("ui.tap");
        aVar.x(i(c5191e.s("path")));
        j(aVar, c5191e);
        return aVar;
    }
}
