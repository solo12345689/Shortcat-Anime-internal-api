package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Cf.i;
import Cf.l;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "distribution", "LCf/i;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "invoke", "(Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)LCf/i;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class DistributionProvider$values$1 extends AbstractC5506u implements Function1 {
    public static final DistributionProvider$values$1 INSTANCE = new DistributionProvider$values$1();

    DistributionProvider$values$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final i invoke(FlexDistribution distribution) {
        AbstractC5504s.h(distribution, "distribution");
        return l.s(new Dimension.Horizontal(VerticalAlignment.CENTER, distribution), new Dimension.Vertical(HorizontalAlignment.CENTER, distribution));
    }
}
