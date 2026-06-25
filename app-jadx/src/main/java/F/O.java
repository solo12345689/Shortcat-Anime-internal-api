package F;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class O {
    public static final N a(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:31)");
        }
        View view = (View) interfaceC2425m.n(AndroidCompositionLocals_androidKt.k());
        boolean zU = interfaceC2425m.U(view);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            objD = new RunnableC1530a(view);
            interfaceC2425m.u(objD);
        }
        RunnableC1530a runnableC1530a = (RunnableC1530a) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return runnableC1530a;
    }
}
