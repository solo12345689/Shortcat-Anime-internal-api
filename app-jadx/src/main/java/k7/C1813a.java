package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.drawer.ReactDrawerLayoutManager;

/* JADX INFO: renamed from: K7.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1813a extends AbstractC3285c {
    public C1813a(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "statusBarBackgroundColor":
                ((InterfaceC1815b) this.f37554a).setStatusBarBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "drawerBackgroundColor":
                ((InterfaceC1815b) this.f37554a).setDrawerBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "keyboardDismissMode":
                ((InterfaceC1815b) this.f37554a).setKeyboardDismissMode(view, (String) obj);
                break;
            case "drawerWidth":
                ((InterfaceC1815b) this.f37554a).setDrawerWidth(view, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
                break;
            case "drawerPosition":
                ((InterfaceC1815b) this.f37554a).setDrawerPosition(view, (String) obj);
                break;
            case "drawerLockMode":
                ((InterfaceC1815b) this.f37554a).setDrawerLockMode(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals(ReactDrawerLayoutManager.COMMAND_CLOSE_DRAWER)) {
            ((InterfaceC1815b) this.f37554a).closeDrawer(view);
        } else if (str.equals(ReactDrawerLayoutManager.COMMAND_OPEN_DRAWER)) {
            ((InterfaceC1815b) this.f37554a).openDrawer(view);
        }
    }
}
