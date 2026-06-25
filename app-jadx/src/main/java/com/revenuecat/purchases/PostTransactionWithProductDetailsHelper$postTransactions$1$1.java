package com.revenuecat.purchases;

import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "LTd/L;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ boolean $sdkOriginated;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ Function2 $transactionPostError;
    final /* synthetic */ Function2 $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z11, Function2 function2, Function2 function22) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$sdkOriginated = z11;
        this.$transactionPostSuccess = function2;
        this.$transactionPostError = function22;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return L.f17438a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        Object next;
        StoreProduct storeProduct;
        Collection collectionM;
        Object next2;
        AbstractC5504s.h(storeProducts, "storeProducts");
        Map<String, ? extends SubscriptionOption> mapB = null;
        if (this.$transaction.getType() == ProductType.SUBS && this.$transaction.getMarketplace() == null) {
            StoreTransaction storeTransaction = this.$transaction;
            Iterator<T> it = storeProducts.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                SubscriptionOptions subscriptionOptions = ((StoreProduct) next2).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                    while (it2.hasNext()) {
                        if (AbstractC5504s.c(it2.next().get$id(), storeTransaction.getSubscriptionOptionId())) {
                            break loop0;
                        }
                    }
                }
            }
            storeProduct = (StoreProduct) next2;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            Iterator<T> it3 = storeProducts.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next = it3.next();
                    if (AbstractC5504s.c(((StoreProduct) next).getId(), AbstractC2279u.o0(storeTransaction2.getProductIds()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            storeProduct = (StoreProduct) next;
        }
        StoreProduct storeProduct2 = storeProduct;
        Map subscriptionOptionIdForProductIDs = this.$transaction.getSubscriptionOptionIdForProductIDs();
        if (subscriptionOptionIdForProductIDs != null) {
            ArrayList<GoogleStoreProduct> arrayList = new ArrayList();
            for (Object obj : storeProducts) {
                if (obj instanceof GoogleStoreProduct) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (GoogleStoreProduct googleStoreProduct : arrayList) {
                SubscriptionOptions subscriptionOptions2 = googleStoreProduct.getSubscriptionOptions();
                if (subscriptionOptions2 != null) {
                    collectionM = new ArrayList(AbstractC2279u.x(subscriptionOptions2, 10));
                    for (SubscriptionOption subscriptionOption : subscriptionOptions2) {
                        collectionM.add(z.a(googleStoreProduct.getProductId() + '_' + subscriptionOption.get$id(), subscriptionOption));
                    }
                } else {
                    collectionM = AbstractC2279u.m();
                }
                AbstractC2279u.D(arrayList2, collectionM);
            }
            Map mapW = S.w(arrayList2);
            Map mapC = S.c();
            for (Map.Entry entry : subscriptionOptionIdForProductIDs.entrySet()) {
                String str = (String) entry.getKey();
                SubscriptionOption subscriptionOption2 = (SubscriptionOption) mapW.get(str + '_' + ((String) entry.getValue()));
                if (subscriptionOption2 != null) {
                    mapC.put(str, subscriptionOption2);
                }
            }
            mapB = S.b(mapC);
        }
        Map<String, ? extends SubscriptionOption> map = mapB;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Store product found for transaction: " + storeProduct2);
        }
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct2, map, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$sdkOriginated, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
