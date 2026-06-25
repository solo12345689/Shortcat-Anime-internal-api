package com.reactnativegooglesignin;

import com.facebook.react.X;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class m extends X {
    public static /* synthetic */ Map a() {
        HashMap map = new HashMap();
        map.put(NativeGoogleSigninSpec.NAME, new ReactModuleInfo(NativeGoogleSigninSpec.NAME, NativeGoogleSigninSpec.NAME, false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNGoogleSigninButtonViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        if (str.equals(NativeGoogleSigninSpec.NAME)) {
            return new RNGoogleSigninModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: com.reactnativegooglesignin.l
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return m.a();
            }
        };
    }
}
