package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1850t extends AbstractC3285c {
    public C1850t(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "rippleRadius":
                ((InterfaceC1852u) this.f37554a).setRippleRadius(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "enabled":
                ((InterfaceC1852u) this.f37554a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "rippleColor":
                ((InterfaceC1852u) this.f37554a).setRippleColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderColor":
                ((InterfaceC1852u) this.f37554a).setBorderColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "borderStyle":
                ((InterfaceC1852u) this.f37554a).setBorderStyle(view, obj == null ? "solid" : (String) obj);
                break;
            case "borderWidth":
                ((InterfaceC1852u) this.f37554a).setBorderWidth(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "touchSoundDisabled":
                ((InterfaceC1852u) this.f37554a).setTouchSoundDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "exclusive":
                ((InterfaceC1852u) this.f37554a).setExclusive(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "borderless":
                ((InterfaceC1852u) this.f37554a).setBorderless(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "foreground":
                ((InterfaceC1852u) this.f37554a).setForeground(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
