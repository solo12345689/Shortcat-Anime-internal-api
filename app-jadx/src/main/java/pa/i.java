package Pa;

import com.facebook.react.bridge.ReactContext;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReanimatedModule f13752a;

    public final void a(com.facebook.react.uimanager.events.d event, ReactContext reactApplicationContext) {
        NodesManager nodesManager;
        AbstractC5504s.h(event, "event");
        AbstractC5504s.h(reactApplicationContext, "reactApplicationContext");
        if (this.f13752a == null) {
            this.f13752a = (ReanimatedModule) reactApplicationContext.getNativeModule(ReanimatedModule.class);
        }
        ReanimatedModule reanimatedModule = this.f13752a;
        if (reanimatedModule == null || (nodesManager = reanimatedModule.getNodesManager()) == null) {
            return;
        }
        nodesManager.onEventDispatch(event);
    }
}
