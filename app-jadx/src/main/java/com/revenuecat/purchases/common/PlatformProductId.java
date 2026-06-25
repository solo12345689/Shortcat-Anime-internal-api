package com.revenuecat.purchases.common;

import Td.z;
import Ud.S;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/PlatformProductId;", "", "productId", "", "(Ljava/lang/String;)V", "asMap", "", "getAsMap", "()Ljava/util/Map;", "getProductId", "()Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
class PlatformProductId {
    private final String productId;

    public PlatformProductId(String productId) {
        AbstractC5504s.h(productId, "productId");
        this.productId = productId;
    }

    public Map<String, String> getAsMap() {
        return S.f(z.a(DiagnosticsTracker.PRODUCT_ID_KEY, getProductId()));
    }

    public String getProductId() {
        return this.productId;
    }
}
