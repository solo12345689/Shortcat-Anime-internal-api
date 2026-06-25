package com.revenuecat.purchases.common;

import Ud.AbstractC2279u;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        AbstractC5504s.h(purchase, "<this>");
        Object obj = purchase.c().get(0);
        AbstractC5504s.g(obj, "products[0]");
        return (String) obj;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        AbstractC5504s.h(purchase, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("productIds: ");
        List listC = purchase.c();
        AbstractC5504s.g(listC, "this.products");
        sb2.append(AbstractC2279u.w0(listC, null, "[", "]", 0, null, null, 57, null));
        sb2.append(", orderId: ");
        sb2.append(purchase.a());
        sb2.append(", purchaseToken: ");
        sb2.append(purchase.f());
        return sb2.toString();
    }
}
