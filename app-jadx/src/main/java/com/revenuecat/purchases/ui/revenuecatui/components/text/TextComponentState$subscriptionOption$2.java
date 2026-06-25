package com.revenuecat.purchases.ui.revenuecatui.components.text;

import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TextComponentState$subscriptionOption$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TextComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextComponentState$subscriptionOption$2(TextComponentState textComponentState) {
        super(0);
        this.this$0 = textComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final SubscriptionOption invoke() {
        ResolvedOffer resolvedOffer;
        SubscriptionOption subscriptionOption;
        ResolvedOffer resolvedOffer2 = this.this$0.style.getResolvedOffer();
        if (resolvedOffer2 != null && (subscriptionOption = resolvedOffer2.getSubscriptionOption()) != null) {
            return subscriptionOption;
        }
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) this.this$0.selectedPackageInfoProvider.invoke();
        if (selectedPackageInfo == null || (resolvedOffer = selectedPackageInfo.getResolvedOffer()) == null) {
            return null;
        }
        return resolvedOffer.getSubscriptionOption();
    }
}
