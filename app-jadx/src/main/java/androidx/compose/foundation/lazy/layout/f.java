package androidx.compose.foundation.lazy.layout;

import F.C;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import ie.InterfaceC5082a;
import z.q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final float a(int i10, int i11, boolean z10) {
        return z10 ? b(i10, i11) + 100 : b(i10, i11);
    }

    public static final float b(int i10, int i11) {
        return i11 + (i10 * 500);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, InterfaceC5082a interfaceC5082a, C c10, q qVar, boolean z10, boolean z11, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        androidx.compose.ui.e eVarThen = eVar.then(new LazyLayoutSemanticsModifier(interfaceC5082a, c10, qVar, z10, z11));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return eVarThen;
    }
}
