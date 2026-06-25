package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import V.b;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import androidx.compose.ui.platform.AbstractC2739w0;
import b4.C2986c;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import i1.EnumC5027t;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a]\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u0007H\u0003¢\u0006\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "paywallState", "Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;", "rememberUpdatedStackComponentState", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;", "Lkotlin/Function0;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentState;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class StackComponentStateKt {
    public static final /* synthetic */ StackComponentState rememberUpdatedStackComponentState(StackComponentStyle style, PaywallState.Loaded.Components paywallState, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(paywallState, "paywallState");
        interfaceC2425m.V(-1712011381);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1712011381, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.rememberUpdatedStackComponentState (StackComponentState.kt:39)");
        }
        interfaceC2425m.V(998073447);
        int i11 = (i10 & 112) ^ 48;
        boolean z10 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new StackComponentStateKt$rememberUpdatedStackComponentState$1$1(paywallState);
            interfaceC2425m.u(objD);
        }
        InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD;
        interfaceC2425m.O();
        interfaceC2425m.V(998075652);
        boolean z11 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD2 = interfaceC2425m.D();
        if (z11 || objD2 == InterfaceC2425m.f22370a.a()) {
            objD2 = new StackComponentStateKt$rememberUpdatedStackComponentState$2$1(paywallState);
            interfaceC2425m.u(objD2);
        }
        InterfaceC5082a interfaceC5082a2 = (InterfaceC5082a) objD2;
        interfaceC2425m.O();
        interfaceC2425m.V(998078028);
        boolean z12 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD3 = interfaceC2425m.D();
        if (z12 || objD3 == InterfaceC2425m.f22370a.a()) {
            objD3 = new StackComponentStateKt$rememberUpdatedStackComponentState$3$1(paywallState);
            interfaceC2425m.u(objD3);
        }
        InterfaceC5082a interfaceC5082a3 = (InterfaceC5082a) objD3;
        interfaceC2425m.O();
        interfaceC2425m.V(998080361);
        boolean z13 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD4 = interfaceC2425m.D();
        if (z13 || objD4 == InterfaceC2425m.f22370a.a()) {
            objD4 = new StackComponentStateKt$rememberUpdatedStackComponentState$4$1(paywallState);
            interfaceC2425m.u(objD4);
        }
        interfaceC2425m.O();
        StackComponentState stackComponentStateRememberUpdatedStackComponentState = rememberUpdatedStackComponentState(style, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, (InterfaceC5082a) objD4, interfaceC2425m, i10 & 14);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return stackComponentStateRememberUpdatedStackComponentState;
    }

    private static final /* synthetic */ StackComponentState rememberUpdatedStackComponentState(StackComponentStyle stackComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(1491776249);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1491776249, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.rememberUpdatedStackComponentState (StackComponentState.kt:56)");
        }
        C2986c c2986cB = b.b(interfaceC2425m, 0).a().b();
        EnumC5027t enumC5027t = (EnumC5027t) interfaceC2425m.n(AbstractC2739w0.k());
        interfaceC2425m.V(998099958);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(stackComponentStyle)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            StackComponentState stackComponentState = new StackComponentState(c2986cB, enumC5027t, stackComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4);
            interfaceC2425m.u(stackComponentState);
            objD = stackComponentState;
        }
        StackComponentState stackComponentState2 = (StackComponentState) objD;
        interfaceC2425m.O();
        stackComponentState2.update(c2986cB, enumC5027t);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return stackComponentState2;
    }
}
