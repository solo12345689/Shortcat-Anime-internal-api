package D;

import F.InterfaceC1540k;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final InterfaceC1540k a(B b10, int i10, InterfaceC2425m interfaceC2425m, int i11) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1877443446, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && interfaceC2425m.U(b10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC2425m.c(i10)) || (i11 & 48) == 32);
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new h(b10, i10);
            interfaceC2425m.u(objD);
        }
        h hVar = (h) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return hVar;
    }
}
