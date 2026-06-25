package io.sentry.react;

import com.facebook.react.X;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import io.sentry.react.replay.RNSentryReplayMaskManager;
import io.sentry.react.replay.RNSentryReplayUnmaskManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l7.InterfaceC5558a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class r extends X {
    public static /* synthetic */ Map a() {
        HashMap map = new HashMap();
        map.put(NativeRNSentrySpec.NAME, new ReactModuleInfo(NativeRNSentrySpec.NAME, NativeRNSentrySpec.NAME, false, false, true, false, true));
        map.put("RNSentryReplayMask", new ReactModuleInfo("RNSentryReplayMask", "RNSentryReplayMask", false, false, false, false, true));
        map.put("RNSentryReplayUnmask", new ReactModuleInfo("RNSentryReplayUnmask", "RNSentryReplayUnmask", false, false, false, false, true));
        return map;
    }

    private NativeModule b(String str) {
        if ("RNSentryReplayMask".equals(str)) {
            return new RNSentryReplayMaskManager();
        }
        if ("RNSentryReplayUnmask".equals(str)) {
            return new RNSentryReplayUnmaskManager();
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return H1.h.a(new Object[]{new RNSentryOnDrawReporterManager(reactApplicationContext), new RNSentryReplayMaskManager(), new RNSentryReplayUnmaskManager()});
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String str, ReactApplicationContext reactApplicationContext) {
        return NativeRNSentrySpec.NAME.equals(str) ? new RNSentryModule(reactApplicationContext) : b(str);
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: io.sentry.react.q
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return r.a();
            }
        };
    }
}
