package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.components.ComponentViewState;
import com.revenuecat.purchases.ui.revenuecatui.components.ConditionContext;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ScreenCondition;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TabsComponentState$presentedPartial$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsComponentState$presentedPartial$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final PresentedTabsPartial invoke() {
        Package rcPackage;
        ScreenCondition screenConditionFrom = ScreenCondition.INSTANCE.from(this.this$0.getWindowSize());
        ComponentViewState componentViewState = ComponentViewState.DEFAULT;
        List overrides = this.this$0.style.getOverrides();
        OfferEligibility offerEligibility = this.this$0.getOfferEligibility();
        PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = (PaywallState.Loaded.Components.SelectedPackageInfo) this.this$0.selectedPackageInfoProvider.invoke();
        return (PresentedTabsPartial) PresentedPartialKt.buildPresentedPartial(overrides, screenConditionFrom, offerEligibility, componentViewState, new ConditionContext((selectedPackageInfo == null || (rcPackage = selectedPackageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier(), (Map) this.this$0.customVariablesProvider.invoke()));
    }
}
