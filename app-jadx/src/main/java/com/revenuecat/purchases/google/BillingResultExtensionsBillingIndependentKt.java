package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3160e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/android/billingclient/api/e;", "", "toHumanReadableDescription", "(Lcom/android/billingclient/api/e;)Ljava/lang/String;", "", "getOnPurchasesUpdatedSubResponseCodeName", "(I)Ljava/lang/String;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingResultExtensionsBillingIndependentKt {
    private static final String getOnPurchasesUpdatedSubResponseCodeName(int i10) {
        if (i10 == 0) {
            return "NO_APPLICABLE_SUB_RESPONSE_CODE";
        }
        if (i10 == 1) {
            return "PAYMENT_DECLINED_DUE_TO_INSUFFICIENT_FUNDS";
        }
        if (i10 == 2) {
            return "USER_INELIGIBLE";
        }
        return "UNKNOWN_SUB_RESPONSE_CODE (" + i10 + ')';
    }

    public static final String toHumanReadableDescription(C3160e c3160e) {
        AbstractC5504s.h(c3160e, "<this>");
        return "DebugMessage: " + c3160e.a() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(c3160e.c()) + ". SubResponseCode: " + getOnPurchasesUpdatedSubResponseCodeName(c3160e.b()) + com.amazon.a.a.o.c.a.b.f34706a;
    }
}
