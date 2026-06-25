package com.revenuecat.purchases.google;

import com.android.billingclient.api.C3160e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/android/billingclient/api/e;", "", "isSuccessful", "(Lcom/android/billingclient/api/e;)Z", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(C3160e c3160e) {
        AbstractC5504s.h(c3160e, "<this>");
        return c3160e.c() == 0;
    }
}
