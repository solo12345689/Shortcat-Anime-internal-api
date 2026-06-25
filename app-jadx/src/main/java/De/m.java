package De;

import Ee.AbstractC1527f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f3711a = new m();

    private m() {
    }

    public final String a(Constructor constructor) {
        AbstractC5504s.h(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = AbstractC5489c.a(constructor.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            AbstractC5504s.e(cls);
            sb2.append(AbstractC1527f.f(cls));
        }
        sb2.append(")V");
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }

    public final String b(Field field) {
        AbstractC5504s.h(field, "field");
        Class<?> type = field.getType();
        AbstractC5504s.g(type, "getType(...)");
        return AbstractC1527f.f(type);
    }

    public final String c(Method method) {
        AbstractC5504s.h(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Iterator itA = AbstractC5489c.a(method.getParameterTypes());
        while (itA.hasNext()) {
            Class cls = (Class) itA.next();
            AbstractC5504s.e(cls);
            sb2.append(AbstractC1527f.f(cls));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        AbstractC5504s.g(returnType, "getReturnType(...)");
        sb2.append(AbstractC1527f.f(returnType));
        String string = sb2.toString();
        AbstractC5504s.g(string, "toString(...)");
        return string;
    }
}
