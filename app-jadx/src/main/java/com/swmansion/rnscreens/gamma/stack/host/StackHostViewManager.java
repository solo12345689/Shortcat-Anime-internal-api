package com.swmansion.rnscreens.gamma.stack.host;

import K7.T;
import Ud.AbstractC2279u;
import android.view.View;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = StackHostViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/host/StackHostViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/stack/host/k;", "", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/gamma/stack/host/k;", "parent", "Landroid/view/View;", "child", "", "index", "LTd/L;", "addView", "(Lcom/swmansion/rnscreens/gamma/stack/host/k;Landroid/view/View;I)V", "view", "removeView", "(Lcom/swmansion/rnscreens/gamma/stack/host/k;Landroid/view/View;)V", "removeViewAt", "(Lcom/swmansion/rnscreens/gamma/stack/host/k;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/gamma/stack/host/k;)V", "getChildAt", "(Lcom/swmansion/rnscreens/gamma/stack/host/k;I)Landroid/view/View;", "getChildCount", "(Lcom/swmansion/rnscreens/gamma/stack/host/k;)I", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackHostViewManager extends ViewGroupManager<k> implements A0 {
    public static final String REACT_CLASS = "RNSStackHost";
    private final q0 delegate;

    public StackHostViewManager() {
        super(null, 1, null);
        this.delegate = new T(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public k createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new k(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public void removeAllViews(k parent) {
        AbstractC5504s.h(parent, "parent");
        parent.f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(k parent, View view) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(view, "view");
        if (!(view instanceof com.swmansion.rnscreens.gamma.stack.screen.a)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
        }
        parent.g((com.swmansion.rnscreens.gamma.stack.screen.a) view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(k parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        if (child instanceof com.swmansion.rnscreens.gamma.stack.screen.a) {
            parent.d((com.swmansion.rnscreens.gamma.stack.screen.a) child, index);
            return;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(k parent, int index) {
        AbstractC5504s.h(parent, "parent");
        return (View) AbstractC2279u.p0(parent.getRenderedScreens$react_native_screens_release(), index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(k parent) {
        AbstractC5504s.h(parent, "parent");
        return parent.getRenderedScreens$react_native_screens_release().size();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(k parent, int index) {
        AbstractC5504s.h(parent, "parent");
        parent.h(index);
    }
}
