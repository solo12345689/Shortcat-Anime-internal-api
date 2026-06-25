package com.revenuecat.purchases.ui.revenuecatui.components.text;

import V.b;
import Y.AbstractC2454w;
import Y.InterfaceC2425m;
import b4.C2986c;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownState;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001ak\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u0007H\u0003¢\u0006\u0004\b\u0005\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;", "style", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;", "paywallState", "Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;", "rememberUpdatedTextComponentState", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;", "Lkotlin/Function0;", "Lc1/d;", "localeProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "selectedPackageInfoProvider", "", "selectedTabIndexProvider", "Lcom/revenuecat/purchases/ui/revenuecatui/composables/OfferEligibility;", "selectedOfferEligibilityProvider", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "customVariablesProvider", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/TextComponentStyle;Lie/a;Lie/a;Lie/a;Lie/a;Lie/a;LY/m;I)Lcom/revenuecat/purchases/ui/revenuecatui/components/text/TextComponentState;", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class TextComponentStateKt {
    public static final /* synthetic */ TextComponentState rememberUpdatedTextComponentState(TextComponentStyle style, PaywallState.Loaded.Components paywallState, InterfaceC2425m interfaceC2425m, int i10) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(paywallState, "paywallState");
        interfaceC2425m.V(-2051788968);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(-2051788968, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberUpdatedTextComponentState (TextComponentState.kt:43)");
        }
        interfaceC2425m.V(466367060);
        int i11 = (i10 & 112) ^ 48;
        boolean z10 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            objD = new TextComponentStateKt$rememberUpdatedTextComponentState$1$1(paywallState);
            interfaceC2425m.u(objD);
        }
        InterfaceC5082a interfaceC5082a = (InterfaceC5082a) objD;
        interfaceC2425m.O();
        interfaceC2425m.V(466368961);
        boolean z11 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD2 = interfaceC2425m.D();
        if (z11 || objD2 == InterfaceC2425m.f22370a.a()) {
            objD2 = new TextComponentStateKt$rememberUpdatedTextComponentState$2$1(paywallState);
            interfaceC2425m.u(objD2);
        }
        InterfaceC5082a interfaceC5082a2 = (InterfaceC5082a) objD2;
        interfaceC2425m.O();
        interfaceC2425m.V(466371166);
        boolean z12 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD3 = interfaceC2425m.D();
        if (z12 || objD3 == InterfaceC2425m.f22370a.a()) {
            objD3 = new TextComponentStateKt$rememberUpdatedTextComponentState$3$1(paywallState);
            interfaceC2425m.u(objD3);
        }
        InterfaceC5082a interfaceC5082a3 = (InterfaceC5082a) objD3;
        interfaceC2425m.O();
        interfaceC2425m.V(466373542);
        boolean z13 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD4 = interfaceC2425m.D();
        if (z13 || objD4 == InterfaceC2425m.f22370a.a()) {
            objD4 = new TextComponentStateKt$rememberUpdatedTextComponentState$4$1(paywallState);
            interfaceC2425m.u(objD4);
        }
        InterfaceC5082a interfaceC5082a4 = (InterfaceC5082a) objD4;
        interfaceC2425m.O();
        interfaceC2425m.V(466375875);
        boolean z14 = (i11 > 32 && interfaceC2425m.U(paywallState)) || (i10 & 48) == 32;
        Object objD5 = interfaceC2425m.D();
        if (z14 || objD5 == InterfaceC2425m.f22370a.a()) {
            objD5 = new TextComponentStateKt$rememberUpdatedTextComponentState$5$1(paywallState);
            interfaceC2425m.u(objD5);
        }
        interfaceC2425m.O();
        TextComponentState textComponentStateRememberUpdatedTextComponentState = rememberUpdatedTextComponentState(style, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, (InterfaceC5082a) objD5, interfaceC2425m, i10 & 14);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return textComponentStateRememberUpdatedTextComponentState;
    }

    private static final /* synthetic */ TextComponentState rememberUpdatedTextComponentState(TextComponentStyle textComponentStyle, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, InterfaceC5082a interfaceC5082a3, InterfaceC5082a interfaceC5082a4, InterfaceC5082a interfaceC5082a5, InterfaceC2425m interfaceC2425m, int i10) {
        interfaceC2425m.V(1424634030);
        if (AbstractC2454w.L()) {
            AbstractC2454w.U(1424634030, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberUpdatedTextComponentState (TextComponentState.kt:63)");
        }
        C2986c c2986cB = b.b(interfaceC2425m, 0).a().b();
        Date countdownDate = textComponentStyle.getCountdownDate();
        interfaceC2425m.V(466396405);
        CountdownState countdownStateRememberCountdownState = countdownDate == null ? null : CountdownComponentStateKt.rememberCountdownState(countdownDate, interfaceC2425m, 0);
        interfaceC2425m.O();
        interfaceC2425m.V(466399014);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && interfaceC2425m.U(textComponentStyle)) || (i10 & 6) == 4;
        Object objD = interfaceC2425m.D();
        if (z10 || objD == InterfaceC2425m.f22370a.a()) {
            TextComponentState textComponentState = new TextComponentState(c2986cB, textComponentStyle, interfaceC5082a, interfaceC5082a2, interfaceC5082a3, interfaceC5082a4, interfaceC5082a5);
            interfaceC2425m.u(textComponentState);
            objD = textComponentState;
        }
        TextComponentState textComponentState2 = (TextComponentState) objD;
        interfaceC2425m.O();
        textComponentState2.update(c2986cB, countdownStateRememberCountdownState != null ? countdownStateRememberCountdownState.getCountdownTime() : null);
        if (AbstractC2454w.L()) {
            AbstractC2454w.T();
        }
        interfaceC2425m.O();
        return textComponentState2;
    }
}
