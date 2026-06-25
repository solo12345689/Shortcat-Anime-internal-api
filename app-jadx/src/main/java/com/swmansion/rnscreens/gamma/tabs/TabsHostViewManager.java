package com.swmansion.rnscreens.gamma.tabs;

import K7.A;
import K7.C1862z;
import Ud.S;
import android.view.View;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = TabsHostViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0002H\u0014¢\u0006\u0004\b#\u0010$J!\u0010&\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b(\u0010'J!\u0010*\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b1\u00100J!\u00102\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b2\u00100J!\u00103\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b3\u0010'J!\u00104\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b4\u0010'J!\u00105\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b5\u00100J!\u00106\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b6\u00100J\u001f\u00107\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b7\u0010.J!\u00108\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b8\u0010'J!\u00109\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b9\u0010'J!\u0010:\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b:\u0010'J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010%\u001a\u00020,H\u0017¢\u0006\u0004\b;\u0010.J!\u0010<\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b<\u0010'J!\u0010=\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u00022\u0006\u0010%\u001a\u00020)H\u0017¢\u0006\u0004\b=\u0010+J!\u0010>\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b>\u0010'J!\u0010?\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b?\u00100R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabsHostViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/l;", "LK7/A;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/gamma/tabs/l;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "parent", "Landroid/view/View;", "child", "", "index", "LTd/L;", "addView", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;I)V", "removeView", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/View;)V", "removeViewAt", "(Lcom/swmansion/rnscreens/gamma/tabs/l;I)V", "removeAllViews", "(Lcom/swmansion/rnscreens/gamma/tabs/l;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/swmansion/rnscreens/gamma/tabs/l;)V", "value", "setTabBarBackgroundColor", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;)V", "setTabBarTintColor", "", "setTabBarItemTitleFontSize", "(Lcom/swmansion/rnscreens/gamma/tabs/l;F)V", "", "setControlNavigationStateInJS", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Z)V", "setTabBarItemTitleFontFamily", "(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/String;)V", "setTabBarItemTitleFontWeight", "setTabBarItemTitleFontStyle", "setTabBarItemTitleFontColor", "setTabBarItemIconColor", "setTabBarMinimizeBehavior", "setTabBarControllerMode", "setTabBarHidden", "setNativeContainerBackgroundColor", "setTabBarItemTitleFontColorActive", "setTabBarItemActiveIndicatorColor", "setTabBarItemActiveIndicatorEnabled", "setTabBarItemIconColorActive", "setTabBarItemTitleFontSizeActive", "setTabBarItemRippleColor", "setTabBarItemLabelVisibilityMode", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabsHostViewManager extends ViewGroupManager<l> implements A {
    public static final String REACT_CLASS = "RNSBottomTabs";
    private final q0 delegate;

    public TabsHostViewManager() {
        super(null, 1, null);
        this.delegate = new C1862z(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return S.n(Xa.a.a(Za.e.f23238d));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // K7.A
    public void setControlNavigationStateInJS(l view, boolean value) {
    }

    @Override // K7.A
    public void setTabBarControllerMode(l view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.A
    public void setTabBarMinimizeBehavior(l view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.A
    public void setTabBarTintColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 reactContext, l view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        super.addEventEmitters(reactContext, view);
        view.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public l createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new l(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public void removeAllViews(l parent) {
        AbstractC5504s.h(parent, "parent");
        parent.D();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(l parent, View child) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        if (!(child instanceof a)) {
            throw new IllegalArgumentException("[RNScreens] Attempt to detach child that is not of type javaClass");
        }
        parent.G((a) child);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "nativeContainerBackgroundColor")
    public void setNativeContainerBackgroundColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setNativeContainerBackgroundColor(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarBackgroundColor")
    public void setTabBarBackgroundColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarBackgroundColor(value);
    }

    @Override // K7.A
    @B7.a(name = "tabBarHidden")
    public void setTabBarHidden(l view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarHidden(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarItemActiveIndicatorColor")
    public void setTabBarItemActiveIndicatorColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemActiveIndicatorColor(value);
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemActiveIndicatorEnabled")
    public void setTabBarItemActiveIndicatorEnabled(l view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemActiveIndicatorEnabled(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarItemIconColor")
    public void setTabBarItemIconColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemIconColor(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarItemIconColorActive")
    public void setTabBarItemIconColorActive(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemIconColorActive(value);
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemLabelVisibilityMode")
    public void setTabBarItemLabelVisibilityMode(l view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemLabelVisibilityMode(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarItemRippleColor")
    public void setTabBarItemRippleColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemRippleColor(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarItemTitleFontColor")
    public void setTabBarItemTitleFontColor(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemTitleFontColor(value);
    }

    @Override // K7.A
    @B7.a(customType = "Color", name = "tabBarItemTitleFontColorActive")
    public void setTabBarItemTitleFontColorActive(l view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemTitleFontColorActive(value);
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemTitleFontFamily")
    public void setTabBarItemTitleFontFamily(l view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemTitleFontFamily(value);
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemTitleFontSize")
    public void setTabBarItemTitleFontSize(l view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSize(Float.valueOf(value));
        }
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemTitleFontSizeActive")
    public void setTabBarItemTitleFontSizeActive(l view, float value) {
        if (view != null) {
            view.setTabBarItemTitleFontSizeActive(Float.valueOf(value));
        }
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemTitleFontStyle")
    public void setTabBarItemTitleFontStyle(l view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemTitleFontStyle(value);
    }

    @Override // K7.A
    @B7.a(name = "tabBarItemTitleFontWeight")
    public void setTabBarItemTitleFontWeight(l view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemTitleFontWeight(value);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(l parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        if (child instanceof a) {
            parent.A((a) child, index);
            return;
        }
        throw new IllegalArgumentException("[RNScreens] Attempt to attach child that is not of type javaClass");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(l parent, int index) {
        AbstractC5504s.h(parent, "parent");
        parent.H(index);
    }
}
