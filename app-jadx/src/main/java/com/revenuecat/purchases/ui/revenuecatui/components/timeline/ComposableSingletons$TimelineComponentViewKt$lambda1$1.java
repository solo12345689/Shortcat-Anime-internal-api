package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import s0.C6385r0;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.components.timeline.ComposableSingletons$TimelineComponentViewKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class ComposableSingletons$TimelineComponentViewKt$lambda1$1 extends AbstractC5506u implements Function2 {
    public static final ComposableSingletons$TimelineComponentViewKt$lambda1$1 INSTANCE = new ComposableSingletons$TimelineComponentViewKt$lambda1$1();

    ComposableSingletons$TimelineComponentViewKt$lambda1$1() {
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
            AbstractC2454w.U(-1193220131, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.ComposableSingletons$TimelineComponentViewKt.lambda-1.<anonymous> (TimelineComponentView.kt:216)");
        }
        e eVarD = b.d(s.h(e.f26613a, 0.0f, 1, null), C6385r0.f58985b.k(), null, 2, null);
        B bH = f.h(l0.e.f52304a.o(), false);
        int iA = AbstractC2410h.a(interfaceC2425m, 0);
        I iR = interfaceC2425m.r();
        e eVarF = c.f(interfaceC2425m, eVarD);
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
        m2.e(interfaceC2425mB, bH, aVar.e());
        m2.e(interfaceC2425mB, iR, aVar.g());
        Function2 function2B = aVar.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        m2.e(interfaceC2425mB, eVarF, aVar.f());
        h hVar = h.f26161a;
        TimelineComponentViewKt.TimelineComponentView(TimelineComponentViewKt.previewStyle(0, 0, 0, TimelineComponent.IconAlignment.Title, false, null, null, null, null, interfaceC2425m, 3072, 503), PreviewHelpersKt.previewEmptyState(null, interfaceC2425m, 0, 1), null, interfaceC2425m, 0, 4);
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
