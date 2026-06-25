package Na;

import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.f0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f12763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventDispatcher f12764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WindowManager f12765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f12766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f12763a = reactContext;
        EventDispatcher eventDispatcherC = f0.c(reactContext, getId());
        this.f12764b = eventDispatcherC;
        Object systemService = reactContext.getSystemService("window");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12765c = (WindowManager) systemService;
        f fVar = new f(reactContext);
        this.f12766d = fVar;
        fVar.setEventDispatcher$react_native_keyboard_controller_release(eventDispatcherC);
    }

    public final void B() {
        if (this.f12766d.B()) {
            this.f12765c.removeView(this.f12766d);
        }
    }

    public final void C() {
        this.f12765c.addView(this.f12766d, new WindowManager.LayoutParams(-1, -1, 1000, 520, -3));
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList outChildren) {
        AbstractC5504s.h(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f12766d.addView(view, i10);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        AbstractC5504s.h(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i10) {
        return this.f12766d.getChildAt(i10);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f12766d.getChildCount();
    }

    public final InterfaceC3282a0 getStateWrapper() {
        return this.f12766d.getStateWrapper$react_native_keyboard_controller_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f12766d.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        UiThreadUtil.assertOnUiThread();
        this.f12766d.removeView(getChildAt(i10));
    }

    public final void setStateWrapper(InterfaceC3282a0 interfaceC3282a0) {
        this.f12766d.setStateWrapper$react_native_keyboard_controller_release(interfaceC3282a0);
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
