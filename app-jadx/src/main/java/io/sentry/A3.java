package io.sentry;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.AbstractC5219j2;
import io.sentry.protocol.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class A3 extends AbstractC5219j2 implements B0 {

    /* JADX INFO: renamed from: p */
    private File f49043p;

    /* JADX INFO: renamed from: t */
    private int f49047t;

    /* JADX INFO: renamed from: v */
    private Date f49049v;

    /* JADX INFO: renamed from: z */
    private Map f49053z;

    /* JADX INFO: renamed from: s */
    private io.sentry.protocol.x f49046s = new io.sentry.protocol.x();

    /* JADX INFO: renamed from: q */
    private String f49044q = "replay_event";

    /* JADX INFO: renamed from: r */
    private b f49045r = b.SESSION;

    /* JADX INFO: renamed from: x */
    private List f49051x = new ArrayList();

    /* JADX INFO: renamed from: y */
    private List f49052y = new ArrayList();

    /* JADX INFO: renamed from: w */
    private List f49050w = new ArrayList();

    /* JADX INFO: renamed from: u */
    private Date f49048u = AbstractC5226l.d();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public A3 a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            AbstractC5219j2.a aVar = new AbstractC5219j2.a();
            A3 a32 = new A3();
            interfaceC5218j1.x();
            String strI1 = null;
            b bVar = null;
            Integer numB1 = null;
            Date dateU0 = null;
            HashMap map = null;
            io.sentry.protocol.x xVar = null;
            Date dateU02 = null;
            List list = null;
            List list2 = null;
            List list3 = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "replay_id":
                        xVar = (io.sentry.protocol.x) interfaceC5218j1.C0(iLogger, new x.a());
                        break;
                    case "replay_start_timestamp":
                        dateU02 = interfaceC5218j1.u0(iLogger);
                        break;
                    case "type":
                        strI1 = interfaceC5218j1.i1();
                        break;
                    case "urls":
                        list = (List) interfaceC5218j1.N1();
                        break;
                    case "timestamp":
                        dateU0 = interfaceC5218j1.u0(iLogger);
                        break;
                    case "error_ids":
                        list2 = (List) interfaceC5218j1.N1();
                        break;
                    case "trace_ids":
                        list3 = (List) interfaceC5218j1.N1();
                        break;
                    case "replay_type":
                        bVar = (b) interfaceC5218j1.C0(iLogger, new b.a());
                        break;
                    case "segment_id":
                        numB1 = interfaceC5218j1.b1();
                        break;
                    default:
                        if (!aVar.a(a32, strR0, interfaceC5218j1, iLogger)) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            interfaceC5218j1.l1(iLogger, map, strR0);
                            break;
                        } else {
                            break;
                        }
                        break;
                }
            }
            interfaceC5218j1.I();
            if (strI1 != null) {
                a32.p0(strI1);
            }
            if (bVar != null) {
                a32.l0(bVar);
            }
            if (numB1 != null) {
                a32.m0(numB1.intValue());
            }
            if (dateU0 != null) {
                a32.n0(dateU0);
            }
            a32.j0(xVar);
            a32.k0(dateU02);
            a32.r0(list);
            a32.i0(list2);
            a32.o0(list3);
            a32.q0(map);
            return a32;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements B0 {
        SESSION,
        BUFFER;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5267r0 {
            @Override // io.sentry.InterfaceC5267r0
            /* JADX INFO: renamed from: b */
            public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
                return b.valueOf(interfaceC5218j1.X0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.f(name().toLowerCase(Locale.ROOT));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A3.class == obj.getClass()) {
            A3 a32 = (A3) obj;
            if (this.f49047t == a32.f49047t && io.sentry.util.w.a(this.f49044q, a32.f49044q) && this.f49045r == a32.f49045r && io.sentry.util.w.a(this.f49046s, a32.f49046s) && io.sentry.util.w.a(this.f49050w, a32.f49050w) && io.sentry.util.w.a(this.f49051x, a32.f49051x) && io.sentry.util.w.a(this.f49052y, a32.f49052y)) {
                return true;
            }
        }
        return false;
    }

    public Date g0() {
        return this.f49048u;
    }

    public File h0() {
        return this.f49043p;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f49044q, this.f49045r, this.f49046s, Integer.valueOf(this.f49047t), this.f49050w, this.f49051x, this.f49052y);
    }

    public void i0(List list) {
        this.f49051x = list;
    }

    public void j0(io.sentry.protocol.x xVar) {
        this.f49046s = xVar;
    }

    public void k0(Date date) {
        this.f49049v = date;
    }

    public void l0(b bVar) {
        this.f49045r = bVar;
    }

    public void m0(int i10) {
        this.f49047t = i10;
    }

    public void n0(Date date) {
        this.f49048u = date;
    }

    public void o0(List list) {
        this.f49052y = list;
    }

    public void p0(String str) {
        this.f49044q = str;
    }

    public void q0(Map map) {
        this.f49053z = map;
    }

    public void r0(List list) {
        this.f49050w = list;
    }

    public void s0(File file) {
        this.f49043p = file;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("type").f(this.f49044q);
        interfaceC5223k1.e("replay_type").j(iLogger, this.f49045r);
        interfaceC5223k1.e("segment_id").a(this.f49047t);
        interfaceC5223k1.e(DiagnosticsEntry.TIMESTAMP_KEY).j(iLogger, this.f49048u);
        if (this.f49046s != null) {
            interfaceC5223k1.e("replay_id").j(iLogger, this.f49046s);
        }
        if (this.f49049v != null) {
            interfaceC5223k1.e("replay_start_timestamp").j(iLogger, this.f49049v);
        }
        if (this.f49050w != null) {
            interfaceC5223k1.e("urls").j(iLogger, this.f49050w);
        }
        if (this.f49051x != null) {
            interfaceC5223k1.e("error_ids").j(iLogger, this.f49051x);
        }
        if (this.f49052y != null) {
            interfaceC5223k1.e("trace_ids").j(iLogger, this.f49052y);
        }
        new AbstractC5219j2.b().a(this, interfaceC5223k1, iLogger);
        Map map = this.f49053z;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f49053z.get(str));
            }
        }
        interfaceC5223k1.I();
    }
}
