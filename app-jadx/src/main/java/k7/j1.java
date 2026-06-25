package K7;

import android.view.View;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class j1 extends AbstractC3285c {
    public j1(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "renderState":
                ((k1) this.f37554a).setRenderState(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "initialHidden":
                ((k1) this.f37554a).setInitialHidden(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "removeClippedSubviews":
                ((k1) this.f37554a).setRemoveClippedSubviews(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
