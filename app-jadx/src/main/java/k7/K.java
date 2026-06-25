package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class K extends AbstractC3285c {
    public K(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2035671681:
                if (str.equals("synchronousShadowStateUpdatesEnabled")) {
                    b10 = 0;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b10 = 1;
                }
                break;
            case -1822687399:
                if (str.equals("translucent")) {
                    b10 = 2;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    b10 = 3;
                }
                break;
            case -1795707688:
                if (str.equals("blurEffect")) {
                    b10 = 4;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    b10 = 5;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    b10 = 6;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    b10 = 7;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    b10 = 8;
                }
                break;
            case -1217487446:
                if (str.equals("hidden")) {
                    b10 = 9;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    b10 = 10;
                }
                break;
            case -1093089076:
                if (str.equals("backButtonDisplayMode")) {
                    b10 = 11;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    b10 = 12;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b10 = 13;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    b10 = 14;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    b10 = 15;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    b10 = 16;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b10 = 17;
                }
                break;
            case 110371416:
                if (str.equals(com.amazon.a.a.o.b.f34626S)) {
                    b10 = 18;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    b10 = 19;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    b10 = 20;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    b10 = 21;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    b10 = 22;
                }
                break;
            case 946001674:
                if (str.equals("headerRightBarButtonItems")) {
                    b10 = 23;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    b10 = 24;
                }
                break;
            case 1249557231:
                if (str.equals("headerLeftBarButtonItems")) {
                    b10 = 25;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    b10 = 26;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    b10 = 27;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    b10 = 28;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    b10 = 29;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    b10 = 30;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    b10 = 31;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((L) this.f37554a).setSynchronousShadowStateUpdatesEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((L) this.f37554a).setUserInterfaceStyle(view, (String) obj);
                break;
            case 2:
                ((L) this.f37554a).setTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((L) this.f37554a).setTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 4:
                ((L) this.f37554a).setBlurEffect(view, (String) obj);
                break;
            case 5:
                ((L) this.f37554a).setLargeTitleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 6:
                ((L) this.f37554a).setTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case 7:
                ((L) this.f37554a).setDisableBackButtonMenu(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((L) this.f37554a).setTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case 9:
                ((L) this.f37554a).setHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((L) this.f37554a).setLargeTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 11:
                ((L) this.f37554a).setBackButtonDisplayMode(view, (String) obj);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((L) this.f37554a).setBackTitleVisible(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 13:
                ((L) this.f37554a).setDirection(view, (String) obj);
                break;
            case 14:
                ((L) this.f37554a).setLargeTitleBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 15:
                ((L) this.f37554a).setBackButtonInCustomView(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((L) this.f37554a).setLargeTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case 17:
                ((L) this.f37554a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 18:
                ((L) this.f37554a).setTitle(view, obj != null ? (String) obj : null);
                break;
            case 19:
                ((L) this.f37554a).setBackTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 20:
                ((L) this.f37554a).setBackTitleFontFamily(view, obj != null ? (String) obj : null);
                break;
            case 21:
                ((L) this.f37554a).setHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 22:
                ((L) this.f37554a).setLargeTitleFontWeight(view, obj != null ? (String) obj : null);
                break;
            case 23:
                ((L) this.f37554a).setHeaderRightBarButtonItems(view, (ReadableArray) obj);
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                ((L) this.f37554a).setHideBackButton(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 25:
                ((L) this.f37554a).setHeaderLeftBarButtonItems(view, (ReadableArray) obj);
                break;
            case 26:
                ((L) this.f37554a).setBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 27:
                ((L) this.f37554a).setBackTitle(view, obj != null ? (String) obj : null);
                break;
            case 28:
                ((L) this.f37554a).setTitleFontSize(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((L) this.f37554a).setLargeTitleHideShadow(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((L) this.f37554a).setLargeTitle(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                ((L) this.f37554a).setTopInsetEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
