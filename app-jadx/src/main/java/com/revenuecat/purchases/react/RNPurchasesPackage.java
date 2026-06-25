package com.revenuecat.purchases.react;

import com.facebook.react.O;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class RNPurchasesPackage implements O {
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.O
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNPurchasesModule(reactApplicationContext));
    }

    @Override // com.facebook.react.O
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.O
    public /* bridge */ /* synthetic */ NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return super.getModule(str, reactApplicationContext);
    }
}
