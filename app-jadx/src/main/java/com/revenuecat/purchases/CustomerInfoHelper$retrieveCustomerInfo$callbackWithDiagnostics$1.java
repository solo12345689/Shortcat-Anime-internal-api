package com.revenuecat.purchases;

import Td.L;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.utils.Result;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoDataResult;", "customerInfoDataResult", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfoDataResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ CacheFetchPolicy $fetchPolicy;
    final /* synthetic */ Date $startTime;
    final /* synthetic */ boolean $trackDiagnostics;
    final /* synthetic */ CustomerInfoHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(CustomerInfoHelper customerInfoHelper, boolean z10, Date date, CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.this$0 = customerInfoHelper;
        this.$trackDiagnostics = z10;
        this.$startTime = date;
        this.$fetchPolicy = cacheFetchPolicy;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfoDataResult) obj);
        return L.f17438a;
    }

    public final void invoke(CustomerInfoDataResult customerInfoDataResult) {
        AbstractC5504s.h(customerInfoDataResult, "customerInfoDataResult");
        this.this$0.trackGetCustomerInfoResultIfNeeded(this.$trackDiagnostics, this.$startTime, customerInfoDataResult, this.$fetchPolicy);
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        if (receiveCustomerInfoCallback != null) {
            Result<CustomerInfo, PurchasesError> result = customerInfoDataResult.getResult();
            if (result instanceof Result.Success) {
                receiveCustomerInfoCallback.onReceived((CustomerInfo) ((Result.Success) customerInfoDataResult.getResult()).getValue());
            } else if (result instanceof Result.Error) {
                receiveCustomerInfoCallback.onError((PurchasesError) ((Result.Error) customerInfoDataResult.getResult()).getValue());
            }
        }
    }
}
