package K7;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.revenuecat.purchases.common.verification.SigningManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C0 extends AbstractC3285c {
    public C0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1932235233:
                if (str.equals("gradientUnits")) {
                    b10 = 0;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 1;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b10 = 2;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 3;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 4;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b10 = 5;
                }
                break;
            case 3769:
                if (str.equals("x1")) {
                    b10 = 6;
                }
                break;
            case 3770:
                if (str.equals("x2")) {
                    b10 = 7;
                }
                break;
            case 3800:
                if (str.equals("y1")) {
                    b10 = 8;
                }
                break;
            case 3801:
                if (str.equals("y2")) {
                    b10 = 9;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 10;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b10 = 11;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    b10 = 12;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 13;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 14;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 15;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b10 = 16;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    b10 = 17;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 18;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((D0) this.f37554a).setGradientUnits(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 1:
                this.f37554a.setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 2:
                ((D0) this.f37554a).setMatrix(view, (ReadableArray) obj);
                break;
            case 3:
                ((D0) this.f37554a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case 4:
                ((D0) this.f37554a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case 5:
                ((D0) this.f37554a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case 6:
                ((D0) this.f37554a).setX1(view, new DynamicFromObject(obj));
                break;
            case 7:
                ((D0) this.f37554a).setX2(view, new DynamicFromObject(obj));
                break;
            case 8:
                ((D0) this.f37554a).setY1(view, new DynamicFromObject(obj));
                break;
            case 9:
                ((D0) this.f37554a).setY2(view, new DynamicFromObject(obj));
                break;
            case 10:
                ((D0) this.f37554a).setMask(view, obj != null ? (String) obj : null);
                break;
            case 11:
                ((D0) this.f37554a).setName(view, obj != null ? (String) obj : null);
                break;
            case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                ((D0) this.f37554a).setGradient(view, (ReadableArray) obj);
                break;
            case 13:
                ((D0) this.f37554a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case 14:
                ((D0) this.f37554a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case 15:
                ((D0) this.f37554a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 16:
                ((D0) this.f37554a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case 17:
                ((D0) this.f37554a).setGradientTransform(view, (ReadableArray) obj);
                break;
            case 18:
                ((D0) this.f37554a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
