package K7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public interface J extends com.facebook.react.uimanager.A0 {
    void setActivityState(View view, float f10);

    void setAndroidResetScreenShadowStateOnOrientationChangeEnabled(View view, boolean z10);

    void setBottomScrollEdgeEffect(View view, String str);

    void setCustomAnimationOnSwipe(View view, boolean z10);

    void setFullScreenSwipeEnabled(View view, String str);

    void setFullScreenSwipeShadowEnabled(View view, boolean z10);

    void setGestureEnabled(View view, boolean z10);

    void setGestureResponseDistance(View view, ReadableMap readableMap);

    void setHideKeyboardOnSwipe(View view, boolean z10);

    void setHomeIndicatorHidden(View view, boolean z10);

    void setLeftScrollEdgeEffect(View view, String str);

    void setNativeBackButtonDismissalEnabled(View view, boolean z10);

    void setNavigationBarColor(View view, Integer num);

    void setNavigationBarHidden(View view, boolean z10);

    void setNavigationBarTranslucent(View view, boolean z10);

    void setPreventNativeDismiss(View view, boolean z10);

    void setReplaceAnimation(View view, String str);

    void setRightScrollEdgeEffect(View view, String str);

    void setScreenId(View view, String str);

    void setScreenOrientation(View view, String str);

    void setSheetAllowedDetents(View view, ReadableArray readableArray);

    void setSheetCornerRadius(View view, float f10);

    void setSheetDefaultResizeAnimationEnabled(View view, boolean z10);

    void setSheetElevation(View view, int i10);

    void setSheetExpandsWhenScrolledToEdge(View view, boolean z10);

    void setSheetGrabberVisible(View view, boolean z10);

    void setSheetInitialDetent(View view, int i10);

    void setSheetLargestUndimmedDetent(View view, int i10);

    void setSheetShouldOverflowTopInset(View view, boolean z10);

    void setStackAnimation(View view, String str);

    void setStackPresentation(View view, String str);

    void setStatusBarAnimation(View view, String str);

    void setStatusBarColor(View view, Integer num);

    void setStatusBarHidden(View view, boolean z10);

    void setStatusBarStyle(View view, String str);

    void setStatusBarTranslucent(View view, boolean z10);

    void setSwipeDirection(View view, String str);

    void setSynchronousShadowStateUpdatesEnabled(View view, boolean z10);

    void setTopScrollEdgeEffect(View view, String str);

    void setTransitionDuration(View view, int i10);
}
