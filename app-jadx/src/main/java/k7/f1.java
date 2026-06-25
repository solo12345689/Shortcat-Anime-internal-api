package K7;

import android.view.View;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class f1 extends AbstractC3285c {
    public f1(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "opaque":
                ((g1) this.f37554a).setOpaque(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "androidWarmup":
                ((g1) this.f37554a).setAndroidWarmup(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "pointerEvents":
                ((g1) this.f37554a).setPointerEvents(view, (String) obj);
                break;
            case "debug":
                ((g1) this.f37554a).setDebug(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "colorSpace":
                ((g1) this.f37554a).setColorSpace(view, obj == null ? null : (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
