package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.util.AbstractC5290c;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class F implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String[] f50965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f50966b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public F a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            F f10 = new F();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("active_profiles")) {
                    List list = (List) interfaceC5218j1.N1();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        f10.f50965a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                }
            }
            f10.b(concurrentHashMap);
            interfaceC5218j1.I();
            return f10;
        }
    }

    public F() {
    }

    public void b(Map map) {
        this.f50966b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f50965a, ((F) obj).f50965a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f50965a);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f50965a != null) {
            interfaceC5223k1.e("active_profiles").j(iLogger, this.f50965a);
        }
        Map map = this.f50966b;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50966b.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public F(F f10) {
        this.f50965a = f10.f50965a;
        this.f50966b = AbstractC5290c.b(f10.f50966b);
    }
}
