package io.sentry.rrweb;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.sentry.B0;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends d implements B0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f51281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f51282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f51283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f51284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f51285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f51287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f51288k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        private void c(e eVar, InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            d.a aVar = new d.a();
            interfaceC5218j1.x();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "x":
                        eVar.f51283f = interfaceC5218j1.nextFloat();
                        break;
                    case "y":
                        eVar.f51284g = interfaceC5218j1.nextFloat();
                        break;
                    case "id":
                        eVar.f51282e = interfaceC5218j1.nextInt();
                        break;
                    case "type":
                        eVar.f51281d = (b) interfaceC5218j1.C0(iLogger, new b.a());
                        break;
                    case "pointerType":
                        eVar.f51285h = interfaceC5218j1.nextInt();
                        break;
                    case "pointerId":
                        eVar.f51286i = interfaceC5218j1.nextInt();
                        break;
                    default:
                        if (!aVar.a(eVar, strR0, interfaceC5218j1, iLogger)) {
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
            eVar.p(map);
            interfaceC5218j1.I();
        }

        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            interfaceC5218j1.x();
            e eVar = new e();
            b.a aVar = new b.a();
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                if (strR0.equals("data")) {
                    c(eVar, interfaceC5218j1, iLogger);
                } else if (!aVar.a(eVar, strR0, interfaceC5218j1, iLogger)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    interfaceC5218j1.l1(iLogger, map, strR0);
                }
            }
            eVar.t(map);
            interfaceC5218j1.I();
            return eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b implements B0 {
        MouseUp,
        MouseDown,
        Click,
        ContextMenu,
        DblClick,
        Focus,
        Blur,
        TouchStart,
        TouchMove_Departed,
        TouchEnd,
        TouchCancel;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a implements InterfaceC5267r0 {
            @Override // io.sentry.InterfaceC5267r0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
                return b.values()[interfaceC5218j1.nextInt()];
            }
        }

        @Override // io.sentry.B0
        public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
            interfaceC5223k1.a(ordinal());
        }
    }

    public e() {
        super(d.b.MouseInteraction);
        this.f51285h = 2;
    }

    private void o(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new d.c().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("type").j(iLogger, this.f51281d);
        interfaceC5223k1.e(DiagnosticsEntry.ID_KEY).a(this.f51282e);
        interfaceC5223k1.e("x").c(this.f51283f);
        interfaceC5223k1.e("y").c(this.f51284g);
        interfaceC5223k1.e("pointerType").a(this.f51285h);
        interfaceC5223k1.e("pointerId").a(this.f51286i);
        Map map = this.f51288k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51288k.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void p(Map map) {
        this.f51288k = map;
    }

    public void q(int i10) {
        this.f51282e = i10;
    }

    public void r(b bVar) {
        this.f51281d = bVar;
    }

    public void s(int i10) {
        this.f51286i = i10;
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        o(interfaceC5223k1, iLogger);
        Map map = this.f51287j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51287j.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public void t(Map map) {
        this.f51287j = map;
    }

    public void u(float f10) {
        this.f51283f = f10;
    }

    public void v(float f10) {
        this.f51284g = f10;
    }
}
