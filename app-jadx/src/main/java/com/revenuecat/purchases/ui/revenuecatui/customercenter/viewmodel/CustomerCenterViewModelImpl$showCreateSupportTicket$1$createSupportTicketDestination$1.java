package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Td.L;
import com.amazon.a.a.o.b;
import ie.InterfaceC5082a;
import ie.p;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "email", b.f34645c, "Lkotlin/Function0;", "LTd/L;", "onSuccess", "onError", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1 extends AbstractC5506u implements p {
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1(CustomerCenterViewModelImpl customerCenterViewModelImpl) {
        super(4);
        this.this$0 = customerCenterViewModelImpl;
    }

    @Override // ie.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((String) obj, (String) obj2, (InterfaceC5082a) obj3, (InterfaceC5082a) obj4);
        return L.f17438a;
    }

    public final void invoke(String email, String description, InterfaceC5082a onSuccess, InterfaceC5082a onError) {
        AbstractC5504s.h(email, "email");
        AbstractC5504s.h(description, "description");
        AbstractC5504s.h(onSuccess, "onSuccess");
        AbstractC5504s.h(onError, "onError");
        this.this$0.handleSupportTicketSubmit(email, description, onSuccess, onError);
    }
}
