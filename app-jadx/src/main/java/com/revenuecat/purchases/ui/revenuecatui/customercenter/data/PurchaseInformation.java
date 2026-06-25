package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Df.r;
import android.net.Uri;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails;
import com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.DefaultDateFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001BA\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eBe\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0019¢\u0006\u0002\u0010 J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0019HÆ\u0003J\t\u00102\u001a\u00020\u0019HÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0017HÆ\u0003J\t\u00107\u001a\u00020\u0019HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\t\u00109\u001a\u00020\u0019HÆ\u0003J\t\u0010:\u001a\u00020\u0019HÆ\u0003J\u007f\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u0019HÆ\u0001J\u0013\u0010<\u001a\u00020\u00192\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0016\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\t\u0010@\u001a\u00020AHÖ\u0001J\u0016\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\t\u0010D\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u001e\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010#R\u0011\u0010\u001c\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010#R\u0011\u0010\u001f\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010#R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u001d\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010#R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "", "entitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "subscribedProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "transaction", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;", "dateFormatter", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;", "locale", "Ljava/util/Locale;", "localization", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V", b.f34626S, "", "pricePaid", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;", "expirationOrRenewal", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;", "product", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "isSubscription", "", "managementURL", "Landroid/net/Uri;", "isExpired", "isTrial", "isCancelled", "isLifetime", "(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/Store;ZLandroid/net/Uri;ZZZZ)V", "getExpirationOrRenewal", "()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/ExpirationOrRenewal;", "()Z", "setSubscription", "(Z)V", "getManagementURL", "()Landroid/net/Uri;", "getPricePaid", "()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PriceDetails;", "getProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "getStore", "()Lcom/revenuecat/purchases/Store;", "getTitle", "()Ljava/lang/String;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "expirationString", "expirationDate", "hashCode", "", "renewalString", "renewalDate", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PurchaseInformation {
    public static final int $stable = 8;
    private final ExpirationOrRenewal expirationOrRenewal;
    private final boolean isCancelled;
    private final boolean isExpired;
    private final boolean isLifetime;
    private boolean isSubscription;
    private final boolean isTrial;
    private final Uri managementURL;
    private final PriceDetails pricePaid;
    private final StoreProduct product;
    private final Store store;
    private final String title;

    public PurchaseInformation(String str, PriceDetails pricePaid, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z10, Uri uri, boolean z11, boolean z12, boolean z13, boolean z14) {
        AbstractC5504s.h(pricePaid, "pricePaid");
        AbstractC5504s.h(store, "store");
        this.title = str;
        this.pricePaid = pricePaid;
        this.expirationOrRenewal = expirationOrRenewal;
        this.product = storeProduct;
        this.store = store;
        this.isSubscription = z10;
        this.managementURL = uri;
        this.isExpired = z11;
        this.isTrial = z12;
        this.isCancelled = z13;
        this.isLifetime = z14;
    }

    public static /* synthetic */ PurchaseInformation copy$default(PurchaseInformation purchaseInformation, String str, PriceDetails priceDetails, ExpirationOrRenewal expirationOrRenewal, StoreProduct storeProduct, Store store, boolean z10, Uri uri, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = purchaseInformation.title;
        }
        if ((i10 & 2) != 0) {
            priceDetails = purchaseInformation.pricePaid;
        }
        if ((i10 & 4) != 0) {
            expirationOrRenewal = purchaseInformation.expirationOrRenewal;
        }
        if ((i10 & 8) != 0) {
            storeProduct = purchaseInformation.product;
        }
        if ((i10 & 16) != 0) {
            store = purchaseInformation.store;
        }
        if ((i10 & 32) != 0) {
            z10 = purchaseInformation.isSubscription;
        }
        if ((i10 & 64) != 0) {
            uri = purchaseInformation.managementURL;
        }
        if ((i10 & 128) != 0) {
            z11 = purchaseInformation.isExpired;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z12 = purchaseInformation.isTrial;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            z13 = purchaseInformation.isCancelled;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            z14 = purchaseInformation.isLifetime;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        boolean z17 = z11;
        boolean z18 = z12;
        boolean z19 = z10;
        Uri uri2 = uri;
        Store store2 = store;
        ExpirationOrRenewal expirationOrRenewal2 = expirationOrRenewal;
        return purchaseInformation.copy(str, priceDetails, expirationOrRenewal2, storeProduct, store2, z19, uri2, z17, z18, z15, z16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsCancelled() {
        return this.isCancelled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsLifetime() {
        return this.isLifetime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PriceDetails getPricePaid() {
        return this.pricePaid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ExpirationOrRenewal getExpirationOrRenewal() {
        return this.expirationOrRenewal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final StoreProduct getProduct() {
        return this.product;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Store getStore() {
        return this.store;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsSubscription() {
        return this.isSubscription;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Uri getManagementURL() {
        return this.managementURL;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    public final PurchaseInformation copy(String str, PriceDetails pricePaid, ExpirationOrRenewal expirationOrRenewal, StoreProduct product, Store store, boolean isSubscription, Uri managementURL, boolean isExpired, boolean isTrial, boolean isCancelled, boolean isLifetime) {
        AbstractC5504s.h(pricePaid, "pricePaid");
        AbstractC5504s.h(store, "store");
        return new PurchaseInformation(str, pricePaid, expirationOrRenewal, product, store, isSubscription, managementURL, isExpired, isTrial, isCancelled, isLifetime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseInformation)) {
            return false;
        }
        PurchaseInformation purchaseInformation = (PurchaseInformation) other;
        return AbstractC5504s.c(this.title, purchaseInformation.title) && AbstractC5504s.c(this.pricePaid, purchaseInformation.pricePaid) && AbstractC5504s.c(this.expirationOrRenewal, purchaseInformation.expirationOrRenewal) && AbstractC5504s.c(this.product, purchaseInformation.product) && this.store == purchaseInformation.store && this.isSubscription == purchaseInformation.isSubscription && AbstractC5504s.c(this.managementURL, purchaseInformation.managementURL) && this.isExpired == purchaseInformation.isExpired && this.isTrial == purchaseInformation.isTrial && this.isCancelled == purchaseInformation.isCancelled && this.isLifetime == purchaseInformation.isLifetime;
    }

    public final String expirationString(String expirationDate, CustomerCenterConfigData.Localization localization) {
        AbstractC5504s.h(expirationDate, "expirationDate");
        AbstractC5504s.h(localization, "localization");
        return this.isExpired ? r.K(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASE_INFO_EXPIRED_ON_DATE), "{{ date }}", expirationDate, false, 4, null) : r.K(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.PURCHASE_INFO_EXPIRES_ON_DATE), "{{ date }}", expirationDate, false, 4, null);
    }

    public final ExpirationOrRenewal getExpirationOrRenewal() {
        return this.expirationOrRenewal;
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final PriceDetails getPricePaid() {
        return this.pricePaid;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public final Store getStore() {
        return this.store;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.pricePaid.hashCode()) * 31;
        ExpirationOrRenewal expirationOrRenewal = this.expirationOrRenewal;
        int iHashCode2 = (iHashCode + (expirationOrRenewal == null ? 0 : expirationOrRenewal.hashCode())) * 31;
        StoreProduct storeProduct = this.product;
        int iHashCode3 = (((((iHashCode2 + (storeProduct == null ? 0 : storeProduct.hashCode())) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isSubscription)) * 31;
        Uri uri = this.managementURL;
        return ((((((((iHashCode3 + (uri != null ? uri.hashCode() : 0)) * 31) + Boolean.hashCode(this.isExpired)) * 31) + Boolean.hashCode(this.isTrial)) * 31) + Boolean.hashCode(this.isCancelled)) * 31) + Boolean.hashCode(this.isLifetime);
    }

    public final boolean isCancelled() {
        return this.isCancelled;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final boolean isLifetime() {
        return this.isLifetime;
    }

    public final boolean isSubscription() {
        return this.isSubscription;
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    public final String renewalString(String renewalDate, CustomerCenterConfigData.Localization localization) {
        AbstractC5504s.h(renewalDate, "renewalDate");
        AbstractC5504s.h(localization, "localization");
        PriceDetails priceDetails = this.pricePaid;
        if (AbstractC5504s.c(priceDetails, PriceDetails.Free.INSTANCE) ? true : AbstractC5504s.c(priceDetails, PriceDetails.Unknown.INSTANCE)) {
            return r.K(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.RENEWS_ON_DATE), "{{ date }}", renewalDate, false, 4, null);
        }
        if (!(priceDetails instanceof PriceDetails.Paid)) {
            throw new Td.r();
        }
        return r.K(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.LAST_CHARGE_WAS), "{{ price }}", ((PriceDetails.Paid) this.pricePaid).getPrice(), false, 4, null) + '\n' + r.K(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.NEXT_BILLING_DATE_ON), "{{ date }}", renewalDate, false, 4, null);
    }

    public final void setSubscription(boolean z10) {
        this.isSubscription = z10;
    }

    public String toString() {
        return "PurchaseInformation(title=" + this.title + ", pricePaid=" + this.pricePaid + ", expirationOrRenewal=" + this.expirationOrRenewal + ", product=" + this.product + ", store=" + this.store + ", isSubscription=" + this.isSubscription + ", managementURL=" + this.managementURL + ", isExpired=" + this.isExpired + ", isTrial=" + this.isTrial + ", isCancelled=" + this.isCancelled + ", isLifetime=" + this.isLifetime + ')';
    }

    public /* synthetic */ PurchaseInformation(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transactionDetails, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : entitlementInfo, (i10 & 2) != 0 ? null : storeProduct, transactionDetails, (i10 & 8) != 0 ? new DefaultDateFormatter() : dateFormatter, locale, localization);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseInformation(EntitlementInfo entitlementInfo, StoreProduct storeProduct, TransactionDetails transaction, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization) {
        boolean z10;
        Store store;
        AbstractC5504s.h(transaction, "transaction");
        AbstractC5504s.h(dateFormatter, "dateFormatter");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(localization, "localization");
        String strDetermineTitle = PurchaseInformationKt.determineTitle(entitlementInfo, storeProduct, transaction, localization);
        ExpirationOrRenewal expirationOrRenewalDetermineExpirationOrRenewal = PurchaseInformationKt.determineExpirationOrRenewal(entitlementInfo, transaction, dateFormatter, locale);
        Store store2 = (entitlementInfo == null || (store = entitlementInfo.getStore()) == null) ? transaction.getStore() : store;
        PriceDetails priceDetailsDeterminePrice = PurchaseInformationKt.determinePrice(storeProduct, transaction);
        boolean z11 = transaction instanceof TransactionDetails.Subscription;
        boolean z12 = false;
        boolean z13 = z11 && transaction.getStore() != Store.PROMOTIONAL;
        TransactionDetails.Subscription subscription = z11 ? (TransactionDetails.Subscription) transaction : null;
        Uri managementURL = subscription != null ? subscription.getManagementURL() : null;
        if (entitlementInfo != null) {
            z12 = !entitlementInfo.getIsActive();
        } else if (z11) {
            z10 = ((TransactionDetails.Subscription) transaction).isActive() ? z10 : true;
            this(strDetermineTitle, priceDetailsDeterminePrice, expirationOrRenewalDetermineExpirationOrRenewal, storeProduct, store2, z13, managementURL, z10, PurchaseInformationKt.determineTrialStatus(entitlementInfo, transaction), PurchaseInformationKt.determineCancellationStatus(entitlementInfo, transaction), PurchaseInformationKt.determineLifetimeStatus(entitlementInfo, transaction));
        } else if (!(transaction instanceof TransactionDetails.NonSubscription)) {
            throw new Td.r();
        }
        z10 = z12;
        this(strDetermineTitle, priceDetailsDeterminePrice, expirationOrRenewalDetermineExpirationOrRenewal, storeProduct, store2, z13, managementURL, z10, PurchaseInformationKt.determineTrialStatus(entitlementInfo, transaction), PurchaseInformationKt.determineCancellationStatus(entitlementInfo, transaction), PurchaseInformationKt.determineLifetimeStatus(entitlementInfo, transaction));
    }
}
