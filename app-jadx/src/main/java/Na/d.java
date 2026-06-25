package Na;

import android.graphics.Point;
import com.facebook.react.uimanager.C3284b0;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.r;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends r {
    @Override // com.facebook.react.uimanager.P, com.facebook.react.uimanager.O
    public void addChildAt(P child, int i10) {
        AbstractC5504s.h(child, "child");
        super.addChildAt(child, i10);
        C3284b0 themedContext = getThemedContext();
        AbstractC5504s.g(themedContext, "getThemedContext(...)");
        Point pointB = Ba.a.b(themedContext);
        child.setStyleWidth(pointB.x);
        child.setStyleHeight(pointB.y);
    }
}
