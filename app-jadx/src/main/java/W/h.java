package W;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final String a(int i10, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-907677715, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        interfaceC2425m.n(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) interfaceC2425m.n(AndroidCompositionLocals_androidKt.g())).getResources().getString(i10);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return string;
    }
}
