package io.sentry.profilemeasurements;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.profilemeasurements.b;
import io.sentry.util.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f50898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Collection f50900c;

    /* JADX INFO: renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0799a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("values")) {
                    List listT1 = interfaceC5218j1.T1(iLogger, new b.a());
                    if (listT1 != null) {
                        aVar.f50900c = listT1;
                    }
                } else if (strR0.equals("unit")) {
                    String strI1 = interfaceC5218j1.i1();
                    if (strI1 != null) {
                        aVar.f50899b = strI1;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            aVar.c(concurrentHashMap);
            interfaceC5218j1.I();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public void c(Map map) {
        this.f50898a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (w.a(this.f50898a, aVar.f50898a) && this.f50899b.equals(aVar.f50899b) && new ArrayList(this.f50900c).equals(new ArrayList(aVar.f50900c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return w.b(this.f50898a, this.f50899b, this.f50900c);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("unit").j(iLogger, this.f50899b);
        interfaceC5223k1.e("values").j(iLogger, this.f50900c);
        Map map = this.f50898a;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50898a.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public a(String str, Collection collection) {
        this.f50899b = str;
        this.f50900c = collection;
    }
}
