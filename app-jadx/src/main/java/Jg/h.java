package jg;

import dg.G;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f51908a = new LinkedHashSet();

    public final synchronized void a(G route) {
        AbstractC5504s.h(route, "route");
        this.f51908a.remove(route);
    }

    public final synchronized void b(G failedRoute) {
        AbstractC5504s.h(failedRoute, "failedRoute");
        this.f51908a.add(failedRoute);
    }

    public final synchronized boolean c(G route) {
        AbstractC5504s.h(route, "route");
        return this.f51908a.contains(route);
    }
}
