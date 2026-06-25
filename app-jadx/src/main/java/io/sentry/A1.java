package io.sentry;

import io.sentry.rrweb.a;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class A1 implements B0 {

    /* JADX INFO: renamed from: a */
    private Integer f49037a;

    /* JADX INFO: renamed from: b */
    private List f49038b;

    /* JADX INFO: renamed from: c */
    private Map f49039c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f49040a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f49041b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f49041b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49041b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49041b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f49040a = iArr2;
            try {
                iArr2[d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49040a[d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public A1 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            A1 a12 = new A1();
            interfaceC5218j1.x();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numB1 = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("segment_id")) {
                    numB1 = interfaceC5218j1.b1();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            interfaceC5218j1.I();
            interfaceC5218j1.F(true);
            List list = (List) interfaceC5218j1.N1();
            interfaceC5218j1.F(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.u uVar = new io.sentry.util.u(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i10 = a.f49041b[cVar.ordinal()];
                                if (i10 == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        d.b bVar = d.b.values()[num.intValue()];
                                        int i11 = a.f49040a[bVar.ordinal()];
                                        if (i11 == 1) {
                                            arrayList.add(new e.a().a(uVar, iLogger));
                                        } else if (i11 != 2) {
                                            iLogger.c(EnumC5215i3.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(new f.a().a(uVar, iLogger));
                                        }
                                    }
                                } else if (i10 == 2) {
                                    arrayList.add(new g.a().a(uVar, iLogger));
                                } else if (i10 != 3) {
                                    iLogger.c(EnumC5215i3.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new i.a().a(uVar, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(new j.a().a(uVar, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new a.C0803a().a(uVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(EnumC5215i3.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a12.c(numB1);
            a12.b(arrayList);
            a12.d(map);
            return a12;
        }
    }

    public List a() {
        return this.f49038b;
    }

    public void b(List list) {
        this.f49038b = list;
    }

    public void c(Integer num) {
        this.f49037a = num;
    }

    public void d(Map map) {
        this.f49039c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A1.class == obj.getClass()) {
            A1 a12 = (A1) obj;
            if (io.sentry.util.w.a(this.f49037a, a12.f49037a) && io.sentry.util.w.a(this.f49038b, a12.f49038b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f49037a, this.f49038b);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        if (this.f49037a != null) {
            interfaceC5223k1.e("segment_id").i(this.f49037a);
        }
        Map map = this.f49039c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f49039c.get(str));
            }
        }
        interfaceC5223k1.I();
        interfaceC5223k1.F(true);
        if (this.f49037a != null) {
            interfaceC5223k1.g("\n");
        }
        List list = this.f49038b;
        if (list != null) {
            interfaceC5223k1.j(iLogger, list);
        }
        interfaceC5223k1.F(false);
    }
}
