package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.C5322z3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.d */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5254d implements B0 {

    /* JADX INFO: renamed from: a */
    private q f51011a;

    /* JADX INFO: renamed from: b */
    private List f51012b;

    /* JADX INFO: renamed from: c */
    private Map f51013c;

    /* JADX INFO: renamed from: io.sentry.protocol.d$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5254d a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            C5254d c5254d = new C5254d();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("images")) {
                    c5254d.f51012b = interfaceC5218j1.T1(iLogger, new DebugImage.a());
                } else if (strR0.equals("sdk_info")) {
                    c5254d.f51011a = (q) interfaceC5218j1.C0(iLogger, new q.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            c5254d.f(map);
            return c5254d;
        }
    }

    public static C5254d c(C5254d c5254d, C5322z3 c5322z3) {
        ArrayList arrayList = new ArrayList();
        if (c5322z3.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(c5322z3.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : c5322z3.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (c5254d == null) {
            c5254d = new C5254d();
        }
        if (c5254d.d() == null) {
            c5254d.e(arrayList);
            return c5254d;
        }
        c5254d.d().addAll(arrayList);
        return c5254d;
    }

    public List d() {
        return this.f51012b;
    }

    public void e(List list) {
        this.f51012b = list != null ? new ArrayList(list) : null;
    }

    public void f(Map map) {
        this.f51013c = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f51011a != null) {
            interfaceC5223k1.e("sdk_info").j(iLogger, this.f51011a);
        }
        if (this.f51012b != null) {
            interfaceC5223k1.e("images").j(iLogger, this.f51012b);
        }
        Map map = this.f51013c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51013c.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
