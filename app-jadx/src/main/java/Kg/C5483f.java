package kg;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: kg.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C5483f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5483f f52206a = new C5483f();

    private C5483f() {
    }

    public static final boolean b(String method) {
        AbstractC5504s.h(method, "method");
        return (AbstractC5504s.c(method, "GET") || AbstractC5504s.c(method, "HEAD")) ? false : true;
    }

    public static final boolean e(String method) {
        AbstractC5504s.h(method, "method");
        return AbstractC5504s.c(method, "POST") || AbstractC5504s.c(method, "PUT") || AbstractC5504s.c(method, "PATCH") || AbstractC5504s.c(method, "PROPPATCH") || AbstractC5504s.c(method, "REPORT");
    }

    public final boolean a(String method) {
        AbstractC5504s.h(method, "method");
        return AbstractC5504s.c(method, "POST") || AbstractC5504s.c(method, "PATCH") || AbstractC5504s.c(method, "PUT") || AbstractC5504s.c(method, "DELETE") || AbstractC5504s.c(method, "MOVE");
    }

    public final boolean c(String method) {
        AbstractC5504s.h(method, "method");
        return !AbstractC5504s.c(method, "PROPFIND");
    }

    public final boolean d(String method) {
        AbstractC5504s.h(method, "method");
        return AbstractC5504s.c(method, "PROPFIND");
    }
}
