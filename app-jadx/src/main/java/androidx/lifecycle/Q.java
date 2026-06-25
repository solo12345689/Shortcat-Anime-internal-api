package androidx.lifecycle;

import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5489c;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f30198a = AbstractC2279u.p(Application.class, I.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f30199b = AbstractC2279u.e(I.class);

    public static final Constructor c(Class modelClass, List signature) {
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(signature, "signature");
        Iterator itA = AbstractC5489c.a(modelClass.getConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC5504s.g(parameterTypes, "getParameterTypes(...)");
            List listV0 = AbstractC2273n.V0(parameterTypes);
            if (AbstractC5504s.c(signature, listV0)) {
                AbstractC5504s.f(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listV0.size() && listV0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final U d(Class modelClass, Constructor constructor, Object... params) {
        AbstractC5504s.h(modelClass, "modelClass");
        AbstractC5504s.h(constructor, "constructor");
        AbstractC5504s.h(params, "params");
        try {
            return (U) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e12.getCause());
        }
    }
}
