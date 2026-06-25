package K7;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class D extends AbstractC3285c {
    public D(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("insetType")) {
            ((E) this.f37554a).setInsetType(view, (String) obj);
        } else if (str.equals("edges")) {
            ((E) this.f37554a).setEdges(view, (ReadableMap) obj);
        } else {
            super.a(view, str, obj);
        }
    }
}
