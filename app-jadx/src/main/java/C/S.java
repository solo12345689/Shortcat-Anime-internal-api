package C;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.AbstractC2739w0;
import i1.InterfaceC5011d;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {
    public static final P a(int i10, int i11, int i12, int i13) {
        return new C1145p(i10, i11, i12, i13);
    }

    public static final A b(P p10, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1485016250, i10, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:244)");
        }
        C1149u c1149u = new C1149u(p10, (InterfaceC5011d) interfaceC2425m.n(AbstractC2739w0.e()));
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return c1149u;
    }

    public static final A c(P p10, InterfaceC5011d interfaceC5011d) {
        return new C1149u(p10, interfaceC5011d);
    }

    public static final P d(P p10, P p11) {
        return new C1144o(p10, p11);
    }

    public static final P e(P p10, int i10) {
        return new z(p10, i10, null);
    }

    public static final P f(P p10, P p11) {
        return new M(p10, p11);
    }
}
