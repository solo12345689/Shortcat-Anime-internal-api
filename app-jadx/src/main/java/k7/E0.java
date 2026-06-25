package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.ui.revenuecatui.composables.BackgroundUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ColorExtractionConstants;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class E0 extends AbstractC3285c {
    public E0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
                    b10 = 0;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b10 = 1;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b10 = 3;
                }
                break;
            case -1008621499:
                if (str.equals("orient")) {
                    b10 = 4;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b10 = 5;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 6;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 7;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b10 = 8;
                }
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
                    b10 = 9;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b10 = 10;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b10 = 11;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b10 = 12;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b10 = 13;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b10 = 14;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b10 = 15;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    b10 = 16;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 17;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    b10 = 18;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    b10 = 19;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b10 = 20;
                }
                break;
            case 3496485:
                if (str.equals("refX")) {
                    b10 = 21;
                }
                break;
            case 3496486:
                if (str.equals("refY")) {
                    b10 = 22;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
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
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b10 = 26;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 27;
                }
                break;
            case 218785621:
                if (str.equals("markerUnits")) {
                    b10 = 28;
                }
                break;
            case 220478892:
                if (str.equals("markerWidth")) {
                    b10 = 29;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    b10 = 30;
                }
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    b10 = 31;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b10 = 32;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 33;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 34;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b10 = 35;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b10 = 36;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b10 = 37;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 38;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    b10 = 39;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b10 = 40;
                }
                break;
            case 2106883585:
                if (str.equals("markerHeight")) {
                    b10 = 41;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((F0) this.f37554a).setVbHeight(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 1:
                ((F0) this.f37554a).setFilter(view, obj != null ? (String) obj : null);
                break;
            case 2:
                this.f37554a.setOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 3:
                ((F0) this.f37554a).setMatrix(view, (ReadableArray) obj);
                break;
            case 4:
                ((F0) this.f37554a).setOrient(view, obj != null ? (String) obj : null);
                break;
            case 5:
                ((F0) this.f37554a).setPropList(view, (ReadableArray) obj);
                break;
            case 6:
                ((F0) this.f37554a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case 7:
                ((F0) this.f37554a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case 8:
                ((F0) this.f37554a).setStroke(view, new DynamicFromObject(obj));
                break;
            case 9:
                ((F0) this.f37554a).setFontWeight(view, new DynamicFromObject(obj));
                break;
            case 10:
                ((F0) this.f37554a).setFillRule(view, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 11:
                ((F0) this.f37554a).setStrokeOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((F0) this.f37554a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case 13:
                ((F0) this.f37554a).setFillOpacity(view, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 14:
                ((F0) this.f37554a).setStrokeDashoffset(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 15:
                ((F0) this.f37554a).setFill(view, new DynamicFromObject(obj));
                break;
            case 16:
                ((F0) this.f37554a).setFont(view, new DynamicFromObject(obj));
                break;
            case 17:
                ((F0) this.f37554a).setMask(view, obj != null ? (String) obj : null);
                break;
            case 18:
                ((F0) this.f37554a).setMinX(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 19:
                ((F0) this.f37554a).setMinY(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 20:
                ((F0) this.f37554a).setName(view, obj != null ? (String) obj : null);
                break;
            case 21:
                ((F0) this.f37554a).setRefX(view, new DynamicFromObject(obj));
                break;
            case 22:
                ((F0) this.f37554a).setRefY(view, new DynamicFromObject(obj));
                break;
            case 23:
                ((F0) this.f37554a).setStrokeMiterlimit(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case ColorExtractionConstants.ALPHA_CHANNEL_SHIFT /* 24 */:
                ((F0) this.f37554a).setAlign(view, obj != null ? (String) obj : null);
                break;
            case 25:
                ((F0) this.f37554a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 26:
                ((F0) this.f37554a).setVectorEffect(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 27:
                ((F0) this.f37554a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case 28:
                ((F0) this.f37554a).setMarkerUnits(view, obj != null ? (String) obj : null);
                break;
            case 29:
                ((F0) this.f37554a).setMarkerWidth(view, new DynamicFromObject(obj));
                break;
            case 30:
                ((F0) this.f37554a).setVbWidth(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case BackgroundUIConstants.minSDKVersionSupportingBlur /* 31 */:
                ((F0) this.f37554a).setFontSize(view, new DynamicFromObject(obj));
                break;
            case 32:
                ((F0) this.f37554a).setStrokeDasharray(view, new DynamicFromObject(obj));
                break;
            case 33:
                ((F0) this.f37554a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case 34:
                ((F0) this.f37554a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 35:
                ((F0) this.f37554a).setStrokeLinecap(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 36:
                ((F0) this.f37554a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case 37:
                ((F0) this.f37554a).setStrokeLinejoin(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 38:
                ((F0) this.f37554a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 39:
                ((F0) this.f37554a).setMeetOrSlice(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 40:
                ((F0) this.f37554a).setStrokeWidth(view, new DynamicFromObject(obj));
                break;
            case 41:
                ((F0) this.f37554a).setMarkerHeight(view, new DynamicFromObject(obj));
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
