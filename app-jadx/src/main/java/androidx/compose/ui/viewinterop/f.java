package androidx.compose.ui.viewinterop;

import K0.AbstractC1796k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.e;
import q0.InterfaceC6064j;
import r0.C6226h;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar) {
        return androidx.compose.ui.focus.g.a(androidx.compose.ui.focus.g.a(eVar.then(FocusGroupPropertiesElement.f27653b)).then(FocusTargetPropertiesElement.f27654b));
    }

    public static final Rect f(InterfaceC6064j interfaceC6064j, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C6226h c6226hR = interfaceC6064j.r();
        if (c6226hR == null) {
            return null;
        }
        return new Rect((((int) c6226hR.i()) + iArr[0]) - iArr2[0], (((int) c6226hR.l()) + iArr[1]) - iArr2[1], (((int) c6226hR.j()) + iArr[0]) - iArr2[0], (((int) c6226hR.e()) + iArr[1]) - iArr2[1]);
    }

    public static final View g(e.c cVar) {
        View viewZ = AbstractC1796k.n(cVar.getNode()).Z();
        if (viewZ != null) {
            return viewZ;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
