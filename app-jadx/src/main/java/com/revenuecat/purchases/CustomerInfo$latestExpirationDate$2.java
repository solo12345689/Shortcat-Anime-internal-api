package com.revenuecat.purchases;

import Ud.AbstractC2279u;
import ie.InterfaceC5082a;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CustomerInfo$latestExpirationDate$2 extends AbstractC5506u implements InterfaceC5082a {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // ie.InterfaceC5082a
    public final Date invoke() {
        List listR0 = AbstractC2279u.R0(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return Xd.a.d((Date) t10, (Date) t11);
            }
        });
        if (listR0.isEmpty()) {
            listR0 = null;
        }
        if (listR0 != null) {
            return (Date) AbstractC2279u.y0(listR0);
        }
        return null;
    }
}
