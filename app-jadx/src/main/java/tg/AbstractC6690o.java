package tg;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg.P;

/* JADX INFO: renamed from: tg.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC6690o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f61067a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC6690o f61068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P f61069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC6690o f61070d;

    /* JADX INFO: renamed from: tg.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        AbstractC6690o c6698x;
        try {
            Class.forName("java.nio.file.Files");
            c6698x = new J();
        } catch (ClassNotFoundException unused) {
            c6698x = new C6698x();
        }
        f61068b = c6698x;
        P.a aVar = P.f60968b;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC5504s.g(property, "getProperty(...)");
        f61069c = P.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = ug.h.class.getClassLoader();
        AbstractC5504s.g(classLoader, "getClassLoader(...)");
        f61070d = new ug.h(classLoader, false, null, 4, null);
    }

    public final X a(P file) {
        AbstractC5504s.h(file, "file");
        return b(file, false);
    }

    public abstract X b(P p10, boolean z10);

    public abstract void c(P p10, P p11);

    public final void d(P dir) throws IOException {
        AbstractC5504s.h(dir, "dir");
        e(dir, false);
    }

    public final void e(P dir, boolean z10) throws IOException {
        AbstractC5504s.h(dir, "dir");
        ug.c.a(this, dir, z10);
    }

    public final void f(P dir) {
        AbstractC5504s.h(dir, "dir");
        g(dir, false);
    }

    public abstract void g(P p10, boolean z10);

    public final void h(P path) {
        AbstractC5504s.h(path, "path");
        i(path, false);
    }

    public abstract void i(P p10, boolean z10);

    public final boolean j(P path) {
        AbstractC5504s.h(path, "path");
        return ug.c.b(this, path);
    }

    public abstract List k(P p10);

    public final C6689n l(P path) {
        AbstractC5504s.h(path, "path");
        return ug.c.c(this, path);
    }

    public abstract C6689n m(P p10);

    public abstract AbstractC6688m n(P p10);

    public final X o(P file) {
        AbstractC5504s.h(file, "file");
        return p(file, false);
    }

    public abstract X p(P p10, boolean z10);

    public abstract Z q(P p10);
}
