package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/CustomVariableValue;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class TabsComponentStateKt$rememberUpdatedTabsComponentState$2$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ PaywallState.Loaded.Components $paywallState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsComponentStateKt$rememberUpdatedTabsComponentState$2$1(PaywallState.Loaded.Components components) {
        super(0);
        this.$paywallState = components;
    }

    @Override // ie.InterfaceC5082a
    public final Map<String, CustomVariableValue> invoke() {
        return this.$paywallState.getMergedCustomVariables();
    }
}
