package x;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.EnumC5027t;
import z.InterfaceC7262d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, z.x xVar, z.q qVar, boolean z10, boolean z11, z.n nVar, B.m mVar, InterfaceC7262d interfaceC7262d, InterfaceC2425m interfaceC2425m, int i10, int i11) {
        InterfaceC7262d interfaceC7262d2 = (i11 & 64) != 0 ? null : interfaceC7262d;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1677817431, i10, -1, "androidx.compose.foundation.scrollingContainer (ScrollingContainer.kt:40)");
        }
        z.w wVar = z.w.f65432a;
        InterfaceC6999T interfaceC6999TB = wVar.b(interfaceC2425m, 6);
        androidx.compose.ui.e eVarF = androidx.compose.foundation.gestures.d.f(AbstractC7000U.a(AbstractC7014l.a(eVar, qVar), interfaceC6999TB), xVar, qVar, interfaceC6999TB, z10, wVar.c((EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k()), qVar, z11), nVar, mVar, interfaceC7262d2);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return eVarF;
    }
}
