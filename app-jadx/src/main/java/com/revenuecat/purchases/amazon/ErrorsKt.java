package com.revenuecat.purchases.amazon;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"errorGettingReceiptInfo", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "missingTermSkuError", "response", "Lorg/json/JSONObject;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ErrorsKt {
    public static final PurchasesError errorGettingReceiptInfo(PurchasesError error) {
        AbstractC5504s.h(error, "error");
        return new PurchasesError(PurchasesErrorCode.InvalidReceiptError, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + error);
    }

    public static final PurchasesError missingTermSkuError(JSONObject response) {
        AbstractC5504s.h(response, "response");
        return new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, "Amazon receipt data response is missing termSku. Response:\n" + response);
    }
}
