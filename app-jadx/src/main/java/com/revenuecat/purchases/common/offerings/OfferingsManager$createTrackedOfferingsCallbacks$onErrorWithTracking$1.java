package com.revenuecat.purchases.common.offerings;

import Td.L;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "cacheStatus", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1 extends AbstractC5506u implements Function2 {
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(OfferingsManager offeringsManager, Date date, Function1 function1) {
        super(2);
        this.this$0 = offeringsManager;
        this.$startTime = date;
        this.$onError = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, (DiagnosticsTracker.CacheStatus) obj2);
        return L.f17438a;
    }

    public final void invoke(PurchasesError error, DiagnosticsTracker.CacheStatus cacheStatus) {
        AbstractC5504s.h(error, "error");
        AbstractC5504s.h(cacheStatus, "cacheStatus");
        this.this$0.trackGetOfferingsResultIfNeeded(this.$startTime, cacheStatus, error, null, null);
        Function1 function1 = this.$onError;
        if (function1 != null) {
            function1.invoke(error);
        }
    }
}
