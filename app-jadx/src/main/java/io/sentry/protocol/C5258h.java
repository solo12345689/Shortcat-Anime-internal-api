package io.sentry.protocol;

import io.sentry.B0;
import io.sentry.EnumC5215i3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5218j1;
import io.sentry.InterfaceC5223k1;
import io.sentry.InterfaceC5267r0;
import io.sentry.protocol.x;
import io.sentry.util.AbstractC5290c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.protocol.h */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5258h implements B0 {

    /* JADX INFO: renamed from: a */
    private String f51054a;

    /* JADX INFO: renamed from: b */
    private String f51055b;

    /* JADX INFO: renamed from: c */
    private String f51056c;

    /* JADX INFO: renamed from: d */
    private x f51057d;

    /* JADX INFO: renamed from: e */
    private x f51058e;

    /* JADX INFO: renamed from: f */
    private String f51059f;

    /* JADX INFO: renamed from: g */
    private Map f51060g;

    /* JADX INFO: renamed from: io.sentry.protocol.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC5267r0 {
        @Override // io.sentry.InterfaceC5267r0
        /* JADX INFO: renamed from: b */
        public C5258h a(InterfaceC5218j1 interfaceC5218j1, ILogger iLogger) {
            String strR0;
            interfaceC5218j1.x();
            String strI1 = null;
            String strI12 = null;
            String strI13 = null;
            x xVarA = null;
            x xVarA2 = null;
            String strI14 = null;
            HashMap map = null;
            while (interfaceC5218j1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strR0 = interfaceC5218j1.r0();
                strR0.getClass();
                switch (strR0) {
                    case "associated_event_id":
                        xVarA = new x.a().a(interfaceC5218j1, iLogger);
                        break;
                    case "replay_id":
                        xVarA2 = new x.a().a(interfaceC5218j1, iLogger);
                        break;
                    case "url":
                        strI14 = interfaceC5218j1.i1();
                        break;
                    case "name":
                        strI13 = interfaceC5218j1.i1();
                        break;
                    case "contact_email":
                        strI12 = interfaceC5218j1.i1();
                        break;
                    case "message":
                        strI1 = interfaceC5218j1.i1();
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
            if (strI1 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                iLogger.b(EnumC5215i3.ERROR, "Missing required field \"message\"", illegalStateException);
                throw illegalStateException;
            }
            C5258h c5258h = new C5258h(strI1);
            c5258h.f51055b = strI12;
            c5258h.f51056c = strI13;
            c5258h.f51057d = xVarA;
            c5258h.f51058e = xVarA2;
            c5258h.f51059f = strI14;
            c5258h.f51060g = map;
            return c5258h;
        }
    }

    public C5258h(String str) {
        g(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5258h)) {
            return false;
        }
        C5258h c5258h = (C5258h) obj;
        return io.sentry.util.w.a(this.f51054a, c5258h.f51054a) && io.sentry.util.w.a(this.f51055b, c5258h.f51055b) && io.sentry.util.w.a(this.f51056c, c5258h.f51056c) && io.sentry.util.w.a(this.f51057d, c5258h.f51057d) && io.sentry.util.w.a(this.f51058e, c5258h.f51058e) && io.sentry.util.w.a(this.f51059f, c5258h.f51059f) && io.sentry.util.w.a(this.f51060g, c5258h.f51060g);
    }

    public void g(String str) {
        if (str.length() > 4096) {
            this.f51054a = str.substring(0, 4096);
        } else {
            this.f51054a = str;
        }
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f51054a, this.f51055b, this.f51056c, this.f51057d, this.f51058e, this.f51059f, this.f51060g);
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("message").f(this.f51054a);
        if (this.f51055b != null) {
            interfaceC5223k1.e("contact_email").f(this.f51055b);
        }
        if (this.f51056c != null) {
            interfaceC5223k1.e("name").f(this.f51056c);
        }
        if (this.f51057d != null) {
            interfaceC5223k1.e("associated_event_id");
            this.f51057d.serialize(interfaceC5223k1, iLogger);
        }
        if (this.f51058e != null) {
            interfaceC5223k1.e("replay_id");
            this.f51058e.serialize(interfaceC5223k1, iLogger);
        }
        if (this.f51059f != null) {
            interfaceC5223k1.e("url").f(this.f51059f);
        }
        Map map = this.f51060g;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC5223k1.e(str).j(iLogger, this.f51060g.get(str));
            }
        }
        interfaceC5223k1.I();
    }

    public String toString() {
        return "Feedback{message='" + this.f51054a + "', contactEmail='" + this.f51055b + "', name='" + this.f51056c + "', associatedEventId=" + this.f51057d + ", replayId=" + this.f51058e + ", url='" + this.f51059f + "', unknown=" + this.f51060g + '}';
    }

    public C5258h(C5258h c5258h) {
        this.f51054a = c5258h.f51054a;
        this.f51055b = c5258h.f51055b;
        this.f51056c = c5258h.f51056c;
        this.f51057d = c5258h.f51057d;
        this.f51058e = c5258h.f51058e;
        this.f51059f = c5258h.f51059f;
        this.f51060g = AbstractC5290c.b(c5258h.f51060g);
    }
}
