package com.revenuecat.purchases.ui.revenuecatui.data;

import Jf.I;
import U.C2175l;
import Y.h2;
import Zd.e;
import android.app.Activity;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H&¢\u0006\u0004\b\u001e\u0010\u0004J\u0019\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH&¢\u0006\u0004\b!\u0010\"J.\u0010'\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H¦@¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010\u0004J\u0010\u0010*\u001a\u00020\u0002H¦@¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0002H&¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b-\u0010\u0004R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0007078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;078&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0007078&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u00109R\u001c\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010@078&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u00109¨\u0006C"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallViewModel;", "", "LTd/L;", "refreshStateIfLocaleChanged", "()V", "LU/l;", "colorScheme", "", "isDark", "refreshStateIfColorsChanged", "(LU/l;Z)V", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;", "packageToSelect", "selectPackage", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/TemplateConfiguration$PackageInfo;)V", "trackPaywallImpressionIfNeeded", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "exitOfferType", "", "exitOfferingIdentifier", "trackExitOffer", "(Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "result", "closePaywall", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;", "launchWebCheckout", "getWebCheckoutUrl", "(Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction$External$LaunchWebCheckout;)Ljava/lang/String;", "invalidateCustomerInfoCache", "Landroid/app/Activity;", "activity", "purchaseSelectedPackage", "(Landroid/app/Activity;)V", "Lcom/revenuecat/purchases/Package;", "pkg", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;", "resolvedOffer", "handlePackagePurchase", "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResolvedOffer;LZd/e;)Ljava/lang/Object;", "restorePurchases", "handleRestorePurchases", "(LZd/e;)Ljava/lang/Object;", "clearActionError", "preloadExitOffering", "LJf/I;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState;", "getState", "()LJf/I;", "state", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "getResourceProvider", "()Lcom/revenuecat/purchases/ui/revenuecatui/helpers/ResourceProvider;", "resourceProvider", "LY/h2;", "getActionInProgress", "()LY/h2;", "actionInProgress", "Lcom/revenuecat/purchases/PurchasesError;", "getActionError", "actionError", "getPurchaseCompleted", "purchaseCompleted", "Lcom/revenuecat/purchases/Offering;", "getPreloadedExitOffering", "preloadedExitOffering", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaywallViewModel {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void closePaywall$default(PaywallViewModel paywallViewModel, PaywallResult paywallResult, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closePaywall");
            }
            if ((i10 & 1) != 0) {
                paywallResult = null;
            }
            paywallViewModel.closePaywall(paywallResult);
        }

        public static /* synthetic */ Object handlePackagePurchase$default(PaywallViewModel paywallViewModel, Activity activity, Package r22, ResolvedOffer resolvedOffer, e eVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handlePackagePurchase");
            }
            if ((i10 & 4) != 0) {
                resolvedOffer = null;
            }
            return paywallViewModel.handlePackagePurchase(activity, r22, resolvedOffer, eVar);
        }
    }

    void clearActionError();

    void closePaywall(PaywallResult result);

    h2 getActionError();

    h2 getActionInProgress();

    h2 getPreloadedExitOffering();

    h2 getPurchaseCompleted();

    ResourceProvider getResourceProvider();

    I getState();

    String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout);

    Object handlePackagePurchase(Activity activity, Package r22, ResolvedOffer resolvedOffer, e eVar);

    Object handleRestorePurchases(e eVar);

    void invalidateCustomerInfoCache();

    void preloadExitOffering();

    void purchaseSelectedPackage(Activity activity);

    void refreshStateIfColorsChanged(C2175l colorScheme, boolean isDark);

    void refreshStateIfLocaleChanged();

    void restorePurchases();

    void selectPackage(TemplateConfiguration.PackageInfo packageToSelect);

    void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier);

    void trackPaywallImpressionIfNeeded();
}
