package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Gf.AbstractC1617k;
import Td.L;
import android.content.Context;
import androidx.lifecycle.V;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "option", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerCenterViewModelImpl$pathButtonPressed$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Context $context;
    final /* synthetic */ CustomerCenterConfigData.HelpPath $path;
    final /* synthetic */ PurchaseInformation $purchaseInformation;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterViewModelImpl$pathButtonPressed$1$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath helpPath, Context context, PurchaseInformation purchaseInformation) {
        super(1);
        this.this$0 = customerCenterViewModelImpl;
        this.$path = helpPath;
        this.$context = context;
        this.$purchaseInformation = purchaseInformation;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option) obj);
        return L.f17438a;
    }

    public final void invoke(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        if (option != null) {
            CustomerCenterViewModelImpl customerCenterViewModelImpl = this.this$0;
            CustomerCenterConfigData.HelpPath helpPath = this.$path;
            Context context = this.$context;
            PurchaseInformation purchaseInformation = this.$purchaseInformation;
            customerCenterViewModelImpl.trackCustomerCenterEventOptionChosen(helpPath.getType(), helpPath.getUrl(), option.getId());
            customerCenterViewModelImpl.notifyListenersForFeedbackSurveyCompleted(option.getId());
            if (AbstractC1617k.d(V.a(customerCenterViewModelImpl), null, null, new CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1(customerCenterViewModelImpl, context, purchaseInformation, option, helpPath, null), 3, null) != null) {
                return;
            }
        }
        this.this$0.goBackToMain();
        L l10 = L.f17438a;
    }
}
