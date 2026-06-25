package expo.modules.kotlin.services;

import Ub.d;
import Ud.AbstractC2273n;
import android.content.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lexpo/modules/kotlin/services/Service;", "", "a", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f46184a;

    /* JADX INFO: renamed from: expo.modules.kotlin.services.Service$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f46184a = new Companion();

        private Companion() {
        }

        public final Service a(Class serviceClass, d appContext) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            AbstractC5504s.h(serviceClass, "serviceClass");
            AbstractC5504s.h(appContext, "appContext");
            Context contextB = appContext.B();
            if (contextB == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Constructor<?>[] constructors = serviceClass.getConstructors();
            AbstractC5504s.g(constructors, "getConstructors(...)");
            Constructor constructor = (Constructor) AbstractC2273n.H0(constructors);
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC5504s.e(parameterTypes);
            if (parameterTypes.length == 0) {
                Object objNewInstance = constructor.newInstance(null);
                AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.services.Service");
                return (Service) objNewInstance;
            }
            if (parameterTypes.length != 1) {
                throw new IllegalArgumentException("Service " + serviceClass.getSimpleName() + " has an invalid constructor.");
            }
            Class cls = (Class) AbstractC2273n.H0(parameterTypes);
            if (AbstractC5504s.c(cls, Context.class)) {
                Object objNewInstance2 = constructor.newInstance(contextB);
                AbstractC5504s.f(objNewInstance2, "null cannot be cast to non-null type expo.modules.kotlin.services.Service");
                return (Service) objNewInstance2;
            }
            if (AbstractC5504s.c(cls, d.class)) {
                Object objNewInstance3 = constructor.newInstance(appContext);
                AbstractC5504s.f(objNewInstance3, "null cannot be cast to non-null type expo.modules.kotlin.services.Service");
                return (Service) objNewInstance3;
            }
            throw new IllegalArgumentException("Service " + serviceClass.getSimpleName() + " has an invalid constructor.");
        }
    }
}
