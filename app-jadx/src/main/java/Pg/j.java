package pg;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f56092d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f56093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f56094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f56095c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(com.amazon.a.a.o.b.au, null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new j(method3, method2, method);
        }

        private a() {
        }
    }

    public j(Method method, Method method2, Method method3) {
        this.f56093a = method;
        this.f56094b = method2;
        this.f56095c = method3;
    }

    public final Object a(String closer) {
        AbstractC5504s.h(closer, "closer");
        Method method = this.f56093a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f56094b;
                AbstractC5504s.e(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f56095c;
            AbstractC5504s.e(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
