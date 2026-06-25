package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "Lcom/revenuecat/purchases/customercenter/RCColor;", "it", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Appearance$ColorInformation;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$textColor$1 extends AbstractC5506u implements Function1 {
    public static final VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$textColor$1 INSTANCE = new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$textColor$1();

    VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$textColor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final PaywallColor invoke(CustomerCenterConfigData.Appearance.ColorInformation it) {
        AbstractC5504s.h(it, "it");
        return it.getTextColor();
    }
}
