package com.revenuecat.purchases;

import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0083\u0001\u0010\u001a\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\"\b\u0002\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u00152\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactions", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "sdkOriginated", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "LTd/L;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "transactionPostError", "postTransactions", "(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billing, PostReceiptHelper postReceiptHelper) {
        AbstractC5504s.h(billing, "billing");
        AbstractC5504s.h(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static /* synthetic */ void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z11, Function2 function2, Function2 function22, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            function2 = null;
        }
        if ((i10 & 64) != 0) {
            function22 = null;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z10, str, postReceiptInitiationSource, z11, function2, function22);
    }

    public final void postTransactions(List<StoreTransaction> transactions, boolean allowSharingPlayStoreAccount, String appUserID, PostReceiptInitiationSource initiationSource, boolean sdkOriginated, Function2 transactionPostSuccess, Function2 transactionPostError) {
        AbstractC5504s.h(transactions, "transactions");
        String appUserID2 = appUserID;
        AbstractC5504s.h(appUserID2, "appUserID");
        PostReceiptInitiationSource initiationSource2 = initiationSource;
        AbstractC5504s.h(initiationSource2, "initiationSource");
        for (StoreTransaction storeTransaction : transactions) {
            BillingAbstract billingAbstract = this.billing;
            ProductType type = storeTransaction.getType();
            Set<String> setF1 = AbstractC2279u.f1(storeTransaction.getProductIds());
            PostTransactionWithProductDetailsHelper$postTransactions$1$1 postTransactionWithProductDetailsHelper$postTransactions$1$1 = new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, allowSharingPlayStoreAccount, appUserID2, initiationSource2, sdkOriginated, transactionPostSuccess, transactionPostError);
            appUserID2 = appUserID;
            initiationSource2 = initiationSource;
            billingAbstract.queryProductDetailsAsync(type, setF1, postTransactionWithProductDetailsHelper$postTransactions$1$1, new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, allowSharingPlayStoreAccount, appUserID2, initiationSource2, sdkOriginated, transactionPostSuccess, transactionPostError));
        }
    }
}
