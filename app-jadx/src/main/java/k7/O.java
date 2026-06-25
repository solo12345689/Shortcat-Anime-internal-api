package K7;

import android.view.View;
import com.facebook.react.uimanager.AbstractC3285c;
import com.facebook.react.uimanager.BaseViewManager;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class O extends AbstractC3285c {
    public O(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.AbstractC3285c, com.facebook.react.uimanager.q0
    public void a(View view, String str, Object obj) {
        str.getClass();
        if (str.equals("iosPreventReattachmentOfDismissedScreens")) {
            ((P) this.f37554a).setIosPreventReattachmentOfDismissedScreens(view, obj == null ? false : ((Boolean) obj).booleanValue());
        } else {
            super.a(view, str, obj);
        }
    }
}
