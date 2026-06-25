package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class I extends AbstractC3285c {
    public I(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -2035671681:
                b10 = !str.equals("synchronousShadowStateUpdatesEnabled") ? (byte) -1 : (byte) 0;
                break;
            case -1991728986:
                b10 = !str.equals("bottomScrollEdgeEffect") ? (byte) -1 : (byte) 1;
                break;
            case -1937389126:
                b10 = !str.equals("homeIndicatorHidden") ? (byte) -1 : (byte) 2;
                break;
            case -1871891504:
                b10 = !str.equals("topScrollEdgeEffect") ? (byte) -1 : (byte) 3;
                break;
            case -1853558344:
                b10 = !str.equals("gestureEnabled") ? (byte) -1 : (byte) 4;
                break;
            case -1791070590:
                b10 = !str.equals("leftScrollEdgeEffect") ? (byte) -1 : (byte) 5;
                break;
            case -1734097646:
                b10 = !str.equals("hideKeyboardOnSwipe") ? (byte) -1 : (byte) 6;
                break;
            case -1628518761:
                b10 = !str.equals("rightScrollEdgeEffect") ? (byte) -1 : (byte) 7;
                break;
            case -1349152186:
                b10 = !str.equals("sheetCornerRadius") ? (byte) -1 : (byte) 8;
                break;
            case -1322084375:
                b10 = !str.equals("navigationBarHidden") ? (byte) -1 : (byte) 9;
                break;
            case -1156137512:
                b10 = !str.equals("statusBarTranslucent") ? (byte) -1 : (byte) 10;
                break;
            case -1150711358:
                b10 = !str.equals("stackPresentation") ? (byte) -1 : (byte) 11;
                break;
            case -1047235902:
                b10 = !str.equals("activityState") ? (byte) -1 : (byte) 12;
                break;
            case -973702878:
                b10 = !str.equals("statusBarColor") ? (byte) -1 : (byte) 13;
                break;
            case -958765200:
                b10 = !str.equals("statusBarStyle") ? (byte) -1 : (byte) 14;
                break;
            case -952227806:
                b10 = !str.equals("fullScreenSwipeShadowEnabled") ? (byte) -1 : (byte) 15;
                break;
            case -577711652:
                b10 = !str.equals("stackAnimation") ? (byte) -1 : (byte) 16;
                break;
            case -462720700:
                b10 = !str.equals("navigationBarColor") ? (byte) -1 : (byte) 17;
                break;
            case -411607385:
                b10 = !str.equals("screenId") ? (byte) -1 : (byte) 18;
                break;
            case -381571779:
                b10 = !str.equals("sheetInitialDetent") ? (byte) -1 : (byte) 19;
                break;
            case -274098190:
                b10 = !str.equals("sheetAllowedDetents") ? (byte) -1 : (byte) 20;
                break;
            case -257141968:
                b10 = !str.equals("replaceAnimation") ? (byte) -1 : (byte) 21;
                break;
            case -166356101:
                b10 = !str.equals("preventNativeDismiss") ? (byte) -1 : (byte) 22;
                break;
            case 17337291:
                b10 = !str.equals("statusBarHidden") ? (byte) -1 : (byte) 23;
                break;
            case 129956386:
                b10 = !str.equals("fullScreenSwipeEnabled") ? (byte) -1 : (byte) 24;
                break;
            case 187703999:
                b10 = !str.equals("gestureResponseDistance") ? (byte) -1 : (byte) 25;
                break;
            case 227582404:
                b10 = !str.equals("screenOrientation") ? (byte) -1 : (byte) 26;
                break;
            case 241896530:
                b10 = !str.equals("sheetLargestUndimmedDetent") ? (byte) -1 : (byte) 27;
                break;
            case 425064969:
                b10 = !str.equals("transitionDuration") ? (byte) -1 : (byte) 28;
                break;
            case 658632444:
                b10 = !str.equals("sheetShouldOverflowTopInset") ? (byte) -1 : (byte) 29;
                break;
            case 1082157413:
                b10 = !str.equals("swipeDirection") ? (byte) -1 : (byte) 30;
                break;
            case 1110843912:
                b10 = !str.equals("customAnimationOnSwipe") ? (byte) -1 : (byte) 31;
                break;
            case 1116050554:
                b10 = !str.equals("navigationBarTranslucent") ? (byte) -1 : (byte) 32;
                break;
            case 1269009342:
                b10 = !str.equals("sheetElevation") ? (byte) -1 : (byte) 33;
                break;
            case 1287164531:
                b10 = !str.equals("sheetDefaultResizeAnimationEnabled") ? (byte) -1 : (byte) 34;
                break;
            case 1357942638:
                b10 = !str.equals("sheetGrabberVisible") ? (byte) -1 : (byte) 35;
                break;
            case 1387359683:
                b10 = !str.equals("statusBarAnimation") ? (byte) -1 : (byte) 36;
                break;
            case 1729091548:
                b10 = !str.equals("nativeBackButtonDismissalEnabled") ? (byte) -1 : (byte) 37;
                break;
            case 2029667685:
                b10 = !str.equals("androidResetScreenShadowStateOnOrientationChangeEnabled") ? (byte) -1 : (byte) 38;
                break;
            case 2097450072:
                b10 = !str.equals("sheetExpandsWhenScrolledToEdge") ? (byte) -1 : (byte) 39;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                ((J) this.f37554a).setSynchronousShadowStateUpdatesEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((J) this.f37554a).setBottomScrollEdgeEffect(view, (String) obj);
                break;
            case 2:
                ((J) this.f37554a).setHomeIndicatorHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((J) this.f37554a).setTopScrollEdgeEffect(view, (String) obj);
                break;
            case 4:
                ((J) this.f37554a).setGestureEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 5:
                ((J) this.f37554a).setLeftScrollEdgeEffect(view, (String) obj);
                break;
            case 6:
                ((J) this.f37554a).setHideKeyboardOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 7:
                ((J) this.f37554a).setRightScrollEdgeEffect(view, (String) obj);
                break;
            case 8:
                ((J) this.f37554a).setSheetCornerRadius(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 9:
                ((J) this.f37554a).setNavigationBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((J) this.f37554a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((J) this.f37554a).setStackPresentation(view, (String) obj);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((J) this.f37554a).setActivityState(view, obj != null ? ((Double) obj).floatValue() : -1.0f);
                break;
            case 13:
                ((J) this.f37554a).setStatusBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 14:
                ((J) this.f37554a).setStatusBarStyle(view, obj != null ? (String) obj : null);
                break;
            case 15:
                ((J) this.f37554a).setFullScreenSwipeShadowEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 16:
                ((J) this.f37554a).setStackAnimation(view, (String) obj);
                break;
            case 17:
                ((J) this.f37554a).setNavigationBarColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 18:
                ((J) this.f37554a).setScreenId(view, obj == null ? "" : (String) obj);
                break;
            case 19:
                ((J) this.f37554a).setSheetInitialDetent(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 20:
                ((J) this.f37554a).setSheetAllowedDetents(view, (ReadableArray) obj);
                break;
            case 21:
                ((J) this.f37554a).setReplaceAnimation(view, (String) obj);
                break;
            case 22:
                ((J) this.f37554a).setPreventNativeDismiss(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 23:
                ((J) this.f37554a).setStatusBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                ((J) this.f37554a).setFullScreenSwipeEnabled(view, (String) obj);
                break;
            case 25:
                ((J) this.f37554a).setGestureResponseDistance(view, (ReadableMap) obj);
                break;
            case 26:
                ((J) this.f37554a).setScreenOrientation(view, obj != null ? (String) obj : null);
                break;
            case 27:
                ((J) this.f37554a).setSheetLargestUndimmedDetent(view, obj != null ? ((Double) obj).intValue() : -1);
                break;
            case 28:
                ((J) this.f37554a).setTransitionDuration(view, obj == null ? 500 : ((Double) obj).intValue());
                break;
            case 29:
                ((J) this.f37554a).setSheetShouldOverflowTopInset(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((J) this.f37554a).setSwipeDirection(view, (String) obj);
                break;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                ((J) this.f37554a).setCustomAnimationOnSwipe(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 32:
                ((J) this.f37554a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 33:
                ((J) this.f37554a).setSheetElevation(view, obj != null ? ((Double) obj).intValue() : 24);
                break;
            case 34:
                ((J) this.f37554a).setSheetDefaultResizeAnimationEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 35:
                ((J) this.f37554a).setSheetGrabberVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 36:
                ((J) this.f37554a).setStatusBarAnimation(view, obj != null ? (String) obj : null);
                break;
            case 37:
                ((J) this.f37554a).setNativeBackButtonDismissalEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 38:
                ((J) this.f37554a).setAndroidResetScreenShadowStateOnOrientationChangeEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 39:
                ((J) this.f37554a).setSheetExpandsWhenScrolledToEdge(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
