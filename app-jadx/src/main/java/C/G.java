package C;

import C.C1131b;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.AbstractC5010c;
import i1.C5009b;
import kotlin.jvm.internal.AbstractC5504s;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a */
    private static final I0.B f2017a = new H(C1131b.f2093a.g(), l0.e.f52304a.l());

    public static final long a(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? AbstractC5010c.a(i10, i12, i11, i13) : C5009b.f48540b.b(i10, i12, i11, i13);
    }

    public static final I0.B b(C1131b.e eVar, e.c cVar, InterfaceC2425m interfaceC2425m, int i10) {
        I0.B b10;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-837807694, i10, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:122)");
        }
        if (AbstractC5504s.c(eVar, C1131b.f2093a.g()) && AbstractC5504s.c(cVar, l0.e.f52304a.l())) {
            interfaceC2425m.V(-849081669);
            interfaceC2425m.O();
            b10 = f2017a;
        } else {
            interfaceC2425m.V(-849030798);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(eVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(cVar)) || (i10 & 48) == 32);
            Object objD = interfaceC2425m.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new H(eVar, cVar);
                interfaceC2425m.u(objD);
            }
            b10 = (H) objD;
            interfaceC2425m.O();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return b10;
    }
}
