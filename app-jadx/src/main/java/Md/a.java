package Md;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.v;
import com.facebook.react.uimanager.events.w;
import com.facebook.react.uimanager.events.x;
import com.facebook.react.uimanager.f0;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(EventDispatcher eventDispatcher, View view, MotionEvent motionEvent, w touchEventCoalescingKeyHelper) {
        AbstractC5504s.h(eventDispatcher, "<this>");
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
        if (motionEvent == null) {
            return;
        }
        try {
            eventDispatcher.d(v.f37669f.a(f0.f(view), view.getId(), b(motionEvent), motionEvent, motionEvent.getEventTime(), motionEvent.getX(), motionEvent.getY(), touchEventCoalescingKeyHelper));
        } catch (RuntimeException e10) {
            Log.e("EventDispatcherUtils", "Error dispatching touch event", e10);
        }
    }

    private static final x b(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        return actionMasked != 0 ? actionMasked != 1 ? actionMasked != 2 ? actionMasked != 3 ? x.f37683f : x.f37683f : x.f37682e : x.f37681d : x.f37680c;
    }
}
