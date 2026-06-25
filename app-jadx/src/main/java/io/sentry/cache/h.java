package io.sentry.cache;

import io.sentry.C5322z3;
import io.sentry.InterfaceC5267r0;
import io.sentry.T;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5322z3 f50557a;

    public h(C5322z3 c5322z3) {
        this.f50557a = c5322z3;
    }

    private void a(String str) {
        d.a(this.f50557a, ".options-cache", str);
    }

    public static Object b(C5322z3 c5322z3, String str, Class cls) {
        return c(c5322z3, str, cls, null);
    }

    public static Object c(C5322z3 c5322z3, String str, Class cls, InterfaceC5267r0 interfaceC5267r0) {
        return d.c(c5322z3, ".options-cache", str, cls, interfaceC5267r0);
    }

    private void d(Object obj, String str) {
        d.d(this.f50557a, obj, ".options-cache", str);
    }

    @Override // io.sentry.T
    public void e(Map map) {
        d(map, "tags.json");
    }

    @Override // io.sentry.T
    public void f(String str) {
        if (str == null) {
            a("dist.json");
        } else {
            d(str, "dist.json");
        }
    }

    @Override // io.sentry.T
    public void g(Double d10) {
        if (d10 == null) {
            a("replay-error-sample-rate.json");
        } else {
            d(d10.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.T
    public void h(String str) {
        if (str == null) {
            a("environment.json");
        } else {
            d(str, "environment.json");
        }
    }

    @Override // io.sentry.T
    public void i(String str) {
        if (str == null) {
            a("proguard-uuid.json");
        } else {
            d(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.T
    public void j(io.sentry.protocol.r rVar) {
        if (rVar == null) {
            a("sdk-version.json");
        } else {
            d(rVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.T
    public void k(String str) {
        if (str == null) {
            a("release.json");
        } else {
            d(str, "release.json");
        }
    }
}
