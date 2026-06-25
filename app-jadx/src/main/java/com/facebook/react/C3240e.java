package com.facebook.react;

import Td.AbstractC2163n;
import Ud.AbstractC2279u;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager;
import ie.InterfaceC5082a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;

/* JADX INFO: renamed from: com.facebook.react.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3240e extends AbstractC3206a implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f36872a = AbstractC2163n.a(Td.q.f17463c, new InterfaceC5082a() { // from class: com.facebook.react.b
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return C3240e.f();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d() {
        return Ud.S.i();
    }

    private final Map e() {
        return (Map) this.f36872a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f() {
        return Ud.S.f(Td.z.a(DebuggingOverlayManager.REACT_CLASS, ModuleSpec.INSTANCE.viewManagerSpec(new Provider() { // from class: com.facebook.react.d
            @Override // javax.inject.Provider
            public final Object get() {
                return C3240e.g();
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NativeModule g() {
        return new DebuggingOverlayManager();
    }

    @Override // com.facebook.react.Y
    public ViewManager createViewManager(ReactApplicationContext reactContext, String viewManagerName) {
        Provider provider;
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(viewManagerName, "viewManagerName");
        ModuleSpec moduleSpec = (ModuleSpec) e().getOrDefault(viewManagerName, null);
        NativeModule nativeModule = (moduleSpec == null || (provider = moduleSpec.provider()) == null) ? null : (NativeModule) provider.get();
        if (nativeModule instanceof ViewManager) {
            return (ViewManager) nativeModule;
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: com.facebook.react.c
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return C3240e.d();
            }
        };
    }

    @Override // com.facebook.react.Y
    public Collection getViewManagerNames(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return e().keySet();
    }

    @Override // com.facebook.react.AbstractC3206a
    public List getViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.b1(e().values());
    }
}
