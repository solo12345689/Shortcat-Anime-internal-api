package com.revenuecat.purchases.ui.revenuecatui;

import Jf.AbstractC1744g;
import Jf.I;
import Jf.K;
import Jf.u;
import Td.L;
import U.C2175l;
import Y.b2;
import Y.h2;
import Zd.e;
import android.app.Activity;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\nJ\u0019\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J,\u0010-\u001a\u00020\b2\u0006\u0010&\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0096@¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\nJ\u0010\u00100\u001a\u00020\bH\u0096@¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\nJ\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0014078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u0014078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u0010;R\"\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010;R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/LoadingViewModel;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;)V", "LTd/L;", "trackPaywallImpressionIfNeeded", "()V", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "exitOfferType", "", "exitOfferingIdentifier", "trackExitOffer", "(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V", "refreshStateIfLocaleChanged", "LU/l;", "colorScheme", "", "isDarkMode", "refreshStateIfColorsChanged", "(LU/l;Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageToSelect", "selectPackage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "result", "closePaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;", "launchWebCheckout", "getWebCheckoutUrl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;", "invalidateCustomerInfoCache", "Landroid/app/Activity;", "activity", "purchaseSelectedPackage", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/Package;", "pkg", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "handlePackagePurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;", "restorePurchases", "handleRestorePurchases", "(LZd/e;)Ljava/lang/Object;", "clearActionError", "preloadExitOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "getResourceProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "LY/h2;", "actionInProgress", "LY/h2;", "getActionInProgress", "()LY/h2;", "Lcom/revenuecat/purchases/PurchasesError;", "actionError", "getActionError", "purchaseCompleted", "getPurchaseCompleted", "Lcom/revenuecat/purchases/Offering;", "preloadedExitOffering", "getPreloadedExitOffering", "LJf/u;", "_state", "LJf/u;", "LJf/I;", "getState", "()LJf/I;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LoadingViewModel implements PaywallViewModel {
    private final u _state;
    private final h2 actionError;
    private final h2 actionInProgress;
    private final h2 preloadedExitOffering;
    private final h2 purchaseCompleted;
    private final ResourceProvider resourceProvider;

    public LoadingViewModel(PaywallState state, ResourceProvider resourceProvider) {
        AbstractC5504s.h(state, "state");
        AbstractC5504s.h(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        Boolean bool = Boolean.FALSE;
        this.actionInProgress = b2.e(bool, null, 2, null);
        this.actionError = b2.e(null, null, 2, null);
        this.purchaseCompleted = b2.e(bool, null, 2, null);
        this.preloadedExitOffering = b2.e(null, null, 2, null);
        this._state = K.a(state);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getActionError() {
        return this.actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getActionInProgress() {
        return this.actionInProgress;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getPreloadedExitOffering() {
        return this.preloadedExitOffering;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public h2 getPurchaseCompleted() {
        return this.purchaseCompleted;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public I getState() {
        return AbstractC1744g.b(this._state);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout) {
        AbstractC5504s.h(launchWebCheckout, "launchWebCheckout");
        return null;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public Object handlePackagePurchase(Activity activity, Package r22, ResolvedOffer resolvedOffer, e eVar) {
        return L.f17438a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public Object handleRestorePurchases(e eVar) {
        return L.f17438a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfColorsChanged(C2175l colorScheme, boolean isDarkMode) {
        AbstractC5504s.h(colorScheme, "colorScheme");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void selectPackage(TemplateConfiguration.PackageInfo packageToSelect) {
        AbstractC5504s.h(packageToSelect, "packageToSelect");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier) {
        AbstractC5504s.h(exitOfferType, "exitOfferType");
        AbstractC5504s.h(exitOfferingIdentifier, "exitOfferingIdentifier");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void clearActionError() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void invalidateCustomerInfoCache() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void preloadExitOffering() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void refreshStateIfLocaleChanged() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void restorePurchases() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void trackPaywallImpressionIfNeeded() {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void closePaywall(PaywallResult result) {
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel
    public void purchaseSelectedPackage(Activity activity) {
    }
}
