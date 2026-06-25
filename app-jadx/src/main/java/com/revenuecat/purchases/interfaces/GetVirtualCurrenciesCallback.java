package com.revenuecat.purchases.interfaces;

import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;", "", "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;", "virtualCurrencies", "LTd/L;", "onReceived", "(Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GetVirtualCurrenciesCallback {
    void onError(PurchasesError error);

    void onReceived(VirtualCurrencies virtualCurrencies);
}
