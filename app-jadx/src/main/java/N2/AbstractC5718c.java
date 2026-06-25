package n2;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;

/* JADX INFO: renamed from: n2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5718c {
    public static final Y a(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1382572291, i10, -1, "androidx.lifecycle.viewmodel.compose.findViewTreeViewModelStoreOwner (LocalViewModelStoreOwner.android.kt:25)");
        }
        Y yA = a0.a((View) interfaceC2425m.n(AndroidCompositionLocals_androidKt.k()));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return yA;
    }
}
