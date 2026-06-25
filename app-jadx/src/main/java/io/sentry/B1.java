package io.sentry;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final URL f49057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f49058b;

    public B1(String str, Map map) {
        io.sentry.util.w.c(str, "url is required");
        io.sentry.util.w.c(map, "headers is required");
        try {
            this.f49057a = URI.create(str).toURL();
            this.f49058b = map;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e10);
        }
    }

    public Map a() {
        return this.f49058b;
    }

    public URL b() {
        return this.f49057a;
    }
}
