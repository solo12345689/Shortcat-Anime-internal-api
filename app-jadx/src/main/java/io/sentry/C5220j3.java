package io.sentry;

import io.sentry.util.AbstractC5290c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.j3 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5220j3 implements B0 {

    /* JADX INFO: renamed from: a */
    private int f50786a;

    /* JADX INFO: renamed from: b */
    private String f50787b;

    /* JADX INFO: renamed from: c */
    private String f50788c;

    /* JADX INFO: renamed from: d */
    private String f50789d;

    /* JADX INFO: renamed from: e */
    private Long f50790e;

    /* JADX INFO: renamed from: f */
    private Map f50791f;

    /* JADX INFO: renamed from: io.sentry.j3$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5220j3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            C5220j3 c5220j3 = new C5220j3();
            interfaceC5218j1.x();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "package_name":
                        c5220j3.f50788c = interfaceC5218j1.i1();
                        break;
                    case "thread_id":
                        c5220j3.f50790e = interfaceC5218j1.d1();
                        break;
                    case "address":
                        c5220j3.f50787b = interfaceC5218j1.i1();
                        break;
                    case "class_name":
                        c5220j3.f50789d = interfaceC5218j1.i1();
                        break;
                    case "type":
                        c5220j3.f50786a = interfaceC5218j1.nextInt();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            c5220j3.m(concurrentHashMap);
            interfaceC5218j1.I();
            return c5220j3;
        }
    }

    public C5220j3() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5220j3.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f50787b, ((C5220j3) obj).f50787b);
    }

    public String f() {
        return this.f50787b;
    }

    public int g() {
        return this.f50786a;
    }

    public void h(String str) {
        this.f50787b = str;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f50787b);
    }

    public void i(String str) {
        this.f50789d = str;
    }

    public void j(String str) {
        this.f50788c = str;
    }

    public void k(Long l10) {
        this.f50790e = l10;
    }

    public void l(int i10) {
        this.f50786a = i10;
    }

    public void m(Map map) {
        this.f50791f = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("type").a(this.f50786a);
        if (this.f50787b != null) {
            interfaceC5223k1.e("address").f(this.f50787b);
        }
        if (this.f50788c != null) {
            interfaceC5223k1.e("package_name").f(this.f50788c);
        }
        if (this.f50789d != null) {
            interfaceC5223k1.e("class_name").f(this.f50789d);
        }
        if (this.f50790e != null) {
            interfaceC5223k1.e("thread_id").i(this.f50790e);
        }
        Map map = this.f50791f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50791f.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public C5220j3(C5220j3 c5220j3) {
        this.f50786a = c5220j3.f50786a;
        this.f50787b = c5220j3.f50787b;
        this.f50788c = c5220j3.f50788c;
        this.f50789d = c5220j3.f50789d;
        this.f50790e = c5220j3.f50790e;
        this.f50791f = AbstractC5290c.b(c5220j3.f50791f);
    }
}
