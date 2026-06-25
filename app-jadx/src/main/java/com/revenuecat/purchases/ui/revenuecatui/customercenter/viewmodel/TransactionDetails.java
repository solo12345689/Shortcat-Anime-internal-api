package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import android.net.Uri;
import com.amazon.a.a.o.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.models.Price;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;", "", "productIdentifier", "", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", b.f34666x, "Lcom/revenuecat/purchases/models/Price;", "isSandbox", "", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/models/Price;Z)V", "()Z", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getProductIdentifier", "()Ljava/lang/String;", "getStore", "()Lcom/revenuecat/purchases/Store;", "NonSubscription", "Subscription", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$NonSubscription;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TransactionDetails {
    public static final int $stable = 0;
    private final boolean isSandbox;
    private final Price price;
    private final String productIdentifier;
    private final Store store;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$NonSubscription;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;", "productIdentifier", "", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", b.f34666x, "Lcom/revenuecat/purchases/models/Price;", "isSandbox", "", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/models/Price;Z)V", "()Z", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getProductIdentifier", "()Ljava/lang/String;", "getStore", "()Lcom/revenuecat/purchases/Store;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class NonSubscription extends TransactionDetails {
        public static final int $stable = 0;
        private final boolean isSandbox;
        private final Price price;
        private final String productIdentifier;
        private final Store store;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonSubscription(String productIdentifier, Store store, Price price, boolean z10) {
            super(productIdentifier, store, price, z10, null);
            AbstractC5504s.h(productIdentifier, "productIdentifier");
            AbstractC5504s.h(store, "store");
            this.productIdentifier = productIdentifier;
            this.store = store;
            this.price = price;
            this.isSandbox = z10;
        }

        public static /* synthetic */ NonSubscription copy$default(NonSubscription nonSubscription, String str, Store store, Price price, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = nonSubscription.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                store = nonSubscription.store;
            }
            if ((i10 & 4) != 0) {
                price = nonSubscription.price;
            }
            if ((i10 & 8) != 0) {
                z10 = nonSubscription.isSandbox;
            }
            return nonSubscription.copy(str, store, price, z10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Store getStore() {
            return this.store;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsSandbox() {
            return this.isSandbox;
        }

        public final NonSubscription copy(String productIdentifier, Store store, Price price, boolean isSandbox) {
            AbstractC5504s.h(productIdentifier, "productIdentifier");
            AbstractC5504s.h(store, "store");
            return new NonSubscription(productIdentifier, store, price, isSandbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NonSubscription)) {
                return false;
            }
            NonSubscription nonSubscription = (NonSubscription) other;
            return AbstractC5504s.c(this.productIdentifier, nonSubscription.productIdentifier) && this.store == nonSubscription.store && AbstractC5504s.c(this.price, nonSubscription.price) && this.isSandbox == nonSubscription.isSandbox;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Price getPrice() {
            return this.price;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public String getProductIdentifier() {
            return this.productIdentifier;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Store getStore() {
            return this.store;
        }

        public int hashCode() {
            int iHashCode = ((this.productIdentifier.hashCode() * 31) + this.store.hashCode()) * 31;
            Price price = this.price;
            return ((iHashCode + (price == null ? 0 : price.hashCode())) * 31) + Boolean.hashCode(this.isSandbox);
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        /* JADX INFO: renamed from: isSandbox */
        public boolean getIsSandbox() {
            return this.isSandbox;
        }

        public String toString() {
            return "NonSubscription(productIdentifier=" + this.productIdentifier + ", store=" + this.store + ", price=" + this.price + ", isSandbox=" + this.isSandbox + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003Ju\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\bHÆ\u0001J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0011\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0015R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00061"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;", "productIdentifier", "", "productPlanIdentifier", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "isActive", "", "willRenew", "expiresDate", "Ljava/util/Date;", "isTrial", "managementURL", "Landroid/net/Uri;", b.f34666x, "Lcom/revenuecat/purchases/models/Price;", "isSandbox", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/Store;ZZLjava/util/Date;ZLandroid/net/Uri;Lcom/revenuecat/purchases/models/Price;Z)V", "getExpiresDate", "()Ljava/util/Date;", "()Z", "getManagementURL", "()Landroid/net/Uri;", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "getProductIdentifier", "()Ljava/lang/String;", "getProductPlanIdentifier", "getStore", "()Lcom/revenuecat/purchases/Store;", "getWillRenew", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Subscription extends TransactionDetails {
        public static final int $stable = 0;
        private final Date expiresDate;
        private final boolean isActive;
        private final boolean isSandbox;
        private final boolean isTrial;
        private final Uri managementURL;
        private final Price price;
        private final String productIdentifier;
        private final String productPlanIdentifier;
        private final Store store;
        private final boolean willRenew;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String productIdentifier, String str, Store store, boolean z10, boolean z11, Date date, boolean z12, Uri uri, Price price, boolean z13) {
            super(productIdentifier, store, price, z13, null);
            AbstractC5504s.h(productIdentifier, "productIdentifier");
            AbstractC5504s.h(store, "store");
            this.productIdentifier = productIdentifier;
            this.productPlanIdentifier = str;
            this.store = store;
            this.isActive = z10;
            this.willRenew = z11;
            this.expiresDate = date;
            this.isTrial = z12;
            this.managementURL = uri;
            this.price = price;
            this.isSandbox = z13;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, Store store, boolean z10, boolean z11, Date date, boolean z12, Uri uri, Price price, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscription.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = subscription.productPlanIdentifier;
            }
            if ((i10 & 4) != 0) {
                store = subscription.store;
            }
            if ((i10 & 8) != 0) {
                z10 = subscription.isActive;
            }
            if ((i10 & 16) != 0) {
                z11 = subscription.willRenew;
            }
            if ((i10 & 32) != 0) {
                date = subscription.expiresDate;
            }
            if ((i10 & 64) != 0) {
                z12 = subscription.isTrial;
            }
            if ((i10 & 128) != 0) {
                uri = subscription.managementURL;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                price = subscription.price;
            }
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                z13 = subscription.isSandbox;
            }
            Price price2 = price;
            boolean z14 = z13;
            boolean z15 = z12;
            Uri uri2 = uri;
            boolean z16 = z11;
            Date date2 = date;
            return subscription.copy(str, str2, store, z10, z16, date2, z15, uri2, price2, z14);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final boolean getIsSandbox() {
            return this.isSandbox;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getProductPlanIdentifier() {
            return this.productPlanIdentifier;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Store getStore() {
            return this.store;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getWillRenew() {
            return this.willRenew;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Date getExpiresDate() {
            return this.expiresDate;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsTrial() {
            return this.isTrial;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Uri getManagementURL() {
            return this.managementURL;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Price getPrice() {
            return this.price;
        }

        public final Subscription copy(String productIdentifier, String productPlanIdentifier, Store store, boolean isActive, boolean willRenew, Date expiresDate, boolean isTrial, Uri managementURL, Price price, boolean isSandbox) {
            AbstractC5504s.h(productIdentifier, "productIdentifier");
            AbstractC5504s.h(store, "store");
            return new Subscription(productIdentifier, productPlanIdentifier, store, isActive, willRenew, expiresDate, isTrial, managementURL, price, isSandbox);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return AbstractC5504s.c(this.productIdentifier, subscription.productIdentifier) && AbstractC5504s.c(this.productPlanIdentifier, subscription.productPlanIdentifier) && this.store == subscription.store && this.isActive == subscription.isActive && this.willRenew == subscription.willRenew && AbstractC5504s.c(this.expiresDate, subscription.expiresDate) && this.isTrial == subscription.isTrial && AbstractC5504s.c(this.managementURL, subscription.managementURL) && AbstractC5504s.c(this.price, subscription.price) && this.isSandbox == subscription.isSandbox;
        }

        public final Date getExpiresDate() {
            return this.expiresDate;
        }

        public final Uri getManagementURL() {
            return this.managementURL;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Price getPrice() {
            return this.price;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public String getProductIdentifier() {
            return this.productIdentifier;
        }

        public final String getProductPlanIdentifier() {
            return this.productPlanIdentifier;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        public Store getStore() {
            return this.store;
        }

        public final boolean getWillRenew() {
            return this.willRenew;
        }

        public int hashCode() {
            int iHashCode = this.productIdentifier.hashCode() * 31;
            String str = this.productPlanIdentifier;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.store.hashCode()) * 31) + Boolean.hashCode(this.isActive)) * 31) + Boolean.hashCode(this.willRenew)) * 31;
            Date date = this.expiresDate;
            int iHashCode3 = (((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31) + Boolean.hashCode(this.isTrial)) * 31;
            Uri uri = this.managementURL;
            int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
            Price price = this.price;
            return ((iHashCode4 + (price != null ? price.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSandbox);
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails
        /* JADX INFO: renamed from: isSandbox */
        public boolean getIsSandbox() {
            return this.isSandbox;
        }

        public final boolean isTrial() {
            return this.isTrial;
        }

        public String toString() {
            return "Subscription(productIdentifier=" + this.productIdentifier + ", productPlanIdentifier=" + this.productPlanIdentifier + ", store=" + this.store + ", isActive=" + this.isActive + ", willRenew=" + this.willRenew + ", expiresDate=" + this.expiresDate + ", isTrial=" + this.isTrial + ", managementURL=" + this.managementURL + ", price=" + this.price + ", isSandbox=" + this.isSandbox + ')';
        }
    }

    public /* synthetic */ TransactionDetails(String str, Store store, Price price, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, store, price, z10);
    }

    public Price getPrice() {
        return this.price;
    }

    public String getProductIdentifier() {
        return this.productIdentifier;
    }

    public Store getStore() {
        return this.store;
    }

    /* JADX INFO: renamed from: isSandbox, reason: from getter */
    public boolean getIsSandbox() {
        return this.isSandbox;
    }

    private TransactionDetails(String str, Store store, Price price, boolean z10) {
        this.productIdentifier = str;
        this.store = store;
        this.price = price;
        this.isSandbox = z10;
    }
}
