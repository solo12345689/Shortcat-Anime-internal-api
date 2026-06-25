package Z3;

import h4.C4903a;
import ie.InterfaceC5082a;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassLoader f23147a;

    /* JADX INFO: renamed from: Z3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0396a extends AbstractC5506u implements InterfaceC5082a {
        C0396a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class invoke() throws ClassNotFoundException {
            Class<?> clsLoadClass = a.this.f23147a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            AbstractC5504s.g(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return clsLoadClass;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Method getWindowExtensionsMethod = a.this.d().getDeclaredMethod("getWindowExtensions", null);
            Class clsC = a.this.c();
            C4903a c4903a = C4903a.f47606a;
            AbstractC5504s.g(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            return Boolean.valueOf(c4903a.b(getWindowExtensionsMethod, clsC) && c4903a.d(getWindowExtensionsMethod));
        }
    }

    public a(ClassLoader loader) {
        AbstractC5504s.h(loader, "loader");
        this.f23147a = loader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f23147a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        AbstractC5504s.g(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return clsLoadClass;
    }

    private final boolean e() {
        return C4903a.f47606a.a(new C0396a());
    }

    public final Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f23147a.loadClass("androidx.window.extensions.WindowExtensions");
        AbstractC5504s.g(clsLoadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return clsLoadClass;
    }

    public final boolean f() {
        return e() && C4903a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
