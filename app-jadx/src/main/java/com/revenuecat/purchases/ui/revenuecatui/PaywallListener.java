package com.revenuecat.purchases.ui.revenuecatui;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.ui.revenuecatui.utils.Resumable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/PaywallListener;", "", "Lcom/revenuecat/purchases/Package;", "rcPackage", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;", "resume", "LTd/L;", "onPurchasePackageInitiated", "(Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;)V", "onRestoreInitiated", "(Lcom/revenuecat/purchases/ui/revenuecatui/utils/Resumable;)V", "onPurchaseStarted", "(Lcom/revenuecat/purchases/Package;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "onPurchaseCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onPurchaseError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "onPurchaseCancelled", "()V", "onRestoreStarted", "onRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "onRestoreError", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaywallListener {
    void onPurchaseCancelled();

    void onPurchaseCompleted(CustomerInfo customerInfo, StoreTransaction storeTransaction);

    void onPurchaseError(PurchasesError purchasesError);

    void onPurchasePackageInitiated(Package rcPackage, Resumable resume);

    void onPurchaseStarted(Package rcPackage);

    void onRestoreCompleted(CustomerInfo customerInfo);

    void onRestoreError(PurchasesError purchasesError);

    void onRestoreInitiated(Resumable resume);

    void onRestoreStarted();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onPurchaseCompleted(PaywallListener paywallListener, CustomerInfo customerInfo, StoreTransaction storeTransaction) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            AbstractC5504s.h(storeTransaction, "storeTransaction");
        }

        public static void onPurchaseError(PaywallListener paywallListener, PurchasesError error) {
            AbstractC5504s.h(error, "error");
        }

        public static void onPurchasePackageInitiated(PaywallListener paywallListener, Package rcPackage, Resumable resume) {
            AbstractC5504s.h(rcPackage, "rcPackage");
            AbstractC5504s.h(resume, "resume");
            Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
        }

        public static void onPurchaseStarted(PaywallListener paywallListener, Package rcPackage) {
            AbstractC5504s.h(rcPackage, "rcPackage");
        }

        public static void onRestoreCompleted(PaywallListener paywallListener, CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
        }

        public static void onRestoreError(PaywallListener paywallListener, PurchasesError error) {
            AbstractC5504s.h(error, "error");
        }

        public static void onRestoreInitiated(PaywallListener paywallListener, Resumable resume) {
            AbstractC5504s.h(resume, "resume");
            Resumable.DefaultImpls.invoke$default(resume, false, 1, null);
        }

        public static void onPurchaseCancelled(PaywallListener paywallListener) {
        }

        public static void onRestoreStarted(PaywallListener paywallListener) {
        }
    }
}
