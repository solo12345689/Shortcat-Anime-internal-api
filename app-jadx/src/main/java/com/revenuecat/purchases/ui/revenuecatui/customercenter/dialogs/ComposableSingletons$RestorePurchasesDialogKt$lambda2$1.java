package com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import U.K;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ComposableSingletons$RestorePurchasesDialogKt$lambda2$1 extends AbstractC5506u implements Function2 {
    public static final ComposableSingletons$RestorePurchasesDialogKt$lambda2$1 INSTANCE = new ComposableSingletons$RestorePurchasesDialogKt$lambda2$1();

    ComposableSingletons$RestorePurchasesDialogKt$lambda2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((InterfaceC2425m) obj, ((Number) obj2).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC2425m interfaceC2425m, int i10) {
        if ((i10 & 3) == 2 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(246978940, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.ComposableSingletons$RestorePurchasesDialogKt.lambda-2.<anonymous> (RestorePurchasesDialog.kt:62)");
        }
        e eVarH = s.h(e.f26613a, 0.0f, 1, null);
        B bA = AbstractC1136g.a(C1131b.f2093a.b(), l0.e.f52304a.g(), interfaceC2425m, 54);
        int iA = AbstractC2410h.a(interfaceC2425m, 0);
        I iR = interfaceC2425m.r();
        e eVarF = c.f(interfaceC2425m, eVarH);
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
        m2.e(interfaceC2425mB, bA, aVar.e());
        m2.e(interfaceC2425mB, iR, aVar.g());
        Function2 function2B = aVar.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        m2.e(interfaceC2425mB, eVarF, aVar.f());
        C1139j c1139j = C1139j.f2142a;
        K.a(null, 0L, 0.0f, 0L, 0, interfaceC2425m, 0, 31);
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
