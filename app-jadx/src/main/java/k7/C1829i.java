package K7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1829i extends AbstractC3285c {
    public C1829i(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        super.a(view, str, obj);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "clearElementsHighlights":
                ((InterfaceC1831j) this.f37554a).clearElementsHighlights(view);
                break;
            case "highlightTraceUpdates":
                ((InterfaceC1831j) this.f37554a).highlightTraceUpdates(view, readableArray.getArray(0));
                break;
            case "highlightElements":
                ((InterfaceC1831j) this.f37554a).highlightElements(view, readableArray.getArray(0));
                break;
        }
    }
}
