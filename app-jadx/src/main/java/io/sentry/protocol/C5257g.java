package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.C5256f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5257g implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f51052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f51053b;

    /* JADX INFO: renamed from: io.sentry.protocol.g$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5257g a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            List arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("values")) {
                    arrayList = interfaceC5218j1.T1(iLogger, new C5256f.a());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            C5257g c5257g = new C5257g(arrayList);
            c5257g.b(concurrentHashMap);
            interfaceC5218j1.I();
            return c5257g;
        }
    }

    public C5257g(List list) {
        this.f51052a = list;
    }

    public List a() {
        return this.f51052a;
    }

    public void b(Map map) {
        this.f51053b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5257g.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.w.a(this.f51052a, ((C5257g) obj).f51052a);
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51052a);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("values").j(iLogger, this.f51052a);
        Map map = this.f51053b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51053b.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
