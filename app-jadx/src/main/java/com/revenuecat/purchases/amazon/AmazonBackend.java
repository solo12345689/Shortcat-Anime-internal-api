package com.revenuecat.purchases.amazon;

import Td.L;
import Td.z;
import Ud.AbstractC2279u;
import com.revenuecat.purchases.common.BackendHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R²\u0001\u0010\u0019\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t0\u0016j\u0002`\u00170\u00150\u00122J\u0010\u0018\u001aF\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t0\u0016j\u0002`\u00170\u00150\u00128F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonBackend;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", com.amazon.a.a.o.b.f34612E, "storeUserID", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "LTd/L;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getAmazonReceiptData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "", "", "Lcom/revenuecat/purchases/amazon/CallbackCacheKey;", "", "Lkotlin/Pair;", "Lcom/revenuecat/purchases/amazon/PostAmazonReceiptCallback;", "<set-?>", "postAmazonReceiptCallbacks", "Ljava/util/Map;", "getPostAmazonReceiptCallbacks", "()Ljava/util/Map;", "setPostAmazonReceiptCallbacks", "(Ljava/util/Map;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AmazonBackend {
    private final BackendHelper backendHelper;
    private volatile Map<List<String>, List<Pair<Function1, Function1>>> postAmazonReceiptCallbacks;

    public AmazonBackend(BackendHelper backendHelper) {
        AbstractC5504s.h(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
        this.postAmazonReceiptCallbacks = new LinkedHashMap();
    }

    public final void getAmazonReceiptData(String receiptId, String storeUserID, Function1 onSuccess, Function1 onError) {
        AbstractC5504s.h(receiptId, "receiptId");
        AbstractC5504s.h(storeUserID, "storeUserID");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        List<String> listR = AbstractC2279u.r(receiptId, storeUserID);
        AmazonBackend$getAmazonReceiptData$call$1 amazonBackend$getAmazonReceiptData$call$1 = new AmazonBackend$getAmazonReceiptData$call$1(this, storeUserID, receiptId, listR);
        Pair<Function1, Function1> pairA = z.a(onSuccess, onError);
        synchronized (this) {
            try {
                if (this.postAmazonReceiptCallbacks.containsKey(listR)) {
                    List<Pair<Function1, Function1>> list = this.postAmazonReceiptCallbacks.get(listR);
                    AbstractC5504s.e(list);
                    list.add(pairA);
                } else {
                    this.postAmazonReceiptCallbacks.put(listR, AbstractC2279u.s(pairA));
                    amazonBackend$getAmazonReceiptData$call$1.invoke();
                    L l10 = L.f17438a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized Map<List<String>, List<Pair<Function1, Function1>>> getPostAmazonReceiptCallbacks() {
        return this.postAmazonReceiptCallbacks;
    }

    public final synchronized void setPostAmazonReceiptCallbacks(Map<List<String>, List<Pair<Function1, Function1>>> map) {
        AbstractC5504s.h(map, "<set-?>");
        this.postAmazonReceiptCallbacks = map;
    }
}
