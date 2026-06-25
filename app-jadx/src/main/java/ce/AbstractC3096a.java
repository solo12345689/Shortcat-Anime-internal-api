package ce;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import me.AbstractC5666c;
import me.C5665b;

/* JADX INFO: renamed from: ce.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3096a {

    /* JADX INFO: renamed from: ce.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class C0573a {

        /* JADX INFO: renamed from: a */
        public static final C0573a f33607a = new C0573a();

        /* JADX INFO: renamed from: b */
        public static final Method f33608b;

        /* JADX INFO: renamed from: c */
        public static final Method f33609c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            AbstractC5504s.e(methods);
            int length = methods.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                method = null;
                if (i11 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i11];
                if (AbstractC5504s.c(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
                    if (AbstractC5504s.c(AbstractC2273n.I0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i11++;
            }
            f33608b = method2;
            int length2 = methods.length;
            while (true) {
                if (i10 >= length2) {
                    break;
                }
                Method method3 = methods[i10];
                if (AbstractC5504s.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i10++;
            }
            f33609c = method;
        }

        private C0573a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        AbstractC5504s.h(cause, "cause");
        AbstractC5504s.h(exception, "exception");
        Method method = C0573a.f33608b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public AbstractC5666c b() {
        return new C5665b();
    }

    public List c(Throwable exception) {
        Object objInvoke;
        List listE;
        AbstractC5504s.h(exception, "exception");
        Method method = C0573a.f33609c;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listE = AbstractC2273n.e((Throwable[]) objInvoke)) == null) ? AbstractC2279u.m() : listE;
    }
}
