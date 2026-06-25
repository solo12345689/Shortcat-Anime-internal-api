package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class Q0 extends AbstractC3285c {
    public Q0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    b10 = 0;
                }
                break;
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    b10 = 1;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    b10 = 2;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b10 = 3;
                }
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    b10 = 4;
                }
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    b10 = 5;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    b10 = 6;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    b10 = 7;
                }
                break;
            case -1122140597:
                if (str.equals("borderTopStartRadius")) {
                    b10 = 8;
                }
                break;
            case -867333731:
                if (str.equals("borderBottomStartRadius")) {
                    b10 = 9;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    b10 = 10;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    b10 = 11;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    b10 = 12;
                }
                break;
            case -483490364:
                if (str.equals("borderTopEndRadius")) {
                    b10 = 13;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    b10 = 14;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b10 = 15;
                }
                break;
            case -252105751:
                if (str.equals("removeClippedSubviews")) {
                    b10 = 16;
                }
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    b10 = 17;
                }
                break;
            case -223134121:
                if (str.equals("borderStartEndRadius")) {
                    b10 = 18;
                }
                break;
            case -148030058:
                if (str.equals("borderBottomEndRadius")) {
                    b10 = 19;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    b10 = 20;
                }
                break;
            case -27894242:
                if (str.equals("borderStartStartRadius")) {
                    b10 = 21;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b10 = 22;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b10 = 23;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    b10 = 24;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b10 = 25;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b10 = 26;
                }
                break;
            case 306963138:
                if (str.equals("borderBlockStartColor")) {
                    b10 = 27;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    b10 = 28;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    b10 = 29;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    b10 = 30;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    b10 = 31;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    b10 = 32;
                }
                break;
            case 684610594:
                if (str.equals("borderBlockColor")) {
                    b10 = 33;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    b10 = 34;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    b10 = 35;
                }
                break;
            case 762983977:
                if (str.equals("borderBlockEndColor")) {
                    b10 = 36;
                }
                break;
            case 910681861:
                if (str.equals("borderEndStartRadius")) {
                    b10 = 37;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    b10 = 38;
                }
                break;
            case 1220735892:
                if (str.equals("borderEndColor")) {
                    b10 = 39;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    b10 = 40;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    b10 = 41;
                }
                break;
            case 1667773924:
                if (str.equals("needsOffscreenAlphaCompositing")) {
                    b10 = 42;
                }
                break;
            case 1735382270:
                if (str.equals("borderEndEndRadius")) {
                    b10 = 43;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    b10 = 44;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b10 = 45;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    b10 = 46;
                }
                break;
            case 2119889261:
                if (str.equals("borderStartColor")) {
                    b10 = 47;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((R0) this.f37554a).setBbHeight(view, new DynamicFromObject(obj));
                break;
            case 1:
                ((R0) this.f37554a).setBorderRightColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 2:
                ((R0) this.f37554a).setBackfaceVisibility(view, obj != null ? (String) obj : null);
                break;
            case 3:
                ((R0) this.f37554a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 4:
                ((R0) this.f37554a).setBorderTopColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 5:
                ((R0) this.f37554a).setBorderBottomColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 6:
                ((R0) this.f37554a).setBorderTopLeftRadius(view, new DynamicFromObject(obj));
                break;
            case 7:
                ((R0) this.f37554a).setAccessible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((R0) this.f37554a).setBorderTopStartRadius(view, new DynamicFromObject(obj));
                break;
            case 9:
                ((R0) this.f37554a).setBorderBottomStartRadius(view, new DynamicFromObject(obj));
                break;
            case 10:
                ((R0) this.f37554a).setHasTVPreferredFocus(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((R0) this.f37554a).setNextFocusDown(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((R0) this.f37554a).setNextFocusLeft(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 13:
                ((R0) this.f37554a).setBorderTopEndRadius(view, new DynamicFromObject(obj));
                break;
            case 14:
                ((R0) this.f37554a).setBbWidth(view, new DynamicFromObject(obj));
                break;
            case 15:
                ((R0) this.f37554a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case 16:
                ((R0) this.f37554a).setRemoveClippedSubviews(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 17:
                ((R0) this.f37554a).setBorderLeftColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 18:
                ((R0) this.f37554a).setBorderStartEndRadius(view, new DynamicFromObject(obj));
                break;
            case 19:
                ((R0) this.f37554a).setBorderBottomEndRadius(view, new DynamicFromObject(obj));
                break;
            case 20:
                ((R0) this.f37554a).setNativeForegroundAndroid(view, (ReadableMap) obj);
                break;
            case 21:
                ((R0) this.f37554a).setBorderStartStartRadius(view, new DynamicFromObject(obj));
                break;
            case 22:
                ((R0) this.f37554a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 23:
                ((R0) this.f37554a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                ((R0) this.f37554a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case 25:
                ((R0) this.f37554a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 26:
                ((R0) this.f37554a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 27:
                ((R0) this.f37554a).setBorderBlockStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 28:
                ((R0) this.f37554a).setBorderTopRightRadius(view, new DynamicFromObject(obj));
                break;
            case 29:
                ((R0) this.f37554a).setNextFocusForward(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 30:
                ((R0) this.f37554a).setBorderBottomLeftRadius(view, new DynamicFromObject(obj));
                break;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                ((R0) this.f37554a).setBorderBottomRightRadius(view, new DynamicFromObject(obj));
                break;
            case 32:
                ((R0) this.f37554a).setNextFocusUp(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 33:
                ((R0) this.f37554a).setBorderBlockColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 34:
                ((R0) this.f37554a).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 35:
                ((R0) this.f37554a).setBorderStyle(view, obj != null ? (String) obj : null);
                break;
            case 36:
                ((R0) this.f37554a).setBorderBlockEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 37:
                ((R0) this.f37554a).setBorderEndStartRadius(view, new DynamicFromObject(obj));
                break;
            case 38:
                ((R0) this.f37554a).setHitSlop(view, new DynamicFromObject(obj));
                break;
            case 39:
                ((R0) this.f37554a).setBorderEndColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 40:
                ((R0) this.f37554a).setBorderRadius(view, new DynamicFromObject(obj));
                break;
            case 41:
                ((R0) this.f37554a).setFocusable(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 42:
                ((R0) this.f37554a).setNeedsOffscreenAlphaCompositing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 43:
                ((R0) this.f37554a).setBorderEndEndRadius(view, new DynamicFromObject(obj));
                break;
            case 44:
                ((R0) this.f37554a).setNativeBackgroundAndroid(view, (ReadableMap) obj);
                break;
            case 45:
                ((R0) this.f37554a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 46:
                ((R0) this.f37554a).setNextFocusRight(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 47:
                ((R0) this.f37554a).setBorderStartColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
