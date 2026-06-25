package com.revenuecat.purchases.ui.revenuecatui.data;

import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components$SelectedPackageInfo;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PaywallState$Loaded$Components$selectedPackageInfo$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallState$Loaded$Components$selectedPackageInfo$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    @Override // ie.InterfaceC5082a
    public final PaywallState.Loaded.Components.SelectedPackageInfo invoke() {
        PaywallState.Loaded.Components.AvailablePackages.Info infoFindPackageInfoByUniqueId;
        String selectedPackageUniqueId = this.this$0.getSelectedPackageUniqueId();
        if (selectedPackageUniqueId == null || (infoFindPackageInfoByUniqueId = this.this$0.findPackageInfoByUniqueId(selectedPackageUniqueId)) == null) {
            return null;
        }
        return new PaywallState.Loaded.Components.SelectedPackageInfo(infoFindPackageInfoByUniqueId.getPkg(), infoFindPackageInfoByUniqueId.getResolvedOffer(), selectedPackageUniqueId, PackageExtensionsKt.calculateOfferEligibility(infoFindPackageInfoByUniqueId.getResolvedOffer(), infoFindPackageInfoByUniqueId.getPkg()));
    }
}
