package com.revenuecat.purchases.models;

import Df.r;
import Td.InterfaceC2154e;
import Ud.AbstractC2279u;
import com.android.billingclient.api.C3163h;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.models.GooglePurchasingData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014B\u001b\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0000\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\u001a\u00102\u001a\u00020.8VX\u0096\u0004¢\u0006\f\u0012\u0004\b1\u0010,\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0019¨\u00068"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "productId", "basePlanId", "offerId", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "tags", "Lcom/android/billingclient/api/h;", "productDetails", "offerToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "installmentsInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/h;Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;)V", "presentedOfferingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/h;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Ljava/lang/String;", "getProductId", "()Ljava/lang/String;", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "()Ljava/util/List;", "getTags", "Lcom/android/billingclient/api/h;", "getProductDetails", "()Lcom/android/billingclient/api/h;", "getOfferToken", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "getPresentedOfferingContext", "()Lcom/revenuecat/purchases/PresentedOfferingContext;", "Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getInstallmentsInfo", "()Lcom/revenuecat/purchases/models/GoogleInstallmentsInfo;", "getPresentedOfferingIdentifier", "getPresentedOfferingIdentifier$annotations", "()V", "presentedOfferingIdentifier", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData$annotations", "purchasingData", "getPrimaryPricingPhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "primaryPricingPhase", "getId", DiagnosticsEntry.ID_KEY, "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final C3163h productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C3163h productDetails, String offerToken) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, null, null, 384, null);
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(basePlanId, "basePlanId");
        AbstractC5504s.h(pricingPhases, "pricingPhases");
        AbstractC5504s.h(tags, "tags");
        AbstractC5504s.h(productDetails, "productDetails");
        AbstractC5504s.h(offerToken, "offerToken");
    }

    private final PricingPhase getPrimaryPricingPhase() {
        Object next;
        Iterator<T> it = getPricingPhases().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PricingPhase) next).getRecurrenceMode() == RecurrenceMode.INFINITE_RECURRING) {
                break;
            }
        }
        PricingPhase pricingPhase = (PricingPhase) next;
        return pricingPhase == null ? (PricingPhase) AbstractC2279u.A0(getPricingPhases()) : pricingPhase;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return AbstractC5504s.c(this.productId, googleSubscriptionOption.productId) && AbstractC5504s.c(this.basePlanId, googleSubscriptionOption.basePlanId) && AbstractC5504s.c(this.offerId, googleSubscriptionOption.offerId) && AbstractC5504s.c(this.pricingPhases, googleSubscriptionOption.pricingPhases) && AbstractC5504s.c(this.tags, googleSubscriptionOption.tags) && AbstractC5504s.c(this.productDetails, googleSubscriptionOption.productDetails) && AbstractC5504s.c(this.offerToken, googleSubscriptionOption.offerToken) && AbstractC5504s.c(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && AbstractC5504s.c(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    /* JADX INFO: renamed from: getId */
    public String get$id() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || r.l0(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final C3163h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        String str = this.productId;
        String str2 = get$id();
        C3163h c3163h = this.productDetails;
        String str3 = this.offerToken;
        PricingPhase primaryPricingPhase = getPrimaryPricingPhase();
        return new GooglePurchasingData.Subscription(str, str2, c3163h, str3, primaryPricingPhase != null ? primaryPricingPhase.getBillingPeriod() : null, AbstractC2279u.m());
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pricingPhases.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode3 = (iHashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return iHashCode3 + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C3163h productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, presentedOfferingContext, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null);
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(basePlanId, "basePlanId");
        AbstractC5504s.h(pricingPhases, "pricingPhases");
        AbstractC5504s.h(tags, "tags");
        AbstractC5504s.h(productDetails, "productDetails");
        AbstractC5504s.h(offerToken, "offerToken");
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C3163h productDetails, String offerToken, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(basePlanId, "basePlanId");
        AbstractC5504s.h(pricingPhases, "pricingPhases");
        AbstractC5504s.h(tags, "tags");
        AbstractC5504s.h(productDetails, "productDetails");
        AbstractC5504s.h(offerToken, "offerToken");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.offerId = str;
        this.pricingPhases = pricingPhases;
        this.tags = tags;
        this.productDetails = productDetails;
        this.offerToken = offerToken;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, C3163h c3163h, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, list, list2, c3163h, str4, (i10 & 128) != 0 ? null : presentedOfferingContext, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : googleInstallmentsInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC2154e
    public GoogleSubscriptionOption(String productId, String basePlanId, String str, List<PricingPhase> pricingPhases, List<String> tags, C3163h productDetails, String offerToken, String presentedOfferingId) {
        this(productId, basePlanId, str, pricingPhases, tags, productDetails, offerToken, new PresentedOfferingContext(presentedOfferingId), null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null);
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(basePlanId, "basePlanId");
        AbstractC5504s.h(pricingPhases, "pricingPhases");
        AbstractC5504s.h(tags, "tags");
        AbstractC5504s.h(productDetails, "productDetails");
        AbstractC5504s.h(offerToken, "offerToken");
        AbstractC5504s.h(presentedOfferingId, "presentedOfferingId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption subscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(subscriptionOption.productId, subscriptionOption.basePlanId, subscriptionOption.offerId, subscriptionOption.getPricingPhases(), subscriptionOption.getTags(), subscriptionOption.productDetails, subscriptionOption.offerToken, presentedOfferingContext, subscriptionOption.getInstallmentsInfo());
        AbstractC5504s.h(subscriptionOption, "subscriptionOption");
    }

    @InterfaceC2154e
    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public static /* synthetic */ void getPurchasingData$annotations() {
    }
}
