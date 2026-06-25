package io.sentry.protocol.profiling;

import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.B;
import io.sentry.protocol.profiling.b;
import io.sentry.protocol.profiling.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f51119a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f51120b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f51121c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f51122d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f51123e;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "frames":
                        List listT1 = interfaceC5218j1.T1(iLogger, new B.a());
                        if (listT1 == null) {
                            break;
                        } else {
                            aVar.f51121c = listT1;
                            break;
                        }
                        break;
                    case "stacks":
                        List list = (List) interfaceC5218j1.C0(iLogger, new c());
                        if (list == null) {
                            break;
                        } else {
                            aVar.f51120b = list;
                            break;
                        }
                        break;
                    case "samples":
                        List listT12 = interfaceC5218j1.T1(iLogger, new b.a());
                        if (listT12 == null) {
                            break;
                        } else {
                            aVar.f51119a = listT12;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        Map mapK1 = interfaceC5218j1.k1(iLogger, new c.a());
                        if (mapK1 == null) {
                            break;
                        } else {
                            aVar.f51122d = mapK1;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC5218j1.l1(iLogger, concurrentHashMap, strR0);
                        break;
                }
            }
            aVar.e(concurrentHashMap);
            interfaceC5218j1.I();
            return aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c implements InterfaceC5267r0 {
        private c() {
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            interfaceC5218j1.B();
            while (interfaceC5218j1.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                interfaceC5218j1.B();
                while (interfaceC5218j1.hasNext()) {
                    arrayList2.add(Integer.valueOf(interfaceC5218j1.nextInt()));
                }
                interfaceC5218j1.y();
                arrayList.add(arrayList2);
            }
            interfaceC5218j1.y();
            return arrayList;
        }
    }

    public void e(Map map) {
        this.f51123e = map;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("samples").j(iLogger, this.f51119a);
        interfaceC5223k1.e("stacks").j(iLogger, this.f51120b);
        interfaceC5223k1.e("frames").j(iLogger, this.f51121c);
        interfaceC5223k1.e("thread_metadata").j(iLogger, this.f51122d);
        Map map = this.f51123e;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51123e.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
