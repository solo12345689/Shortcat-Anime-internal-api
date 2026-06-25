package com.revenuecat.purchases.ui.revenuecatui.components.button;

import c1.d;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class ButtonComponentState$action$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ButtonComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonComponentState$action$2(ButtonComponentState buttonComponentState) {
        super(0);
        this.this$0 = buttonComponentState;
    }

    @Override // ie.InterfaceC5082a
    public final PaywallAction invoke() {
        String localeId = LocalizationKt.toLocaleId((d) this.this$0.localeProvider.invoke());
        ButtonComponentState buttonComponentState = this.this$0;
        return buttonComponentState.m398toPaywallAction64pKzr8(buttonComponentState.style.getAction(), localeId);
    }
}
