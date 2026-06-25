package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Q extends AbstractC3285c {
    public Q(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1619312835:
                if (str.equals("hideNavigationBar")) {
                    b10 = 0;
                }
                break;
            case -1465798051:
                if (str.equals("headerIconColor")) {
                    b10 = 1;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    b10 = 2;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 3;
                }
                break;
            case -336520619:
                if (str.equals("barTintColor")) {
                    b10 = 4;
                }
                break;
            case -256845969:
                if (str.equals("hintTextColor")) {
                    b10 = 5;
                }
                break;
            case -186579527:
                if (str.equals("hideWhenScrolling")) {
                    b10 = 6;
                }
                break;
            case -146361959:
                if (str.equals("cancelButtonText")) {
                    b10 = 7;
                }
                break;
            case -109380883:
                if (str.equals("disableBackButtonOverride")) {
                    b10 = 8;
                }
                break;
            case -39414888:
                if (str.equals("shouldShowHintSearchIcon")) {
                    b10 = 9;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    b10 = 10;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    b10 = 11;
                }
                break;
            case 1399891586:
                if (str.equals("allowToolbarIntegration")) {
                    b10 = 12;
                }
                break;
            case 1584806451:
                if (str.equals("obscureBackground")) {
                    b10 = 13;
                }
                break;
            case 1638055017:
                if (str.equals("autoFocus")) {
                    b10 = 14;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    b10 = 15;
                }
                break;
            case 1792938725:
                if (str.equals("placement")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((S) this.f37554a).setHideNavigationBar(view, (String) obj);
                break;
            case 1:
                ((S) this.f37554a).setHeaderIconColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 2:
                ((S) this.f37554a).setAutoCapitalize(view, (String) obj);
                break;
            case 3:
                ((S) this.f37554a).setTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 4:
                ((S) this.f37554a).setBarTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 5:
                ((S) this.f37554a).setHintTextColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 6:
                ((S) this.f37554a).setHideWhenScrolling(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 7:
                ((S) this.f37554a).setCancelButtonText(view, obj != null ? (String) obj : null);
                break;
            case 8:
                ((S) this.f37554a).setDisableBackButtonOverride(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((S) this.f37554a).setShouldShowHintSearchIcon(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((S) this.f37554a).setPlaceholder(view, obj != null ? (String) obj : null);
                break;
            case 11:
                ((S) this.f37554a).setTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((S) this.f37554a).setAllowToolbarIntegration(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 13:
                ((S) this.f37554a).setObscureBackground(view, (String) obj);
                break;
            case 14:
                ((S) this.f37554a).setAutoFocus(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 15:
                ((S) this.f37554a).setInputType(view, obj != null ? (String) obj : null);
                break;
            case 16:
                ((S) this.f37554a).setPlacement(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "cancelSearch":
                ((S) this.f37554a).cancelSearch(view);
                break;
            case "clearText":
                ((S) this.f37554a).clearText(view);
                break;
            case "toggleCancelButton":
                ((S) this.f37554a).toggleCancelButton(view, readableArray.getBoolean(0));
                break;
            case "blur":
                ((S) this.f37554a).blur(view);
                break;
            case "focus":
                ((S) this.f37554a).focus(view);
                break;
            case "setText":
                ((S) this.f37554a).setText(view, readableArray.getString(0));
                break;
        }
    }
}
