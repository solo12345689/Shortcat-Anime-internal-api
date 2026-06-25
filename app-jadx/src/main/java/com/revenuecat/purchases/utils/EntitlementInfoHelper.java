package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/revenuecat/purchases/utils/EntitlementInfoHelper;", "", "()V", "getWillRenew", "", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "expirationDate", "Ljava/util/Date;", "unsubscribeDetectedAt", "billingIssueDetectedAt", "periodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfoHelper {
    public static final EntitlementInfoHelper INSTANCE = new EntitlementInfoHelper();

    private EntitlementInfoHelper() {
    }

    public final boolean getWillRenew(Store store, Date expirationDate, Date unsubscribeDetectedAt, Date billingIssueDetectedAt, PeriodType periodType) {
        AbstractC5504s.h(store, "store");
        return ((store == Store.PROMOTIONAL) || (expirationDate == null) || (unsubscribeDetectedAt != null) || (billingIssueDetectedAt != null) || (periodType == PeriodType.PREPAID)) ? false : true;
    }
}
