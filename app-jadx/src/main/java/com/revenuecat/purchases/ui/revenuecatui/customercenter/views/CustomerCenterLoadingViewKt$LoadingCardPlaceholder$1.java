package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import C.K;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import i1.C5015h;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import w.C6884M;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "(LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ Fade $fadeHighlight;
    final /* synthetic */ long $placeholderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1(long j10, Fade fade) {
        super(2);
        this.$placeholderColor = j10;
        this.$fadeHighlight = fade;
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
            AbstractC2454w.U(1204625137, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardPlaceholder.<anonymous> (CustomerCenterLoadingView.kt:71)");
        }
        e.a aVar = e.f26613a;
        e eVarI = p.i(aVar, CustomerCenterConstants.Card.INSTANCE.m648getCARD_PADDINGD9Ej5fM());
        long j10 = this.$placeholderColor;
        Fade fade = this.$fadeHighlight;
        B bA = AbstractC1136g.a(C1131b.f2093a.h(), l0.e.f52304a.k(), interfaceC2425m, 0);
        int iA = AbstractC2410h.a(interfaceC2425m, 0);
        I iR = interfaceC2425m.r();
        e eVarF = androidx.compose.ui.c.f(interfaceC2425m, eVarI);
        InterfaceC1788g.a aVar2 = InterfaceC1788g.f10745M;
        InterfaceC5082a interfaceC5082aA = aVar2.a();
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
        m2.e(interfaceC2425mB, bA, aVar2.e());
        m2.e(interfaceC2425mB, iR, aVar2.g());
        Function2 function2B = aVar2.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        m2.e(interfaceC2425mB, eVarF, aVar2.f());
        C1139j c1139j = C1139j.f2142a;
        int i11 = C6884M.f62376d;
        CustomerCenterLoadingViewKt.m727LoadingCardTitleRowIv8Zu3U(j10, fade, interfaceC2425m, i11 << 3);
        LoadingViewConstants loadingViewConstants = LoadingViewConstants.INSTANCE;
        f.a(PlaceholderKt.m613placeholderTgFrcIs(s.i(s.v(aVar, loadingViewConstants.m738getSUBTITLE_WIDTHD9Ej5fM()), loadingViewConstants.m735getBODY_HEIGHTD9Ej5fM()), true, j10, loadingViewConstants.getPLACEHOLDER_SHAPE(), fade, null, null, interfaceC2425m, (i11 << 12) | 3126, 48), interfaceC2425m, 0);
        K.a(s.i(aVar, C5015h.n(6)), interfaceC2425m, 6);
        f.a(PlaceholderKt.m613placeholderTgFrcIs(s.i(s.v(aVar, loadingViewConstants.m737getSTORE_WIDTHD9Ej5fM()), loadingViewConstants.m735getBODY_HEIGHTD9Ej5fM()), true, j10, loadingViewConstants.getPLACEHOLDER_SHAPE(), fade, null, null, interfaceC2425m, (i11 << 12) | 3126, 48), interfaceC2425m, 0);
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
