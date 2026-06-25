package Sa;

import android.view.View;
import com.swmansion.rnscreens.C4546y;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final boolean a(View view) {
        AbstractC5504s.h(view, "<this>");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean b(C4546y c4546y) {
        AbstractC5504s.h(c4546y, "<this>");
        return c4546y.getStackPresentation() == C4546y.e.f44810d && c4546y.getSheetDetents().d() == 1 && c4546y.getSheetDetents().l() == -1.0d;
    }

    public static final boolean c(C4546y c4546y) {
        AbstractC5504s.h(c4546y, "<this>");
        return !c4546y.getSheetShouldOverflowTopInset() && d(c4546y);
    }

    public static final boolean d(C4546y c4546y) {
        AbstractC5504s.h(c4546y, "<this>");
        return c4546y.getStackPresentation() == C4546y.e.f44810d;
    }
}
