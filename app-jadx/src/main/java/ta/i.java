package Ta;

import Td.L;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import com.swmansion.rnscreens.C4546y;
import com.swmansion.rnscreens.F;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4546y f17363a;

    public i(C4546y screen) {
        AbstractC5504s.h(screen, "screen");
        this.f17363a = screen;
    }

    public final L a() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.d(new f(g(), this.f17363a.getId()));
        return L.f17438a;
    }

    public final L b() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.d(new g(g(), this.f17363a.getId()));
        return L.f17438a;
    }

    public final L c() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.d(new k(g(), this.f17363a.getId()));
        return L.f17438a;
    }

    public final L d() {
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF == null) {
            return null;
        }
        eventDispatcherF.d(new l(g(), this.f17363a.getId()));
        return L.f17438a;
    }

    public final void e(float f10, boolean z10, boolean z11) {
        float fL = AbstractC5874j.l(f10, 0.0f, 1.0f);
        short sA = F.INSTANCE.a(fL);
        EventDispatcher eventDispatcherF = f();
        if (eventDispatcherF != null) {
            eventDispatcherF.d(new j(g(), this.f17363a.getId(), fL, z10, z11, sA));
        }
    }

    public final EventDispatcher f() {
        return this.f17363a.getReactEventDispatcher();
    }

    public final int g() {
        return f0.f(this.f17363a);
    }
}
