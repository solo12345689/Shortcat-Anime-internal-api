package K7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1841o extends AbstractC3285c {
    public C1841o(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "presentationStyle":
                ((InterfaceC1843p) this.f37554a).setPresentationStyle(view, (String) obj);
                break;
            case "supportedOrientations":
                ((InterfaceC1843p) this.f37554a).setSupportedOrientations(view, (ReadableArray) obj);
                break;
            case "transparent":
                ((InterfaceC1843p) this.f37554a).setTransparent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "identifier":
                ((InterfaceC1843p) this.f37554a).setIdentifier(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "statusBarTranslucent":
                ((InterfaceC1843p) this.f37554a).setStatusBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "allowSwipeDismissal":
                ((InterfaceC1843p) this.f37554a).setAllowSwipeDismissal(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animated":
                ((InterfaceC1843p) this.f37554a).setAnimated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "visible":
                ((InterfaceC1843p) this.f37554a).setVisible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "navigationBarTranslucent":
                ((InterfaceC1843p) this.f37554a).setNavigationBarTranslucent(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "hardwareAccelerated":
                ((InterfaceC1843p) this.f37554a).setHardwareAccelerated(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "animationType":
                ((InterfaceC1843p) this.f37554a).setAnimationType(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
