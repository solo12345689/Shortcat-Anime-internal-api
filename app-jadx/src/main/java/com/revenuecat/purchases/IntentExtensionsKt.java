package com.revenuecat.purchases;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"asWebPurchaseRedemption", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "Landroid/content/Intent;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntentExtensionsKt {
    public static final /* synthetic */ WebPurchaseRedemption asWebPurchaseRedemption(Intent intent) {
        AbstractC5504s.h(intent, "<this>");
        return Purchases.INSTANCE.parseAsWebPurchaseRedemption(intent);
    }
}
