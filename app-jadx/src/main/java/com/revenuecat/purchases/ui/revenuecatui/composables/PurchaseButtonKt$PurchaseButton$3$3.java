package com.revenuecat.purchases.ui.revenuecatui.composables;

import C.I;
import I0.B;
import K0.InterfaceC1788g;
import R0.C;
import R0.r;
import Td.L;
import Y.AbstractC2410h;
import Y.AbstractC2454w;
import Y.C0;
import Y.InterfaceC2425m;
import Y.h2;
import Y.m2;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import g0.i;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import l0.e;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LC/I;", "LTd/L;", "invoke", "(LC/I;LY/m;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchaseButtonKt$PurchaseButton$3$3 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ h2 $labelOpacity$delegate;
    final /* synthetic */ TemplateConfiguration.PackageConfiguration $packages;
    final /* synthetic */ C0 $selectedPackage;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt$PurchaseButton$3$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR0/C;", "LTd/L;", "invoke", "(LR0/C;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final void invoke(C clearAndSetSemantics) {
            AbstractC5504s.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C) obj);
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchaseButtonKt$PurchaseButton$3$3(TemplateConfiguration.PackageConfiguration packageConfiguration, C0 c02, TemplateConfiguration.Colors colors, h2 h2Var, PaywallViewModel paywallViewModel) {
        super(3);
        this.$packages = packageConfiguration;
        this.$selectedPackage = c02;
        this.$colors = colors;
        this.$labelOpacity$delegate = h2Var;
        this.$viewModel = paywallViewModel;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((I) obj, (InterfaceC2425m) obj2, ((Number) obj3).intValue());
        return L.f17438a;
    }

    public final void invoke(I Button, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(Button, "$this$Button");
        if ((i10 & 17) == 16 && interfaceC2425m.i()) {
            interfaceC2425m.K();
            return;
        }
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1286977873, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous> (PurchaseButton.kt:132)");
        }
        e.a aVar = e.f26613a;
        e eVarC = r.c(aVar, AnonymousClass1.INSTANCE);
        TemplateConfiguration.PackageConfiguration packageConfiguration = this.$packages;
        C0 c02 = this.$selectedPackage;
        TemplateConfiguration.Colors colors = this.$colors;
        h2 h2Var = this.$labelOpacity$delegate;
        PaywallViewModel paywallViewModel = this.$viewModel;
        e.a aVar2 = l0.e.f52304a;
        B bH = f.h(aVar2.o(), false);
        int iA = AbstractC2410h.a(interfaceC2425m, 0);
        Y.I iR = interfaceC2425m.r();
        androidx.compose.ui.e eVarF = c.f(interfaceC2425m, eVarC);
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
        m2.e(interfaceC2425mB, bH, aVar3.e());
        m2.e(interfaceC2425mB, iR, aVar3.g());
        Function2 function2B = aVar3.b();
        if (interfaceC2425mB.e() || !AbstractC5504s.c(interfaceC2425mB.D(), Integer.valueOf(iA))) {
            interfaceC2425mB.u(Integer.valueOf(iA));
            interfaceC2425mB.m(Integer.valueOf(iA), function2B);
        }
        m2.e(interfaceC2425mB, eVarF, aVar3.f());
        h hVar = h.f26161a;
        ConsistentPackageContentViewKt.ConsistentPackageContentView(packageConfiguration.getAll(), (TemplateConfiguration.PackageInfo) c02.getValue(), i.d(98081200, true, new PurchaseButtonKt$PurchaseButton$3$3$2$1(colors, h2Var), interfaceC2425m, 54), interfaceC2425m, 384);
        androidx.compose.ui.e eVarC2 = hVar.c(aVar);
        B bH2 = f.h(aVar2.o(), false);
        int iA2 = AbstractC2410h.a(interfaceC2425m, 0);
        Y.I iR2 = interfaceC2425m.r();
        androidx.compose.ui.e eVarF2 = c.f(interfaceC2425m, eVarC2);
        InterfaceC5082a interfaceC5082aA2 = aVar3.a();
        if (interfaceC2425m.j() == null) {
            AbstractC2410h.d();
        }
        interfaceC2425m.I();
        if (interfaceC2425m.e()) {
            interfaceC2425m.h(interfaceC5082aA2);
        } else {
            interfaceC2425m.s();
        }
        InterfaceC2425m interfaceC2425mB2 = m2.b(interfaceC2425m);
        m2.e(interfaceC2425mB2, bH2, aVar3.e());
        m2.e(interfaceC2425mB2, iR2, aVar3.g());
        Function2 function2B2 = aVar3.b();
        if (interfaceC2425mB2.e() || !AbstractC5504s.c(interfaceC2425mB2.D(), Integer.valueOf(iA2))) {
            interfaceC2425mB2.u(Integer.valueOf(iA2));
            interfaceC2425mB2.m(Integer.valueOf(iA2), function2B2);
        }
        m2.e(interfaceC2425mB2, eVarF2, aVar3.f());
        PurchaseButtonKt.LoadingSpinner(hVar, ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue(), colors, interfaceC2425m, 6);
        interfaceC2425m.x();
        interfaceC2425m.x();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
    }
}
