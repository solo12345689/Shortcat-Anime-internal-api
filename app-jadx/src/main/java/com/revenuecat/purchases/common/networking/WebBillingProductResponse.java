package com.revenuecat.purchases.common.networking;

import Td.InterfaceC2154e;
import Tf.e;
import Uf.d;
import Vf.AbstractC2327f0;
import Vf.M;
import Vf.t0;
import Vf.x0;
import com.amazon.a.a.o.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBi\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\\\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b2\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001cR,\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010\"¨\u0006:"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "", "", "identifier", "productType", b.f34626S, b.f34645c, "defaultPurchaseOptionId", "", "Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "purchaseOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "LVf/t0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LVf/t0;)V", "self", "LUf/d;", "output", "LTf/e;", "serialDesc", "LTd/L;", "write$Self$purchases_defaultsBc8Release", "(Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;LUf/d;LTf/e;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdentifier", "getProductType", "getProductType$annotations", "()V", "getTitle", "getDescription", "getDefaultPurchaseOptionId", "getDefaultPurchaseOptionId$annotations", "Ljava/util/Map;", "getPurchaseOptions", "getPurchaseOptions$annotations", "Companion", "$serializer", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebBillingProductResponse {
    private final String defaultPurchaseOptionId;
    private final String description;
    private final String identifier;
    private final String productType;
    private final Map<String, WebBillingPurchaseOption> purchaseOptions;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Rf.b[] $childSerializers = {null, null, null, null, null, new M(x0.f20253a, WebBillingPurchaseOption$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse$Companion;", "", "<init>", "()V", "LRf/b;", "Lcom/revenuecat/purchases/common/networking/WebBillingProductResponse;", "serializer", "()LRf/b;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Rf.b serializer() {
            return WebBillingProductResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InterfaceC2154e
    public /* synthetic */ WebBillingProductResponse(int i10, String str, String str2, String str3, String str4, String str5, Map map, t0 t0Var) {
        if (39 != (i10 & 39)) {
            AbstractC2327f0.a(i10, 39, WebBillingProductResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.identifier = str;
        this.productType = str2;
        this.title = str3;
        if ((i10 & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i10 & 16) == 0) {
            this.defaultPurchaseOptionId = null;
        } else {
            this.defaultPurchaseOptionId = str5;
        }
        this.purchaseOptions = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebBillingProductResponse copy$default(WebBillingProductResponse webBillingProductResponse, String str, String str2, String str3, String str4, String str5, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webBillingProductResponse.identifier;
        }
        if ((i10 & 2) != 0) {
            str2 = webBillingProductResponse.productType;
        }
        if ((i10 & 4) != 0) {
            str3 = webBillingProductResponse.title;
        }
        if ((i10 & 8) != 0) {
            str4 = webBillingProductResponse.description;
        }
        if ((i10 & 16) != 0) {
            str5 = webBillingProductResponse.defaultPurchaseOptionId;
        }
        if ((i10 & 32) != 0) {
            map = webBillingProductResponse.purchaseOptions;
        }
        String str6 = str5;
        Map map2 = map;
        return webBillingProductResponse.copy(str, str2, str3, str4, str6, map2);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(WebBillingProductResponse self, d output, e serialDesc) {
        Rf.b[] bVarArr = $childSerializers;
        output.k(serialDesc, 0, self.identifier);
        output.k(serialDesc, 1, self.productType);
        output.k(serialDesc, 2, self.title);
        if (output.g(serialDesc, 3) || self.description != null) {
            output.f(serialDesc, 3, x0.f20253a, self.description);
        }
        if (output.g(serialDesc, 4) || self.defaultPurchaseOptionId != null) {
            output.f(serialDesc, 4, x0.f20253a, self.defaultPurchaseOptionId);
        }
        output.m(serialDesc, 5, bVarArr[5], self.purchaseOptions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDefaultPurchaseOptionId() {
        return this.defaultPurchaseOptionId;
    }

    public final Map<String, WebBillingPurchaseOption> component6() {
        return this.purchaseOptions;
    }

    public final WebBillingProductResponse copy(String identifier, String productType, String title, String description, String defaultPurchaseOptionId, Map<String, WebBillingPurchaseOption> purchaseOptions) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(productType, "productType");
        AbstractC5504s.h(title, "title");
        AbstractC5504s.h(purchaseOptions, "purchaseOptions");
        return new WebBillingProductResponse(identifier, productType, title, description, defaultPurchaseOptionId, purchaseOptions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebBillingProductResponse)) {
            return false;
        }
        WebBillingProductResponse webBillingProductResponse = (WebBillingProductResponse) other;
        return AbstractC5504s.c(this.identifier, webBillingProductResponse.identifier) && AbstractC5504s.c(this.productType, webBillingProductResponse.productType) && AbstractC5504s.c(this.title, webBillingProductResponse.title) && AbstractC5504s.c(this.description, webBillingProductResponse.description) && AbstractC5504s.c(this.defaultPurchaseOptionId, webBillingProductResponse.defaultPurchaseOptionId) && AbstractC5504s.c(this.purchaseOptions, webBillingProductResponse.purchaseOptions);
    }

    public final String getDefaultPurchaseOptionId() {
        return this.defaultPurchaseOptionId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getProductType() {
        return this.productType;
    }

    public final Map<String, WebBillingPurchaseOption> getPurchaseOptions() {
        return this.purchaseOptions;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((this.identifier.hashCode() * 31) + this.productType.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultPurchaseOptionId;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.purchaseOptions.hashCode();
    }

    public String toString() {
        return "WebBillingProductResponse(identifier=" + this.identifier + ", productType=" + this.productType + ", title=" + this.title + ", description=" + this.description + ", defaultPurchaseOptionId=" + this.defaultPurchaseOptionId + ", purchaseOptions=" + this.purchaseOptions + ')';
    }

    public WebBillingProductResponse(String identifier, String productType, String title, String str, String str2, Map<String, WebBillingPurchaseOption> purchaseOptions) {
        AbstractC5504s.h(identifier, "identifier");
        AbstractC5504s.h(productType, "productType");
        AbstractC5504s.h(title, "title");
        AbstractC5504s.h(purchaseOptions, "purchaseOptions");
        this.identifier = identifier;
        this.productType = productType;
        this.title = title;
        this.description = str;
        this.defaultPurchaseOptionId = str2;
        this.purchaseOptions = purchaseOptions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WebBillingProductResponse(String str, String str2, String str3, String str4, String str5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Map map2;
        String str6;
        str4 = (i10 & 8) != 0 ? null : str4;
        if ((i10 & 16) != 0) {
            map2 = map;
            str6 = null;
        } else {
            map2 = map;
            str6 = str5;
        }
        this(str, str2, str3, str4, str6, map2);
    }

    public static /* synthetic */ void getDefaultPurchaseOptionId$annotations() {
    }

    public static /* synthetic */ void getProductType$annotations() {
    }

    public static /* synthetic */ void getPurchaseOptions$annotations() {
    }
}
