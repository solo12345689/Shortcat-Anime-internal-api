package com.swmansion.rnscreens;

import Ud.AbstractC2279u;
import com.facebook.react.AbstractC3206a;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.swmansion.rnscreens.gamma.stack.host.StackHostViewManager;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabScreenViewManager;
import com.swmansion.rnscreens.gamma.tabs.TabsHostViewManager;
import com.swmansion.rnscreens.safearea.SafeAreaViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.InterfaceC5558a;

/* JADX INFO: renamed from: com.swmansion.rnscreens.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C4541t extends AbstractC3206a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f44727b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScreenDummyLayoutHelper f44728a;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.t$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b() {
        HashMap map = new HashMap();
        map.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public List createViewManagers(ReactApplicationContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        this.f44728a = new ScreenDummyLayoutHelper(reactContext);
        C4533k.f44637a.f(reactContext);
        return AbstractC2279u.p(new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager(), new TabsHostViewManager(), new TabScreenViewManager(), new SafeAreaViewManager(), new StackHostViewManager(), new StackScreenViewManager());
    }

    @Override // com.facebook.react.AbstractC3206a, com.facebook.react.O
    public NativeModule getModule(String s10, ReactApplicationContext reactApplicationContext) {
        AbstractC5504s.h(s10, "s");
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        if (AbstractC5504s.c(s10, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }

    @Override // com.facebook.react.AbstractC3206a
    public InterfaceC5558a getReactModuleInfoProvider() {
        return new InterfaceC5558a() { // from class: com.swmansion.rnscreens.s
            @Override // l7.InterfaceC5558a
            public final Map a() {
                return C4541t.b();
            }
        };
    }
}
