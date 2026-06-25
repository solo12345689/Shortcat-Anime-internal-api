package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PresentedTabsPartial;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "Lcom/revenuecat/purchases/ui/revenuecatui/errors/PaywallValidationError;", "partial", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class StyleFactory$createTabsComponentStyle$1$5 extends AbstractC5506u implements Function1 {
    final /* synthetic */ StyleFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StyleFactory$createTabsComponentStyle$1$5(StyleFactory styleFactory) {
        super(1);
        this.this$0 = styleFactory;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Result<PresentedTabsPartial, NonEmptyList<PaywallValidationError>> invoke(PartialTabsComponent partial) {
        AbstractC5504s.h(partial, "partial");
        return PresentedTabsPartial.INSTANCE.invoke(partial, this.this$0.colorAliases);
    }
}
