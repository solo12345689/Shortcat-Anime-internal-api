package com.revenuecat.purchases;

import Td.L;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.utils.Result;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "it", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ Function1 $onSuccess;
    final /* synthetic */ ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> $results;
    final /* synthetic */ List<LocalTransactionMetadata> $transactionMetadataToSync;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> concurrentLinkedQueue, PostReceiptHelper postReceiptHelper, List<LocalTransactionMetadata> list, Function1 function1, Function1 function12) {
        super(1);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = function1;
        this.$onSuccess = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PostReceiptResponse) obj);
        return L.f17438a;
    }

    public final void invoke(PostReceiptResponse it) {
        AbstractC5504s.h(it, "it");
        this.$results.add(new Result.Success(it.getCustomerInfo()));
        this.this$0.callTransactionMetadataCompletionFromResults(this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
