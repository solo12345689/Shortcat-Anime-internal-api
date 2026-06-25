package G;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final F.C a(C c10, boolean z10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-786344289, i10, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(c10)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.a(z10)) || (i10 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z11 || objD == InterfaceC2425m.f22370a.a()) {
            objD = AbstractC1590d.a(c10, z10);
            interfaceC2425m.u(objD);
        }
        F.C c11 = (F.C) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c11;
    }
}
