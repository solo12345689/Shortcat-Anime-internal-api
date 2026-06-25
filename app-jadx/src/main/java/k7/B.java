package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class B extends AbstractC3285c {
    public B(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    b10 = 0;
                }
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    b10 = 1;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b10 = 2;
                }
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    b10 = 3;
                }
                break;
            case -1770963447:
                if (str.equals("specialEffects")) {
                    b10 = 4;
                }
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    b10 = 5;
                }
                break;
            case -1559978286:
                if (str.equals("iconResourceName")) {
                    b10 = 6;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    b10 = 7;
                }
                break;
            case -1270820115:
                if (str.equals("isFocused")) {
                    b10 = 8;
                }
                break;
            case -1186468415:
                if (str.equals("overrideScrollViewContentInsetAdjustmentBehavior")) {
                    b10 = 9;
                }
                break;
            case -1167193694:
                if (str.equals("isTitleUndefined")) {
                    b10 = 10;
                }
                break;
            case -881409398:
                if (str.equals("tabKey")) {
                    b10 = 11;
                }
                break;
            case -776576227:
                if (str.equals("iconImageSource")) {
                    b10 = 12;
                }
                break;
            case -737911981:
                if (str.equals("iconType")) {
                    b10 = 13;
                }
                break;
            case -558395241:
                if (str.equals("tabBarItemAccessibilityLabel")) {
                    b10 = 14;
                }
                break;
            case -270334418:
                if (str.equals("scrollEdgeAppearance")) {
                    b10 = 15;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    b10 = 16;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    b10 = 17;
                }
                break;
            case 110371416:
                if (str.equals(com.amazon.a.a.o.b.f34626S)) {
                    b10 = 18;
                }
                break;
            case 642560482:
                if (str.equals("systemItem")) {
                    b10 = 19;
                }
                break;
            case 1001537282:
                if (str.equals("selectedIconImageSource")) {
                    b10 = 20;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    b10 = 21;
                }
                break;
            case 1519110851:
                if (str.equals("tabBarItemBadgeBackgroundColor")) {
                    b10 = 22;
                }
                break;
            case 1577043198:
                if (str.equals("tabBarItemTestID")) {
                    b10 = 23;
                }
                break;
            case 1595935908:
                if (str.equals("tabBarItemBadgeTextColor")) {
                    b10 = 24;
                }
                break;
            case 2021932941:
                if (str.equals("selectedIconResourceName")) {
                    b10 = 25;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    b10 = 26;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((C) this.f37554a).setBottomScrollEdgeEffect(view, (String) obj);
                break;
            case 1:
                ((C) this.f37554a).setTopScrollEdgeEffect(view, (String) obj);
                break;
            case 2:
                ((C) this.f37554a).setUserInterfaceStyle(view, (String) obj);
                break;
            case 3:
                ((C) this.f37554a).setLeftScrollEdgeEffect(view, (String) obj);
                break;
            case 4:
                ((C) this.f37554a).setSpecialEffects(view, (ReadableMap) obj);
                break;
            case 5:
                ((C) this.f37554a).setRightScrollEdgeEffect(view, (String) obj);
                break;
            case 6:
                ((C) this.f37554a).setIconResourceName(view, obj != null ? (String) obj : null);
                break;
            case 7:
                ((C) this.f37554a).setOrientation(view, (String) obj);
                break;
            case 8:
                ((C) this.f37554a).setIsFocused(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((C) this.f37554a).setOverrideScrollViewContentInsetAdjustmentBehavior(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((C) this.f37554a).setIsTitleUndefined(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((C) this.f37554a).setTabKey(view, obj != null ? (String) obj : null);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((C) this.f37554a).setIconImageSource(view, (ReadableMap) obj);
                break;
            case 13:
                ((C) this.f37554a).setIconType(view, (String) obj);
                break;
            case 14:
                ((C) this.f37554a).setTabBarItemAccessibilityLabel(view, obj != null ? (String) obj : null);
                break;
            case 15:
                ((C) this.f37554a).setScrollEdgeAppearance(view, new DynamicFromObject(obj));
                break;
            case 16:
                ((C) this.f37554a).setDrawableIconResourceName(view, obj != null ? (String) obj : null);
                break;
            case 17:
                ((C) this.f37554a).setStandardAppearance(view, new DynamicFromObject(obj));
                break;
            case 18:
                ((C) this.f37554a).setTitle(view, obj != null ? (String) obj : null);
                break;
            case 19:
                ((C) this.f37554a).setSystemItem(view, (String) obj);
                break;
            case 20:
                ((C) this.f37554a).setSelectedIconImageSource(view, (ReadableMap) obj);
                break;
            case 21:
                ((C) this.f37554a).setBadgeValue(view, obj != null ? (String) obj : null);
                break;
            case 22:
                ((C) this.f37554a).setTabBarItemBadgeBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 23:
                ((C) this.f37554a).setTabBarItemTestID(view, obj != null ? (String) obj : null);
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                ((C) this.f37554a).setTabBarItemBadgeTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 25:
                ((C) this.f37554a).setSelectedIconResourceName(view, obj != null ? (String) obj : null);
                break;
            case 26:
                ((C) this.f37554a).setImageIconResource(view, (ReadableMap) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
