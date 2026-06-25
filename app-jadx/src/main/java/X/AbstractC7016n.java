package x;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: renamed from: x.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7016n {
    public static final boolean a(InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:46)");
        }
        boolean z10 = (((Configuration) interfaceC2425m.n(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return z10;
    }
}
