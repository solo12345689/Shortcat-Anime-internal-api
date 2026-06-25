package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: renamed from: K7.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1821e extends AbstractC3285c {
    public C1821e(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "enabled":
                ((InterfaceC1823f) this.f37554a).setEnabled(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "colors":
                ((InterfaceC1823f) this.f37554a).setColors(view, (ReadableArray) obj);
                break;
            case "progressBackgroundColor":
                ((InterfaceC1823f) this.f37554a).setProgressBackgroundColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case "progressViewOffset":
                ((InterfaceC1823f) this.f37554a).setProgressViewOffset(view, obj == null ? 0.0f : ((Double) obj).floatValue());
                break;
            case "refreshing":
                ((InterfaceC1823f) this.f37554a).setRefreshing(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "size":
                ((InterfaceC1823f) this.f37554a).setSize(view, (String) obj);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void b(View view, String str, ReadableArray readableArray) {
        str.getClass();
        if (str.equals("setNativeRefreshing")) {
            ((InterfaceC1823f) this.f37554a).setNativeRefreshing(view, readableArray.getBoolean(0));
        }
    }
}
