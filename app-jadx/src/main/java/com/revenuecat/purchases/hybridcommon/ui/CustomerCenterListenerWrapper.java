package com.revenuecat.purchases.hybridcommon.ui;

import Df.r;
import Td.InterfaceC2154e;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\bJ%\u0010\u001e\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH&¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0006H&¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H&¢\u0006\u0004\b\"\u0010\u0003J!\u0010$\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b$\u0010%J+\u0010$\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b$\u0010(J!\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b*\u0010%JC\u0010,\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001c2\u0006\u0010+\u001a\u00020\u0004H&¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/CustomerCenterListenerWrapper;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "<init>", "()V", "", "feedbackSurveyOptionId", "LTd/L;", "onFeedbackSurveyCompleted", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "onRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onRestoreFailed", "(Lcom/revenuecat/purchases/PurchasesError;)V", "onRestoreStarted", "onShowingManageSubscriptions", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transaction", "onPromotionalOfferSucceeded", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;", "action", "onManagementOptionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)V", "onFeedbackSurveyCompletedWrapper", "", "", "onRestoreCompletedWrapper", "(Ljava/util/Map;)V", "onRestoreFailedWrapper", "onRestoreStartedWrapper", "onShowingManageSubscriptionsWrapper", "url", "onManagementOptionSelectedWrapper", "(Ljava/lang/String;Ljava/lang/String;)V", "customAction", "purchaseIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "actionId", "onCustomActionSelectedWrapper", "offerId", "onPromotionalOfferSucceededWrapper", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CustomerCenterListenerWrapper implements CustomerCenterListener {
    public abstract void onCustomActionSelectedWrapper(String actionId, String purchaseIdentifier);

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
        AbstractC5504s.h(feedbackSurveyOptionId, "feedbackSurveyOptionId");
        onFeedbackSurveyCompletedWrapper(feedbackSurveyOptionId);
    }

    public abstract void onFeedbackSurveyCompletedWrapper(String feedbackSurveyOptionId);

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onManagementOptionSelected(CustomerCenterManagementOption action) {
        AbstractC5504s.h(action, "action");
        if (action instanceof CustomerCenterManagementOption.CustomUrl) {
            onManagementOptionSelectedWrapper(CustomerCenterListenerWrapperKt.getOptionName(action), ((CustomerCenterManagementOption.CustomUrl) action).getUri().toString());
        } else {
            if (!(action instanceof CustomerCenterManagementOption.CustomAction)) {
                onManagementOptionSelectedWrapper(CustomerCenterListenerWrapperKt.getOptionName(action), null);
                return;
            }
            CustomerCenterManagementOption.CustomAction customAction = (CustomerCenterManagementOption.CustomAction) action;
            onCustomActionSelectedWrapper(customAction.getActionIdentifier(), customAction.getPurchaseIdentifier());
            onManagementOptionSelectedWrapper(CustomerCenterListenerWrapperKt.getOptionName(action), customAction.getActionIdentifier(), customAction.getPurchaseIdentifier());
        }
    }

    public abstract void onManagementOptionSelectedWrapper(String action, String url);

    @InterfaceC2154e
    public abstract void onManagementOptionSelectedWrapper(String action, String customAction, String purchaseIdentifier);

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
        String strU0;
        AbstractC5504s.h(customerInfo, "customerInfo");
        AbstractC5504s.h(transaction, "transaction");
        String subscriptionOptionId = transaction.getSubscriptionOptionId();
        String str = "";
        if (subscriptionOptionId != null && (strU0 = r.U0(subscriptionOptionId, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "")) != null) {
            if (strU0.length() == 0) {
                strU0 = null;
            }
            if (strU0 != null) {
                str = strU0;
            }
        }
        onPromotionalOfferSucceededWrapper(CustomerInfoMapperKt.map(customerInfo), StoreTransactionMapperKt.map(transaction), str);
    }

    public abstract void onPromotionalOfferSucceededWrapper(Map<String, ? extends Object> customerInfo, Map<String, ? extends Object> transaction, String offerId);

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onRestoreCompleted(CustomerInfo customerInfo) {
        AbstractC5504s.h(customerInfo, "customerInfo");
        onRestoreCompletedWrapper(CustomerInfoMapperKt.map(customerInfo));
    }

    public abstract void onRestoreCompletedWrapper(Map<String, ? extends Object> customerInfo);

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onRestoreFailed(PurchasesError error) {
        AbstractC5504s.h(error, "error");
        onRestoreFailedWrapper(PurchasesErrorKt.map$default(error, null, 1, null).getInfo());
    }

    public abstract void onRestoreFailedWrapper(Map<String, ? extends Object> error);

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onRestoreStarted() {
        onRestoreStartedWrapper();
    }

    public abstract void onRestoreStartedWrapper();

    @Override // com.revenuecat.purchases.customercenter.CustomerCenterListener
    public void onShowingManageSubscriptions() {
        onShowingManageSubscriptionsWrapper();
    }

    public abstract void onShowingManageSubscriptionsWrapper();
}
