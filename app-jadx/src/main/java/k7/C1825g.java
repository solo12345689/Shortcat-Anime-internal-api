package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1825g extends AbstractC3285c {
    public C1825g(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "thumbColor":
                ((InterfaceC1827h) this.f37554a).setThumbColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "enabled":
                ((InterfaceC1827h) this.f37554a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "trackTintColor":
                ((InterfaceC1827h) this.f37554a).setTrackTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "on":
                ((InterfaceC1827h) this.f37554a).setOn(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "value":
                ((InterfaceC1827h) this.f37554a).setValue(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "disabled":
                ((InterfaceC1827h) this.f37554a).setDisabled(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "trackColorForFalse":
                ((InterfaceC1827h) this.f37554a).setTrackColorForFalse(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "thumbTintColor":
                ((InterfaceC1827h) this.f37554a).setThumbTintColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "trackColorForTrue":
                ((InterfaceC1827h) this.f37554a).setTrackColorForTrue(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeValue")) {
            ((InterfaceC1827h) this.f37554a).setNativeValue(view, readableArray.getBoolean(0));
        }
    }
}
