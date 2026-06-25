package com.revenuecat.purchases.ui.revenuecatui.data;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallState$Loaded$Components$mostExpensivePricePerMonthMicros$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    @Override // ie.InterfaceC5082a
    public final Long invoke() {
        PaywallState.Loaded.Components components = this.this$0;
        List<PaywallState.Loaded.Components.AvailablePackages.Info> packagesOutsideTabs = components.packages.getPackagesOutsideTabs();
        List<PaywallState.Loaded.Components.AvailablePackages.Info> listM = this.this$0.packages.getPackagesByTab().get(Integer.valueOf(this.this$0.getSelectedTabIndex()));
        if (listM == null) {
            listM = AbstractC2279u.m();
        }
        return components.mostExpensivePricePerMonthMicros(AbstractC2279u.I0(packagesOutsideTabs, listM));
    }
}
