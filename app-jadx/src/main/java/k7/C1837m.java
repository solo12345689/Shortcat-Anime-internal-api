package K7;

import android.view.View;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1837m extends AbstractC3285c {
    public C1837m(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "showOnSwipeUp":
                ((InterfaceC1839n) this.f37554a).setShowOnSwipeUp(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "offset":
                ((InterfaceC1839n) this.f37554a).setOffset(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case "textInputNativeID":
                ((InterfaceC1839n) this.f37554a).setTextInputNativeID(view, obj == null ? null : (String) obj);
                break;
            case "enableSwipeToDismiss":
                ((InterfaceC1839n) this.f37554a).setEnableSwipeToDismiss(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "interpolator":
                ((InterfaceC1839n) this.f37554a).setInterpolator(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
