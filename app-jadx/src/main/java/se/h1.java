package se;

import Ee.AbstractC1527f;
import Ud.AbstractC2273n;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Class cls) {
        AbstractC5504s.e(cls);
        return AbstractC1527f.f(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
        sb2.append(AbstractC2273n.y0(parameterTypes, "", "(", ")", 0, null, g1.f59500a, 24, null));
        Class<?> returnType = method.getReturnType();
        AbstractC5504s.g(returnType, "getReturnType(...)");
        sb2.append(AbstractC1527f.f(returnType));
        return sb2.toString();
    }
}
