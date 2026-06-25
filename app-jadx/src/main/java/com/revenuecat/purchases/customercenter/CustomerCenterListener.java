package com.revenuecat.purchases.customercenter;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "", "Lcom/revenuecat/purchases/customercenter/Resumable;", "resume", "LTd/L;", "onRestoreInitiated", "(Lcom/revenuecat/purchases/customercenter/Resumable;)V", "onRestoreStarted", "()V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onRestoreFailed", "(Lcom/revenuecat/purchases/PurchasesError;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "onRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "onShowingManageSubscriptions", "", "feedbackSurveyOptionId", "onFeedbackSurveyCompleted", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "action", "onManagementOptionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)V", "actionIdentifier", "purchaseIdentifier", "onCustomActionSelected", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "onPromotionalOfferSucceeded", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CustomerCenterListener {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onCustomActionSelected(CustomerCenterListener customerCenterListener, String actionIdentifier, String str) {
            AbstractC5504s.h(actionIdentifier, "actionIdentifier");
            CustomerCenterListener.super.onCustomActionSelected(actionIdentifier, str);
        }

        @Deprecated
        public static void onFeedbackSurveyCompleted(CustomerCenterListener customerCenterListener, String feedbackSurveyOptionId) {
            AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
            CustomerCenterListener.super.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
        }

        @Deprecated
        public static void onManagementOptionSelected(CustomerCenterListener customerCenterListener, CustomerCenterManagementOption action) {
            AbstractC5504s.h(action, "action");
            CustomerCenterListener.super.onManagementOptionSelected(action);
        }

        @Deprecated
        public static void onPromotionalOfferSucceeded(CustomerCenterListener customerCenterListener, CustomerInfo customerInfo, StoreTransaction transaction) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            AbstractC5504s.h(transaction, "transaction");
            CustomerCenterListener.super.onPromotionalOfferSucceeded(customerInfo, transaction);
        }

        @Deprecated
        public static void onRestoreCompleted(CustomerCenterListener customerCenterListener, CustomerInfo customerInfo) {
            AbstractC5504s.h(customerInfo, "customerInfo");
            CustomerCenterListener.super.onRestoreCompleted(customerInfo);
        }

        @Deprecated
        public static void onRestoreFailed(CustomerCenterListener customerCenterListener, PurchasesError error) {
            AbstractC5504s.h(error, "error");
            CustomerCenterListener.super.onRestoreFailed(error);
        }

        @Deprecated
        public static void onRestoreInitiated(CustomerCenterListener customerCenterListener, Resumable resume) {
            AbstractC5504s.h(resume, "resume");
            CustomerCenterListener.super.onRestoreInitiated(resume);
        }

        @Deprecated
        public static void onRestoreStarted(CustomerCenterListener customerCenterListener) {
            CustomerCenterListener.super.onRestoreStarted();
        }

        @Deprecated
        public static void onShowingManageSubscriptions(CustomerCenterListener customerCenterListener) {
            CustomerCenterListener.super.onShowingManageSubscriptions();
        }
    }

    default void onCustomActionSelected(String actionIdentifier, String purchaseIdentifier) {
        AbstractC5504s.h(actionIdentifier, "actionIdentifier");
    }

    default void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
        AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
    }

    default void onManagementOptionSelected(CustomerCenterManagementOption action) {
        AbstractC5504s.h(action, "action");
    }

    default void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
        AbstractC5504s.h(customerInfo, "customerInfo");
        AbstractC5504s.h(transaction, "transaction");
    }

    default void onRestoreCompleted(CustomerInfo customerInfo) {
        AbstractC5504s.h(customerInfo, "customerInfo");
    }

    default void onRestoreFailed(PurchasesError error) {
        AbstractC5504s.h(error, "error");
    }

    default void onRestoreInitiated(Resumable resume) {
        AbstractC5504s.h(resume, "resume");
        Resumable.invoke$default(resume, false, 1, null);
    }

    default void onRestoreStarted() {
    }

    default void onShowingManageSubscriptions() {
    }
}
