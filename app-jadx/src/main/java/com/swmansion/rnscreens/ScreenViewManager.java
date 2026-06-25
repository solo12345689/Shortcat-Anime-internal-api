package com.swmansion.rnscreens;

import Ud.AbstractC2279u;
import android.util.Log;
import android.view.View;
import com.adjust.sdk.Constants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.InterfaceC3282a0;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.q0;
import com.swmansion.rnscreens.C4546y;
import java.util.ArrayList;
import java.util.Map;
import k7.InterfaceC5454a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC5454a(name = ScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 q2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001rB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J-\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b(\u0010)J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0014\u0010\u001eJ!\u0010+\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b+\u0010,J!\u0010.\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b.\u0010,J\u001f\u00101\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J!\u00103\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b3\u0010,J!\u00105\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b5\u0010,J!\u00107\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b7\u0010,J!\u00109\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u00108\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\b9\u0010:J!\u0010<\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b<\u0010,J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010=\u001a\u00020/H\u0017¢\u0006\u0004\b>\u00102J\u001f\u0010@\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010?\u001a\u00020/H\u0017¢\u0006\u0004\b@\u00102J!\u0010B\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010A\u001a\u0004\u0018\u00010\u0019H\u0017¢\u0006\u0004\bB\u0010:J\u001f\u0010D\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010C\u001a\u00020/H\u0017¢\u0006\u0004\bD\u00102J\u001f\u0010F\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010E\u001a\u00020/H\u0017¢\u0006\u0004\bF\u00102J\u001f\u0010H\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010G\u001a\u00020/H\u0017¢\u0006\u0004\bH\u00102J!\u0010J\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bJ\u0010\u001eJ!\u0010L\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010K\u001a\u00020/H\u0017¢\u0006\u0004\bL\u00102J!\u0010N\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010M\u001a\u00020/H\u0017¢\u0006\u0004\bN\u00102J#\u0010O\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bO\u0010,J!\u0010P\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bP\u00102J!\u0010Q\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020\u0019H\u0016¢\u0006\u0004\bQ\u0010\u001eJ!\u0010R\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bR\u00102J!\u0010S\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bS\u00102J#\u0010U\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010TH\u0016¢\u0006\u0004\bU\u0010VJ!\u0010W\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bW\u00102J!\u0010X\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\bX\u00102J#\u0010Y\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bY\u0010,J#\u0010Z\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bZ\u0010,J#\u0010[\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b[\u0010,J#\u0010\\\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\\\u0010,J#\u0010]\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b]\u0010,J!\u0010^\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\b^\u00102J!\u0010_\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010I\u001a\u00020/H\u0016¢\u0006\u0004\b_\u00102J!\u0010a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010`H\u0017¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bc\u0010\u001eJ\u001f\u0010d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020/H\u0017¢\u0006\u0004\bd\u00102J\u001f\u0010e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0012H\u0017¢\u0006\u0004\be\u0010\u0015J\u001f\u0010f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020/H\u0017¢\u0006\u0004\bf\u00102J\u001f\u0010g\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u0019H\u0017¢\u0006\u0004\bg\u0010\u001eJ!\u0010h\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010I\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\bh\u0010,J\u001b\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020%0iH\u0016¢\u0006\u0004\bj\u0010kJ\u0015\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00020lH\u0014¢\u0006\u0004\bm\u0010nR\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006s"}, d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/y;", "LK7/J;", "<init>", "()V", "", "propName", "LTd/L;", "logNotAvailable", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/b0;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/b0;)Lcom/swmansion/rnscreens/y;", "view", "", "activityState", "setActivityState", "(Lcom/swmansion/rnscreens/y;F)V", "parent", "Landroid/view/View;", "child", "", "index", "addView", "(Lcom/swmansion/rnscreens/y;Landroid/view/View;I)V", "removeViewAt", "(Lcom/swmansion/rnscreens/y;I)V", "removeView", "(Lcom/swmansion/rnscreens/y;Landroid/view/View;)V", "Lcom/facebook/react/uimanager/Q;", "props", "Lcom/facebook/react/uimanager/a0;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/y;Lcom/facebook/react/uimanager/Q;Lcom/facebook/react/uimanager/a0;)Ljava/lang/Object;", "onAfterUpdateTransaction", "(Lcom/swmansion/rnscreens/y;)V", "presentation", "setStackPresentation", "(Lcom/swmansion/rnscreens/y;Ljava/lang/String;)V", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "(Lcom/swmansion/rnscreens/y;Z)V", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/y;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarTranslucent", "setNavigationBarTranslucent", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setSheetElevation", "sheetShouldOverflowTopInset", "setSheetShouldOverflowTopInset", "sheetDefaultResizeAnimationEnabled", "setSheetDefaultResizeAnimationEnabled", "setFullScreenSwipeEnabled", "setFullScreenSwipeShadowEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "(Lcom/swmansion/rnscreens/y;Lcom/facebook/react/bridge/ReadableMap;)V", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setBottomScrollEdgeEffect", "setLeftScrollEdgeEffect", "setRightScrollEdgeEffect", "setTopScrollEdgeEffect", "setSynchronousShadowStateUpdatesEnabled", "setAndroidResetScreenShadowStateOnOrientationChangeEnabled", "Lcom/facebook/react/bridge/ReadableArray;", "setSheetAllowedDetents", "(Lcom/swmansion/rnscreens/y;Lcom/facebook/react/bridge/ReadableArray;)V", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "setSheetInitialDetent", "setScreenId", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/q0;", "getDelegate", "()Lcom/facebook/react/uimanager/q0;", "delegate", "Lcom/facebook/react/uimanager/q0;", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ScreenViewManager extends ViewGroupManager<C4546y> implements K7.J {
    public static final String REACT_CLASS = "RNSScreen";
    private final q0 delegate;

    public ScreenViewManager() {
        super(null, 1, null);
        this.delegate = new K7.I(this);
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
        return Ud.S.n(Td.z.a("topDismissed", Ud.S.k(Td.z.a("registrationName", "onDismissed"))), Td.z.a("topWillAppear", Ud.S.k(Td.z.a("registrationName", "onWillAppear"))), Td.z.a("topAppear", Ud.S.k(Td.z.a("registrationName", "onAppear"))), Td.z.a("topWillDisappear", Ud.S.k(Td.z.a("registrationName", "onWillDisappear"))), Td.z.a("topDisappear", Ud.S.k(Td.z.a("registrationName", "onDisappear"))), Td.z.a("topHeaderHeightChange", Ud.S.k(Td.z.a("registrationName", "onHeaderHeightChange"))), Td.z.a("topHeaderBackButtonClicked", Ud.S.k(Td.z.a("registrationName", "onHeaderBackButtonClicked"))), Td.z.a("topTransitionProgress", Ud.S.k(Td.z.a("registrationName", "onTransitionProgress"))), Td.z.a("topSheetDetentChanged", Ud.S.k(Td.z.a("registrationName", "onSheetDetentChanged"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC3297m
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // K7.J
    public void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setBottomScrollEdgeEffect(C4546y view, String value) {
    }

    @Override // K7.J
    public void setCustomAnimationOnSwipe(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setFullScreenSwipeEnabled(C4546y view, String value) {
    }

    @Override // K7.J
    public void setFullScreenSwipeShadowEnabled(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setGestureResponseDistance(C4546y view, ReadableMap value) {
    }

    @Override // K7.J
    public void setHideKeyboardOnSwipe(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setHomeIndicatorHidden(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setLeftScrollEdgeEffect(C4546y view, String value) {
    }

    @Override // K7.J
    public void setPreventNativeDismiss(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setRightScrollEdgeEffect(C4546y view, String value) {
    }

    @Override // K7.J
    public void setSwipeDirection(C4546y view, String value) {
    }

    @Override // K7.J
    public void setSynchronousShadowStateUpdatesEnabled(C4546y view, boolean value) {
    }

    @Override // K7.J
    public void setTopScrollEdgeEffect(C4546y view, String value) {
    }

    @Override // K7.J
    public void setTransitionDuration(C4546y view, int value) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C4546y createViewInstance(C3284b0 reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        return new C4546y(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C4546y view) {
        AbstractC5504s.h(view, "view");
        super.onAfterUpdateTransaction(view);
        view.v();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(C4546y parent, View view) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(view, "view");
        super.removeView(parent, view);
        if (view instanceof D) {
            parent.setFooter(null);
        }
    }

    @Override // K7.J
    public void setActivityState(C4546y view, float activityState) {
        AbstractC5504s.h(view, "view");
        setActivityState(view, (int) activityState);
    }

    @Override // K7.J
    @B7.a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(C4546y view, boolean gestureEnabled) {
        AbstractC5504s.h(view, "view");
        view.setGestureEnabled(gestureEnabled);
    }

    @Override // K7.J
    @B7.a(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(C4546y view, boolean nativeBackButtonDismissalEnabled) {
        AbstractC5504s.h(view, "view");
        view.setNativeBackButtonDismissalEnabled(nativeBackButtonDismissalEnabled);
    }

    @Override // K7.J
    @B7.a(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(C4546y view, Integer navigationBarColor) {
        AbstractC5504s.h(view, "view");
        logNotAvailable("navigationBarColor");
    }

    @Override // K7.J
    @B7.a(name = "navigationBarHidden")
    public void setNavigationBarHidden(C4546y view, boolean navigationBarHidden) {
        AbstractC5504s.h(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(navigationBarHidden));
    }

    @Override // K7.J
    @B7.a(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(C4546y view, boolean navigationBarTranslucent) {
        AbstractC5504s.h(view, "view");
        logNotAvailable("navigationBarTranslucent");
    }

    @Override // K7.J
    @B7.a(name = "replaceAnimation")
    public void setReplaceAnimation(C4546y view, String animation) {
        C4546y.c cVar;
        AbstractC5504s.h(view, "view");
        if (animation == null || AbstractC5504s.c(animation, "pop")) {
            cVar = C4546y.c.f44793b;
        } else {
            if (!AbstractC5504s.c(animation, Constants.PUSH)) {
                throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + animation);
            }
            cVar = C4546y.c.f44792a;
        }
        view.setReplaceAnimation(cVar);
    }

    @Override // K7.J
    public void setScreenId(C4546y view, String value) {
        AbstractC5504s.h(view, "view");
        if (value == null || value.length() == 0) {
            value = null;
        }
        view.setScreenId(value);
    }

    @Override // K7.J
    @B7.a(name = "screenOrientation")
    public void setScreenOrientation(C4546y view, String screenOrientation) {
        AbstractC5504s.h(view, "view");
        view.setScreenOrientation(screenOrientation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // K7.J
    @B7.a(name = "sheetAllowedDetents")
    public void setSheetAllowedDetents(C4546y view, ReadableArray value) {
        ?? E10;
        AbstractC5504s.h(view, "view");
        if (value == null || value.size() <= 0) {
            E10 = AbstractC2279u.e(Double.valueOf(1.0d));
        } else {
            int size = value.size();
            E10 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                E10.add(Double.valueOf(value.getDouble(i10)));
            }
        }
        view.setSheetDetents(new Sa.p(E10));
    }

    @Override // K7.J
    @B7.a(name = "sheetCornerRadius")
    public void setSheetCornerRadius(C4546y view, float value) {
        AbstractC5504s.h(view, "view");
        view.setSheetCornerRadius(value);
    }

    @Override // K7.J
    @B7.a(name = "sheetDefaultResizeAnimationEnabled")
    public void setSheetDefaultResizeAnimationEnabled(C4546y view, boolean sheetDefaultResizeAnimationEnabled) {
        if (view != null) {
            view.setSheetDefaultResizeAnimationEnabled(sheetDefaultResizeAnimationEnabled);
        }
    }

    @Override // K7.J
    @B7.a(name = "sheetElevation")
    public void setSheetElevation(C4546y view, int value) {
        if (view != null) {
            view.setSheetElevation(value);
        }
    }

    @Override // K7.J
    @B7.a(name = "sheetExpandsWhenScrolledToEdge")
    public void setSheetExpandsWhenScrolledToEdge(C4546y view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setSheetExpandsWhenScrolledToEdge(value);
    }

    @Override // K7.J
    @B7.a(name = "sheetGrabberVisible")
    public void setSheetGrabberVisible(C4546y view, boolean value) {
        AbstractC5504s.h(view, "view");
        view.setSheetGrabberVisible(value);
    }

    @Override // K7.J
    @B7.a(name = "sheetInitialDetent")
    public void setSheetInitialDetent(C4546y view, int value) {
        AbstractC5504s.h(view, "view");
        view.setSheetInitialDetentIndex(value);
    }

    @Override // K7.J
    @B7.a(name = "sheetLargestUndimmedDetent")
    public void setSheetLargestUndimmedDetent(C4546y view, int value) {
        AbstractC5504s.h(view, "view");
        if (-1 > value || value >= 3) {
            throw new IllegalStateException("[RNScreens] sheetLargestUndimmedDetent on Android supports values between -1 and 2");
        }
        view.setSheetLargestUndimmedDetentIndex(value);
    }

    @Override // K7.J
    @B7.a(name = "sheetShouldOverflowTopInset")
    public void setSheetShouldOverflowTopInset(C4546y view, boolean sheetShouldOverflowTopInset) {
        if (view != null) {
            view.setSheetShouldOverflowTopInset(sheetShouldOverflowTopInset);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4.equals("default") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.equals("flip") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0083, code lost:
    
        if (r4.equals("simple_push") != false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // K7.J
    @B7.a(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackAnimation(com.swmansion.rnscreens.C4546y r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.y, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r4.equals("fullScreenModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4.equals("containedTransparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4.equals("pageSheet") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r4.equals("containedModal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r4.equals("modal") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4 = com.swmansion.rnscreens.C4546y.e.f44808b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r4.equals("transparentModal") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        r4 = com.swmansion.rnscreens.C4546y.e.f44809c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // K7.J
    @B7.a(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackPresentation(com.swmansion.rnscreens.C4546y r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.AbstractC5504s.h(r3, r0)
            if (r4 == 0) goto L62
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L54;
                case 3452698: goto L49;
                case 104069805: goto L3e;
                case 438078970: goto L35;
                case 872434704: goto L2c;
                case 955284238: goto L23;
                case 1171936146: goto L1a;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L62
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.y$e r4 = com.swmansion.rnscreens.C4546y.e.f44810d
            goto L5e
        L1a:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L23:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L5c
        L2c:
            java.lang.String r0 = "pageSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L35:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            goto L46
        L3e:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L46:
            com.swmansion.rnscreens.y$e r4 = com.swmansion.rnscreens.C4546y.e.f44808b
            goto L5e
        L49:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
            com.swmansion.rnscreens.y$e r4 = com.swmansion.rnscreens.C4546y.e.f44807a
            goto L5e
        L54:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L62
        L5c:
            com.swmansion.rnscreens.y$e r4 = com.swmansion.rnscreens.C4546y.e.f44809c
        L5e:
            r3.setStackPresentation(r4)
            return
        L62:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.y, java.lang.String):void");
    }

    @Override // K7.J
    @B7.a(name = "statusBarAnimation")
    public void setStatusBarAnimation(C4546y view, String statusBarAnimation) {
        AbstractC5504s.h(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((statusBarAnimation == null || AbstractC5504s.c("none", statusBarAnimation)) ? false : true));
    }

    @Override // K7.J
    @B7.a(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(C4546y view, Integer statusBarColor) {
        AbstractC5504s.h(view, "view");
        logNotAvailable("statusBarColor");
    }

    @Override // K7.J
    @B7.a(name = "statusBarHidden")
    public void setStatusBarHidden(C4546y view, boolean statusBarHidden) {
        AbstractC5504s.h(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(statusBarHidden));
    }

    @Override // K7.J
    @B7.a(name = "statusBarStyle")
    public void setStatusBarStyle(C4546y view, String statusBarStyle) {
        AbstractC5504s.h(view, "view");
        view.setStatusBarStyle(statusBarStyle);
    }

    @Override // K7.J
    @B7.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C4546y view, boolean statusBarTranslucent) {
        AbstractC5504s.h(view, "view");
        logNotAvailable("statusBarTranslucent");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C4546y view, com.facebook.react.uimanager.Q props, InterfaceC3282a0 stateWrapper) {
        AbstractC5504s.h(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C4546y parent, View child, int index) {
        AbstractC5504s.h(parent, "parent");
        AbstractC5504s.h(child, "child");
        if (child instanceof B) {
            parent.z((B) child);
        } else if (child instanceof D) {
            parent.setFooter((D) child);
        }
        super.addView(parent, child, index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C4546y parent, int index) {
        AbstractC5504s.h(parent, "parent");
        if (parent.getChildAt(index) instanceof D) {
            parent.setFooter(null);
        }
        super.removeViewAt(parent, index);
    }

    @B7.a(name = "activityState")
    public final void setActivityState(C4546y view, int activityState) {
        AbstractC5504s.h(view, "view");
        if (activityState == -1) {
            return;
        }
        if (activityState == 0) {
            view.setActivityState(C4546y.a.f44787a);
        } else if (activityState == 1) {
            view.setActivityState(C4546y.a.f44788b);
        } else {
            if (activityState != 2) {
                return;
            }
            view.setActivityState(C4546y.a.f44789c);
        }
    }
}
