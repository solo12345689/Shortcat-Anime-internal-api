package C;

import K0.InterfaceC1788g;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import Y.m2;
import ie.InterfaceC5082a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {
    public static final void a(androidx.compose.ui.e eVar, InterfaceC2425m interfaceC2425m, int i10) {
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-72882467, i10, -1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)");
        }
        L l10 = L.f2026a;
        int iA = AbstractC2410h.a(interfaceC2425m, 0);
        androidx.compose.ui.e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVar);
        Y.I iR = interfaceC2425m.r();
        InterfaceC1788g.a aVar = InterfaceC1788g.f10745M;
        InterfaceC5082a interfaceC5082aA = aVar.a();
        if (interfaceC2425m.j() == null) {
            AbstractC2410h.d();
        }
        interfaceC2425m.I();
        if (interfaceC2425m.e()) {
            interfaceC2425m.h(interfaceC5082aA);
        } else {
            interfaceC2425m.s();
        }
        InterfaceC2425m interfaceC2425mB = m2.b(interfaceC2425m);
        m2.e(interfaceC2425mB, l10, aVar.e());
        m2.e(interfaceC2425mB, iR, aVar.g());
        m2.e(interfaceC2425mB, eVarF, aVar.f());
        Function2 function2B = aVar.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
