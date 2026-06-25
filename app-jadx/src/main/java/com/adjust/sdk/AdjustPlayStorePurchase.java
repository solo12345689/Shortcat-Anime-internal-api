package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class AdjustPlayStorePurchase {
    private final String productId;
    private final String purchaseToken;

    public AdjustPlayStorePurchase(String str, String str2) {
        this.productId = str;
        this.purchaseToken = str2;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPurchaseToken() {
        return this.purchaseToken;
    }
}
