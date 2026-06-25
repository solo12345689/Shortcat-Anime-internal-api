package C;

import C.C1131b;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import i1.AbstractC5010c;
import i1.C5009b;
import kotlin.jvm.internal.AbstractC5504s;
import l0.e;

/* JADX INFO: renamed from: C.g */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1136g {

    /* JADX INFO: renamed from: a */
    private static final I0.B f2133a = new C1137h(C1131b.f2093a.h(), l0.e.f52304a.k());

    public static final I0.B a(C1131b.m mVar, e.b bVar, InterfaceC2425m interfaceC2425m, int i10) {
        I0.B b10;
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (AbstractC5504s.c(mVar, C1131b.f2093a.h()) && AbstractC5504s.c(bVar, l0.e.f52304a.k())) {
            interfaceC2425m.V(345962472);
            interfaceC2425m.O();
            b10 = f2133a;
        } else {
            interfaceC2425m.V(346016319);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(mVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(bVar)) || (i10 & 48) == 32);
            Object objD = interfaceC2425m.D();
            if (z10 || objD == InterfaceC2425m.f22370a.a()) {
                objD = new C1137h(mVar, bVar);
                interfaceC2425m.u(objD);
            }
            b10 = (C1137h) objD;
            interfaceC2425m.O();
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        return b10;
    }

    public static final long b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? AbstractC5010c.a(i11, i13, i10, i12) : C5009b.f48540b.a(i11, i13, i10, i12);
    }
}
