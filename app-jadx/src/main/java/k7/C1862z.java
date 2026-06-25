package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: renamed from: K7.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1862z extends AbstractC3285c {
    public C1862z(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1873119606:
                if (str.equals("tabBarTintColor")) {
                    b10 = 0;
                }
                break;
            case -1716883528:
                if (str.equals("tabBarItemLabelVisibilityMode")) {
                    b10 = 1;
                }
                break;
            case -1583805635:
                if (str.equals("tabBarControllerMode")) {
                    b10 = 2;
                }
                break;
            case -1167805191:
                if (str.equals("tabBarItemIconColor")) {
                    b10 = 3;
                }
                break;
            case -1140765365:
                if (str.equals("tabBarItemActiveIndicatorColor")) {
                    b10 = 4;
                }
                break;
            case -727132909:
                if (str.equals("tabBarItemTitleFontColorActive")) {
                    b10 = 5;
                }
                break;
            case -149697865:
                if (str.equals("tabBarBackgroundColor")) {
                    b10 = 6;
                }
                break;
            case -141083017:
                if (str.equals("tabBarItemTitleFontSize")) {
                    b10 = 7;
                }
                break;
            case -93216851:
                if (str.equals("tabBarItemTitleFontColor")) {
                    b10 = 8;
                }
                break;
            case -78279173:
                if (str.equals("tabBarItemTitleFontStyle")) {
                    b10 = 9;
                }
                break;
            case 144476014:
                if (str.equals("tabBarMinimizeBehavior")) {
                    b10 = 10;
                }
                break;
            case 278168456:
                if (str.equals("tabBarHidden")) {
                    b10 = 11;
                }
                break;
            case 595595083:
                if (str.equals("nativeContainerBackgroundColor")) {
                    b10 = 12;
                }
                break;
            case 676974377:
                if (str.equals("tabBarItemActiveIndicatorEnabled")) {
                    b10 = 13;
                }
                break;
            case 697418079:
                if (str.equals("tabBarItemIconColorActive")) {
                    b10 = 14;
                }
                break;
            case 1458977038:
                if (str.equals("controlNavigationStateInJS")) {
                    b10 = 15;
                }
                break;
            case 1478227034:
                if (str.equals("tabBarItemTitleFontFamily")) {
                    b10 = 16;
                }
                break;
            case 1935822306:
                if (str.equals("tabBarItemRippleColor")) {
                    b10 = 17;
                }
                break;
            case 1968495470:
                if (str.equals("tabBarItemTitleFontWeight")) {
                    b10 = 18;
                }
                break;
            case 2018161757:
                if (str.equals("tabBarItemTitleFontSizeActive")) {
                    b10 = 19;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((A) this.f37554a).setTabBarTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 1:
                ((A) this.f37554a).setTabBarItemLabelVisibilityMode(view, (String) obj);
                break;
            case 2:
                ((A) this.f37554a).setTabBarControllerMode(view, (String) obj);
                break;
            case 3:
                ((A) this.f37554a).setTabBarItemIconColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 4:
                ((A) this.f37554a).setTabBarItemActiveIndicatorColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 5:
                ((A) this.f37554a).setTabBarItemTitleFontColorActive(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 6:
                ((A) this.f37554a).setTabBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 7:
                ((A) this.f37554a).setTabBarItemTitleFontSize(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((A) this.f37554a).setTabBarItemTitleFontColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 9:
                ((A) this.f37554a).setTabBarItemTitleFontStyle(view, obj != null ? (String) obj : null);
                break;
            case 10:
                ((A) this.f37554a).setTabBarMinimizeBehavior(view, (String) obj);
                break;
            case 11:
                ((A) this.f37554a).setTabBarHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((A) this.f37554a).setNativeContainerBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 13:
                ((A) this.f37554a).setTabBarItemActiveIndicatorEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 14:
                ((A) this.f37554a).setTabBarItemIconColorActive(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 15:
                ((A) this.f37554a).setControlNavigationStateInJS(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((A) this.f37554a).setTabBarItemTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case 17:
                ((A) this.f37554a).setTabBarItemRippleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 18:
                ((A) this.f37554a).setTabBarItemTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case 19:
                ((A) this.f37554a).setTabBarItemTitleFontSizeActive(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
