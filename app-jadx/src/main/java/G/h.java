package G;

import F.InterfaceC1540k;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final InterfaceC1540k a(C c10, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC2425m.U(c10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC2425m.c(i10)) || (i11 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new i(c10, i10);
            interfaceC2425m.u(objD);
        }
        i iVar = (i) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return iVar;
    }
}
