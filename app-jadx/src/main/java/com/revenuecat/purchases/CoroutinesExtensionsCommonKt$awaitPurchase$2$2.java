package com.revenuecat.purchases;

import Td.L;
import Td.u;
import Td.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "", "userCancelled", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends AbstractC5506u implements Function2 {
    final /* synthetic */ Zd.e $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsCommonKt$awaitPurchase$2$2(Zd.e eVar) {
        super(2);
        this.$continuation = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return L.f17438a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        AbstractC5504s.h(purchasesError, "purchasesError");
        Zd.e eVar = this.$continuation;
        u.a aVar = u.f17466b;
        eVar.resumeWith(u.b(v.a(new PurchasesTransactionException(purchasesError, z10))));
    }
}
