package Pa;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final void a(ReactContext reactContext, com.facebook.react.uimanager.events.d event) {
        AbstractC5504s.h(reactContext, "<this>");
        AbstractC5504s.h(event, "event");
        UIManager uIManagerG = f0.g(reactContext, 2);
        AbstractC5504s.f(uIManagerG, "null cannot be cast to non-null type com.facebook.react.fabric.FabricUIManager");
        ((FabricUIManager) uIManagerG).getEventDispatcher().d(event);
    }
}
