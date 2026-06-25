package com.revenuecat.purchases.common;

import Wf.AbstractC2358b;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.CustomerInfoOriginalSource;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import com.revenuecat.purchases.utils.SerializationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nJ4\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0018j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n`\u0019*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0002J\u001a\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012*\u00020\bH\u0002J\u001a\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0012*\u00020\bH\u0002¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/CustomerInfoFactory;", "", "()V", "buildCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "body", "Lorg/json/JSONObject;", "overrideRequestDate", "Ljava/util/Date;", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "originalSource", "Lcom/revenuecat/purchases/CustomerInfoOriginalSource;", "loadedFromCache", "", "parseSubscriptionInfos", "", "", "Lcom/revenuecat/purchases/SubscriptionInfo;", "subscriberJSONObject", "requestDate", "parseDates", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "jsonKey", "parseExpirations", "parsePurchaseDates", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoFactory {
    public static final CustomerInfoFactory INSTANCE = new CustomerInfoFactory();

    private CustomerInfoFactory() {
    }

    public static /* synthetic */ CustomerInfo buildCustomerInfo$default(CustomerInfoFactory customerInfoFactory, JSONObject jSONObject, Date date, VerificationResult verificationResult, CustomerInfoOriginalSource customerInfoOriginalSource, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            customerInfoOriginalSource = CustomerInfoOriginalSource.MAIN;
        }
        CustomerInfoOriginalSource customerInfoOriginalSource2 = customerInfoOriginalSource;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return customerInfoFactory.buildCustomerInfo(jSONObject, date, verificationResult, customerInfoOriginalSource2, z10);
    }

    private final HashMap<String, Date> parseDates(JSONObject jSONObject, String str) throws JSONException {
        HashMap<String, Date> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            String it = jSONObject.getJSONObject(key).optString("product_plan_identifier");
            AbstractC5504s.g(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            JSONObject expirationObject = jSONObject.getJSONObject(key);
            if (it != null) {
                String str2 = key + ':' + it;
                if (str2 != null) {
                    key = str2;
                }
            }
            AbstractC5504s.g(key, "key");
            AbstractC5504s.g(expirationObject, "expirationObject");
            map.put(key, JSONObjectExtensionsKt.optDate(expirationObject, str));
        }
        return map;
    }

    private final Map<String, Date> parseExpirations(JSONObject jSONObject) {
        return parseDates(jSONObject, "expires_date");
    }

    private final Map<String, Date> parsePurchaseDates(JSONObject jSONObject) {
        return parseDates(jSONObject, "purchase_date");
    }

    public final CustomerInfo buildCustomerInfo(HTTPResult httpResult) {
        AbstractC5504s.h(httpResult, "httpResult");
        return buildCustomerInfo(httpResult.getBody(), httpResult.getRequestDate(), httpResult.getVerificationResult(), httpResult.isLoadShedderResponse() ? CustomerInfoOriginalSource.LOAD_SHEDDER : CustomerInfoOriginalSource.MAIN, false);
    }

    public final Map<String, SubscriptionInfo> parseSubscriptionInfos(JSONObject subscriberJSONObject, Date requestDate) throws JSONException {
        AbstractC5504s.h(subscriberJSONObject, "subscriberJSONObject");
        AbstractC5504s.h(requestDate, "requestDate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = subscriberJSONObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC5504s.g(itKeys, "subscriptions.keys()");
            while (itKeys.hasNext()) {
                String productId = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(productId);
                AbstractC2358b defaultJson = JsonProvider.INSTANCE.getDefaultJson();
                String string = jSONObject2.toString();
                AbstractC5504s.g(string, "subscriptionJSONObject.toString()");
                defaultJson.a();
                SubscriptionInfoResponse subscriptionInfoResponse = (SubscriptionInfoResponse) defaultJson.d(SubscriptionInfoResponse.INSTANCE.serializer(), string);
                AbstractC5504s.g(productId, "productId");
                Date date = requestDate;
                linkedHashMap.put(productId, new SubscriptionInfo(productId, date, subscriptionInfoResponse, null, 8, null));
                requestDate = date;
            }
        } catch (SerializationException e10) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing subscription information", e10);
        } catch (IllegalArgumentException e11) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing subscription information. The input is not a SubscriptionInfo", e11);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.CustomerInfo buildCustomerInfo(org.json.JSONObject r15, java.util.Date r16, com.revenuecat.purchases.VerificationResult r17, com.revenuecat.purchases.CustomerInfoOriginalSource r18, boolean r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.CustomerInfoFactory.buildCustomerInfo(org.json.JSONObject, java.util.Date, com.revenuecat.purchases.VerificationResult, com.revenuecat.purchases.CustomerInfoOriginalSource, boolean):com.revenuecat.purchases.CustomerInfo");
    }
}
