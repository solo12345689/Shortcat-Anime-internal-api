package K7;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1842o0 extends AbstractC3285c {
    public C1842o0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "height":
                ((InterfaceC1844p0) this.f37554a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "result":
                ((InterfaceC1844p0) this.f37554a).setResult(view, obj == null ? null : (String) obj);
                break;
            case "x":
                ((InterfaceC1844p0) this.f37554a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC1844p0) this.f37554a).setY(view, new DynamicFromObject(obj));
                break;
            case "nodes":
                ((InterfaceC1844p0) this.f37554a).setNodes(view, (ReadableArray) obj);
                break;
            case "width":
                ((InterfaceC1844p0) this.f37554a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
