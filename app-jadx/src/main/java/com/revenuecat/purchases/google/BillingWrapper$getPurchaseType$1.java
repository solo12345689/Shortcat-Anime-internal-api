package com.revenuecat.purchases.google;

import Td.L;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "subFound", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$getPurchaseType$1 extends AbstractC5506u implements Function1 {
    final /* synthetic */ Function1 $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "inAppFound", "LTd/L;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Function1 $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1) {
            super(1);
            this.$listener = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return L.f17438a;
        }

        public final void invoke(boolean z10) {
            if (z10) {
                this.$listener.invoke(ProductType.INAPP);
            } else {
                this.$listener.invoke(ProductType.UNKNOWN);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BillingWrapper$getPurchaseType$1(Function1 function1, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = function1;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return L.f17438a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        Function1 function1 = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, function1, new AnonymousClass1(function1));
    }
}
