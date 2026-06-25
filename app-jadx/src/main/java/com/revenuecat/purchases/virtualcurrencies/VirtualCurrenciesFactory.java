package com.revenuecat.purchases.virtualcurrencies;

import Wf.AbstractC2358b;
import com.revenuecat.purchases.common.JsonProvider;
import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrenciesFactory;", "", "()V", "buildVirtualCurrencies", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "httpResult", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "jsonString", "", "body", "Lorg/json/JSONObject;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VirtualCurrenciesFactory {
    public static final VirtualCurrenciesFactory INSTANCE = new VirtualCurrenciesFactory();

    private VirtualCurrenciesFactory() {
    }

    public final VirtualCurrencies buildVirtualCurrencies(HTTPResult httpResult) {
        AbstractC5504s.h(httpResult, "httpResult");
        return buildVirtualCurrencies(httpResult.getBody());
    }

    public final VirtualCurrencies buildVirtualCurrencies(JSONObject body) {
        AbstractC5504s.h(body, "body");
        AbstractC2358b defaultJson = JsonProvider.INSTANCE.getDefaultJson();
        String string = body.toString();
        AbstractC5504s.g(string, "body.toString()");
        defaultJson.a();
        return (VirtualCurrencies) defaultJson.d(VirtualCurrencies.INSTANCE.serializer(), string);
    }

    public final VirtualCurrencies buildVirtualCurrencies(String jsonString) {
        AbstractC5504s.h(jsonString, "jsonString");
        AbstractC2358b defaultJson = JsonProvider.INSTANCE.getDefaultJson();
        defaultJson.a();
        return (VirtualCurrencies) defaultJson.d(VirtualCurrencies.INSTANCE.serializer(), jsonString);
    }
}
