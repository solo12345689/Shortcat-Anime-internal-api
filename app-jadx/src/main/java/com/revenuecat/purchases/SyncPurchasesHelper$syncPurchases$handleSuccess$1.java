package com.revenuecat.purchases;

import Td.L;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SyncPurchasesHelper$syncPurchases$handleSuccess$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $onSuccess;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ SyncPurchasesHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SyncPurchasesHelper$syncPurchases$handleSuccess$1(SyncPurchasesHelper syncPurchasesHelper, Date date, Function1 function1) {
        super(1);
        this.this$0 = syncPurchasesHelper;
        this.$startTime = date;
        this.$onSuccess = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return L.f17438a;
    }

    public final void invoke(CustomerInfo it) {
        AbstractC5504s.h(it, "it");
        this.this$0.trackSyncPurchasesResultIfNeeded(null, this.$startTime);
        this.$onSuccess.invoke(it);
    }
}
