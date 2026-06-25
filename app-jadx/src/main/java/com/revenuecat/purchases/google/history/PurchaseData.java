package com.revenuecat.purchases.google.history;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0080\b\u0018\u0000 +2\u00020\u0001:\u0001+BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\tHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseData;", "", "orderId", "", "packageName", "productId", "purchaseTime", "", "purchaseState", "", "purchaseToken", "quantity", "acknowledged", "", "autoRenewing", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;IZZ)V", "getAcknowledged", "()Z", "getAutoRenewing", "getOrderId", "()Ljava/lang/String;", "getPackageName", "getProductId", "getPurchaseState", "()I", "getPurchaseTime", "()J", "getPurchaseToken", "getQuantity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PurchaseData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean acknowledged;
    private final boolean autoRenewing;
    private final String orderId;
    private final String packageName;
    private final String productId;
    private final int purchaseState;
    private final long purchaseTime;
    private final String purchaseToken;
    private final int quantity;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/google/history/PurchaseData$Companion;", "", "()V", "fromJson", "Lcom/revenuecat/purchases/google/history/PurchaseData;", "json", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PurchaseData fromJson(String json) {
            AbstractC5504s.h(json, "json");
            try {
                JSONObject jSONObject = new JSONObject(json);
                String strOptString = jSONObject.optString("orderId", "");
                AbstractC5504s.g(strOptString, "jsonObject.optString(\"orderId\", \"\")");
                String strOptString2 = jSONObject.optString("packageName", "");
                AbstractC5504s.g(strOptString2, "jsonObject.optString(\"packageName\", \"\")");
                String strOptString3 = jSONObject.optString("productId", "");
                AbstractC5504s.g(strOptString3, "jsonObject.optString(\"productId\", \"\")");
                long jOptLong = jSONObject.optLong("purchaseTime", 0L);
                int iOptInt = jSONObject.optInt("purchaseState", 0);
                String strOptString4 = jSONObject.optString("purchaseToken", "");
                AbstractC5504s.g(strOptString4, "jsonObject.optString(\"purchaseToken\", \"\")");
                return new PurchaseData(strOptString, strOptString2, strOptString3, jOptLong, iOptInt, strOptString4, jSONObject.optInt("quantity", 1), jSONObject.optBoolean("acknowledged", false), jSONObject.optBoolean("autoRenewing", false));
            } catch (Throwable th2) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing AIDL purchase data JSON: " + json, th2);
                return null;
            }
        }

        private Companion() {
        }
    }

    public PurchaseData(String orderId, String packageName, String productId, long j10, int i10, String purchaseToken, int i11, boolean z10, boolean z11) {
        AbstractC5504s.h(orderId, "orderId");
        AbstractC5504s.h(packageName, "packageName");
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(purchaseToken, "purchaseToken");
        this.orderId = orderId;
        this.packageName = packageName;
        this.productId = productId;
        this.purchaseTime = j10;
        this.purchaseState = i10;
        this.purchaseToken = purchaseToken;
        this.quantity = i11;
        this.acknowledged = z10;
        this.autoRenewing = z11;
    }

    public static /* synthetic */ PurchaseData copy$default(PurchaseData purchaseData, String str, String str2, String str3, long j10, int i10, String str4, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = purchaseData.orderId;
        }
        if ((i12 & 2) != 0) {
            str2 = purchaseData.packageName;
        }
        if ((i12 & 4) != 0) {
            str3 = purchaseData.productId;
        }
        if ((i12 & 8) != 0) {
            j10 = purchaseData.purchaseTime;
        }
        if ((i12 & 16) != 0) {
            i10 = purchaseData.purchaseState;
        }
        if ((i12 & 32) != 0) {
            str4 = purchaseData.purchaseToken;
        }
        if ((i12 & 64) != 0) {
            i11 = purchaseData.quantity;
        }
        if ((i12 & 128) != 0) {
            z10 = purchaseData.acknowledged;
        }
        if ((i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            z11 = purchaseData.autoRenewing;
        }
        boolean z12 = z11;
        int i13 = i11;
        int i14 = i10;
        long j11 = j10;
        String str5 = str3;
        return purchaseData.copy(str, str2, str5, j11, i14, str4, i13, z10, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPurchaseState() {
        return this.purchaseState;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getAcknowledged() {
        return this.acknowledged;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final PurchaseData copy(String orderId, String packageName, String productId, long purchaseTime, int purchaseState, String purchaseToken, int quantity, boolean acknowledged, boolean autoRenewing) {
        AbstractC5504s.h(orderId, "orderId");
        AbstractC5504s.h(packageName, "packageName");
        AbstractC5504s.h(productId, "productId");
        AbstractC5504s.h(purchaseToken, "purchaseToken");
        return new PurchaseData(orderId, packageName, productId, purchaseTime, purchaseState, purchaseToken, quantity, acknowledged, autoRenewing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseData)) {
            return false;
        }
        PurchaseData purchaseData = (PurchaseData) other;
        return AbstractC5504s.c(this.orderId, purchaseData.orderId) && AbstractC5504s.c(this.packageName, purchaseData.packageName) && AbstractC5504s.c(this.productId, purchaseData.productId) && this.purchaseTime == purchaseData.purchaseTime && this.purchaseState == purchaseData.purchaseState && AbstractC5504s.c(this.purchaseToken, purchaseData.purchaseToken) && this.quantity == purchaseData.quantity && this.acknowledged == purchaseData.acknowledged && this.autoRenewing == purchaseData.autoRenewing;
    }

    public final boolean getAcknowledged() {
        return this.acknowledged;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    public final long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        return (((((((((((((((this.orderId.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.productId.hashCode()) * 31) + Long.hashCode(this.purchaseTime)) * 31) + Integer.hashCode(this.purchaseState)) * 31) + this.purchaseToken.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.acknowledged)) * 31) + Boolean.hashCode(this.autoRenewing);
    }

    public String toString() {
        return "PurchaseData(orderId=" + this.orderId + ", packageName=" + this.packageName + ", productId=" + this.productId + ", purchaseTime=" + this.purchaseTime + ", purchaseState=" + this.purchaseState + ", purchaseToken=" + this.purchaseToken + ", quantity=" + this.quantity + ", acknowledged=" + this.acknowledged + ", autoRenewing=" + this.autoRenewing + ')';
    }
}
