package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Td.L;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOption", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/models/SubscriptionOption;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1(Function1 function1) {
        super(1);
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SubscriptionOption) obj);
        return L.f17438a;
    }

    public final void invoke(SubscriptionOption subscriptionOption) {
        AbstractC5504s.h(subscriptionOption, "subscriptionOption");
        this.$onAction.invoke(new CustomerCenterAction.PurchasePromotionalOffer(subscriptionOption));
    }
}
