package com.revenuecat.purchases.ui.revenuecatui.activity;

import Td.L;
import com.revenuecat.purchases.Offering;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5502p;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1 extends AbstractC5502p implements Function2 {
    PaywallActivity$onCreate$1$1$1$1$paywallOptions$2$1(Object obj) {
        super(2, obj, PaywallActivity.class, "onDismissRequest", "onDismissRequest(Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Offering) obj, (PaywallResult) obj2);
        return L.f17438a;
    }

    public final void invoke(Offering offering, PaywallResult paywallResult) {
        ((PaywallActivity) this.receiver).onDismissRequest(offering, paywallResult);
    }
}
