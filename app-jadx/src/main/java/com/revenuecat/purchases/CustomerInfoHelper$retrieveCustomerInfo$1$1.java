package com.revenuecat.purchases;

import Td.L;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LTd/L;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerInfoHelper$retrieveCustomerInfo$1$1 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ ReceiveCustomerInfoCallback $cb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfoHelper$retrieveCustomerInfo$1$1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(0);
        this.$cb = receiveCustomerInfoCallback;
    }

    @Override // ie.InterfaceC5082a
    public /* bridge */ /* synthetic */ Object invoke() {
        m131invoke();
        return L.f17438a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m131invoke() {
        this.$cb.onReceived(CustomerInfoHelper.INSTANCE.createPreviewCustomerInfo$purchases_defaultsBc8Release());
    }
}
