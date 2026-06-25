package com.reactnativekeyboardcontroller;

import K7.C1837m;
import K7.InterfaceC1839n;
import La.f;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.q0;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010#\u001a\u001e\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00000\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "LK7/n;", "Lcom/facebook/react/views/view/g;", "<init>", "()V", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "context", "LLa/f;", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)LLa/f;", "view", "", "value", "LTd/L;", "setOffset", "(Lcom/facebook/react/views/view/g;D)V", "setInterpolator", "(Lcom/facebook/react/views/view/g;Ljava/lang/String;)V", "", "setShowOnSwipeUp", "(Lcom/facebook/react/views/view/g;Z)V", "setEnableSwipeToDismiss", "setTextInputNativeID", "LGa/c;", "manager", "LGa/c;", "LK7/m;", "kotlin.jvm.PlatformType", "mDelegate", "LK7/m;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardGestureAreaViewManager extends ReactViewManager implements InterfaceC1839n {
    private final Ga.c manager = new Ga.c();
    private final C1837m mDelegate = new C1837m(this);

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "KeyboardGestureArea";
    }

    @Override // K7.InterfaceC1839n
    @B7.a(name = "textInputNativeID")
    public void setTextInputNativeID(g view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.InterfaceC1839n
    @B7.a(name = "enableSwipeToDismiss")
    public void setEnableSwipeToDismiss(g view, boolean value) {
        Ga.c cVar = this.manager;
        AbstractC5504s.f(view, "null cannot be cast to non-null type com.reactnativekeyboardcontroller.views.KeyboardGestureAreaReactViewGroup");
        cVar.d((f) view, value);
    }

    @Override // K7.InterfaceC1839n
    @B7.a(name = "interpolator")
    public void setInterpolator(g view, String value) {
        AbstractC5504s.h(view, "view");
        Ga.c cVar = this.manager;
        f fVar = (f) view;
        if (value == null) {
            value = "linear";
        }
        cVar.b(fVar, value);
    }

    @Override // K7.InterfaceC1839n
    @B7.a(name = com.amazon.device.iap.internal.c.b.as)
    public void setOffset(g view, double value) {
        AbstractC5504s.h(view, "view");
        this.manager.c((f) view, value);
    }

    @Override // K7.InterfaceC1839n
    @B7.a(name = "showOnSwipeUp")
    public void setShowOnSwipeUp(g view, boolean value) {
        AbstractC5504s.h(view, "view");
        this.manager.e((f) view, value);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public f createViewInstance(C3284b0 context) {
        AbstractC5504s.h(context, "context");
        return this.manager.a(context);
    }
}
