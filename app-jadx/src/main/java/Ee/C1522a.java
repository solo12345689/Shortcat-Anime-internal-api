package Ee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ee.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1522a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1522a f5915a = new C1522a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0059a f5916b;

    /* JADX INFO: renamed from: Ee.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0059a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f5917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f5918b;

        public C0059a(Method method, Method method2) {
            this.f5917a = method;
            this.f5918b = method2;
        }

        public final Method a() {
            return this.f5918b;
        }

        public final Method b() {
            return this.f5917a;
        }
    }

    private C1522a() {
    }

    private final C0059a a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new C0059a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new C0059a(null, null);
        }
    }

    private final C0059a b(Object obj) {
        C0059a c0059a = f5916b;
        if (c0059a != null) {
            return c0059a;
        }
        C0059a c0059aA = a(obj);
        f5916b = c0059aA;
        return c0059aA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class d(Object recordComponent) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }
}
