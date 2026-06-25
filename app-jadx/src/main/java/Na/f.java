package Na;

import Td.L;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.C3301q;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends com.facebook.react.views.view.g implements W {

    /* JADX INFO: renamed from: a */
    private final C3284b0 f12767a;

    /* JADX INFO: renamed from: b */
    private final C3301q f12768b;

    /* JADX INFO: renamed from: c */
    private c f12769c;

    /* JADX INFO: renamed from: d */
    private EventDispatcher f12770d;

    /* JADX INFO: renamed from: e */
    private InterfaceC3282a0 f12771e;

    /* JADX INFO: renamed from: f */
    private boolean f12772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f12767a = reactContext;
        this.f12768b = new C3301q(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f12769c = new c(this);
        }
    }

    private final void C(int i10, int i11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", Ba.d.a(i10));
        writableNativeMap.putDouble("screenHeight", Ba.d.a(i11));
        InterfaceC3282a0 interfaceC3282a0 = this.f12771e;
        if (interfaceC3282a0 != null) {
            interfaceC3282a0.updateState(writableNativeMap);
        }
    }

    public final boolean B() {
        return this.f12772f;
    }

    @Override // com.facebook.react.uimanager.W
    public void a(View view, MotionEvent ev) {
        AbstractC5504s.h(ev, "ev");
        EventDispatcher eventDispatcher = this.f12770d;
        if (eventDispatcher != null) {
            this.f12768b.g(ev, eventDispatcher);
            c cVar = this.f12769c;
            if (cVar != null) {
                cVar.p(view, ev, eventDispatcher);
            }
        }
    }

    public final EventDispatcher getEventDispatcher$react_native_keyboard_controller_release() {
        return this.f12770d;
    }

    public final InterfaceC3282a0 getStateWrapper$react_native_keyboard_controller_release() {
        return this.f12771e;
    }

    @Override // com.facebook.react.uimanager.W
    public void j(View childView, MotionEvent ev) {
        AbstractC5504s.h(childView, "childView");
        AbstractC5504s.h(ev, "ev");
        EventDispatcher eventDispatcher = this.f12770d;
        if (eventDispatcher != null) {
            this.f12768b.f(ev, eventDispatcher);
        }
        c cVar = this.f12769c;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point pointB = Ba.a.b(this.f12767a);
        C(pointB.x, pointB.y);
        this.f12772f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C(0, 0);
        this.f12772f = false;
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    public boolean onHoverEvent(MotionEvent event) {
        c cVar;
        AbstractC5504s.h(event, "event");
        EventDispatcher eventDispatcher = this.f12770d;
        if (eventDispatcher != null && (cVar = this.f12769c) != null) {
            cVar.w(event, eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent event) {
        c cVar;
        AbstractC5504s.h(event, "event");
        EventDispatcher eventDispatcher = this.f12770d;
        if (eventDispatcher != null && (cVar = this.f12769c) != null) {
            cVar.w(event, eventDispatcher, true);
        }
        return super.onInterceptHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        EventDispatcher eventDispatcher = this.f12770d;
        if (eventDispatcher != null) {
            try {
                this.f12768b.c(event, eventDispatcher);
                c cVar = this.f12769c;
                if (cVar != null) {
                    cVar.w(event, eventDispatcher, true);
                    L l10 = L.f17438a;
                }
            } catch (RuntimeException e10) {
                Fa.a.f6597a.c(g.f12773a, "Can not handle touch event", e10);
                L l11 = L.f17438a;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        C(i10, i11);
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC5504s.h(event, "event");
        EventDispatcher eventDispatcher = this.f12770d;
        if (eventDispatcher != null) {
            try {
                this.f12768b.c(event, eventDispatcher);
                c cVar = this.f12769c;
                if (cVar != null) {
                    cVar.w(event, eventDispatcher, false);
                    L l10 = L.f17438a;
                }
            } catch (RuntimeException e10) {
                Fa.a.f6597a.c(g.f12773a, "Can not handle touch event", e10);
                L l11 = L.f17438a;
            }
        }
        super.onTouchEvent(event);
        return true;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z10) {
        this.f12772f = z10;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(EventDispatcher eventDispatcher) {
        this.f12770d = eventDispatcher;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(InterfaceC3282a0 interfaceC3282a0) {
        this.f12771e = interfaceC3282a0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
    }
}
