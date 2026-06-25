package Ee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Ee.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class C1523b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1523b f5919a = new C1523b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f5920b;

    /* JADX INFO: renamed from: Ee.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f5921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f5922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f5923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Method f5924d;

        public a(Method method, Method method2, Method method3, Method method4) {
            this.f5921a = method;
            this.f5922b = method2;
            this.f5923c = method3;
            this.f5924d = method4;
        }

        public final Method a() {
            return this.f5922b;
        }

        public final Method b() {
            return this.f5924d;
        }

        public final Method c() {
            return this.f5923c;
        }

        public final Method d() {
            return this.f5921a;
        }
    }

    private C1523b() {
    }

    private final a a() {
        try {
            return new a(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null, null, null);
        }
    }

    private final a b() {
        a aVar = f5920b;
        if (aVar != null) {
            return aVar;
        }
        a aVarA = a();
        f5920b = aVarA;
        return aVarA;
    }

    public final Class[] c(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class clazz) {
        AbstractC5504s.h(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class clazz) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        AbstractC5504s.f(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }
}
