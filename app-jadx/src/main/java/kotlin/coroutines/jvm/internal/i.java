package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f52246a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f52247b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f52248c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f52249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f52250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f52251c;

        public a(Method method, Method method2, Method method3) {
            this.f52249a = method;
            this.f52250b = method2;
            this.f52251c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f52248c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f52247b;
            f52248c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        AbstractC5504s.h(continuation, "continuation");
        a aVarA = f52248c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f52247b && (method = aVarA.f52249a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f52250b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f52251c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
