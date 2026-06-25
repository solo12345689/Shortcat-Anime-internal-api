package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Jf.I;
import U.C2175l;
import Y.h2;
import Zd.e;
import android.app.Activity;
import android.content.Context;
import com.revenuecat.purchases.customercenter.CustomActionData;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import ie.InterfaceC5082a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH¦@¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH¦@¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%H&¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bH§@¢\u0006\u0004\b)\u0010\u000fJ\u0010\u0010*\u001a\u00020\bH¦@¢\u0006\u0004\b*\u0010\u000fJ)\u0010.\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020,H&¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH&¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH&¢\u0006\u0004\b6\u00101J\u001f\u0010:\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u001aH&¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\bH&¢\u0006\u0004\b<\u00101J\u0017\u0010=\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\bH&¢\u0006\u0004\b?\u00101J\u000f\u0010@\u001a\u00020\bH&¢\u0006\u0004\b@\u00101J\u000f\u0010A\u001a\u00020\bH&¢\u0006\u0004\bA\u00101J\u0017\u0010C\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u001aH&¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\bH&¢\u0006\u0004\bE\u00101J\u000f\u0010F\u001a\u00020\bH&¢\u0006\u0004\bF\u00101R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020H0G8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u001c\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;", "", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "path", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "product", "LTd/L;", "pathButtonPressed", "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "purchase", "selectPurchase", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "dismissRestoreDialog", "(LZd/e;)Ljava/lang/Object;", "restorePurchases", "", "supportEmail", "contactSupport", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "promotionalOffer", "originalPath", "purchaseInformation", "", "loadAndDisplayPromotionalOffer", "(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "Landroid/app/Activity;", "activity", "onAcceptedPromotionalOffer", "(Lcom/revenuecat/purchases/models/SubscriptionOption;Landroid/app/Activity;LZd/e;)Ljava/lang/Object;", "dismissPromotionalOffer", "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V", "Lkotlin/Function0;", "onDismiss", "onNavigationButtonPressed", "(Landroid/content/Context;Lie/a;)V", "loadCustomerCenter", "refreshCustomerCenter", "url", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "method", "openURL", "(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V", "clearActionError", "()V", "Lcom/revenuecat/purchases/customercenter/CustomActionData;", "customActionData", "onCustomActionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V", "refreshStateIfLocaleChanged", "LU/l;", "currentColorScheme", "isSystemInDarkTheme", "refreshColors", "(LU/l;Z)V", "trackImpressionIfNeeded", "showPaywall", "(Landroid/content/Context;)V", "showVirtualCurrencyBalances", "showCreateSupportTicket", "dismissSupportTicketSuccessSnackbar", "isChangingConfigurations", "onActivityStopped", "(Z)V", "onActivityStarted", "onActivityResumed", "LJf/I;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;", "getState", "()LJf/I;", "state", "LY/h2;", "Lcom/revenuecat/purchases/PurchasesError;", "getActionError", "()LY/h2;", "actionError", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CustomerCenterViewModel {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object loadAndDisplayPromotionalOffer$default(CustomerCenterViewModel customerCenterViewModel, Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAndDisplayPromotionalOffer");
            }
            if ((i10 & 16) != 0) {
                purchaseInformation = null;
            }
            return customerCenterViewModel.loadAndDisplayPromotionalOffer(context, storeProduct, promotionalOffer, helpPath, purchaseInformation, eVar);
        }

        public static /* synthetic */ void openURL$default(CustomerCenterViewModel customerCenterViewModel, Context context, String str, CustomerCenterConfigData.HelpPath.OpenMethod openMethod, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openURL");
            }
            if ((i10 & 4) != 0) {
                openMethod = CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL;
            }
            customerCenterViewModel.openURL(context, str, openMethod);
        }
    }

    void clearActionError();

    void contactSupport(Context context, String supportEmail);

    void dismissPromotionalOffer(Context context, CustomerCenterConfigData.HelpPath originalPath);

    Object dismissRestoreDialog(e eVar);

    void dismissSupportTicketSuccessSnackbar();

    h2 getActionError();

    I getState();

    Object loadAndDisplayPromotionalOffer(Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar);

    Object loadCustomerCenter(e eVar);

    Object onAcceptedPromotionalOffer(SubscriptionOption subscriptionOption, Activity activity, e eVar);

    void onActivityResumed();

    void onActivityStarted();

    void onActivityStopped(boolean isChangingConfigurations);

    void onCustomActionSelected(CustomActionData customActionData);

    void onNavigationButtonPressed(Context context, InterfaceC5082a onDismiss);

    void openURL(Context context, String url, CustomerCenterConfigData.HelpPath.OpenMethod method);

    void pathButtonPressed(Context context, CustomerCenterConfigData.HelpPath path, PurchaseInformation product);

    void refreshColors(C2175l currentColorScheme, boolean isSystemInDarkTheme);

    Object refreshCustomerCenter(e eVar);

    void refreshStateIfLocaleChanged();

    Object restorePurchases(e eVar);

    void selectPurchase(PurchaseInformation purchase);

    void showCreateSupportTicket();

    void showPaywall(Context context);

    void showVirtualCurrencyBalances();

    void trackImpressionIfNeeded();
}
