package com.revenuecat.purchases.hybridcommon.ui;

import Td.InterfaceC2154e;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/hybridcommon/ui/PaywallResultListener;", "", "Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;", "paywallResult", "LTd/L;", "onPaywallResult", "(Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallResult;)V", "", "(Ljava/lang/String;)V", "hybridcommon-ui_bc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaywallResultListener {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @InterfaceC2154e
        public static void onPaywallResult(PaywallResultListener paywallResultListener, PaywallResult paywallResult) {
            AbstractC5504s.h(paywallResult, "paywallResult");
        }
    }

    @InterfaceC2154e
    void onPaywallResult(PaywallResult paywallResult);

    void onPaywallResult(String paywallResult);
}
