package com.shopify.reactnative.skia;

import com.facebook.react.X;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.InterfaceC5454a;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class g extends X {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC5558a {
        a() {
        }

        @Override // l7.InterfaceC5558a
        public Map a() {
            HashMap map = new HashMap();
            Class cls = new Class[]{RNSkiaModule.class}[0];
            InterfaceC5454a interfaceC5454a = (InterfaceC5454a) cls.getAnnotation(InterfaceC5454a.class);
            map.put(interfaceC5454a.name(), new ReactModuleInfo(interfaceC5454a.name(), cls.getName(), interfaceC5454a.canOverrideExistingModule(), interfaceC5454a.needsEagerInit(), interfaceC5454a.hasConstants(), interfaceC5454a.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
            return map;
        }
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNSkiaModule(reactApplicationContext));
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new SkiaPictureViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        str.getClass();
        if (str.equals("RNSkiaModule")) {
            return new RNSkiaModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new a();
    }
}
