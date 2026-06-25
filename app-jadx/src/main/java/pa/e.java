package Pa;

import Td.AbstractC2163n;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.facebook.react.AbstractC3206a;
import com.facebook.react.Y;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import ie.InterfaceC5082a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import k7.InterfaceC5454a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC3206a implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f13750a = AbstractC2163n.b(new InterfaceC5082a() { // from class: Pa.a
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return e.g();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e() {
        Annotation annotation = RNGestureHandlerModule.class.getAnnotation(InterfaceC5454a.class);
        AbstractC5504s.e(annotation);
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) annotation;
        String strName = interfaceC5454a.name();
        String name = RNGestureHandlerModule.class.getName();
        AbstractC5504s.g(name, "getName(...)");
        return S.n(z.a("RNGestureHandlerModule", new ReactModuleInfo(strName, name, interfaceC5454a.canOverrideExistingModule(), interfaceC5454a.needsEagerInit(), interfaceC5454a.isCxxModule(), true)));
    }

    private final Map f() {
        return (Map) this.f13750a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map g() {
        ModuleSpec.Companion companion = ModuleSpec.INSTANCE;
        return S.l(z.a(RNGestureHandlerRootViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: Pa.c
            @Override // javax.inject.Provider
            public final Object get() {
                return e.h();
            }
        })), z.a(RNGestureHandlerButtonViewManager.REACT_CLASS, companion.viewManagerSpec(new Provider() { // from class: Pa.d
            @Override // javax.inject.Provider
            public final Object get() {
                return e.i();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule h() {
        return new RNGestureHandlerRootViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule i() {
        return new RNGestureHandlerButtonViewManager();
    }

    @Override // com.facebook.react.Y
    public ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) f().get(viewManagerName);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.p(new RNGestureHandlerRootViewManager(), new RNGestureHandlerButtonViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        if (AbstractC5504s.c(name, "RNGestureHandlerModule")) {
            return new RNGestureHandlerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() throws InvocationTargetException {
        try {
            Object objNewInstance = Class.forName("com.swmansion.gesturehandler.RNGestureHandlerPackage$$ReactModuleInfoProvider").getDeclaredConstructor(null).newInstance(null);
            AbstractC5504s.f(objNewInstance, "null cannot be cast to non-null type com.facebook.react.module.model.ReactModuleInfoProvider");
            return (InterfaceC5558a) objNewInstance;
        } catch (ClassNotFoundException unused) {
            return new InterfaceC5558a() { // from class: Pa.b
                @Override // l7.InterfaceC5558a
                public final Map a() {
                    return e.e();
                }
            };
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("No ReactModuleInfoProvider for RNGestureHandlerPackage$$ReactModuleInfoProvider", e11);
        }
    }

    @Override // com.facebook.react.AbstractC3206a
    protected List getViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.d1(f().values());
    }

    @Override // com.facebook.react.Y
    public List getViewManagerNames(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.b1(f().keySet());
    }
}
