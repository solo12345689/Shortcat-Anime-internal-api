package expo.modules.adapters.react;

import Ub.f;
import Ub.k;
import Ub.o;
import Ub.p;
import Ub.t;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import pb.C5957b;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class NativeModulesProxy extends ReactContextBaseJavaModule {
    private static final String EXPORTED_METHODS_KEY = "exportedMethods";
    private static final String MODULES_CONSTANTS_KEY = "modulesConstants";
    private static final String NAME = "NativeUnimoduleProxy";
    private static final String UNDEFINED_METHOD_ERROR = "E_UNDEFINED_METHOD";
    private static final String VIEW_MANAGERS_METADATA_KEY = "viewManagersMetadata";
    private Map<String, Object> cachedConstants;
    private p mKotlinInteropModuleRegistry;
    private C5957b mModuleRegistry;

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, C5957b c5957b) {
        super(reactApplicationContext);
        this.mModuleRegistry = c5957b;
        t tVarA = k.f19429a.a();
        Objects.requireNonNull(tVarA);
        this.mKotlinInteropModuleRegistry = new p(tVarA, c5957b, new WeakReference(reactApplicationContext));
    }

    @ReactMethod
    public void callMethod(String str, String str2, ReadableArray readableArray, Promise promise) {
        if (this.mKotlinInteropModuleRegistry.h(str)) {
            this.mKotlinInteropModuleRegistry.b(str, str2, readableArray, new o(promise));
            return;
        }
        promise.reject(UNDEFINED_METHOD_ERROR, "Method " + str2 + " of Java module " + str + " is undefined.");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> map = this.cachedConstants;
        if (map != null) {
            return map;
        }
        this.mModuleRegistry.a();
        p kotlinInteropModuleRegistry = getKotlinInteropModuleRegistry();
        kotlinInteropModuleRegistry.i();
        kotlinInteropModuleRegistry.c();
        HashMap map2 = new HashMap(3);
        map2.put(MODULES_CONSTANTS_KEY, new HashMap());
        map2.put(EXPORTED_METHODS_KEY, new HashMap());
        map2.put(VIEW_MANAGERS_METADATA_KEY, this.mKotlinInteropModuleRegistry.m());
        f.a().d("✅ Constants were exported");
        this.cachedConstants = map2;
        return map2;
    }

    public p getKotlinInteropModuleRegistry() {
        return this.mKotlinInteropModuleRegistry;
    }

    C5957b getModuleRegistry() {
        return this.mModuleRegistry;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    ReactApplicationContext getReactContext() {
        return getReactApplicationContext();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        this.mModuleRegistry.d();
        this.mKotlinInteropModuleRegistry.j();
    }

    public NativeModulesProxy(ReactApplicationContext reactApplicationContext, C5957b c5957b, t tVar) {
        super(reactApplicationContext);
        this.mModuleRegistry = c5957b;
        Objects.requireNonNull(tVar);
        this.mKotlinInteropModuleRegistry = new p(tVar, c5957b, new WeakReference(reactApplicationContext));
    }
}
