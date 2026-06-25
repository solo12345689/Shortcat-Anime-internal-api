package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.AbstractC1136g;
import C.C1131b;
import C.C1139j;
import I0.B;
import K0.InterfaceC1788g;
import Td.L;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.I;
import Y.InterfaceC2425m;
import Y.m2;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import i1.C5015h;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;
import v.InterfaceC6784e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv/e;", "LTd/L;", "invoke", "(Lv/e;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class Template2Kt$AnimatedPackages$1$2 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ e $childModifier;
    final /* synthetic */ boolean $landscapeLayout;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template2Kt$AnimatedPackages$1$2(boolean z10, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, e eVar) {
        super(3);
        this.$landscapeLayout = z10;
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$childModifier = eVar;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((InterfaceC6784e) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(InterfaceC6784e AnimatedVisibility, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(AnimatedVisibility, "$this$AnimatedVisibility");
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1995133977, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template2.kt:323)");
        }
        C1131b c1131b = C1131b.f2093a;
        float fN = this.$landscapeLayout ? C5015h.n(UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM() / 2.0f) : UIConstant.INSTANCE.m389getDefaultVerticalSpacingD9Ej5fM();
        e.a aVar = l0.e.f52304a;
        C1131b.m mVarQ = c1131b.q(fN, aVar.i());
        PaywallState.Loaded.Legacy legacy = this.$state;
        PaywallViewModel paywallViewModel = this.$viewModel;
        androidx.compose.ui.e eVar = this.$childModifier;
        e.a aVar2 = androidx.compose.ui.e.f26613a;
        B bA = AbstractC1136g.a(mVarQ, aVar.k(), interfaceC2425m, 0);
        int iA = AbstractC2410h.a(interfaceC2425m, 0);
        I iR = interfaceC2425m.r();
        androidx.compose.ui.e eVarF = c.f(interfaceC2425m, aVar2);
        InterfaceC1788g.a aVar3 = InterfaceC1788g.f10745M;
        InterfaceC5082a interfaceC5082aA = aVar3.a();
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
        m2.e(interfaceC2425mB, bA, aVar3.e());
        m2.e(interfaceC2425mB, iR, aVar3.g());
        Function2 function2B = aVar3.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        m2.e(interfaceC2425mB, eVarF, aVar3.f());
        C1139j c1139j = C1139j.f2142a;
        interfaceC2425m.V(1488168427);
        Iterator<T> it = legacy.getTemplateConfiguration().getPackages().getAll().iterator();
        while (it.hasNext()) {
            Template2Kt.SelectPackageButton(c1139j, legacy, (TemplateConfiguration.PackageInfo) it.next(), paywallViewModel, eVar, interfaceC2425m, 6);
        }
        interfaceC2425m.O();
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
