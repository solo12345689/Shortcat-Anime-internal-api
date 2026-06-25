package K7;

import android.view.View;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1849s0 extends AbstractC3285c {
    public C1849s0(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "primitiveUnits":
                ((InterfaceC1851t0) this.f37554a).setPrimitiveUnits(view, (String) obj);
                break;
            case "height":
                ((InterfaceC1851t0) this.f37554a).setHeight(view, new DynamicFromObject(obj));
                break;
            case "filterUnits":
                ((InterfaceC1851t0) this.f37554a).setFilterUnits(view, (String) obj);
                break;
            case "x":
                ((InterfaceC1851t0) this.f37554a).setX(view, new DynamicFromObject(obj));
                break;
            case "y":
                ((InterfaceC1851t0) this.f37554a).setY(view, new DynamicFromObject(obj));
                break;
            case "name":
                ((InterfaceC1851t0) this.f37554a).setName(view, obj == null ? null : (String) obj);
                break;
            case "width":
                ((InterfaceC1851t0) this.f37554a).setWidth(view, new DynamicFromObject(obj));
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
