package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Cf.i;
import Cf.l;
import Ud.AbstractC2273n;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import h1.InterfaceC4895a;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/DistributionProvider;", "Lh1/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "<init>", "()V", "LCf/i;", "values", "LCf/i;", "getValues", "()LCf/i;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DistributionProvider implements InterfaceC4895a {
    private final i values = l.E(AbstractC2273n.M(FlexDistribution.values()), DistributionProvider$values$1.INSTANCE);

    @Override // h1.InterfaceC4895a
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // h1.InterfaceC4895a
    public i getValues() {
        return this.values;
    }
}
