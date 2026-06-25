package F7;

import Df.r;
import J7.d;
import Ud.AbstractC2273n;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.yoga.o;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6563a = new a();

    private a() {
    }

    public static final void a(ReactApplicationContext reactContext, Class shadowNodeClass, String viewManagerName) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(shadowNodeClass, "shadowNodeClass");
        AbstractC5504s.h(viewManagerName, "viewManagerName");
        Class<?>[] interfaces = shadowNodeClass.getInterfaces();
        AbstractC5504s.g(interfaces, "getInterfaces(...)");
        boolean zR = AbstractC2273n.R(interfaces, o.class);
        boolean zIsAnnotationPresent = shadowNodeClass.isAnnotationPresent(V6.a.class);
        if (!zR || zIsAnnotationPresent) {
            return;
        }
        String strJ = r.j("\n          [Legacy Architecture] The ViewManager `" + viewManagerName + "` is unlikely to work with the New Architecture.\n          That's because the shadow node `" + shadowNodeClass.getSimpleName() + "` implements the `YogaMeasureFunction.measure()` method.\n          This is not supported in the New Architecture as shadow nodes with custom measurements should be implemented in C++.\n          ");
        if (Y6.a.f22860b) {
            d.d(reactContext, strJ);
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SOFT_ASSERTIONS, new ReactNoCrashSoftException(strJ));
        }
    }
}
