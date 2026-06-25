package com.swmansion.reanimated;

import c7.e;
import c7.f;
import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactApplicationContext;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class DevMenuUtils {
    public static void addDevMenuOption(ReactApplicationContext reactApplicationContext, e eVar) {
        if (reactApplicationContext.getApplicationContext() instanceof ReactApplication) {
            f devSupportManager = ((ReactApplication) reactApplicationContext.getApplicationContext()).getReactHost().getDevSupportManager();
            if (devSupportManager == null) {
                throw new RuntimeException("[Reanimated] DevSupportManager is not available");
            }
            devSupportManager.w("Toggle slow animations (Reanimated)", eVar);
        }
    }
}
