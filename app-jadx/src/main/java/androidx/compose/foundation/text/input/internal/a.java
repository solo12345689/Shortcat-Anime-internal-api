package androidx.compose.foundation.text.input.internal;

import K.C1774y;
import N.q0;
import Q.F;
import androidx.compose.ui.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final e a(e eVar, q0 q0Var, C1774y c1774y, F f10) {
        return eVar.then(new LegacyAdaptingPlatformTextInputModifier(q0Var, c1774y, f10));
    }
}
