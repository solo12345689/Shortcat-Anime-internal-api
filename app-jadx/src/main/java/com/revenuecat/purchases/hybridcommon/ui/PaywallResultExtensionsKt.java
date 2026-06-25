package com.revenuecat.purchases.hybridcommon.ui;

import Td.r;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"name", "", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "getName", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)Ljava/lang/String;", "hybridcommon-ui_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallResultExtensionsKt {
    public static final String getName(PaywallResult paywallResult) {
        AbstractC5504s.h(paywallResult, "<this>");
        if (AbstractC5504s.c(paywallResult, PaywallResult.Cancelled.INSTANCE)) {
            return "CANCELLED";
        }
        if (paywallResult instanceof PaywallResult.Error) {
            return HybridPurchaseLogicBridge.RESULT_ERROR;
        }
        if (paywallResult instanceof PaywallResult.Purchased) {
            return "PURCHASED";
        }
        if (paywallResult instanceof PaywallResult.Restored) {
            return "RESTORED";
        }
        throw new r();
    }
}
