package T;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.h2;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public /* synthetic */ b(boolean z10, float f10, h2 h2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, h2Var);
    }

    @Override // T.c
    public androidx.compose.material.ripple.d c(B.k kVar, boolean z10, float f10, h2 h2Var, h2 h2Var2, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(331259447);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        ViewGroup viewGroupE = o.e((View) interfaceC2425m.n(AndroidCompositionLocals_androidKt.k()));
        boolean zU = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(kVar)) || (i10 & 6) == 4) | ((((458752 & i10) ^ 196608) > 131072 && interfaceC2425m.U(this)) || (i10 & 196608) == 131072) | interfaceC2425m.U(viewGroupE);
        Object objD = interfaceC2425m.D();
        if (zU || objD == InterfaceC2425m.f22370a.a()) {
            Object aVar = new androidx.compose.material.ripple.a(z10, f10, h2Var, h2Var2, viewGroupE, null);
            interfaceC2425m.u(aVar);
            objD = aVar;
        }
        androidx.compose.material.ripple.a aVar2 = (androidx.compose.material.ripple.a) objD;
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return aVar2;
    }

    private b(boolean z10, float f10, h2 h2Var) {
        super(z10, f10, h2Var, null);
    }
}
