package He;

import Xe.b;
import kotlin.jvm.internal.AbstractC5504s;
import yf.AbstractC7248a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f8439a = new H();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Xe.c f8440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Xe.b f8441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Xe.b f8442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Xe.b f8443e;

    static {
        Xe.c cVar = new Xe.c("kotlin.jvm.JvmField");
        f8440b = cVar;
        b.a aVar = Xe.b.f21759d;
        f8441c = aVar.c(cVar);
        f8442d = aVar.c(new Xe.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f8443e = b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private H() {
    }

    public static final String b(String propertyName) {
        AbstractC5504s.h(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return com.amazon.a.a.o.b.au + AbstractC7248a.a(propertyName);
    }

    public static final boolean c(String name) {
        AbstractC5504s.h(name, "name");
        return Df.r.Q(name, com.amazon.a.a.o.b.au, false, 2, null) || Df.r.Q(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        AbstractC5504s.h(name, "name");
        return Df.r.Q(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String strA;
        AbstractC5504s.h(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            strA = propertyName.substring(2);
            AbstractC5504s.g(strA, "substring(...)");
        } else {
            strA = AbstractC7248a.a(propertyName);
        }
        sb2.append(strA);
        return sb2.toString();
    }

    public static final boolean f(String name) {
        AbstractC5504s.h(name, "name");
        if (!Df.r.Q(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return AbstractC5504s.i(97, cCharAt) > 0 || AbstractC5504s.i(cCharAt, 122) > 0;
    }

    public final Xe.b a() {
        return f8443e;
    }
}
