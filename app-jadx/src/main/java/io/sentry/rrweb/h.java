package io.sentry.rrweb;

import io.sentry.B0;
import io.sentry.B3;
import io.sentry.C5322z3;
import io.sentry.ILogger;
import io.sentry.InterfaceC5223k1;
import io.sentry.S1;
import io.sentry.protocol.r;
import io.sentry.rrweb.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends b implements B0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f51303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f51304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f51305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f51306f;

    public h() {
        super(c.Custom);
        this.f51304d = new HashMap();
        this.f51303c = "options";
    }

    private void g(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        interfaceC5223k1.e("tag").f(this.f51303c);
        interfaceC5223k1.e("payload");
        h(interfaceC5223k1, iLogger);
        Map map = this.f51306f;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51306f.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    private void h(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        Map map = this.f51304d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51304d.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    @Override // io.sentry.B0
    public void serialize(InterfaceC5223k1 interfaceC5223k1, ILogger iLogger) {
        interfaceC5223k1.x();
        new b.C0804b().a(this, interfaceC5223k1, iLogger);
        interfaceC5223k1.e("data");
        g(interfaceC5223k1, iLogger);
        Map map = this.f51305e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f51305e.get(str);
                interfaceC5223k1.e(str);
                interfaceC5223k1.j(iLogger, obj);
            }
        }
        interfaceC5223k1.I();
    }

    public h(C5322z3 c5322z3) {
        String str;
        this();
        r sdkVersion = c5322z3.getSdkVersion();
        if (sdkVersion != null) {
            this.f51304d.put("nativeSdkName", sdkVersion.f());
            this.f51304d.put("nativeSdkVersion", sdkVersion.h());
        }
        B3 sessionReplay = c5322z3.getSessionReplay();
        this.f51304d.put("errorSampleRate", sessionReplay.l());
        this.f51304d.put("sessionSampleRate", sessionReplay.q());
        this.f51304d.put("maskAllImages", Boolean.valueOf(sessionReplay.e().contains("android.widget.ImageView")));
        this.f51304d.put("maskAllText", Boolean.valueOf(sessionReplay.e().contains("android.widget.TextView")));
        this.f51304d.put("quality", sessionReplay.m().serializedName());
        this.f51304d.put("maskedViewClasses", sessionReplay.e());
        this.f51304d.put("unmaskedViewClasses", sessionReplay.s());
        if (sessionReplay.n() == S1.PIXEL_COPY) {
            str = "pixelCopy";
        } else {
            str = "canvas";
        }
        this.f51304d.put("screenshotStrategy", str);
        this.f51304d.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.g().isEmpty()));
        if (sessionReplay.g().isEmpty()) {
            return;
        }
        this.f51304d.put("networkDetailAllowUrls", sessionReplay.g());
        this.f51304d.put("networkRequestHeaders", sessionReplay.j());
        this.f51304d.put("networkResponseHeaders", sessionReplay.k());
        this.f51304d.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.v()));
        if (sessionReplay.h().isEmpty()) {
            return;
        }
        this.f51304d.put("networkDetailDenyUrls", sessionReplay.h());
    }
}
