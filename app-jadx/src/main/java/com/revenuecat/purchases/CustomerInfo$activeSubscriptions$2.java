package com.revenuecat.purchases;

import ie.InterfaceC5082a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$activeSubscriptions$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // ie.InterfaceC5082a
    public final Set<String> invoke() {
        CustomerInfo customerInfo = this.this$0;
        return customerInfo.activeIdentifiers(customerInfo.getAllExpirationDatesByProduct());
    }
}
