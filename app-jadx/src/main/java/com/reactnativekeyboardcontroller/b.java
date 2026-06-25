package com.reactnativekeyboardcontroller;

import Ud.AbstractC2279u;
import com.facebook.react.AbstractC3206a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC3206a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b() {
        HashMap map = new HashMap();
        map.put(NativeKeyboardControllerSpec.NAME, new ReactModuleInfo(NativeKeyboardControllerSpec.NAME, NativeKeyboardControllerSpec.NAME, false, false, false, true));
        map.put("StatusBarManager", new ReactModuleInfo("StatusBarManager", "StatusBarManager", true, false, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return AbstractC2279u.p(new KeyboardControllerViewManager(), new KeyboardGestureAreaViewManager(), new OverKeyboardViewManager(), new KeyboardBackgroundViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String name, ReactApplicationContext reactContext) {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(reactContext, "reactContext");
        if (AbstractC5504s.c(name, NativeKeyboardControllerSpec.NAME)) {
            return new KeyboardControllerModule(reactContext);
        }
        if (AbstractC5504s.c(name, "StatusBarManager")) {
            return new StatusBarManagerCompatModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: com.reactnativekeyboardcontroller.a
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return b.b();
            }
        };
    }
}
