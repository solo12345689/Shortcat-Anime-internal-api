package E;

import F.InterfaceC1540k;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;

/* JADX INFO: renamed from: E.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1285f {
    public static final InterfaceC1540k a(I i10, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(2004349821, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        boolean z10 = (((i11 & 14) ^ 6) > 4 && interfaceC2425m.U(i10)) || (i11 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new C1286g(i10);
            interfaceC2425m.u(objD);
        }
        C1286g c1286g = (C1286g) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c1286g;
    }
}
