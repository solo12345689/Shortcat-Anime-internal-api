package com.facebook.react;

import Ud.AbstractC2279u;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import h7.C4921i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T extends TurboModuleManagerDelegate {
    private final List<b> moduleProviders;
    private final Map<b, Map<String, ReactModuleInfo>> packageModuleInfos;
    private final boolean shouldEnableLegacyModuleInterop;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f36429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ReactApplicationContext f36430b;

        public final T a() {
            ReactApplicationContext reactApplicationContext = this.f36430b;
            if (reactApplicationContext == null) {
                throw new IllegalArgumentException("The ReactApplicationContext must be provided to create ReactPackageTurboModuleManagerDelegate");
            }
            List list = this.f36429a;
            if (list != null) {
                return b(reactApplicationContext, list);
            }
            throw new IllegalArgumentException("A set of ReactPackages must be provided to create ReactPackageTurboModuleManagerDelegate");
        }

        protected abstract T b(ReactApplicationContext reactApplicationContext, List list);

        public final a c(List packages) {
            AbstractC5504s.h(packages, "packages");
            this.f36429a = AbstractC2279u.b1(packages);
            return this;
        }

        public final a d(ReactApplicationContext reactApplicationContext) {
            this.f36430b = reactApplicationContext;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        NativeModule getModule(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected T(ReactApplicationContext reactApplicationContext, List packages, HybridData hybridData) {
        super(hybridData);
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        AbstractC5504s.h(packages, "packages");
        AbstractC5504s.h(hybridData, "hybridData");
        this.moduleProviders = new ArrayList();
        this.packageModuleInfos = new LinkedHashMap();
        this.shouldEnableLegacyModuleInterop = C4921i.a() && C4921i.d();
        c(reactApplicationContext, packages);
    }

    private final void c(final ReactApplicationContext reactApplicationContext, List list) {
        String name;
        ReactModuleInfo reactModuleInfo;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final O o10 = (O) it.next();
            if (o10 instanceof AbstractC3206a) {
                b bVar = new b() { // from class: com.facebook.react.Q
                    @Override // com.facebook.react.T.b
                    public final NativeModule getModule(String str) {
                        return T.d(o10, reactApplicationContext, str);
                    }
                };
                this.moduleProviders.add(bVar);
                this.packageModuleInfos.put(bVar, ((AbstractC3206a) o10).getReactModuleInfoProvider().a());
            } else {
                f();
                if (f()) {
                    List<NativeModule> listCreateNativeModules = o10.createNativeModules(reactApplicationContext);
                    final LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (NativeModule nativeModule : listCreateNativeModules) {
                        Class<?> cls = nativeModule.getClass();
                        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) cls.getAnnotation(InterfaceC5454a.class);
                        if (interfaceC5454a == null || (name = interfaceC5454a.name()) == null) {
                            name = nativeModule.getName();
                            AbstractC5504s.g(name, "getName(...)");
                        }
                        String str = name;
                        if (interfaceC5454a != null) {
                            String name2 = cls.getName();
                            AbstractC5504s.g(name2, "getName(...)");
                            reactModuleInfo = new ReactModuleInfo(str, name2, interfaceC5454a.canOverrideExistingModule(), true, interfaceC5454a.isCxxModule(), ReactModuleInfo.f36934g.a(cls));
                        } else {
                            String name3 = cls.getName();
                            AbstractC5504s.g(name3, "getName(...)");
                            reactModuleInfo = new ReactModuleInfo(str, name3, nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), ReactModuleInfo.f36934g.a(cls));
                        }
                        linkedHashMap2.put(str, reactModuleInfo);
                        linkedHashMap.put(str, nativeModule);
                    }
                    b bVar2 = new b() { // from class: com.facebook.react.S
                        @Override // com.facebook.react.T.b
                        public final NativeModule getModule(String str2) {
                            return T.e(linkedHashMap, str2);
                        }
                    };
                    this.moduleProviders.add(bVar2);
                    this.packageModuleInfos.put(bVar2, linkedHashMap2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule d(O o10, ReactApplicationContext reactApplicationContext, String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        return ((AbstractC3206a) o10).getModule(moduleName, reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule e(Map map, String module) {
        AbstractC5504s.h(module, "module");
        return (NativeModule) map.get(module);
    }

    private final boolean f() {
        return unstable_shouldEnableLegacyModuleInterop();
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public List<String> getEagerInitModuleNames() {
        Collection<ReactModuleInfo> collectionM;
        List listC = AbstractC2279u.c();
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            if (map == null || (collectionM = map.values()) == null) {
                collectionM = AbstractC2279u.m();
            }
            for (ReactModuleInfo reactModuleInfo : collectionM) {
                if (reactModuleInfo.d() && reactModuleInfo.f()) {
                    listC.add(reactModuleInfo.e());
                }
            }
        }
        return AbstractC2279u.a(listC);
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public NativeModule getLegacyModule(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        if (!unstable_shouldEnableLegacyModuleInterop()) {
            return null;
        }
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.d() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (nativeModule instanceof TurboModule) {
            return null;
        }
        return nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public TurboModule getModule(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        NativeModule nativeModule = null;
        for (b bVar : this.moduleProviders) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(bVar);
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.d() && (nativeModule == null || reactModuleInfo.a())) {
                NativeModule module = bVar.getModule(moduleName);
                if (module != null) {
                    nativeModule = module;
                }
            }
        }
        if (!(nativeModule instanceof TurboModule)) {
            return null;
        }
        AbstractC5504s.f(nativeModule, "null cannot be cast to non-null type com.facebook.react.turbomodule.core.interfaces.TurboModule");
        return (TurboModule) nativeModule;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isLegacyModuleRegistered(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && !reactModuleInfo.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_isModuleRegistered(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        Iterator<b> it = this.moduleProviders.iterator();
        while (it.hasNext()) {
            Map<String, ReactModuleInfo> map = this.packageModuleInfos.get(it.next());
            ReactModuleInfo reactModuleInfo = map != null ? map.get(moduleName) : null;
            if (reactModuleInfo != null && reactModuleInfo.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.internal.turbomodule.core.TurboModuleManagerDelegate
    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return this.shouldEnableLegacyModuleInterop;
    }
}
