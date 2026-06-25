package io.sentry.protocol;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.C5205g3;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements B0 {

    /* JADX INFO: renamed from: a */
    private String f51136a;

    /* JADX INFO: renamed from: b */
    private String f51137b;

    /* JADX INFO: renamed from: c */
    private Set f51138c;

    /* JADX INFO: renamed from: d */
    private Set f51139d;

    /* JADX INFO: renamed from: e */
    private Map f51140e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public r a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            interfaceC5218j1.x();
            String strX0 = null;
            String strX02 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "name":
                        strX0 = interfaceC5218j1.X0();
                        break;
                    case "version":
                        strX02 = interfaceC5218j1.X0();
                        break;
                    case "packages":
                        List listT1 = interfaceC5218j1.T1(iLogger, new y.a());
                        if (listT1 == null) {
                            break;
                        } else {
                            arrayList.addAll(listT1);
                            break;
                        }
                        break;
                    case "integrations":
                        List list = (List) interfaceC5218j1.N1();
                        if (list == null) {
                            break;
                        } else {
                            arrayList2.addAll(list);
                            break;
                        }
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
            if (strX0 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"name\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"name\"", illegalStateException);
                throw illegalStateException;
            }
            if (strX02 == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"version\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"version\"", illegalStateException2);
                throw illegalStateException2;
            }
            r rVar = new r(strX0, strX02);
            rVar.f51138c = new CopyOnWriteArraySet(arrayList);
            rVar.f51139d = new CopyOnWriteArraySet(arrayList2);
            rVar.j(map);
            return rVar;
        }
    }

    public r(String str, String str2) {
        this.f51136a = (String) io.sentry.util.w.c(str, "name is required.");
        this.f51137b = (String) io.sentry.util.w.c(str2, "version is required.");
    }

    public static r l(r rVar, String str, String str2) {
        io.sentry.util.w.c(str, "name is required.");
        io.sentry.util.w.c(str2, "version is required.");
        if (rVar == null) {
            return new r(str, str2);
        }
        rVar.i(str);
        rVar.k(str2);
        return rVar;
    }

    public void c(String str) {
        C5205g3.d().a(str);
    }

    public void d(String str, String str2) {
        C5205g3.d().b(str, str2);
    }

    public Set e() {
        Set set = this.f51139d;
        return set != null ? set : C5205g3.d().e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f51136a.equals(rVar.f51136a) && this.f51137b.equals(rVar.f51137b)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f51136a;
    }

    public Set g() {
        Set set = this.f51138c;
        return set != null ? set : C5205g3.d().f();
    }

    public String h() {
        return this.f51137b;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51136a, this.f51137b);
    }

    public void i(String str) {
        this.f51136a = (String) io.sentry.util.w.c(str, "name is required.");
    }

    public void j(Map map) {
        this.f51140e = map;
    }

    public void k(String str) {
        this.f51137b = (String) io.sentry.util.w.c(str, "version is required.");
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("name").f(this.f51136a);
        interfaceC5223k1.e(DiagnosticsEntry.VERSION_KEY).f(this.f51137b);
        Set setG = g();
        Set setE = e();
        if (!setG.isEmpty()) {
            interfaceC5223k1.e("packages").j(iLogger, setG);
        }
        if (!setE.isEmpty()) {
            interfaceC5223k1.e("integrations").j(iLogger, setE);
        }
        Map map = this.f51140e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51140e.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
