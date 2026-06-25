package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3159d;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/android/billingclient/api/d$a;", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "LTd/L;", "setUpgradeInfo", "(Lcom/android/billingclient/api/d$a;Lcom/revenuecat/purchases/common/ReplaceProductInfo;)V", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(C3159d.a aVar, ReplaceProductInfo replaceProductInfo) {
        AbstractC5504s.h(aVar, "<this>");
        AbstractC5504s.h(replaceProductInfo, "replaceProductInfo");
        C3159d.c.a aVarA = C3159d.c.a();
        aVarA.b(replaceProductInfo.getOldPurchase().getPurchaseToken());
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode != null) {
            GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
            if (googleReplacementMode == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Got non-Google replacement mode", null);
            } else {
                aVarA.d(googleReplacementMode.getPlayBillingClientMode());
            }
        }
        AbstractC5504s.g(aVarA, "newBuilder().apply {\n   …        }\n        }\n    }");
        aVar.e(aVarA.a());
    }
}
