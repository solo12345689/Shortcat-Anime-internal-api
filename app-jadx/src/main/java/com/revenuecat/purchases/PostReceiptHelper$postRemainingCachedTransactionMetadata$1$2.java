package com.revenuecat.purchases;

import Td.L;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.utils.Result;
import ie.InterfaceC5096o;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "<anonymous parameter 1>", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2 extends AbstractC5506u implements InterfaceC5096o {
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ Function1 $onSuccess;
    final /* synthetic */ ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> $results;
    final /* synthetic */ List<LocalTransactionMetadata> $transactionMetadataToSync;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> concurrentLinkedQueue, PostReceiptHelper postReceiptHelper, List<LocalTransactionMetadata> list, Function1 function1, Function1 function12) {
        super(3);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = function1;
        this.$onSuccess = function12;
    }

    @Override // ie.InterfaceC5096o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
        return L.f17438a;
    }

    public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
        AbstractC5504s.h(backendError, "backendError");
        AbstractC5504s.h(postReceiptErrorHandlingBehavior, "<anonymous parameter 1>");
        this.$results.add(new Result.Error(backendError));
        this.this$0.callTransactionMetadataCompletionFromResults(this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
