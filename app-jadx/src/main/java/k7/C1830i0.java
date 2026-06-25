package K7;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1830i0 extends AbstractC3285c {
    public C1830i0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1221029593:
                if (str.equals("height")) {
                    b10 = 0;
                }
                break;
            case -934426595:
                if (str.equals("result")) {
                    b10 = 1;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b10 = 2;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b10 = 3;
                }
                break;
            case 3366:
                if (str.equals("k1")) {
                    b10 = 4;
                }
                break;
            case 3367:
                if (str.equals("k2")) {
                    b10 = 5;
                }
                break;
            case 3368:
                if (str.equals("k3")) {
                    b10 = 6;
                }
                break;
            case 3369:
                if (str.equals("k4")) {
                    b10 = 7;
                }
                break;
            case 104364:
                if (str.equals("in1")) {
                    b10 = 8;
                }
                break;
            case 104365:
                if (str.equals("in2")) {
                    b10 = 9;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b10 = 10;
                }
                break;
            case 1662708749:
                if (str.equals("operator1")) {
                    b10 = 11;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((InterfaceC1832j0) this.f37554a).setHeight(view, new DynamicFromObject(obj));
                break;
            case 1:
                ((InterfaceC1832j0) this.f37554a).setResult(view, obj != null ? (String) obj : null);
                break;
            case 2:
                ((InterfaceC1832j0) this.f37554a).setX(view, new DynamicFromObject(obj));
                break;
            case 3:
                ((InterfaceC1832j0) this.f37554a).setY(view, new DynamicFromObject(obj));
                break;
            case 4:
                ((InterfaceC1832j0) this.f37554a).setK1(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 5:
                ((InterfaceC1832j0) this.f37554a).setK2(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 6:
                ((InterfaceC1832j0) this.f37554a).setK3(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 7:
                ((InterfaceC1832j0) this.f37554a).setK4(view, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((InterfaceC1832j0) this.f37554a).setIn1(view, obj != null ? (String) obj : null);
                break;
            case 9:
                ((InterfaceC1832j0) this.f37554a).setIn2(view, obj != null ? (String) obj : null);
                break;
            case 10:
                ((InterfaceC1832j0) this.f37554a).setWidth(view, new DynamicFromObject(obj));
                break;
            case 11:
                ((InterfaceC1832j0) this.f37554a).setOperator1(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
