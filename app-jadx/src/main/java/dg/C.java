package dg;

import Ud.AbstractC2279u;
import Ud.S;
import dg.t;
import dg.u;
import fg.AbstractC4807e;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C5483f;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C {

    /* JADX INFO: renamed from: a */
    private final u f45251a;

    /* JADX INFO: renamed from: b */
    private final String f45252b;

    /* JADX INFO: renamed from: c */
    private final t f45253c;

    /* JADX INFO: renamed from: d */
    private final D f45254d;

    /* JADX INFO: renamed from: e */
    private final Map f45255e;

    /* JADX INFO: renamed from: f */
    private C4623d f45256f;

    public C(u url, String method, t headers, D d10, Map tags) {
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(method, "method");
        AbstractC5504s.h(headers, "headers");
        AbstractC5504s.h(tags, "tags");
        this.f45251a = url;
        this.f45252b = method;
        this.f45253c = headers;
        this.f45254d = d10;
        this.f45255e = tags;
    }

    public final D a() {
        return this.f45254d;
    }

    public final t b() {
        return this.f45253c;
    }

    public final String c() {
        return this.f45252b;
    }

    public final u d() {
        return this.f45251a;
    }

    public final D e() {
        return this.f45254d;
    }

    public final C4623d f() {
        C4623d c4623d = this.f45256f;
        if (c4623d != null) {
            return c4623d;
        }
        C4623d c4623dB = C4623d.f45360n.b(this.f45253c);
        this.f45256f = c4623dB;
        return c4623dB;
    }

    public final Map g() {
        return this.f45255e;
    }

    public final String h(String name) {
        AbstractC5504s.h(name, "name");
        return this.f45253c.d(name);
    }

    public final t i() {
        return this.f45253c;
    }

    public final List j(String name) {
        AbstractC5504s.h(name, "name");
        return this.f45253c.r(name);
    }

    public final boolean k() {
        return this.f45251a.i();
    }

    public final String l() {
        return this.f45252b;
    }

    public final a m() {
        return new a(this);
    }

    public final Object n() {
        return o(Object.class);
    }

    public final Object o(Class type) {
        AbstractC5504s.h(type, "type");
        return type.cast(this.f45255e.get(type));
    }

    public final u p() {
        return this.f45251a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f45252b);
        sb2.append(", url=");
        sb2.append(this.f45251a);
        if (this.f45253c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f45253c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC2279u.w();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.getFirst();
                String str2 = (String) pair.getSecond();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f45255e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f45255e);
        }
        sb2.append('}');
        String string = sb2.toString();
        AbstractC5504s.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class a {

        /* JADX INFO: renamed from: a */
        private u f45257a;

        /* JADX INFO: renamed from: b */
        private String f45258b;

        /* JADX INFO: renamed from: c */
        private t.a f45259c;

        /* JADX INFO: renamed from: d */
        private D f45260d;

        /* JADX INFO: renamed from: e */
        private Map f45261e;

        public a() {
            this.f45261e = new LinkedHashMap();
            this.f45258b = "GET";
            this.f45259c = new t.a();
        }

        public a a(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            this.f45259c.a(name, value);
            return this;
        }

        public C b() {
            u uVar = this.f45257a;
            if (uVar != null) {
                return new C(uVar, this.f45258b, this.f45259c.e(), this.f45260d, AbstractC4807e.W(this.f45261e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(C4623d cacheControl) {
            AbstractC5504s.h(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? i("Cache-Control") : e("Cache-Control", string);
        }

        public a d() {
            return g("GET", null);
        }

        public a e(String name, String value) {
            AbstractC5504s.h(name, "name");
            AbstractC5504s.h(value, "value");
            this.f45259c.i(name, value);
            return this;
        }

        public a f(t headers) {
            AbstractC5504s.h(headers, "headers");
            this.f45259c = headers.l();
            return this;
        }

        public a g(String method, D d10) {
            AbstractC5504s.h(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (d10 == null) {
                if (C5483f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C5483f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f45258b = method;
            this.f45260d = d10;
            return this;
        }

        public a h(D body) {
            AbstractC5504s.h(body, "body");
            return g("POST", body);
        }

        public a i(String name) {
            AbstractC5504s.h(name, "name");
            this.f45259c.h(name);
            return this;
        }

        public a j(Class type, Object obj) {
            AbstractC5504s.h(type, "type");
            if (obj == null) {
                this.f45261e.remove(type);
                return this;
            }
            if (this.f45261e.isEmpty()) {
                this.f45261e = new LinkedHashMap();
            }
            Map map = this.f45261e;
            Object objCast = type.cast(obj);
            AbstractC5504s.e(objCast);
            map.put(type, objCast);
            return this;
        }

        public a k(Object obj) {
            return j(Object.class, obj);
        }

        public a l(u url) {
            AbstractC5504s.h(url, "url");
            this.f45257a = url;
            return this;
        }

        public a m(String url) {
            AbstractC5504s.h(url, "url");
            if (Df.r.O(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                AbstractC5504s.g(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (Df.r.O(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                AbstractC5504s.g(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return l(u.f45583k.d(url));
        }

        public a n(URL url) {
            AbstractC5504s.h(url, "url");
            u.b bVar = u.f45583k;
            String string = url.toString();
            AbstractC5504s.g(string, "url.toString()");
            return l(bVar.d(string));
        }

        public a(C request) {
            Map mapB;
            AbstractC5504s.h(request, "request");
            this.f45261e = new LinkedHashMap();
            this.f45257a = request.p();
            this.f45258b = request.l();
            this.f45260d = request.e();
            if (request.g().isEmpty()) {
                mapB = new LinkedHashMap();
            } else {
                mapB = S.B(request.g());
            }
            this.f45261e = mapB;
            this.f45259c = request.i().l();
        }
    }
}
