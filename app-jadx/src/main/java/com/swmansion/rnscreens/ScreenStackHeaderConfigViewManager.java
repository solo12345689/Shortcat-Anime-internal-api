package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 o2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001pB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\b2\b\b\u0001\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0014¢\u0006\u0004\b1\u0010&J!\u00104\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u00105J\u001f\u00109\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u00108\u001a\u00020\u0019H\u0017¢\u0006\u0004\b9\u0010)J!\u0010;\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b;\u00105J!\u0010=\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010<\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b@\u0010>J\u001f\u0010B\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010A\u001a\u00020.H\u0017¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010D\u001a\u00020.H\u0017¢\u0006\u0004\bE\u0010CJ\u001f\u0010G\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010F\u001a\u00020.H\u0017¢\u0006\u0004\bG\u0010CJ!\u0010I\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010H\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bI\u0010>J\u001f\u0010K\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010J\u001a\u00020.H\u0017¢\u0006\u0004\bK\u0010CJ\u001f\u0010M\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010L\u001a\u00020.H\u0017¢\u0006\u0004\bM\u0010CJ\u001f\u0010O\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\u0006\u0010N\u001a\u00020.H\u0017¢\u0006\u0004\bO\u0010CJ!\u0010Q\u001a\u00020\b2\u0006\u00102\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\bQ\u00105J!\u0010S\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020.H\u0016¢\u0006\u0004\bS\u0010CJ\u001b\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\"0TH\u0016¢\u0006\u0004\bU\u0010VJ\u0015\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020WH\u0014¢\u0006\u0004\bX\u0010YJ#\u0010Z\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u00105J#\u0010[\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u00105J!\u0010\\\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\\\u0010)J!\u0010]\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020.H\u0016¢\u0006\u0004\b]\u0010CJ!\u0010^\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020.H\u0016¢\u0006\u0004\b^\u0010CJ#\u0010_\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b_\u00105J!\u0010`\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\b`\u0010)J#\u0010a\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\ba\u00105J#\u0010b\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bb\u0010>J!\u0010c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020.H\u0016¢\u0006\u0004\bc\u0010CJ#\u0010d\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bd\u0010>J!\u0010e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010R\u001a\u00020.H\u0016¢\u0006\u0004\be\u0010CJ#\u0010f\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bf\u00105J#\u0010g\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bg\u00105J#\u0010i\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bi\u0010jJ#\u0010k\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010hH\u0016¢\u0006\u0004\bk\u0010jJ#\u0010l\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bl\u00105R\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010n¨\u0006q"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/a0;", "LK7/L;", "<init>", "()V", "", "propName", "LTd/L;", "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/a0;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/r;", "createShadowNodeInstance", "(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/uimanager/r;", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/a0;Landroid/view/View;I)V", "view", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/a0;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "onDropViewInstance", "(Lcom/swmansion/rnscreens/a0;)V", "removeAllViews", "removeViewAt", "(Lcom/swmansion/rnscreens/a0;I)V", "getChildCount", "(Lcom/swmansion/rnscreens/a0;)I", "getChildAt", "(Lcom/swmansion/rnscreens/a0;I)Landroid/view/View;", "", "needsCustomLayoutForChildren", "()Z", "onAfterUpdateTransaction", "config", com.amazon.a.a.o.b.f34626S, "setTitle", "(Lcom/swmansion/rnscreens/a0;Ljava/lang/String;)V", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/a0;Ljava/lang/Integer;)V", "backgroundColor", "setBackgroundColor", "hideShadow", "setHideShadow", "(Lcom/swmansion/rnscreens/a0;Z)V", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", "color", "setColor", "hidden", "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "value", "setSynchronousShadowStateUpdatesEnabled", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "setBackButtonDisplayMode", "setBlurEffect", "Lcom/facebook/react/bridge/ReadableArray;", "setHeaderLeftBarButtonItems", "(Lcom/swmansion/rnscreens/a0;Lcom/facebook/react/bridge/ReadableArray;)V", "setHeaderRightBarButtonItems", "setUserInterfaceStyle", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<a0> implements K7.L {
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final q0 delegate;

    public ScreenStackHeaderConfigViewManager() {
        super(null, 1, null);
        this.delegate = new K7.K(this);
    }

    private final void logNotAvailable(String propName) {
        Log.w("[RNScreens]", propName + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return Ud.S.k(Td.z.a("topAttached", Ud.S.k(Td.z.a("registrationName", "onAttached"))), Td.z.a("topDetached", Ud.S.k(Td.z.a("registrationName", "onDetached"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3298n
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // K7.L
    public void setSynchronousShadowStateUpdatesEnabled(a0 config, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.r createShadowNodeInstance(ReactApplicationContext context) {
        AbstractC5504s.h(context, "context");
        return new b0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a0 createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new a0(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a0 parent) {
        AbstractC5504s.h(parent, "parent");
        super.onAfterUpdateTransaction(parent);
        parent.l();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(a0 view) {
        AbstractC5504s.h(view, "view");
        view.f();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public void removeAllViews(a0 parent) {
        AbstractC5504s.h(parent, "parent");
        parent.m();
    }

    @Override // K7.L
    public void setBackButtonDisplayMode(a0 view, String value) {
        logNotAvailable("backButtonDisplayMode");
    }

    @Override // K7.L
    @B7.a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(a0 config, boolean backButtonInCustomView) {
        AbstractC5504s.h(config, "config");
        config.setBackButtonInCustomView(backButtonInCustomView);
    }

    @Override // K7.L
    public void setBackTitle(a0 view, String value) {
        logNotAvailable("backTitle");
    }

    @Override // K7.L
    public void setBackTitleFontFamily(a0 view, String value) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // K7.L
    public void setBackTitleFontSize(a0 view, int value) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // K7.L
    public void setBackTitleVisible(a0 view, boolean value) {
        logNotAvailable("backTitleVisible");
    }

    @Override // K7.L
    @B7.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(a0 config, Integer backgroundColor) {
        AbstractC5504s.h(config, "config");
        config.setBackgroundColor(backgroundColor);
    }

    @Override // K7.L
    public void setBlurEffect(a0 view, String value) {
        logNotAvailable("blurEffect");
    }

    @Override // K7.L
    @B7.a(customType = "Color", name = "color")
    public void setColor(a0 config, Integer color) {
        AbstractC5504s.h(config, "config");
        config.setTintColor(color != null ? color.intValue() : 0);
    }

    @Override // K7.L
    @B7.a(name = "direction")
    public void setDirection(a0 config, String direction) {
        AbstractC5504s.h(config, "config");
        config.setDirection(direction);
    }

    @Override // K7.L
    public void setDisableBackButtonMenu(a0 view, boolean value) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // K7.L
    public void setHeaderLeftBarButtonItems(a0 view, ReadableArray value) {
        logNotAvailable("headerLeftBarButtonItems");
    }

    @Override // K7.L
    public void setHeaderRightBarButtonItems(a0 view, ReadableArray value) {
        logNotAvailable("headerRightBarButtonItems");
    }

    @Override // K7.L
    @B7.a(name = "hidden")
    public void setHidden(a0 config, boolean hidden) {
        AbstractC5504s.h(config, "config");
        config.setHidden(hidden);
    }

    @Override // K7.L
    @B7.a(name = "hideBackButton")
    public void setHideBackButton(a0 config, boolean hideBackButton) {
        AbstractC5504s.h(config, "config");
        config.setHideBackButton(hideBackButton);
    }

    @Override // K7.L
    @B7.a(name = "hideShadow")
    public void setHideShadow(a0 config, boolean hideShadow) {
        AbstractC5504s.h(config, "config");
        config.setHideShadow(hideShadow);
    }

    @Override // K7.L
    public void setLargeTitle(a0 view, boolean value) {
        logNotAvailable("largeTitle");
    }

    @Override // K7.L
    public void setLargeTitleBackgroundColor(a0 view, Integer value) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // K7.L
    public void setLargeTitleColor(a0 view, Integer value) {
        logNotAvailable("largeTitleColor");
    }

    @Override // K7.L
    public void setLargeTitleFontFamily(a0 view, String value) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // K7.L
    public void setLargeTitleFontSize(a0 view, int value) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // K7.L
    public void setLargeTitleFontWeight(a0 view, String value) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // K7.L
    public void setLargeTitleHideShadow(a0 view, boolean value) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // K7.L
    @B7.a(name = com.amazon.a.a.o.b.f34626S)
    public void setTitle(a0 config, String title) {
        AbstractC5504s.h(config, "config");
        config.setTitle(title);
    }

    @Override // K7.L
    @B7.a(customType = "Color", name = "titleColor")
    public void setTitleColor(a0 config, Integer titleColor) {
        AbstractC5504s.h(config, "config");
        if (titleColor != null) {
            config.setTitleColor(titleColor.intValue());
        }
    }

    @Override // K7.L
    @B7.a(name = "titleFontFamily")
    public void setTitleFontFamily(a0 config, String titleFontFamily) {
        AbstractC5504s.h(config, "config");
        config.setTitleFontFamily(titleFontFamily);
    }

    @Override // K7.L
    @B7.a(name = "titleFontSize")
    public void setTitleFontSize(a0 config, int titleFontSize) {
        AbstractC5504s.h(config, "config");
        config.setTitleFontSize(titleFontSize);
    }

    @Override // K7.L
    @B7.a(name = "titleFontWeight")
    public void setTitleFontWeight(a0 config, String titleFontWeight) {
        AbstractC5504s.h(config, "config");
        config.setTitleFontWeight(titleFontWeight);
    }

    @Override // K7.L
    @B7.a(name = "topInsetEnabled")
    public void setTopInsetEnabled(a0 config, boolean topInsetEnabled) {
        AbstractC5504s.h(config, "config");
        logNotAvailable("topInsetEnabled");
    }

    @Override // K7.L
    @B7.a(name = "translucent")
    public void setTranslucent(a0 config, boolean translucent) {
        AbstractC5504s.h(config, "config");
        config.setTranslucent(translucent);
    }

    @Override // K7.L
    public void setUserInterfaceStyle(a0 view, String value) {
        logNotAvailable("userInterfaceStyle");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(a0 view, com.facebook.react.uimanager.Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(a0 parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        if (child instanceof d0) {
            parent.d((d0) child, index);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(a0 parent, int index) {
        AbstractC5504s.h(parent, "parent");
        return parent.g(index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(a0 parent) {
        AbstractC5504s.h(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(a0 parent, int index) {
        AbstractC5504s.h(parent, "parent");
        parent.n(index);
    }
}
