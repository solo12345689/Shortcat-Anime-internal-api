package P0;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final String a(int i10, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1223887937, i11, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) interfaceC2425m.n(AndroidCompositionLocals_androidKt.j())).getString(i10);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return string;
    }
}
