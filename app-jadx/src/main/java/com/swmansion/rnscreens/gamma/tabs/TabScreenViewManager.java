package com.swmansion.rnscreens.gamma.tabs;

import K7.B;
import K7.C;
import Ud.S;
import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = TabScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0007\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001FB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010!J#\u0010&\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010$J#\u0010'\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010!J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0017¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010!J!\u0010,\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b,\u0010!J!\u0010-\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010!J\u001f\u0010.\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b.\u0010*J!\u0010/\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b/\u0010$J\u001f\u00100\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020(H\u0016¢\u0006\u0004\b0\u0010*J#\u00101\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u0010!J#\u00102\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b2\u0010!J#\u00103\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b3\u0010!J#\u00104\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u0010!J!\u00105\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010!J!\u00106\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b6\u0010!J!\u00107\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b7\u0010\u001fJ!\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b8\u0010!J!\u00109\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b9\u0010!J!\u0010:\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010!J!\u0010;\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b;\u0010!J!\u0010<\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\"H\u0017¢\u0006\u0004\b<\u0010$R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R$\u0010?\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/swmansion/rnscreens/gamma/tabs/TabScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/gamma/tabs/a;", "LK7/C;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/gamma/tabs/a;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "view", "LTd/L;", "addEventEmitters", "(Lcom/facebook/react/uimanager/b0;Lcom/swmansion/rnscreens/gamma/tabs/a;)V", "Lcom/facebook/react/bridge/Dynamic;", "value", "setStandardAppearance", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/facebook/react/bridge/Dynamic;)V", "setScrollEdgeAppearance", "", "setTabBarItemBadgeBackgroundColor", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Ljava/lang/Integer;)V", "setIconType", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setIconImageSource", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/facebook/react/bridge/ReadableMap;)V", "setIconResourceName", "setSelectedIconImageSource", "setSelectedIconResourceName", "", "setIsFocused", "(Lcom/swmansion/rnscreens/gamma/tabs/a;Z)V", "setTabKey", "setBadgeValue", "setTitle", "setIsTitleUndefined", "setSpecialEffects", "setOverrideScrollViewContentInsetAdjustmentBehavior", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setTabBarItemTestID", "setTabBarItemAccessibilityLabel", "setTabBarItemBadgeTextColor", "setDrawableIconResourceName", "setOrientation", "setSystemItem", "setUserInterfaceStyle", "setImageIconResource", "delegate", "Lcom/facebook/react/uimanager/q0;", "context", "Lcom/facebook/react/uimanager/b0;", "getContext", "()Lcom/facebook/react/uimanager/b0;", "setContext", "(Lcom/facebook/react/uimanager/b0;)V", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TabScreenViewManager extends ViewGroupManager<a> implements C {
    public static final String REACT_CLASS = "RNSBottomTabsScreen";
    private C3284b0 context;
    private final q0 delegate;

    public TabScreenViewManager() {
        super(null, 1, null);
        this.delegate = new B(this);
    }

    public final C3284b0 getContext() {
        return this.context;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return S.n(Xa.a.a(Za.c.f23236a), Xa.a.a(Za.a.f23234a), Xa.a.a(Za.d.f23237a), Xa.a.a(Za.b.f23235a));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // K7.C
    public void setBottomScrollEdgeEffect(a view, String value) {
    }

    public final void setContext(C3284b0 c3284b0) {
        this.context = c3284b0;
    }

    @Override // K7.C
    public void setIconImageSource(a view, ReadableMap value) {
    }

    @Override // K7.C
    public void setIconResourceName(a view, String value) {
    }

    @Override // K7.C
    public void setIconType(a view, String value) {
    }

    @Override // K7.C
    public void setIsTitleUndefined(a view, boolean value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.C
    public void setLeftScrollEdgeEffect(a view, String value) {
    }

    @Override // K7.C
    public void setOrientation(a view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.C
    public void setOverrideScrollViewContentInsetAdjustmentBehavior(a view, boolean value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.C
    public void setRightScrollEdgeEffect(a view, String value) {
    }

    @Override // K7.C
    public void setScrollEdgeAppearance(a view, Dynamic value) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(value, "value");
    }

    @Override // K7.C
    public void setSelectedIconImageSource(a view, ReadableMap value) {
    }

    @Override // K7.C
    public void setSelectedIconResourceName(a view, String value) {
    }

    @Override // K7.C
    public void setStandardAppearance(a view, Dynamic value) {
        AbstractC5504s.h(view, "view");
        AbstractC5504s.h(value, "value");
    }

    @Override // K7.C
    public void setSystemItem(a view, String value) {
        AbstractC5504s.h(view, "view");
    }

    @Override // K7.C
    public void setTopScrollEdgeEffect(a view, String value) {
    }

    @Override // K7.C
    public void setUserInterfaceStyle(a view, String value) {
        AbstractC5504s.h(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C3284b0 reactContext, a view) {
        AbstractC5504s.h(reactContext, "reactContext");
        AbstractC5504s.h(view, "view");
        super.addEventEmitters(reactContext, view);
        view.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        fb.e.f46994a.a(REACT_CLASS, "createViewInstance");
        return new a(reactContext);
    }

    @Override // K7.C
    @B7.a(name = "badgeValue")
    public void setBadgeValue(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setBadgeValue(value);
    }

    @Override // K7.C
    @B7.a(name = "drawableIconResourceName")
    public void setDrawableIconResourceName(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setDrawableIconResourceName(value);
    }

    @Override // K7.C
    @B7.a(name = "imageIconResource")
    public void setImageIconResource(a view, ReadableMap value) {
        AbstractC5504s.h(view, "view");
        String string = value != null ? value.getString("uri") : null;
        if (string != null) {
            Context context = view.getContext();
            AbstractC5504s.g(context, "getContext(...)");
            ab.e.c(context, string, view);
        }
    }

    @Override // K7.C
    @B7.a(name = "isFocused")
    public void setIsFocused(a view, boolean value) {
        AbstractC5504s.h(view, "view");
        fb.e.f46994a.a(REACT_CLASS, "TabScreen [" + view.getId() + "] setIsFocused " + value);
        view.setFocusedTab(value);
    }

    @Override // K7.C
    @B7.a(name = "specialEffects")
    public void setSpecialEffects(a view, ReadableMap value) {
        boolean z10;
        ReadableMap map;
        AbstractC5504s.h(view, "view");
        boolean z11 = true;
        if (!(value != null ? value.hasKey("repeatedTabSelection") : false) || (map = value.getMap("repeatedTabSelection")) == null) {
            z10 = true;
        } else {
            z10 = map.hasKey("scrollToTop") ? map.getBoolean("scrollToTop") : true;
            if (map.hasKey("popToRoot")) {
                z11 = map.getBoolean("popToRoot");
            }
        }
        view.setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(z11);
        view.setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(z10);
    }

    @Override // K7.C
    @B7.a(name = "tabBarItemAccessibilityLabel")
    public void setTabBarItemAccessibilityLabel(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemAccessibilityLabel(value);
    }

    @Override // K7.C
    @B7.a(customType = "Color", name = "tabBarItemBadgeBackgroundColor")
    public void setTabBarItemBadgeBackgroundColor(a view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemBadgeBackgroundColor(value);
    }

    @Override // K7.C
    @B7.a(customType = "Color", name = "tabBarItemBadgeTextColor")
    public void setTabBarItemBadgeTextColor(a view, Integer value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemBadgeTextColor(value);
    }

    @Override // K7.C
    @B7.a(name = "tabBarItemTestID")
    public void setTabBarItemTestID(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabBarItemTestID(value);
    }

    @Override // K7.C
    @B7.a(name = "tabKey")
    public void setTabKey(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabKey(value);
    }

    @Override // K7.C
    @B7.a(name = com.amazon.a.a.o.b.f34626S)
    public void setTitle(a view, String value) {
        AbstractC5504s.h(view, "view");
        view.setTabTitle(value);
    }
}
