package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Td.r;
import Y.U1;
import Y.h2;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000f\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/button/ButtonComponentState;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;", "style", "Lkotlin/Function0;", "Lc1/d;", "localeProvider", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;Lie/a;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "localeId", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "toPaywallAction-64pKzr8", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle$Action;Ljava/lang/String;)Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "toPaywallAction", "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/ButtonComponentStyle;", "Lie/a;", "action$delegate", "LY/h2;", "getAction", "()Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "action", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ButtonComponentState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: action$delegate, reason: from kotlin metadata */
    private final h2 action;
    private final InterfaceC5082a localeProvider;
    private final ButtonComponentStyle style;

    public ButtonComponentState(ButtonComponentStyle style, InterfaceC5082a localeProvider) {
        AbstractC5504s.h(style, "style");
        AbstractC5504s.h(localeProvider, "localeProvider");
        this.style = style;
        this.localeProvider = localeProvider;
        this.action = U1.d(new ButtonComponentState$action$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: toPaywallAction-64pKzr8, reason: not valid java name */
    public final PaywallAction m398toPaywallAction64pKzr8(ButtonComponentStyle.Action action, String str) {
        if (action instanceof ButtonComponentStyle.Action.NavigateBack) {
            return PaywallAction.External.NavigateBack.INSTANCE;
        }
        if (action instanceof ButtonComponentStyle.Action.NavigateTo) {
            ButtonComponentStyle.Action.NavigateTo navigateTo = (ButtonComponentStyle.Action.NavigateTo) action;
            ButtonComponentStyle.Action.NavigateTo.Destination destination = navigateTo.getDestination();
            if (destination instanceof ButtonComponentStyle.Action.NavigateTo.Destination.CustomerCenter) {
                return new PaywallAction.External.NavigateTo(PaywallAction.External.NavigateTo.Destination.CustomerCenter.INSTANCE);
            }
            if (destination instanceof ButtonComponentStyle.Action.NavigateTo.Destination.Url) {
                NonEmptyMap urls = ((ButtonComponentStyle.Action.NavigateTo.Destination.Url) navigateTo.getDestination()).getUrls();
                return new PaywallAction.External.NavigateTo(new PaywallAction.External.NavigateTo.Destination.Url((String) urls.getOrDefault(LocaleId.m307boximpl(str), urls.getEntry().getValue()), ((ButtonComponentStyle.Action.NavigateTo.Destination.Url) navigateTo.getDestination()).getMethod()));
            }
            if (destination instanceof ButtonComponentStyle.Action.NavigateTo.Destination.Sheet) {
                return new PaywallAction.Internal.NavigateTo(new PaywallAction.Internal.NavigateTo.Destination.Sheet((ButtonComponentStyle.Action.NavigateTo.Destination.Sheet) navigateTo.getDestination()));
            }
            throw new r();
        }
        if (action instanceof ButtonComponentStyle.Action.PurchasePackage) {
            ButtonComponentStyle.Action.PurchasePackage purchasePackage = (ButtonComponentStyle.Action.PurchasePackage) action;
            return new PaywallAction.External.PurchasePackage(purchasePackage.getRcPackage(), purchasePackage.getResolvedOffer());
        }
        if (action instanceof ButtonComponentStyle.Action.RestorePurchases) {
            return PaywallAction.External.RestorePurchases.INSTANCE;
        }
        if (action instanceof ButtonComponentStyle.Action.WebCheckout) {
            ButtonComponentStyle.Action.WebCheckout webCheckout = (ButtonComponentStyle.Action.WebCheckout) action;
            return new PaywallAction.External.LaunchWebCheckout(null, webCheckout.getOpenMethod(), webCheckout.getAutoDismiss(), new PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append(webCheckout.getRcPackage(), null));
        }
        if (action instanceof ButtonComponentStyle.Action.WebProductSelection) {
            ButtonComponentStyle.Action.WebProductSelection webProductSelection = (ButtonComponentStyle.Action.WebProductSelection) action;
            return new PaywallAction.External.LaunchWebCheckout(null, webProductSelection.getOpenMethod(), webProductSelection.getAutoDismiss(), PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.DoNotAppend.INSTANCE);
        }
        if (!(action instanceof ButtonComponentStyle.Action.CustomWebCheckout)) {
            throw new r();
        }
        ButtonComponentStyle.Action.CustomWebCheckout customWebCheckout = (ButtonComponentStyle.Action.CustomWebCheckout) action;
        NonEmptyMap<LocaleId, String> urls2 = customWebCheckout.getUrls();
        return new PaywallAction.External.LaunchWebCheckout((String) urls2.getOrDefault(LocaleId.m307boximpl(str), urls2.getEntry().getValue()), customWebCheckout.getOpenMethod(), customWebCheckout.getAutoDismiss(), new PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append(customWebCheckout.getRcPackage(), customWebCheckout.getPackageParam()));
    }

    public final /* synthetic */ PaywallAction getAction() {
        return (PaywallAction) this.action.getValue();
    }
}
