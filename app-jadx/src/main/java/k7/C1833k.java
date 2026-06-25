package K7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1833k extends AbstractC3285c {
    public C1833k(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "enabled":
                ((InterfaceC1835l) this.f37554a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "statusBarTranslucent":
                ((InterfaceC1835l) this.f37554a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "preserveEdgeToEdge":
                ((InterfaceC1835l) this.f37554a).setPreserveEdgeToEdge(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((InterfaceC1835l) this.f37554a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("synchronizeFocusedInputLayout")) {
            ((InterfaceC1835l) this.f37554a).synchronizeFocusedInputLayout(view);
        }
    }
}
