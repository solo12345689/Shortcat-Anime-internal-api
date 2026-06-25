package com.revenuecat.purchases.common.caching;

import Rf.b;
import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.A;
import Vf.AbstractC2327f0;
import Vf.t0;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReceiptInfo$$serializer;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBK\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u001fR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00105\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010!¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "", "", "token", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallPostReceiptData", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revenuecat/purchases/common/ReceiptInfo;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "component4", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "getToken$annotations", "()V", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "getReceiptInfo", "getReceiptInfo$annotations", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "getPaywallPostReceiptData", "getPaywallPostReceiptData$annotations", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "getPurchasesAreCompletedBy$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LocalTransactionMetadata {
    private final PaywallPostReceiptData paywallPostReceiptData;
    private final PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final ReceiptInfo receiptInfo;
    private final String token;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, A.b("com.revenuecat.purchases.PurchasesAreCompletedBy", PurchasesAreCompletedBy.values())};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b serializer() {
            return LocalTransactionMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ LocalTransactionMetadata(int i10, String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, t0 t0Var) {
        if (11 != (i10 & 11)) {
            AbstractC2327f0.a(i10, 11, LocalTransactionMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.receiptInfo = receiptInfo;
        if ((i10 & 4) == 0) {
            this.paywallPostReceiptData = null;
        } else {
            this.paywallPostReceiptData = paywallPostReceiptData;
        }
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
    }

    public static /* synthetic */ LocalTransactionMetadata copy$default(LocalTransactionMetadata localTransactionMetadata, String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localTransactionMetadata.token;
        }
        if ((i10 & 2) != 0) {
            receiptInfo = localTransactionMetadata.receiptInfo;
        }
        if ((i10 & 4) != 0) {
            paywallPostReceiptData = localTransactionMetadata.paywallPostReceiptData;
        }
        if ((i10 & 8) != 0) {
            purchasesAreCompletedBy = localTransactionMetadata.purchasesAreCompletedBy;
        }
        return localTransactionMetadata.copy(str, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(LocalTransactionMetadata self, d output, e serialDesc) {
        b[] bVarArr = $childSerializers;
        output.k(serialDesc, 0, self.token);
        output.m(serialDesc, 1, ReceiptInfo$$serializer.INSTANCE, self.receiptInfo);
        if (output.g(serialDesc, 2) || self.paywallPostReceiptData != null) {
            output.f(serialDesc, 2, PaywallPostReceiptData$$serializer.INSTANCE, self.paywallPostReceiptData);
        }
        output.m(serialDesc, 3, bVarArr[3], self.purchasesAreCompletedBy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PaywallPostReceiptData getPaywallPostReceiptData() {
        return this.paywallPostReceiptData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final LocalTransactionMetadata copy(String token, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy) {
        AbstractC5504s.h(token, "token");
        AbstractC5504s.h(receiptInfo, "receiptInfo");
        AbstractC5504s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        return new LocalTransactionMetadata(token, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalTransactionMetadata)) {
            return false;
        }
        LocalTransactionMetadata localTransactionMetadata = (LocalTransactionMetadata) other;
        return AbstractC5504s.c(this.token, localTransactionMetadata.token) && AbstractC5504s.c(this.receiptInfo, localTransactionMetadata.receiptInfo) && AbstractC5504s.c(this.paywallPostReceiptData, localTransactionMetadata.paywallPostReceiptData) && this.purchasesAreCompletedBy == localTransactionMetadata.purchasesAreCompletedBy;
    }

    public final PaywallPostReceiptData getPaywallPostReceiptData() {
        return this.paywallPostReceiptData;
    }

    public final PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = ((this.token.hashCode() * 31) + this.receiptInfo.hashCode()) * 31;
        PaywallPostReceiptData paywallPostReceiptData = this.paywallPostReceiptData;
        return ((iHashCode + (paywallPostReceiptData == null ? 0 : paywallPostReceiptData.hashCode())) * 31) + this.purchasesAreCompletedBy.hashCode();
    }

    public String toString() {
        return "LocalTransactionMetadata(token=" + this.token + ", receiptInfo=" + this.receiptInfo + ", paywallPostReceiptData=" + this.paywallPostReceiptData + ", purchasesAreCompletedBy=" + this.purchasesAreCompletedBy + ')';
    }

    public LocalTransactionMetadata(String token, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy) {
        AbstractC5504s.h(token, "token");
        AbstractC5504s.h(receiptInfo, "receiptInfo");
        AbstractC5504s.h(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        this.token = token;
        this.receiptInfo = receiptInfo;
        this.paywallPostReceiptData = paywallPostReceiptData;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
    }

    public /* synthetic */ LocalTransactionMetadata(String str, ReceiptInfo receiptInfo, PaywallPostReceiptData paywallPostReceiptData, PurchasesAreCompletedBy purchasesAreCompletedBy, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, receiptInfo, (i10 & 4) != 0 ? null : paywallPostReceiptData, purchasesAreCompletedBy);
    }

    public static /* synthetic */ void getPaywallPostReceiptData$annotations() {
    }

    public static /* synthetic */ void getPurchasesAreCompletedBy$annotations() {
    }

    public static /* synthetic */ void getReceiptInfo$annotations() {
    }

    public static /* synthetic */ void getToken$annotations() {
    }
}
