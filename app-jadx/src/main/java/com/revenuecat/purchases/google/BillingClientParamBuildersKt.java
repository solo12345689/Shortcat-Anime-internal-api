package com.revenuecat.purchases.google;

import N4.n;
import N4.o;
import Ud.AbstractC2279u;
import com.android.billingclient.api.C3164i;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "LN4/n;", "buildQueryPurchaseHistoryParams", "(Ljava/lang/String;)LN4/n;", "LN4/o;", "buildQueryPurchasesParams", "(Ljava/lang/String;)LN4/o;", "", "productIds", "Lcom/android/billingclient/api/i;", "buildQueryProductDetailsParams", "(Ljava/lang/String;Ljava/util/Set;)Lcom/android/billingclient/api/i;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingClientParamBuildersKt {
    public static final C3164i buildQueryProductDetailsParams(String str, Set<String> productIds) throws QueryProductDetailsParamsBuilderException {
        AbstractC5504s.h(str, "<this>");
        AbstractC5504s.h(productIds, "productIds");
        Set<String> set = productIds;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(C3164i.b.a().b((String) it.next()).c(str).a());
        }
        try {
            C3164i c3164iA = C3164i.a().b(arrayList).a();
            AbstractC5504s.g(c3164iA, "{\n        QueryProductDe…roductList).build()\n    }");
            return c3164iA;
        } catch (ExceptionInInitializerError e10) {
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error while building QueryProductDetailsParams in Billing client");
            sb2.append(": ");
            sb2.append(e10.getMessage());
            sb2.append(". Caused by: ");
            Throwable cause = e10.getCause();
            sb2.append(cause != null ? cause.getMessage() : null);
            currentLogHandler.e("[Purchases] - ERROR", sb2.toString(), e10);
            throw new QueryProductDetailsParamsBuilderException("Error while building QueryProductDetailsParams in Billing client", e10.getCause());
        }
    }

    public static final n buildQueryPurchaseHistoryParams(String str) {
        AbstractC5504s.h(str, "<this>");
        if (AbstractC5504s.c(str, "inapp") ? true : AbstractC5504s.c(str, "subs")) {
            return n.a().b(str).a();
        }
        return null;
    }

    public static final o buildQueryPurchasesParams(String str) {
        AbstractC5504s.h(str, "<this>");
        if (AbstractC5504s.c(str, "inapp") ? true : AbstractC5504s.c(str, "subs")) {
            return o.a().b(str).a();
        }
        return null;
    }
}
