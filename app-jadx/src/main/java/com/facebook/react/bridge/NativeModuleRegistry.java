package com.facebook.react.bridge;

import Td.InterfaceC2154e;
import Ud.AbstractC2279u;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J%\u0010\u001d\u001a\u00020\u001c\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\"J\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\f8F¢\u0006\u0006\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/facebook/react/bridge/NativeModuleRegistry;", "", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactApplicationContext", "", "", "Lcom/facebook/react/bridge/ModuleHolder;", "modules", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/Map;)V", "Lcom/facebook/react/bridge/JSInstance;", "jsInstance", "", "Lcom/facebook/react/bridge/JavaModuleWrapper;", "getJavaModules", "(Lcom/facebook/react/bridge/JSInstance;)Ljava/util/List;", "newRegister", "LTd/L;", "registerModules", "(Lcom/facebook/react/bridge/NativeModuleRegistry;)V", "notifyJSInstanceDestroy", "()V", "notifyJSInstanceInitialized", "onBatchComplete", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "moduleInterface", "", "hasModule", "(Ljava/lang/Class;)Z", "getModule", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "name", "(Ljava/lang/String;)Z", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/Map;", "", "getModuleMap", "()Ljava/util/Map;", "moduleMap", "getCxxModules", "()Ljava/util/List;", "cxxModules", "getAllModules", "allModules", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@InterfaceC2154e
public final class NativeModuleRegistry {
    private static final Companion Companion = new Companion(null);
    private final Map<String, ModuleHolder> modules;
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/bridge/NativeModuleRegistry$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        W6.b.a("NativeModuleRegistry", W6.a.f20778b);
    }

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> modules) {
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        AbstractC5504s.h(modules, "modules");
        this.reactApplicationContext = reactApplicationContext;
        this.modules = modules;
    }

    private final Map<String, ModuleHolder> getModuleMap() {
        return this.modules;
    }

    public final List<NativeModule> getAllModules() {
        List listC = AbstractC2279u.c();
        Iterator<ModuleHolder> it = this.modules.values().iterator();
        while (it.hasNext()) {
            listC.add(it.next().getModule());
        }
        return AbstractC2279u.a(listC);
    }

    public final List<ModuleHolder> getCxxModules() {
        List listC = AbstractC2279u.c();
        Iterator<Map.Entry<String, ModuleHolder>> it = this.modules.entrySet().iterator();
        while (it.hasNext()) {
            ModuleHolder value = it.next().getValue();
            if (value.isCxxModule()) {
                listC.add(value);
            }
        }
        return AbstractC2279u.a(listC);
    }

    public final List<JavaModuleWrapper> getJavaModules(JSInstance jsInstance) {
        AbstractC5504s.h(jsInstance, "jsInstance");
        List listC = AbstractC2279u.c();
        Iterator<Map.Entry<String, ModuleHolder>> it = this.modules.entrySet().iterator();
        while (it.hasNext()) {
            ModuleHolder value = it.next().getValue();
            if (!value.isCxxModule()) {
                listC.add(new JavaModuleWrapper(jsInstance, value));
            }
        }
        return AbstractC2279u.a(listC);
    }

    public final <T extends NativeModule> T getModule(Class<T> moduleInterface) {
        AbstractC5504s.h(moduleInterface, "moduleInterface");
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) moduleInterface.getAnnotation(InterfaceC5454a.class);
        if (interfaceC5454a == null) {
            throw new IllegalArgumentException(("Could not find @ReactModule annotation in class " + moduleInterface.getName()).toString());
        }
        ModuleHolder moduleHolder = this.modules.get(interfaceC5454a.name());
        if (moduleHolder != null) {
            T t10 = (T) moduleHolder.getModule();
            AbstractC5504s.f(t10, "null cannot be cast to non-null type T of com.facebook.react.bridge.NativeModuleRegistry.getModule");
            return t10;
        }
        throw new IllegalStateException((interfaceC5454a + ".name could not be found. Is it defined in " + moduleInterface.getName()).toString());
    }

    public final <T extends NativeModule> boolean hasModule(Class<T> moduleInterface) {
        AbstractC5504s.h(moduleInterface, "moduleInterface");
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) moduleInterface.getAnnotation(InterfaceC5454a.class);
        if (interfaceC5454a != null) {
            return this.modules.containsKey(interfaceC5454a.name());
        }
        throw new IllegalArgumentException(("Could not find @ReactModule annotation in class " + moduleInterface.getName()).toString());
    }

    public final void notifyJSInstanceDestroy() {
        this.reactApplicationContext.assertOnNativeModulesQueueThread();
        U7.a.c(0L, "NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            Iterator<ModuleHolder> it = this.modules.values().iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
        } finally {
            U7.a.i(0L);
        }
    }

    public final void notifyJSInstanceInitialized() {
        this.reactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        U7.a.c(0L, "NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            Iterator<ModuleHolder> it = this.modules.values().iterator();
            while (it.hasNext()) {
                it.next().markInitializable$ReactAndroid_release();
            }
        } finally {
            U7.a.i(0L);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public final void onBatchComplete() {
        W6.b.a("NativeModuleRegistry.onBatchComplete()", W6.a.f20777a);
        ModuleHolder moduleHolder = this.modules.get(UIManagerModule.NAME);
        if (moduleHolder == null || !moduleHolder.hasInstance$ReactAndroid_release()) {
            return;
        }
        NativeModule module = moduleHolder.getModule();
        AbstractC5504s.f(module, "null cannot be cast to non-null type com.facebook.react.bridge.OnBatchCompleteListener");
        ((OnBatchCompleteListener) module).onBatchComplete();
    }

    public final void registerModules(NativeModuleRegistry newRegister) {
        AbstractC5504s.h(newRegister, "newRegister");
        if (!AbstractC5504s.c(this.reactApplicationContext, newRegister.reactApplicationContext)) {
            throw new IllegalStateException("Extending native modules with non-matching application contexts.");
        }
        for (Map.Entry<String, ModuleHolder> entry : newRegister.getModuleMap().entrySet()) {
            String key = entry.getKey();
            ModuleHolder value = entry.getValue();
            if (!this.modules.containsKey(key)) {
                this.modules.put(key, value);
            }
        }
    }

    public final boolean hasModule(String name) {
        AbstractC5504s.h(name, "name");
        return this.modules.containsKey(name);
    }

    public final NativeModule getModule(String name) {
        AbstractC5504s.h(name, "name");
        ModuleHolder moduleHolder = this.modules.get(name);
        if (moduleHolder != null) {
            return moduleHolder.getModule();
        }
        throw new IllegalStateException(("Could not find module with name " + name).toString());
    }
}
