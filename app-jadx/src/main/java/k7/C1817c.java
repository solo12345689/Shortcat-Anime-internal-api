package K7;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: renamed from: K7.c */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1817c extends AbstractC3285c {
    public C1817c(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(ReactProgressBarViewManager.PROP_PROGRESS)) {
                    b10 = 0;
                }
                break;
            case -877170387:
                if (str.equals("testID")) {
                    b10 = 1;
                }
                break;
            case -676876213:
                if (str.equals(ReactProgressBarViewManager.PROP_ATTR)) {
                    b10 = 2;
                }
                break;
            case 94842723:
                if (str.equals("color")) {
                    b10 = 3;
                }
                break;
            case 633138363:
                if (str.equals(ReactProgressBarViewManager.PROP_INDETERMINATE)) {
                    b10 = 4;
                }
                break;
            case 1118509918:
                if (str.equals(ReactProgressBarViewManager.PROP_ANIMATING)) {
                    b10 = 5;
                }
                break;
            case 1804741442:
                if (str.equals(ReactProgressBarViewManager.PROP_STYLE)) {
                    b10 = 6;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((InterfaceC1819d) this.f37554a).setProgress(view, obj == null ? 0.0d : ((Double) obj).doubleValue());
                break;
            case 1:
                ((InterfaceC1819d) this.f37554a).setTestID(view, obj == null ? "" : (String) obj);
                break;
            case 2:
                ((InterfaceC1819d) this.f37554a).setTypeAttr(view, obj != null ? (String) obj : null);
                break;
            case 3:
                ((InterfaceC1819d) this.f37554a).setColor(view, ColorPropConverter.getColor(obj, view.getContext()));
                break;
            case 4:
                ((InterfaceC1819d) this.f37554a).setIndeterminate(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 5:
                ((InterfaceC1819d) this.f37554a).setAnimating(view, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 6:
                ((InterfaceC1819d) this.f37554a).setStyleAttr(view, obj != null ? (String) obj : null);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
