package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u0005\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "paywallState", "Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;", "rememberButtonComponentState", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;", "Lkotlin/Function0;", "Lc1/d;", "localeProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ButtonComponentStateKt {
    public static final /* synthetic */ ButtonComponentState rememberButtonComponentState(ButtonComponentStyle style, PaywallState.Loaded.Components paywallState, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(paywallState, "paywallState");
        interfaceC2425m.V(1389420952);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1389420952, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.rememberButtonComponentState (ButtonComponentState.kt:23)");
        }
        interfaceC2425m.V(1826056919);
        boolean z10 = (((i10 & 112) ^ 48) > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new ButtonComponentStateKt$rememberButtonComponentState$1$1(paywallState);
            interfaceC2425m.u(objD);
        }
        interfaceC2425m.O();
        ButtonComponentState buttonComponentStateRememberButtonComponentState = rememberButtonComponentState(style, (InterfaceC5082a) objD, interfaceC2425m, i10 & 14);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return buttonComponentStateRememberButtonComponentState;
    }

    public static final /* synthetic */ ButtonComponentState rememberButtonComponentState(ButtonComponentStyle style, InterfaceC5082a localeProvider, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(localeProvider, "localeProvider");
        interfaceC2425m.V(-1664983180);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-1664983180, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.rememberButtonComponentState (ButtonComponentState.kt:34)");
        }
        interfaceC2425m.V(1826063475);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(style)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new ButtonComponentState(style, localeProvider);
            interfaceC2425m.u(objD);
        }
        ButtonComponentState buttonComponentState = (ButtonComponentState) objD;
        interfaceC2425m.O();
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return buttonComponentState;
    }
}
