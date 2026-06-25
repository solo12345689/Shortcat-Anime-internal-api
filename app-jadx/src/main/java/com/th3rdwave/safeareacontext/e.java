package com.th3rdwave.safeareacontext;

import Ud.AbstractC2279u;
import com.facebook.react.AbstractC3206a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC3206a {
    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.p(new SafeAreaProviderManager(), new SafeAreaViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        if (AbstractC5504s.c(name, "RNCSafeAreaContext")) {
            return new SafeAreaContextModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{SafeAreaContextModule.class}[0];
        InterfaceC5454a interfaceC5454a = (InterfaceC5454a) cls.getAnnotation(InterfaceC5454a.class);
        if (interfaceC5454a != null) {
            String strName = interfaceC5454a.name();
            String strName2 = interfaceC5454a.name();
            String name = cls.getName();
            AbstractC5504s.g(name, "getName(...)");
            map.put(strName, new ReactModuleInfo(strName2, name, true, interfaceC5454a.needsEagerInit(), interfaceC5454a.isCxxModule(), true));
        }
        return new InterfaceC5558a() { // from class: com.th3rdwave.safeareacontext.d
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return e.b(map);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(Map map) {
        return map;
    }
}
