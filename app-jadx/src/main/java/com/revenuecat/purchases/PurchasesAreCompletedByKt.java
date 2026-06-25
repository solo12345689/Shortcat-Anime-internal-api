package com.revenuecat.purchases;

import Td.r;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"finishTransactions", "", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getFinishTransactions", "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)Z", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PurchasesAreCompletedByKt {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getFinishTransactions(PurchasesAreCompletedBy purchasesAreCompletedBy) {
        AbstractC5504s.h(purchasesAreCompletedBy, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[purchasesAreCompletedBy.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new r();
    }
}
