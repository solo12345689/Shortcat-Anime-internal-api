package io.sentry.util;

import io.sentry.ILogger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface a {
        void accept(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a(Object obj, Class cls);
    }

    public static io.sentry.H c(Object obj) {
        io.sentry.H h10 = new io.sentry.H();
        m(h10, obj);
        return h10;
    }

    public static io.sentry.hints.h d(io.sentry.H h10) {
        return (io.sentry.hints.h) h10.d("sentry:eventDropReason", io.sentry.hints.h.class);
    }

    public static Object e(io.sentry.H h10) {
        return h10.c("sentry:typeCheckHint");
    }

    public static boolean f(io.sentry.H h10, Class cls) {
        return cls.isInstance(e(h10));
    }

    public static boolean g(io.sentry.H h10) {
        return Boolean.TRUE.equals(h10.d("sentry:isFromHybridSdk", Boolean.class));
    }

    public static void h(io.sentry.H h10, Class cls, a aVar) {
        i(h10, cls, aVar, new b() { // from class: io.sentry.util.j
            @Override // io.sentry.util.l.b
            public final void a(Object obj, Class cls2) {
                l.b(obj, cls2);
            }
        });
    }

    public static void i(io.sentry.H h10, Class cls, a aVar, b bVar) {
        Object objE = e(h10);
        if (!f(h10, cls) || objE == null) {
            bVar.a(objE, cls);
        } else {
            aVar.accept(objE);
        }
    }

    public static void j(io.sentry.H h10, Class cls, final ILogger iLogger, a aVar) {
        i(h10, cls, aVar, new b() { // from class: io.sentry.util.k
            @Override // io.sentry.util.l.b
            public final void a(Object obj, Class cls2) {
                t.a(cls2, obj, iLogger);
            }
        });
    }

    public static void k(io.sentry.H h10, io.sentry.hints.h hVar) {
        h10.k("sentry:eventDropReason", hVar);
    }

    public static void l(io.sentry.H h10, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            h10.k("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    public static void m(io.sentry.H h10, Object obj) {
        h10.k("sentry:typeCheckHint", obj);
    }

    public static boolean n(io.sentry.H h10) {
        return !(f(h10, io.sentry.hints.e.class) || f(h10, io.sentry.hints.c.class)) || f(h10, io.sentry.hints.b.class);
    }

    public static /* synthetic */ void b(Object obj, Class cls) {
    }
}
