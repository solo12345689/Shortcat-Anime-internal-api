package com.revenuecat.purchases.ui.revenuecatui;

import Td.L;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/Offering;", "exitOffering", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "<anonymous parameter 1>", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ Function1 $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallDialogKt$PaywallDialogContent$paywallOptions$1$2(Function1 function1) {
        super(2);
        this.$onDismissRequest = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Offering) obj, (PaywallResult) obj2);
        return L.f17438a;
    }

    public final void invoke(Offering offering, PaywallResult paywallResult) {
        this.$onDismissRequest.invoke(offering != null ? new OfferingSelection.OfferingType(offering) : null);
    }
}
