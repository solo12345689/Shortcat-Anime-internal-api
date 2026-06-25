package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C5220j3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements B0 {

    /* JADX INFO: renamed from: a */
    private List f50918a;

    /* JADX INFO: renamed from: b */
    private List f50919b;

    /* JADX INFO: renamed from: c */
    private Map f50920c;

    /* JADX INFO: renamed from: d */
    private List f50921d;

    /* JADX INFO: renamed from: e */
    private String f50922e;

    /* JADX INFO: renamed from: f */
    private String f50923f;

    /* JADX INFO: renamed from: g */
    private String f50924g;

    /* JADX INFO: renamed from: h */
    private Integer f50925h;

    /* JADX INFO: renamed from: i */
    private Integer f50926i;

    /* JADX INFO: renamed from: j */
    private String f50927j;

    /* JADX INFO: renamed from: k */
    private String f50928k;

    /* JADX INFO: renamed from: l */
    private Boolean f50929l;

    /* JADX INFO: renamed from: m */
    private String f50930m;

    /* JADX INFO: renamed from: n */
    private Boolean f50931n;

    /* JADX INFO: renamed from: o */
    private String f50932o;

    /* JADX INFO: renamed from: p */
    private String f50933p;

    /* JADX INFO: renamed from: q */
    private String f50934q;

    /* JADX INFO: renamed from: r */
    private String f50935r;

    /* JADX INFO: renamed from: s */
    private String f50936s;

    /* JADX INFO: renamed from: t */
    private String f50937t;

    /* JADX INFO: renamed from: u */
    private Map f50938u;

    /* JADX INFO: renamed from: v */
    private String f50939v;

    /* JADX INFO: renamed from: w */
    private C5220j3 f50940w;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public B a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            B b10 = new B();
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "post_context":
                        b10.f50919b = (List) interfaceC5218j1.N1();
                        break;
                    case "image_addr":
                        b10.f50933p = interfaceC5218j1.i1();
                        break;
                    case "in_app":
                        b10.f50929l = interfaceC5218j1.w0();
                        break;
                    case "raw_function":
                        b10.f50939v = interfaceC5218j1.i1();
                        break;
                    case "lineno":
                        b10.f50925h = interfaceC5218j1.b1();
                        break;
                    case "module":
                        b10.f50924g = interfaceC5218j1.i1();
                        break;
                    case "native":
                        b10.f50931n = interfaceC5218j1.w0();
                        break;
                    case "symbol":
                        b10.f50937t = interfaceC5218j1.i1();
                        break;
                    case "package":
                        b10.f50930m = interfaceC5218j1.i1();
                        break;
                    case "filename":
                        b10.f50922e = interfaceC5218j1.i1();
                        break;
                    case "symbol_addr":
                        b10.f50934q = interfaceC5218j1.i1();
                        break;
                    case "lock":
                        b10.f50940w = (C5220j3) interfaceC5218j1.C0(iLogger, new C5220j3.a());
                        break;
                    case "vars":
                        b10.f50920c = (Map) interfaceC5218j1.N1();
                        break;
                    case "colno":
                        b10.f50926i = interfaceC5218j1.b1();
                        break;
                    case "instruction_addr":
                        b10.f50935r = interfaceC5218j1.i1();
                        break;
                    case "pre_context":
                        b10.f50918a = (List) interfaceC5218j1.N1();
                        break;
                    case "addr_mode":
                        b10.f50936s = interfaceC5218j1.i1();
                        break;
                    case "context_line":
                        b10.f50928k = interfaceC5218j1.i1();
                        break;
                    case "function":
                        b10.f50923f = interfaceC5218j1.i1();
                        break;
                    case "abs_path":
                        b10.f50927j = interfaceC5218j1.i1();
                        break;
                    case "platform":
                        b10.f50932o = interfaceC5218j1.i1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            b10.H(concurrentHashMap);
            interfaceC5218j1.I();
            return b10;
        }
    }

    public void A(String str) {
        this.f50935r = str;
    }

    public void B(Integer num) {
        this.f50925h = num;
    }

    public void C(C5220j3 c5220j3) {
        this.f50940w = c5220j3;
    }

    public void D(String str) {
        this.f50924g = str;
    }

    public void E(Boolean bool) {
        this.f50931n = bool;
    }

    public void F(String str) {
        this.f50930m = str;
    }

    public void G(String str) {
        this.f50932o = str;
    }

    public void H(Map map) {
        this.f50938u = map;
    }

    public boolean equals(Object obj) {
        if (obj != null && B.class == obj.getClass()) {
            B b10 = (B) obj;
            if (Objects.equals(this.f50918a, b10.f50918a) && Objects.equals(this.f50919b, b10.f50919b) && Objects.equals(this.f50920c, b10.f50920c) && Objects.equals(this.f50921d, b10.f50921d) && Objects.equals(this.f50922e, b10.f50922e) && Objects.equals(this.f50923f, b10.f50923f) && Objects.equals(this.f50924g, b10.f50924g) && Objects.equals(this.f50925h, b10.f50925h) && Objects.equals(this.f50926i, b10.f50926i) && Objects.equals(this.f50927j, b10.f50927j) && Objects.equals(this.f50928k, b10.f50928k) && Objects.equals(this.f50929l, b10.f50929l) && Objects.equals(this.f50930m, b10.f50930m) && Objects.equals(this.f50931n, b10.f50931n) && Objects.equals(this.f50932o, b10.f50932o) && Objects.equals(this.f50933p, b10.f50933p) && Objects.equals(this.f50934q, b10.f50934q) && Objects.equals(this.f50935r, b10.f50935r) && Objects.equals(this.f50936s, b10.f50936s) && Objects.equals(this.f50937t, b10.f50937t) && Objects.equals(this.f50938u, b10.f50938u) && Objects.equals(this.f50939v, b10.f50939v) && Objects.equals(this.f50940w, b10.f50940w)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f50918a, this.f50919b, this.f50920c, this.f50921d, this.f50922e, this.f50923f, this.f50924g, this.f50925h, this.f50926i, this.f50927j, this.f50928k, this.f50929l, this.f50930m, this.f50931n, this.f50932o, this.f50933p, this.f50934q, this.f50935r, this.f50936s, this.f50937t, this.f50938u, this.f50939v, this.f50940w);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50922e != null) {
            interfaceC5223k1.e("filename").f(this.f50922e);
        }
        if (this.f50923f != null) {
            interfaceC5223k1.e("function").f(this.f50923f);
        }
        if (this.f50924g != null) {
            interfaceC5223k1.e("module").f(this.f50924g);
        }
        if (this.f50925h != null) {
            interfaceC5223k1.e("lineno").i(this.f50925h);
        }
        if (this.f50926i != null) {
            interfaceC5223k1.e("colno").i(this.f50926i);
        }
        if (this.f50927j != null) {
            interfaceC5223k1.e("abs_path").f(this.f50927j);
        }
        if (this.f50928k != null) {
            interfaceC5223k1.e("context_line").f(this.f50928k);
        }
        if (this.f50929l != null) {
            interfaceC5223k1.e("in_app").k(this.f50929l);
        }
        if (this.f50930m != null) {
            interfaceC5223k1.e("package").f(this.f50930m);
        }
        if (this.f50931n != null) {
            interfaceC5223k1.e("native").k(this.f50931n);
        }
        if (this.f50932o != null) {
            interfaceC5223k1.e("platform").f(this.f50932o);
        }
        if (this.f50933p != null) {
            interfaceC5223k1.e("image_addr").f(this.f50933p);
        }
        if (this.f50934q != null) {
            interfaceC5223k1.e("symbol_addr").f(this.f50934q);
        }
        if (this.f50935r != null) {
            interfaceC5223k1.e("instruction_addr").f(this.f50935r);
        }
        if (this.f50936s != null) {
            interfaceC5223k1.e("addr_mode").f(this.f50936s);
        }
        if (this.f50939v != null) {
            interfaceC5223k1.e("raw_function").f(this.f50939v);
        }
        if (this.f50937t != null) {
            interfaceC5223k1.e("symbol").f(this.f50937t);
        }
        if (this.f50940w != null) {
            interfaceC5223k1.e("lock").j(iLogger, this.f50940w);
        }
        List list = this.f50918a;
        if (list != null && !list.isEmpty()) {
            interfaceC5223k1.e("pre_context").j(iLogger, this.f50918a);
        }
        List list2 = this.f50919b;
        if (list2 != null && !list2.isEmpty()) {
            interfaceC5223k1.e("post_context").j(iLogger, this.f50919b);
        }
        Map map = this.f50920c;
        if (map != null && !map.isEmpty()) {
            interfaceC5223k1.e("vars").j(iLogger, this.f50920c);
        }
        Map map2 = this.f50938u;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.f50938u.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public String v() {
        return this.f50924g;
    }

    public void w(String str) {
        this.f50936s = str;
    }

    public void x(String str) {
        this.f50922e = str;
    }

    public void y(String str) {
        this.f50923f = str;
    }

    public void z(Boolean bool) {
        this.f50929l = bool;
    }
}
