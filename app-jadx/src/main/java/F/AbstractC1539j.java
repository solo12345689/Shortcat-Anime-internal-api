package F;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.EnumC5027t;

/* JADX INFO: renamed from: F.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1539j {
    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC1540k interfaceC1540k, C1537h c1537h, boolean z10, EnumC5027t enumC5027t, z.q qVar, boolean z11, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1331498025, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z11) {
            interfaceC2425m.V(-1890632411);
            boolean z12 = ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(interfaceC1540k)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC2425m.U(c1537h)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC2425m.a(z10)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC2425m.U(enumC5027t)) || (i10 & 24576) == 16384) | ((((458752 & i10) ^ 196608) > 131072 && interfaceC2425m.U(qVar)) || (i10 & 196608) == 131072);
            Object objD = interfaceC2425m.D();
            if (z12 || objD == InterfaceC2425m.f22370a.a()) {
                C1538i c1538i = new C1538i(interfaceC1540k, c1537h, z10, enumC5027t, qVar);
                interfaceC2425m.u(c1538i);
                objD = c1538i;
            }
            eVar = eVar.then((C1538i) objD);
            interfaceC2425m.O();
        } else {
            interfaceC2425m.V(-1890658823);
            interfaceC2425m.O();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
