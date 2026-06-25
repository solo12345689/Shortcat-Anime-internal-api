package com.revenuecat.purchases.models;

import Td.r;
import com.android.billingclient.api.C3163h;
import com.revenuecat.purchases.ProductType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class GooglePurchasingData implements PurchasingData {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "Lcom/android/billingclient/api/h;", "productDetails", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/h;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "Lcom/android/billingclient/api/h;", "getProductDetails", "()Lcom/android/billingclient/api/h;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InAppProduct extends GooglePurchasingData {
        private final C3163h productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String productId, C3163h productDetails) {
            super(null);
            AbstractC5504s.h(productId, "productId");
            AbstractC5504s.h(productDetails, "productDetails");
            this.productId = productId;
            this.productDetails = productDetails;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return AbstractC5504s.c(this.productId, inAppProduct.productId) && AbstractC5504s.c(this.productDetails, inAppProduct.productDetails);
        }

        public final C3163h getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u001c\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "optionId", "Lcom/android/billingclient/api/h;", "productDetails", "token", "Lcom/revenuecat/purchases/models/Period;", "billingPeriod", "", "addOnProducts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/h;Ljava/lang/String;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getOptionId", "Lcom/android/billingclient/api/h;", "getProductDetails", "()Lcom/android/billingclient/api/h;", "getToken", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod$annotations", "()V", "Ljava/util/List;", "getAddOnProducts", "()Ljava/util/List;", "getAddOnProducts$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Subscription extends GooglePurchasingData {
        private final List<GooglePurchasingData> addOnProducts;
        private final Period billingPeriod;
        private final String optionId;
        private final C3163h productDetails;
        private final String productId;
        private final String token;

        public /* synthetic */ Subscription(String str, String str2, C3163h c3163h, String str3, Period period, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, c3163h, str3, (i10 & 16) != 0 ? null : period, (i10 & 32) != 0 ? null : list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return AbstractC5504s.c(this.productId, subscription.productId) && AbstractC5504s.c(this.optionId, subscription.optionId) && AbstractC5504s.c(this.productDetails, subscription.productDetails) && AbstractC5504s.c(this.token, subscription.token) && AbstractC5504s.c(this.billingPeriod, subscription.billingPeriod) && AbstractC5504s.c(this.addOnProducts, subscription.addOnProducts);
        }

        public final /* synthetic */ List getAddOnProducts() {
            return this.addOnProducts;
        }

        public final /* synthetic */ Period getBillingPeriod() {
            return this.billingPeriod;
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final C3163h getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            int iHashCode = ((((((this.productId.hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode()) * 31;
            Period period = this.billingPeriod;
            int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
            List<GooglePurchasingData> list = this.addOnProducts;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Subscription(productId=" + this.productId + ", optionId=" + this.optionId + ", productDetails=" + this.productDetails + ", token=" + this.token + ", billingPeriod=" + this.billingPeriod + ", addOnProducts=" + this.addOnProducts + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Subscription(String productId, String optionId, C3163h productDetails, String token, Period period, List<? extends GooglePurchasingData> list) {
            super(null);
            AbstractC5504s.h(productId, "productId");
            AbstractC5504s.h(optionId, "optionId");
            AbstractC5504s.h(productDetails, "productDetails");
            AbstractC5504s.h(token, "token");
            this.productId = productId;
            this.optionId = optionId;
            this.productDetails = productDetails;
            this.token = token;
            this.billingPeriod = period;
            this.addOnProducts = list;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Subscription(String productId, String optionId, C3163h productDetails, String token) {
            this(productId, optionId, productDetails, token, null, null);
            AbstractC5504s.h(productId, "productId");
            AbstractC5504s.h(optionId, "optionId");
            AbstractC5504s.h(productDetails, "productDetails");
            AbstractC5504s.h(token, "token");
        }

        public static /* synthetic */ void getAddOnProducts$annotations() {
        }

        public static /* synthetic */ void getBillingPeriod$annotations() {
        }
    }

    public /* synthetic */ GooglePurchasingData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new r();
    }

    private GooglePurchasingData() {
    }
}
